package com.firebase.jobdispatcher;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.firebase.jobdispatcher.IJobCallback.C3483a;

public interface IRemoteJobService extends IInterface {

    /* renamed from: com.firebase.jobdispatcher.IRemoteJobService$a */
    public static abstract class C3485a extends Binder implements IRemoteJobService {

        /* renamed from: com.firebase.jobdispatcher.IRemoteJobService$a$a */
        private static class C3484a implements IRemoteJobService {
            /* renamed from: a */
            private IBinder f10522a;

            C3484a(IBinder iBinder) {
                this.f10522a = iBinder;
            }

            public IBinder asBinder() {
                return this.f10522a;
            }

            public void start(Bundle bundle, IJobCallback iJobCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.firebase.jobdispatcher.IRemoteJobService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iJobCallback != null ? iJobCallback.asBinder() : null);
                    this.f10522a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void stop(Bundle bundle, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.firebase.jobdispatcher.IRemoteJobService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z);
                    this.f10522a.transact(true, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C3485a() {
            attachInterface(this, "com.firebase.jobdispatcher.IRemoteJobService");
        }

        /* renamed from: a */
        public static IRemoteJobService m13234a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.firebase.jobdispatcher.IRemoteJobService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteJobService)) {
                return new C3484a(iBinder);
            }
            return (IRemoteJobService) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                Bundle bundle = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.firebase.jobdispatcher.IRemoteJobService");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        start(bundle, C3483a.m13233a(parcel.readStrongBinder()));
                        return true;
                    case 2:
                        parcel.enforceInterface("com.firebase.jobdispatcher.IRemoteJobService");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        stop(bundle, parcel.readInt() != 0 ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.firebase.jobdispatcher.IRemoteJobService");
            return true;
        }
    }

    void start(Bundle bundle, IJobCallback iJobCallback) throws RemoteException;

    void stop(Bundle bundle, boolean z) throws RemoteException;
}
