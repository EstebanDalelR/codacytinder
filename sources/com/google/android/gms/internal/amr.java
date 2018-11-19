package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.support.v4.util.C0562m;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Arrays;
import java.util.List;

@zzzv
public final class amr extends aod implements zzou {
    /* renamed from: a */
    private final amk f26715a;
    /* renamed from: b */
    private final String f26716b;
    /* renamed from: c */
    private final C0562m<String, amm> f26717c;
    /* renamed from: d */
    private final C0562m<String, String> f26718d;
    @Nullable
    /* renamed from: e */
    private zzll f26719e;
    @Nullable
    /* renamed from: f */
    private View f26720f;
    /* renamed from: g */
    private final Object f26721g = new Object();
    /* renamed from: h */
    private zzos f26722h;

    public amr(String str, C0562m<String, amm> c0562m, C0562m<String, String> c0562m2, amk amk, zzll zzll, View view) {
        this.f26716b = str;
        this.f26717c = c0562m;
        this.f26718d = c0562m2;
        this.f26715a = amk;
        this.f26719e = zzll;
        this.f26720f = view;
    }

    public final void destroy() {
        fk.f16060a.post(new amt(this));
        this.f26719e = null;
        this.f26720f = null;
    }

    public final List<String> getAvailableAssetNames() {
        String[] strArr = new String[(this.f26717c.size() + this.f26718d.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f26717c.size()) {
            strArr[i3] = (String) this.f26717c.b(i2);
            i2++;
            i3++;
        }
        while (i < this.f26718d.size()) {
            strArr[i3] = (String) this.f26718d.b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    public final String getCustomTemplateId() {
        return this.f26716b;
    }

    public final zzll getVideoController() {
        return this.f26719e;
    }

    public final void performClick(String str) {
        synchronized (this.f26721g) {
            if (this.f26722h == null) {
                hx.m19913c("Attempt to call performClick before ad initialized.");
                return;
            }
            this.f26722h.zza(null, str, null, null, null);
        }
    }

    public final void recordImpression() {
        synchronized (this.f26721g) {
            if (this.f26722h == null) {
                hx.m19913c("Attempt to perform recordImpression before ad initialized.");
                return;
            }
            this.f26722h.zza(null, null);
        }
    }

    public final String zzap(String str) {
        return (String) this.f26718d.get(str);
    }

    public final zzpq zzaq(String str) {
        return (zzpq) this.f26717c.get(str);
    }

    public final void zzb(zzos zzos) {
        synchronized (this.f26721g) {
            this.f26722h = zzos;
        }
    }

    public final boolean zzf(IObjectWrapper iObjectWrapper) {
        if (this.f26722h == null) {
            hx.m19913c("Attempt to call renderVideoInMediaView before ad initialized.");
            return false;
        } else if (this.f26720f == null) {
            return false;
        } else {
            View view = (FrameLayout) C4296b.a(iObjectWrapper);
            this.f26722h.zza(view, new ams(this));
            return true;
        }
    }

    public final IObjectWrapper zzjt() {
        return C4296b.a(this.f26722h);
    }

    public final String zzju() {
        return "3";
    }

    public final amk zzjv() {
        return this.f26715a;
    }

    public final View zzjw() {
        return this.f26720f;
    }

    public final IObjectWrapper zzka() {
        return C4296b.a(this.f26722h.getContext().getApplicationContext());
    }
}
