package nablarch.integration.log;

import nablarch.core.log.Logger;

public class MockLogger implements Logger {

    private String name;
    
    MockLogger(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void logDebug(String message, Object... options) {
        // TODO Auto-generated method stub

    }

    public void logDebug(String message, Throwable error, Object... options) {
        // TODO Auto-generated method stub

    }

    public void logError(String message, Object... options) {
        // TODO Auto-generated method stub

    }

    public void logError(String message, Throwable error, Object... options) {
        // TODO Auto-generated method stub

    }

    public void logFatal(String message, Object... options) {
        // TODO Auto-generated method stub

    }

    public void logFatal(String message, Throwable error, Object... options) {
        // TODO Auto-generated method stub

    }

    public void logInfo(String message, Object... options) {
        // TODO Auto-generated method stub

    }

    public void logInfo(String message, Throwable error, Object... options) {
        // TODO Auto-generated method stub

    }

    public boolean isDebugEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isErrorEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isFatalEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isInfoEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isTraceEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isWarnEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    public void logTrace(String message, Object... options) {
        // TODO Auto-generated method stub

    }

    public void logTrace(String message, Throwable error, Object... options) {
        // TODO Auto-generated method stub

    }

    public void logWarn(String message, Object... options) {
        // TODO Auto-generated method stub

    }

    public void logWarn(String message, Throwable error, Object... options) {
        // TODO Auto-generated method stub

    }

}
