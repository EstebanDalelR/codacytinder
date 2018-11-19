package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public interface IIndoorBuildingDelegate extends IInterface {

    public static abstract class Stub extends Binder implements IIndoorBuildingDelegate {

        /* renamed from: com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate$Stub$a */
        static class C6720a implements IIndoorBuildingDelegate {
            /* renamed from: a */
            private IBinder f25220a;

            C6720a(IBinder iBinder) {
                this.f25220a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25220a;
            }

            public final int getActiveLevelIndex() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                    this.f25220a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int getDefaultLevelIndex() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                    this.f25220a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final List<IBinder> getLevels() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                    this.f25220a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    List<IBinder> createBinderArrayList = obtain2.createBinderArrayList();
                    return createBinderArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean isUnderground() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                    boolean z = false;
                    this.f25220a.transact(4, obtain, obtain2, 0);
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

            public final boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                    obtain.writeStrongBinder(iIndoorBuildingDelegate != null ? iIndoorBuildingDelegate.asBinder() : null);
                    boolean z = false;
                    this.f25220a.transact(5, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                    this.f25220a.transact(6, obtain, obtain2, 0);
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
            attachInterface(this, "com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
        }

        /* renamed from: a */
        public static IIndoorBuildingDelegate m30020a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IIndoorBuildingDelegate)) {
                return new C6720a(iBinder);
            }
            return (IIndoorBuildingDelegate) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                        i = getActiveLevelIndex();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                        i = getDefaultLevelIndex();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                        i = getLevels();
                        parcel2.writeNoException();
                        parcel2.writeBinderList(i);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                        i = isUnderground();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                        i = equalsRemote(m30020a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
                        i = hashCodeRemote();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate");
            return true;
        }
    }

    boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate);

    int getActiveLevelIndex();

    int getDefaultLevelIndex();

    List<IBinder> getLevels();

    int hashCodeRemote();

    boolean isUnderground();
}
