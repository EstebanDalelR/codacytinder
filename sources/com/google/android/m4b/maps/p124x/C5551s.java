package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;

/* renamed from: com.google.android.m4b.maps.x.s */
public interface C5551s extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.s$a */
    public static abstract class C6830a extends Binder implements C5551s {

        /* renamed from: com.google.android.m4b.maps.x.s$a$a */
        static class C6829a implements C5551s {
            /* renamed from: a */
            private IBinder f25372a;

            C6829a(IBinder iBinder) {
                this.f25372a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25372a;
            }

            /* renamed from: a */
            public final void mo5802a(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMapLongClickListener");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25372a.transact(1, obtain, obtain2, 0);
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

        public C6830a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnMapLongClickListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMapLongClickListener");
                mo5802a(parcel.readInt() != 0 ? LatLng.CREATOR.m23867a(parcel) : 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnMapLongClickListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5802a(LatLng latLng);
}
