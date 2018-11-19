package com.google.android.m4b.maps.ap;

import java.io.InputStream;

/* renamed from: com.google.android.m4b.maps.ap.b */
public final class C4654b extends InputStream {
    /* renamed from: a */
    private int f17082a;
    /* renamed from: b */
    private byte[] f17083b;
    /* renamed from: c */
    private int f17084c;
    /* renamed from: d */
    private int f17085d;
    /* renamed from: e */
    private InputStream f17086e;

    public C4654b(InputStream inputStream, int i) {
        this.f17086e = inputStream;
        this.f17082a = i;
        this.f17083b = new byte[Math.min(i, 4096)];
    }

    /* renamed from: a */
    private boolean m20767a() {
        if (this.f17082a <= 0) {
            return false;
        }
        if (this.f17084c >= this.f17085d) {
            this.f17085d = this.f17086e.read(this.f17083b, 0, Math.min(this.f17082a, this.f17083b.length));
            if (this.f17085d <= 0) {
                this.f17082a = 0;
                return false;
            }
            this.f17084c = 0;
        }
        return true;
    }

    public final int available() {
        return this.f17085d - this.f17084c;
    }

    public final int read() {
        if (!m20767a()) {
            return -1;
        }
        this.f17082a--;
        byte[] bArr = this.f17083b;
        int i = this.f17084c;
        this.f17084c = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!m20767a()) {
            return -1;
        }
        i2 = Math.min(i2, this.f17085d - this.f17084c);
        System.arraycopy(this.f17083b, this.f17084c, bArr, i, i2);
        this.f17084c += i2;
        this.f17082a -= i2;
        return i2;
    }
}
