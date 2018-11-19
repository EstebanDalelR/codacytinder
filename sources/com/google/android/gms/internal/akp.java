package com.google.android.gms.internal;

import android.os.RemoteException;

final class akp extends ajh {
    /* renamed from: a */
    final /* synthetic */ akn f26661a;

    private akp(akn akn) {
        this.f26661a = akn;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    public final boolean isLoading() throws RemoteException {
        return false;
    }

    public final void zza(zzjj zzjj, int i) throws RemoteException {
        hx.m19913c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        hn.f16157a.post(new akq(this));
    }

    public final String zzcp() throws RemoteException {
        return null;
    }

    public final void zzd(zzjj zzjj) throws RemoteException {
        zza(zzjj, 1);
    }
}
