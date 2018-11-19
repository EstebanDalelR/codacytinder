package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class aht extends aau implements zzio {
    aht(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzii zza(zzil zzil) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzil);
        Parcel a2 = m18800a(1, a);
        zzii zzii = (zzii) aaw.m18803a(a2, zzii.CREATOR);
        a2.recycle();
        return zzii;
    }
}
