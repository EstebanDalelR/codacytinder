package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;

public abstract class ajs extends aav implements zzla {
    public ajs() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static zzla asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return queryLocalInterface instanceof zzla ? (zzla) queryLocalInterface : new ajt(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        IInterface createBannerAdManager;
        switch (i) {
            case 1:
                createBannerAdManager = createBannerAdManager(C3828a.a(parcel.readStrongBinder()), (zzjn) aaw.m18803a(parcel, zzjn.CREATOR), parcel.readString(), arw.m27233a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                createBannerAdManager = createInterstitialAdManager(C3828a.a(parcel.readStrongBinder()), (zzjn) aaw.m18803a(parcel, zzjn.CREATOR), parcel.readString(), arw.m27233a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                createBannerAdManager = createAdLoaderBuilder(C3828a.a(parcel.readStrongBinder()), parcel.readString(), arw.m27233a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                createBannerAdManager = getMobileAdsSettingsManager(C3828a.a(parcel.readStrongBinder()));
                break;
            case 5:
                createBannerAdManager = createNativeAdViewDelegate(C3828a.a(parcel.readStrongBinder()), C3828a.a(parcel.readStrongBinder()));
                break;
            case 6:
                createBannerAdManager = createRewardedVideoAd(C3828a.a(parcel.readStrongBinder()), arw.m27233a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                createBannerAdManager = createInAppPurchaseManager(C3828a.a(parcel.readStrongBinder()));
                break;
            case 8:
                createBannerAdManager = createAdOverlay(C3828a.a(parcel.readStrongBinder()));
                break;
            case 9:
                createBannerAdManager = getMobileAdsSettingsManagerWithClientJarVersion(C3828a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                createBannerAdManager = createSearchAdManager(C3828a.a(parcel.readStrongBinder()), (zzjn) aaw.m18803a(parcel, zzjn.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                createBannerAdManager = createNativeAdViewHolderDelegate(C3828a.a(parcel.readStrongBinder()), C3828a.a(parcel.readStrongBinder()), C3828a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        aaw.m18804a(parcel2, createBannerAdManager);
        return true;
    }
}
