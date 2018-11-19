package com.google.android.m4b.maps.ce;

import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.ce.d */
public final class C5096d {
    /* renamed from: a */
    private final C4848k f18900a;
    /* renamed from: b */
    private final C5094b f18901b;

    public C5096d(C4848k c4848k, C5094b c5094b) {
        C5571j.m24292a((Object) c4848k);
        this.f18900a = c4848k;
        this.f18901b = c5094b;
    }

    /* renamed from: a */
    public final C4848k m22748a() {
        return this.f18900a;
    }

    /* renamed from: b */
    public final int m22749b() {
        return this.f18900a.mo5110i();
    }

    /* renamed from: c */
    public final C5094b m22750c() {
        return this.f18901b;
    }

    public final int hashCode() {
        int hashCode = this.f18900a.hashCode();
        return this.f18901b != null ? (hashCode * 31) + this.f18901b.hashCode() : hashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C5096d c5096d = (C5096d) obj;
                return this.f18900a.equals(c5096d.f18900a) && C5094b.m22746a(this.f18901b, c5096d.f18901b) != null;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final int m22751d() {
        return this.f18900a.mo5112m() + 16;
    }
}
