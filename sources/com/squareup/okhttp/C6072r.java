package com.squareup.okhttp;

import java.io.IOException;
import okio.BufferedSink;
import okio.ByteString;

/* renamed from: com.squareup.okhttp.r */
public abstract class C6072r {
    /* renamed from: a */
    public abstract C6067o mo6564a();

    /* renamed from: a */
    public abstract void mo6565a(BufferedSink bufferedSink) throws IOException;

    /* renamed from: b */
    public long mo6566b() throws IOException {
        return -1;
    }

    /* renamed from: a */
    public static C6072r m26354a(final C6067o c6067o, final ByteString byteString) {
        return new C6072r() {
            /* renamed from: a */
            public C6067o mo6564a() {
                return c6067o;
            }

            /* renamed from: b */
            public long mo6566b() throws IOException {
                return (long) byteString.h();
            }

            /* renamed from: a */
            public void mo6565a(BufferedSink bufferedSink) throws IOException {
                bufferedSink.write(byteString);
            }
        };
    }
}
