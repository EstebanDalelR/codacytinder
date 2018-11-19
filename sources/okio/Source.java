package okio;

import java.io.Closeable;
import java.io.IOException;

public interface Source extends Closeable {
    void close() throws IOException;

    long read(C18549c c18549c, long j) throws IOException;

    C15982q timeout();
}
