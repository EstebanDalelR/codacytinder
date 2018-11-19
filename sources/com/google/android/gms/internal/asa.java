package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;
import java.util.List;

public final class asa extends aau implements zzva {
    asa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void destroy() throws RemoteException {
        m18801b(5, m18799a());
    }

    public final Bundle getInterstitialAdapterInfo() throws RemoteException {
        Parcel a = m18800a(18, m18799a());
        Bundle bundle = (Bundle) aaw.m18803a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final zzll getVideoController() throws RemoteException {
        Parcel a = m18800a(26, m18799a());
        zzll a2 = ajz.m27113a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final IObjectWrapper getView() throws RemoteException {
        Parcel a = m18800a(2, m18799a());
        IObjectWrapper a2 = C3828a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final boolean isInitialized() throws RemoteException {
        Parcel a = m18800a(13, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final void pause() throws RemoteException {
        m18801b(8, m18799a());
    }

    public final void resume() throws RemoteException {
        m18801b(9, m18799a());
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18806a(a, z);
        m18801b(25, a);
    }

    public final void showInterstitial() throws RemoteException {
        m18801b(4, m18799a());
    }

    public final void showVideo() throws RemoteException {
        m18801b(12, m18799a());
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzaem zzaem, List<String> list) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18804a(a, (IInterface) zzaem);
        a.writeStringList(list);
        m18801b(23, a);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, zzaem zzaem, String str2) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18805a(a, (Parcelable) zzjj);
        a.writeString(str);
        aaw.m18804a(a, (IInterface) zzaem);
        a.writeString(str2);
        m18801b(10, a);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, zzvd zzvd) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18805a(a, (Parcelable) zzjj);
        a.writeString(str);
        aaw.m18804a(a, (IInterface) zzvd);
        m18801b(3, a);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, String str2, zzvd zzvd) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18805a(a, (Parcelable) zzjj);
        a.writeString(str);
        a.writeString(str2);
        aaw.m18804a(a, (IInterface) zzvd);
        m18801b(7, a);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, String str2, zzvd zzvd, zzpe zzpe, List<String> list) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18805a(a, (Parcelable) zzjj);
        a.writeString(str);
        a.writeString(str2);
        aaw.m18804a(a, (IInterface) zzvd);
        aaw.m18805a(a, (Parcelable) zzpe);
        a.writeStringList(list);
        m18801b(14, a);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjn zzjn, zzjj zzjj, String str, zzvd zzvd) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18805a(a, (Parcelable) zzjn);
        aaw.m18805a(a, (Parcelable) zzjj);
        a.writeString(str);
        aaw.m18804a(a, (IInterface) zzvd);
        m18801b(1, a);
    }

    public final void zza(IObjectWrapper iObjectWrapper, zzjn zzjn, zzjj zzjj, String str, String str2, zzvd zzvd) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18805a(a, (Parcelable) zzjn);
        aaw.m18805a(a, (Parcelable) zzjj);
        a.writeString(str);
        a.writeString(str2);
        aaw.m18804a(a, (IInterface) zzvd);
        m18801b(6, a);
    }

    public final void zza(zzjj zzjj, String str, String str2) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzjj);
        a.writeString(str);
        a.writeString(str2);
        m18801b(20, a);
    }

    public final void zzc(zzjj zzjj, String str) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzjj);
        a.writeString(str);
        m18801b(11, a);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(21, a);
    }

    public final zzvj zzme() throws RemoteException {
        zzvj zzvj;
        Parcel a = m18800a(15, m18799a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzvj = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzvj = queryLocalInterface instanceof zzvj ? (zzvj) queryLocalInterface : new asg(readStrongBinder);
        }
        a.recycle();
        return zzvj;
    }

    public final zzvm zzmf() throws RemoteException {
        zzvm zzvm;
        Parcel a = m18800a(16, m18799a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzvm = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzvm = queryLocalInterface instanceof zzvm ? (zzvm) queryLocalInterface : new asi(readStrongBinder);
        }
        a.recycle();
        return zzvm;
    }

    public final Bundle zzmg() throws RemoteException {
        Parcel a = m18800a(17, m18799a());
        Bundle bundle = (Bundle) aaw.m18803a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final Bundle zzmh() throws RemoteException {
        Parcel a = m18800a(19, m18799a());
        Bundle bundle = (Bundle) aaw.m18803a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final boolean zzmi() throws RemoteException {
        Parcel a = m18800a(22, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final zzqm zzmj() throws RemoteException {
        Parcel a = m18800a(24, m18799a());
        zzqm a2 = aod.m27164a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
