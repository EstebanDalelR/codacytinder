package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class aez extends aau implements zzfl {
    aez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void zza(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        a.writeString(str);
        m18801b(2, a);
    }

    public final void zza(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        a.writeString(str);
        a.writeString(null);
        m18801b(8, a);
    }

    public final void zza(int[] iArr) throws RemoteException {
        Parcel a = m18799a();
        a.writeIntArray(null);
        m18801b(4, a);
    }

    public final void zzbk() throws RemoteException {
        m18801b(3, m18799a());
    }

    public final void zzc(byte[] bArr) throws RemoteException {
        Parcel a = m18799a();
        a.writeByteArray(bArr);
        m18801b(5, a);
    }

    public final void zzg(int i) throws RemoteException {
        Parcel a = m18799a();
        a.writeInt(i);
        m18801b(6, a);
    }

    public final void zzh(int i) throws RemoteException {
        Parcel a = m18799a();
        a.writeInt(i);
        m18801b(7, a);
    }
}
