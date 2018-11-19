package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class bv extends aau implements zzadk {
    bv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public final void destroy() throws RemoteException {
        m18801b(8, m18799a());
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel a = m18800a(12, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean isLoaded() throws RemoteException {
        Parcel a = m18800a(5, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final void pause() throws RemoteException {
        m18801b(6, m18799a());
    }

    public final void resume() throws RemoteException {
        m18801b(7, m18799a());
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18806a(a, z);
        m18801b(34, a);
    }

    public final void setUserId(String str) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        m18801b(13, a);
    }

    public final void show() throws RemoteException {
        m18801b(2, m18799a());
    }

    public final void zza(zzadp zzadp) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzadp);
        m18801b(3, a);
    }

    public final void zza(zzadv zzadv) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzadv);
        m18801b(1, a);
    }

    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(9, a);
    }

    public final void zzc(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(10, a);
    }

    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(11, a);
    }
}
