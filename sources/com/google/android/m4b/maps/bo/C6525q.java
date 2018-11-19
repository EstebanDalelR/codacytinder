package com.google.android.m4b.maps.bo;

import android.util.Log;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.cg.ab;
import com.google.android.m4b.maps.p125y.C6849f;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bo.q */
public final class C6525q implements ab {
    /* renamed from: a */
    private final List<C7436c> f24205a;
    /* renamed from: b */
    private final String f24206b;
    /* renamed from: c */
    private final String f24207c;
    /* renamed from: d */
    private final int f24208d;
    /* renamed from: e */
    private final C4701c f24209e;
    /* renamed from: f */
    private final bq f24210f;

    /* renamed from: com.google.android.m4b.maps.bo.q$a */
    public static class C4851a {
        /* renamed from: a */
        public static final C6849f<C6525q, C4699a> f17817a = new C74631();

        /* renamed from: com.google.android.m4b.maps.bo.q$a$1 */
        class C74631 implements C6849f<C6525q, C4699a> {
            C74631() {
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo7022a(Object obj) {
                return ((C6525q) obj).mo5143b();
            }
        }
    }

    private C6525q(C7436c c7436c, List<C7436c> list, String str, String str2, int i, int i2, bq bqVar) {
        this.f24205a = list;
        this.f24206b = str;
        this.f24207c = str2;
        this.f24208d = i;
        this.f24209e = new C4701c(c7436c, i2);
        this.f24210f = bqVar;
    }

    /* renamed from: a */
    public static C6525q m28754a(C4662a c4662a) {
        C7436c b = C7436c.m32017b(c4662a.m20843h(1));
        if (b == null) {
            if (C4728u.m21050a("INDOOR", 3)) {
                String str = "INDOOR";
                String str2 = "malformed id: ";
                c4662a = String.valueOf(c4662a.m20843h(1));
                Log.d(str, c4662a.length() != 0 ? str2.concat(c4662a) : new String(str2));
            }
            return null;
        }
        String str3;
        int k = c4662a.m20846k(2);
        List a = au.m20524a(k);
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            C7436c b2 = C7436c.m32017b(c4662a.m20836d(2, i2));
            if (b2 != null) {
                a.add(b2);
            } else if (C4728u.m21050a("INDOOR", 3)) {
                str3 = "INDOOR";
                String str4 = "warning: malformed building id: ";
                String valueOf = String.valueOf(c4662a.m20843h(1));
                Log.d(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            }
        }
        str = c4662a.m20843h(3);
        String h = c4662a.m20843h(4);
        if (str == null) {
            str = h != null ? h : "";
        }
        String str5 = str;
        str3 = h == null ? str5 : h;
        if (c4662a.m20845j(5)) {
            i = c4662a.m20835d(5);
        }
        int d = c4662a.m20845j(8) ? c4662a.m20835d(8) : Integer.MIN_VALUE;
        if (c4662a.m20845j(7)) {
            c4662a = c4662a.m20842g(7);
            af a2 = af.m21457a(c4662a.m20842g(1));
            c4662a = af.m21457a(c4662a.m20842g(2));
            if (a2.f17658a > c4662a.f17658a) {
                c4662a.f17658a += 1073741824;
            }
            c4662a = bq.m28669a(new al(a2, c4662a));
        } else {
            c4662a = null;
        }
        return new C6525q(b, a, str5, str3, i, d, c4662a);
    }

    /* renamed from: a */
    public final C4701c mo5142a() {
        return this.f24209e;
    }

    /* renamed from: b */
    public final C7436c mo5143b() {
        return this.f24209e.m20902a();
    }

    /* renamed from: c */
    public final List<C7436c> m28757c() {
        return this.f24205a;
    }

    /* renamed from: d */
    public final String mo5144d() {
        return this.f24206b;
    }

    /* renamed from: e */
    public final String mo5145e() {
        return this.f24207c;
    }

    /* renamed from: f */
    public final int mo5146f() {
        return this.f24208d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24209e);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 9);
        stringBuilder.append("[Level: ");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
