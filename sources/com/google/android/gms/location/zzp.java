package com.google.android.gms.location;

import android.os.IInterface;
import android.os.RemoteException;

public interface zzp extends IInterface {
    void onLocationAvailability(LocationAvailability locationAvailability) throws RemoteException;

    void onLocationResult(LocationResult locationResult) throws RemoteException;
}
