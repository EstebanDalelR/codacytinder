package com.firebase.jobdispatcher;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IJobCallback extends IInterface {

    /* renamed from: com.firebase.jobdispatcher.IJobCallback$a */
    public static abstract class C3483a extends Binder implements IJobCallback {

        /* renamed from: com.firebase.jobdispatcher.IJobCallback$a$a */
        private static class C3482a implements IJobCallback {
            /* renamed from: a */
            private IBinder f10521a;

            C3482a(IBinder iBinder) {
                this.f10521a = iBinder;
            }

            public IBinder asBinder() {
                return this.f10521a;
            }

            public void jobFinished(Bundle bundle, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.firebase.jobdispatcher.IJobCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f10521a.transact(1, obtain, 0, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C3483a() {
            attachInterface(this, "com.firebase.jobdispatcher.IJobCallback");
        }

        /* renamed from: a */
        public static IJobCallback m13233a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.firebase.jobdispatcher.IJobCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IJobCallback)) {
                return new C3482a(iBinder);
            }
            return (IJobCallback) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.firebase.jobdispatcher.IJobCallback");
                jobFinished(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : 0, parcel.readInt());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.firebase.jobdispatcher.IJobCallback");
                return true;
            }
        }
    }

    void jobFinished(Bundle bundle, int i) throws RemoteException;
}
