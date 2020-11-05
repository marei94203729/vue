package com.cros.vue.config.security;

import com.cros.vue.config.token.JwtToken;
import com.cros.vue.entity.User;
import com.cros.vue.filter.JWTAuthenticationFilter;
import com.cros.vue.mapper.UserMapper;
import com.cros.vue.service.UserMemoryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.web.cors.CorsUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Properties;
/**
 * @author MaLei
 * @description: 新建一个WebSecurityConfig类，使其继 承WebSecurityConfigurerAdapter
 * 在给WebSecutiryConfig类中加上@EnableWebSecurity 注解后，便会自动被 Spring发现并注册（查看
 * @EnableWebSecurity 即可看到@Configuration 注解已经存在
 * @create 2020/7/14
 */
@EnableWebSecurity
//添加annotation 支持,包括（prePostEnabled，securedEnabled...）
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Slf4j
public class WebSecutiryConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    CustomMetadataSource metadataSource;
    @Autowired
    UrlAccessDecisionManager urlAccessDecisionManager;
    @Autowired
    JwtToken jwtToken;
    @Autowired
    UserMemoryService userMemoryService;
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    //核心过滤器配置方法
    //void configure(WebSecurity web)用来配置 WebSecurity。而 WebSecurity是基于 Servlet Filter用来配置 springSecurityFilterChain。而 springSecurityFilterChain又被委托给了 Spring Security 核心过滤器 Bean DelegatingFilterProxy。  相关逻辑你可以在 WebSecurityConfiguration中找到。一般不会过多来自定义 WebSecurity, 使用较多的使其ignoring()方法用来忽略Spring Security对静态资源的控制.对于静态资源的忽略尽量在此处设置，否则容易无限循环重新定向到登录页面
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/image/**","/css/**","/js/**","/Login", "/favicon.ico","/captcha.jpg","/assets/**");
    }

    //安全过滤器链配置方法
    //void configure(HttpSecurity http)这个是我们使用最多的，用来配置 HttpSecurity。 HttpSecurity用于构建一个安全过滤器链 SecurityFilterChain。SecurityFilterChain最终被注入核心过滤器 。 HttpSecurity有许多我们需要的配置。我们可以通过它来进行自定义安全访问策略
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // super.configure(http); 不能使用默认的验证方式
        //authorizeRequests（）方法实际上返回了一个 URL 拦截注册器，我们可以调用它提供的
        //anyanyRequest（）、antMatchers（）和regexMatchers（）等方法来匹配系统的URL，并为其指定安全
        //允许跨域
        http.cors();//.and().authorizeRequests().requestMatchers(CorsUtils::isPreFlightRequest).permitAll();
        //增加账户密码验证过滤器作用在登录验证前和登陆成功后
        //http.addFilter(new JWTAuthenticationFilter(authenticationManagerBean()));
        //session管理
        //session失效后跳转
        //http.sessionManagement().invalidSessionUrl("/Login");
        // 基于token，所以不需要session
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        //单用户登录，如果有一个登录了，同一个用户在其他地方登录将前一个剔除下线
        //http.sessionManagement().maximumSessions(1).expiredSessionStrategy(expiredSessionStrategy());
        //让Spring security放行所有preflight request
        // http.authorizeRequests().requestMatchers(CorsUtils::isPreFlightRequest).permitAll();
        //单用户登录，如果有一个登录了，同一个用户在其他地方不能登录
        //http.sessionManagement().maximumSessions(1).maxSessionsPreventsLogin(true);
        //策略
        http.authorizeRequests().requestMatchers(CorsUtils::isPreFlightRequest).permitAll() //.antMatchers("/js/**").permitAll()
                //.antMatchers("/css/**").permitAll()
                //.antMatchers("/image/**").permitAll()
                //.antMatchers("/favicon.ico").permitAll()
                .anyRequest().authenticated() .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>(){
            @Override
            public <O extends FilterSecurityInterceptor> O postProcess(O o) {
                o.setSecurityMetadataSource(metadataSource);
                o.setAccessDecisionManager(urlAccessDecisionManager);
                return o;
            }
        })
                .and()
                //formLogin（）方法和httpBasic（）方法都声明了需要Spring Security提供的表单认证方式，分别返
                //回对应的配置器
                .formLogin()
                //，formLogin（）.loginPage（"/myLogin.html"）指定自定义的登录
                //页/myLogin.html，同时，Spring Security会用/myLogin.html注册一个POST路由，用于接收登录请求
                //loginProcessingUrl("/doLogin")指定的/doLogin必须与表单提交中指向的action一致
                //注意前端必须使用post方法提交
                .loginPage("/Login")
                .loginProcessingUrl("/doLogin").permitAll()
                //表单中用户名和密码对应参数设置(默认为username和password)，如果是默认值则不用设置下面的参数对应.
                //.usernameParameter("usernames").passwordParameter("passwords")
                //.successForwardUrl("/MainPage")
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        User jwtUser = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
                        //将登录账户存入redis
                        userMemoryService.setUserFromRedis(jwtUser);
                        //生成token
                        String token=jwtToken.generateToken(jwtUser);
                        //头输出
                        httpServletResponse.addHeader("token",token);
                        httpServletResponse.getWriter().write("{\"message\":\"访问成功\",\"code\":200}");
                    }
                })
                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=UTF-8");
                        httpServletResponse.setStatus(401);
                        String error = new String();
                        if (e instanceof BadCredentialsException ||
                                e instanceof UsernameNotFoundException) {
                            error = "账户名或者密码输入错误!";
                        } else if (e instanceof LockedException) {
                            error = "账户被锁定，请联系管理员!";
                        } else if (e instanceof CredentialsExpiredException) {
                            error = "密码过期，请联系管理员!";
                        } else if (e instanceof AccountExpiredException) {
                            error = "账户过期，请联系管理员!";
                        } else if (e instanceof DisabledException) {
                            error = "账户被禁用，请联系管理员!";
                        } else {
                            error = "登录失败!";
                        }
                        httpServletResponse.getWriter().write("{\"message\":\"" + error + "\"}");
                    }
                })
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessHandler(new LogoutSuccessHandler() {
                    @Override
                    public void onLogoutSuccess(HttpServletRequest req, HttpServletResponse resp, Authentication authentication) throws IOException {
                        resp.setContentType("application/json;charset=utf-8");
                        resp.setStatus(403);
                        @Cleanup PrintWriter out = resp.getWriter();
                        out.write("{\"message\":\"注销成功!\"}");
                        out.flush();
                        // out.close();
                    }
                })
                .permitAll()
                .and()
                //csrf（）方法是Spring Security提供的跨站请求伪造防护功能，当我们继承WebSecurityConfigurer
                //Adapter时会默认开启csrf（）方法。由于使用的是JWT，我们这里不需要csrf
                .csrf().disable()
                //只有确实的访问失败才会进入AccessDeniedHandler，如果是未登陆或者会话超时等，不会触发AccessDeniedHandler，而是会直接跳转到登陆页面
                .exceptionHandling().accessDeniedHandler(new AccessDeniedHandler() {
            @Override
            public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
                httpServletResponse.setStatus(HttpServletResponse.SC_FORBIDDEN);
                httpServletResponse.setContentType("application/json;charset=UTF-8");
                httpServletResponse.setStatus(403);//权限不足返回403
                PrintWriter out = httpServletResponse.getWriter();
                out.write("{\"message\":\"权限不足，请联系管理员!\"}");
                out.flush();
                out.close();
            }
        });
        // 禁用缓存
        http.headers().cacheControl();

        // 添加JWT filter,过滤器注册在UsernamePasswordAuthenticationFilter之后进行鉴权
        http.addFilterBefore(jwtAuthorizationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
        //注册验证码过滤器,并将磁过滤器注册在UsernamePasswordAuthenticationFilter之前,此处验证码使用过滤器进行先行处理
        //http.addFilterBefore(customVerificationCodeFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    /**
     * 增加密码加密器，一旦增加，在验证过程中security将使用密码加密器进行加密对比，数据库中如果存储明文密码，在
     * UserDetailsService接口实现方法中，先加密密码然后才能返回UserDetails
     *
     * @return
     */
    @Bean
    PasswordEncoder passwordEncoder() {
        //  return new BCryptPasswordEncoder();
        return new MD5PasswordEncoder();
    }
    /**
     * 注入自定义PermissionEvaluator.低版本需要手动注册。高版本不需要，高版本注册将报错
     */
  /*  @Bean
    public DefaultWebSecurityExpressionHandler webSecurityExpressionHandler(){
        DefaultWebSecurityExpressionHandler handler = new DefaultWebSecurityExpressionHandler();
        handler.setPermissionEvaluator(new MyPermissionEvaluator());
        return handler;
    }*/

    /**
     * 声明验证码生成器实例
     * @return
     */
  @Bean
  public Producer captcha(){
      Properties properties=new Properties();
      //图片宽度
      properties.setProperty("kaptcha.border","yes");
      properties.setProperty("kaptcha.border.color","192,196,204");
      properties.setProperty("kaptcha.textproducer.font.color","blue");
      properties.setProperty("kaptcha.image.width","70");
      properties.setProperty("kaptcha.image.height","38");
      properties.setProperty("kaptcha.textproducer.font.size","30");
      properties.setProperty("kaptcha.session.key","code");
      properties.setProperty("kaptcha.textproducer.char.length","4");
      properties.setProperty("kaptcha.textproducer.font.names","宋体,楷体,微软雅黑");
      properties.setProperty("kaptcha.noise.color","192,196,204");
      //properties.setProperty("kaptcha.textproducer.char.string","0123456789");
      //如果需要去掉原生水纹样式，可以参考com.google.code.kaptcha.impl.WaterRipple类进行重写然后配置下面的属性中
      //properties.setProperty("kaptcha.obscurificator.impl","com.xx.config.NoWaterRipple");
      // 配置使用原生的 无噪 实现类 NoNoise,如果需要有噪点则注释下面配置
      properties.setProperty("kaptcha.noise.impl","com.google.code.kaptcha.impl.NoNoise");
      Config config=new Config(properties);
      DefaultKaptcha defaultKaptcha =new DefaultKaptcha();
      defaultKaptcha.setConfig(config);
      return defaultKaptcha;
  }

    /**
     * 声明一个过滤器，进行鉴权了，每一次需要权限的请求都需要检查
     * 该用户是否有该权限去操作该资源，当然这也是框架帮我们做的，
     * 那么我们需要做什么呢？很简单，只要告诉spring-security该用户
     * 是否已登录，是什么角色，拥有什么权限就可以了。
     * @return
     */
  public OncePerRequestFilter jwtAuthorizationTokenFilter(){
      return new OncePerRequestFilter() {

          @Autowired
          UserMapper userMapper;
          private String tokenHeader = "Authorization";

          private String tokenHead = "Bearer ";
          @Override
          protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
              //前端请求头传入的格式为Authorization='Bearer '+token 形式
              String authHeader = httpServletRequest.getHeader(jwtToken.TOKEN_REQUEST_HEADER);
              String pth=httpServletRequest.getServletPath();
              String method=httpServletRequest.getMethod();
              //前端传入的请求头中包含Authorization字段时加载登录账户信息到SecurityContextHolder
              if(StringUtils.isNoneBlank(authHeader)&&authHeader.startsWith(jwtToken.TOKEN_PREFIX)) {
                  //Authentication jwtUser = SecurityContextHolder.getContext().getAuthentication();
                  // 如果请求头中有token，则进行解析，并且设置认证信息
                  UsernamePasswordAuthenticationToken account=getAuthentication(authHeader,httpServletResponse);
                  if(account!=null)
                    SecurityContextHolder.getContext().setAuthentication(getAuthentication(authHeader,httpServletResponse));
              }
              filterChain.doFilter(httpServletRequest, httpServletResponse);
          }
          // 这里从token中获取用户信息并新建一个token
          private UsernamePasswordAuthenticationToken getAuthentication(String tokenHeader,HttpServletResponse httpServletResponse) {
              String token = tokenHeader;
              String username = jwtToken.getUsernameByToken(token);
              if (StringUtils.isNoneBlank(username)){
                  //从redis中读出登录账户
                  User jwtUser= null;
                  try {
                      jwtUser = userMemoryService.getUserFromRedis(username);
                  } catch (Exception e) {
                      log.error("从redis中读取数据出错",e);
                  }
                  if(jwtUser!=null){
                      //判断是否是临期，临期则展期
                      //if(!jwtToken.canTokenBeRefreshed(tokenHeader)){
                          //刷新token后响应输出
                      //}
                      //头输出

                      String header=httpServletResponse.getHeader("token");
                      if(StringUtils.isNoneBlank(header))
                        httpServletResponse.addHeader("token",token);
                      //登录账户已经过期
                      return new UsernamePasswordAuthenticationToken(jwtUser.getUsername(), jwtUser.getPassword(), jwtUser.getAuthorities());
                  }else {
                      //此处要读取账户信息，配置账户拥有的角色权限集合否则后面UrlAccessDecisionManager类中鉴权时不通过
                      //return new UsernamePasswordAuthenticationToken(username, null, new ArrayList<>());
                      return null;
                  }
              }
              return null;
          }
      };
  }
}
