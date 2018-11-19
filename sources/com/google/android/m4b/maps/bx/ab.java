package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cc.C7498h;
import com.google.android.m4b.maps.ce.C5099e;
import com.google.android.m4b.maps.ce.C5099e.C5098b;
import java.util.ArrayList;
import java.util.List;

public final class ab extends C7478d {
    /* renamed from: b */
    private final ArrayList<C7498h> f28908b = new ArrayList();
    /* renamed from: c */
    private C5099e f28909c;
    /* renamed from: d */
    private final int f28910d;

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        return true;
    }

    public ab(int i, C7481o c7481o) {
        super(c7481o);
        this.f28910d = i;
    }

    /* renamed from: a */
    public final void m34279a(C5099e c5099e) {
        this.f28909c = c5099e;
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return this.f28910d == 1 ? C5016a.IMPORTANT_LABELS : C5016a.LABELS;
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (!(this.f28909c == null || c5009j.m22388b() > 0 || c5009j.m22385a() == C5008i.NONE)) {
            if (c5009j.m22385a() != C5008i.RASTER_ONLY) {
                c5052d.m22627p();
                c5052d.m22635x().glBlendFunc(1, 771);
                c5052d.m22635x().glTexEnvx(8960, 8704, 8448);
                synchronized (this) {
                    C7498h a;
                    this.f28908b.clear();
                    C5098b d = this.f28909c.m22777d();
                    while (d.hasNext()) {
                        a = d.m22752a();
                        if ((this.f28910d != 1 || a.m32666u()) && !(this.f28910d == 2 && a.m32666u())) {
                            this.f28908b.add(a);
                        }
                    }
                    for (int i = 0; i < this.f28908b.size(); i++) {
                        a = (C7498h) this.f28908b.get(i);
                        c5052d.m22637z();
                        a.mo5222a(c5052d, c6570b, c5009j);
                        c5052d.m22597A();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo7563a(List<C5011l> list, float f, float f2, af afVar, C6570b c6570b, int i) {
        afVar = this.f28908b.iterator();
        while (afVar.hasNext()) {
            C7498h c7498h = (C7498h) afVar.next();
            if (c7498h instanceof C5003c) {
                C5003c c5003c = (C5003c) c7498h;
                int a = c5003c.mo5280a(f, f2, c6570b);
                if (a < i) {
                    list.add(new C5011l(c5003c, this, a));
                }
            }
        }
    }
}
