package com.google.android.m4b.maps.bs;

import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.az;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bw.C4976e;

/* renamed from: com.google.android.m4b.maps.bs.g */
public final class C6539g implements C4904l {
    /* renamed from: b */
    private static az f24262b = new aa();
    /* renamed from: a */
    private C4976e<ba, az> f24263a = new C4976e(256);

    public C6539g(int i) {
    }

    /* renamed from: a */
    public final void mo5153a(ba baVar, az azVar) {
        synchronized (this.f24263a) {
            this.f24263a.m22255c(baVar, azVar);
        }
    }

    public final void a_(ba baVar) {
        mo5153a(baVar, f24262b);
    }

    /* renamed from: b */
    public final boolean mo5157b(ba baVar) {
        synchronized (this.f24263a) {
            baVar = this.f24263a.m22251b((Object) baVar) != null ? true : null;
        }
        return baVar;
    }

    /* renamed from: c */
    public final az mo5158c(ba baVar) {
        az azVar;
        synchronized (this.f24263a) {
            azVar = (az) this.f24263a.m22251b((Object) baVar);
        }
        return azVar;
    }

    /* renamed from: a */
    public final boolean mo5154a() {
        synchronized (this.f24263a) {
            this.f24263a.m22247a();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo5155a(az azVar) {
        return azVar == f24262b ? true : null;
    }
}
