package com.google.android.gms.internal;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzpq extends IInterface {
    double getScale() throws RemoteException;

    Uri getUri() throws RemoteException;

    IObjectWrapper zzjr() throws RemoteException;
}
