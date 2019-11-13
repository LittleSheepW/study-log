package com.ww.studylog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Log4j 日志大炮
 * Log4j 是 Apache 的一个日志开源框架，有多个分级（DEBUG/INFO/WARN/ERROR）记录级别，
 * 可以很好地将不同日志级别的日志分开记录，极大地方便了日志的查看。
 * <p>
 * 优点：多个分级（DEBUG/INFO/WARN/ERROR）记录级别，所以可以很好地记录不同业务问题。
 * 缺点：不支持使用占位符，不利于代码阅读等缺点。但是相比起 JDKLog，Log4J 可以说是非常好的日志记录框架了。
 * <p>
 *
 * 配套依赖：
 * <dependency>
 *     <groupId>org.apache.logging.log4j</groupId>
 *     <artifactId>log4j-api</artifactId>
 *     <version>2.6.2</version>
 * </dependency>
 * <dependency>
 *     <groupId>org.apache.logging.log4j</groupId>
 *     <artifactId>log4j-core</artifactId>
 *     <version>2.6.2</version>
 * </dependency>
 *
 * 配套资源文件：log4j2.xml
 *
 * @author: Sun
 * @create: 2019-10-30 13:52
 * @version: v1.0
 */
public class Log4j2Log {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Log4j2Log.class);

        logger.debug("Debug Level");
        logger.info("Info Level");
        logger.warn("Warn Level");
        logger.error("Error Level");
    }
}
