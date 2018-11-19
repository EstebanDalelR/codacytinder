package com.google.android.exoplayer2.source.dash.p063a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.source.dash.a.g */
public final class C2200g implements Comparable<C2200g> {
    /* renamed from: a */
    public final int f6340a;
    /* renamed from: b */
    public final int f6341b;
    /* renamed from: c */
    public final int f6342c;

    public /* synthetic */ int compareTo(@NonNull Object obj) {
        return m7877a((C2200g) obj);
    }

    public C2200g(int i, int i2, int i3) {
        this.f6340a = i;
        this.f6341b = i2;
        this.f6342c = i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f6340a);
        stringBuilder.append(".");
        stringBuilder.append(this.f6341b);
        stringBuilder.append(".");
        stringBuilder.append(this.f6342c);
        return stringBuilder.toString();
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C2200g c2200g = (C2200g) obj;
                if (this.f6340a != c2200g.f6340a || this.f6341b != c2200g.f6341b || this.f6342c != c2200g.f6342c) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6340a * 31) + this.f6341b) * 31) + this.f6342c;
    }

    /* renamed from: a */
    public int m7877a(@NonNull C2200g c2200g) {
        int i = this.f6340a - c2200g.f6340a;
        if (i != 0) {
            return i;
        }
        i = this.f6341b - c2200g.f6341b;
        return i == 0 ? this.f6342c - c2200g.f6342c : i;
    }
}
