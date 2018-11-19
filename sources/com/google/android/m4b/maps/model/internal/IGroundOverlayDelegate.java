package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;

public interface IGroundOverlayDelegate extends IInterface {

    public static abstract class Stub extends Binder implements IGroundOverlayDelegate {

        /* renamed from: com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate$Stub$a */
        static class C6719a implements IGroundOverlayDelegate {
            /* renamed from: a */
            private IBinder f25219a;

            C6719a(IBinder iBinder) {
                this.f25219a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25219a;
            }

            public final void remove() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    this.f25219a.transact(1, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    this.f25219a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setPosition(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25219a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final LatLng getPosition() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    this.f25219a.transact(4, obtain, obtain2, 0);
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

            public final void setDimensions(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    obtain.writeFloat(f);
                    this.f25219a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setDimensionsWithHeight(float f, float f2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    this.f25219a.transact(8.4E-45f, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    this.f25219a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    float readFloat = obtain2.readFloat();
                    return readFloat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final float getHeight() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    this.f25219a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    float readFloat = obtain2.readFloat();
                    return readFloat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setPositionFromBounds(LatLngBounds latLngBounds) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25219a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final LatLngBounds getBounds() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    this.f25219a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    LatLngBounds a = obtain2.readInt() != 0 ? LatLngBounds.CREATOR.m23864a(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setBearing(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    obtain.writeFloat(f);
                    this.f25219a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final float getBearing() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    this.f25219a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    float readFloat = obtain2.readFloat();
                    return readFloat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setZIndex(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    obtain.writeFloat(f);
                    this.f25219a.transact(13, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    this.f25219a.transact(14, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    obtain.writeInt(z);
                    this.f25219a.transact(15, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    boolean z = false;
                    this.f25219a.transact(16, obtain, obtain2, 0);
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

            public final void setTransparency(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    obtain.writeFloat(f);
                    this.f25219a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final float getTransparency() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    this.f25219a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    float readFloat = obtain2.readFloat();
                    return readFloat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    obtain.writeStrongBinder(iGroundOverlayDelegate != null ? iGroundOverlayDelegate.asBinder() : null);
                    boolean z = false;
                    this.f25219a.transact(19, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    this.f25219a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setImage(C5484b c5484b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                    obtain.writeStrongBinder(c5484b != null ? c5484b.asBinder() : null);
                    this.f25219a.transact(21, obtain, obtain2, 0);
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

        public Stub() {
            attachInterface(this, "com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
        }

        /* renamed from: a */
        public static IGroundOverlayDelegate m30019a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IGroundOverlayDelegate)) {
                return new C6719a(iBinder);
            }
            return (IGroundOverlayDelegate) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                LatLng latLng = null;
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        remove();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        i = getId();
                        parcel2.writeNoException();
                        parcel2.writeString(i);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        if (parcel.readInt() != 0) {
                            latLng = LatLng.CREATOR.m23867a(parcel);
                        }
                        setPosition(latLng);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        i = getPosition();
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        setDimensions(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        setDimensionsWithHeight(parcel.readFloat(), parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        i = getWidth();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        i = getHeight();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 9:
                        LatLngBounds a;
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        if (parcel.readInt() != 0) {
                            a = LatLngBounds.CREATOR.m23864a(parcel);
                        }
                        setPositionFromBounds(a);
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        i = getBounds();
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        setBearing(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        i = getBearing();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        setZIndex(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        i = getZIndex();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setVisible(z);
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        i = isVisible();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        setTransparency(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        i = getTransparency();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 19:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        i = equalsRemote(m30019a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 20:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        i = hashCodeRemote();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 21:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
                        setImage(C6735a.m30039a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate");
            return true;
        }
    }

    boolean equalsRemote(IGroundOverlayDelegate iGroundOverlayDelegate);

    float getBearing();

    LatLngBounds getBounds();

    float getHeight();

    String getId();

    LatLng getPosition();

    float getTransparency();

    float getWidth();

    float getZIndex();

    int hashCodeRemote();

    boolean isVisible();

    void remove();

    void setBearing(float f);

    void setDimensions(float f);

    void setDimensionsWithHeight(float f, float f2);

    void setImage(C5484b c5484b);

    void setPosition(LatLng latLng);

    void setPositionFromBounds(LatLngBounds latLngBounds);

    void setTransparency(float f);

    void setVisible(boolean z);

    void setZIndex(float f);
}
