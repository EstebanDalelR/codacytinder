package com.google.android.exoplayer2;

import android.support.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.o */
public final class C2154o {
    /* renamed from: a */
    public static final C2154o f6156a = new C2154o(0);
    /* renamed from: b */
    public final int f6157b;

    public C2154o(int i) {
        this.f6157b = i;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                if (this.f6157b != ((C2154o) obj).f6157b) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6157b;
    }
}
