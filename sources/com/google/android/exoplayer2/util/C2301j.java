package com.google.android.exoplayer2.util;

import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.exoplayer2.util.j */
public final class C2301j {
    /* renamed from: a */
    public byte[] f6925a;
    /* renamed from: b */
    private int f6926b;
    /* renamed from: c */
    private int f6927c;
    /* renamed from: d */
    private int f6928d;

    public C2301j(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C2301j(byte[] bArr, int i) {
        this.f6925a = bArr;
        this.f6928d = i;
    }

    /* renamed from: a */
    public void m8366a(byte[] bArr) {
        m8367a(bArr, bArr.length);
    }

    /* renamed from: a */
    public void m8367a(byte[] bArr, int i) {
        this.f6925a = bArr;
        this.f6926b = 0;
        this.f6927c = 0;
        this.f6928d = i;
    }

    /* renamed from: a */
    public int m8363a() {
        return ((this.f6928d - this.f6926b) * 8) - this.f6927c;
    }

    /* renamed from: b */
    public int m8369b() {
        return (this.f6926b * 8) + this.f6927c;
    }

    /* renamed from: c */
    public int m8372c() {
        C2289a.m8313b(this.f6927c == 0);
        return this.f6926b;
    }

    /* renamed from: a */
    public void m8364a(int i) {
        this.f6926b = i / 8;
        this.f6927c = i - (this.f6926b * 8);
        m8362g();
    }

    /* renamed from: d */
    public void m8374d() {
        int i = this.f6927c + 1;
        this.f6927c = i;
        if (i == 8) {
            this.f6927c = 0;
            this.f6926b++;
        }
        m8362g();
    }

    /* renamed from: b */
    public void m8370b(int i) {
        int i2 = i / 8;
        this.f6926b += i2;
        this.f6927c += i - (i2 * 8);
        if (this.f6927c > 7) {
            this.f6926b++;
            this.f6927c -= 8;
        }
        m8362g();
    }

    /* renamed from: e */
    public boolean m8376e() {
        boolean z = (this.f6925a[this.f6926b] & (ProfileEditingConfig.DEFAULT_MAX_LENGTH >> this.f6927c)) != 0;
        m8374d();
        return z;
    }

    /* renamed from: c */
    public int m8373c(int i) {
        if (i == 0) {
            return 0;
        }
        this.f6927c += i;
        int i2 = 0;
        while (this.f6927c > 8) {
            this.f6927c -= 8;
            byte[] bArr = this.f6925a;
            int i3 = this.f6926b;
            this.f6926b = i3 + 1;
            i2 |= (bArr[i3] & 255) << this.f6927c;
        }
        i = (-1 >>> (32 - i)) & (i2 | ((this.f6925a[this.f6926b] & 255) >> (8 - this.f6927c)));
        if (this.f6927c == 8) {
            this.f6927c = 0;
            this.f6926b++;
        }
        m8362g();
        return i;
    }

    /* renamed from: a */
    public void m8368a(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f6925a;
            int i4 = this.f6926b;
            this.f6926b = i4 + 1;
            bArr[i] = (byte) (bArr2[i4] << this.f6927c);
            bArr[i] = (byte) (((255 & this.f6925a[this.f6926b]) >> (8 - this.f6927c)) | bArr[i]);
            i++;
        }
        i = i2 & 7;
        if (i != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i));
            if (this.f6927c + i > 8) {
                i2 = bArr[i3];
                bArr2 = this.f6925a;
                i4 = this.f6926b;
                this.f6926b = i4 + 1;
                bArr[i3] = (byte) (i2 | ((byte) ((bArr2[i4] & 255) << this.f6927c)));
                this.f6927c -= 8;
            }
            this.f6927c += i;
            bArr[i3] = (byte) (((byte) (((this.f6925a[this.f6926b] & 255) >> (8 - this.f6927c)) << (8 - i))) | bArr[i3]);
            if (this.f6927c == 8) {
                this.f6927c = null;
                this.f6926b++;
            }
            m8362g();
        }
    }

    /* renamed from: f */
    public void m8377f() {
        if (this.f6927c != 0) {
            this.f6927c = 0;
            this.f6926b++;
            m8362g();
        }
    }

    /* renamed from: b */
    public void m8371b(byte[] bArr, int i, int i2) {
        C2289a.m8313b(this.f6927c == 0);
        System.arraycopy(this.f6925a, this.f6926b, bArr, i, i2);
        this.f6926b += i2;
        m8362g();
    }

    /* renamed from: d */
    public void m8375d(int i) {
        C2289a.m8313b(this.f6927c == 0);
        this.f6926b += i;
        m8362g();
    }

    /* renamed from: a */
    public void m8365a(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f6927c, i2);
        int i3 = (8 - this.f6927c) - min;
        int i4 = (65280 >> this.f6927c) | ((1 << i3) - 1);
        byte[] bArr = this.f6925a;
        int i5 = this.f6926b;
        bArr[i5] = (byte) (i4 & bArr[i5]);
        min = i2 - min;
        i4 = i >>> min;
        bArr = this.f6925a;
        i5 = this.f6926b;
        bArr[i5] = (byte) ((i4 << i3) | bArr[i5]);
        i3 = this.f6926b + 1;
        while (min > 8) {
            int i6 = i3 + 1;
            this.f6925a[i3] = (byte) (i >>> (min - 8));
            min -= 8;
            i3 = i6;
        }
        int i7 = 8 - min;
        byte[] bArr2 = this.f6925a;
        bArr2[i3] = (byte) (bArr2[i3] & ((1 << i7) - 1));
        i &= (1 << min) - 1;
        byte[] bArr3 = this.f6925a;
        bArr3[i3] = (byte) ((i << i7) | bArr3[i3]);
        m8370b(i2);
        m8362g();
    }

    /* renamed from: g */
    private void m8362g() {
        boolean z = this.f6926b >= 0 && (this.f6926b < this.f6928d || (this.f6926b == this.f6928d && this.f6927c == 0));
        C2289a.m8313b(z);
    }
}
