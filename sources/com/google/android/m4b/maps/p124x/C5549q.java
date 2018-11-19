package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;

/* renamed from: com.google.android.m4b.maps.x.q */
public interface C5549q extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.q$a */
    public static abstract class C6826a extends Binder implements C5549q {

        /* renamed from: com.google.android.m4b.maps.x.q$a$a */
        static class C6825a implements C5549q {
            /* renamed from: a */
            private IBinder f25370a;

            C6825a(IBinder iBinder) {
                this.f25370a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25370a;
            }

            /* renamed from: a */
            public final void mo5800a(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMapClickListener");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25370a.transact(1, obtain, obtain2, 0);
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

        public C6826a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnMapClickListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMapClickListener");
                mo5800a(parcel.readInt() != 0 ? LatLng.CREATOR.m23867a(parcel) : 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnMapClickListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5800a(LatLng latLng);
}
