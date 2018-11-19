package com.google.android.exoplayer2;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.p */
public final class C2162p {
    /* renamed from: a */
    public static final C2162p f6196a = new C2162p(0, 0);
    /* renamed from: b */
    public static final C2162p f6197b = new C2162p(Format.OFFSET_SAMPLE_RELATIVE, Format.OFFSET_SAMPLE_RELATIVE);
    /* renamed from: c */
    public static final C2162p f6198c = new C2162p(Format.OFFSET_SAMPLE_RELATIVE, 0);
    /* renamed from: d */
    public static final C2162p f6199d = new C2162p(0, Format.OFFSET_SAMPLE_RELATIVE);
    /* renamed from: e */
    public static final C2162p f6200e = f6196a;
    /* renamed from: f */
    public final long f6201f;
    /* renamed from: g */
    public final long f6202g;

    public C2162p(long j, long j2) {
        boolean z = false;
        C2289a.m8311a(j >= 0);
        if (j2 >= 0) {
            z = true;
        }
        C2289a.m8311a(z);
        this.f6201f = j;
        this.f6202g = j2;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2162p c2162p = (C2162p) obj;
                if (this.f6201f != c2162p.f6201f || this.f6202g != c2162p.f6202g) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f6201f) * 31) + ((int) this.f6202g);
    }
}
