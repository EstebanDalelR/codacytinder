package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.C2530c;
import com.google.android.gms.dynamic.C4296b;

@zzzv
public final class aik extends C2530c<zzkv> {
    public aik() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public final zzks m27092a(Context context, zzjn zzjn, String str, zzux zzux, int i) {
        try {
            IBinder zza = ((zzkv) a(context)).zza(C4296b.a(context), zzjn, str, zzux, C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE, i);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new ajn(zza);
        } catch (Throwable e) {
            hx.m19909a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ Object m27093a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzkv ? (zzkv) queryLocalInterface : new ajo(iBinder);
    }
}
