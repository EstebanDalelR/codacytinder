package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzadk extends IInterface {
    void destroy() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void show() throws RemoteException;

    void zza(zzadp zzadp) throws RemoteException;

    void zza(zzadv zzadv) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzc(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper) throws RemoteException;
}
