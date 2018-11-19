package com.google.android.m4b.maps.p110j;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.j.r */
public interface C5457r extends IInterface {

    /* renamed from: com.google.android.m4b.maps.j.r$a */
    public static abstract class C6707a extends Binder implements C5457r {

        /* renamed from: com.google.android.m4b.maps.j.r$a$a */
        static class C6706a implements C5457r {
            /* renamed from: a */
            private IBinder f25104a;

            C6706a(IBinder iBinder) {
                this.f25104a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25104a;
            }

            /* renamed from: a */
            public final void mo5438a(int i, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25104a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5437a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsCallbacks");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25104a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C6707a() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* renamed from: a */
        public static C5457r m29918a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5457r)) {
                return new C6706a(iBinder);
            }
            return (C5457r) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                Bundle bundle = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                        i = parcel.readInt();
                        i2 = parcel.readStrongBinder();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo5438a(i, i2, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                        i = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo5437a(i, bundle);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.gms.common.internal.IGmsCallbacks");
            return true;
        }
    }

    /* renamed from: a */
    void mo5437a(int i, Bundle bundle);

    /* renamed from: a */
    void mo5438a(int i, IBinder iBinder, Bundle bundle);
}
