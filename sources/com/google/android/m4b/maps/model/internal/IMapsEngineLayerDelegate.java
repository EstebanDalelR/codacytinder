package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.MapsEngineLayerInfo;

public interface IMapsEngineLayerDelegate extends IInterface {

    public static abstract class Stub extends Binder implements IMapsEngineLayerDelegate {

        /* renamed from: com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate$Stub$a */
        static class C6723a implements IMapsEngineLayerDelegate {
            /* renamed from: a */
            private IBinder f25223a;

            C6723a(IBinder iBinder) {
                this.f25223a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25223a;
            }

            public final void remove() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                    this.f25223a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final MapsEngineLayerInfo getLayerInfo() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                    this.f25223a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    MapsEngineLayerInfo a = obtain2.readInt() != 0 ? MapsEngineLayerInfo.CREATOR.m23870a(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setZIndex(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                    obtain.writeFloat(f);
                    this.f25223a.transact(3, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                    this.f25223a.transact(4, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                    obtain.writeInt(z);
                    this.f25223a.transact(5, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                    boolean z = false;
                    this.f25223a.transact(6, obtain, obtain2, 0);
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

            public final void setDefaultUiEnabled(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                    obtain.writeInt(z);
                    this.f25223a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean isDefaultUiEnabled() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                    boolean z = false;
                    this.f25223a.transact(8, obtain, obtain2, 0);
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

            public final boolean equalsRemote(IMapsEngineLayerDelegate iMapsEngineLayerDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                    obtain.writeStrongBinder(iMapsEngineLayerDelegate != null ? iMapsEngineLayerDelegate.asBinder() : null);
                    boolean z = false;
                    this.f25223a.transact(9, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                    this.f25223a.transact(10, obtain, obtain2, 0);
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
            attachInterface(this, "com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
        }

        /* renamed from: a */
        public static IMapsEngineLayerDelegate m30023a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMapsEngineLayerDelegate)) {
                return new C6723a(iBinder);
            }
            return (IMapsEngineLayerDelegate) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                        remove();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                        i = getLayerInfo();
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                        setZIndex(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                        i = getZIndex();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setVisible(z);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                        i = isVisible();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setDefaultUiEnabled(z);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                        i = isDefaultUiEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                        i = equalsRemote(m30023a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
                        i = hashCodeRemote();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate");
            return true;
        }
    }

    boolean equalsRemote(IMapsEngineLayerDelegate iMapsEngineLayerDelegate);

    MapsEngineLayerInfo getLayerInfo();

    float getZIndex();

    int hashCodeRemote();

    boolean isDefaultUiEnabled();

    boolean isVisible();

    void remove();

    void setDefaultUiEnabled(boolean z);

    void setVisible(boolean z);

    void setZIndex(float f);
}
