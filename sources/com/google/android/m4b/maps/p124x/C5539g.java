package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate.Stub;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;

/* renamed from: com.google.android.m4b.maps.x.g */
public interface C5539g extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.g$a */
    public static abstract class C6809a extends Binder implements C5539g {

        /* renamed from: com.google.android.m4b.maps.x.g$a$a */
        static class C6808a implements C5539g {
            /* renamed from: a */
            private IBinder f25363a;

            C6808a(IBinder iBinder) {
                this.f25363a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25363a;
            }

            /* renamed from: a */
            public final C5484b mo5789a(IMarkerDelegate iMarkerDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
                    obtain.writeStrongBinder(iMarkerDelegate != null ? iMarkerDelegate.asBinder() : null);
                    this.f25363a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    iMarkerDelegate = C6735a.m30039a(obtain2.readStrongBinder());
                    return iMarkerDelegate;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final C5484b mo5790b(IMarkerDelegate iMarkerDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
                    obtain.writeStrongBinder(iMarkerDelegate != null ? iMarkerDelegate.asBinder() : null);
                    this.f25363a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    iMarkerDelegate = C6735a.m30039a(obtain2.readStrongBinder());
                    return iMarkerDelegate;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C6809a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IInfoWindowAdapter");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
                        i = mo5789a(Stub.m30024a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
                        i = mo5790b(Stub.m30024a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IInfoWindowAdapter");
            return true;
        }
    }

    /* renamed from: a */
    C5484b mo5789a(IMarkerDelegate iMarkerDelegate);

    /* renamed from: b */
    C5484b mo5790b(IMarkerDelegate iMarkerDelegate);
}
