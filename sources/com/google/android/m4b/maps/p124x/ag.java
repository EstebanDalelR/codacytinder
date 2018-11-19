package com.google.android.m4b.maps.p124x;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;

/* renamed from: com.google.android.m4b.maps.x.ag */
public interface ag extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.ag$a */
    public static abstract class C6795a extends Binder implements ag {

        /* renamed from: com.google.android.m4b.maps.x.ag$a$a */
        static class C6794a implements ag {
            /* renamed from: a */
            private IBinder f25358a;

            C6794a(IBinder iBinder) {
                this.f25358a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25358a;
            }

            /* renamed from: a */
            public final void mo5695a(Bitmap bitmap) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.ISnapshotReadyCallback");
                    if (bitmap != null) {
                        obtain.writeInt(1);
                        bitmap.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25358a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5696a(C5484b c5484b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.ISnapshotReadyCallback");
                    obtain.writeStrongBinder(c5484b != null ? c5484b.asBinder() : null);
                    this.f25358a.transact(2, obtain, obtain2, 0);
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

        public C6795a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.ISnapshotReadyCallback");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ISnapshotReadyCallback");
                        mo5695a((Bitmap) parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : 0);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ISnapshotReadyCallback");
                        mo5696a((C5484b) C6735a.m30039a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.ISnapshotReadyCallback");
            return true;
        }
    }

    /* renamed from: a */
    void mo5695a(Bitmap bitmap);

    /* renamed from: a */
    void mo5696a(C5484b c5484b);
}
