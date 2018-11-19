package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class bw extends aau implements zzadn {
    bw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    public final IBinder zza(IObjectWrapper iObjectWrapper, zzux zzux, int i) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18804a(a, (IInterface) zzux);
        a.writeInt(C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel a2 = m18800a(1, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
