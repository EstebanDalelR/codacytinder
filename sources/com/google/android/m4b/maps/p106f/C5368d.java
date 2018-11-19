package com.google.android.m4b.maps.p106f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p105e.C5364d;
import com.google.android.m4b.maps.p105e.C6669c;
import com.google.android.m4b.maps.p106f.C5367c.C6673a.C6672a;

/* renamed from: com.google.android.m4b.maps.f.d */
public interface C5368d extends IInterface {

    /* renamed from: com.google.android.m4b.maps.f.d$a */
    public static abstract class C6675a extends Binder implements C5368d {

        /* renamed from: com.google.android.m4b.maps.f.d$a$a */
        static class C6674a implements C5368d {
            /* renamed from: a */
            private IBinder f24964a;

            C6674a(IBinder iBinder) {
                this.f24964a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f24964a;
            }

            /* renamed from: a */
            public final void mo5400a(C5367c c5367c, C6669c c6669c) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                    obtain.writeStrongBinder(c5367c != null ? c5367c.asBinder() : null);
                    if (c6669c != null) {
                        obtain.writeInt(1);
                        c6669c.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f24964a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C5368d m29743a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5368d)) {
                return new C6674a(iBinder);
            }
            return (C5368d) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                i = parcel.readStrongBinder();
                parcel2 = null;
                if (i == 0) {
                    i = 0;
                } else {
                    i2 = i.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
                    if (i2 == 0 || !(i2 instanceof C5367c)) {
                        i = new C6672a(i);
                    } else {
                        i = (C5367c) i2;
                    }
                }
                if (parcel.readInt() != 0) {
                    parcel2 = C6669c.CREATOR;
                    parcel2 = C5364d.m23561a(parcel);
                }
                mo5400a(i, parcel2);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo5400a(C5367c c5367c, C6669c c6669c);
}
