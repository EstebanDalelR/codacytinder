package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public abstract class anl extends aav implements zzpm {
    public anl() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: a */
    public static zzpm m27157a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof zzpm ? (zzpm) queryLocalInterface : new anm(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                String text = getText();
                parcel2.writeNoException();
                parcel2.writeString(text);
                return true;
            case 3:
                List zzjm = zzjm();
                parcel2.writeNoException();
                parcel2.writeList(zzjm);
                return true;
            default:
                return false;
        }
    }
}
