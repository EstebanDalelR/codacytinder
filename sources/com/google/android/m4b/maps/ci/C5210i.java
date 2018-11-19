package com.google.android.m4b.maps.ci;

import android.graphics.Point;
import com.google.android.m4b.maps.ac.C4591a;
import com.google.android.m4b.maps.ao.C4651e;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.cg.C5162c;
import com.google.android.m4b.maps.cl.C5217b;
import com.google.android.m4b.maps.cl.C5222g;
import com.google.android.m4b.maps.cl.C5224i;
import com.google.android.m4b.maps.cl.C5225j;
import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.ci.i */
final class C5210i {
    /* renamed from: a */
    private static String m23257a(C4662a c4662a, String str) {
        try {
            c4662a = String.valueOf(C4591a.m20681b().m20685a(c4662a.m20837d()));
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 4) + String.valueOf(c4662a).length());
            stringBuilder.append(str);
            stringBuilder.append("bpb=");
            stringBuilder.append(c4662a);
            return stringBuilder.toString();
        } catch (C4662a c4662a2) {
            throw new IllegalStateException(c4662a2);
        }
    }

    /* renamed from: a */
    private static void m23259a(C4662a c4662a, C6647k c6647k) {
        int i = (int) c6647k.f24922e.zoom;
        C4662a c4662a2 = new C4662a(C5224i.f19453a);
        C4662a c4662a3 = new C4662a(C5224i.f19454b);
        c4662a3.m20841f(2, i);
        C4662a c4662a4 = new C4662a(C5224i.f19455c);
        c4662a4.m20841f(1, C5210i.m23254a(c6647k.f24923f, c6647k.f24925h));
        c4662a4.m20841f(2, C5210i.m23254a(c6647k.f24924g, c6647k.f24925h));
        c4662a3.m20827b(1, c4662a4);
        c4662a4 = new C4662a(C4651e.f17079a);
        if (c6647k.f24918a == c6647k.f24920c && c6647k.f24919b == c6647k.f24921d) {
            c6647k = c6647k.f24922e.target;
        } else {
            c6647k = c6647k.mo4987a(new Point(c6647k.f24923f / 2, c6647k.f24924g / 2));
        }
        c4662a4.m20841f(1, C5210i.m23253a(c6647k.latitude));
        c4662a4.m20841f(2, C5210i.m23253a(c6647k.longitude));
        c4662a3.m20827b(3, c4662a4);
        c4662a2.m20827b(4, c4662a3);
        c4662a.m20821a(1, c4662a2);
    }

    /* renamed from: a */
    private static void m23258a(C4662a c4662a, int i) {
        C5571j.m24298a(i != 0, (Object) "Shouldn't fetch for MAP_TYPE_NONE");
        C4662a g = c4662a.m20842g(3);
        if (g == null) {
            g = new C4662a(C5222g.f19447a);
        }
        switch (i) {
            case 2:
                C5210i.m23260b(c4662a, 1);
                return;
            case 3:
                C5210i.m23260b(c4662a, 4);
                C5210i.m23260b(c4662a, 0);
                c4662a = new C4662a(C5225j.f19459a);
                c4662a.m20841f(1, 5);
                g.m20821a(12, c4662a);
                return;
            case 4:
                C5210i.m23260b(c4662a, 1);
                C5210i.m23260b(c4662a, 0);
                c4662a = new C4662a(C5225j.f19459a);
                c4662a.m20841f(1, 4);
                g.m20821a(12, c4662a);
                return;
            default:
                C5210i.m23260b(c4662a, 0);
                return;
        }
    }

    /* renamed from: a */
    private static int m23254a(int i, double d) {
        return Math.min((int) Math.ceil(((double) i) / d), (int) Math.floor(2048.0d / d));
    }

    /* renamed from: b */
    private static void m23260b(C4662a c4662a, int i) {
        C4662a c4662a2 = new C4662a(C5217b.f19419a);
        c4662a2.m20841f(1, i);
        c4662a2.m20841f(3, 999999);
        c4662a.m20821a(2, c4662a2);
    }

    /* renamed from: a */
    public static String m23255a(C4662a c4662a, C6647k c6647k, int i, C5162c c5162c, String str) {
        try {
            c4662a = C4665c.m20857a(c4662a);
            C5210i.m23259a(c4662a, c6647k);
            if (c5162c != null) {
                String b = c5162c.m23078b();
                C5210i.m23260b(c4662a, 0);
                C4662a c4662a2 = new C4662a(C5225j.f19459a);
                c4662a2.m20841f(1, 68);
                C4662a c4662a3 = new C4662a(C5225j.f19460b);
                c4662a3.m20828b(1, "set");
                c4662a3.m20828b(2, b);
                c4662a2.m20821a(2, c4662a3);
                C4662a c4662a4 = new C4662a(C5222g.f19447a);
                c4662a4.m20821a(12, c4662a2);
                c4662a.m20821a(3, c4662a4);
            } else {
                C5210i.m23258a(c4662a, i);
            }
            return C5210i.m23257a(c4662a, str);
        } catch (C4662a c4662a5) {
            throw new IllegalStateException(c4662a5);
        }
    }

    /* renamed from: a */
    public static String m23256a(C4662a c4662a, C6647k c6647k, int i, String str) {
        try {
            c4662a = C4665c.m20857a(c4662a);
            c4662a.m20839e(5, 0);
            c4662a.m20841f(4, 5);
            C5210i.m23259a(c4662a, c6647k);
            C5210i.m23258a(c4662a, i);
            return C5210i.m23257a(c4662a, str);
        } catch (C4662a c4662a2) {
            throw new IllegalStateException(c4662a2);
        }
    }

    /* renamed from: a */
    private static int m23253a(double d) {
        return (int) Math.round(d * 1.0E7d);
    }
}
