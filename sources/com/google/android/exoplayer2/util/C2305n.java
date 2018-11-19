package com.google.android.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.exoplayer2.util.n */
public final class C2305n extends BufferedOutputStream {
    /* renamed from: a */
    private boolean f6939a;

    public C2305n(OutputStream outputStream) {
        super(outputStream);
    }

    public C2305n(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public void close() throws IOException {
        Throwable th;
        this.f6939a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th != null) {
            C2314v.m8474a(th);
        }
    }

    /* renamed from: a */
    public void m8429a(OutputStream outputStream) {
        C2289a.m8313b(this.f6939a);
        this.out = outputStream;
        this.count = 0;
        this.f6939a = false;
    }
}
