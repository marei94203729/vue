package com.cros.vue;

import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
//http://www.ruanyifeng.com/blog/2016/04/cors.html
//https://www.jianshu.com/p/85db845d3929
/*
*import Axios from "axios";
Vue.config.productionTip = false;
// step2：把axios挂载到vue的原型中，在vue中每个组件都可以使用axios发送请求,
// 不需要每次都 import一下 axios了，直接使用 $axios 即可
Vue.prototype.$axios = Axios;
// step3：使每次请求都会带一个 /api 前缀
Axios.defaults.baseURL = "/api";
//===========================================================================
testAxios() {
      let that=this;
      this.$axios.get('/apis/home',{
            params:{
                movieId:1211269
            }
          }).then(response => {
          if (response.data) {
            console.log(response.data);
          }
        })
        .catch(err => {
          console.log(err);
        });
        let data = new FormData();
                data.append('movieId','1211269');
                this.$axios.post("/apis/home",data,
                { headers: that.headers,
                withCredentials:true,
                })
                .then(response => {
                if (response.data) {
                //that.headers.Cookie="JSESSIONID="+response.data.code;
                console.log(response.headers);
                }
                })
                .catch(err => {
                console.log(err);
                });
                }
//=============================================
                vue.config.js
module.exports = {
        devServer: {
        proxy: {
        '/api': {
        // 此处的写法，目的是为了 将 /api 替换成 https://www.baidu.com/
        target: 'http://localhost:8081',
        // 允许跨域
        changeOrigin: true,
        ws: true,
        pathRewrite: {
        '^/api': ''
        }
        }
        }
        }
        }
//==================================
        https://cloud.tencent.com/developer/article/1513212
        https://blog.csdn.net/qq_44784185/article/details/104988179
        https://www.cnblogs.com/ibigboy/p/11528775.html
        https://blog.csdn.net/menghuanzhiming/article/details/102736312?utm_medium=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.channel_param&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.channel_param
        http://www.axios-js.com/zh-cn/docs/
        https://www.cnblogs.com/happyflyingpig/p/8118818.html
        https://www.jianshu.com/p/85db845d3929
        https://blog.csdn.net/weixin_42036952/article/details/88564647

        */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableTransactionManagement
@MapperScan(basePackages = "com.cros.vue.mapper", sqlSessionFactoryRef = "firstSqlSessionFactory")
@ServletComponentScan
public class VueApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueApplication.class, args);
    }
    //放置tomcat阻止上传文件过大的代码，具体上传参数在配置文件中设置
    @Bean
    public TomcatServletWebServerFactory tomcatEmbedded() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
            if ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {
                //-1 means unlimited
                ((AbstractHttp11Protocol<?>) connector.getProtocolHandler()).setMaxSwallowSize(-1);
            }
        });
        return tomcat;
    }
    /*@Bean
    public CorsFilter corsFilter() {

        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();
        /*
         * 表示是否允许发送Cookie。默认情况下，Cookie不包括在CORS请求之中
         * 需要注意的是，如果要发送Cookie，Access-Control-Allow-Origin就不能设为星号，必须指定明确的、与请求网页一致的域名。
         * 同时，Cookie依然遵循同源政策，只有用服务器域名设置的Cookie才会上传，其他域名的Cookie并不会上传，
         * 且（跨源）原网页代码中的document.cookie也无法读取服务器域名下的Cookie。
         */
       /* config.setAllowCredentials(true);
        config.addAllowedOrigin("http://localhost:8080");
        config.addAllowedHeader("*");
        //该字段必需，它的值是逗号分隔的一个字符串，表明服务器支持的所有跨域请求的方法。注意，返回的是所有支持的方法，而不单是浏览器请求的那个方法。这是为了避免多次"预检"请求。
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        config.addExposedHeader("token");
        //该字段可选，用来指定本次预检请求的有效期，单位为秒。上面结果中，有效期是20天（1728000秒）
        config.setMaxAge(1728000l);
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }*/
}
