package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class ajq extends aau implements zzkx {
    ajq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        a.writeString(str2);
        m18801b(1, a);
    }
}
