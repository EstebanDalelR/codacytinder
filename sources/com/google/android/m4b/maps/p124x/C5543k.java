package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p124x.C5552t.C6832a;

/* renamed from: com.google.android.m4b.maps.x.k */
public interface C5543k extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.k$a */
    public static abstract class C6814a extends Binder implements C5543k {
        public IBinder asBinder() {
            return this;
        }

        public C6814a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IMapViewDelegate");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                IBinder iBinder = null;
                Bundle bundle;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                        i = mo7169a();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7170a(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                        mo7172b();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                        mo7174c();
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                        mo7176d();
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                        mo7177e();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7173b(bundle);
                        parcel2.writeNoException();
                        if (bundle != null) {
                            parcel2.writeInt(1);
                            bundle.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                        i = mo7178f();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                        mo7171a((C5552t) C6832a.m30288a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7175c(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapViewDelegate");
                        mo7179g();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IMapViewDelegate");
            return true;
        }
    }

    /* renamed from: a */
    C5538f mo7169a();

    /* renamed from: a */
    void mo7170a(Bundle bundle);

    /* renamed from: a */
    void mo7171a(C5552t c5552t);

    /* renamed from: b */
    void mo7172b();

    /* renamed from: b */
    void mo7173b(Bundle bundle);

    /* renamed from: c */
    void mo7174c();

    /* renamed from: c */
    void mo7175c(Bundle bundle);

    /* renamed from: d */
    void mo7176d();

    /* renamed from: e */
    void mo7177e();

    /* renamed from: f */
    C5484b mo7178f();

    /* renamed from: g */
    void mo7179g();
}
