package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate.Stub;

/* renamed from: com.google.android.m4b.maps.x.w */
public interface C5555w extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.w$a */
    public static abstract class C6838a extends Binder implements C5555w {

        /* renamed from: com.google.android.m4b.maps.x.w$a$a */
        static class C6837a implements C5555w {
            /* renamed from: a */
            private IBinder f25376a;

            C6837a(IBinder iBinder) {
                this.f25376a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25376a;
            }

            /* renamed from: a */
            public final void mo5807a(IMarkerDelegate iMarkerDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(iMarkerDelegate != null ? iMarkerDelegate.asBinder() : null);
                    this.f25376a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo5809c(IMarkerDelegate iMarkerDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(iMarkerDelegate != null ? iMarkerDelegate.asBinder() : null);
                    this.f25376a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo5808b(IMarkerDelegate iMarkerDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                    obtain.writeStrongBinder(iMarkerDelegate != null ? iMarkerDelegate.asBinder() : null);
                    this.f25376a.transact(3, obtain, obtain2, 0);
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

        public C6838a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IOnMarkerDragListener");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                        mo5807a(Stub.m30024a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                        mo5809c(Stub.m30024a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
                        mo5808b(Stub.m30024a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IOnMarkerDragListener");
            return true;
        }
    }

    /* renamed from: a */
    void mo5807a(IMarkerDelegate iMarkerDelegate);

    /* renamed from: b */
    void mo5808b(IMarkerDelegate iMarkerDelegate);

    /* renamed from: c */
    void mo5809c(IMarkerDelegate iMarkerDelegate);
}
