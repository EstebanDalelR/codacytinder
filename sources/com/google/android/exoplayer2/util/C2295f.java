package com.google.android.exoplayer2.util;

/* renamed from: com.google.android.exoplayer2.util.f */
public final class C2295f {
    /* renamed from: a */
    public final int f6898a;
    /* renamed from: b */
    public final int f6899b;
    /* renamed from: c */
    public final int f6900c;
    /* renamed from: d */
    public final int f6901d;
    /* renamed from: e */
    public final int f6902e;
    /* renamed from: f */
    public final int f6903f;
    /* renamed from: g */
    public final int f6904g;
    /* renamed from: h */
    public final long f6905h;

    public C2295f(byte[] bArr, int i) {
        C2301j c2301j = new C2301j(bArr);
        c2301j.m8364a(i * 8);
        this.f6898a = c2301j.m8373c(16);
        this.f6899b = c2301j.m8373c(16);
        this.f6900c = c2301j.m8373c(24);
        this.f6901d = c2301j.m8373c(24);
        this.f6902e = c2301j.m8373c(20);
        this.f6903f = c2301j.m8373c(3) + 1;
        this.f6904g = c2301j.m8373c(5) + 1;
        this.f6905h = ((((long) c2301j.m8373c(4)) & 15) << 32) | (((long) c2301j.m8373c(32)) & 4294967295L);
    }

    /* renamed from: a */
    public int m8335a() {
        return this.f6904g * this.f6902e;
    }

    /* renamed from: b */
    public long m8336b() {
        return (this.f6905h * 1000000) / ((long) this.f6902e);
    }
}
