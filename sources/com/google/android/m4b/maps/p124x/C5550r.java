package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.x.r */
public interface C5550r extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.r$a */
    public static abstract class C6828a extends Binder implements C5550r {

        /* renamed from: com.google.android.m4b.maps.x.r$a$a */
        static class C6827a implements C5550r {
            /* renamed from: a */
            private IBinder f25371a;

            C6827a(IBinder iBinder) {
                this.f25371a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25371a;
            }

            /* renamed from: a */
            public final void mo5801a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMapLoadedCallback");
                    this.f25371a.transact(1, obtain, obtain2, 0);
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

        public C6828a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnMapLoadedCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMapLoadedCallback");
                mo5801a();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnMapLoadedCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5801a();
}
