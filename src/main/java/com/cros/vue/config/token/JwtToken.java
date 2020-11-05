package com.cros.vue.config.token;

import com.cros.vue.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 针对jwt原理了解可以参阅:https://www.cnblogs.com/cndarren/p/11518443.html
 * @author MaLei
 * @description: jwt加密token配置类
 * @create 2020/10/22
 */
@Configuration
@Slf4j
public class JwtToken {
    //载荷payload中相关定义name
    private static final String CLAIM_KEY_USERNAME = "sub";
    private static final String CLAIM_KEY_ID = "id";
    private static final String CLAIM_KEY_CREATED = "created";
    private static final String CLAIM_KEY_ROLES = "roles";
    //请求头中的token前缀
    public static  final String TOKEN_PREFIX="Bearer ";
    //请求头中携带token的字段
    public static  final String TOKEN_REQUEST_HEADER="Authorization";
    /**
     * 秘钥
     */
    @Value("${jwt.secret}")
    private String secret;
    /**
     * 过期时间(秒)
     */
    @Value("${jwt.expire}")
    private long expire;

    /**
     * 设置token过期时间
     * @return
     */
    private Date generateExpirationDate() {
        //Date nowDate = new Date();
        //Date expireDate = new Date(nowDate.getTime() + expire * 1000);
        return new Date(System.currentTimeMillis() + expire * 1000);
    }
    /**
     * 生成jwt token
     * @param userId 用户id
     * @return
     */
    private String generateToken(Long userId) {
        Date nowDate = new Date();
        Date expireDate = new Date(nowDate.getTime() + expire * 1000);
        return Jwts.builder()
                //声明类型typ，表示这个令牌（token）的类型（type），JWT令牌统一写为JWT
                .setHeaderParam("typ", "JWT")
                // jwt所面向的用户
                .setSubject(userId.toString())
                //jwt的签发时间
                .setIssuedAt(nowDate)
                //jwt的过期时间，这个过期时间必须要大于签发时间
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    /**
     * 此处要注意，因为要在token中载入用户相关信息所以需要使用user类，注意修改user为具体账户类型
     * @param userDetails 用户实体类
     * @return
     */
    public String generateToken(User userDetails) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED, new Date());
        claims.put(CLAIM_KEY_ID, userDetails.getId());
        claims.put(CLAIM_KEY_ROLES, userDetails.getAuthorities());
        return TOKEN_PREFIX+generateToken(claims);
    }

    /**
     * 生成指定数据声明(claims)的token
     * @param claims 数据声明map
     * @return
     */
    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
    /**
     * 从token中获取数据声明（Claim）
     * 数据声明Claims中包含jwt中载荷payload中预定义内容
     * payload中可以包含预定义的7个可用，它们不是强制性的，但推荐使用，也可以添加任意自定义的key
     *     iss(issuer): jwt签发者
     *     sub(subject): jwt所面向的用户
     *     aud(audience): 接收jwt的一方, 受众
     *     exp(expiration time): jwt的过期时间，这个过期时间必须要大于签发时间
     *     nbf(Not Before): 生效时间，定义在什么时间之前.
     *     iat(Issued At): jwt的签发时间
     *     jti(JWT ID): jwt的唯一身份标识，主要用来作为一次性token,从而回避重放攻击。
     * @param token
     * @return
     */
    private Claims getClaimsByToken(String token) {
        if (StringUtils.isEmpty(token)) {
            return null;
        }
        //用户请求服务器时，在请求的header中加入 Authorization: Bearer xxxx(token) 。
        // 此处注意token之前有一个7字符长度的"Bearer"，服务器端对此token进行检验，
        // 如果合法就解析其中内容，根据其拥有的权限和业务逻辑反回响应结果
        //String[] header = token.split("Bearer");
        token = StringUtils.substringAfter(token,"Bearer ");
        try {
            return Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        }catch (Exception e){
            log.error("validate is token error ", e);
            return null;
        }
    }

    /**
     * 从指定token中获取账户名称
     * @param token
     * @return
     */
    public String getUsernameByToken(String token) {
        String username;
        try {
            username =getClaimsByToken(token).getSubject();
        } catch (Exception e) {
            username = null;
        }
        return username;
    }
    /*
     * 从指定token中获取token创建时间
     */
    private Date getCreatedDateByToken(String token) {
        Date created;
        try {
            final Claims claims = getClaimsByToken(token);
            created = new Date((Long) claims.get(CLAIM_KEY_CREATED));
        } catch (Exception e) {
            created = null;
        }
        return created;
    }

    /**
     * 从指定token中获取过期时间
     * @param token
     * @return
     */
    private Date getExpirationDateByToken(String token) {
        Date expiration;
        try {
            final Claims claims =getClaimsByToken(token);
            expiration = claims.getExpiration();
        } catch (Exception e) {
            expiration = null;
        }
        return expiration;
    }

    /**
     * 判断指定token的有效期是否过期
     * @param token
     * @return true已过期
     */
    private Boolean isTokenExpired(String token) {
        final Date expiration =  getExpirationDateByToken(token);
        return expiration.before(new Date());
    }

    /**
     * 判断token是否是已经刷新过得
     * @param token
     * @return true刷新过的token，false需要刷新的token
     */
    public Boolean canTokenBeRefreshed(String token) {
        return !isTokenExpired(token);
    }

    /**
     * 刷新token的有效期
     * 通过调整token创建时间和有效期时间方式进行刷新
     * @param token
     * @return
     */
    public String refreshToken(String token) {
        String refreshedToken;
        try {
            final Claims claims = getClaimsByToken(token);
            claims.put(CLAIM_KEY_CREATED, new Date());
            refreshedToken = generateToken(claims);
        } catch (Exception e) {
            refreshedToken = null;
            log.error("token刷新失败",e);
        }
        return refreshedToken;
    }

    /**
     * 验证传入的token与指定的security UserDetails账户是否一致，是否过期
     * @param token
     * @param userDetails
     * @return true 账户一致且token未过期
     */
    public Boolean validateToken(String token, UserDetails userDetails) {
        User user = (User) userDetails;
        final String username = getUsernameByToken(token);
        final Date created = getCreatedDateByToken(token);
        return (
                username.equals(user.getUsername())
                        && isTokenExpired(token)==false);
    }
}
