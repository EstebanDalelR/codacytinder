package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class rk extends aau implements zzceu {
    rk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final void zza(zzceo zzceo) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzceo);
        m18802c(1, a);
    }
}
