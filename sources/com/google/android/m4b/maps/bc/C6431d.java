package com.google.android.m4b.maps.bc;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.m4b.maps.ax.C4700b;
import com.google.android.m4b.maps.cc.C6586m;
import com.google.android.m4b.maps.cg.az;
import com.google.android.m4b.maps.cg.az.C5143a;
import com.google.android.m4b.maps.model.LatLng;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.m4b.maps.bc.d */
public final class C6431d implements C5143a {
    /* renamed from: a */
    private C6586m f23865a;
    /* renamed from: b */
    private final az f23866b;
    /* renamed from: c */
    private final C6430c f23867c;

    public C6431d(az azVar, C6430c c6430c) {
        this.f23866b = azVar;
        this.f23867c = c6430c;
    }

    /* renamed from: a */
    public final void mo4940a() {
        this.f23865a = m28132a(this.f23866b.getId(), this.f23866b.m32869b(), this.f23866b.m32870c(), this.f23866b.m32872e(), this.f23866b.m32874g(), this.f23866b.m32876i(), this.f23866b.m32878k(), this.f23866b.m32881n(), this.f23866b.m32882o(), this.f23866b.m32883p(), this.f23866b.m32884q(), this.f23866b.m32885r());
        this.f23867c.m28119a(this);
        this.f23867c.m28118a();
    }

    /* renamed from: b */
    public final void mo4942b() {
        this.f23867c.m28121a(this.f23865a);
        this.f23867c.m28118a();
    }

    /* renamed from: a */
    private C6586m m28132a(String str, LatLng latLng, Bitmap bitmap, float f, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, float f5, float f6) {
        C6586m c6586m = new C6586m(C4754b.m21100b(latLng), bitmap, null, Math.round(((float) bitmap.getWidth()) * f), Math.round(((float) bitmap.getHeight()) * f2), null, null, false);
        c6586m.m29415c(str);
        c6586m.m29405a(z);
        c6586m.m29416c(z2);
        c6586m.m29411b(z3 ^ 1);
        c6586m.m29398a(f5);
        c6586m.m29409b(Math.round(((float) bitmap.getWidth()) * f3), Math.round(((float) bitmap.getHeight()) * f4));
        c6586m.m29408b(f6);
        c6586m.m29403a(this.f23866b);
        return c6586m;
    }

    /* renamed from: c */
    public final void mo4943c() {
        this.f23867c.m28123b(this);
        this.f23867c.m28118a();
    }

    /* renamed from: d */
    public final void mo4944d() {
        this.f23867c.m28127c(this);
        this.f23867c.m28118a();
    }

    /* renamed from: e */
    public final void mo4945e() {
        az azVar = this.f23866b;
        C4700b e = this.f23865a.m29419e();
        azVar.m32867a(new LatLng(((double) e.m20900a()) * 1.0E-6d, ((double) e.m20901b()) * 1.0E-6d));
    }

    /* renamed from: f */
    public final boolean mo4946f() {
        return this.f23867c.m28125b(this.f23865a);
    }

    /* renamed from: g */
    public final C6586m m28140g() {
        return this.f23865a;
    }

    /* renamed from: h */
    public final az m28141h() {
        return this.f23866b;
    }

    /* renamed from: i */
    public final Rect mo4947i() {
        return this.f23865a.m29429o();
    }

    /* renamed from: a */
    public final void mo4941a(int i) {
        C6431d c6431d = this;
        int i2 = i;
        if ((i2 & 1) != 0) {
            c6431d.f23865a.m29400a(C4754b.m21100b(c6431d.f23866b.getPosition()));
            c6431d.f23867c.m28122b();
            c6431d.f23867c.m28118a();
        }
        if ((i2 & 2) != 0) {
            String title = c6431d.f23866b.getTitle();
            String snippet = c6431d.f23866b.getSnippet();
            c6431d.f23867c.m28121a(c6431d.f23865a);
            String str = snippet;
            c6431d.f23865a = m28132a(c6431d.f23866b.getId(), c6431d.f23866b.m32869b(), c6431d.f23866b.m32870c(), c6431d.f23866b.m32871d(), c6431d.f23866b.m32873f(), c6431d.f23866b.m32875h(), c6431d.f23866b.m32877j(), c6431d.f23866b.m32881n(), c6431d.f23866b.m32882o(), c6431d.f23866b.m32883p(), c6431d.f23866b.m32884q(), c6431d.f23866b.m32885r());
            c6431d.f23865a.m29404a(title);
            c6431d.f23865a.m29410b(str);
            c6431d.f23867c.m28119a(c6431d);
            c6431d.f23867c.m28118a();
        }
        int i3 = i;
        if ((i3 & 4) != 0) {
            c6431d.f23865a.m29399a(Math.round(c6431d.f23866b.m32872e() * ((float) c6431d.f23865a.m29421g().getWidth())), Math.round(c6431d.f23866b.m32874g() * ((float) c6431d.f23865a.m29421g().getHeight())));
            c6431d.f23867c.m28118a();
        }
        if ((i3 & 8) != 0) {
            c6431d.f23865a.m29411b(c6431d.f23866b.m32883p() ^ 1);
            c6431d.f23867c.m28118a();
        }
        if ((i3 & 16) != 0) {
            c6431d.f23865a.m29398a(c6431d.f23866b.m32884q());
            c6431d.f23867c.m28118a();
        }
        if ((i3 & 64) != 0) {
            boolean o = c6431d.f23866b.m32882o();
            if (!o) {
                c6431d.f23867c.m28127c(c6431d);
            }
            c6431d.f23865a.m29416c(o);
            c6431d.f23867c.m28118a();
            c6431d.f23867c.m28122b();
        }
        if ((i3 & 1024) != 0) {
            c6431d.f23865a.m29408b(c6431d.f23866b.m32885r());
            c6431d.f23867c.m28118a();
        }
        if ((i3 & 512) != 0) {
            c6431d.f23865a.m29409b(Math.round(c6431d.f23866b.m32876i() * ((float) c6431d.f23865a.m29421g().getWidth())), Math.round(c6431d.f23866b.m32878k() * ((float) c6431d.f23865a.m29421g().getHeight())));
            c6431d.f23867c.m28118a();
        }
        if ((i3 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            c6431d.f23865a.m29404a(c6431d.f23866b.m32879l());
            c6431d.f23867c.m28118a();
        }
        if ((i3 & 32) != 0) {
            c6431d.f23865a.m29405a(c6431d.f23866b.m32881n());
        }
        if ((i3 & 256) != 0) {
            c6431d.f23865a.m29410b(c6431d.f23866b.m32880m());
            c6431d.f23867c.m28118a();
        }
    }
}
