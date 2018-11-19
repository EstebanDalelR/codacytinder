package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class by extends aau implements zzadp {
    by(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void onRewardedVideoAdClosed() throws RemoteException {
        m18801b(4, m18799a());
    }

    public final void onRewardedVideoAdFailedToLoad(int i) throws RemoteException {
        Parcel a = m18799a();
        a.writeInt(i);
        m18801b(7, a);
    }

    public final void onRewardedVideoAdLeftApplication() throws RemoteException {
        m18801b(6, m18799a());
    }

    public final void onRewardedVideoAdLoaded() throws RemoteException {
        m18801b(1, m18799a());
    }

    public final void onRewardedVideoAdOpened() throws RemoteException {
        m18801b(2, m18799a());
    }

    public final void onRewardedVideoStarted() throws RemoteException {
        m18801b(3, m18799a());
    }

    public final void zza(zzadh zzadh) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzadh);
        m18801b(5, a);
    }
}
