package com.google.android.m4b.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;

public interface IBitmapDescriptorFactoryDelegate extends IInterface {

    public static abstract class Stub extends Binder implements IBitmapDescriptorFactoryDelegate {

        /* renamed from: com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate$Stub$a */
        static class C6717a implements IBitmapDescriptorFactoryDelegate {
            /* renamed from: a */
            private IBinder f25217a;

            public final IBinder asBinder() {
                return this.f25217a;
            }

            public final C5484b fromResource(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    obtain.writeInt(i);
                    this.f25217a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    i = C6735a.m30039a(obtain2.readStrongBinder());
                    return i;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final C5484b fromAsset(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    obtain.writeString(str);
                    this.f25217a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    str = C6735a.m30039a(obtain2.readStrongBinder());
                    return str;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final C5484b fromFile(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    obtain.writeString(str);
                    this.f25217a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    str = C6735a.m30039a(obtain2.readStrongBinder());
                    return str;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final C5484b defaultMarker() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    this.f25217a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    C5484b a = C6735a.m30039a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final C5484b defaultMarkerWithHue(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    obtain.writeFloat(f);
                    this.f25217a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    f = C6735a.m30039a(obtain2.readStrongBinder());
                    return f;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final C5484b fromBitmap(Bitmap bitmap) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    if (bitmap != null) {
                        obtain.writeInt(1);
                        bitmap.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25217a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    bitmap = C6735a.m30039a(obtain2.readStrongBinder());
                    return bitmap;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final C5484b fromPath(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                    obtain.writeString(str);
                    this.f25217a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    str = C6735a.m30039a(obtain2.readStrongBinder());
                    return str;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                        i = fromResource(parcel.readInt());
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                        i = fromAsset(parcel.readString());
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                        i = fromFile(parcel.readString());
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                        i = defaultMarker();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                        i = defaultMarkerWithHue(parcel.readFloat());
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                        i = fromBitmap(parcel.readInt() != 0 ? (Bitmap) Bitmap.CREATOR.createFromParcel(parcel) : 0);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                        i = fromPath(parcel.readString());
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
            parcel2.writeString("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            return true;
        }
    }

    C5484b defaultMarker();

    C5484b defaultMarkerWithHue(float f);

    C5484b fromAsset(String str);

    C5484b fromBitmap(Bitmap bitmap);

    C5484b fromFile(String str);

    C5484b fromPath(String str);

    C5484b fromResource(int i);
}
