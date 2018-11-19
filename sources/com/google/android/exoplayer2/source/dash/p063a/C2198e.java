package com.google.android.exoplayer2.source.dash.p063a;

import android.support.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.source.dash.a.e */
public final class C2198e {
    /* renamed from: a */
    public final long f6336a;
    /* renamed from: b */
    public final long f6337b;
    /* renamed from: c */
    private final String f6338c;
    /* renamed from: d */
    private int f6339d;

    public int hashCode() {
        if (this.f6339d == 0) {
            this.f6339d = ((((527 + ((int) this.f6336a)) * 31) + ((int) this.f6337b)) * 31) + this.f6338c.hashCode();
        }
        return this.f6339d;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2198e c2198e = (C2198e) obj;
                if (this.f6336a != c2198e.f6336a || this.f6337b != c2198e.f6337b || this.f6338c.equals(c2198e.f6338c) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RangedUri(referenceUri=");
        stringBuilder.append(this.f6338c);
        stringBuilder.append(", start=");
        stringBuilder.append(this.f6336a);
        stringBuilder.append(", length=");
        stringBuilder.append(this.f6337b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
