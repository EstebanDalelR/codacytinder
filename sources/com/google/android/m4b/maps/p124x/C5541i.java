package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p124x.C5548p.C6824a.C6823a;

/* renamed from: com.google.android.m4b.maps.x.i */
public interface C5541i extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.i$a */
    public static abstract class C6812a extends Binder implements C5541i {

        /* renamed from: com.google.android.m4b.maps.x.i$a$a */
        static class C6811a implements C5541i {
            /* renamed from: a */
            private IBinder f25364a;

            C6811a(IBinder iBinder) {
                this.f25364a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25364a;
            }

            /* renamed from: a */
            public final void mo5792a(C5548p c5548p) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
                    obtain.writeStrongBinder(c5548p != null ? c5548p.asBinder() : null);
                    this.f25364a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5791a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
                    this.f25364a.transact(2, obtain, obtain2, 0);
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

        public C6812a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.ILocationSourceDelegate");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
                        i = parcel.readStrongBinder();
                        if (i == 0) {
                            i = 0;
                        } else {
                            parcel = i.queryLocalInterface("com.google.android.m4b.maps.internal.IOnLocationChangeListener");
                            if (parcel == null || (parcel instanceof C5548p) == 0) {
                                i = new C6823a(i);
                            } else {
                                i = (C5548p) parcel;
                            }
                        }
                        mo5792a(i);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
                        mo5791a();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.ILocationSourceDelegate");
            return true;
        }
    }

    /* renamed from: a */
    void mo5791a();

    /* renamed from: a */
    void mo5792a(C5548p c5548p);
}
