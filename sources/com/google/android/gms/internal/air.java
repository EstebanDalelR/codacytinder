package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.aiq.C4466a;

final class air extends C4466a<zzks> {
    /* renamed from: a */
    private /* synthetic */ Context f22958a;
    /* renamed from: b */
    private /* synthetic */ zzjn f22959b;
    /* renamed from: c */
    private /* synthetic */ String f22960c;
    /* renamed from: d */
    private /* synthetic */ zzux f22961d;
    /* renamed from: e */
    private /* synthetic */ aiq f22962e;

    air(aiq aiq, Context context, zzjn zzjn, String str, zzux zzux) {
        this.f22962e = aiq;
        this.f22958a = context;
        this.f22959b = zzjn;
        this.f22960c = str;
        this.f22961d = zzux;
        super(aiq);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4251a() throws RemoteException {
        zzks a = this.f22962e.f15312c.m27092a(this.f22958a, this.f22959b, this.f22960c, this.f22961d, 1);
        if (a != null) {
            return a;
        }
        aiq.m19204a(this.f22958a, "banner");
        return new akr();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4252a(zzla zzla) throws RemoteException {
        return zzla.createBannerAdManager(C4296b.a(this.f22958a), this.f22959b, this.f22960c, this.f22961d, C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
