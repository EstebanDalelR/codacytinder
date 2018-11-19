package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.C2530c;
import com.google.android.gms.dynamic.C4296b;

@zzzv
public final class akm extends C2530c<zzlj> {
    public akm() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* renamed from: a */
    protected final /* synthetic */ Object m27114a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof zzlj ? (zzlj) queryLocalInterface : new ajy(iBinder);
    }

    /* renamed from: b */
    public final zzlg m27115b(Context context) {
        try {
            IBinder zza = ((zzlj) a(context)).zza(C4296b.a(context), C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzlg ? (zzlg) queryLocalInterface : new ajx(zza);
        } catch (Throwable e) {
            hx.m19914c("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
