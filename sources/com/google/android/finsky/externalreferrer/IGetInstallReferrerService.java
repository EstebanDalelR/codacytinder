package com.google.android.finsky.externalreferrer;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IGetInstallReferrerService extends IInterface {

    /* renamed from: com.google.android.finsky.externalreferrer.IGetInstallReferrerService$a */
    public static abstract class C3730a extends Binder implements IGetInstallReferrerService {

        /* renamed from: com.google.android.finsky.externalreferrer.IGetInstallReferrerService$a$a */
        private static class C3729a implements IGetInstallReferrerService {
            /* renamed from: a */
            private IBinder f11770a;

            C3729a(IBinder iBinder) {
                this.f11770a = iBinder;
            }

            public IBinder asBinder() {
                return this.f11770a;
            }

            public Bundle getInstallReferrer(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f11770a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    bundle = obtain2.readInt() != null ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static IGetInstallReferrerService m14152a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IGetInstallReferrerService)) {
                return new C3729a(iBinder);
            }
            return (IGetInstallReferrerService) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                i = getInstallReferrer(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : 0);
                parcel2.writeNoException();
                if (i != 0) {
                    parcel2.writeInt(1);
                    i.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                return true;
            }
        }
    }

    Bundle getInstallReferrer(Bundle bundle) throws RemoteException;
}
