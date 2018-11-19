package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class rl extends aav implements zzcex {
    public rl() {
        attachInterface(this, "com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                zza(parcel.readInt(), parcel.createStringArray());
                return true;
            case 2:
                zzb(parcel.readInt(), parcel.createStringArray());
                return true;
            case 3:
                zza(parcel.readInt(), (PendingIntent) aaw.m18803a(parcel, PendingIntent.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
