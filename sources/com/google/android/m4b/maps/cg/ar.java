package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ay.C4718l;
import com.google.android.m4b.maps.ay.C6409f;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.de.C5345s;
import java.io.DataInput;
import java.io.DataOutput;
import java.util.List;

public final class ar extends C6409f {
    /* renamed from: a */
    private final C5137a f27880a;
    /* renamed from: b */
    private final List<as> f27881b;
    /* renamed from: c */
    private final C6413m f27882c;

    /* renamed from: com.google.android.m4b.maps.cg.ar$a */
    public interface C5137a {
        /* renamed from: a */
        void mo4983a();
    }

    /* renamed from: g */
    public final int mo7034g() {
        return 149;
    }

    /* renamed from: a */
    public final void mo7032a(DataOutput dataOutput) {
        C4662a c4662a = new C4662a(C5345s.f20079a);
        for (as asVar : this.f27881b) {
            C4662a c4662a2 = new C4662a(C5345s.f20080b);
            c4662a2.m20821a(1, asVar.m32852a().m32859b());
            c4662a2.m20822a(2, asVar.getFeatureId());
            c4662a.m20821a(3, c4662a2);
        }
        C4665c.m20860a(dataOutput, c4662a);
    }

    /* renamed from: a */
    public final boolean mo7033a(DataInput dataInput) {
        dataInput = C4665c.m20858a(C5345s.f20081c, dataInput);
        for (int i = 0; i < dataInput.m20846k(4); i++) {
            C4662a c = dataInput.m20833c(4, i);
            if (c.m20835d(1) == 1) {
                ((as) this.f27881b.get(i)).m32853a(c.m20843h(2), c.m20843h(3));
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void mo4881d() {
        super.mo4881d();
        this.f27880a.mo4983a();
    }

    public ar(List<as> list, C5137a c5137a, C6413m c6413m) {
        this.f27880a = c5137a;
        this.f27881b = list;
        this.f27882c = c6413m;
    }

    /* renamed from: h */
    public final void mo7075h() {
        this.f27882c.mo4893c((C4718l) this);
    }
}
