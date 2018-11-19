package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.widget.FrameLayout;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.C2530c;
import com.google.android.gms.dynamic.C4296b;

@zzzv
public final class aot extends C2530c<zzpx> {
    public aot() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final zzpu m27173a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder zza = ((zzpx) a(context)).zza(C4296b.a(context), C4296b.a(frameLayout), C4296b.a(frameLayout2), C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzpu ? (zzpu) queryLocalInterface : new ans(zza);
        } catch (Throwable e) {
            hx.m19914c("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ Object m27174a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzpx ? (zzpx) queryLocalInterface : new ant(iBinder);
    }
}
