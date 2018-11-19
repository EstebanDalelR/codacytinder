package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.C2530c;
import com.google.android.gms.dynamic.C4296b;

@zzzv
public final class aij extends C2530c<zzkq> {
    public aij() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public final zzkn m27090a(Context context, String str, zzux zzux) {
        try {
            IBinder zza = ((zzkq) a(context)).zza(C4296b.a(context), str, zzux, C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzkn ? (zzkn) queryLocalInterface : new ajk(zza);
        } catch (Throwable e) {
            hx.m19914c("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ Object m27091a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzkq ? (zzkq) queryLocalInterface : new ajl(iBinder);
    }
}
