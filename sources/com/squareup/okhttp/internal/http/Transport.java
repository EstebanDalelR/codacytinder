package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.C6075s;
import com.squareup.okhttp.C6075s.C6074a;
import com.squareup.okhttp.C6076t;
import java.io.IOException;
import okio.Sink;

public interface Transport {
    boolean canReuseConnection();

    Sink createRequestBody(C6071q c6071q, long j) throws IOException;

    void disconnect(C6050g c6050g) throws IOException;

    void finishRequest() throws IOException;

    C6076t openResponseBody(C6075s c6075s) throws IOException;

    C6074a readResponseHeaders() throws IOException;

    void releaseConnectionOnIdle() throws IOException;

    void writeRequestBody(C7245m c7245m) throws IOException;

    void writeRequestHeaders(C6071q c6071q) throws IOException;
}
