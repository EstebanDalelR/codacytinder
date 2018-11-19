package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public interface Downloader {

    public static class ResponseException extends IOException {
        /* renamed from: a */
        final boolean f22295a;
        /* renamed from: b */
        final int f22296b;

        public ResponseException(String str, int i, int i2) {
            super(str);
            this.f22295a = NetworkPolicy.isOfflineOnly(i);
            this.f22296b = i2;
        }
    }

    /* renamed from: com.squareup.picasso.Downloader$a */
    public static class C6078a {
        /* renamed from: a */
        final InputStream f22297a;
        /* renamed from: b */
        final Bitmap f22298b;
        /* renamed from: c */
        final boolean f22299c;
        /* renamed from: d */
        final long f22300d;

        public C6078a(InputStream inputStream, boolean z, long j) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Stream may not be null.");
            }
            this.f22297a = inputStream;
            this.f22298b = null;
            this.f22299c = z;
            this.f22300d = j;
        }

        /* renamed from: a */
        public InputStream m26418a() {
            return this.f22297a;
        }

        @Deprecated
        /* renamed from: b */
        public Bitmap m26419b() {
            return this.f22298b;
        }

        /* renamed from: c */
        public long m26420c() {
            return this.f22300d;
        }
    }

    C6078a load(Uri uri, int i) throws IOException;

    void shutdown();
}
