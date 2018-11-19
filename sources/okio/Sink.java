package okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public interface Sink extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    C15982q timeout();

    void write(C18549c c18549c, long j) throws IOException;
}
