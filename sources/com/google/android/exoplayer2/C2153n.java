package com.google.android.exoplayer2;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.n */
public final class C2153n {
    /* renamed from: a */
    public static final C2153n f6151a = new C2153n(1.0f);
    /* renamed from: b */
    public final float f6152b;
    /* renamed from: c */
    public final float f6153c;
    /* renamed from: d */
    public final boolean f6154d;
    /* renamed from: e */
    private final int f6155e;

    public C2153n(float f) {
        this(f, 1.0f, false);
    }

    public C2153n(float f, float f2, boolean z) {
        boolean z2 = false;
        C2289a.m8311a(f > 0.0f);
        if (f2 > 0.0f) {
            z2 = true;
        }
        C2289a.m8311a(z2);
        this.f6152b = f;
        this.f6153c = f2;
        this.f6154d = z;
        this.f6155e = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public long m7731a(long j) {
        return j * ((long) this.f6155e);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2153n c2153n = (C2153n) obj;
                if (this.f6152b != c2153n.f6152b || this.f6153c != c2153n.f6153c || this.f6154d != c2153n.f6154d) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.f6152b)) * 31) + Float.floatToRawIntBits(this.f6153c)) * 31) + this.f6154d;
    }
}
