package com.google.android.m4b.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;

public interface IMapsEngineFeatureDelegate extends IInterface {

    public static abstract class Stub extends Binder implements IMapsEngineFeatureDelegate {

        /* renamed from: com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate$Stub$a */
        static class C6722a implements IMapsEngineFeatureDelegate {
            /* renamed from: a */
            private IBinder f25222a;

            C6722a(IBinder iBinder) {
                this.f25222a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25222a;
            }

            public final IMapsEngineLayerDelegate getLayer() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                    this.f25222a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    IMapsEngineLayerDelegate a = com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate.Stub.m30023a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String getFeatureId() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                    this.f25222a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final LatLng getPoint() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                    this.f25222a.transact(3, obtain, obtain2, 0);
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

            public final String getDescription() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                    this.f25222a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String getGmeFeatureId() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                    this.f25222a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean equalsRemote(IMapsEngineFeatureDelegate iMapsEngineFeatureDelegate) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                    obtain.writeStrongBinder(iMapsEngineFeatureDelegate != null ? iMapsEngineFeatureDelegate.asBinder() : null);
                    boolean z = false;
                    this.f25222a.transact(6, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                    this.f25222a.transact(7, obtain, obtain2, 0);
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
            attachInterface(this, "com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
        }

        /* renamed from: a */
        public static IMapsEngineFeatureDelegate m30022a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMapsEngineFeatureDelegate)) {
                return new C6722a(iBinder);
            }
            return (IMapsEngineFeatureDelegate) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                        i = getLayer();
                        parcel2.writeNoException();
                        if (i != 0) {
                            i = i.asBinder();
                        } else {
                            i = 0;
                        }
                        parcel2.writeStrongBinder(i);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                        i = getFeatureId();
                        parcel2.writeNoException();
                        parcel2.writeString(i);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                        i = getPoint();
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                        i = getDescription();
                        parcel2.writeNoException();
                        parcel2.writeString(i);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                        i = getGmeFeatureId();
                        parcel2.writeNoException();
                        parcel2.writeString(i);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                        i = equalsRemote(m30022a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
                        i = hashCodeRemote();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate");
            return true;
        }
    }

    boolean equalsRemote(IMapsEngineFeatureDelegate iMapsEngineFeatureDelegate);

    String getDescription();

    String getFeatureId();

    String getGmeFeatureId();

    IMapsEngineLayerDelegate getLayer();

    LatLng getPoint();

    int hashCodeRemote();
}
