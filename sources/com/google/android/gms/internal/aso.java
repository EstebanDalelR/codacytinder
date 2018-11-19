package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.mediation.C3779c;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzzv
public final class aso extends ash {
    /* renamed from: a */
    private final C3779c f26798a;

    public aso(C3779c c3779c) {
        this.f26798a = c3779c;
    }

    public final String getAdvertiser() {
        return this.f26798a.n();
    }

    public final String getBody() {
        return this.f26798a.k();
    }

    public final String getCallToAction() {
        return this.f26798a.m();
    }

    public final Bundle getExtras() {
        return this.f26798a.c();
    }

    public final String getHeadline() {
        return this.f26798a.i();
    }

    public final List getImages() {
        List<C2355b> j = this.f26798a.j();
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
        return this.f26798a.b();
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f26798a.a();
    }

    public final zzll getVideoController() {
        return this.f26798a.g() != null ? this.f26798a.g().a() : null;
    }

    public final void recordImpression() {
        this.f26798a.e();
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.f26798a.c((View) C4296b.a(iObjectWrapper));
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        this.f26798a.a((View) C4296b.a(iObjectWrapper));
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.f26798a.b((View) C4296b.a(iObjectWrapper));
    }

    public final IObjectWrapper zzjx() {
        return null;
    }

    public final zzpm zzjy() {
        return null;
    }

    public final zzpq zzjz() {
        C2355b l = this.f26798a.l();
        return l != null ? new amm(l.a(), l.b(), l.c()) : null;
    }

    public final IObjectWrapper zzmk() {
        View d = this.f26798a.d();
        return d == null ? null : C4296b.a(d);
    }

    public final IObjectWrapper zzml() {
        View f = this.f26798a.f();
        return f == null ? null : C4296b.a(f);
    }
}
