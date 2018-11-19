package com.google.android.gms.internal;

import android.os.RemoteException;

final class apm extends ajf {
    /* renamed from: a */
    private /* synthetic */ apl f26768a;

    apm(apl apl) {
        this.f26768a = apl;
    }

    public final void onAdClicked() throws RemoteException {
        this.f26768a.f15575a.add(new apt(this));
    }

    public final void onAdClosed() throws RemoteException {
        this.f26768a.f15575a.add(new apn(this));
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        this.f26768a.f15575a.add(new apo(this, i));
        ec.m27332a("Pooled interstitial failed to load.");
    }

    public final void onAdImpression() throws RemoteException {
        this.f26768a.f15575a.add(new aps(this));
    }

    public final void onAdLeftApplication() throws RemoteException {
        this.f26768a.f15575a.add(new app(this));
    }

    public final void onAdLoaded() throws RemoteException {
        this.f26768a.f15575a.add(new apq(this));
        ec.m27332a("Pooled interstitial loaded.");
    }

    public final void onAdOpened() throws RemoteException {
        this.f26768a.f15575a.add(new apr(this));
    }
}
