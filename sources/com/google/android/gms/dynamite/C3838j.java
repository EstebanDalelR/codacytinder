package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;
import com.google.android.gms.internal.aau;
import com.google.android.gms.internal.aaw;

/* renamed from: com.google.android.gms.dynamite.j */
public final class C3838j extends aau implements zzk {
    C3838j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zza(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel a = a();
        aaw.a(a, iObjectWrapper);
        a.writeString(str);
        aaw.a(a, z);
        Parcel a2 = a(3, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final IObjectWrapper zza(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel a = a();
        aaw.a(a, iObjectWrapper);
        a.writeString(str);
        a.writeInt(i);
        Parcel a2 = a(2, a);
        IObjectWrapper a3 = C3828a.m14461a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
