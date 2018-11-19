package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.CameraPosition;

/* renamed from: com.google.android.m4b.maps.x.m */
public interface C5545m extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.m$a */
    public static abstract class C6818a extends Binder implements C5545m {

        /* renamed from: com.google.android.m4b.maps.x.m$a$a */
        static class C6817a implements C5545m {
            /* renamed from: a */
            private IBinder f25366a;

            C6817a(IBinder iBinder) {
                this.f25366a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25366a;
            }

            /* renamed from: a */
            public final void mo5313a(CameraPosition cameraPosition) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnCameraChangeListener");
                    if (cameraPosition != null) {
                        obtain.writeInt(1);
                        cameraPosition.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25366a.transact(1, obtain, obtain2, 0);
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

        public C6818a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnCameraChangeListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnCameraChangeListener");
                mo5313a(parcel.readInt() != 0 ? CameraPosition.CREATOR.m23853a(parcel) : 0);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnCameraChangeListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5313a(CameraPosition cameraPosition);
}
