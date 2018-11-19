package com.google.android.m4b.maps.p117q;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.m4b.maps.q.e */
public interface C5508e extends IInterface {

    /* renamed from: com.google.android.m4b.maps.q.e$a */
    public static abstract class C6756a extends Binder implements C5508e {

        /* renamed from: com.google.android.m4b.maps.q.e$a$a */
        static class C6755a implements C5508e {
            /* renamed from: a */
            private IBinder f25306a;

            C6755a(IBinder iBinder) {
                this.f25306a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f25306a;
            }

            /* renamed from: a */
            public final void mo5645a(int i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f25306a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo5646b(int i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f25306a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo5644a(int i, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
                    obtain.writeInt(i);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25306a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C5508e m30086a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C5508e)) {
                return new C6755a(iBinder);
            }
            return (C5508e) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                        mo5645a(parcel.readInt(), (String[]) parcel.createStringArray());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                        mo5646b(parcel.readInt(), parcel.createStringArray());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.gms.location.internal.IGeofencerCallbacks");
                        mo5644a(parcel.readInt(), (PendingIntent) parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.gms.location.internal.IGeofencerCallbacks");
            return true;
        }
    }

    /* renamed from: a */
    void mo5644a(int i, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo5645a(int i, String[] strArr);

    /* renamed from: b */
    void mo5646b(int i, String[] strArr);
}
