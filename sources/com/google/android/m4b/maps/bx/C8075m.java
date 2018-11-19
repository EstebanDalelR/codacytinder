package com.google.android.m4b.maps.bx;

import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.m4b.maps.aa.bc;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bc.C4754b;
import com.google.android.m4b.maps.bc.C7445j;
import com.google.android.m4b.maps.bj.C4788h;
import com.google.android.m4b.maps.bo.C4856x;
import com.google.android.m4b.maps.bo.C4857y;
import com.google.android.m4b.maps.bo.C6529z;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bt.C4909c;
import com.google.android.m4b.maps.bw.C4969b;
import com.google.android.m4b.maps.bw.C4969b.C4968a;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.cc.C6587q;
import com.google.android.m4b.maps.cc.C7497f;
import com.google.android.m4b.maps.cg.as;
import com.google.android.m4b.maps.de.ad;
import com.google.android.m4b.maps.p125y.C6849f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.bx.m */
public final class C8075m extends al {
    /* renamed from: d */
    private static final Comparator<C6587q> f28963d = bc.m20643b().m20646a(new C74801()).mo4827a();
    /* renamed from: e */
    private final int f28964e;
    /* renamed from: f */
    private final int f28965f = (31 - Integer.numberOfLeadingZeros(256));

    /* renamed from: com.google.android.m4b.maps.bx.m$1 */
    class C74801 implements C6849f<C6587q, ba> {
        C74801() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo7022a(Object obj) {
            return ((C6587q) obj).mo7136b();
        }
    }

    C8075m(bg bgVar, C4909c c4909c, C4788h c4788h, int i, int i2, int i3, C5016a c5016a, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Resources resources, C4981g c4981g) {
        super(bgVar, c4909c, c4788h, i, i2, 4, c5016a, 256, 384, false, true, false, false, false, false, c4981g);
        m32452a(new C6529z(new C4662a(ad.f19862h)));
        this.f28964e = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
    }

    /* renamed from: a */
    public final List m34324a(af afVar, C6570b c6570b, C7445j c7445j) {
        int i;
        List list;
        C4968a e;
        C4968a c4968a;
        af afVar2 = afVar;
        List arrayList = new ArrayList();
        Set hashSet = new HashSet();
        am a = al.m32202a(afVar2, (int) (((float) this.f28964e) * c6570b.m29262r()));
        List<C6587q> l = m32460l();
        List arrayList2 = new ArrayList();
        for (C6587q c6587q : l) {
            if ((c6587q instanceof C7497f) && c6587q.mo7136b().m21626i().mo5091a(a)) {
                arrayList2.add((C7497f) c6587q);
            }
        }
        Collections.sort(arrayList2, f28963d);
        int i2 = 0;
        C8075m c8075m;
        while (i2 < c8075m.f28964e) {
            int r = (int) c6570b.m29262r();
            am a2 = al.m32202a(afVar2, i2 * r);
            for (C7497f h : r7) {
                for (C4856x c4856x : h.m32642h()) {
                    if (!c4856x.m21787a().isEmpty()) {
                        for (C4857y c4857y : c4856x.m21787a()) {
                            am amVar;
                            if (c4857y.m21791c() == null || !c4857y.m21791c().mo5091a(a2) || hashSet.contains(c4857y.m21789a())) {
                                amVar = a2;
                            } else {
                                amVar = a2;
                                arrayList.add(new as(c7445j.m32071g(), c4857y.m21789a(), C4754b.m21097a(c4857y.m21790b())));
                                hashSet.add(c4857y.m21789a());
                            }
                            a2 = amVar;
                        }
                    }
                    a2 = a2;
                }
            }
            for (C7497f c7497f : r7) {
                int i3 = -i2;
                int i4 = i3;
                while (i4 <= i2) {
                    int i5 = i3;
                    while (i5 <= i2) {
                        if (Math.abs(i4) != i2) {
                            if (Math.abs(i5) == i2) {
                            }
                            i5++;
                            r = r;
                            arrayList2 = arrayList2;
                            c8075m = this;
                            afVar2 = afVar;
                        }
                        af afVar3 = new af(afVar.m21490f() + (r * i4), afVar.m21492g() + (r * i5));
                        for (C4856x b : c7497f.m32642h()) {
                            C4969b b2 = b.m21788b();
                            ba b3 = c7497f.mo7136b();
                            if (b2 != null) {
                                i = r;
                                if (b3.m21626i().mo5090a(afVar3)) {
                                    try {
                                        r = (afVar3.m21490f() - b3.m21622e()) >> ((30 - b3.m21619b()) - c8075m.f28965f);
                                        list = arrayList2;
                                        try {
                                            for (String str : b2.m22237a(r, (b3.m21625h().m21492g() - afVar3.m21492g()) >> ((30 - b3.m21619b()) - c8075m.f28965f))) {
                                                if (!hashSet.contains(str)) {
                                                    arrayList.add(new as(c7445j.m32071g(), str, C4754b.m21097a(afVar3)));
                                                    hashSet.add(str);
                                                }
                                            }
                                        } catch (C4968a e2) {
                                            e = e2;
                                            c4968a = e;
                                            if (C4728u.m21050a("FeatureMapTileOverlay", 6)) {
                                                Log.e("FeatureMapTileOverlay", c4968a.getMessage());
                                            }
                                            r = i;
                                            arrayList2 = list;
                                            c8075m = this;
                                            afVar2 = afVar;
                                        }
                                    } catch (C4968a e3) {
                                        e = e3;
                                        list = arrayList2;
                                        c4968a = e;
                                        if (C4728u.m21050a("FeatureMapTileOverlay", 6)) {
                                            Log.e("FeatureMapTileOverlay", c4968a.getMessage());
                                        }
                                        r = i;
                                        arrayList2 = list;
                                        c8075m = this;
                                        afVar2 = afVar;
                                    }
                                    r = i;
                                    arrayList2 = list;
                                    c8075m = this;
                                    afVar2 = afVar;
                                }
                            } else {
                                i = r;
                            }
                            list = arrayList2;
                            r = i;
                            arrayList2 = list;
                            c8075m = this;
                            afVar2 = afVar;
                        }
                        i5++;
                        r = r;
                        arrayList2 = arrayList2;
                        c8075m = this;
                        afVar2 = afVar;
                    }
                    i = r;
                    list = arrayList2;
                    i4++;
                    c8075m = this;
                    afVar2 = afVar;
                }
            }
            list = arrayList2;
            i2++;
            c8075m = this;
            afVar2 = afVar;
        }
        return arrayList;
    }
}
