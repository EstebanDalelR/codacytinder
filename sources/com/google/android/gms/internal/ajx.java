package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class ajx extends aau implements zzlg {
    ajx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final void initialize() throws RemoteException {
        m18801b(1, m18799a());
    }

    public final void setAppMuted(boolean z) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18806a(a, z);
        m18801b(4, a);
    }

    public final void setAppVolume(float f) throws RemoteException {
        Parcel a = m18799a();
        a.writeFloat(f);
        m18801b(2, a);
    }

    public final void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(6, a);
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        a.writeString(str);
        m18801b(5, a);
    }

    public final float zzdn() throws RemoteException {
        Parcel a = m18800a(7, m18799a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final boolean zzdo() throws RemoteException {
        Parcel a = m18800a(8, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final void zzu(String str) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        m18801b(3, a);
    }
}
