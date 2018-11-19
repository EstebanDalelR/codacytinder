package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;
import com.google.android.m4b.maps.p124x.C5552t.C6832a;

/* renamed from: com.google.android.m4b.maps.x.j */
public interface C5542j extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.j$a */
    public static abstract class C6813a extends Binder implements C5542j {
        public IBinder asBinder() {
            return this;
        }

        public C6813a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IMapFragmentDelegate");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                IBinder iBinder = null;
                Bundle bundle;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        i = mo7156a();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        i = C6735a.m30039a(parcel.readStrongBinder());
                        i2 = parcel.readInt() != 0 ? GoogleMapOptions.CREATOR.m20400a(parcel) : 0;
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7158a((C5484b) i, (GoogleMapOptions) i2, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7157a(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        i = mo7155a((C5484b) C6735a.m30039a(parcel.readStrongBinder()), (C5484b) C6735a.m30039a(parcel.readStrongBinder()), (Bundle) parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        mo7160b();
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        mo7162c();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        mo7164d();
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        mo7165e();
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        mo7166f();
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7161b(bundle);
                        parcel2.writeNoException();
                        if (bundle != null) {
                            parcel2.writeInt(1);
                            bundle.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        i = mo7167g();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        mo7159a((C5552t) C6832a.m30288a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7163c(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
                        mo7168h();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IMapFragmentDelegate");
            return true;
        }
    }

    /* renamed from: a */
    C5484b mo7155a(C5484b c5484b, C5484b c5484b2, Bundle bundle);

    /* renamed from: a */
    C5538f mo7156a();

    /* renamed from: a */
    void mo7157a(Bundle bundle);

    /* renamed from: a */
    void mo7158a(C5484b c5484b, GoogleMapOptions googleMapOptions, Bundle bundle);

    /* renamed from: a */
    void mo7159a(C5552t c5552t);

    /* renamed from: b */
    void mo7160b();

    /* renamed from: b */
    void mo7161b(Bundle bundle);

    /* renamed from: c */
    void mo7162c();

    /* renamed from: c */
    void mo7163c(Bundle bundle);

    /* renamed from: d */
    void mo7164d();

    /* renamed from: e */
    void mo7165e();

    /* renamed from: f */
    void mo7166f();

    /* renamed from: g */
    boolean mo7167g();

    /* renamed from: h */
    void mo7168h();
}
