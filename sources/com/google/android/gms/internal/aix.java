package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.aiq.C4466a;

final class aix extends C4466a<zzadk> {
    /* renamed from: a */
    private /* synthetic */ Context f22982a;
    /* renamed from: b */
    private /* synthetic */ zzux f22983b;
    /* renamed from: c */
    private /* synthetic */ aiq f22984c;

    aix(aiq aiq, Context context, zzux zzux) {
        this.f22984c = aiq;
        this.f22982a = context;
        this.f22983b = zzux;
        super(aiq);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4251a() throws RemoteException {
        zzadk a = this.f22984c.f15316g.m27271a(this.f22982a, this.f22983b);
        if (a != null) {
            return a;
        }
        aiq.m19204a(this.f22982a, "rewarded_video");
        return new akv();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4252a(zzla zzla) throws RemoteException {
        return zzla.createRewardedVideoAd(C4296b.a(this.f22982a), this.f22983b, C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
