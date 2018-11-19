package com.google.android.m4b.maps.p114n;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.n.b */
public interface C5484b extends IInterface {

    /* renamed from: com.google.android.m4b.maps.n.b$a */
    public static abstract class C6735a extends Binder implements C5484b {

        /* renamed from: com.google.android.m4b.maps.n.b$a$a */
        static class C6734a implements C5484b {
            /* renamed from: a */
            private IBinder f25244a;

            C6734a(IBinder iBinder) {
                this.f25244a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25244a;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C6735a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C5484b m30039a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5484b)) {
                return new C6734a(iBinder);
            }
            return (C5484b) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
            return true;
        }
    }
}
