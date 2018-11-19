package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class nj extends aau implements zzawn {
    nj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zza(zzawp zzawp) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzawp);
        m18801b(1, a);
    }
}
