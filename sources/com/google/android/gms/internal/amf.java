package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class amf extends aau implements zznx {
    amf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public final String getContent() throws RemoteException {
        Parcel a = m18800a(2, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void recordClick() throws RemoteException {
        m18801b(4, m18799a());
    }

    public final void recordImpression() throws RemoteException {
        m18801b(5, m18799a());
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(3, a);
    }

    public final String zzjj() throws RemoteException {
        Parcel a = m18800a(1, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
