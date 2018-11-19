package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate.Stub;

/* renamed from: com.google.android.m4b.maps.x.o */
public interface C5547o extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.o$a */
    public static abstract class C6822a extends Binder implements C5547o {

        /* renamed from: com.google.android.m4b.maps.x.o$a$a */
        static class C6821a implements C5547o {
            /* renamed from: a */
            private IBinder f25368a;

            C6821a(IBinder iBinder) {
                this.f25368a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25368a;
            }

            /* renamed from: a */
            public final void mo5797a(IMarkerDelegate iMarkerDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnInfoWindowClickListener");
                    obtain.writeStrongBinder(iMarkerDelegate != null ? iMarkerDelegate.asBinder() : null);
                    this.f25368a.transact(1, obtain, obtain2, 0);
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

        public C6822a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnInfoWindowClickListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnInfoWindowClickListener");
                mo5797a(Stub.m30024a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnInfoWindowClickListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5797a(IMarkerDelegate iMarkerDelegate);
}
