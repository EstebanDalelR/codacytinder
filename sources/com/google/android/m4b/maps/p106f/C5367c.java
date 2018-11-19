package com.google.android.m4b.maps.p106f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p108h.C6691q;

/* renamed from: com.google.android.m4b.maps.f.c */
public interface C5367c extends IInterface {

    /* renamed from: com.google.android.m4b.maps.f.c$a */
    public static abstract class C6673a extends Binder implements C5367c {

        /* renamed from: com.google.android.m4b.maps.f.c$a$a */
        static class C6672a implements C5367c {
            /* renamed from: a */
            private IBinder f24963a;

            C6672a(IBinder iBinder) {
                this.f24963a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f24963a;
            }

            /* renamed from: a */
            public final void mo5399a(C6691q c6691q) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (c6691q != null) {
                        obtain.writeInt(1);
                        c6691q.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f24963a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C6673a() {
            attachInterface(this, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                mo5399a(parcel.readInt() != 0 ? (C6691q) C6691q.CREATOR.createFromParcel(parcel) : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5399a(C6691q c6691q);
}
