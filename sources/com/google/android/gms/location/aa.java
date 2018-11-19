package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.aau;
import com.google.android.gms.internal.aaw;

public final class aa extends aau implements zzp {
    aa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    public final void onLocationAvailability(LocationAvailability locationAvailability) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) locationAvailability);
        m18802c(2, a);
    }

    public final void onLocationResult(LocationResult locationResult) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) locationResult);
        m18802c(1, a);
    }
}
