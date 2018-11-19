package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class amh extends aau implements zzoa {
    amh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void zza(zznx zznx) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zznx);
        m18801b(1, a);
    }
}
