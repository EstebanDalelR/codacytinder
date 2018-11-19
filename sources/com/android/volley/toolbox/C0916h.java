package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.android.volley.toolbox.h */
public class C0916h extends ByteArrayOutputStream {
    /* renamed from: a */
    private final C0914b f2393a;

    public C0916h(C0914b c0914b, int i) {
        this.f2393a = c0914b;
        this.buf = this.f2393a.m3064a(Math.max(i, 256));
    }

    public void close() throws IOException {
        this.f2393a.m3063a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f2393a.m3063a(this.buf);
    }

    /* renamed from: a */
    private void m3069a(int i) {
        if (this.count + i > this.buf.length) {
            i = this.f2393a.m3064a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, i, 0, this.count);
            this.f2393a.m3063a(this.buf);
            this.buf = i;
        }
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        m3069a(i2);
        super.write(bArr, i, i2);
    }

    public synchronized void write(int i) {
        m3069a(1);
        super.write(i);
    }
}
