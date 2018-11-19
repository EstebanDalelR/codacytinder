package com.google.android.exoplayer2;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource.C2166a;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C2256f;

/* renamed from: com.google.android.exoplayer2.m */
final class C2126m {
    /* renamed from: a */
    public final C2165q f6097a;
    @Nullable
    /* renamed from: b */
    public final Object f6098b;
    /* renamed from: c */
    public final C2166a f6099c;
    /* renamed from: d */
    public final long f6100d;
    /* renamed from: e */
    public final long f6101e;
    /* renamed from: f */
    public final int f6102f;
    /* renamed from: g */
    public final boolean f6103g;
    /* renamed from: h */
    public final TrackGroupArray f6104h;
    /* renamed from: i */
    public final C2256f f6105i;
    /* renamed from: j */
    public volatile long f6106j;
    /* renamed from: k */
    public volatile long f6107k;

    public C2126m(C2165q c2165q, long j, TrackGroupArray trackGroupArray, C2256f c2256f) {
        this(c2165q, null, new C2166a(0), j, -9223372036854775807L, 1, false, trackGroupArray, c2256f);
    }

    public C2126m(C2165q c2165q, @Nullable Object obj, C2166a c2166a, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, C2256f c2256f) {
        this.f6097a = c2165q;
        this.f6098b = obj;
        this.f6099c = c2166a;
        this.f6100d = j;
        this.f6101e = j2;
        this.f6106j = j;
        this.f6107k = j;
        this.f6102f = i;
        this.f6103g = z;
        this.f6104h = trackGroupArray;
        this.f6105i = c2256f;
    }

    /* renamed from: a */
    public C2126m m7636a(C2166a c2166a, long j, long j2) {
        return new C2126m(this.f6097a, this.f6098b, c2166a, j, c2166a.m7821a() ? j2 : -9223372036854775807L, r0.f6102f, r0.f6103g, r0.f6104h, r0.f6105i);
    }

    /* renamed from: a */
    public C2126m m7634a(int i) {
        C2126m c2126m = new C2126m(this.f6097a, this.f6098b, this.f6099c.m7820a(i), this.f6100d, this.f6101e, this.f6102f, this.f6103g, this.f6104h, this.f6105i);
        C2126m.m7633a(this, c2126m);
        return c2126m;
    }

    /* renamed from: a */
    public C2126m m7635a(C2165q c2165q, Object obj) {
        C2126m c2126m = new C2126m(c2165q, obj, this.f6099c, this.f6100d, this.f6101e, this.f6102f, this.f6103g, this.f6104h, this.f6105i);
        C2126m.m7633a(this, c2126m);
        return c2126m;
    }

    /* renamed from: b */
    public C2126m m7639b(int i) {
        C2126m c2126m = new C2126m(this.f6097a, this.f6098b, this.f6099c, this.f6100d, this.f6101e, i, this.f6103g, this.f6104h, this.f6105i);
        C2126m.m7633a(this, c2126m);
        return c2126m;
    }

    /* renamed from: a */
    public C2126m m7638a(boolean z) {
        C2126m c2126m = new C2126m(this.f6097a, this.f6098b, this.f6099c, this.f6100d, this.f6101e, this.f6102f, z, this.f6104h, this.f6105i);
        C2126m.m7633a(this, c2126m);
        return c2126m;
    }

    /* renamed from: a */
    public C2126m m7637a(TrackGroupArray trackGroupArray, C2256f c2256f) {
        C2126m c2126m = new C2126m(this.f6097a, this.f6098b, this.f6099c, this.f6100d, this.f6101e, this.f6102f, this.f6103g, trackGroupArray, c2256f);
        C2126m.m7633a(this, c2126m);
        return c2126m;
    }

    /* renamed from: a */
    private static void m7633a(C2126m c2126m, C2126m c2126m2) {
        c2126m2.f6106j = c2126m.f6106j;
        c2126m2.f6107k = c2126m.f6107k;
    }
}
