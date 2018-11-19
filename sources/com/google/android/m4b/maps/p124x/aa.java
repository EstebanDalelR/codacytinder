package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;

/* renamed from: com.google.android.m4b.maps.x.aa */
public interface aa extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.aa$a */
    public static abstract class C6783a extends Binder implements aa {

        /* renamed from: com.google.android.m4b.maps.x.aa$a$a */
        static class C6782a implements aa {
            /* renamed from: a */
            private IBinder f25352a;

            C6782a(IBinder iBinder) {
                this.f25352a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25352a;
            }

            /* renamed from: a */
            public final void mo5687a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                    if (streetViewPanoramaCamera != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaCamera.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25352a.transact(1, obtain, obtain2, 0);
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

        public C6783a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                mo5687a(parcel.readInt() != 0 ? StreetViewPanoramaCamera.CREATOR.m23895a(parcel) : 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5687a(StreetViewPanoramaCamera streetViewPanoramaCamera);
}
