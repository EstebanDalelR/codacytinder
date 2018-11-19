package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.aiq.C4466a;

final class aiv extends C4466a<zzlg> {
    /* renamed from: a */
    private /* synthetic */ Context f22976a;
    /* renamed from: b */
    private /* synthetic */ aiq f22977b;

    aiv(aiq aiq, Context context) {
        this.f22977b = aiq;
        this.f22976a = context;
        super(aiq);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4251a() throws RemoteException {
        zzlg b = this.f22977b.f15314e.m27115b(this.f22976a);
        if (b != null) {
            return b;
        }
        aiq.m19204a(this.f22976a, "mobile_ads_settings");
        return new akt();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4252a(zzla zzla) throws RemoteException {
        return zzla.getMobileAdsSettingsManagerWithClientJarVersion(C4296b.a(this.f22976a), C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
