package com.google.android.m4b.maps.ap;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.OutputStream;

/* renamed from: com.google.android.m4b.maps.ap.d */
public final class C4656d extends OutputStream {
    /* renamed from: a */
    private byte[] f17088a;
    /* renamed from: b */
    private int[] f17089b;
    /* renamed from: c */
    private int f17090c;
    /* renamed from: d */
    private int f17091d;
    /* renamed from: e */
    private int f17092e;

    public C4656d() {
        this.f17091d = 0;
        this.f17092e = 0;
        this.f17091d = 0;
        this.f17092e = 0;
        this.f17090c = 0;
        this.f17088a = new byte[16];
        this.f17089b = new int[1];
    }

    /* renamed from: a */
    private static int m20774a(int i, int i2, int i3, int i4) {
        int i5 = i2 - i3;
        while (i5 < i) {
            i5 = i2 >> i4;
            if (i5 <= 0) {
                i3 = new StringBuilder(63);
                i3.append("Incorrect size [");
                i3.append(i2);
                i3.append("] and rightShiftAmount [");
                i3.append(i4);
                i3.append("]");
                throw new IllegalArgumentException(i3.toString());
            }
            i2 += i5;
            i5 = i2 - i3;
        }
        return i2;
    }

    /* renamed from: a */
    public final int m20777a(int i) {
        return this.f17089b[i];
    }

    /* renamed from: a */
    public final int m20776a() {
        return this.f17092e;
    }

    /* renamed from: a */
    public final void m20778a(int i, int i2) {
        this.f17089b[i] = i2;
    }

    /* renamed from: c */
    private void m20775c(int i) {
        int i2 = 1;
        if (this.f17088a.length - i >= this.f17091d) {
            this.f17090c++;
            return;
        }
        if (this.f17090c < 64) {
            i2 = 0;
        } else if (this.f17090c >= ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            i2 = 2;
        }
        i = C4656d.m20774a(i, this.f17088a.length, this.f17091d, i2);
        if (i > this.f17088a.length) {
            i = new byte[i];
            System.arraycopy(this.f17088a, 0, i, 0, this.f17091d);
            this.f17088a = i;
            this.f17090c = 0;
        }
    }

    /* renamed from: b */
    public final int m20780b() {
        return this.f17091d;
    }

    /* renamed from: a */
    public final void m20779a(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.f17088a, i, i2);
    }

    public final void write(int i) {
        m20775c(1);
        byte[] bArr = this.f17088a;
        int i2 = this.f17091d;
        this.f17091d = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    public final void write(byte[] bArr) {
        m20775c(bArr.length);
        System.arraycopy(bArr, 0, this.f17088a, this.f17091d, bArr.length);
        this.f17091d += bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        m20775c(i2);
        System.arraycopy(bArr, i, this.f17088a, this.f17091d, i2);
        this.f17091d += i2;
    }

    /* renamed from: b */
    public final void m20781b(int i) {
        int a = C4656d.m20774a(1, this.f17089b.length, this.f17092e, 0);
        if (a > this.f17089b.length) {
            Object obj = new int[a];
            System.arraycopy(this.f17089b, 0, obj, 0, this.f17092e);
            this.f17089b = obj;
        }
        int[] iArr = this.f17089b;
        int i2 = this.f17092e;
        this.f17092e = i2 + 1;
        iArr[i2] = i;
    }
}
