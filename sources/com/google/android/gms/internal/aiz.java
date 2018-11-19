package com.google.android.gms.internal;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.aiq.C4466a;

final class aiz extends C4466a<zzxe> {
    /* renamed from: a */
    private /* synthetic */ Activity f22985a;
    /* renamed from: b */
    private /* synthetic */ aiq f22986b;

    aiz(aiq aiq, Activity activity) {
        this.f22986b = aiq;
        this.f22985a = activity;
        super(aiq);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4251a() throws RemoteException {
        zzxe a = this.f22986b.f15317h.m27252a(this.f22985a);
        if (a != null) {
            return a;
        }
        aiq.m19204a(this.f22985a, "ad_overlay");
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4252a(zzla zzla) throws RemoteException {
        return zzla.createAdOverlay(C4296b.a(this.f22985a));
    }
}
