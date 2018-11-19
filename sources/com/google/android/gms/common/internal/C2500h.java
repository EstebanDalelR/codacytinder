package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.internal.h */
public final class C2500h {
    /* renamed from: a */
    private final String f7640a;
    /* renamed from: b */
    private final String f7641b;
    /* renamed from: c */
    private final ComponentName f7642c = null;
    /* renamed from: d */
    private final int f7643d;

    public C2500h(String str, String str2, int i) {
        this.f7640a = ad.m9047a(str);
        this.f7641b = ad.m9047a(str2);
        this.f7643d = i;
    }

    /* renamed from: a */
    public final String m9149a() {
        return this.f7641b;
    }

    /* renamed from: b */
    public final ComponentName m9150b() {
        return this.f7642c;
    }

    /* renamed from: c */
    public final int m9151c() {
        return this.f7643d;
    }

    /* renamed from: d */
    public final Intent m9152d() {
        return this.f7640a != null ? new Intent(this.f7640a).setPackage(this.f7641b) : new Intent().setComponent(this.f7642c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2500h)) {
            return false;
        }
        C2500h c2500h = (C2500h) obj;
        return C2507w.m9173a(this.f7640a, c2500h.f7640a) && C2507w.m9173a(this.f7641b, c2500h.f7641b) && C2507w.m9173a(this.f7642c, c2500h.f7642c) && this.f7643d == c2500h.f7643d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7640a, this.f7641b, this.f7642c, Integer.valueOf(this.f7643d)});
    }

    public final String toString() {
        return this.f7640a == null ? this.f7642c.flattenToString() : this.f7640a;
    }
}
