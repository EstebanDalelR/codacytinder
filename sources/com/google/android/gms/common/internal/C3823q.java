package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;
import com.google.android.gms.internal.aau;

/* renamed from: com.google.android.gms.common.internal.q */
public final class C3823q extends aau implements zzat {
    C3823q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final IObjectWrapper zzaga() throws RemoteException {
        Parcel a = a(1, a());
        IObjectWrapper a2 = C3828a.m14461a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int zzagb() throws RemoteException {
        Parcel a = a(2, a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
