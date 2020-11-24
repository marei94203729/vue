package com.cros.vue.common;

import com.cros.vue.service.annotation.Execute;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.*;

/**
 * @author MaLei
 * @description: HandlerControl类的辅助工具类
 * @create 2020/9/1
 */
public class HandlerUtils {
    /**
     * 通过传入的全路径类名获得传入类的Class类型
     * @param classAllPathName 全路径类名
     * @return 传入类的元Class类型
     * @throws ClassNotFoundException
     */
    public static Class<?> obtailClassType(String classAllPathName)throws ClassNotFoundException{
        Class<?> zlass = Class.forName(classAllPathName);
        return zlass;
    }

    /**
     * 配置对应字段查询值
     * @param classAllPathName
     * @param fieldName
     * @param value
     * @return
     * @throws ClassNotFoundException
     * @throws NoSuchFieldException
     * @throws ParseException
     */
    public static String calculateFieldValue(String classAllPathName,String fieldName,String value)throws ClassNotFoundException,NoSuchFieldException,ParseException{
        Class<?> zlass=obtailClassType(classAllPathName);
        //检索字段
        Field field=zlass.getDeclaredField(fieldName);
        //检索字段类型
        Class<?> fieldtype=field.getType();
        //日期类型
        if(fieldtype.getSimpleName().equals("Date")){
            return " between '"+StringUtils.substringBefore(value,",")+"' and '"+StringUtils.substringAfter(value,",")+"'";
        }else if(fieldtype.getSimpleName().equals("String")){//字符类型
            if(StringUtils.contains(value,"%")) {
                return " like '" + value + "'";
            }else{
                return "='" + value + "'";
            }
        }else {
            //数值类型及布尔
            return "="+value;
        }
    }
    /**
     * 获取给定实例中指定方法名称及参数类型的方法
     * @param instance
     * @param fieldName
     * @return
     */
    public static Object getFieldValue(Object instance,String fieldName)throws NoSuchFieldException,IllegalAccessException{
        Class<?>zlass=instance.getClass();
        Field field= zlass.getDeclaredField(fieldName);
        field.setAccessible(true);
        //获取字段值
        Object obj=field.get(instance);
        return obj;
    }
    /**
     * 获取传入类类型下定义的所有字段名称及该字段对应的类型
     * 字段定义类型装入返回map的有两种：基本类型直接返回如int字符串。类类型返回全路径类名如java.util.Date
     * @param zlass
     * @return 返回的map的key对应的字段名称，value对应的字段定义类型
     */
    public static Map<String,String> obtailFieldsByClass(Class<?> zlass){
        //遍历字段装入的map
        Map<String,String> fieldsDefinition=new HashMap<>(0);
        //遍历zlass对应类内定义的字段
        for(Field f:zlass.getDeclaredFields()){
            //如果是java.util.Date这种类类型则按照类类型路径名称进行存储
            //如果是基本类型如int则按照基本类型名称进行存储
            fieldsDefinition.put(f.getName(),StringUtils.contains(f.getType().toString(),"java.")?String.format("java.%s", StringUtils.substringAfter(f.getType().toString(),"java.")):f.getType().toString());
        }
        return fieldsDefinition;
    }

    /**
     * 在传入的类类型中查找使用指定注解的方法
     * @param origin 持有注解标注方法的类类型
     * @param annotationClass 要查找的注解类型
     * @return 0位为方法Method类型，1位为方法参数类类型
     */
    public static Object[] findAnnotationMethod(Class<?> origin,Class<? extends Annotation> annotationClass){
        Method _method=null;
        Class<?> _methodParamClass=null;
        //判断是否传递了方法名称,未传递则
        for(Method method : origin.getDeclaredMethods()){
            Annotation annotation= method.getAnnotation(annotationClass);
            if(annotation!=null){
                _method=method;
                Class<?>[] _methodParamClasss=method.getParameterTypes();
                _methodParamClass=_methodParamClasss!=null?_methodParamClasss[0]:null;
                break;
            }
        }
        if(_method==null||_methodParamClass==null)
            throw new NullPointerException(String.format("%s类中不存在%s注解标注的方法!",origin.getSimpleName(),annotationClass.getSimpleName()));
        return new Object[]{_method,_methodParamClass};
    }

    /**
     * 在指定的类类型中查找方法，如果存在则调用
     * @param origin 要查找方法的类类型
     * @param methodName 方法名
     * @param args 传入方法的参数类类型，如果是int等基本类型则输入int.class.如果无参数则输入null
     * @return 方法类型
     * @throws NoSuchMethodException
     */
    public static  Method findMethod(Class<?> origin,String methodName,Class<?>...args)throws NoSuchMethodException{
        Method method = origin.getDeclaredMethod(methodName, args==null?new Class[0]:args);
        method.setAccessible(true);
        return method;
    }

    /**
     * 装配实例指定字段值
     * 遍历传入的param参数集合，将param中value利用反射赋值给instance中与param的key同名字段
     * @param instance 要装载的实例，必须是初始化过的
     * @param param
     * @param fieldDefinitions
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     * @throws ParseException
     */
    public static void assembleInstance(Object instance,Map<String,String> param,Map<String,String> fieldDefinitions)throws NoSuchFieldException,IllegalAccessException,ParseException{
        Class<?> zlass=instance.getClass();
        Iterator<Map.Entry<String,String>>it=fieldDefinitions.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> e=it.next();
            //判断当前字段是否存在传入的参数中
            if(param.containsKey(e.getKey())) {
                //根据字段key存储的名称检索指定方法
                Field field = zlass.getDeclaredField(e.getKey());
                field.setAccessible(true);
                //进行类型判断然后转化类型后组装参数值
                if(StringUtils.equals(e.getValue(),String.class.getName())){
                    field.set(instance, param.get(e.getKey()));
                }else if(StringUtils.equals(e.getValue(),Date.class.getName())){
                    field.set(instance, DateUtils.parseDate(param.get(e.getKey()),new String[]{"yyyy-MM-dd HH:mm:ss"}));
                }else if(StringUtils.equals(e.getValue(),Long.class.getName())||StringUtils.equals(e.getValue(),long.class.getName())){
                    field.set(instance, Long.valueOf(param.get(e.getKey())));
                }else if(StringUtils.equals(e.getValue(),Integer.class.getName())||StringUtils.equals(e.getValue(),int.class.getName())){
                    field.set(instance, Integer.valueOf(param.get(e.getKey())));
                }else if(StringUtils.equals(e.getValue(),Short.class.getName())||StringUtils.equals(e.getValue(),short.class.getName())){
                    field.set(instance, Short.valueOf(param.get(e.getKey())));
                }else if(StringUtils.equals(e.getValue(),float.class.getName())||StringUtils.equals(e.getValue(),Float.class.getName())){
                    field.set(instance, Float.valueOf(param.get(e.getKey())));
                }else if(StringUtils.equals(e.getValue(),Double.class.getName())||StringUtils.equals(e.getValue(),double.class.getName())){
                    field.set(instance, Double.valueOf(param.get(e.getKey())));
                }else if(StringUtils.equals(e.getValue(),BigInteger.class.getName())){
                    field.set(instance, new BigInteger(param.get(e.getKey())));
                }else if(StringUtils.equals(e.getValue(),BigDecimal.class.getName())){
                    field.set(instance, new BigDecimal(param.get(e.getKey())));
                }else if(StringUtils.equals(e.getValue(),Boolean.class.getName())||StringUtils.equals(e.getValue(),boolean.class.getName())){
                    field.set(instance, Boolean.valueOf(param.get(e.getKey())));
                }
            }
        }
    }
    /**
     * 字符串类型参数配置
     * @param fieldType
     * @param originInstance
     * @param paramKey
     * @param paramValue
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public static void setSQLWhereOfString(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        if(StringUtils.isNotEmpty(fieldType)&&StringUtils.equals(fieldType,"java.lang.String")){
            //当查询参数中含有%时使用模糊查询，否则使用精确查询
            String name=null;
            if(com.cros.vue.common.StringUtils.contains(paramValue,"%")){
                name=String.format("and%sLike",com.cros.vue.common.StringUtils.firstCharToUpperCase(paramKey));
            }else{
                name=String.format("and%sEqualTo",com.cros.vue.common.StringUtils.firstCharToUpperCase(paramKey));
            }
            Method methodBook = originInstance.getClass().getDeclaredMethod(name, String.class);
            methodBook.setAccessible(true);
            methodBook.invoke(originInstance, paramValue);
        }
    }
    private static List<Long> typeConversionToLong(String[] con,Class<?> zlass){
        List<Long> lists=null;
        if(zlass.getSimpleName().equals("long")||zlass.getSimpleName().equals("Long")){
            lists=new ArrayList<Long>(0);
            for(String i:con){
                lists.add(Long.valueOf(i));
            }
        }
        return lists;
    }
    private static List<Integer> typeConversionToInteger(String[] con,Class<?> zlass){
        List<Integer> lists=null;
        if(zlass.getSimpleName().equals("Integer")||zlass.getSimpleName().equals("int")){
            lists=new ArrayList<Integer>(0);
            for(String i:con){
                lists.add(Integer.valueOf(i));
            }
        }
        return lists;
    }
    private static List<Short> typeConversionToShort(String[] con,Class<?> zlass){
        List<Short> lists=null;
        if(zlass.getSimpleName().equals("Short")||zlass.getSimpleName().equals("short")){
            lists=new ArrayList<Short>(0);
            for(String i:con){
                lists.add(Short.valueOf(i));
            }
        }
        return lists;
    }
    /**
     * 配置基础类型查询条件
     * @param fieldType 字段类型字符串
     * @param originInstance Criteria实例
     * @param paramKey 参数map中key
     * @param paramValue 参数map中的value
     * @param baseClass 基础类型及基础类型的包装类
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    private static void setSQLWhereOfBase(String fieldType,Object originInstance,String paramKey,Object paramValue,Class<?> baseClass)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        //if(StringUtils.isNotEmpty(fieldType)&&StringUtils.equals(fieldType,baseClass.getName())){
            //当查询参数中含有%时使用模糊查询，否则使用精确查询
            String name=String.format("and%sEqualTo",com.cros.vue.common.StringUtils.firstCharToUpperCase(paramKey));
            Method methodBook = originInstance.getClass().getDeclaredMethod(name, baseClass);
            methodBook.setAccessible(true);
            methodBook.invoke(originInstance, paramValue);
       // }
    }
    private static void setSQLWhereOfBaseIn(String fieldType,Object originInstance,String paramKey,Object paramValue,Class<?> baseClass)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        //当时整数型字段且带有逗号内容时使用in查询
        String name = String.format("and%sIn", com.cros.vue.common.StringUtils.firstCharToUpperCase(paramKey));
        //组装查询数组
        String[] con = StringUtils.split((String) paramValue, ",");
        List<?> list = typeConversionToLong(con, baseClass);
        if (list == null)
            list = typeConversionToInteger(con, baseClass);
        if (list == null)
            list = typeConversionToShort(con, baseClass);
        Method methodBook = originInstance.getClass().getDeclaredMethod(name, List.class);
        methodBook.setAccessible(true);
        methodBook.invoke(originInstance, list);
    }
    /**
     * Long类型参数配置
     * @param fieldType
     * @param originInstance
     * @param paramKey
     * @param paramValue
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public static void setSQLWhereOfLong(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        if (StringUtils.contains(paramValue, ",")) {
            setSQLWhereOfBaseIn(fieldType,originInstance,paramKey,paramValue,Long.class);
            return;
        }
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Long.valueOf(paramValue),Long.class);
    }

    /**
     * long类型参数配置
     * @param fieldType
     * @param originInstance
     * @param paramKey
     * @param paramValue
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public static void setSQLWhereOflong(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        if (StringUtils.contains(paramValue, ",")) {
            setSQLWhereOfBaseIn(fieldType,originInstance,paramKey,paramValue,long.class);
            return;
        }
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Long.valueOf(paramValue),long.class);
    }
    public static void setSQLWhereOfInteger(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        if (StringUtils.contains(paramValue, ",")) {
            setSQLWhereOfBaseIn(fieldType,originInstance,paramKey,paramValue,Integer.class);
            return;
        }
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Integer.valueOf(paramValue),Integer.class);
    }
    public static void setSQLWhereOfint(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        if (StringUtils.contains(paramValue, ",")) {
            setSQLWhereOfBaseIn(fieldType,originInstance,paramKey,paramValue,int.class);
            return;
        }
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Integer.valueOf(paramValue),int.class);
    }
    public static void setSQLWhereOfboolean(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Boolean.valueOf(paramValue).booleanValue(),boolean.class);
    }
    public static void setSQLWhereOfBoolean(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Boolean.valueOf(paramValue),Boolean.class);
    }
    public static void setSQLWhereOfshort(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        if (StringUtils.contains(paramValue, ",")) {
            setSQLWhereOfBaseIn(fieldType,originInstance,paramKey,paramValue,short.class);
            return;
        }
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Short.valueOf(paramValue),short.class);
    }
    public static void setSQLWhereOfShort(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        if (StringUtils.contains(paramValue, ",")) {
            setSQLWhereOfBaseIn(fieldType,originInstance,paramKey,paramValue,Short.class);
            return;
        }
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Short.valueOf(paramValue),Short.class);
    }
    public static void setSQLWhereOffloat(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Float.valueOf(paramValue),float.class);
    }
    public static void setSQLWhereOfFloat(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Float.valueOf(paramValue),Float.class);
    }
    public static void setSQLWhereOfdouble(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Double.valueOf(paramValue),double.class);
    }
    public static void setSQLWhereOfDouble(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        setSQLWhereOfBase(fieldType,originInstance,paramKey,Double.valueOf(paramValue),Double.class);
    }
    public static void setSQLWhereOfBigDecimal(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        setSQLWhereOfBase(fieldType,originInstance,paramKey,new BigDecimal(paramValue), BigDecimal.class);
    }
    public static void setSQLWhereOfBigInteger(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException {
        setSQLWhereOfBase(fieldType,originInstance,paramKey,new BigInteger(paramValue), BigInteger.class);
    }
    public static void setSQLWhereOfDate(String fieldType,Object originInstance,String paramKey,String paramValue)throws NoSuchMethodException,IllegalAccessException, InvocationTargetException, ParseException {
        if(StringUtils.isNotEmpty(fieldType)&&(StringUtils.equals(fieldType,"java.util.Date"))){
            Method method = originInstance.getClass().getDeclaredMethod(String.format("and%sBetween",com.cros.vue.common.StringUtils.firstCharToUpperCase(paramKey)), Date.class,Date.class);
            method.setAccessible(true);
            method.invoke(originInstance, DateUtils.parseDate(StringUtils.substringBefore( paramValue,","),new String[]{"yyyy-MM-dd HH:mm:ss"}),DateUtils.parseDate(StringUtils.substringAfter( paramValue,","),new String[]{"yyyy-MM-dd HH:mm:ss"}));
        }
    }
}
