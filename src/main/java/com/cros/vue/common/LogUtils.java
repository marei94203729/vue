package com.cros.vue.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MaLei
 * @description: 日志工具类, 本工具类面向slf4j接口编程，实际采用的是slf4j+log4j2的方案
 * <br>之所以采取面向slf4j接口编程而不直接面向log4j2编程就是方便迁移log组件
 * @create 2019/12/24
 */
public class LogUtils {
    /**
     * trace级别日志输出
     *
     * @param msg 需要输出的日志文件
     */
    public static void trace(String msg) {
        trace(msg, null);
    }

    public static void trace(String msg, Throwable e) {
        logger().trace(msg, e);
    }

    /**
     * trace级别日志输出
     *
     * @param msg 需要输出的日志文件
     */
    public static void debug(String msg) {
        debug(msg, null);
    }

    /**
     * trace级别日志输出
     *
     * @param msg 需要输出的日志文件
     * @param e   Throwable类型的异常
     */
    public static void debug(String msg, Throwable e) {
        logger().debug(msg, e);
    }

    /**
     * info级别日志输出
     *
     * @param msg 需要输出的日志文件
     */
    public static void info(String msg) {
        info(msg, null);
    }

    /**
     * info级别日志输出
     *
     * @param msg 需要输出的日志文件
     * @param e   Throwable类型的异常
     */
    public static void info(String msg, Throwable e) {
        logger().info(msg, e);
    }

    /**
     * warn级别日志输出
     *
     * @param msg 需要输出的日志文件
     */
    public static void warn(String msg) {
        warn(msg, null);
    }

    /**
     * warn级别日志输出
     *
     * @param msg 需要输出的日志文件
     * @param e   Throwable类型的异常
     */
    public static void warn(String msg, Throwable e) {
        logger().warn(msg, e);
    }

    /**
     * error级别日志输出
     *
     * @param msg 需要输出的日志文件
     */
    public static void error(String msg) {
        error(msg, null);
    }

    /**
     * error级别日志输出
     *
     * @param msg 需要输出的日志文件
     * @param e   Throwable类型的异常
     */
    public static void error(String msg, Throwable e) {
        logger().error(msg, e);
    }

    /**
     * 方法中使用slf4j接口如果要是直接用log4j2的代码如下，
     * <dl><dt>注意包名称为org.apache.logging.log4j.Logger和
     * org.apache.logging.log4j.LogManager;</dt>
     * <dd>Logger logger= LogManager.getLogger(Index.class)</dd></dl>;
     *
     * @return slf4j的Logger实例(底层用的log4j2)
     */
    private static Logger logger() {
        StackTraceElement caller = findCaller();
        //如果线程已经终止或者刚启动时返回当前类日志器
        if (caller == null) return LoggerFactory.getLogger(LogUtils.class);
        //注意此处使用的是slf4j的接口
        // 实例化一个原始被调用的类 Logger 对象，并且带上 方法名称、行号，更方便的通过日志定位代码
        Logger log = LoggerFactory.getLogger(caller.getClassName() + "." + caller.getMethodName() + "() Line: " + caller.getLineNumber());
        return log;
    }

    /**
     * 获取当前调用方法所处的堆栈信息
     * java.lang.StackTraceElement代表一个堆栈帧。除了一个在堆栈的顶部所有的栈帧代表一个方法调用。
     * <br>在堆栈顶部的帧表示在将其生成的堆栈跟踪的执行点。
     * 该类包含4个可用的get方法：getClassName()、getMethodName()、getLineNumber()、getFileName()
     *
     * @return
     */
    private static StackTraceElement findCaller() {
        // 获取堆栈信息,该方法返回一个代表该线程的堆栈转储堆栈跟踪元素的数组。如果该线程尚未启动或已经终止,这将返回一个零长度数组
        StackTraceElement[] callStack = Thread.currentThread().getStackTrace();
        if (null == callStack) return null;
        // 最原始被调用的堆栈信息
        StackTraceElement caller = null;
        // 日志类名称
        String logClassName = LogUtils.class.getName();
        // 循环遍历到日志类标识
        boolean isEachLogClass = false;
        // 遍历堆栈信息，获取出最原始被调用的方法信息
        for (StackTraceElement s : callStack) {
            // 遍历到日志类
            if (logClassName.equals(s.getClassName())) {
                isEachLogClass = true;
            }
            // 下一个非日志类的堆栈，就是最原始被调用的方法
            if (isEachLogClass) {
                if (!logClassName.equals(s.getClassName())) {
                    isEachLogClass = false;
                    caller = s;
                    break;
                }
            }
        }
        return caller;
    }
}
