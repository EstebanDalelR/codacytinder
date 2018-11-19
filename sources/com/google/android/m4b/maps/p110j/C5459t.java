package com.google.android.m4b.maps.p110j;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.j.t */
public interface C5459t extends IInterface {

    /* renamed from: com.google.android.m4b.maps.j.t$a */
    public static abstract class C6711a extends Binder implements C5459t {

        /* renamed from: com.google.android.m4b.maps.j.t$a$a */
        static class C6710a implements C5459t {
            /* renamed from: a */
            private IBinder f25106a;

            C6710a(IBinder iBinder) {
                this.f25106a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25106a;
            }

            /* renamed from: a */
            public final void mo5484a(C6713y c6713y) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    if (c6713y != null) {
                        obtain.writeInt(1);
                        c6713y.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25106a.transact(2, obtain, obtain2, 0);
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

        public C6711a() {
            attachInterface(this, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
        }

        /* renamed from: a */
        public static C5459t m29966a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5459t)) {
                return new C6710a(iBinder);
            }
            return (C5459t) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                parcel.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                mo5484a(parcel.readInt() != 0 ? (C6713y) C6713y.CREATOR.createFromParcel(parcel) : 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5484a(C6713y c6713y);
}
