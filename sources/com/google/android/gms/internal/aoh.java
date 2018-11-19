package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class aoh extends aau implements zzqq {
    aoh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void zza(zzqe zzqe) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzqe);
        m18801b(1, a);
    }
}
