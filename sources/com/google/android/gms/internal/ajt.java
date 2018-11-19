package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class ajt extends aau implements zzla {
    ajt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final zzkn createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzux zzux, int i) throws RemoteException {
        zzkn zzkn;
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        a.writeString(str);
        aaw.m18804a(a, (IInterface) zzux);
        a.writeInt(i);
        Parcel a2 = m18800a(3, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            zzkn = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzkn = queryLocalInterface instanceof zzkn ? (zzkn) queryLocalInterface : new ajk(readStrongBinder);
        }
        a2.recycle();
        return zzkn;
    }

    public final zzxe createAdOverlay(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        Parcel a2 = m18800a(8, a);
        zzxe a3 = atx.m27254a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final zzks createBannerAdManager(IObjectWrapper iObjectWrapper, zzjn zzjn, String str, zzux zzux, int i) throws RemoteException {
        zzks zzks;
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18805a(a, (Parcelable) zzjn);
        a.writeString(str);
        aaw.m18804a(a, (IInterface) zzux);
        a.writeInt(i);
        Parcel a2 = m18800a(1, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            zzks = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzks = queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new ajn(readStrongBinder);
        }
        a2.recycle();
        return zzks;
    }

    public final zzxo createInAppPurchaseManager(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        Parcel a2 = m18800a(7, a);
        zzxo a3 = aud.m27256a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final zzks createInterstitialAdManager(IObjectWrapper iObjectWrapper, zzjn zzjn, String str, zzux zzux, int i) throws RemoteException {
        zzks zzks;
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18805a(a, (Parcelable) zzjn);
        a.writeString(str);
        aaw.m18804a(a, (IInterface) zzux);
        a.writeInt(i);
        Parcel a2 = m18800a(2, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            zzks = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzks = queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new ajn(readStrongBinder);
        }
        a2.recycle();
        return zzks;
    }

    public final zzpu createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18804a(a, (IInterface) iObjectWrapper2);
        Parcel a2 = m18800a(5, a);
        zzpu a3 = anr.m27162a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final zzpz createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18804a(a, (IInterface) iObjectWrapper2);
        aaw.m18804a(a, (IInterface) iObjectWrapper3);
        Parcel a2 = m18800a(11, a);
        zzpz a3 = anu.m27163a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final zzadk createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzux zzux, int i) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18804a(a, (IInterface) zzux);
        a.writeInt(i);
        Parcel a2 = m18800a(6, a);
        zzadk a3 = bu.m27269a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final zzks createSearchAdManager(IObjectWrapper iObjectWrapper, zzjn zzjn, String str, int i) throws RemoteException {
        zzks zzks;
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        aaw.m18805a(a, (Parcelable) zzjn);
        a.writeString(str);
        a.writeInt(i);
        Parcel a2 = m18800a(10, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            zzks = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzks = queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new ajn(readStrongBinder);
        }
        a2.recycle();
        return zzks;
    }

    public final zzlg getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzlg zzlg;
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        Parcel a2 = m18800a(4, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            zzlg = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzlg = queryLocalInterface instanceof zzlg ? (zzlg) queryLocalInterface : new ajx(readStrongBinder);
        }
        a2.recycle();
        return zzlg;
    }

    public final zzlg getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzlg zzlg;
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        a.writeInt(i);
        Parcel a2 = m18800a(9, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            zzlg = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzlg = queryLocalInterface instanceof zzlg ? (zzlg) queryLocalInterface : new ajx(readStrongBinder);
        }
        a2.recycle();
        return zzlg;
    }
}
