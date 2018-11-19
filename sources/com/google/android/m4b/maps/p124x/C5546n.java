package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate;
import com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate.Stub;

/* renamed from: com.google.android.m4b.maps.x.n */
public interface C5546n extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.n$a */
    public static abstract class C6820a extends Binder implements C5546n {

        /* renamed from: com.google.android.m4b.maps.x.n$a$a */
        static class C6819a implements C5546n {
            /* renamed from: a */
            private IBinder f25367a;

            C6819a(IBinder iBinder) {
                this.f25367a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25367a;
            }

            /* renamed from: a */
            public final void mo5795a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
                    this.f25367a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5796a(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
                    obtain.writeStrongBinder(iIndoorBuildingDelegate != null ? iIndoorBuildingDelegate.asBinder() : null);
                    this.f25367a.transact(2, obtain, obtain2, 0);
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

        public C6820a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
                        mo5795a();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
                        mo5796a(Stub.m30020a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IOnIndoorStateChangeListener");
            return true;
        }
    }

    /* renamed from: a */
    void mo5795a();

    /* renamed from: a */
    void mo5796a(IIndoorBuildingDelegate iIndoorBuildingDelegate);
}
