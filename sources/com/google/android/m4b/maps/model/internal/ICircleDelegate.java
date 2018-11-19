package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;

public interface ICircleDelegate extends IInterface {

    public static abstract class Stub extends Binder implements ICircleDelegate {

        /* renamed from: com.google.android.m4b.maps.model.internal.ICircleDelegate$Stub$a */
        static class C6718a implements ICircleDelegate {
            /* renamed from: a */
            private IBinder f25218a;

            C6718a(IBinder iBinder) {
                this.f25218a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25218a;
            }

            public final void remove() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    this.f25218a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String getId() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    this.f25218a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setCenter(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25218a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final LatLng getCenter() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    this.f25218a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    LatLng a = obtain2.readInt() != 0 ? LatLng.CREATOR.m23867a(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setRadius(double d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    obtain.writeDouble(d);
                    this.f25218a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final double getRadius() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    this.f25218a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    double readDouble = obtain2.readDouble();
                    return readDouble;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setStrokeWidth(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    obtain.writeFloat(f);
                    this.f25218a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final float getStrokeWidth() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    this.f25218a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    float readFloat = obtain2.readFloat();
                    return readFloat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setStrokeColor(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    obtain.writeInt(i);
                    this.f25218a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int getStrokeColor() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    this.f25218a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setFillColor(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    obtain.writeInt(i);
                    this.f25218a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int getFillColor() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    this.f25218a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setZIndex(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    obtain.writeFloat(f);
                    this.f25218a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final float getZIndex() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    this.f25218a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    float readFloat = obtain2.readFloat();
                    return readFloat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setVisible(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    obtain.writeInt(z);
                    this.f25218a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean isVisible() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    boolean z = false;
                    this.f25218a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
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

            public final boolean equalsRemote(ICircleDelegate iCircleDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    obtain.writeStrongBinder(iCircleDelegate != null ? iCircleDelegate.asBinder() : null);
                    boolean z = false;
                    this.f25218a.transact(17, obtain, obtain2, 0);
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

            public final int hashCodeRemote() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                    this.f25218a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
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
            attachInterface(this, "com.google.android.m4b.maps.model.internal.ICircleDelegate");
        }

        /* renamed from: a */
        public static ICircleDelegate m30018a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ICircleDelegate)) {
                return new C6718a(iBinder);
            }
            return (ICircleDelegate) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        remove();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        i = getId();
                        parcel2.writeNoException();
                        parcel2.writeString(i);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        setCenter(parcel.readInt() != 0 ? LatLng.CREATOR.m23867a(parcel) : 0);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        i = getCenter();
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        setRadius(parcel.readDouble());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        i = getRadius();
                        parcel2.writeNoException();
                        parcel2.writeDouble(i);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        setStrokeWidth(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        i = getStrokeWidth();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        setStrokeColor(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        i = getStrokeColor();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        setFillColor(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        i = getFillColor();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        setZIndex(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        i = getZIndex();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setVisible(z);
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        i = isVisible();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        i = equalsRemote(m30018a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 18:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ICircleDelegate");
                        i = hashCodeRemote();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.model.internal.ICircleDelegate");
            return true;
        }
    }

    boolean equalsRemote(ICircleDelegate iCircleDelegate);

    LatLng getCenter();

    int getFillColor();

    String getId();

    double getRadius();

    int getStrokeColor();

    float getStrokeWidth();

    float getZIndex();

    int hashCodeRemote();

    boolean isVisible();

    void remove();

    void setCenter(LatLng latLng);

    void setFillColor(int i);

    void setRadius(double d);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);

    void setVisible(boolean z);

    void setZIndex(float f);
}
