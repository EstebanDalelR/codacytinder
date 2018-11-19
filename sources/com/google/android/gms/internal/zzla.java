package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzla extends IInterface {
    zzkn createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzux zzux, int i) throws RemoteException;

    zzxe createAdOverlay(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzks createBannerAdManager(IObjectWrapper iObjectWrapper, zzjn zzjn, String str, zzux zzux, int i) throws RemoteException;

    zzxo createInAppPurchaseManager(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzks createInterstitialAdManager(IObjectWrapper iObjectWrapper, zzjn zzjn, String str, zzux zzux, int i) throws RemoteException;

    zzpu createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    zzpz createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    zzadk createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzux zzux, int i) throws RemoteException;

    zzks createSearchAdManager(IObjectWrapper iObjectWrapper, zzjn zzjn, String str, int i) throws RemoteException;

    zzlg getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzlg getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) throws RemoteException;
}
