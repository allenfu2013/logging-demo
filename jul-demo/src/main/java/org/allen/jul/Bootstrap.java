package org.allen.jul;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * JDK 1.4之后自带的Logging工具
 */
public class Bootstrap {

    private static Logger log = null;

    public static void main(String[] args) {
        Logger log = getLogger();
        log.fine("fine");
        log.finer("finer");
        log.finest("finest");
        log.info("info");
        log.config("config");
        log.warning("warning");
        log.severe("severe");
    }

    public static Logger getLogger() {
        InputStream is = null;
        try {
            if (null == log) {
                is = Bootstrap.class.getClassLoader().getResourceAsStream("logger.properties");
                LogManager.getLogManager().readConfiguration(is);
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != is) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        log = Logger.getLogger("LOGGER");

        return log;
    }
}
