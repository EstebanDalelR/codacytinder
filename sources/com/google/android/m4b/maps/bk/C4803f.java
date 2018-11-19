package com.google.android.m4b.maps.bk;

import com.google.android.m4b.maps.bk.C4800e.C4796b;
import com.google.android.m4b.maps.bk.C4800e.C4799d;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.cb.C5063d;
import com.google.android.m4b.maps.cb.C5067l;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bk.f */
public final class C4803f {

    /* renamed from: com.google.android.m4b.maps.bk.f$a */
    public enum C4802a {
        NO_VERIFICATION,
        NO_VERIFICATION_WITH_REASON,
        AREA_VERIFICATION,
        AREA_VERIFICATION_WITH_REASON,
        COMPLETE_VERIFICATION
    }

    /* renamed from: a */
    public static C4805k m21252a(List<aj> list, C4802a c4802a) {
        if (list.size() == 0) {
            return C4805k.m21268a();
        }
        int[] iArr = new int[(list.size() + 1)];
        int i = 0;
        int i2 = 0;
        for (aj ajVar : list) {
            iArr[i] = i2;
            i2 += ajVar.m21528b() - 1;
            if (!ajVar.m21531c().equals(ajVar.m21522a(0))) {
                i2++;
            }
            i++;
        }
        iArr[i] = i2;
        double[] dArr = new double[(i2 * 2)];
        C4803f.m21255a((aj) list.get(0), false, dArr, 0);
        int i3 = 1;
        for (aj a : list.subList(1, list.size())) {
            C4803f.m21255a(a, true, dArr, iArr[i3]);
            i3++;
        }
        C4794d c4794d = new C4794d(C6466g.m28341a(dArr, iArr));
        if (c4802a == C4802a.COMPLETE_VERIFICATION) {
            C4799d b = C4800e.m21251b(c4794d);
            if (b != null) {
                c4802a = "Verification failed, the polygon violates ";
                String valueOf = String.valueOf(b.toString());
                list = new C4796b(valueOf.length() != 0 ? c4802a.concat(valueOf) : new String(c4802a), null);
                list.m21244a(b);
                throw list;
            }
        }
        try {
            C4805k a2 = C4800e.m21247a(c4794d);
            switch (c4802a) {
                case AREA_VERIFICATION:
                case AREA_VERIFICATION_WITH_REASON:
                case COMPLETE_VERIFICATION:
                    if (!a2.m21273a(c4794d)) {
                        throw new C4796b("Could not tessellate polygon, area not equal", null);
                    }
                    break;
                default:
                    break;
            }
            return a2;
        } catch (C4796b e) {
            c4802a = C48011.f17517a[c4802a.ordinal()];
            if (c4802a == 2 || c4802a == 4) {
                e.m21244a(C4800e.m21251b(c4794d));
            }
            throw e;
        }
    }

    /* renamed from: a */
    private static void m21255a(aj ajVar, boolean z, double[] dArr, int i) {
        af afVar = new af();
        int i2 = 0;
        int b = z ? ajVar.m21528b() - 1 : 0;
        z = z ? true : true;
        int b2 = ajVar.m21528b();
        if (ajVar.m21531c().equals(ajVar.m21522a(0))) {
            b2--;
        }
        while (i2 < b2) {
            ajVar.m21524a((z * i2) + b, afVar);
            int i3 = (i + i2) * 2;
            dArr[i3] = (double) afVar.m21490f();
            dArr[i3 + 1] = (double) afVar.m21492g();
            i2++;
        }
    }

    /* renamed from: a */
    public static void m21254a(C4805k c4805k, C5067l c5067l, af afVar, int i) {
        af afVar2 = new af();
        int e = c4805k.mo5041e();
        c5067l.mo5253a(c5067l.mo5250a() + e);
        for (int i2 = 0; i2 < e; i2++) {
            afVar2.m21487d((int) c4805k.m21270a(i2), (int) c4805k.m21274b(i2));
            af.m21468b(afVar2, afVar, afVar2);
            c5067l.mo5257a(afVar2, i);
        }
    }

    /* renamed from: a */
    public static void m21253a(C4805k c4805k, C5063d c5063d, int i) {
        c5063d.mo5262b(c5063d.mo5261b() + (c4805k.mo5040d() * 3));
        int d = c4805k.mo5040d();
        for (int i2 = 0; i2 < d; i2++) {
            c5063d.mo5255a(c4805k.m21271a(i2, 0) + i, c4805k.m21271a(i2, 1) + i, c4805k.m21271a(i2, 2) + i);
        }
    }
}
