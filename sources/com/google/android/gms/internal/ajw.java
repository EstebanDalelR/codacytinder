package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;

public abstract class ajw extends aav implements zzlg {
    public ajw() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                initialize();
                break;
            case 2:
                setAppVolume(parcel.readFloat());
                break;
            case 3:
                zzu(parcel.readString());
                break;
            case 4:
                setAppMuted(aaw.m18807a(parcel));
                break;
            case 5:
                zzb(C3828a.a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                zza(parcel.readString(), C3828a.a(parcel.readStrongBinder()));
                break;
            case 7:
                float zzdn = zzdn();
                parcel2.writeNoException();
                parcel2.writeFloat(zzdn);
                return true;
            case 8:
                boolean zzdo = zzdo();
                parcel2.writeNoException();
                aaw.m18806a(parcel2, zzdo);
                return true;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
