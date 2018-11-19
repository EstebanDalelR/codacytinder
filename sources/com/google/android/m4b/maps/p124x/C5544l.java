package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.x.l */
public interface C5544l extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.l$a */
    public static abstract class C6816a extends Binder implements C5544l {

        /* renamed from: com.google.android.m4b.maps.x.l$a$a */
        static class C6815a implements C5544l {
            /* renamed from: a */
            private IBinder f25365a;

            C6815a(IBinder iBinder) {
                this.f25365a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25365a;
            }

            /* renamed from: a */
            public final String mo5793a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
                    this.f25365a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5794a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
                    obtain.writeString(str);
                    this.f25365a.transact(2, obtain, obtain2, 0);
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

        public C6816a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOAuthTokenProvider");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
                        i = mo5793a();
                        parcel2.writeNoException();
                        parcel2.writeString(i);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
                        mo5794a(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IOAuthTokenProvider");
            return true;
        }
    }

    /* renamed from: a */
    String mo5793a();

    /* renamed from: a */
    void mo5794a(String str);
}
