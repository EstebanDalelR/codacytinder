package com.google.android.m4b.maps.cf;

/* renamed from: com.google.android.m4b.maps.cf.n */
public abstract class C5117n {
    /* renamed from: a */
    private C5106e f19010a;

    /* renamed from: a */
    final void m22806a(C5106e c5106e) {
        if (this.f19010a != null) {
            throw new RuntimeException("setCamera can only be called once");
        }
        this.f19010a = c5106e;
    }
}
