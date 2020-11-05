package com.cros.vue.common;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

/**
 * @author MaLei
 * @description:
 * DES加密介绍
 * DES是一种对称加密算法，所谓对称加密算法即：加密和解密使用相同密钥的算法。DES加密算法出自IBM的研究，
 * 后来被美国政府正式采用，之后开始广泛流传，但是近些年使用越来越少，因为DES使用56位密钥，以现代计算能力，
 * 24小时内即可被破解。虽然如此，在某些简单应用中，我们还是可以使用DES加密算法，本文简单讲解DES的JAVA实现
 * 。
 * 注意：DES加密和解密过程中，密钥长度都必须是8的倍数
 * @create 2020/9/11
 */
public class DES {
    /**
     * 加密
     *
     * @param datasource byte[]
     * @param password   String DES加密秘钥 ，长度必须是8的倍数
     * @return byte[]，注意需要编码要不显示乱码
     */
    public static byte[] encrypt(byte[] datasource, String password) {
        try {
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            //创建一个密匙工厂，然后用它把DESKeySpec转换成
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            //Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance("DES");
            //用密匙初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
            //现在，获取数据并加密
            //正式执行加密操作
            return cipher.doFinal(datasource);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 加密
     *
     * @param datasource 需要加密的字符串
     * @param desKey     DES加密秘钥 ，长度必须是8的倍数
     * @return 加密后字符串
     */
    public static String encrypt(String datasource, String desKey) {
        //java8以后可以使用该方法
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] result = DES.encrypt(datasource.getBytes(), desKey);
        return encoder.encodeToString(result);
    }

    /**
     * 解密
     *
     * @param src      byte[],注意需要解码要不显示乱码
     * @param password String DES加密秘钥 ，长度必须是8的倍数
     * @return byte[]
     * @throws Exception
     */
    public static byte[] decrypt(byte[] src, String password) throws Exception {
        // DES算法要求有一个可信任的随机数源
        SecureRandom random = new SecureRandom();
        // 创建一个DESKeySpec对象
        DESKeySpec desKey = new DESKeySpec(password.getBytes());
        // 创建一个密匙工厂
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        // 将DESKeySpec对象转换成SecretKey对象
        SecretKey securekey = keyFactory.generateSecret(desKey);
        // Cipher对象实际完成解密操作
        Cipher cipher = Cipher.getInstance("DES");
        // 用密匙初始化Cipher对象
        cipher.init(Cipher.DECRYPT_MODE, securekey, random);
        // 真正开始解密操作
        return cipher.doFinal(src);
    }

    /**
     * 解密
     *
     * @param datasource 需要解密字符串
     * @param desKey     DES秘钥 ，长度必须是8的倍数
     * @return 解密字符串
     * @throws Exception
     */
    public static String decrypt(String datasource, String desKey) throws Exception {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decryResult = DES.decrypt(decoder.decode(datasource), desKey);
        return new String(decryResult);
    }
}
