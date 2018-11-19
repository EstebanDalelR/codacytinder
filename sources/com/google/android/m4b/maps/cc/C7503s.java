package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bh;
import com.google.android.m4b.maps.bo.bo.C4843b;
import com.google.android.m4b.maps.bx.C5008i;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C5054e;
import com.google.android.m4b.maps.cb.C5062a;
import com.google.android.m4b.maps.cb.C6577c;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.cb.C6580k;
import java.util.HashSet;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cc.s */
public final class C7503s extends C6581d {
    /* renamed from: b */
    private static final int[] f27776b = new int[]{12, 13, 14, 15, 16, 17, 18, 19};
    /* renamed from: c */
    private static final int f27777c = 800;
    /* renamed from: d */
    private static volatile boolean f27778d = false;
    /* renamed from: j */
    private static final float f27779j = ((float) Math.sqrt(2.0d));
    /* renamed from: e */
    private final ba f27780e;
    /* renamed from: f */
    private final C6580k f27781f;
    /* renamed from: g */
    private final C5062a f27782g;
    /* renamed from: h */
    private final C6579g f27783h;
    /* renamed from: i */
    private final C6577c f27784i;

    /* renamed from: com.google.android.m4b.maps.cc.s$a */
    static class C5090a {
        /* renamed from: a */
        int f18869a;
        /* renamed from: b */
        int f18870b;

        private C5090a() {
        }
    }

    /* renamed from: a */
    public static C7503s m32724a(ba baVar, String[] strArr, C4843b c4843b) {
        String[] strArr2 = strArr;
        Set hashSet = new HashSet();
        C5090a c5090a = new C5090a();
        c4843b.mo5105b();
        while (c4843b.hasNext()) {
            C4848k c4848k = (C4848k) c4843b.next();
            if (!(c4848k instanceof bh)) {
                break;
            }
            Object obj;
            int b = ((bh) c4848k).m28633b().m21528b() - 1;
            int i = b * 4;
            if (c5090a.f18869a + i > 4096) {
                obj = null;
            } else {
                c5090a.f18869a += i;
                c5090a.f18870b += ((b * 2) + (b - 1)) * 3;
                obj = 1;
            }
            if (obj == null) {
                break;
            }
            for (int i2 : c4848k.mo5111l()) {
                if (i2 >= 0 && i2 < strArr2.length) {
                    hashSet.add(strArr2[i2]);
                }
            }
        }
        c4843b.mo5106c();
        C7503s c7503s = new C7503s(baVar, c5090a, hashSet);
        al i3 = baVar.m21626i();
        C5054e a = C5054e.m22640a();
        while (c4843b.hasNext()) {
            c4848k = c4843b.mo5104a();
            if (!(c4848k instanceof bh)) {
                return c7503s;
            }
            bh bhVar = (bh) c4848k;
            aj b2 = bhVar.m28633b().m21529b((((float) i3.m32215f()) * 1.0f) / 256.0f);
            b = (b2.m21528b() - 1) * 4;
            int a2 = c7503s.f27781f.mo5250a() + b;
            af c = i3.m32212c();
            int f = i3.m32215f();
            as e = bhVar.mo5108e();
            if (e.m21557b() > 0) {
                float f2;
                float c2 = e.m21558b(0).m21547c();
                int b3 = e.m21558b(e.m21557b() - 1).m21546b();
                float f3 = ((((float) f) * c2) * 1.25f) / 256.0f;
                float f4 = !bhVar.m28634c() ? -f3 : f3;
                c7503s.f27782g.m22667a(a2);
                c7503s.f27782g.m22672b(b3, b);
                switch (bhVar.m28635d()) {
                    case 1:
                        f2 = 360.0f / c2;
                        break;
                    case 2:
                        f2 = 240.0f / c2;
                        break;
                    case 3:
                        f2 = 160.0f / c2;
                        break;
                    default:
                        f2 = 80.0f / c2;
                        break;
                }
                a.m22646a(b2, f4, c, f, f2, c7503s.f27781f, c7503s.f27784i, c7503s.f27783h, null);
            }
            c4843b.next();
        }
        return c7503s;
    }

    private C7503s(ba baVar, C5090a c5090a, Set<String> set) {
        super(set);
        this.f27780e = baVar;
        this.f27781f = new C6580k(c5090a.f18869a);
        this.f27782g = new C5062a(c5090a.f18869a);
        this.f27783h = new C6579g(c5090a.f18869a);
        this.f27784i = new C6577c(c5090a.f18870b);
    }

    /* renamed from: a */
    public static void m32725a(C5052d c5052d) {
        GL10 x = c5052d.m22635x();
        c5052d.m22627p();
        x.glBlendFunc(1, 771);
        x.glTexEnvx(8960, 8704, 8448);
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        this.f27781f.mo7121b(c5052d);
        this.f27782g.mo5267a(c5052d);
        this.f27783h.mo7116b(c5052d);
        this.f27784i.mo7111b(c5052d);
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        this.f27781f.m29354c(c5052d);
        this.f27782g.m22673b(c5052d);
        this.f27783h.m29340c(c5052d);
        this.f27784i.m29319c(c5052d);
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (this.f27784i.mo5261b() != 0) {
            this.f27781f.mo7123d(c5052d);
            this.f27783h.mo7118d(c5052d);
            c6570b = c6570b.m29256l() - ((float) this.f27780e.m21619b()) >= 0.5f ? true : null;
            if (c6570b != null) {
                c5052d.m22635x().glMatrixMode(5890);
                c5052d.m22635x().glLoadIdentity();
                c5052d.m22635x().glScalef(f27779j, 0.0f, 0.0f);
                c5052d.m22635x().glMatrixMode(5888);
            }
            c5009j = c5009j.m22385a();
            if (c5009j == C5008i.NORMAL || c5009j == C5008i.TERRAIN) {
                c5052d.m22607a().m22653a(10).m32544a(c5052d.m22635x());
                c5052d.m22635x().glColor4x(65536, 65536, 65536, 65536);
                this.f27784i.mo7110a(c5052d, 4);
            }
            c5052d.m22607a().m22653a(11).m32544a(c5052d.m22635x());
            c5052d.m22625n();
            c5009j = f27778d;
            this.f27782g.mo5269c(c5052d);
            this.f27784i.mo7110a(c5052d, 4);
            if (c6570b != null) {
                c5052d.m22635x().glMatrixMode(5890);
                c5052d.m22635x().glLoadIdentity();
                c5052d.m22635x().glMatrixMode(5888);
            }
        }
    }

    /* renamed from: a */
    public final int mo7125a() {
        return ((this.f27781f.m29353c() + this.f27782g.m22666a()) + this.f27783h.m29336b()) + this.f27784i.m29318c();
    }

    /* renamed from: b */
    public final int mo7126b() {
        return (((this.f27781f.mo7122d() + 184) + this.f27782g.mo5268b()) + this.f27783h.mo7117c()) + this.f27784i.mo7112d();
    }
}
