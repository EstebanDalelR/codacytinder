package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.C2530c;
import com.google.android.gms.dynamic.C4296b;

@zzzv
public final class atw extends C2530c<zzxh> {
    public atw() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public final zzxe m27252a(Activity activity) {
        try {
            IBinder zzl = ((zzxh) a(activity)).zzl(C4296b.a(activity));
            if (zzl == null) {
                return null;
            }
            IInterface queryLocalInterface = zzl.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzxe ? (zzxe) queryLocalInterface : new aty(zzl);
        } catch (Throwable e) {
            hx.m19914c("Could not create remote AdOverlay.", e);
            return null;
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ Object m27253a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzxh ? (zzxh) queryLocalInterface : new atz(iBinder);
    }
}
