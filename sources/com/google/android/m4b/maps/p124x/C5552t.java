package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p124x.C5538f.C6807a;

/* renamed from: com.google.android.m4b.maps.x.t */
public interface C5552t extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.t$a */
    public static abstract class C6832a extends Binder implements C5552t {

        /* renamed from: com.google.android.m4b.maps.x.t$a$a */
        static class C6831a implements C5552t {
            /* renamed from: a */
            private IBinder f25373a;

            C6831a(IBinder iBinder) {
                this.f25373a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25373a;
            }

            /* renamed from: a */
            public final void mo5803a(C5538f c5538f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMapReadyCallback");
                    obtain.writeStrongBinder(c5538f != null ? c5538f.asBinder() : null);
                    this.f25373a.transact(1, obtain, obtain2, 0);
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

        public C6832a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnMapReadyCallback");
        }

        /* renamed from: a */
        public static C5552t m30288a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.internal.IOnMapReadyCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5552t)) {
                return new C6831a(iBinder);
            }
            return (C5552t) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMapReadyCallback");
                mo5803a(C6807a.m30271a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnMapReadyCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5803a(C5538f c5538f);
}
