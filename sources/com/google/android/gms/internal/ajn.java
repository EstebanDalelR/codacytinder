package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;

public final class ajn extends aau implements zzks {
    ajn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void destroy() throws RemoteException {
        m18801b(2, m18799a());
    }

    public final String getAdUnitId() throws RemoteException {
        Parcel a = m18800a(31, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel a = m18800a(18, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final zzll getVideoController() throws RemoteException {
        zzll zzll;
        Parcel a = m18800a(26, m18799a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzll = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzll = queryLocalInterface instanceof zzll ? (zzll) queryLocalInterface : new aka(readStrongBinder);
        }
        a.recycle();
        return zzll;
    }

    public final boolean isLoading() throws RemoteException {
        Parcel a = m18800a(23, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final boolean isReady() throws RemoteException {
        Parcel a = m18800a(3, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final void pause() throws RemoteException {
        m18801b(5, m18799a());
    }

    public final void resume() throws RemoteException {
        m18801b(6, m18799a());
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18806a(a, z);
        m18801b(34, a);
    }

    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18806a(a, z);
        m18801b(22, a);
    }

    public final void setUserId(String str) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        m18801b(25, a);
    }

    public final void showInterstitial() throws RemoteException {
        m18801b(9, m18799a());
    }

    public final void stopLoading() throws RemoteException {
        m18801b(10, m18799a());
    }

    public final void zza(zzadp zzadp) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzadp);
        m18801b(24, a);
    }

    public final void zza(zzjn zzjn) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzjn);
        m18801b(13, a);
    }

    public final void zza(zzke zzke) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzke);
        m18801b(20, a);
    }

    public final void zza(zzkh zzkh) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzkh);
        m18801b(7, a);
    }

    public final void zza(zzkx zzkx) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzkx);
        m18801b(8, a);
    }

    public final void zza(zzld zzld) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzld);
        m18801b(21, a);
    }

    public final void zza(zzlr zzlr) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzlr);
        m18801b(30, a);
    }

    public final void zza(zzmr zzmr) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzmr);
        m18801b(29, a);
    }

    public final void zza(zzoa zzoa) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzoa);
        m18801b(19, a);
    }

    public final void zza(zzxl zzxl) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzxl);
        m18801b(14, a);
    }

    public final void zza(zzxr zzxr, String str) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzxr);
        a.writeString(str);
        m18801b(15, a);
    }

    public final boolean zzb(zzjj zzjj) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzjj);
        Parcel a2 = m18800a(4, a);
        boolean a3 = aaw.m18807a(a2);
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zzbr() throws RemoteException {
        Parcel a = m18800a(1, m18799a());
        IObjectWrapper a2 = C3828a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final zzjn zzbs() throws RemoteException {
        Parcel a = m18800a(12, m18799a());
        zzjn zzjn = (zzjn) aaw.m18803a(a, zzjn.CREATOR);
        a.recycle();
        return zzjn;
    }

    public final void zzbu() throws RemoteException {
        m18801b(11, m18799a());
    }

    public final zzkx zzcd() throws RemoteException {
        zzkx zzkx;
        Parcel a = m18800a(32, m18799a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzkx = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzkx = queryLocalInterface instanceof zzkx ? (zzkx) queryLocalInterface : new ajq(readStrongBinder);
        }
        a.recycle();
        return zzkx;
    }

    public final zzkh zzce() throws RemoteException {
        zzkh zzkh;
        Parcel a = m18800a(33, m18799a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzkh = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzkh = queryLocalInterface instanceof zzkh ? (zzkh) queryLocalInterface : new ajg(readStrongBinder);
        }
        a.recycle();
        return zzkh;
    }

    public final String zzcp() throws RemoteException {
        Parcel a = m18800a(35, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
