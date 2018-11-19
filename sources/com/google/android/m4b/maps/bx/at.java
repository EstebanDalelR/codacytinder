package com.google.android.m4b.maps.bx;

import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bh.C4784a;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import java.util.HashMap;
import java.util.Map;

public final class at {
    /* renamed from: b */
    private static final ba f18478b = new ba(0, 0, 0);
    /* renamed from: a */
    private final C5001a f18479a;
    /* renamed from: c */
    private final Map<bg, as> f18480c = ax.m20623b();
    /* renamed from: d */
    private af f18481d;

    /* renamed from: com.google.android.m4b.maps.bx.at$a */
    static class C5001a {
        /* renamed from: a */
        private HashMap<bg, as> f18476a;
        /* renamed from: b */
        private C5001a[] f18477b;

        /* renamed from: b */
        private static int m22366b(int i, int i2, int i3) {
            return (((i2 >> i3) & 1) << 1) + ((i >> i3) & 1);
        }

        C5001a() {
        }

        /* renamed from: a */
        private void m22364a(int i, int i2, int i3, bg bgVar, as asVar) {
            C5001a c5001a = this;
            while (i3 > 0) {
                i3--;
                int b = C5001a.m22366b(i, i2, i3);
                if (c5001a.f18477b == null) {
                    c5001a.f18477b = new C5001a[4];
                }
                C5001a c5001a2 = c5001a.f18477b[b];
                if (c5001a2 == null) {
                    c5001a2 = new C5001a();
                    c5001a.f18477b[b] = c5001a2;
                }
                c5001a = c5001a2;
            }
            if (c5001a.f18476a == 0) {
                c5001a.f18476a = ax.m20623b();
            }
            c5001a.f18476a.put(bgVar, asVar);
        }

        /* renamed from: a */
        static /* synthetic */ as m22362a(C5001a c5001a, bg bgVar) {
            if (c5001a.f18476a == null) {
                return null;
            }
            return (as) c5001a.f18476a.get(bgVar);
        }

        /* renamed from: a */
        static /* synthetic */ C5001a m22363a(C5001a c5001a, int i) {
            if (c5001a.f18477b != null && i >= 0) {
                if (i <= 3) {
                    return c5001a.f18477b[i];
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static at m22368a(C4662a c4662a) {
        C4662a c4662a2 = c4662a;
        if (c4662a2 == null) {
            return null;
        }
        int k = c4662a2.m20846k(1);
        if (k == 0) {
            return null;
        }
        C4784a.m21186a();
        C5001a c5001a = new C5001a();
        for (int i = 0; i < k; i++) {
            int[] iArr;
            int i2;
            C4662a c = c4662a2.m20833c(1, i);
            int i3 = 3;
            int d = c.m20835d(3);
            int i4 = 2;
            int k2 = c.m20846k(2);
            int d2 = c.m20835d(5);
            if (k2 > 0) {
                iArr = new int[k2];
                for (i2 = 0; i2 < k2; i2++) {
                    iArr[i2] = c.m20826b(2, i2);
                }
            } else {
                iArr = new int[((d + 1) - d2)];
                for (k2 = 0; k2 <= d - d2; k2++) {
                    iArr[k2] = k2 + d2;
                }
            }
            as asVar = new as(iArr, d2, c.m20835d(1), d);
            int i5 = 4;
            i2 = c.m20846k(4);
            int i6 = 0;
            while (i6 < i2) {
                int i7;
                C4662a c2 = c.m20833c(i5, i6);
                d = c2.m20835d(i4);
                k2 = c2.m20835d(i3);
                int d3 = c2.m20835d(i5);
                i3 = c2.m20846k(1);
                ba baVar = new ba(d, k2, d3);
                d3 = 0;
                while (d3 < i3) {
                    C4662a c4662a3;
                    int i8;
                    bg a = bg.m21669a(c2.m20826b(1, d3));
                    if (a != null) {
                        k2 = baVar.m21620c();
                        c4662a3 = c2;
                        d2 = baVar.m21621d();
                        i8 = i6;
                        i7 = i2;
                        c5001a.m22364a(k2, d2, baVar.m21619b(), a, asVar);
                    } else {
                        c4662a3 = c2;
                        i8 = i6;
                        i7 = i2;
                    }
                    d3++;
                    i6 = i8;
                    i2 = i7;
                    c2 = c4662a3;
                }
                i7 = i2;
                i6++;
                i5 = 4;
                i3 = 3;
                i4 = 2;
            }
        }
        C4784a.m21187b();
        return new at(c5001a);
    }

    private at(C5001a c5001a) {
        this.f18479a = c5001a;
    }

    /* renamed from: a */
    private as m22367a(int i, int i2, int i3, bg bgVar, C5001a c5001a) {
        do {
            if (c5001a == this.f18479a || C5001a.m22362a(c5001a, bgVar) == null) {
                i3--;
                c5001a = C5001a.m22363a(c5001a, C5001a.m22366b(i, i2, i3));
            } else {
                i = C5001a.m22362a(c5001a, bgVar);
                if (i != 0) {
                    return i;
                }
                if (C4728u.m21050a("ZoomTableQuadTree", 6) != 0) {
                    i2 = String.valueOf(bgVar);
                    i3 = new StringBuilder(String.valueOf(i2).length() + 28);
                    i3.append("No zoom table for tile type ");
                    i3.append(i2);
                    Log.e("ZoomTableQuadTree", i3.toString());
                }
                return as.f18464a;
            }
        } while (c5001a != null);
        i = C5001a.m22362a(this.f18479a, bgVar);
        if (i != 0) {
            return i;
        }
        if (C4728u.m21050a("ZoomTableQuadTree", 6) != 0) {
            i2 = String.valueOf(bgVar);
            i3 = new StringBuilder(String.valueOf(i2).length() + 33);
            i3.append("No root zoom table for tile type ");
            i3.append(i2);
            Log.e("ZoomTableQuadTree", i3.toString());
        }
        return as.f18464a;
    }

    /* renamed from: a */
    public final as m22369a(af afVar, bg bgVar) {
        if (this.f18481d == null || !this.f18481d.equals(afVar)) {
            this.f18480c.clear();
        } else {
            as asVar = (as) this.f18480c.get(bgVar);
            if (asVar != null) {
                return asVar;
            }
        }
        ba a = ba.m21604a(30, afVar);
        if (a == null) {
            a = f18478b;
        }
        this.f18481d = afVar;
        if (bgVar.m21685h() == null) {
            afVar = m22367a(a.m21620c(), a.m21621d(), a.m21619b(), bgVar, this.f18479a);
        } else {
            afVar = m22367a(a.m21620c(), a.m21621d(), a.m21619b(), bg.m21669a(bgVar.m21681d()), this.f18479a);
        }
        this.f18480c.put(bgVar, afVar);
        return afVar;
    }
}
