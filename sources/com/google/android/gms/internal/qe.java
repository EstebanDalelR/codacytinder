package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class qe extends aau implements zzcbt {
    qe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzcbr zza(zzcbp zzcbp) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzcbp);
        Parcel a2 = m18800a(1, a);
        zzcbr zzcbr = (zzcbr) aaw.m18803a(a2, zzcbr.CREATOR);
        a2.recycle();
        return zzcbr;
    }
}
