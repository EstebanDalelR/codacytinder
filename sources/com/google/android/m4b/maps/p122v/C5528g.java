package com.google.android.m4b.maps.p122v;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p108h.C6691q;

/* renamed from: com.google.android.m4b.maps.v.g */
public interface C5528g extends IInterface {

    /* renamed from: com.google.android.m4b.maps.v.g$a */
    public static abstract class C6778a extends Binder implements C5528g {

        /* renamed from: com.google.android.m4b.maps.v.g$a$a */
        static class C6777a implements C5528g {
            /* renamed from: a */
            private IBinder f25349a;

            C6777a(IBinder iBinder) {
                this.f25349a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25349a;
            }

            /* renamed from: a */
            public final void mo5678a(C6676a c6676a, C6774a c6774a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
                    if (c6676a != null) {
                        obtain.writeInt(1);
                        c6676a.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (c6774a != null) {
                        obtain.writeInt(1);
                        c6774a.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25349a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5679a(C6691q c6691q) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
                    if (c6691q != null) {
                        obtain.writeInt(1);
                        c6691q.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25349a.transact(4, obtain, obtain2, 0);
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

        public C6778a() {
            attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        }

        /* renamed from: a */
        public static C5528g m30147a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5528g)) {
                return new C6777a(iBinder);
            }
            return (C5528g) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                C6774a c6774a = null;
                switch (i) {
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                        i = parcel.readInt() != 0 ? (C6676a) C6676a.CREATOR.createFromParcel(parcel) : 0;
                        if (parcel.readInt() != 0) {
                            c6774a = (C6774a) C6774a.CREATOR.createFromParcel(parcel);
                        }
                        mo5678a(i, c6774a);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        C6691q c6691q;
                        parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                        if (parcel.readInt() != 0) {
                            c6691q = (C6691q) C6691q.CREATOR.createFromParcel(parcel);
                        }
                        mo5679a(c6691q);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
            return true;
        }
    }

    /* renamed from: a */
    void mo5678a(C6676a c6676a, C6774a c6774a);

    /* renamed from: a */
    void mo5679a(C6691q c6691q);
}
