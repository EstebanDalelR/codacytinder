package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class aoj extends aau implements zzqt {
    aoj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zza(zzqi zzqi) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzqi);
        m18801b(1, a);
    }
}
