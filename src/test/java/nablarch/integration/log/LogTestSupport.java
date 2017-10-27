package nablarch.integration.log;

import java.io.PrintStream;
import java.util.Properties;
import org.junit.After;
import org.junit.Before;

import nablarch.core.log.LoggerManager;

public class LogTestSupport {
    
    /** テスト前の状態を復元するためのシステムプロパティ */
    private Properties systemProps;
    
    /** テスト前の状態を復元するための標準出力 */
    private PrintStream systemOut;
    
    /** テスト前の状態を復元するための標準エラー出力 */
    private PrintStream systemErr;
    
    private ClassLoader defaultCL;
    
    /**
     * テストの準備を行う。
     */
    @Before
    public void setUp() {
        
        defaultCL = Thread.currentThread().getContextClassLoader();
        ClassLoader customCL = new CustomClassLoader(defaultCL);
        Thread.currentThread().setContextClassLoader(customCL);
        
        systemProps = (Properties) System.getProperties().clone();
        systemOut = System.out;
        systemErr = System.err;
    }
    
    /**
     * テストの後片付けを行う。
     */
    @After
    public void tearDown() {
        
        LoggerManager.terminate();
        Thread.currentThread().setContextClassLoader(defaultCL);
        
        System.setProperties(systemProps);
        if (systemOut != System.out) {
            System.out.close();
        }
        System.setOut(systemOut);
        if (systemErr != System.err) {
            System.err.close();
        }
        System.setErr(systemErr);
    }
}
