package com.google.android.exoplayer2.upstream;

import android.support.annotation.NonNull;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.exoplayer2.upstream.c */
public final class C2279c extends InputStream {
    /* renamed from: a */
    private final DataSource f6845a;
    /* renamed from: b */
    private final DataSpec f6846b;
    /* renamed from: c */
    private final byte[] f6847c;
    /* renamed from: d */
    private boolean f6848d = false;
    /* renamed from: e */
    private boolean f6849e = false;
    /* renamed from: f */
    private long f6850f;

    public C2279c(DataSource dataSource, DataSpec dataSpec) {
        this.f6845a = dataSource;
        this.f6846b = dataSpec;
        this.f6847c = new byte[1];
    }

    /* renamed from: a */
    public long m8248a() {
        return this.f6850f;
    }

    /* renamed from: b */
    public void m8249b() throws IOException {
        m8247c();
    }

    public int read() throws IOException {
        if (read(this.f6847c) == -1) {
            return -1;
        }
        return this.f6847c[0] & 255;
    }

    public int read(@NonNull byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        C2289a.m8313b(this.f6849e ^ 1);
        m8247c();
        bArr = this.f6845a.read(bArr, i, i2);
        if (bArr == -1) {
            return -1;
        }
        this.f6850f += (long) bArr;
        return bArr;
    }

    public void close() throws IOException {
        if (!this.f6849e) {
            this.f6845a.close();
            this.f6849e = true;
        }
    }

    /* renamed from: c */
    private void m8247c() throws IOException {
        if (!this.f6848d) {
            this.f6845a.open(this.f6846b);
            this.f6848d = true;
        }
    }
}
