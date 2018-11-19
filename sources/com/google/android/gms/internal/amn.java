package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

@zzzv
public final class amn extends anx implements zzov {
    /* renamed from: a */
    private String f26685a;
    /* renamed from: b */
    private List<amm> f26686b;
    /* renamed from: c */
    private String f26687c;
    /* renamed from: d */
    private zzpq f26688d;
    /* renamed from: e */
    private String f26689e;
    /* renamed from: f */
    private double f26690f;
    /* renamed from: g */
    private String f26691g;
    /* renamed from: h */
    private String f26692h;
    @Nullable
    /* renamed from: i */
    private amk f26693i;
    /* renamed from: j */
    private Bundle f26694j;
    @Nullable
    /* renamed from: k */
    private zzll f26695k;
    @Nullable
    /* renamed from: l */
    private View f26696l;
    @Nullable
    /* renamed from: m */
    private IObjectWrapper f26697m;
    @Nullable
    /* renamed from: n */
    private String f26698n;
    /* renamed from: o */
    private Object f26699o = new Object();
    /* renamed from: p */
    private zzos f26700p;

    public amn(String str, List<amm> list, String str2, zzpq zzpq, String str3, double d, String str4, String str5, @Nullable amk amk, Bundle bundle, zzll zzll, View view, IObjectWrapper iObjectWrapper, String str6) {
        this.f26685a = str;
        this.f26686b = list;
        this.f26687c = str2;
        this.f26688d = zzpq;
        this.f26689e = str3;
        this.f26690f = d;
        this.f26691g = str4;
        this.f26692h = str5;
        this.f26693i = amk;
        this.f26694j = bundle;
        this.f26695k = zzll;
        this.f26696l = view;
        this.f26697m = iObjectWrapper;
        this.f26698n = str6;
    }

    public final void destroy() {
        fk.f16060a.post(new amo(this));
        this.f26685a = null;
        this.f26686b = null;
        this.f26687c = null;
        this.f26688d = null;
        this.f26689e = null;
        this.f26690f = 0.0d;
        this.f26691g = null;
        this.f26692h = null;
        this.f26693i = null;
        this.f26694j = null;
        this.f26699o = null;
        this.f26695k = null;
        this.f26696l = null;
    }

    public final String getBody() {
        return this.f26687c;
    }

    public final String getCallToAction() {
        return this.f26689e;
    }

    public final String getCustomTemplateId() {
        return "";
    }

    public final Bundle getExtras() {
        return this.f26694j;
    }

    public final String getHeadline() {
        return this.f26685a;
    }

    public final List getImages() {
        return this.f26686b;
    }

    @Nullable
    public final String getMediationAdapterClassName() {
        return this.f26698n;
    }

    public final String getPrice() {
        return this.f26692h;
    }

    public final double getStarRating() {
        return this.f26690f;
    }

    public final String getStore() {
        return this.f26691g;
    }

    public final zzll getVideoController() {
        return this.f26695k;
    }

    public final void performClick(Bundle bundle) {
        synchronized (this.f26699o) {
            if (this.f26700p == null) {
                hx.m19913c("Attempt to perform click before app install ad initialized.");
                return;
            }
            this.f26700p.performClick(bundle);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        synchronized (this.f26699o) {
            if (this.f26700p == null) {
                hx.m19913c("Attempt to record impression before app install ad initialized.");
                return false;
            }
            boolean recordImpression = this.f26700p.recordImpression(bundle);
            return recordImpression;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        synchronized (this.f26699o) {
            if (this.f26700p == null) {
                hx.m19913c("Attempt to perform click before app install ad initialized.");
                return;
            }
            this.f26700p.reportTouchEvent(bundle);
        }
    }

    public final void zzb(zzos zzos) {
        synchronized (this.f26699o) {
            this.f26700p = zzos;
        }
    }

    public final zzpq zzjs() {
        return this.f26688d;
    }

    public final IObjectWrapper zzjt() {
        return C4296b.a(this.f26700p);
    }

    public final String zzju() {
        return "2";
    }

    public final amk zzjv() {
        return this.f26693i;
    }

    public final View zzjw() {
        return this.f26696l;
    }

    public final IObjectWrapper zzjx() {
        return this.f26697m;
    }

    public final zzpm zzjy() {
        return this.f26693i;
    }
}
