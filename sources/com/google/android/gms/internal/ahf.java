package com.google.android.gms.internal;

import android.support.annotation.Nullable;

public final class ahf {
    /* renamed from: a */
    final long f15262a;
    /* renamed from: b */
    final String f15263b;
    /* renamed from: c */
    final int f15264c;

    ahf(long j, String str, int i) {
        this.f15262a = j;
        this.f15263b = str;
        this.f15264c = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof ahf)) {
            return false;
        }
        ahf ahf = (ahf) obj;
        if (ahf.f15262a == this.f15262a && ahf.f15264c == this.f15264c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f15262a;
    }
}
