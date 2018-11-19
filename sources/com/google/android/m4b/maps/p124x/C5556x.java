package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.x.x */
public interface C5556x extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.x$a */
    public static abstract class C6840a extends Binder implements C5556x {

        /* renamed from: com.google.android.m4b.maps.x.x$a$a */
        static class C6839a implements C5556x {
            /* renamed from: a */
            private IBinder f25377a;

            C6839a(IBinder iBinder) {
                this.f25377a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25377a;
            }

            /* renamed from: a */
            public final boolean mo5810a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMyLocationButtonClickListener");
                    boolean z = false;
                    this.f25377a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C6840a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnMyLocationButtonClickListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMyLocationButtonClickListener");
                i = mo5810a();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnMyLocationButtonClickListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo5810a();
}
