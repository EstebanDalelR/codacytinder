package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;
import com.google.android.gms.internal.aau;
import com.google.android.gms.internal.aaw;

/* renamed from: com.google.android.gms.dynamite.k */
public final class C3839k extends aau implements zzm {
    C3839k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zza(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel a = a();
        aaw.a(a, iObjectWrapper);
        a.writeString(str);
        a.writeInt(i);
        aaw.a(a, iObjectWrapper2);
        Parcel a2 = a(2, a);
        IObjectWrapper a3 = C3828a.m14461a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
