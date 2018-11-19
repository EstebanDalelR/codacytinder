package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzpu extends IInterface {
    void destroy() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzal(String str) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException;
}
