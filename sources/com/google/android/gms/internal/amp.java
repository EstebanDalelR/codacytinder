package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

@zzzv
public final class amp extends aoa implements zzov {
    /* renamed from: a */
    private String f26701a;
    /* renamed from: b */
    private List<amm> f26702b;
    /* renamed from: c */
    private String f26703c;
    /* renamed from: d */
    private zzpq f26704d;
    /* renamed from: e */
    private String f26705e;
    /* renamed from: f */
    private String f26706f;
    @Nullable
    /* renamed from: g */
    private amk f26707g;
    /* renamed from: h */
    private Bundle f26708h;
    @Nullable
    /* renamed from: i */
    private zzll f26709i;
    @Nullable
    /* renamed from: j */
    private View f26710j;
    @Nullable
    /* renamed from: k */
    private IObjectWrapper f26711k;
    @Nullable
    /* renamed from: l */
    private String f26712l;
    /* renamed from: m */
    private Object f26713m = new Object();
    /* renamed from: n */
    private zzos f26714n;

    public amp(String str, List<amm> list, String str2, zzpq zzpq, String str3, String str4, @Nullable amk amk, Bundle bundle, zzll zzll, View view, IObjectWrapper iObjectWrapper, String str5) {
        this.f26701a = str;
        this.f26702b = list;
        this.f26703c = str2;
        this.f26704d = zzpq;
        this.f26705e = str3;
        this.f26706f = str4;
        this.f26707g = amk;
        this.f26708h = bundle;
        this.f26709i = zzll;
        this.f26710j = view;
        this.f26711k = iObjectWrapper;
        this.f26712l = str5;
    }

    public final void destroy() {
        fk.f16060a.post(new amq(this));
        this.f26701a = null;
        this.f26702b = null;
        this.f26703c = null;
        this.f26704d = null;
        this.f26705e = null;
        this.f26706f = null;
        this.f26707g = null;
        this.f26708h = null;
        this.f26713m = null;
        this.f26709i = null;
        this.f26710j = null;
    }

    public final String getAdvertiser() {
        return this.f26706f;
    }

    public final String getBody() {
        return this.f26703c;
    }

    public final String getCallToAction() {
        return this.f26705e;
    }

    public final String getCustomTemplateId() {
        return "";
    }

    public final Bundle getExtras() {
        return this.f26708h;
    }

    public final String getHeadline() {
        return this.f26701a;
    }

    public final List getImages() {
        return this.f26702b;
    }

    @Nullable
    public final String getMediationAdapterClassName() {
        return this.f26712l;
    }

    public final zzll getVideoController() {
        return this.f26709i;
    }

    public final void performClick(Bundle bundle) {
        synchronized (this.f26713m) {
            if (this.f26714n == null) {
                hx.m19913c("Attempt to perform click before content ad initialized.");
                return;
            }
            this.f26714n.performClick(bundle);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        synchronized (this.f26713m) {
            if (this.f26714n == null) {
                hx.m19913c("Attempt to record impression before content ad initialized.");
                return false;
            }
            boolean recordImpression = this.f26714n.recordImpression(bundle);
            return recordImpression;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        synchronized (this.f26713m) {
            if (this.f26714n == null) {
                hx.m19913c("Attempt to perform click before app install ad initialized.");
                return;
            }
            this.f26714n.reportTouchEvent(bundle);
        }
    }

    public final void zzb(zzos zzos) {
        synchronized (this.f26713m) {
            this.f26714n = zzos;
        }
    }

    public final IObjectWrapper zzjt() {
        return C4296b.a(this.f26714n);
    }

    public final String zzju() {
        return "1";
    }

    public final amk zzjv() {
        return this.f26707g;
    }

    public final View zzjw() {
        return this.f26710j;
    }

    public final IObjectWrapper zzjx() {
        return this.f26711k;
    }

    public final zzpm zzjy() {
        return this.f26707g;
    }

    public final zzpq zzjz() {
        return this.f26704d;
    }
}
