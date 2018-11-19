package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class afb extends aau implements zzfo {
    afb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String getId() throws RemoteException {
        Parcel a = m18800a(1, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean zzb(boolean z) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18806a(a, true);
        a = m18800a(2, a);
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final boolean zzbp() throws RemoteException {
        Parcel a = m18800a(6, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }
}
