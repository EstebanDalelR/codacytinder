package com.google.android.m4b.maps.p115o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.o.k */
public interface C5494k extends IInterface {

    /* renamed from: com.google.android.m4b.maps.o.k$a */
    public static abstract class C6741a extends Binder implements C5494k {

        /* renamed from: com.google.android.m4b.maps.o.k$a$a */
        static class C6740a implements C5494k {
            /* renamed from: a */
            private IBinder f25263a;

            C6740a(IBinder iBinder) {
                this.f25263a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25263a;
            }

            /* renamed from: a */
            public final void mo5639a(C6746r c6746r) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
                    if (c6746r != null) {
                        obtain.writeInt(1);
                        c6746r.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25263a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5638a(C6744m c6744m) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.ILocationCallback");
                    if (c6744m != null) {
                        obtain.writeInt(1);
                        c6744m.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25263a.transact(2, obtain, obtain2, 0);
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

        /* renamed from: a */
        public static C5494k m30050a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5494k)) {
                return new C6740a(iBinder);
            }
            return (C5494k) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                C6746r c6746r = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                        if (parcel.readInt() != 0) {
                            c6746r = (C6746r) C6746r.CREATOR.createFromParcel(parcel);
                        }
                        mo5639a(c6746r);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        C6744m a;
                        parcel.enforceInterface("com.google.android.gms.location.ILocationCallback");
                        if (parcel.readInt() != 0) {
                            i = C6744m.CREATOR;
                            a = C5496n.m23970a(parcel);
                        }
                        mo5638a(a);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.gms.location.ILocationCallback");
            return true;
        }
    }

    /* renamed from: a */
    void mo5638a(C6744m c6744m);

    /* renamed from: a */
    void mo5639a(C6746r c6746r);
}
