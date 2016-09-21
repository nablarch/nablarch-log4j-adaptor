package nablarch.integration.log.log4j;

import org.junit.Test;

import nablarch.core.log.Logger;
import nablarch.core.log.LoggerFactory;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * {@link Log4JLoggerFactory}のテスト。
 * @author Kiyohito Itoh
 */
public class Log4JLoggerFactoryTest {
    
    /**
     * カテゴリを指定してロガーを取得できること。
     */
    @Test
    public void testGettingByCategory() {
        
        LoggerFactory factory = new Log4JLoggerFactory();
        
        factory.initialize(null);
        
        Logger appLogger = factory.get("app");
        assertNotNull(appLogger);
        assertThat(appLogger.getClass().getName(), is(Log4JLogger.class.getName()));
        assertTrue(appLogger.isWarnEnabled());
        assertTrue(appLogger.isInfoEnabled());
        assertFalse(appLogger.isDebugEnabled());
        
        Logger rootLogger = factory.get(Log4JLoggerFactoryTest.class.getName());
        assertNotNull(rootLogger);
        assertThat(rootLogger.getClass().getName(), is(Log4JLogger.class.getName()));
        assertTrue(rootLogger.isWarnEnabled());
        assertFalse(rootLogger.isInfoEnabled());
        assertFalse(rootLogger.isDebugEnabled());
        
        factory.terminate();
    }
}
