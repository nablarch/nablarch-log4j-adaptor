package nablarch.integration.log;

import nablarch.core.log.LogSettings;
import nablarch.core.log.Logger;
import nablarch.core.log.LoggerFactory;

public class MockLoggerFactory implements LoggerFactory {

    private static int count = 0;
    
    public static void resetCount() {
        count = 0;
    }
    
    public static int getCount() {
        return count;
    }
    
    public MockLoggerFactory() {
        count++;
    }
    
    public Logger get(String name) {
        return new MockLogger(name);
    }

    public void initialize(LogSettings settings) {
        // TODO Auto-generated method stub

    }

    public void terminate() {
        // TODO Auto-generated method stub

    }

}
