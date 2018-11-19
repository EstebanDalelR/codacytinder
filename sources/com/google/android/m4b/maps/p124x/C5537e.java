package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate;
import com.google.android.m4b.maps.p114n.C5484b;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;

/* renamed from: com.google.android.m4b.maps.x.e */
public interface C5537e extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.e$a */
    public static abstract class C6805a extends Binder implements C5537e {
        public IBinder asBinder() {
            return this;
        }

        public C6805a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.ICreator");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                        mo7249a(C6735a.m30039a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                        i = mo7252b(C6735a.m30039a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                        i = mo7248a((C5484b) C6735a.m30039a(parcel.readStrongBinder()), (GoogleMapOptions) parcel.readInt() != 0 ? GoogleMapOptions.CREATOR.m20400a(parcel) : null);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                        i = mo7247a();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                        i = mo7251b();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                        mo7250a((C5484b) C6735a.m30039a(parcel.readStrongBinder()), (int) parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                        i = mo7246a((C5484b) C6735a.m30039a(parcel.readStrongBinder()), (StreetViewPanoramaOptions) parcel.readInt() != 0 ? StreetViewPanoramaOptions.CREATOR.m20407a(parcel) : null);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICreator");
                        i = mo7253c(C6735a.m30039a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.m4b.maps.internal.ICreator");
            return true;
        }
    }

    /* renamed from: a */
    aj mo7246a(C5484b c5484b, StreetViewPanoramaOptions streetViewPanoramaOptions);

    /* renamed from: a */
    C5535c mo7247a();

    /* renamed from: a */
    C5543k mo7248a(C5484b c5484b, GoogleMapOptions googleMapOptions);

    /* renamed from: a */
    void mo7249a(C5484b c5484b);

    /* renamed from: a */
    void mo7250a(C5484b c5484b, int i);

    /* renamed from: b */
    IBitmapDescriptorFactoryDelegate mo7251b();

    /* renamed from: b */
    C5542j mo7252b(C5484b c5484b);

    /* renamed from: c */
    ai mo7253c(C5484b c5484b);
}
