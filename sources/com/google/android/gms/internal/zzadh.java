package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.RemoteException;

public interface zzadh extends IInterface {
    int getAmount() throws RemoteException;

    String getType() throws RemoteException;
}
