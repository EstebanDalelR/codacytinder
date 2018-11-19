package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzan;

public final class tl extends aau implements zzcxl {
    tl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zza(zzan zzan, int i, boolean z) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzan);
        a.writeInt(i);
        aaw.m18806a(a, z);
        m18801b(9, a);
    }

    public final void zza(zzcxo zzcxo, zzcxj zzcxj) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzcxo);
        aaw.m18804a(a, (IInterface) zzcxj);
        m18801b(12, a);
    }

    public final void zzeh(int i) throws RemoteException {
        Parcel a = m18799a();
        a.writeInt(i);
        m18801b(7, a);
    }
}
