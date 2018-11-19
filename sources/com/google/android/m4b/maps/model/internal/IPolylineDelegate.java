package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;
import java.util.List;

public interface IPolylineDelegate extends IInterface {

    public static abstract class Stub extends Binder implements IPolylineDelegate {

        /* renamed from: com.google.android.m4b.maps.model.internal.IPolylineDelegate$Stub$a */
        static class C6726a implements IPolylineDelegate {
            /* renamed from: a */
            private IBinder f25226a;

            C6726a(IBinder iBinder) {
                this.f25226a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25226a;
            }

            public final void remove() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    this.f25226a.transact(1, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    this.f25226a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setPoints(List<LatLng> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    obtain.writeTypedList(list);
                    this.f25226a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<LatLng> getPoints() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    this.f25226a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    List<LatLng> createTypedArrayList = obtain2.createTypedArrayList(LatLng.CREATOR);
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setWidth(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    obtain.writeFloat(f);
                    this.f25226a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final float getWidth() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    this.f25226a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    float readFloat = obtain2.readFloat();
                    return readFloat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setColor(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    obtain.writeInt(i);
                    this.f25226a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int getColor() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    this.f25226a.transact(8, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    obtain.writeFloat(f);
                    this.f25226a.transact(9, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    this.f25226a.transact(10, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    obtain.writeInt(z);
                    this.f25226a.transact(11, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    boolean z = false;
                    this.f25226a.transact(12, obtain, obtain2, 0);
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

            public final void setGeodesic(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    obtain.writeInt(z);
                    this.f25226a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean isGeodesic() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    boolean z = false;
                    this.f25226a.transact(14, obtain, obtain2, 0);
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

            public final boolean equalsRemote(IPolylineDelegate iPolylineDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    obtain.writeStrongBinder(iPolylineDelegate != null ? iPolylineDelegate.asBinder() : null);
                    boolean z = false;
                    this.f25226a.transact(15, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                    this.f25226a.transact(16, obtain, obtain2, 0);
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
            attachInterface(this, "com.google.android.m4b.maps.model.internal.IPolylineDelegate");
        }

        /* renamed from: a */
        public static IPolylineDelegate m30026a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IPolylineDelegate)) {
                return new C6726a(iBinder);
            }
            return (IPolylineDelegate) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        remove();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        i = getId();
                        parcel2.writeNoException();
                        parcel2.writeString(i);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        setPoints(parcel.createTypedArrayList(LatLng.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        i = getPoints();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(i);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        setWidth(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        i = getWidth();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        setColor(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        i = getColor();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        setZIndex(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        i = getZIndex();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setVisible(z);
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        i = isVisible();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setGeodesic(z);
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        i = isGeodesic();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        i = equalsRemote(m30026a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
                        i = hashCodeRemote();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.model.internal.IPolylineDelegate");
            return true;
        }
    }

    boolean equalsRemote(IPolylineDelegate iPolylineDelegate);

    int getColor();

    String getId();

    List<LatLng> getPoints();

    float getWidth();

    float getZIndex();

    int hashCodeRemote();

    boolean isGeodesic();

    boolean isVisible();

    void remove();

    void setColor(int i);

    void setGeodesic(boolean z);

    void setPoints(List<LatLng> list);

    void setVisible(boolean z);

    void setWidth(float f);

    void setZIndex(float f);
}
