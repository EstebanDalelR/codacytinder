package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.aau;

/* renamed from: com.google.android.gms.gcm.f */
public final class C3846f extends aau implements zzd {
    C3846f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
    }

    public final void zzdr(int i) throws RemoteException {
        Parcel a = a();
        a.writeInt(i);
        b(2, a);
    }
}
