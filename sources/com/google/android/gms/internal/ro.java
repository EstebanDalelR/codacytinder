package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

public abstract class ro extends aav implements zzcfb {
    public ro() {
        attachInterface(this, "com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        zza((LocationSettingsResult) aaw.m18803a(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}
