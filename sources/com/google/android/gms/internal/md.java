package com.google.android.gms.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class md extends ByteArrayOutputStream {
    /* renamed from: a */
    private final gw f16370a;

    public md(gw gwVar, int i) {
        this.f16370a = gwVar;
        this.buf = this.f16370a.m19835a(Math.max(i, 256));
    }

    /* renamed from: a */
    private final void m20051a(int i) {
        if (this.count + i > this.buf.length) {
            Object a = this.f16370a.m19835a((this.count + i) << 1);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f16370a.m19834a(this.buf);
            this.buf = a;
        }
    }

    public final void close() throws IOException {
        this.f16370a.m19834a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f16370a.m19834a(this.buf);
    }

    public final synchronized void write(int i) {
        m20051a(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m20051a(i2);
        super.write(bArr, i, i2);
    }
}
