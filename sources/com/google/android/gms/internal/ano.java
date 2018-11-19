package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public abstract class ano extends aav implements zzpq {
    public ano() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public static zzpq m27158a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzpq ? (zzpq) queryLocalInterface : new anp(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                IInterface zzjr = zzjr();
                parcel2.writeNoException();
                aaw.m18804a(parcel2, zzjr);
                return true;
            case 2:
                Parcelable uri = getUri();
                parcel2.writeNoException();
                aaw.m18809b(parcel2, uri);
                return true;
            case 3:
                double scale = getScale();
                parcel2.writeNoException();
                parcel2.writeDouble(scale);
                return true;
            default:
                return false;
        }
    }
}
