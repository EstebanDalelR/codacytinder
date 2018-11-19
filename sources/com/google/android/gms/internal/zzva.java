package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzva extends IInterface {
    void destroy() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzll getVideoController() throws RemoteException;

    IObjectWrapper getView() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzaem zzaem, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, zzaem zzaem, String str2) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, zzvd zzvd) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, String str2, zzvd zzvd) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjj zzjj, String str, String str2, zzvd zzvd, zzpe zzpe, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjn zzjn, zzjj zzjj, String str, zzvd zzvd) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzjn zzjn, zzjj zzjj, String str, String str2, zzvd zzvd) throws RemoteException;

    void zza(zzjj zzjj, String str, String str2) throws RemoteException;

    void zzc(zzjj zzjj, String str) throws RemoteException;

    void zzg(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzvj zzme() throws RemoteException;

    zzvm zzmf() throws RemoteException;

    Bundle zzmg() throws RemoteException;

    Bundle zzmh() throws RemoteException;

    boolean zzmi() throws RemoteException;

    zzqm zzmj() throws RemoteException;
}
