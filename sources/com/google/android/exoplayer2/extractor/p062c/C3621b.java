package com.google.android.exoplayer2.extractor.p062c;

import com.google.android.exoplayer2.extractor.C2076i;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.C2054a;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.extractor.c.b */
final class C3621b implements SeekMap {
    /* renamed from: a */
    private final int f10951a;
    /* renamed from: b */
    private final int f10952b;
    /* renamed from: c */
    private final int f10953c;
    /* renamed from: d */
    private final int f10954d;
    /* renamed from: e */
    private final int f10955e;
    /* renamed from: f */
    private final int f10956f;
    /* renamed from: g */
    private long f10957g;
    /* renamed from: h */
    private long f10958h;

    public boolean isSeekable() {
        return true;
    }

    public C3621b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f10951a = i;
        this.f10952b = i2;
        this.f10953c = i3;
        this.f10954d = i4;
        this.f10955e = i5;
        this.f10956f = i6;
    }

    /* renamed from: a */
    public void m13631a(long j, long j2) {
        this.f10957g = j;
        this.f10958h = j2;
    }

    /* renamed from: a */
    public boolean m13632a() {
        return (this.f10957g == 0 || this.f10958h == 0) ? false : true;
    }

    public long getDurationUs() {
        return ((this.f10958h / ((long) this.f10954d)) * 1000000) / ((long) this.f10952b);
    }

    public C2054a getSeekPoints(long j) {
        long a = C2314v.m8462a((((((long) this.f10953c) * j) / 1000000) / ((long) this.f10954d)) * ((long) this.f10954d), 0, this.f10958h - ((long) this.f10954d));
        long j2 = this.f10957g + a;
        long a2 = m13630a(j2);
        C2076i c2076i = new C2076i(a2, j2);
        if (a2 < j) {
            if (a != this.f10958h - ((long) this.f10954d)) {
                a = j2 + ((long) this.f10954d);
                return new C2054a(c2076i, new C2076i(m13630a(a), a));
            }
        }
        return new C2054a(c2076i);
    }

    /* renamed from: a */
    public long m13630a(long j) {
        return (Math.max(0, j - this.f10957g) * 1000000) / ((long) this.f10953c);
    }

    /* renamed from: b */
    public int m13633b() {
        return this.f10954d;
    }

    /* renamed from: c */
    public int m13634c() {
        return (this.f10952b * this.f10955e) * this.f10951a;
    }

    /* renamed from: d */
    public int m13635d() {
        return this.f10952b;
    }

    /* renamed from: e */
    public int m13636e() {
        return this.f10951a;
    }

    /* renamed from: f */
    public int m13637f() {
        return this.f10956f;
    }
}
