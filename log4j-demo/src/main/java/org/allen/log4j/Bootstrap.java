package org.allen.log4j;

import org.apache.log4j.Logger;

public class Bootstrap {

    private static final Logger logger = Logger.getLogger(Bootstrap.class);

    public static void main(String[] args) {
        logger.debug("### debug message");
        logger.info("### info message");
        logger.warn("### warn message");
        logger.error("### error message");
        logger.error("### error message", new RuntimeException("errorMessage"));
    }
}
