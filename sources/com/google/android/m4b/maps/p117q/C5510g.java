package com.google.android.m4b.maps.p117q;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p115o.C6749w;

/* renamed from: com.google.android.m4b.maps.q.g */
public interface C5510g extends IInterface {

    /* renamed from: com.google.android.m4b.maps.q.g$a */
    public static abstract class C6760a extends Binder implements C5510g {

        /* renamed from: com.google.android.m4b.maps.q.g$a$a */
        static class C6759a implements C5510g {
            /* renamed from: a */
            private IBinder f25308a;

            C6759a(IBinder iBinder) {
                this.f25308a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25308a;
            }

            /* renamed from: a */
            public final void mo5673a(C6749w c6749w) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.ISettingsCallbacks");
                    if (c6749w != null) {
                        obtain.writeInt(1);
                        c6749w.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25308a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
                mo5673a(parcel.readInt() != 0 ? (C6749w) C6749w.CREATOR.createFromParcel(parcel) : 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.location.internal.ISettingsCallbacks");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5673a(C6749w c6749w);
}
