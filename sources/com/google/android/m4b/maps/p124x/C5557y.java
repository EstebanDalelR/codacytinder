package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;

/* renamed from: com.google.android.m4b.maps.x.y */
public interface C5557y extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.y$a */
    public static abstract class C6842a extends Binder implements C5557y {

        /* renamed from: com.google.android.m4b.maps.x.y$a$a */
        static class C6841a implements C5557y {
            /* renamed from: a */
            private IBinder f25378a;

            C6841a(IBinder iBinder) {
                this.f25378a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25378a;
            }

            /* renamed from: a */
            public final void mo5811a(C5484b c5484b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMyLocationChangeListener");
                    obtain.writeStrongBinder(c5484b != null ? c5484b.asBinder() : null);
                    this.f25378a.transact(1, obtain, obtain2, 0);
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

        public C6842a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnMyLocationChangeListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMyLocationChangeListener");
                mo5811a(C6735a.m30039a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnMyLocationChangeListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5811a(C5484b c5484b);
}
