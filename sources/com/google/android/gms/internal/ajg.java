package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class ajg extends aau implements zzkh {
    ajg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void onAdClicked() throws RemoteException {
        m18801b(6, m18799a());
    }

    public final void onAdClosed() throws RemoteException {
        m18801b(1, m18799a());
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        Parcel a = m18799a();
        a.writeInt(i);
        m18801b(2, a);
    }

    public final void onAdImpression() throws RemoteException {
        m18801b(7, m18799a());
    }

    public final void onAdLeftApplication() throws RemoteException {
        m18801b(3, m18799a());
    }

    public final void onAdLoaded() throws RemoteException {
        m18801b(4, m18799a());
    }

    public final void onAdOpened() throws RemoteException {
        m18801b(5, m18799a());
    }
}
