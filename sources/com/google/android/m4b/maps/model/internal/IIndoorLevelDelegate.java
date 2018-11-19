package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IIndoorLevelDelegate extends IInterface {

    public static abstract class Stub extends Binder implements IIndoorLevelDelegate {

        /* renamed from: com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate$Stub$a */
        static class C6721a implements IIndoorLevelDelegate {
            /* renamed from: a */
            private IBinder f25221a;

            C6721a(IBinder iBinder) {
                this.f25221a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25221a;
            }

            public final String getName() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
                    this.f25221a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String getShortName() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
                    this.f25221a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void activate() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
                    this.f25221a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
                    obtain.writeStrongBinder(iIndoorLevelDelegate != null ? iIndoorLevelDelegate.asBinder() : null);
                    boolean z = false;
                    this.f25221a.transact(4, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
                    this.f25221a.transact(5, obtain, obtain2, 0);
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
            attachInterface(this, "com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
        }

        /* renamed from: a */
        public static IIndoorLevelDelegate m30021a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IIndoorLevelDelegate)) {
                return new C6721a(iBinder);
            }
            return (IIndoorLevelDelegate) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
                        i = getName();
                        parcel2.writeNoException();
                        parcel2.writeString(i);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
                        i = getShortName();
                        parcel2.writeNoException();
                        parcel2.writeString(i);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
                        activate();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
                        i = equalsRemote(m30021a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
                        i = hashCodeRemote();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate");
            return true;
        }
    }

    void activate();

    boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate);

    String getName();

    String getShortName();

    int hashCodeRemote();
}
