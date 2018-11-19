package com.squareup.okhttp.internal.framed;

import java.io.IOException;

public interface IncomingStreamHandler {
    /* renamed from: a */
    public static final IncomingStreamHandler f22046a = new C72121();

    /* renamed from: com.squareup.okhttp.internal.framed.IncomingStreamHandler$1 */
    static class C72121 implements IncomingStreamHandler {
        C72121() {
        }

        public void receive(C6027b c6027b) throws IOException {
            c6027b.m26038a(ErrorCode.REFUSED_STREAM);
        }
    }

    void receive(C6027b c6027b) throws IOException;
}
