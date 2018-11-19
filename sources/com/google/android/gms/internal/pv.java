package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;

public abstract class pv extends aav implements zzcay {
    public pv() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
    }

    public static zzcay asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof zzcay ? (zzcay) queryLocalInterface : new px(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                init(C3828a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), aaw.m18807a(parcel), parcel.readInt());
                parcel2.writeNoException();
                aaw.m18806a(parcel2, booleanFlagValue);
                return true;
            case 3:
                i = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            case 4:
                long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
                return true;
            case 5:
                String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
                return true;
            default:
                return false;
        }
    }
}
