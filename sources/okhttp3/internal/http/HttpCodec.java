package okhttp3.internal.http;

import java.io.IOException;
import okhttp3.C15963q;
import okhttp3.C15966s;
import okhttp3.C15966s.C15965a;
import okhttp3.C15968t;
import okio.Sink;

public interface HttpCodec {
    void cancel();

    Sink createRequestBody(C15963q c15963q, long j);

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    C15968t openResponseBody(C15966s c15966s) throws IOException;

    C15965a readResponseHeaders(boolean z) throws IOException;

    void writeRequestHeaders(C15963q c15963q) throws IOException;
}
