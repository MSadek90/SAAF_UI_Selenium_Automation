package com.ui.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Lightweight logger wrapper for convenient logging across the project.
 */
public class LoggerUtil {

    private final Logger logger;

    private LoggerUtil(Class<?> clazz) {
        this.logger = Logger.getLogger(clazz.getName());
    }

    public static LoggerUtil getLogger(Class<?> clazz) {
        return new LoggerUtil(clazz);
    }

    public void info(String msg) {
        logger.info(msg);
    }

    public void debug(String msg) {
        logger.fine(msg);
    }

    public void warn(String msg) {
        logger.warning(msg);
    }

    public void error(String msg, Throwable t) {
        logger.log(Level.SEVERE, msg, t);
    }

    public void error(String msg) {
        logger.severe(msg);
    }
}
