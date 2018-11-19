package com.google.android.m4b.maps.p124x;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;

/* renamed from: com.google.android.m4b.maps.x.p */
public interface C5548p extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.p$a */
    public static abstract class C6824a extends Binder implements C5548p {

        /* renamed from: com.google.android.m4b.maps.x.p$a$a */
        static class C6823a implements C5548p {
            /* renamed from: a */
            private IBinder f25369a;

            C6823a(IBinder iBinder) {
                this.f25369a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25369a;
            }

            /* renamed from: a */
            public final void mo5799a(C5484b c5484b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnLocationChangeListener");
                    obtain.writeStrongBinder(c5484b != null ? c5484b.asBinder() : null);
                    this.f25369a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5798a(Location location) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnLocationChangeListener");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25369a.transact(2, obtain, obtain2, 0);
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

        public C6824a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnLocationChangeListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnLocationChangeListener");
                        mo5799a((C5484b) C6735a.m30039a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnLocationChangeListener");
                        mo5798a((Location) parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : 0);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IOnLocationChangeListener");
            return true;
        }
    }

    /* renamed from: a */
    void mo5798a(Location location);

    /* renamed from: a */
    void mo5799a(C5484b c5484b);
}
