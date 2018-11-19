package com.google.android.m4b.maps.p122v;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5455p;
import com.google.android.m4b.maps.p110j.C5455p.C6705a;
import com.google.android.m4b.maps.p110j.C5459t;
import com.google.android.m4b.maps.p110j.C5459t.C6711a;
import com.google.android.m4b.maps.p110j.C6698b;
import com.google.android.m4b.maps.p110j.C6712w;
import com.google.android.m4b.maps.p122v.C5528g.C6778a;

/* renamed from: com.google.android.m4b.maps.v.h */
public interface C5529h extends IInterface {

    /* renamed from: com.google.android.m4b.maps.v.h$a */
    public static abstract class C6780a extends Binder implements C5529h {

        /* renamed from: com.google.android.m4b.maps.v.h$a$a */
        static class C6779a implements C5529h {
            /* renamed from: a */
            private IBinder f25350a;

            C6779a(IBinder iBinder) {
                this.f25350a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25350a;
            }

            /* renamed from: a */
            public final void mo5682a(C6698b c6698b, C5528g c5528g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (c6698b != null) {
                        obtain.writeInt(1);
                        c6698b.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c5528g != null ? c5528g.asBinder() : null);
                    this.f25350a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5685a(C6775d c6775d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (c6775d != null) {
                        obtain.writeInt(1);
                        c6775d.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25350a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5686a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeInt(z);
                    this.f25350a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5684a(C6712w c6712w, C5459t c5459t) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    if (c6712w != null) {
                        obtain.writeInt(1);
                        c6712w.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c5459t != null ? c5459t.asBinder() : null);
                    this.f25350a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5680a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeInt(i);
                    this.f25350a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5681a(int i, Account account, C5528g c5528g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeInt(i);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c5528g != null ? c5528g.asBinder() : null);
                    this.f25350a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5683a(C5455p c5455p, int i, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
                    obtain.writeStrongBinder(c5455p != null ? c5455p.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeInt(z);
                    this.f25350a.transact(9, obtain, obtain2, false);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C5529h m30155a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5529h)) {
                return new C6779a(iBinder);
            }
            return (C5529h) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                C6698b c6698b = null;
                switch (i) {
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                        if (parcel.readInt() != 0) {
                            c6698b = (C6698b) C6698b.CREATOR.createFromParcel(parcel);
                        }
                        mo5682a(c6698b, (C5528g) C6778a.m30147a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        C6775d c6775d;
                        parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                        if (parcel.readInt() != 0) {
                            c6775d = (C6775d) C6775d.CREATOR.createFromParcel(parcel);
                        }
                        mo5685a(c6775d);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo5686a(z);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        C6712w c6712w;
                        parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                        if (parcel.readInt() != 0) {
                            c6712w = (C6712w) C6712w.CREATOR.createFromParcel(parcel);
                        }
                        mo5684a(c6712w, (C5459t) C6711a.m29966a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        switch (i) {
                            case 7:
                                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                                mo5680a(parcel.readInt());
                                parcel2.writeNoException();
                                return true;
                            case 8:
                                Account account;
                                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                                i = parcel.readInt();
                                if (parcel.readInt() != 0) {
                                    account = (Account) Account.CREATOR.createFromParcel(parcel);
                                }
                                mo5681a(i, account, (C5528g) C6778a.m30147a(parcel.readStrongBinder()));
                                parcel2.writeNoException();
                                return true;
                            case 9:
                                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
                                i = C6705a.m29915a(parcel.readStrongBinder());
                                i2 = parcel.readInt();
                                if (parcel.readInt() != null) {
                                    z = true;
                                }
                                mo5683a((C5455p) i, i2, z);
                                parcel2.writeNoException();
                                return true;
                            default:
                                return super.onTransact(i, parcel, parcel2, i2);
                        }
                }
            }
            parcel2.writeString("com.google.android.gms.signin.internal.ISignInService");
            return true;
        }
    }

    /* renamed from: a */
    void mo5680a(int i);

    /* renamed from: a */
    void mo5681a(int i, Account account, C5528g c5528g);

    /* renamed from: a */
    void mo5682a(C6698b c6698b, C5528g c5528g);

    /* renamed from: a */
    void mo5683a(C5455p c5455p, int i, boolean z);

    /* renamed from: a */
    void mo5684a(C6712w c6712w, C5459t c5459t);

    /* renamed from: a */
    void mo5685a(C6775d c6775d);

    /* renamed from: a */
    void mo5686a(boolean z);
}
