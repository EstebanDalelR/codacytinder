package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.aav;
import com.google.android.gms.internal.aaw;

public abstract class ab extends aav implements zzs {
    public ab() {
        attachInterface(this, "com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: a */
    public static zzs m27587a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof zzs ? (zzs) queryLocalInterface : new ac(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        onLocationChanged((Location) aaw.m18803a(parcel, Location.CREATOR));
        return true;
    }
}
