package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bx.C5008i;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bx.ae;
import com.google.android.m4b.maps.bx.an;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.ce.C5094b;
import java.util.Collection;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.cc.e */
public final class C7496e implements C6587q {
    /* renamed from: a */
    private final ba f27689a;
    /* renamed from: b */
    private final al f27690b;
    /* renamed from: c */
    private final C6579g f27691c = new C6579g(4);

    /* renamed from: a */
    public final void mo7128a(int i, Collection collection) {
    }

    /* renamed from: a */
    public final void mo7129a(long j) {
    }

    /* renamed from: a */
    public final void mo7130a(C5094b c5094b) {
    }

    /* renamed from: a */
    public final void mo7131a(Collection<String> collection) {
    }

    /* renamed from: a */
    public final void mo7132a(boolean z) {
    }

    /* renamed from: a */
    public final boolean mo7133a() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo7134a(C4712d c4712d) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo7135a(ae aeVar) {
        return false;
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
    }

    /* renamed from: b */
    public final boolean mo7138b(C4712d c4712d) {
        return false;
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
    }

    /* renamed from: c */
    public final boolean mo7139c() {
        return false;
    }

    /* renamed from: d */
    public final void mo7140d() {
    }

    /* renamed from: e */
    public final int mo7141e() {
        return -1;
    }

    public C7496e(ba baVar, int i) {
        this.f27689a = baVar;
        this.f27690b = this.f27689a.m21626i();
        i = (i * 65536) / 32;
        this.f27691c.mo5254a(0, 0);
        this.f27691c.mo5254a(0, i);
        this.f27691c.mo5254a(i, 0);
        this.f27691c.mo5254a(i, i);
    }

    /* renamed from: a */
    public final int mo7127a(C6570b c6570b, C5008i c5008i) {
        return c5008i == C5008i.AMBIENT ? null : 1;
    }

    /* renamed from: b */
    public final void mo7137b(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (c5009j.m22388b() <= 1) {
            GL10 x = c5052d.m22635x();
            x.glBlendFunc(1, 771);
            x.glTexEnvx(8960, 8704, 7681);
            c5052d.m22627p();
            c5052d.f18687e.mo7123d(c5052d);
            c5052d.m22607a().m22653a(20).m32544a(x);
        }
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        c5009j = c5052d.m22635x();
        c5009j.glPushMatrix();
        an.m22324a(c5052d, c6570b, this.f27690b.m32212c(), (float) this.f27690b.m32215f());
        this.f27691c.mo7118d(c5052d);
        c5009j.glDrawArrays(5, null, 4);
        c5009j.glPopMatrix();
    }

    /* renamed from: b */
    public final ba mo7136b() {
        return this.f27689a;
    }

    /* renamed from: f */
    public final int mo7142f() {
        return this.f27691c.m29336b();
    }

    /* renamed from: g */
    public final int mo7143g() {
        return this.f27691c.mo7117c();
    }
}
