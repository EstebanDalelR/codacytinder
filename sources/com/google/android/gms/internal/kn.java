package com.google.android.gms.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class kn extends FilterInputStream {
    /* renamed from: a */
    private final long f16275a;
    /* renamed from: b */
    private long f16276b;

    kn(InputStream inputStream, long j) {
        super(inputStream);
        this.f16275a = j;
    }

    /* renamed from: a */
    final long m19984a() {
        return this.f16275a - this.f16276b;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f16276b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f16276b += (long) read;
        }
        return read;
    }
}
