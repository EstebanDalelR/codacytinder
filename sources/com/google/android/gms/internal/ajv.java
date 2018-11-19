package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class ajv extends aau implements zzld {
    ajv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    public final long getValue() throws RemoteException {
        Parcel a = m18800a(1, m18799a());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
