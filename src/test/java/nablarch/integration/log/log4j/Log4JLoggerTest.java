package nablarch.integration.log.log4j;

import java.io.File;
import org.junit.Before;

import nablarch.core.log.Logger;
import nablarch.core.log.basic.LogLevel;
import nablarch.integration.log.LogTestUtil;
import nablarch.integration.log.LoggerTestSupport;

/**
 * {@link Log4JLogger}のテスト。
 * @author Kiyohito Itoh
 */
public class Log4JLoggerTest extends LoggerTestSupport {
    
    @Before
    public void setUp() {
        MockQuietWriter.clearLog();
    }
    
    protected File cleanupLog(String filePath) {
        return null;
    }
    
    protected String getLogFilePath(LogLevel level) {
        return null;
    }

    protected Logger createLogger(LogLevel level) {
        return new Log4JLogger(org.apache.log4j.Logger.getLogger(level.name().toLowerCase()));
    }
    
    protected void assertLog(File logFile, LogLevel[] enabled, LogLevel[] disabled) {
        boolean isOptionCheck = false;
        LogTestUtil.assertLog(MockQuietWriter.getLog(), enabled, disabled, isOptionCheck);
    }
}
