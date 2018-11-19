package com.google.android.m4b.maps.p119s;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.s.a */
public interface C5518a extends IInterface {

    /* renamed from: com.google.android.m4b.maps.s.a$a */
    public static abstract class C6767a extends Binder implements C5518a {

        /* renamed from: com.google.android.m4b.maps.s.a$a$a */
        static class C6766a implements C5518a {
            /* renamed from: a */
            private IBinder f25334a;

            C6766a(IBinder iBinder) {
                this.f25334a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25334a;
            }

            /* renamed from: a */
            public final Bundle mo5675a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.service.IHttpProxyService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25334a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    bundle = obtain2.readInt() != null ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C5518a m30134a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.service.IHttpProxyService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5518a)) {
                return new C6766a(iBinder);
            }
            return (C5518a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.maps.service.IHttpProxyService");
                i = mo5675a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : 0);
                parcel2.writeNoException();
                if (i != 0) {
                    parcel2.writeInt(1);
                    i.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.maps.service.IHttpProxyService");
                return true;
            }
        }
    }

    /* renamed from: a */
    Bundle mo5675a(Bundle bundle);
}
