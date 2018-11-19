package com.firebase.jobdispatcher;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.firebase.jobdispatcher.e */
final class C3488e implements JobCallback {
    /* renamed from: a */
    private final IBinder f10531a;

    public C3488e(IBinder iBinder) {
        this.f10531a = iBinder;
    }

    public void jobFinished(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            obtain.writeInt(i);
            this.f10531a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (int i2) {
            throw new RuntimeException(i2);
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
