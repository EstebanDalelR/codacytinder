package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.C2530c;
import com.google.android.gms.dynamic.C4296b;

@zzzv
public final class ca extends C2530c<zzadn> {
    public ca() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* renamed from: a */
    public final zzadk m27271a(Context context, zzux zzux) {
        try {
            IBinder zza = ((zzadn) a(context)).zza(C4296b.a(context), zzux, C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof zzadk ? (zzadk) queryLocalInterface : new bv(zza);
        } catch (Throwable e) {
            hx.m19914c("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ Object m27272a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof zzadn ? (zzadn) queryLocalInterface : new bw(iBinder);
    }
}
