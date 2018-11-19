package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;

public final class apc extends aau implements zzrv {
    apc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final ParcelFileDescriptor zza(zzrr zzrr) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzrr);
        Parcel a2 = m18800a(1, a);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) aaw.m18803a(a2, ParcelFileDescriptor.CREATOR);
        a2.recycle();
        return parcelFileDescriptor;
    }
}
