package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class aoo extends aau implements zzqz {
    aoo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void zzb(zzqm zzqm) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzqm);
        m18801b(1, a);
    }
}
