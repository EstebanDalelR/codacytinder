package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.aau;
import com.google.android.gms.internal.aaw;

/* renamed from: com.google.android.gms.iid.i */
public final class C3847i extends aau implements zzi {
    C3847i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    public final void send(Message message) throws RemoteException {
        Parcel a = a();
        aaw.a(a, message);
        c(1, a);
    }
}
