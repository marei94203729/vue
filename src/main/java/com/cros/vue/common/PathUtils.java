package com.cros.vue.common;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.AntPathMatcher;

/**
 * @author MaLei
 * @description: 用于各种路径的操作工具类
 * @create 2020/8/31
 */
public class PathUtils {
    /**
     * 类路径下根目录包名称
     */
    public final static String CLASS_PATH_PACKAGE_NAME="com.cros.vue";

    /**
     * 通过输入的服务类名匹配返回全路径类名
     * @param className 如果是简写类名或全路径类名
     * @return
     */
    public static String matchServicePackagePath(String className){
        //做uri匹配规则,它主要用来做类URLs字符串匹配；
        if(StringUtils.containsIgnoreCase(className,CLASS_PATH_PACKAGE_NAME+".service")){
            return className;
        }
        if(StringUtils.containsIgnoreCase(className,CLASS_PATH_PACKAGE_NAME)){
            return className;
        }else{
            return CLASS_PATH_PACKAGE_NAME+".service."+className;
        }
    }

    /**
     * 通过输入的实体类名匹配返回全路径类名
     * @param className
     * @return
     */
    public static String matchEntityPackagePath(String className){
        //做uri匹配规则,它主要用来做类URLs字符串匹配；
        if(StringUtils.containsIgnoreCase(className,CLASS_PATH_PACKAGE_NAME+".entity")){
            return className;
        }
        if(StringUtils.containsIgnoreCase(className,CLASS_PATH_PACKAGE_NAME)){
            return className;
        }else{
            return CLASS_PATH_PACKAGE_NAME+".entity."+className;
        }
    }
}
