package nablarch.integration.log.log4j;

import org.apache.log4j.Level;

import nablarch.core.log.Logger;

/**
 * Log4Jを使用してログ出力を行うクラス。<br>
 * <br>
 * 全てのメソッドで{@link org.apache.log4j.Logger}に処理を委譲する。<br>
 * Log4Jは、ログ出力時にオプション情報を指定できないので、ログを出力するメソッドのoptions引数は、全て無視する。
 * 
 * @author Kiyohito Itoh
 */
public class Log4JLogger implements Logger {
    
    /** Log4Jのロガー */
    private org.apache.log4j.Logger log4jLogger;
    
    /**
     * コンストラクタ。
     * @param log4jLogger Log4Jのロガー
     */
    Log4JLogger(org.apache.log4j.Logger log4jLogger) {
        this.log4jLogger = log4jLogger;
    }
    
    /** {@inheritDoc} */
    public boolean isFatalEnabled() {
        return log4jLogger.isEnabledFor(Level.FATAL);
    }
    
    /** {@inheritDoc} */
    public void logFatal(String message, Object... options) {
        log4jLogger.fatal(message);
    }
    
    /** {@inheritDoc} */
    public void logFatal(String message, Throwable error, Object... options) {
        log4jLogger.fatal(message, error);
    }
    
    /** {@inheritDoc} */
    public boolean isErrorEnabled() {
        return log4jLogger.isEnabledFor(Level.ERROR);
    }
    
    /** {@inheritDoc} */
    public void logError(String message, Object... options) {
        log4jLogger.error(message);
    }
    
    /** {@inheritDoc} */
    public void logError(String message, Throwable error, Object... options) {
        log4jLogger.error(message, error);
    }
    
    /** {@inheritDoc} */
    public boolean isWarnEnabled() {
        return log4jLogger.isEnabledFor(Level.WARN);
    }
    
    /** {@inheritDoc} */
    public void logWarn(String message, Object... options) {
        log4jLogger.warn(message);
    }
    
    /** {@inheritDoc} */
    public void logWarn(String message, Throwable error, Object... options) {
        log4jLogger.warn(message, error);
    }
    
    /** {@inheritDoc} */
    public boolean isInfoEnabled() {
        return log4jLogger.isInfoEnabled();
    }
    
    /** {@inheritDoc} */
    public void logInfo(String message, Object... options) {
        log4jLogger.info(message);
    }
    
    /** {@inheritDoc} */
    public void logInfo(String message, Throwable error, Object... options) {
        log4jLogger.info(message, error);
    }
    
    /** {@inheritDoc} */
    public boolean isDebugEnabled() {
        return log4jLogger.isDebugEnabled();
    }
    
    /** {@inheritDoc} */
    public void logDebug(String message, Object... options) {
        log4jLogger.debug(message);
    }
    
    /** {@inheritDoc} */
    public void logDebug(String message, Throwable error, Object... options) {
        log4jLogger.debug(message, error);
    }
    
    /** {@inheritDoc} */
    public boolean isTraceEnabled() {
        return log4jLogger.isTraceEnabled();
    }
    
    /** {@inheritDoc} */
    public void logTrace(String message, Object... options) {
        log4jLogger.trace(message);
    }
    
    /** {@inheritDoc} */
    public void logTrace(String message, Throwable error, Object... options) {
        log4jLogger.trace(message, error);
    }
}
