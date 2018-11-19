package com.mapbox.android.telemetry;

import java.io.IOException;
import okhttp3.C15958m;
import okhttp3.C15963q;
import okhttp3.C15964r;
import okhttp3.C15966s;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okio.BufferedSink;
import okio.C15976k;
import okio.C17706h;

final class GzipRequestInterceptor implements Interceptor {
    GzipRequestInterceptor() {
    }

    public C15966s intercept(Chain chain) throws IOException {
        C15963q request = chain.request();
        if (request.d() != null) {
            if (request.a("Content-Encoding") == null) {
                return chain.proceed(request.e().a("Content-Encoding", "gzip").a(request.b(), gzip(request.d())).d());
            }
        }
        return chain.proceed(request);
    }

    private C15964r gzip(final C15964r c15964r) {
        return new C15964r() {
            public long contentLength() {
                return -1;
            }

            public C15958m contentType() {
                return c15964r.contentType();
            }

            public void writeTo(BufferedSink bufferedSink) throws IOException {
                bufferedSink = C15976k.a(new C17706h(bufferedSink));
                c15964r.writeTo(bufferedSink);
                bufferedSink.close();
            }
        };
    }
}
