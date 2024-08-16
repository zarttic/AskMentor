package org.zartt.cloud.config;

import com.p6spy.engine.spy.appender.StdoutLogger;

/**
 * @author: zartt
 * @description: TODO
 */
public class SQLLogger extends StdoutLogger {
    @Override
    public void logText(String text) {
        System.err.println(text);
    }
}
