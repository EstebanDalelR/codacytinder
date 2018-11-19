package com.google.android.m4b.maps.bo;

import android.util.Log;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.cg.C5196z;
import com.google.android.m4b.maps.cg.ab;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bo.p */
public class C6524p implements C5196z {
    /* renamed from: a */
    private final C7436c f24199a;
    /* renamed from: b */
    private final List<C6525q> f24200b;
    /* renamed from: c */
    private final int f24201c;
    /* renamed from: d */
    private final af f24202d;
    /* renamed from: e */
    private final long f24203e;
    /* renamed from: f */
    private boolean f24204f;

    /* renamed from: c */
    public final /* synthetic */ ab mo5139c(C4701c c4701c) {
        return m28745a(c4701c);
    }

    protected C6524p(C7436c c7436c, List<C6525q> list, int i, boolean z, af afVar, long j) {
        this.f24199a = c7436c;
        this.f24200b = list;
        this.f24201c = i;
        this.f24204f = z;
        this.f24202d = afVar;
        this.f24203e = j;
    }

    /* renamed from: a */
    public static C6524p m28742a(C4662a c4662a, long j) {
        C7436c b = C7436c.m32017b(c4662a.m20843h(1));
        if (b == null) {
            if (C4728u.m21050a("INDOOR", 3) != null) {
                j = "INDOOR";
                String str = "malformed building id: ";
                c4662a = String.valueOf(c4662a.m20843h(1));
                Log.d(j, c4662a.length() != 0 ? str.concat(c4662a) : new String(str));
            }
            return null;
        }
        int i;
        int k = c4662a.m20846k(2);
        List a = au.m20524a(k);
        for (int i2 = 0; i2 < k; i2++) {
            C6525q a2 = C6525q.m28754a(c4662a.m20833c(2, i2));
            if (a2 != null) {
                a.add(a2);
            }
        }
        boolean b2 = c4662a.m20831b(4);
        int d = c4662a.m20835d(3);
        if (d < 0 || d >= k) {
            d = 0;
        }
        if (!b2) {
            if (k != 0) {
                i = d;
                return new C6524p(b, a, i, b2, c4662a.m20845j(5) ? af.m21457a(c4662a.m20842g(5)) : null, j);
            }
        }
        i = -1;
        if (c4662a.m20845j(5)) {
        }
        return new C6524p(b, a, i, b2, c4662a.m20845j(5) ? af.m21457a(c4662a.m20842g(5)) : null, j);
    }

    /* renamed from: a */
    public final C7436c mo5136a() {
        return this.f24199a;
    }

    /* renamed from: b */
    public final List<C6525q> mo5138b() {
        return this.f24200b;
    }

    /* renamed from: a */
    public final C6525q m28744a(C7436c c7436c) {
        for (C6525q c6525q : this.f24200b) {
            if (c7436c.equals(c6525q.mo5143b())) {
                return c6525q;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C6525q m28745a(C4701c c4701c) {
        return m28744a(c4701c.m20902a());
    }

    /* renamed from: b */
    public final int mo5137b(C4701c c4701c) {
        c4701c = m28744a(c4701c.m20902a());
        if (c4701c == null) {
            return -1;
        }
        return this.f24200b.indexOf(m28744a(c4701c.mo5143b()));
    }

    /* renamed from: c */
    public final C6525q m28749c() {
        int i = this.f24201c;
        if (i >= 0) {
            if (i < this.f24200b.size()) {
                return (C6525q) this.f24200b.get(i);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final int mo5140d() {
        return this.f24201c;
    }

    /* renamed from: e */
    public final boolean mo5141e() {
        return this.f24204f;
    }

    /* renamed from: f */
    public final af m28753f() {
        return this.f24202d;
    }

    /* renamed from: a */
    public final boolean m28746a(C4712d c4712d) {
        return (this.f24203e < 0 || C4712d.m20956b() <= this.f24203e) ? null : true;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f24199a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
        stringBuilder.append("[Building: ");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
