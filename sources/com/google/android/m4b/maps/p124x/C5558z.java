package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.PointOfInterest;

/* renamed from: com.google.android.m4b.maps.x.z */
public interface C5558z extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.z$a */
    public static abstract class C6844a extends Binder implements C5558z {

        /* renamed from: com.google.android.m4b.maps.x.z$a$a */
        static class C6843a implements C5558z {
            /* renamed from: a */
            private IBinder f25379a;

            C6843a(IBinder iBinder) {
                this.f25379a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25379a;
            }

            /* renamed from: a */
            public final void mo5812a(PointOfInterest pointOfInterest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnPoiClickListener");
                    if (pointOfInterest != null) {
                        obtain.writeInt(1);
                        pointOfInterest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25379a.transact(1, obtain, obtain2, 0);
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

        public C6844a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnPoiClickListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnPoiClickListener");
                mo5812a(parcel.readInt() != 0 ? PointOfInterest.CREATOR.m23886a(parcel) : 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnPoiClickListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5812a(PointOfInterest pointOfInterest);
}
