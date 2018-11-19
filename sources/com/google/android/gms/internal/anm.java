package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class anm extends aau implements zzpm {
    anm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String getText() throws RemoteException {
        Parcel a = m18800a(2, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List<zzpq> zzjm() throws RemoteException {
        Parcel a = m18800a(3, m18799a());
        List b = aaw.m18808b(a);
        a.recycle();
        return b;
    }
}
