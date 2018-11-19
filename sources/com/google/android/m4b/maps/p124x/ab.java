package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.StreetViewPanoramaLocation;

/* renamed from: com.google.android.m4b.maps.x.ab */
public interface ab extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.ab$a */
    public static abstract class C6785a extends Binder implements ab {

        /* renamed from: com.google.android.m4b.maps.x.ab$a$a */
        static class C6784a implements ab {
            /* renamed from: a */
            private IBinder f25353a;

            C6784a(IBinder iBinder) {
                this.f25353a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25353a;
            }

            /* renamed from: a */
            public final void mo5688a(StreetViewPanoramaLocation streetViewPanoramaLocation) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaChangeListener");
                    if (streetViewPanoramaLocation != null) {
                        obtain.writeInt(1);
                        streetViewPanoramaLocation.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25353a.transact(1, obtain, obtain2, 0);
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

        public C6785a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnStreetViewPanoramaChangeListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaChangeListener");
                mo5688a(parcel.readInt() != 0 ? StreetViewPanoramaLocation.CREATOR.m23901a(parcel) : 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnStreetViewPanoramaChangeListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5688a(StreetViewPanoramaLocation streetViewPanoramaLocation);
}
