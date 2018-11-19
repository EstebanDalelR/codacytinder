package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.aiq.C4466a;

final class ait extends C4466a<zzks> {
    /* renamed from: a */
    private /* synthetic */ Context f22967a;
    /* renamed from: b */
    private /* synthetic */ zzjn f22968b;
    /* renamed from: c */
    private /* synthetic */ String f22969c;
    /* renamed from: d */
    private /* synthetic */ zzux f22970d;
    /* renamed from: e */
    private /* synthetic */ aiq f22971e;

    ait(aiq aiq, Context context, zzjn zzjn, String str, zzux zzux) {
        this.f22971e = aiq;
        this.f22967a = context;
        this.f22968b = zzjn;
        this.f22969c = str;
        this.f22970d = zzux;
        super(aiq);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4251a() throws RemoteException {
        zzks a = this.f22971e.f15312c.m27092a(this.f22967a, this.f22968b, this.f22969c, this.f22970d, 2);
        if (a != null) {
            return a;
        }
        aiq.m19204a(this.f22967a, "interstitial");
        return new akr();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4252a(zzla zzla) throws RemoteException {
        return zzla.createInterstitialAdManager(C4296b.a(this.f22967a), this.f22968b, this.f22969c, this.f22970d, C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
