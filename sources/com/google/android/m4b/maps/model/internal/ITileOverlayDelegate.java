package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ITileOverlayDelegate extends IInterface {

    public static abstract class Stub extends Binder implements ITileOverlayDelegate {

        /* renamed from: com.google.android.m4b.maps.model.internal.ITileOverlayDelegate$Stub$a */
        static class C6727a implements ITileOverlayDelegate {
            /* renamed from: a */
            private IBinder f25227a;

            C6727a(IBinder iBinder) {
                this.f25227a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25227a;
            }

            public final void remove() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                    this.f25227a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void clearTileCache() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                    this.f25227a.transact(2, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                    this.f25227a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setZIndex(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                    obtain.writeFloat(f);
                    this.f25227a.transact(4, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                    this.f25227a.transact(5, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                    obtain.writeInt(z);
                    this.f25227a.transact(6, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                    boolean z = false;
                    this.f25227a.transact(7, obtain, obtain2, 0);
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

            public final boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                    obtain.writeStrongBinder(iTileOverlayDelegate != null ? iTileOverlayDelegate.asBinder() : null);
                    boolean z = false;
                    this.f25227a.transact(8, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                    this.f25227a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setFadeIn(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                    obtain.writeInt(z);
                    this.f25227a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean getFadeIn() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                    boolean z = false;
                    this.f25227a.transact(11, obtain, obtain2, 0);
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
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
        }

        /* renamed from: a */
        public static ITileOverlayDelegate m30027a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITileOverlayDelegate)) {
                return new C6727a(iBinder);
            }
            return (ITileOverlayDelegate) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                        remove();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                        clearTileCache();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                        i = getId();
                        parcel2.writeNoException();
                        parcel2.writeString(i);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                        setZIndex(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                        i = getZIndex();
                        parcel2.writeNoException();
                        parcel2.writeFloat(i);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setVisible(z);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                        i = isVisible();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                        i = equalsRemote(m30027a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                        i = hashCodeRemote();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        setFadeIn(z);
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
                        i = getFadeIn();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.model.internal.ITileOverlayDelegate");
            return true;
        }
    }

    void clearTileCache();

    boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate);

    boolean getFadeIn();

    String getId();

    float getZIndex();

    int hashCodeRemote();

    boolean isVisible();

    void remove();

    void setFadeIn(boolean z);

    void setVisible(boolean z);

    void setZIndex(float f);
}
