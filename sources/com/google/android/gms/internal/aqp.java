package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.bh;
import java.util.Arrays;

@zzzv
final class aqp {
    /* renamed from: a */
    private final Object[] f15587a;

    aqp(zzjj zzjj, String str, int i) {
        this.f15587a = bh.a((String) aja.m19221f().m19334a(alo.aH), zzjj, str, i, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqp)) {
            return false;
        }
        return Arrays.equals(this.f15587a, ((aqp) obj).f15587a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15587a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f15587a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 24);
        stringBuilder.append("[InterstitialAdPoolKey ");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
