package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.C2302k;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.i */
final class C2102i {
    /* renamed from: a */
    public C2093c f5938a;
    /* renamed from: b */
    public long f5939b;
    /* renamed from: c */
    public long f5940c;
    /* renamed from: d */
    public long f5941d;
    /* renamed from: e */
    public int f5942e;
    /* renamed from: f */
    public int f5943f;
    /* renamed from: g */
    public long[] f5944g;
    /* renamed from: h */
    public int[] f5945h;
    /* renamed from: i */
    public int[] f5946i;
    /* renamed from: j */
    public int[] f5947j;
    /* renamed from: k */
    public long[] f5948k;
    /* renamed from: l */
    public boolean[] f5949l;
    /* renamed from: m */
    public boolean f5950m;
    /* renamed from: n */
    public boolean[] f5951n;
    /* renamed from: o */
    public C2101h f5952o;
    /* renamed from: p */
    public int f5953p;
    /* renamed from: q */
    public C2302k f5954q;
    /* renamed from: r */
    public boolean f5955r;
    /* renamed from: s */
    public long f5956s;

    C2102i() {
    }

    /* renamed from: a */
    public void m7525a() {
        this.f5942e = 0;
        this.f5956s = 0;
        this.f5950m = false;
        this.f5955r = false;
        this.f5952o = null;
    }

    /* renamed from: a */
    public void m7527a(int i, int i2) {
        this.f5942e = i;
        this.f5943f = i2;
        if (this.f5945h == null || this.f5945h.length < i) {
            this.f5944g = new long[i];
            this.f5945h = new int[i];
        }
        if (this.f5946i == 0 || this.f5946i.length < i2) {
            i2 = (i2 * 125) / 100;
            this.f5946i = new int[i2];
            this.f5947j = new int[i2];
            this.f5948k = new long[i2];
            this.f5949l = new boolean[i2];
            this.f5951n = new boolean[i2];
        }
    }

    /* renamed from: a */
    public void m7526a(int i) {
        if (this.f5954q == null || this.f5954q.m8387c() < i) {
            this.f5954q = new C2302k(i);
        }
        this.f5953p = i;
        this.f5950m = true;
        this.f5955r = true;
    }

    /* renamed from: a */
    public void m7528a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        extractorInput.readFully(this.f5954q.f6929a, 0, this.f5953p);
        this.f5954q.m8388c(0);
        this.f5955r = false;
    }

    /* renamed from: a */
    public void m7529a(C2302k c2302k) {
        c2302k.m8384a(this.f5954q.f6929a, 0, this.f5953p);
        this.f5954q.m8388c(0);
        this.f5955r = false;
    }

    /* renamed from: b */
    public long m7530b(int i) {
        return this.f5948k[i] + ((long) this.f5947j[i]);
    }
}
