package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cc.C7498h;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bx.h */
public final class C7479h extends C6561r {
    /* renamed from: a */
    private List<C7498h> f27553a;

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        return true;
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return C5016a.DEBUG_LABELS;
    }

    /* renamed from: b */
    public final void m32468b(List<C7498h> list) {
        this.f27553a = list;
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (!(c5009j.m22388b() > 0 || c5009j.m22385a() == C5008i.NONE || this.f27553a == null)) {
            if (!this.f27553a.isEmpty()) {
                c5052d.m22627p();
                c5052d.m22635x().glBlendFunc(1, 771);
                c5052d.m22635x().glTexEnvx(8960, 8704, 8448);
                synchronized (this) {
                    for (C7498h c7498h : this.f27553a) {
                        c5052d.m22637z();
                        c7498h.mo5222a(c5052d, c6570b, c5009j);
                        c5052d.m22597A();
                    }
                }
            }
        }
    }
}
