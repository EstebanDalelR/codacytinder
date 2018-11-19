package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class asd extends aav implements zzvg {
    public asd() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        i = zzmc();
        parcel2.writeNoException();
        parcel2.writeInt(i);
        return true;
    }
}
