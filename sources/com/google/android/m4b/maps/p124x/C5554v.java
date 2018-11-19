package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate.Stub;

/* renamed from: com.google.android.m4b.maps.x.v */
public interface C5554v extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.v$a */
    public static abstract class C6836a extends Binder implements C5554v {

        /* renamed from: com.google.android.m4b.maps.x.v$a$a */
        static class C6835a implements C5554v {
            /* renamed from: a */
            private IBinder f25375a;

            C6835a(IBinder iBinder) {
                this.f25375a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25375a;
            }

            /* renamed from: a */
            public final boolean mo5806a(IMarkerDelegate iMarkerDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMarkerClickListener");
                    obtain.writeStrongBinder(iMarkerDelegate != null ? iMarkerDelegate.asBinder() : null);
                    boolean z = false;
                    this.f25375a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != null) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C6836a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnMarkerClickListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMarkerClickListener");
                i = mo5806a(Stub.m30024a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IOnMarkerClickListener");
                return true;
            }
        }
    }

    /* renamed from: a */
    boolean mo5806a(IMarkerDelegate iMarkerDelegate);
}
