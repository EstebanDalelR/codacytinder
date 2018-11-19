package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;

public interface zzvd extends IInterface {
    void onAdClicked() throws RemoteException;

    void onAdClosed() throws RemoteException;

    void onAdFailedToLoad(int i) throws RemoteException;

    void onAdImpression() throws RemoteException;

    void onAdLeftApplication() throws RemoteException;

    void onAdLoaded() throws RemoteException;

    void onAdOpened() throws RemoteException;

    void onAppEvent(String str, String str2) throws RemoteException;

    void onVideoEnd() throws RemoteException;

    void zza(zzvg zzvg) throws RemoteException;

    void zzb(zzqm zzqm, String str) throws RemoteException;
}
