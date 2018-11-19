package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.C2165q;
import com.google.android.exoplayer2.C2165q.C2163a;
import com.google.android.exoplayer2.C2165q.C2164b;
import com.google.android.exoplayer2.source.C3690h;
import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.source.ads.a */
final class C4246a extends C3690h {
    /* renamed from: c */
    private final AdPlaybackState f13669c;

    public C4246a(C2165q c2165q, AdPlaybackState adPlaybackState) {
        super(c2165q);
        boolean z = false;
        C2289a.m8313b(c2165q.mo2319c() == 1);
        if (c2165q.mo2318b() == 1) {
            z = true;
        }
        C2289a.m8313b(z);
        this.f13669c = adPlaybackState;
    }

    /* renamed from: a */
    public C2163a mo2316a(int i, C2163a c2163a, boolean z) {
        this.b.mo2316a(i, c2163a, z);
        c2163a.m7775a(c2163a.f6203a, c2163a.f6204b, c2163a.f6205c, c2163a.f6206d, c2163a.m7780c(), this.f13669c);
        return c2163a;
    }

    /* renamed from: a */
    public C2164b mo2317a(int i, C2164b c2164b, boolean z, long j) {
        i = super.mo2317a(i, c2164b, z, j);
        if (i.f6217i == -9223372036854775807L) {
            i.f6217i = this.f13669c.f6289f;
        }
        return i;
    }
}
