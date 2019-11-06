package com.ww.studylog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author: Sun
 * @create: 2019-10-30 13:52
 * @version: v1.0
 */
public class Log4j2 {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Log4jLog.class);
        logger.debug("Debug Level");
        logger.info("Info Level");
        logger.warn("Warn Level");
        logger.error("Error Level");
    }
}
