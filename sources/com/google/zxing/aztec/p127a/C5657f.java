package com.google.zxing.aztec.p127a;

import com.google.zxing.common.C5664a;
import java.util.Deque;
import java.util.LinkedList;

/* renamed from: com.google.zxing.aztec.a.f */
final class C5657f {
    /* renamed from: a */
    static final C5657f f20952a = new C5657f(C5658g.f20957a, 0, 0, 0);
    /* renamed from: b */
    private final int f20953b;
    /* renamed from: c */
    private final C5658g f20954c;
    /* renamed from: d */
    private final int f20955d;
    /* renamed from: e */
    private final int f20956e;

    private C5657f(C5658g c5658g, int i, int i2, int i3) {
        this.f20954c = c5658g;
        this.f20953b = i;
        this.f20955d = i2;
        this.f20956e = i3;
    }

    /* renamed from: a */
    int m24710a() {
        return this.f20953b;
    }

    /* renamed from: b */
    int m24715b() {
        return this.f20955d;
    }

    /* renamed from: c */
    int m24718c() {
        return this.f20956e;
    }

    /* renamed from: a */
    C5657f m24712a(int i, int i2) {
        int i3;
        int i4 = this.f20956e;
        C5658g c5658g = this.f20954c;
        if (i != this.f20953b) {
            i3 = C5656d.f20948b[this.f20953b][i];
            int i5 = 65535 & i3;
            i3 >>= 16;
            c5658g = c5658g.m24720a(i5, i3);
            i4 += i3;
        }
        i3 = i == 2 ? 4 : 5;
        return new C5657f(c5658g.m24720a(i2, i3), i, 0, i4 + i3);
    }

    /* renamed from: b */
    C5657f m24717b(int i, int i2) {
        C5658g c5658g = this.f20954c;
        int i3 = this.f20953b == 2 ? 4 : 5;
        return new C5657f(c5658g.m24720a(C5656d.f20949c[this.f20953b][i], i3).m24720a(i2, 5), this.f20953b, 0, (this.f20956e + i3) + 5);
    }

    /* renamed from: a */
    C5657f m24711a(int i) {
        int i2;
        C5657f c5657f;
        C5658g c5658g = this.f20954c;
        int i3 = this.f20953b;
        int i4 = this.f20956e;
        if (this.f20953b == 4 || this.f20953b == 2) {
            i3 = C5656d.f20948b[i3][0];
            i2 = 65535 & i3;
            i3 >>= 16;
            c5658g = c5658g.m24720a(i2, i3);
            i4 += i3;
            i3 = 0;
        }
        if (this.f20955d != 0) {
            if (this.f20955d != 31) {
                i2 = this.f20955d == 62 ? 9 : 8;
                c5657f = new C5657f(c5658g, i3, this.f20955d + 1, i4 + i2);
                return c5657f.f20955d != 2078 ? c5657f.m24716b(i + 1) : c5657f;
            }
        }
        i2 = 18;
        c5657f = new C5657f(c5658g, i3, this.f20955d + 1, i4 + i2);
        if (c5657f.f20955d != 2078) {
        }
    }

    /* renamed from: b */
    C5657f m24716b(int i) {
        if (this.f20955d == 0) {
            return this;
        }
        return new C5657f(this.f20954c.m24722b(i - this.f20955d, this.f20955d), this.f20953b, 0, this.f20956e);
    }

    /* renamed from: a */
    boolean m24714a(C5657f c5657f) {
        int i = this.f20956e + (C5656d.f20948b[this.f20953b][c5657f.f20953b] >> 16);
        if (c5657f.f20955d > 0 && (this.f20955d == 0 || this.f20955d > c5657f.f20955d)) {
            i += 10;
        }
        return i <= c5657f.f20956e ? true : null;
    }

    /* renamed from: a */
    C5664a m24713a(byte[] bArr) {
        Deque<C5658g> linkedList = new LinkedList();
        for (C5658g c5658g = m24716b(bArr.length).f20954c; c5658g != null; c5658g = c5658g.m24719a()) {
            linkedList.addFirst(c5658g);
        }
        C5664a c5664a = new C5664a();
        for (C5658g a : linkedList) {
            a.mo6174a(c5664a, bArr);
        }
        return c5664a;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C5656d.f20947a[this.f20953b], Integer.valueOf(this.f20956e), Integer.valueOf(this.f20955d)});
    }
}
