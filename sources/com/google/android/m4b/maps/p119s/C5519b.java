package com.google.android.m4b.maps.p119s;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.s.b */
public interface C5519b extends IInterface {

    /* renamed from: com.google.android.m4b.maps.s.b$a */
    public static abstract class C6769a extends Binder implements C5519b {

        /* renamed from: com.google.android.m4b.maps.s.b$a$a */
        static class C6768a implements C5519b {
            /* renamed from: a */
            private IBinder f25335a;

            C6768a(IBinder iBinder) {
                this.f25335a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25335a;
            }

            /* renamed from: a */
            public final boolean mo5676a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.service.ISidewinderService");
                    boolean z = false;
                    this.f25335a.transact(1, obtain, obtain2, 0);
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

            /* renamed from: b */
            public final Map mo5677b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.service.ISidewinderService");
                    this.f25335a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    Map readHashMap = obtain2.readHashMap(getClass().getClassLoader());
                    return readHashMap;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C5519b m30137a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.service.ISidewinderService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5519b)) {
                return new C6768a(iBinder);
            }
            return (C5519b) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.maps.service.ISidewinderService");
                        i = mo5676a();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.maps.service.ISidewinderService");
                        i = mo5677b();
                        parcel2.writeNoException();
                        parcel2.writeMap(i);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.gms.maps.service.ISidewinderService");
            return true;
        }
    }

    /* renamed from: a */
    boolean mo5676a();

    /* renamed from: b */
    Map mo5677b();
}
