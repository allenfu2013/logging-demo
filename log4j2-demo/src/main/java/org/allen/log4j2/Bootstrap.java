package org.allen.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by allen on 16/12/26.
 */
public class Bootstrap {

    private static final Logger logger = LogManager.getLogger(Bootstrap.class);

    public static void main(String[] args) {
        logger.debug("debug msg");
        logger.info("info msg");
        logger.warn("warn msg");
        logger.error("error msg", new RuntimeException("error msg"));
    }
}
