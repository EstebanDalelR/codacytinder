package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.aiq.C4466a;

final class aiu extends C4466a<zzkn> {
    /* renamed from: a */
    private /* synthetic */ Context f22972a;
    /* renamed from: b */
    private /* synthetic */ String f22973b;
    /* renamed from: c */
    private /* synthetic */ zzux f22974c;
    /* renamed from: d */
    private /* synthetic */ aiq f22975d;

    aiu(aiq aiq, Context context, String str, zzux zzux) {
        this.f22975d = aiq;
        this.f22972a = context;
        this.f22973b = str;
        this.f22974c = zzux;
        super(aiq);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4251a() throws RemoteException {
        zzkn a = this.f22975d.f15313d.m27090a(this.f22972a, this.f22973b, this.f22974c);
        if (a != null) {
            return a;
        }
        aiq.m19204a(this.f22972a, "native_ad");
        return new akn();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo4252a(zzla zzla) throws RemoteException {
        return zzla.createAdLoaderBuilder(C4296b.a(this.f22972a), this.f22973b, this.f22974c, C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
