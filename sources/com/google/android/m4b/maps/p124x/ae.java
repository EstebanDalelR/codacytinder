package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p124x.ah.C6797a;

/* renamed from: com.google.android.m4b.maps.x.ae */
public interface ae extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.ae$a */
    public static abstract class C6791a extends Binder implements ae {

        /* renamed from: com.google.android.m4b.maps.x.ae$a$a */
        static class C6790a implements ae {
            /* renamed from: a */
            private IBinder f25356a;

            C6790a(IBinder iBinder) {
                this.f25356a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25356a;
            }

            /* renamed from: a */
            public final void mo5691a(ah ahVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaReadyCallback");
                    obtain.writeStrongBinder(ahVar != null ? ahVar.asBinder() : null);
                    this.f25356a.transact(1, obtain, obtain2, 0);
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

        public C6791a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnStreetViewPanoramaReadyCallback");
        }

        /* renamed from: a */
        public static ae m30162a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaReadyCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ae)) {
                return new C6790a(iBinder);
            }
            return (ae) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaReadyCallback");
                mo5691a(C6797a.m30189a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaReadyCallback");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5691a(ah ahVar);
}
