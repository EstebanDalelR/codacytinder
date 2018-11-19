package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bj.C4788h;
import com.google.android.m4b.maps.bt.C4909c;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bx.ag.C4984a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;

public final class am extends al {
    /* renamed from: d */
    private float f28933d = 30.0f;
    /* renamed from: e */
    private boolean f28934e = false;

    am(C4909c c4909c, C4788h c4788h, int i, int i2, int i3, C5016a c5016a, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C4981g c4981g) {
        super(c4909c.m21997a(), c4909c, c4788h, i, i2, 0, c5016a, 256, 256, false, true, false, false, false, false, c4981g);
    }

    /* renamed from: k */
    protected final C4984a mo7100k() {
        return C4984a.DEFAULT;
    }

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        if (c6570b.m29256l() < this.f28933d) {
            this.f28934e = false;
            return super.mo7044a(c6570b, c5052d);
        }
        this.f28934e = true;
        return true;
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (c6570b.m29256l() < this.f28933d) {
            if (this.f28934e) {
                super.mo7044a(c6570b, c5052d);
            }
            super.mo5222a(c5052d, c6570b, c5009j);
            return;
        }
        this.b = true;
    }
}
