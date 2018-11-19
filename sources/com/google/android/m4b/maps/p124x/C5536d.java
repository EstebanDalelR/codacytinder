package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.x.d */
public interface C5536d extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.d$a */
    public static abstract class C6804a extends Binder implements C5536d {

        /* renamed from: com.google.android.m4b.maps.x.d$a$a */
        static class C6803a implements C5536d {
            /* renamed from: a */
            private IBinder f25361a;

            C6803a(IBinder iBinder) {
                this.f25361a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25361a;
            }

            /* renamed from: a */
            public final void mo5736a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.ICancelableCallback");
                    this.f25361a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo5737b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.ICancelableCallback");
                    this.f25361a.transact(2, obtain, obtain2, 0);
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

        public C6804a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.ICancelableCallback");
        }

        /* renamed from: a */
        public static C5536d m30212a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.internal.ICancelableCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5536d)) {
                return new C6803a(iBinder);
            }
            return (C5536d) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICancelableCallback");
                        mo5736a();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICancelableCallback");
                        mo5737b();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.ICancelableCallback");
            return true;
        }
    }

    /* renamed from: a */
    void mo5736a();

    /* renamed from: b */
    void mo5737b();
}
