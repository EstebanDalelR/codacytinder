package com.google.android.gms.internal;

import android.os.RemoteException;

final class aqa extends bx {
    /* renamed from: a */
    private /* synthetic */ apl f26777a;

    aqa(apl apl) {
        this.f26777a = apl;
    }

    public final void onRewardedVideoAdClosed() throws RemoteException {
        this.f26777a.f15575a.add(new aqe(this));
    }

    public final void onRewardedVideoAdFailedToLoad(int i) throws RemoteException {
        this.f26777a.f15575a.add(new aqi(this, i));
    }

    public final void onRewardedVideoAdLeftApplication() throws RemoteException {
        this.f26777a.f15575a.add(new aqg(this));
    }

    public final void onRewardedVideoAdLoaded() throws RemoteException {
        this.f26777a.f15575a.add(new aqb(this));
    }

    public final void onRewardedVideoAdOpened() throws RemoteException {
        this.f26777a.f15575a.add(new aqc(this));
    }

    public final void onRewardedVideoStarted() throws RemoteException {
        this.f26777a.f15575a.add(new aqd(this));
    }

    public final void zza(zzadh zzadh) throws RemoteException {
        this.f26777a.f15575a.add(new aqf(this, zzadh));
    }
}
