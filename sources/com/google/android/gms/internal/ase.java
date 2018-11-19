package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class ase extends aau implements zzvg {
    ase(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    public final int zzmc() throws RemoteException {
        Parcel a = m18800a(1, m18799a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
