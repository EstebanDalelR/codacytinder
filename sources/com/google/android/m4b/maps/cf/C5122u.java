package com.google.android.m4b.maps.cf;

import com.google.android.m4b.maps.cf.C5108f.C5107a;

/* renamed from: com.google.android.m4b.maps.cf.u */
public class C5122u {
    /* renamed from: a */
    private boolean f19026a = false;
    /* renamed from: b */
    private int f19027b = 0;

    protected C5122u() {
    }

    /* renamed from: a */
    protected boolean mo5294a(C5111g c5111g, C5107a c5107a) {
        if (c5107a.f18965d == this.f19026a && c5107a.f18966e == null) {
            return false;
        }
        if (c5107a.f18965d == null && c5107a.f18966e == null && this.f19027b != null) {
            return false;
        }
        this.f19026a = c5107a.f18965d;
        return true;
    }

    /* renamed from: a */
    final void m22819a() {
        this.f19027b--;
    }

    /* renamed from: b */
    final void m22821b() {
        this.f19027b++;
    }
}
