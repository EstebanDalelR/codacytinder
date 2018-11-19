package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.mediation.C3778b;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzzv
public final class asn extends asf {
    /* renamed from: a */
    private final C3778b f26797a;

    public asn(C3778b c3778b) {
        this.f26797a = c3778b;
    }

    public final String getBody() {
        return this.f26797a.k();
    }

    public final String getCallToAction() {
        return this.f26797a.m();
    }

    public final Bundle getExtras() {
        return this.f26797a.c();
    }

    public final String getHeadline() {
        return this.f26797a.i();
    }

    public final List getImages() {
        List<C2355b> j = this.f26797a.j();
        if (j == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (C2355b c2355b : j) {
            arrayList.add(new amm(c2355b.a(), c2355b.b(), c2355b.c()));
        }
        return arrayList;
    }

    public final boolean getOverrideClickHandling() {
        return this.f26797a.b();
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f26797a.a();
    }

    public final String getPrice() {
        return this.f26797a.p();
    }

    public final double getStarRating() {
        return this.f26797a.n();
    }

    public final String getStore() {
        return this.f26797a.o();
    }

    public final zzll getVideoController() {
        return this.f26797a.g() != null ? this.f26797a.g().a() : null;
    }

    public final void recordImpression() {
        this.f26797a.e();
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.f26797a.c((View) C4296b.a(iObjectWrapper));
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.f26797a.a((View) C4296b.a(iObjectWrapper));
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.f26797a.b((View) C4296b.a(iObjectWrapper));
    }

    public final zzpq zzjs() {
        C2355b l = this.f26797a.l();
        return l != null ? new amm(l.a(), l.b(), l.c()) : null;
    }

    public final IObjectWrapper zzjx() {
        return null;
    }

    public final zzpm zzjy() {
        return null;
    }

    public final IObjectWrapper zzmk() {
        View d = this.f26797a.d();
        return d == null ? null : C4296b.a(d);
    }

    public final IObjectWrapper zzml() {
        View f = this.f26797a.f();
        return f == null ? null : C4296b.a(f);
    }
}
