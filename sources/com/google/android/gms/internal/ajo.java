package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.C2513p;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class ajo extends aau implements zzkv {
    ajo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zza(IObjectWrapper iObjectWrapper, zzjn zzjn, String str, zzux zzux, int i, int i2) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18805a(a, (Parcelable) zzjn);
        a.writeString(str);
        aaw.m18804a(a, (IInterface) zzux);
        a.writeInt(C2513p.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        a.writeInt(i2);
        Parcel a2 = m18800a(2, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
