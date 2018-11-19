package com.squareup.okhttp;

import com.squareup.okhttp.internal.C6058i;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okio.BufferedSource;

/* renamed from: com.squareup.okhttp.t */
public abstract class C6076t implements Closeable {
    /* renamed from: a */
    private Reader f22290a;

    /* renamed from: a */
    public abstract C6067o mo6485a();

    /* renamed from: b */
    public abstract long mo6486b() throws IOException;

    /* renamed from: c */
    public abstract BufferedSource mo6487c() throws IOException;

    /* renamed from: d */
    public final InputStream m26412d() throws IOException {
        return mo6487c().inputStream();
    }

    /* renamed from: e */
    public final Reader m26413e() throws IOException {
        Reader reader = this.f22290a;
        if (reader != null) {
            return reader;
        }
        reader = new InputStreamReader(m26412d(), m26408f());
        this.f22290a = reader;
        return reader;
    }

    /* renamed from: f */
    private Charset m26408f() {
        C6067o a = mo6485a();
        return a != null ? a.m26290a(C6058i.f22209c) : C6058i.f22209c;
    }

    public void close() throws IOException {
        mo6487c().close();
    }
}
