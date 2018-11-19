package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;

public final class ans extends aau implements zzpu {
    ans(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final void destroy() throws RemoteException {
        m18801b(4, m18799a());
    }

    public final void zza(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(3, a);
    }

    public final IObjectWrapper zzal(String str) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        Parcel a2 = m18800a(2, a);
        IObjectWrapper a3 = C3828a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final void zzb(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        a.writeInt(i);
        m18801b(5, a);
    }

    public final void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(1, a);
    }
}
