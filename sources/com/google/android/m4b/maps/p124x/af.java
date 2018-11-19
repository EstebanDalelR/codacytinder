package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.VisibleRegion;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;

/* renamed from: com.google.android.m4b.maps.x.af */
public interface af extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.af$a */
    public static abstract class C6793a extends Binder implements af {

        /* renamed from: com.google.android.m4b.maps.x.af$a$a */
        static class C6792a implements af {
            /* renamed from: a */
            private IBinder f25357a;

            C6792a(IBinder iBinder) {
                this.f25357a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25357a;
            }

            /* renamed from: a */
            public final LatLng mo5692a(C5484b c5484b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IProjectionDelegate");
                    LatLng latLng = null;
                    obtain.writeStrongBinder(c5484b != null ? c5484b.asBinder() : null);
                    this.f25357a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != null) {
                        latLng = LatLng.CREATOR.m23867a(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return latLng;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final C5484b mo5694a(LatLng latLng) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IProjectionDelegate");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25357a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    latLng = C6735a.m30039a(obtain2.readStrongBinder());
                    return latLng;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final VisibleRegion mo5693a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.m4b.maps.internal.IProjectionDelegate");
                    this.f25357a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    VisibleRegion a = obtain2.readInt() != 0 ? VisibleRegion.CREATOR.m23916a(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C6793a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IProjectionDelegate");
        }

        /* renamed from: a */
        public static af m30166a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.m4b.maps.internal.IProjectionDelegate");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof af)) {
                return new C6792a(iBinder);
            }
            return (af) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IProjectionDelegate");
                        i = mo5692a((C5484b) C6735a.m30039a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IProjectionDelegate");
                        i2 = 0;
                        i = mo5694a((LatLng) parcel.readInt() != 0 ? LatLng.CREATOR.m23867a(parcel) : 0);
                        parcel2.writeNoException();
                        if (i != 0) {
                            i2 = i.asBinder();
                        }
                        parcel2.writeStrongBinder(i2);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IProjectionDelegate");
                        i = mo5693a();
                        parcel2.writeNoException();
                        if (i != 0) {
                            parcel2.writeInt(1);
                            i.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IProjectionDelegate");
            return true;
        }
    }

    /* renamed from: a */
    LatLng mo5692a(C5484b c5484b);

    /* renamed from: a */
    VisibleRegion mo5693a();

    /* renamed from: a */
    C5484b mo5694a(LatLng latLng);
}
