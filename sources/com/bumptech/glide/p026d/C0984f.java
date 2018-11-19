package com.bumptech.glide.p026d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.d.f */
public class C0984f extends FilterInputStream {
    /* renamed from: a */
    private int f2677a = Integer.MIN_VALUE;

    public C0984f(InputStream inputStream) {
        super(inputStream);
    }

    public void mark(int i) {
        super.mark(i);
        this.f2677a = i;
    }

    public int read() throws IOException {
        if (m3401a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m3402b(1);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        i2 = (int) m3401a((long) i2);
        if (i2 == -1) {
            return -1;
        }
        bArr = super.read(bArr, i, i2);
        m3402b((long) bArr);
        return bArr;
    }

    public void reset() throws IOException {
        super.reset();
        this.f2677a = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        j = m3401a(j);
        if (j == -1) {
            return -1;
        }
        j = super.skip(j);
        m3402b(j);
        return j;
    }

    public int available() throws IOException {
        return this.f2677a == Integer.MIN_VALUE ? super.available() : Math.min(this.f2677a, super.available());
    }

    /* renamed from: a */
    private long m3401a(long j) {
        if (this.f2677a == 0) {
            return -1;
        }
        return (this.f2677a == Integer.MIN_VALUE || j <= ((long) this.f2677a)) ? j : (long) this.f2677a;
    }

    /* renamed from: b */
    private void m3402b(long j) {
        if (this.f2677a != Integer.MIN_VALUE && j != -1) {
            this.f2677a = (int) (((long) this.f2677a) - j);
        }
    }
}
