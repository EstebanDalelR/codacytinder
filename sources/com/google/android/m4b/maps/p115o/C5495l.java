package com.google.android.m4b.maps.p115o;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.o.l */
public interface C5495l extends IInterface {

    /* renamed from: com.google.android.m4b.maps.o.l$a */
    public static abstract class C6743a extends Binder implements C5495l {

        /* renamed from: com.google.android.m4b.maps.o.l$a$a */
        static class C6742a implements C5495l {
            /* renamed from: a */
            private IBinder f25264a;

            C6742a(IBinder iBinder) {
                this.f25264a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25264a;
            }

            /* renamed from: a */
            public final void mo5640a(Location location) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationListener");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25264a.transact(1, obtain, obtain2, 0);
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

        public C6743a() {
            attachInterface(this, "com.google.android.gms.location.ILocationListener");
        }

        /* renamed from: a */
        public static C5495l m30052a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5495l)) {
                return new C6742a(iBinder);
            }
            return (C5495l) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.location.ILocationListener");
                mo5640a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.location.ILocationListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5640a(Location location);
}
