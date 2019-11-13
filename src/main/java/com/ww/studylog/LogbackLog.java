package com.ww.studylog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logback 其实可以说是 Log4J 的进化版，因为它们两个都是同一个人（Ceki Gülcü）设计的开源日志组件。
 * LogBack 解决了 Log4J 不能使用占位符的问题，这使得阅读日志代码非常方便。除此之外，LogBack 比 Log4J 有更快的运行速度，
 * 更好的内部实现。并且 LogBack 内部集成了 SLF4J 可以更原生地实现一些日志记录的实现。
 *
 * 配套依赖：
 * <dependency>
 *   <groupId>ch.qos.logback</groupId>
 *   <artifactId>logback-classic</artifactId>
 *   <version>1.1.7</version>
 * </dependency>
 *
 * 配套资源文件：logback.xml
 *
 * @author: Sun
 * @create: 2019-10-30 14:02
 * @version: v1.0
 */
public class LogbackLog {
    static final Logger logger = LoggerFactory.getLogger(LogbackLog.class);

    public static void main(String[] args) {
        logger.trace("Trace Level.");
        logger.debug("Debug Level.");
        logger.info("Info Level.");
        logger.warn("Warn Level.");
        logger.error("Error Level.");
    }
}
