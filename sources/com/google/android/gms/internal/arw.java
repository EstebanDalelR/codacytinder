package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class arw extends aav implements zzux {
    public arw() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public static zzux m27233a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzux ? (zzux) queryLocalInterface : new arx(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                IInterface zzbg = zzbg(parcel.readString());
                parcel2.writeNoException();
                aaw.m18804a(parcel2, zzbg);
                return true;
            case 2:
                boolean zzbh = zzbh(parcel.readString());
                parcel2.writeNoException();
                aaw.m18806a(parcel2, zzbh);
                return true;
            default:
                return false;
        }
    }
}
