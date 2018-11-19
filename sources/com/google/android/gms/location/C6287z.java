package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.aav;
import com.google.android.gms.internal.aaw;

/* renamed from: com.google.android.gms.location.z */
public abstract class C6287z extends aav implements zzp {
    public C6287z() {
        attachInterface(this, "com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public static zzp m27601a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new aa(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                onLocationResult((LocationResult) aaw.m18803a(parcel, LocationResult.CREATOR));
                return true;
            case 2:
                onLocationAvailability((LocationAvailability) aaw.m18803a(parcel, LocationAvailability.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
