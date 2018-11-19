package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.s */
final class C3825s implements zzay {
    /* renamed from: a */
    private final IBinder f12073a;

    C3825s(IBinder iBinder) {
        this.f12073a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f12073a;
    }

    public final void zza(zzaw zzaw, zzz zzz) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(zzaw.asBinder());
            obtain.writeInt(1);
            zzz.writeToParcel(obtain, 0);
            this.f12073a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
