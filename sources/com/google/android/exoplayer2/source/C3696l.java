package com.google.android.exoplayer2.source;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.C2165q.C2163a;
import com.google.android.exoplayer2.C2165q.C2164b;
import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.source.l */
public final class C3696l extends C2165q {
    /* renamed from: b */
    private static final Object f11534b = new Object();
    /* renamed from: c */
    private final long f11535c;
    /* renamed from: d */
    private final long f11536d;
    /* renamed from: e */
    private final long f11537e;
    /* renamed from: f */
    private final long f11538f;
    /* renamed from: g */
    private final long f11539g;
    /* renamed from: h */
    private final long f11540h;
    /* renamed from: i */
    private final boolean f11541i;
    /* renamed from: j */
    private final boolean f11542j;
    @Nullable
    /* renamed from: k */
    private final Object f11543k;

    /* renamed from: b */
    public int mo2318b() {
        return 1;
    }

    /* renamed from: c */
    public int mo2319c() {
        return 1;
    }

    public C3696l(long j, boolean z, boolean z2, @Nullable Object obj) {
        this(j, j, 0, 0, z, z2, obj);
    }

    public C3696l(long j, long j2, long j3, long j4, boolean z, boolean z2, @Nullable Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public C3696l(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, @Nullable Object obj) {
        this.f11535c = j;
        this.f11536d = j2;
        this.f11537e = j3;
        this.f11538f = j4;
        this.f11539g = j5;
        this.f11540h = j6;
        this.f11541i = z;
        this.f11542j = z2;
        this.f11543k = obj;
    }

    /* renamed from: a */
    public C2164b mo2317a(int i, C2164b c2164b, boolean z, long j) {
        long j2;
        C3696l c3696l = this;
        C2289a.m8308a(i, 0, 1);
        Object obj = z ? c3696l.f11543k : null;
        long j3 = c3696l.f11540h;
        if (!c3696l.f11542j || j == 0) {
            j2 = j3;
        } else {
            if (c3696l.f11538f != -9223372036854775807L) {
                long j4 = j3 + j;
                if (j4 <= c3696l.f11538f) {
                    j2 = j4;
                }
            }
            j2 = -9223372036854775807L;
        }
        return c2164b.m7787a(obj, c3696l.f11535c, c3696l.f11536d, c3696l.f11541i, c3696l.f11542j, j2, c3696l.f11538f, 0, 0, c3696l.f11539g);
    }

    /* renamed from: a */
    public C2163a mo2316a(int i, C2163a c2163a, boolean z) {
        C2289a.m8308a(i, 0, 1);
        return c2163a.m7774a(null, z ? f11534b : 0, 0, this.f11537e, -this.f11539g);
    }

    /* renamed from: a */
    public int mo2315a(Object obj) {
        return f11534b.equals(obj) != null ? null : -1;
    }
}
