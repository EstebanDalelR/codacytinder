package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;
import com.google.android.gms.internal.aau;
import com.google.android.gms.internal.aaw;

/* renamed from: com.google.android.gms.common.internal.u */
public final class C3826u extends aau implements zzbd {
    C3826u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final IObjectWrapper zza(IObjectWrapper iObjectWrapper, zzbv zzbv) throws RemoteException {
        Parcel a = a();
        aaw.a(a, iObjectWrapper);
        aaw.a(a, zzbv);
        Parcel a2 = a(2, a);
        IObjectWrapper a3 = C3828a.m14461a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
