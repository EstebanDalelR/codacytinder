package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bz.C6570b;

/* renamed from: com.google.android.m4b.maps.bx.l */
public final class C5011l {
    /* renamed from: a */
    private final C5003c f18502a;
    /* renamed from: b */
    private final C7478d f18503b;
    /* renamed from: c */
    private int f18504c;
    /* renamed from: d */
    private boolean f18505d;

    public C5011l(C5003c c5003c, C7478d c7478d, int i) {
        this.f18502a = c5003c;
        this.f18503b = c7478d;
        this.f18504c = i;
    }

    /* renamed from: a */
    public final void m22394a(float f, float f2, af afVar, C6570b c6570b) {
        this.f18504c = this.f18502a.mo5280a(f, f2, c6570b);
        if (this.f18504c < Float.NaN && this.f18503b.m32465j() > null) {
            f = c6570b.m29251g() * 5.0f;
            this.f18504c += this.f18503b.m32465j() * ((int) (f * f));
        }
    }

    /* renamed from: a */
    public final int m22393a() {
        return this.f18504c;
    }

    /* renamed from: a */
    public final void m22395a(boolean z) {
        this.f18505d = z;
    }

    /* renamed from: b */
    public final boolean m22396b() {
        return this.f18505d;
    }

    /* renamed from: c */
    public final boolean m22397c() {
        return this.f18503b.m32464a(this.f18502a);
    }
}
