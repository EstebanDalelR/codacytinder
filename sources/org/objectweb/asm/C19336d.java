package org.objectweb.asm;

import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: org.objectweb.asm.d */
public class C19336d {
    /* renamed from: a */
    byte[] f60312a;
    /* renamed from: b */
    int f60313b;

    public C19336d() {
        this.f60312a = new byte[64];
    }

    public C19336d(int i) {
        this.f60312a = new byte[i];
    }

    /* renamed from: d */
    private void m69351d(int i) {
        int length = this.f60312a.length * 2;
        i += this.f60313b;
        if (length > i) {
            i = length;
        }
        Object obj = new byte[i];
        System.arraycopy(this.f60312a, 0, obj, 0, this.f60313b);
        this.f60312a = obj;
    }

    /* renamed from: a */
    public C19336d m69352a(int i) {
        int i2 = this.f60313b;
        int i3 = i2 + 1;
        if (i3 > this.f60312a.length) {
            m69351d(1);
        }
        this.f60312a[i2] = (byte) i;
        this.f60313b = i3;
        return this;
    }

    /* renamed from: a */
    C19336d m69353a(int i, int i2) {
        int i3 = this.f60313b;
        if (i3 + 2 > this.f60312a.length) {
            m69351d(2);
        }
        byte[] bArr = this.f60312a;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        i = i4 + 1;
        bArr[i4] = (byte) i2;
        this.f60313b = i;
        return this;
    }

    /* renamed from: a */
    public C19336d m69354a(long j) {
        int i = this.f60313b;
        if (i + 8 > this.f60312a.length) {
            m69351d(8);
        }
        byte[] bArr = this.f60312a;
        int i2 = (int) (j >>> 32);
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 24);
        i = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 16);
        i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 8);
        i = i3 + 1;
        bArr[i3] = (byte) i2;
        int i4 = (int) j;
        int i5 = i + 1;
        bArr[i] = (byte) (i4 >>> 24);
        i = i5 + 1;
        bArr[i5] = (byte) (i4 >>> 16);
        i5 = i + 1;
        bArr[i] = (byte) (i4 >>> 8);
        i = i5 + 1;
        bArr[i5] = (byte) i4;
        this.f60313b = i;
        return this;
    }

    /* renamed from: a */
    public C19336d m69355a(String str) {
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException();
        }
        int i = this.f60313b;
        if ((i + 2) + length > this.f60312a.length) {
            m69351d(length + 2);
        }
        byte[] bArr = this.f60312a;
        int i2 = i + 1;
        bArr[i] = (byte) (length >>> 8);
        i = i2 + 1;
        bArr[i2] = (byte) length;
        i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < '\u0001' || charAt > '') {
                this.f60313b = i;
                return m69356a(str, i2, 65535);
            }
            int i3 = i + 1;
            bArr[i] = (byte) charAt;
            i2++;
            i = i3;
        }
        this.f60313b = i;
        return this;
    }

    /* renamed from: a */
    C19336d m69356a(String str, int i, int i2) {
        int length = str.length();
        int i3 = i;
        int i4 = i3;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            i4 = (charAt < '\u0001' || charAt > '') ? charAt > '߿' ? i4 + 3 : i4 + 2 : i4 + 1;
            i3++;
        }
        if (i4 > i2) {
            throw new IllegalArgumentException();
        }
        i2 = (this.f60313b - i) - 2;
        if (i2 >= 0) {
            this.f60312a[i2] = (byte) (i4 >>> 8);
            this.f60312a[i2 + 1] = (byte) i4;
        }
        if ((this.f60313b + i4) - i > this.f60312a.length) {
            m69351d(i4 - i);
        }
        i2 = this.f60313b;
        while (i < length) {
            int i5;
            char charAt2 = str.charAt(i);
            if (charAt2 >= '\u0001' && charAt2 <= '') {
                i5 = i2 + 1;
                this.f60312a[i2] = (byte) charAt2;
            } else if (charAt2 > '߿') {
                i5 = i2 + 1;
                this.f60312a[i2] = (byte) (((charAt2 >> 12) & 15) | 224);
                i4 = i5 + 1;
                this.f60312a[i5] = (byte) (((charAt2 >> 6) & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i5 = i4 + 1;
                this.f60312a[i4] = (byte) ((charAt2 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            } else {
                i5 = i2 + 1;
                this.f60312a[i2] = (byte) (((charAt2 >> 6) & 31) | 192);
                i4 = i5 + 1;
                this.f60312a[i5] = (byte) ((charAt2 & 63) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                i2 = i4;
                i++;
            }
            i2 = i5;
            i++;
        }
        this.f60313b = i2;
        return this;
    }

    /* renamed from: a */
    public C19336d m69357a(byte[] bArr, int i, int i2) {
        if (this.f60313b + i2 > this.f60312a.length) {
            m69351d(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.f60312a, this.f60313b, i2);
        }
        this.f60313b += i2;
        return this;
    }

    /* renamed from: b */
    public C19336d m69358b(int i) {
        int i2 = this.f60313b;
        if (i2 + 2 > this.f60312a.length) {
            m69351d(2);
        }
        byte[] bArr = this.f60312a;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        i2 = i3 + 1;
        bArr[i3] = (byte) i;
        this.f60313b = i2;
        return this;
    }

    /* renamed from: b */
    C19336d m69359b(int i, int i2) {
        int i3 = this.f60313b;
        if (i3 + 3 > this.f60312a.length) {
            m69351d(3);
        }
        byte[] bArr = this.f60312a;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        i = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        i3 = i + 1;
        bArr[i] = (byte) i2;
        this.f60313b = i3;
        return this;
    }

    /* renamed from: c */
    public C19336d m69360c(int i) {
        int i2 = this.f60313b;
        if (i2 + 4 > this.f60312a.length) {
            m69351d(4);
        }
        byte[] bArr = this.f60312a;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        i2 = i3 + 1;
        bArr[i3] = (byte) i;
        this.f60313b = i2;
        return this;
    }
}
