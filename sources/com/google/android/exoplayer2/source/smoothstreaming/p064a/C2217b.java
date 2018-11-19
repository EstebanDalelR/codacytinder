package com.google.android.exoplayer2.source.smoothstreaming.p064a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a.b */
public final class C2217b implements Comparable<C2217b> {
    /* renamed from: a */
    public final int f6428a;
    /* renamed from: b */
    public final int f6429b;

    public /* synthetic */ int compareTo(@NonNull Object obj) {
        return m7921a((C2217b) obj);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f6428a);
        stringBuilder.append(".");
        stringBuilder.append(this.f6429b);
        return stringBuilder.toString();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2217b c2217b = (C2217b) obj;
                if (this.f6428a != c2217b.f6428a || this.f6429b != c2217b.f6429b) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f6428a * 31) + this.f6429b;
    }

    /* renamed from: a */
    public int m7921a(@NonNull C2217b c2217b) {
        int i = this.f6428a - c2217b.f6428a;
        return i == 0 ? this.f6429b - c2217b.f6429b : i;
    }
}
