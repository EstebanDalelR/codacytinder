package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p124x.ae.C6791a;

/* renamed from: com.google.android.m4b.maps.x.aj */
public interface aj extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.aj$a */
    public static abstract class C6799a extends Binder implements aj {
        public IBinder asBinder() {
            return this;
        }

        public C6799a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                IBinder iBinder = null;
                Bundle bundle;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                        i = mo7200a();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7201a(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                        mo7203b();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                        mo7205c();
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                        mo7206d();
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                        mo7207e();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo7204b(bundle);
                        parcel2.writeNoException();
                        if (bundle != null) {
                            parcel2.writeInt(1);
                            bundle.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                        i = mo7208f();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
                        mo7202a((ae) C6791a.m30162a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.IStreetViewPanoramaViewDelegate");
            return true;
        }
    }

    /* renamed from: a */
    ah mo7200a();

    /* renamed from: a */
    void mo7201a(Bundle bundle);

    /* renamed from: a */
    void mo7202a(ae aeVar);

    /* renamed from: b */
    void mo7203b();

    /* renamed from: b */
    void mo7204b(Bundle bundle);

    /* renamed from: c */
    void mo7205c();

    /* renamed from: d */
    void mo7206d();

    /* renamed from: e */
    void mo7207e();

    /* renamed from: f */
    C5484b mo7208f();
}
