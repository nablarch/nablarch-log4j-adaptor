package nablarch.integration.log.log4j;

import java.io.Writer;
import org.apache.log4j.FileAppender;

public class MockFileAppender extends FileAppender {
    protected void setQWForFiles(Writer writer) {
        super.setQWForFiles(writer);
        super.qw = new MockQuietWriter(writer, super.errorHandler);
    }
}
