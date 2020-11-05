package com.cros.vue.common;

import lombok.extern.slf4j.Slf4j;
import net.coobird.thumbnailator.Thumbnails;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MaLei
 * @description: 图片处理工具类
 * 本类使用了thumbnailator依赖
 * <dependency>
 *    <groupId>net.coobird</groupId>
 *    <artifactId>thumbnailator</artifactId>
 *    <version>0.4.12</version>
 * </dependency>
 * @create 2020/9/2
 */
@Slf4j
public class ImageUtils {
    private static Map<String,String> ongStep(){
        Map<String,String> img=new HashMap<>();
        img.put("8A23G151","assets/upload/pic/20200921/1600679707033.jpg");
        img.put("8A29M178","assets/upload/pic/20200921/1600679837227.jpg");
        img.put("FL22247","assets/upload/pic/20200902/1599009476167.jpg");
        img.put("FL22249","assets/upload/pic/20200902/1599009569123.jpg");
        img.put("FL22252","assets/upload/pic/20200321/1584773297364.jpg");
        img.put("FL22256","assets/upload/pic/20200321/1584773391258.jpg");
        img.put("FL22251","assets/upload/pic/20200321/1584773181185.jpg");
        img.put("4E39C17130","assets/upload/pic/20200921/1600678049265.jpg");
        img.put("2E62A17268","assets/upload/pic/20200921/1600677617699.jpg");
        img.put("1F08X319","assets/upload/pic/20200921/1600677367527.jpg");
        img.put("7D53W110","assets/upload/pic/20200921/1600678748823.jpg");
        img.put("NF07B18063","assets/upload/pic/20200421/1587439912429.jpg");
        img.put("NG06B18063","assets/upload/pic/20200421/1587440989499.jpg");
        img.put("9B43Z152","assets/upload/pic/20200421/1587433765716.jpg");
        img.put("4E84W130","assets/upload/pic/20200921/1600678480301.jpg");
        img.put("4E40C17230","assets/upload/pic/20200921/1600678148039.jpg");
        img.put("2G84C17268","assets/upload/pic/20200921/1600677809824.jpg");
        img.put("7E39U110","assets/upload/pic/20200921/1600678961455.jpg");
        img.put("3D23A17373","assets/upload/pic/20200820/1597912045831.jpg");
        img.put("7E84W110","assets/upload/pic/20200921/1600679036072.jpg");
        img.put("9CS1H151","assets/upload/pic/20190508/1557298290392.jpg");
        img.put("1D68Z622","assets/upload/pic/20200921/1600677275130.jpg");
        img.put("7E17A17110","assets/upload/pic/20200921/1600678853061.jpg");
        img.put("3G101W276","assets/upload/pic/20200921/1600677890430.jpg");
        img.put("4E88C17111","assets/upload/pic/20200921/1600678642744.jpg");
        img.put("7F24C17110","assets/upload/pic/20200921/1600679119629.jpg");
        img.put("2E07C17204","assets/upload/pic/20200921/1600677456995.jpg");
        img.put("2E13C17268","assets/upload/pic/20200922/1600746452084.jpg");
        img.put("4E43C17230","assets/upload/pic/20200922/1600745716068.jpg");
        img.put("7E85C17110","assets/upload/pic/20200922/1600746075601.jpg");
        img.put("2E04C17260","assets/upload/pic/20200922/1600746339396.jpg");
        return img;
    }
    public static void calculate(){
        String prefix="http://shop.byky.com/lovemall/";
        String savePath="C:/Users/ml/Desktop/8月26日直播预热文案/";
        int width=200;
        //循环遍历图片地址
        Map<String,String> img=ongStep();
        for (Map.Entry<String,String> m:img.entrySet()) {
            ImageUtils.thumbnail(m.getValue(), m.getKey(),prefix,savePath,width);
        }
    }

    /**
     * 将指定地址的图片按照传入的地址及宽度进行等比压缩后存储指定位置
     * @param strURL 图片所在网络服务器地址中图片文件夹位置(prefix+strURL为完整访问url)
     * @param name 图片要保存的名称
     * @param prefix http url的前缀
     * @param savePath 要保存的地址
     * @param width 要压缩到的宽度值
     */
    private static void thumbnail(String strURL,String name,String prefix,String savePath,int width) {
        try {
            //BufferedImage bufferedImage=getImageFromNetByUrl(six+strURL);
            URL url = new URL(String.format("%s%s",prefix,strURL));
            //从url中读取构造builder，图片缩放比1，输出高清质量1图片到内存
            Thumbnails.Builder<URL> builder= Thumbnails.of(url).scale(1.0).outputQuality(1.0);;
            BufferedImage bufferedImage=builder.asBufferedImage();
            //计算压缩高度
            int _width=bufferedImage.getWidth();
            int _heigth=bufferedImage.getHeight();
            //高度按照宽度高比按照宽度等比缩放
            int heigth=(_heigth * _width / width);
            //此处保存时不能使用原来的Thumbnails.Builder<URL>，需要重新构建
            Thumbnails.of(bufferedImage).size(_width,_heigth).toFile(String.format("%s%s大.jpg",savePath,name));
            Thumbnails.of(bufferedImage).size(width,heigth).toFile(String.format("%s%s小.jpg",savePath,name));//file.getInputStream()).size(WINDTH, HEIGHT).toFile(des);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用ImageIO构造返回BufferedImage
     * @param strUrl
     * @return
     */
    public static BufferedImage getImageFromNetByUrl(String strUrl) {
        try {
            URL url = new URL(strUrl);
            BufferedImage bufferedImage = ImageIO.read(url);
          //  Thumbnails.of(strUrl).
            // HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // conn.setRequestMethod("GET");
            // conn.setConnectTimeout(5 * 1000);
            //InputStream inStream = conn.getInputStream();// 通过输入流获取图片数据
            return bufferedImage;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
