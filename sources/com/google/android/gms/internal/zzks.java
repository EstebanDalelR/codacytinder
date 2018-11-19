package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzks extends IInterface {
    void destroy() throws RemoteException;

    String getAdUnitId() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzll getVideoController() throws RemoteException;

    boolean isLoading() throws RemoteException;

    boolean isReady() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setManualImpressionsEnabled(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void stopLoading() throws RemoteException;

    void zza(zzadp zzadp) throws RemoteException;

    void zza(zzjn zzjn) throws RemoteException;

    void zza(zzke zzke) throws RemoteException;

    void zza(zzkh zzkh) throws RemoteException;

    void zza(zzkx zzkx) throws RemoteException;

    void zza(zzld zzld) throws RemoteException;

    void zza(zzlr zzlr) throws RemoteException;

    void zza(zzmr zzmr) throws RemoteException;

    void zza(zzoa zzoa) throws RemoteException;

    void zza(zzxl zzxl) throws RemoteException;

    void zza(zzxr zzxr, String str) throws RemoteException;

    boolean zzb(zzjj zzjj) throws RemoteException;

    IObjectWrapper zzbr() throws RemoteException;

    zzjn zzbs() throws RemoteException;

    void zzbu() throws RemoteException;

    zzkx zzcd() throws RemoteException;

    zzkh zzce() throws RemoteException;

    String zzcp() throws RemoteException;
}
