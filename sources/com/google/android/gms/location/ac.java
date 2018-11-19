package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.aau;
import com.google.android.gms.internal.aaw;

public final class ac extends aau implements zzs {
    ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    public final void onLocationChanged(Location location) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) location);
        m18802c(1, a);
    }
}
