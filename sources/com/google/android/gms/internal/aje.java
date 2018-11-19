package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.RemoteException;

public final class aje extends aau implements zzke {
    aje(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    public final void onAdClicked() throws RemoteException {
        m18801b(1, m18799a());
    }
}
