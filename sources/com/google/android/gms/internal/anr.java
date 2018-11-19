package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;

public abstract class anr extends aav implements zzpu {
    public anr() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public static zzpu m27162a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zzpu ? (zzpu) queryLocalInterface : new ans(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                zzb(parcel.readString(), C3828a.a(parcel.readStrongBinder()));
                break;
            case 2:
                IInterface zzal = zzal(parcel.readString());
                parcel2.writeNoException();
                aaw.m18804a(parcel2, zzal);
                return true;
            case 3:
                zza(C3828a.a(parcel.readStrongBinder()));
                break;
            case 4:
                destroy();
                break;
            case 5:
                zzb(C3828a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
