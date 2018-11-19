package com.google.android.exoplayer2.util;

import java.nio.charset.Charset;

/* renamed from: com.google.android.exoplayer2.util.k */
public final class C2302k {
    /* renamed from: a */
    public byte[] f6929a;
    /* renamed from: b */
    private int f6930b;
    /* renamed from: c */
    private int f6931c;

    public C2302k(int i) {
        this.f6929a = new byte[i];
        this.f6931c = i;
    }

    public C2302k(byte[] bArr) {
        this.f6929a = bArr;
        this.f6931c = bArr.length;
    }

    public C2302k(byte[] bArr, int i) {
        this.f6929a = bArr;
        this.f6931c = i;
    }

    /* renamed from: a */
    public void m8381a(int i) {
        m8383a(m8391e() < i ? new byte[i] : this.f6929a, i);
    }

    /* renamed from: a */
    public void m8383a(byte[] bArr, int i) {
        this.f6929a = bArr;
        this.f6931c = i;
        this.f6930b = null;
    }

    /* renamed from: a */
    public void m8380a() {
        this.f6930b = 0;
        this.f6931c = 0;
    }

    /* renamed from: b */
    public int m8385b() {
        return this.f6931c - this.f6930b;
    }

    /* renamed from: c */
    public int m8387c() {
        return this.f6931c;
    }

    /* renamed from: b */
    public void m8386b(int i) {
        boolean z = i >= 0 && i <= this.f6929a.length;
        C2289a.m8311a(z);
        this.f6931c = i;
    }

    /* renamed from: d */
    public int m8389d() {
        return this.f6930b;
    }

    /* renamed from: e */
    public int m8391e() {
        return this.f6929a == null ? 0 : this.f6929a.length;
    }

    /* renamed from: c */
    public void m8388c(int i) {
        boolean z = i >= 0 && i <= this.f6931c;
        C2289a.m8311a(z);
        this.f6930b = i;
    }

    /* renamed from: d */
    public void m8390d(int i) {
        m8388c(this.f6930b + i);
    }

    /* renamed from: a */
    public void m8382a(C2301j c2301j, int i) {
        m8384a(c2301j.f6925a, 0, i);
        c2301j.m8364a(0);
    }

    /* renamed from: a */
    public void m8384a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f6929a, this.f6930b, bArr, i, i2);
        this.f6930b += i2;
    }

    /* renamed from: f */
    public char m8393f() {
        return (char) (((this.f6929a[this.f6930b] & 255) << 8) | (this.f6929a[this.f6930b + 1] & 255));
    }

    /* renamed from: g */
    public int m8395g() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public int m8396h() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f6929a;
        int i3 = this.f6930b;
        this.f6930b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: i */
    public int m8397i() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.f6929a;
        int i3 = this.f6930b;
        this.f6930b = i3 + 1;
        return i2 | ((bArr2[i3] & 255) << 8);
    }

    /* renamed from: j */
    public short m8398j() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f6929a;
        int i3 = this.f6930b;
        this.f6930b = i3 + 1;
        return (short) (i2 | (bArr2[i3] & 255));
    }

    /* renamed from: k */
    public int m8399k() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        byte[] bArr2 = this.f6929a;
        int i3 = this.f6930b;
        this.f6930b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 8;
        bArr2 = this.f6929a;
        i3 = this.f6930b;
        this.f6930b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: l */
    public int m8400l() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        byte[] bArr2 = this.f6929a;
        int i3 = this.f6930b;
        this.f6930b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 8;
        bArr2 = this.f6929a;
        i3 = this.f6930b;
        this.f6930b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: m */
    public long m8401m() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        byte[] bArr2 = this.f6929a;
        int i2 = this.f6930b;
        this.f6930b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 16);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        long j3 = j2 | ((((long) bArr[i]) & 255) << 8);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        return j3 | (((long) bArr[i]) & 255);
    }

    /* renamed from: n */
    public long m8402n() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        long j = ((long) bArr[i]) & 255;
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        long j2 = j | ((((long) bArr[i]) & 255) << 8);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        j = j2 | ((((long) bArr[i]) & 255) << 16);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        return j | ((((long) bArr[i]) & 255) << 24);
    }

    /* renamed from: o */
    public int m8403o() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.f6929a;
        int i3 = this.f6930b;
        this.f6930b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 16;
        bArr2 = this.f6929a;
        i3 = this.f6930b;
        this.f6930b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 8;
        bArr2 = this.f6929a;
        i3 = this.f6930b;
        this.f6930b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: p */
    public int m8404p() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        int i2 = bArr[i] & 255;
        byte[] bArr2 = this.f6929a;
        int i3 = this.f6930b;
        this.f6930b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 8;
        bArr2 = this.f6929a;
        i3 = this.f6930b;
        this.f6930b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 16;
        bArr2 = this.f6929a;
        i3 = this.f6930b;
        this.f6930b = i3 + 1;
        return i2 | ((bArr2[i3] & 255) << 24);
    }

    /* renamed from: q */
    public long m8405q() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        byte[] bArr2 = this.f6929a;
        int i2 = this.f6930b;
        this.f6930b = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 48);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        long j3 = j2 | ((((long) bArr[i]) & 255) << 40);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        j2 = j3 | ((((long) bArr[i]) & 255) << 32);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        j3 = j2 | ((((long) bArr[i]) & 255) << 24);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        j2 = j3 | ((((long) bArr[i]) & 255) << 16);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        j3 = j2 | ((((long) bArr[i]) & 255) << 8);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        return j3 | (((long) bArr[i]) & 255);
    }

    /* renamed from: r */
    public long m8406r() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        long j = ((long) bArr[i]) & 255;
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        long j2 = j | ((((long) bArr[i]) & 255) << 8);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        j = j2 | ((((long) bArr[i]) & 255) << 16);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        j2 = j | ((((long) bArr[i]) & 255) << 24);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        j = j2 | ((((long) bArr[i]) & 255) << 32);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        j2 = j | ((((long) bArr[i]) & 255) << 40);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        j = j2 | ((((long) bArr[i]) & 255) << 48);
        bArr = this.f6929a;
        i = this.f6930b;
        this.f6930b = i + 1;
        return j | ((((long) bArr[i]) & 255) << 56);
    }

    /* renamed from: s */
    public int m8407s() {
        byte[] bArr = this.f6929a;
        int i = this.f6930b;
        this.f6930b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f6929a;
        int i3 = this.f6930b;
        this.f6930b = i3 + 1;
        i2 |= bArr2[i3] & 255;
        this.f6930b += 2;
        return i2;
    }

    /* renamed from: t */
    public int m8408t() {
        return (((m8395g() << 21) | (m8395g() << 14)) | (m8395g() << 7)) | m8395g();
    }

    /* renamed from: u */
    public int m8409u() {
        int o = m8403o();
        if (o >= 0) {
            return o;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(o);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: v */
    public int m8410v() {
        int p = m8404p();
        if (p >= 0) {
            return p;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(p);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: w */
    public long m8411w() {
        long q = m8405q();
        if (q >= 0) {
            return q;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(q);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: x */
    public double m8412x() {
        return Double.longBitsToDouble(m8405q());
    }

    /* renamed from: e */
    public String m8392e(int i) {
        return m8379a(i, Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    public String m8379a(int i, Charset charset) {
        String str = new String(this.f6929a, this.f6930b, i, charset);
        this.f6930b += i;
        return str;
    }

    /* renamed from: f */
    public String m8394f(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f6930b + i) - 1;
        i2 = (i2 >= this.f6931c || this.f6929a[i2] != (byte) 0) ? i : i - 1;
        String str = new String(this.f6929a, this.f6930b, i2);
        this.f6930b += i;
        return str;
    }

    /* renamed from: y */
    public String m8413y() {
        if (m8385b() == 0) {
            return null;
        }
        int i = this.f6930b;
        while (i < this.f6931c && this.f6929a[i] != (byte) 0) {
            i++;
        }
        String str = new String(this.f6929a, this.f6930b, i - this.f6930b);
        this.f6930b = i;
        if (this.f6930b < this.f6931c) {
            this.f6930b++;
        }
        return str;
    }

    /* renamed from: z */
    public String m8414z() {
        if (m8385b() == 0) {
            return null;
        }
        int i = this.f6930b;
        while (i < this.f6931c && !C2314v.m8477a(this.f6929a[i])) {
            i++;
        }
        if (i - this.f6930b >= 3 && this.f6929a[this.f6930b] == (byte) -17 && this.f6929a[this.f6930b + 1] == (byte) -69 && this.f6929a[this.f6930b + 2] == (byte) -65) {
            this.f6930b += 3;
        }
        String str = new String(this.f6929a, this.f6930b, i - this.f6930b);
        this.f6930b = i;
        if (this.f6930b == this.f6931c) {
            return str;
        }
        if (this.f6929a[this.f6930b] == (byte) 13) {
            this.f6930b++;
            if (this.f6930b == this.f6931c) {
                return str;
            }
        }
        if (this.f6929a[this.f6930b] == (byte) 10) {
            this.f6930b++;
        }
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: A */
    public long m8378A() {
        /*
        r12 = this;
        r0 = r12.f6929a;
        r1 = r12.f6930b;
        r0 = r0[r1];
        r0 = (long) r0;
        r2 = 7;
        r3 = 7;
    L_0x0009:
        r4 = 6;
        r5 = 1;
        if (r3 < 0) goto L_0x0029;
    L_0x000d:
        r6 = r5 << r3;
        r7 = (long) r6;
        r9 = r0 & r7;
        r7 = 0;
        r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r11 != 0) goto L_0x0026;
    L_0x0018:
        if (r3 >= r4) goto L_0x0021;
    L_0x001a:
        r6 = r6 - r5;
        r6 = (long) r6;
        r8 = r0 & r6;
        r0 = 7 - r3;
        goto L_0x002c;
    L_0x0021:
        if (r3 != r2) goto L_0x0029;
    L_0x0023:
        r8 = r0;
        r0 = 1;
        goto L_0x002c;
    L_0x0026:
        r3 = r3 + -1;
        goto L_0x0009;
    L_0x0029:
        r2 = 0;
        r8 = r0;
        r0 = 0;
    L_0x002c:
        if (r0 != 0) goto L_0x0045;
    L_0x002e:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid UTF-8 sequence first byte: ";
        r1.append(r2);
        r1.append(r8);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0045:
        if (r5 >= r0) goto L_0x0075;
    L_0x0047:
        r1 = r12.f6929a;
        r2 = r12.f6930b;
        r2 = r2 + r5;
        r1 = r1[r2];
        r2 = r1 & 192;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 == r3) goto L_0x006b;
    L_0x0054:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid UTF-8 sequence continuation byte: ";
        r1.append(r2);
        r1.append(r8);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x006b:
        r2 = r8 << r4;
        r1 = r1 & 63;
        r6 = (long) r1;
        r8 = r2 | r6;
        r5 = r5 + 1;
        goto L_0x0045;
    L_0x0075:
        r1 = r12.f6930b;
        r1 = r1 + r0;
        r12.f6930b = r1;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.k.A():long");
    }
}
