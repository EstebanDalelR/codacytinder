package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bj.C4788h;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bn.C4831a;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bt.C4909c;
import com.google.android.m4b.maps.bw.C4970c;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bx.ag.C4984a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cg.ab;

/* renamed from: com.google.android.m4b.maps.bx.f */
public final class C8074f extends al {
    /* renamed from: d */
    private static final al f28962d = al.m32203a(C4970c.m22239a(new C4831a(38000000, 136000000)), C4970c.m22239a(new C4831a(33000000, 143000000)));

    C8074f(bg bgVar, C4909c c4909c, C4788h c4788h, int i, int i2, int i3, C5016a c5016a, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C4981g c4981g) {
        super(bgVar, c4909c, c4788h, i, i2, 0, c5016a, 256, 256, false, false, false, false, false, false, c4981g);
    }

    /* renamed from: k */
    protected final C4984a mo7100k() {
        return C4984a.ELEVATED_COLOR;
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        C6487i a = C6487i.m28476a();
        float m = c6570b.m29257m();
        c6570b.m29242b();
        Object obj = null;
        if (a != null) {
            Object obj2;
            for (ab f : a.m28506e()) {
                if (f.mo5146f() < 0) {
                    obj2 = 1;
                    break;
                }
            }
            obj2 = null;
            if (obj2 == null) {
                if (!a.m28505d().isEmpty()) {
                    if (m <= 18.0f) {
                    }
                }
            }
            if (obj == null) {
                super.mo5222a(c5052d, c6570b, c5009j);
            } else {
                this.b = true;
            }
        }
        obj = 1;
        if (obj == null) {
            this.b = true;
        } else {
            super.mo5222a(c5052d, c6570b, c5009j);
        }
    }
}
