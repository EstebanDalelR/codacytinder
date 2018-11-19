package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;
import com.google.android.m4b.maps.p124x.ae.C6791a;

/* renamed from: com.google.android.m4b.maps.x.ai */
public interface ai extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.ai$a */
    public static abstract class C6798a extends Binder implements ai {
        public IBinder asBinder() {
            return this;
        }

        public C6798a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                IBinder iBinder = null;
                Bundle bundle;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        i = mo7189a();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        i = C6735a.m30039a(parcel.readStrongBinder());
                        i2 = parcel.readInt() != 0 ? StreetViewPanoramaOptions.CREATOR.m20407a(parcel) : 0;
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7191a((C5484b) i, (StreetViewPanoramaOptions) i2, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7190a(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        i = mo7188a((C5484b) C6735a.m30039a(parcel.readStrongBinder()), (C5484b) C6735a.m30039a(parcel.readStrongBinder()), (Bundle) parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        mo7193b();
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        mo7195c();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        mo7196d();
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        mo7197e();
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        mo7198f();
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7194b(bundle);
                        parcel2.writeNoException();
                        if (bundle != null) {
                            parcel2.writeInt(1);
                            bundle.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        i = mo7199g();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
                        mo7192a((ae) C6791a.m30162a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IStreetViewPanoramaFragmentDelegate");
            return true;
        }
    }

    /* renamed from: a */
    C5484b mo7188a(C5484b c5484b, C5484b c5484b2, Bundle bundle);

    /* renamed from: a */
    ah mo7189a();

    /* renamed from: a */
    void mo7190a(Bundle bundle);

    /* renamed from: a */
    void mo7191a(C5484b c5484b, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle);

    /* renamed from: a */
    void mo7192a(ae aeVar);

    /* renamed from: b */
    void mo7193b();

    /* renamed from: b */
    void mo7194b(Bundle bundle);

    /* renamed from: c */
    void mo7195c();

    /* renamed from: d */
    void mo7196d();

    /* renamed from: e */
    void mo7197e();

    /* renamed from: f */
    void mo7198f();

    /* renamed from: g */
    boolean mo7199g();
}
