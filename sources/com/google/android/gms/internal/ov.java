package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class ov extends aau implements zzbge {
    ov(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zza(zzbgc zzbgc) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzbgc);
        m18802c(1, a);
    }
}
