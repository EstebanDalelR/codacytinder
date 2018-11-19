package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class arx extends aau implements zzux {
    arx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public final zzva zzbg(String str) throws RemoteException {
        zzva zzva;
        Parcel a = m18799a();
        a.writeString(str);
        Parcel a2 = m18800a(1, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            zzva = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzva = queryLocalInterface instanceof zzva ? (zzva) queryLocalInterface : new asa(readStrongBinder);
        }
        a2.recycle();
        return zzva;
    }

    public final boolean zzbh(String str) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        Parcel a2 = m18800a(2, a);
        boolean a3 = aaw.m18807a(a2);
        a2.recycle();
        return a3;
    }
}
