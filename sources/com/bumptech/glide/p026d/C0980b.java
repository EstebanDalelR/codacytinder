package com.bumptech.glide.p026d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.d.b */
public final class C0980b extends FilterInputStream {
    /* renamed from: a */
    private final long f2667a;
    /* renamed from: b */
    private int f2668b;

    /* renamed from: a */
    public static InputStream m3387a(InputStream inputStream, long j) {
        return new C0980b(inputStream, j);
    }

    C0980b(InputStream inputStream, long j) {
        super(inputStream);
        this.f2667a = j;
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f2667a - ((long) this.f2668b), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        return m3386a(super.read());
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return m3386a(super.read(bArr, i, i2));
    }

    /* renamed from: a */
    private int m3386a(int i) throws IOException {
        if (i >= 0) {
            this.f2668b += i;
        } else if (this.f2667a - ((long) this.f2668b) > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to read all expected data, expected: ");
            stringBuilder.append(this.f2667a);
            stringBuilder.append(", but read: ");
            stringBuilder.append(this.f2668b);
            throw new IOException(stringBuilder.toString());
        }
        return i;
    }
}
