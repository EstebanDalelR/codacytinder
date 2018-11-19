package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bx.al;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cc.r */
public final class C6588r implements C5073c {
    /* renamed from: a */
    static final C6588r f24719a = new C6588r();
    /* renamed from: b */
    private static boolean f24720b;

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
    }

    /* renamed from: a */
    public static void m29449a(C5052d c5052d, C5009j c5009j) {
        GL10 x = c5052d.m22635x();
        c5009j = ((al) c5009j.m22389c().m22297a()).m32458j();
        boolean g = c5009j.mo5125g();
        f24720b = g;
        if (g) {
            c5009j.mo5123a(x);
            x.glLineWidth(5.0f);
            c5052d.f18691i.mo7123d(c5052d);
        }
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (f24720b != null) {
            c5052d.m22635x().glDrawArrays(2, null, 4);
        }
    }

    /* renamed from: a */
    public static void m29448a(C5052d c5052d) {
        c5052d.m22637z();
        c5052d.m22635x().glColor4x(65536, 65536, 65536, 65536);
        c5052d.f18687e.mo7123d(c5052d);
        c5052d.m22626o();
        c5052d.m22628q();
        c5052d.m22635x().glDrawArrays(5, 0, 4);
        c5052d.m22597A();
    }
}
