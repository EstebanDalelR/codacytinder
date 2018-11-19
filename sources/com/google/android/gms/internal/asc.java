package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class asc extends aau implements zzvd {
    asc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void onAdClicked() throws RemoteException {
        m18801b(1, m18799a());
    }

    public final void onAdClosed() throws RemoteException {
        m18801b(2, m18799a());
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        Parcel a = m18799a();
        a.writeInt(i);
        m18801b(3, a);
    }

    public final void onAdImpression() throws RemoteException {
        m18801b(8, m18799a());
    }

    public final void onAdLeftApplication() throws RemoteException {
        m18801b(4, m18799a());
    }

    public final void onAdLoaded() throws RemoteException {
        m18801b(6, m18799a());
    }

    public final void onAdOpened() throws RemoteException {
        m18801b(5, m18799a());
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        a.writeString(str2);
        m18801b(9, a);
    }

    public final void onVideoEnd() throws RemoteException {
        m18801b(11, m18799a());
    }

    public final void zza(zzvg zzvg) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzvg);
        m18801b(7, a);
    }

    public final void zzb(zzqm zzqm, String str) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzqm);
        a.writeString(str);
        m18801b(10, a);
    }
}
