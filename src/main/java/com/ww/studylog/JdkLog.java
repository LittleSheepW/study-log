package com.ww.studylog;

import java.util.logging.Logger;

/**
 * JDKLog 日志小刀
 * JDK官方提供的一个记录日志的方式，直接在JDK中就可以使用。
 *
 * JDKLog 的优点是使用非常简单，直接在 JDK 中就可以使用。
 * 但 JDKLog 功能比较太过于简单，不支持占位符显示，拓展性比较差。
 *
 * @author: Sun
 * @create: 2019-10-30 13:46
 * @version: v1.0
 */
public class JdkLog {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("JDKLog");
        logger.info("Hello World.");
    }
}
