package com.google.android.gms.internal;

import java.util.Arrays;

final class aeg {
    /* renamed from: a */
    final int f15105a;
    /* renamed from: b */
    final byte[] f15106b;

    aeg(int i, byte[] bArr) {
        this.f15105a = i;
        this.f15106b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aeg)) {
            return false;
        }
        aeg aeg = (aeg) obj;
        return this.f15105a == aeg.f15105a && Arrays.equals(this.f15106b, aeg.f15106b);
    }

    public final int hashCode() {
        return ((this.f15105a + 527) * 31) + Arrays.hashCode(this.f15106b);
    }
}
