package com.google.android.m4b.maps.bj;

import com.google.android.m4b.maps.ay.C4725p;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bf;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bp;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bz.C6570b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bj.e */
public final class C7452e extends C6464i {
    /* renamed from: d */
    private boolean f27345d;
    /* renamed from: e */
    private long f27346e = null;
    /* renamed from: f */
    private bp f27347f;
    /* renamed from: g */
    private bp f27348g;
    /* renamed from: h */
    private List<ba> f27349h;
    /* renamed from: i */
    private List<ba> f27350i;

    public C7452e(bg bgVar, bf bfVar, C4981g c4981g) {
        super(bgVar, bfVar, c4981g);
        bgVar = ((bgVar == bg.f17754j || bgVar == bg.f17755k || bgVar == bg.f17756l) && C4725p.m21030g() > 1.0d) ? true : null;
        this.f27345d = bgVar;
    }

    /* renamed from: a */
    public final List<ba> mo5020a(C6570b c6570b) {
        bp u = c6570b.m29265u();
        int i = 0;
        if (this.f27347f != null && u.equals(this.f27347f)) {
            boolean z;
            if (this.f27349h.isEmpty()) {
                z = true;
            } else {
                z = ((ba) this.f27349h.get(0)).m21627j().equals(this.b.m21648a());
            }
            if (z) {
                return this.f27349h;
            }
        }
        this.f27346e++;
        List a = ba.m21607a(u.mo5129a(), m32164c(c6570b), this.b.m21648a());
        if (c6570b.m29255k() == 0.0f && c6570b.m29254j() == null) {
            i = 1;
        }
        if (i == 0) {
            C7452e.m32163a(u, a);
        }
        this.f27349h = a;
        this.f27347f = u;
        return this.f27349h;
    }

    /* renamed from: a */
    public final long mo5017a() {
        return this.f27346e;
    }

    /* renamed from: b */
    public final List<ba> m32168b(C6570b c6570b) {
        bp u = c6570b.m29265u();
        if (this.f27348g != null && u.equals(this.f27348g)) {
            return this.f27350i;
        }
        List b = ba.m21610b(u.mo5129a(), m32164c(c6570b));
        c6570b = (c6570b.m29255k() == 0.0f && c6570b.m29254j() == null) ? true : null;
        if (c6570b == null) {
            C7452e.m32163a(u, b);
        }
        this.f27348g = u;
        this.f27350i = b;
        return this.f27350i;
    }

    /* renamed from: a */
    private static void m32163a(bp bpVar, ArrayList<ba> arrayList) {
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ba baVar = (ba) arrayList.get(i2);
            if (bpVar.mo5135b(baVar.m21626i())) {
                int i3 = i + 1;
                arrayList.set(i, baVar);
                i = i3;
            }
        }
        for (size--; size >= i; size--) {
            arrayList.remove(size);
        }
    }

    /* renamed from: a */
    public final float mo5016a(af afVar) {
        if (this.f27345d) {
            return super.mo5016a(afVar) - 1.0f;
        }
        return super.mo5016a(afVar);
    }

    /* renamed from: c */
    private int m32164c(C6570b c6570b) {
        float l = c6570b.m29256l();
        c6570b = this.c.m22369a(c6570b.m29242b(), this.a);
        return c6570b != null ? c6570b.m22354a(l) : (int) l;
    }
}
