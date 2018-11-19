package com.appsflyer;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.appsflyer.u */
final class C0954u implements IInterface {
    /* renamed from: a */
    private IBinder f2533a;

    C0954u(IBinder iBinder) {
        this.f2533a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f2533a;
    }

    /* renamed from: a */
    public final String m3255a() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f2533a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            return readString;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: a */
    final boolean m3256a(boolean z) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            obtain.writeInt(z);
            boolean z2 = false;
            this.f2533a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt()) {
                z2 = true;
            }
            obtain2.recycle();
            obtain.recycle();
            return z2;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
