package com.ww.studylog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
  @Slf4j 日志适配器(接口)
  当我们需要更换日志组件的时候，我们只需要更换一个具体的日志组件Jar包就可以了。

  @author: Sun
  @create: 2019-10-30 14:12
  @version: v1.0
 */
public class Slf4jLogInterface {

    /**
     SLF4J + JDKLog
     <dependency>
         <groupId>org.slf4j</groupId>
         <artifactId>slf4j-api</artifactId>
         <version>1.7.21</version>
     </dependency>
     <dependency>
         <groupId>org.slf4j</groupId>
         <artifactId>slf4j-jdk14</artifactId>
         <version>1.7.21</version>
     </dependency>-->


     SLF4J + Log4J    配置文件为：log4j.xml
     <dependency>
         <groupId>org.slf4j</groupId>
         <artifactId>slf4j-api</artifactId>
         <version>1.7.21</version>
     </dependency>
     <dependency>
         <groupId>org.slf4j</groupId>
         <artifactId>slf4j-log4j12</artifactId>
         <version>1.7.21</version>
     </dependency>
     <dependency>
         <groupId>log4j</groupId>
         <artifactId>log4j</artifactId>
         <version>1.2.17</version>
     </dependency>

     SLF4J + LogBack   配置文件为：logback.xml
     <dependency>
         <groupId>org.slf4j</groupId>
         <artifactId>slf4j-api</artifactId>
         <version>1.7.21</version>
     </dependency>
     <dependency>
         <groupId>ch.qos.logback</groupId>
         <artifactId>logback-classic</artifactId>
         <version>1.1.7</version>
     </dependency>
     <dependency>
         <groupId>ch.qos.logback</groupId>
         <artifactId>logback-core</artifactId>
         <version>1.1.7</version>
     </dependency>
     */

    final static Logger logger = LoggerFactory.getLogger(Slf4jLogInterface.class);

    public static void main(String[] args) {
        logger.trace("Trace Level.");
        logger.info("Info Level.");
        logger.warn("Warn Level.");
        logger.error("Error Level.");
    }
}
