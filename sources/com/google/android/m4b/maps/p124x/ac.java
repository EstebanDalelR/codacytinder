package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.StreetViewPanoramaOrientation;

/* renamed from: com.google.android.m4b.maps.x.ac */
public interface ac extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.ac$a */
    public static abstract class C6787a extends Binder implements ac {

        /* renamed from: com.google.android.m4b.maps.x.ac$a$a */
        static class C6786a implements ac {
            /* renamed from: a */
            private IBinder f25354a;

            C6786a(IBinder iBinder) {
                this.f25354a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25354a;
            }

            /* renamed from: a */
            public final void mo5689a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaClickListener");
                    if (streetViewPanoramaOrientation != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaOrientation.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25354a.transact(1, obtain, obtain2, 0);
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

        public C6787a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnStreetViewPanoramaClickListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaClickListener");
                mo5689a(parcel.readInt() != 0 ? StreetViewPanoramaOrientation.CREATOR.m23907a(parcel) : 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaClickListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5689a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
}
