package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.C4458k;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.bn;
import com.google.android.gms.dynamic.IObjectWrapper;

@zzzv
public final class aqt extends ajm {
    /* renamed from: a */
    private final String f26779a;
    /* renamed from: b */
    private boolean f26780b;
    /* renamed from: c */
    private final apk f26781c;
    @Nullable
    /* renamed from: d */
    private C4458k f26782d;
    /* renamed from: e */
    private final aql f26783e;

    public aqt(Context context, String str, zzux zzux, zzakd zzakd, bn bnVar) {
        this(str, new apk(context, zzux, zzakd, bnVar));
    }

    private aqt(String str, apk apk) {
        this.f26779a = str;
        this.f26781c = apk;
        this.f26783e = new aql();
        ar.q().m19423a(apk);
    }

    /* renamed from: a */
    private final void m31499a() {
        if (this.f26782d == null) {
            this.f26782d = this.f26781c.m19402a(this.f26779a);
            this.f26783e.m19410a(this.f26782d);
        }
    }

    public final void destroy() throws RemoteException {
        if (this.f26782d != null) {
            this.f26782d.destroy();
        }
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Nullable
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f26782d != null ? this.f26782d.getMediationAdapterClassName() : null;
    }

    public final zzll getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final boolean isLoading() throws RemoteException {
        return this.f26782d != null && this.f26782d.isLoading();
    }

    public final boolean isReady() throws RemoteException {
        return this.f26782d != null && this.f26782d.isReady();
    }

    public final void pause() throws RemoteException {
        if (this.f26782d != null) {
            this.f26782d.pause();
        }
    }

    public final void resume() throws RemoteException {
        if (this.f26782d != null) {
            this.f26782d.resume();
        }
    }

    public final void setImmersiveMode(boolean z) {
        this.f26780b = z;
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        m31499a();
        if (this.f26782d != null) {
            this.f26782d.setManualImpressionsEnabled(z);
        }
    }

    public final void setUserId(String str) {
    }

    public final void showInterstitial() throws RemoteException {
        if (this.f26782d != null) {
            this.f26782d.setImmersiveMode(this.f26780b);
            this.f26782d.showInterstitial();
            return;
        }
        hx.m19916e("Interstitial ad must be loaded before showInterstitial().");
    }

    public final void stopLoading() throws RemoteException {
        if (this.f26782d != null) {
            this.f26782d.stopLoading();
        }
    }

    public final void zza(zzadp zzadp) {
        this.f26783e.f15582e = zzadp;
        if (this.f26782d != null) {
            this.f26783e.m19410a(this.f26782d);
        }
    }

    public final void zza(zzjn zzjn) throws RemoteException {
        if (this.f26782d != null) {
            this.f26782d.zza(zzjn);
        }
    }

    public final void zza(zzke zzke) throws RemoteException {
        this.f26783e.f15581d = zzke;
        if (this.f26782d != null) {
            this.f26783e.m19410a(this.f26782d);
        }
    }

    public final void zza(zzkh zzkh) throws RemoteException {
        this.f26783e.f15578a = zzkh;
        if (this.f26782d != null) {
            this.f26783e.m19410a(this.f26782d);
        }
    }

    public final void zza(zzkx zzkx) throws RemoteException {
        this.f26783e.f15579b = zzkx;
        if (this.f26782d != null) {
            this.f26783e.m19410a(this.f26782d);
        }
    }

    public final void zza(zzld zzld) throws RemoteException {
        m31499a();
        if (this.f26782d != null) {
            this.f26782d.zza(zzld);
        }
    }

    public final void zza(zzlr zzlr) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzmr zzmr) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final void zza(zzoa zzoa) throws RemoteException {
        this.f26783e.f15580c = zzoa;
        if (this.f26782d != null) {
            this.f26783e.m19410a(this.f26782d);
        }
    }

    public final void zza(zzxl zzxl) throws RemoteException {
        hx.m19916e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void zza(zzxr zzxr, String str) throws RemoteException {
        hx.m19916e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    public final boolean zzb(zzjj zzjj) throws RemoteException {
        if (!aqo.m19411a(zzjj).contains("gw")) {
            m31499a();
        }
        if (aqo.m19411a(zzjj).contains("_skipMediation")) {
            m31499a();
        }
        if (zzjj.zzbdm != null) {
            m31499a();
        }
        if (this.f26782d != null) {
            return this.f26782d.zzb(zzjj);
        }
        aqo q = ar.q();
        if (aqo.m19411a(zzjj).contains("_ad")) {
            q.m19424b(zzjj, this.f26779a);
        }
        aqr a = q.m19421a(zzjj, this.f26779a);
        if (a != null) {
            if (a.f15597e) {
                aqs.m19439a().m19443d();
            } else {
                a.m19438a();
                aqs.m19439a().m19444e();
            }
            this.f26782d = a.f15593a;
            a.f15595c.m19406a(this.f26783e);
            this.f26783e.m19410a(this.f26782d);
            return a.f15598f;
        }
        m31499a();
        aqs.m19439a().m19444e();
        return this.f26782d.zzb(zzjj);
    }

    @Nullable
    public final IObjectWrapper zzbr() throws RemoteException {
        return this.f26782d != null ? this.f26782d.zzbr() : null;
    }

    @Nullable
    public final zzjn zzbs() throws RemoteException {
        return this.f26782d != null ? this.f26782d.zzbs() : null;
    }

    public final void zzbu() throws RemoteException {
        if (this.f26782d != null) {
            this.f26782d.zzbu();
        } else {
            hx.m19916e("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    public final zzkx zzcd() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final zzkh zzce() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Nullable
    public final String zzcp() throws RemoteException {
        return this.f26782d != null ? this.f26782d.zzcp() : null;
    }
}
