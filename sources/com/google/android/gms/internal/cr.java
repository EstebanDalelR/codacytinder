package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class cr extends aau implements zzaem {
    cr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaeq zzaeq) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18805a(a, (Parcelable) zzaeq);
        m18801b(7, a);
    }

    public final void zzc(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        a.writeInt(i);
        m18801b(2, a);
    }

    public final void zzd(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        a.writeInt(i);
        m18801b(9, a);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(1, a);
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(3, a);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(4, a);
    }

    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(5, a);
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(6, a);
    }

    public final void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(8, a);
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(10, a);
    }
}
