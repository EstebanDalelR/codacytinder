package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.aiq.C4466a;

final class ais extends C4466a<zzks> {
    /* renamed from: a */
    private /* synthetic */ Context f22963a;
    /* renamed from: b */
    private /* synthetic */ zzjn f22964b;
    /* renamed from: c */
    private /* synthetic */ String f22965c;
    /* renamed from: d */
    private /* synthetic */ aiq f22966d;

    ais(aiq aiq, Context context, zzjn zzjn, String str) {
        this.f22966d = aiq;
        this.f22963a = context;
        this.f22964b = zzjn;
        this.f22965c = str;
        super(aiq);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4251a() throws RemoteException {
        zzks a = this.f22966d.f15312c.m27092a(this.f22963a, this.f22964b, this.f22965c, null, 3);
        if (a != null) {
            return a;
        }
        aiq.m19204a(this.f22963a, "search");
        return new akr();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4252a(zzla zzla) throws RemoteException {
        return zzla.createSearchAdManager(C4296b.a(this.f22963a), this.f22964b, this.f22965c, C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
