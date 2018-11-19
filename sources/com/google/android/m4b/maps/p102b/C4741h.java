package com.google.android.m4b.maps.p102b;

import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.m4b.maps.b.h */
public final class C4741h extends ByteArrayOutputStream {
    /* renamed from: a */
    private final C4735b f17386a;

    public C4741h(C4735b c4735b, int i) {
        this.f17386a = c4735b;
        this.buf = this.f17386a.m21074a(Math.max(i, 256));
    }

    public final void close() {
        this.f17386a.m21073a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f17386a.m21073a(this.buf);
    }

    /* renamed from: a */
    private void m21083a(int i) {
        if (this.count + i > this.buf.length) {
            i = this.f17386a.m21074a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, i, 0, this.count);
            this.f17386a.m21073a(this.buf);
            this.buf = i;
        }
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m21083a(i2);
        super.write(bArr, i, i2);
    }

    public final synchronized void write(int i) {
        m21083a(1);
        super.write(i);
    }
}
