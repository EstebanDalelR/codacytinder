package com.google.android.m4b.maps.cu;

import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.cu.i */
final class C5308i {
    /* renamed from: a */
    final int f19697a;
    /* renamed from: b */
    final byte[] f19698b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5308i)) {
            return false;
        }
        C5308i c5308i = (C5308i) obj;
        return this.f19697a == c5308i.f19697a && Arrays.equals(this.f19698b, c5308i.f19698b) != null;
    }

    public final int hashCode() {
        return ((this.f19697a + 527) * 31) + Arrays.hashCode(this.f19698b);
    }
}
