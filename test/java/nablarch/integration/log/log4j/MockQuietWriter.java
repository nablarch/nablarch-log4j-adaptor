package nablarch.integration.log.log4j;

import java.io.Writer;

import org.apache.log4j.helpers.QuietWriter;
import org.apache.log4j.spi.ErrorHandler;

public class MockQuietWriter extends QuietWriter {
    
    private static StringBuilder sb = new StringBuilder(1024);
    
    public MockQuietWriter(Writer writer, ErrorHandler errorHandler) {
        super(writer, errorHandler);
    }

    public void write(String msg) {
        super.write(msg);
        sb.append(msg);
    }
    
    public static void clearLog() {
        sb = new StringBuilder(1024);
    }
    public static String getLog() {
        return sb.toString();
    }
}
