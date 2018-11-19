package com.google.android.m4b.maps.p118r;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.r.a */
public interface C5517a extends IInterface {

    /* renamed from: com.google.android.m4b.maps.r.a$a */
    public static abstract class C6765a extends Binder implements C5517a {

        /* renamed from: com.google.android.m4b.maps.r.a$a$a */
        static class C6764a implements C5517a {
            /* renamed from: a */
            private IBinder f25333a;

            C6764a(IBinder iBinder) {
                this.f25333a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25333a;
            }

            /* renamed from: a */
            public final Bundle mo5674a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.auth.IApiTokenService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25333a.transact(1, obtain, obtain2, 0);
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
        public static C5517a m30132a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.auth.IApiTokenService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5517a)) {
                return new C6764a(iBinder);
            }
            return (C5517a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.maps.auth.IApiTokenService");
                i = mo5674a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : 0);
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
                parcel2.writeString("com.google.android.gms.maps.auth.IApiTokenService");
                return true;
            }
        }
    }

    /* renamed from: a */
    Bundle mo5674a(Bundle bundle);
}
