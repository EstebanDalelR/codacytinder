package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.ar;
import java.util.Random;

final class aqm extends ajf {
    /* renamed from: a */
    private final zzkh f26778a;

    aqm(zzkh zzkh) {
        this.f26778a = zzkh;
    }

    public final void onAdClicked() throws RemoteException {
        this.f26778a.onAdClicked();
    }

    public final void onAdClosed() throws RemoteException {
        if (aqv.m19453a()) {
            int intValue = ((Integer) aja.m19221f().m19334a(alo.aN)).intValue();
            int intValue2 = ((Integer) aja.m19221f().m19334a(alo.aO)).intValue();
            if (intValue > 0) {
                if (intValue2 >= 0) {
                    fk.f16060a.postDelayed(aqn.f15583a, (long) (intValue + new Random().nextInt(intValue2 + 1)));
                }
            }
            ar.q().m19422a();
        }
        this.f26778a.onAdClosed();
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        this.f26778a.onAdFailedToLoad(i);
    }

    public final void onAdImpression() throws RemoteException {
        this.f26778a.onAdImpression();
    }

    public final void onAdLeftApplication() throws RemoteException {
        this.f26778a.onAdLeftApplication();
    }

    public final void onAdLoaded() throws RemoteException {
        this.f26778a.onAdLoaded();
    }

    public final void onAdOpened() throws RemoteException {
        this.f26778a.onAdOpened();
    }
}
