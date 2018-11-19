package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class akc extends aau implements zzlo {
    akc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void onVideoEnd() throws RemoteException {
        m18801b(4, m18799a());
    }

    public final void onVideoMute(boolean z) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18806a(a, z);
        m18801b(5, a);
    }

    public final void onVideoPause() throws RemoteException {
        m18801b(3, m18799a());
    }

    public final void onVideoPlay() throws RemoteException {
        m18801b(2, m18799a());
    }

    public final void onVideoStart() throws RemoteException {
        m18801b(1, m18799a());
    }
}
