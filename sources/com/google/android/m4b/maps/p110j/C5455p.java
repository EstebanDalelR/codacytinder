package com.google.android.m4b.maps.p110j;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.j.p */
public interface C5455p extends IInterface {

    /* renamed from: com.google.android.m4b.maps.j.p$a */
    public static abstract class C6705a extends Binder implements C5455p {

        /* renamed from: com.google.android.m4b.maps.j.p$a$a */
        static class C6704a implements C5455p {
            /* renamed from: a */
            private IBinder f25103a;

            C6704a(IBinder iBinder) {
                this.f25103a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25103a;
            }

            /* renamed from: a */
            public final Account mo5436a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
                    this.f25103a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    Account account = obtain2.readInt() != 0 ? (Account) Account.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return account;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        /* renamed from: a */
        public static C5455p m29915a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5455p)) {
                return new C6704a(iBinder);
            }
            return (C5455p) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                parcel.enforceInterface("com.google.android.gms.common.internal.IAccountAccessor");
                i = mo5436a();
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
                parcel2.writeString("com.google.android.gms.common.internal.IAccountAccessor");
                return true;
            }
        }
    }

    /* renamed from: a */
    Account mo5436a();
}
