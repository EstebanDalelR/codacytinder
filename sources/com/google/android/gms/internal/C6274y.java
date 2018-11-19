package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.y */
public abstract class C6274y extends aav implements zzabe {
    public C6274y() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        zza((zzaax) aaw.m18803a(parcel, zzaax.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
