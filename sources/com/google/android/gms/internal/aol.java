package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class aol extends aau implements zzqw {
    aol(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zzb(zzqm zzqm, String str) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzqm);
        a.writeString(str);
        m18801b(1, a);
    }
}
