package nablarch.integration.log.log4j;

import nablarch.core.log.LogSettings;
import nablarch.core.log.Logger;
import nablarch.core.log.LoggerFactory;

/**
 * {@link Log4JLogger}を生成するクラス。
 * 
 * @author Kiyohito Itoh
 */
public class Log4JLoggerFactory implements LoggerFactory {

    /**
     * {@inheritDoc}<br>
     * <br>
     * Log4Jでは、ログ出力の初期処理呼び出しが存在しないので何もしない。
     */
    public void initialize(LogSettings settings) {
    }

    /**
     * {@inheritDoc}<br>
     * <br>
     * Log4Jでは、ログ出力の終了処理呼び出しが存在しないので何もしない。
     */
    public void terminate() {
    }
    
    /**
     * {@inheritDoc}<br>
     * <br>
     * {@link org.apache.log4j.Logger#getLogger(String)}を呼び出し、{@link Log4JLogger}を生成する。
     */
    public Logger get(String name) {
        return new Log4JLogger(org.apache.log4j.Logger.getLogger(name));
    }
}
