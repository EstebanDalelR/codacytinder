package com.google.android.m4b.maps.p124x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.p114n.C5484b;

/* renamed from: com.google.android.m4b.maps.x.c */
public interface C5535c extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.c$a */
    public static abstract class C6802a extends Binder implements C5535c {
        public IBinder asBinder() {
            return this;
        }

        public C6802a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                        i = mo7209a();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                        i = mo7218b();
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                        i = mo7211a((float) parcel.readFloat(), (float) parcel.readFloat());
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                        i = mo7210a((float) parcel.readFloat());
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                        i = mo7219b(parcel.readFloat());
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                        i = mo7212a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                        i = mo7213a((CameraPosition) parcel.readInt() != 0 ? CameraPosition.CREATOR.m23853a(parcel) : 0);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                        i = mo7214a((LatLng) parcel.readInt() != 0 ? LatLng.CREATOR.m23867a(parcel) : 0);
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                        i = mo7215a((LatLng) parcel.readInt() != 0 ? LatLng.CREATOR.m23867a(parcel) : 0, (float) parcel.readFloat());
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                        i = mo7216a((LatLngBounds) parcel.readInt() != 0 ? LatLngBounds.CREATOR.m23864a(parcel) : 0, (int) parcel.readInt());
                        parcel2.writeNoException();
                        if (i != 0) {
                            iBinder = i.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                        i = mo7217a(parcel.readInt() != 0 ? LatLngBounds.CREATOR.m23864a(parcel) : 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
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
            parcel2.writeString("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
            return true;
        }
    }

    /* renamed from: a */
    C5484b mo7209a();

    /* renamed from: a */
    C5484b mo7210a(float f);

    /* renamed from: a */
    C5484b mo7211a(float f, float f2);

    /* renamed from: a */
    C5484b mo7212a(float f, int i, int i2);

    /* renamed from: a */
    C5484b mo7213a(CameraPosition cameraPosition);

    /* renamed from: a */
    C5484b mo7214a(LatLng latLng);

    /* renamed from: a */
    C5484b mo7215a(LatLng latLng, float f);

    /* renamed from: a */
    C5484b mo7216a(LatLngBounds latLngBounds, int i);

    /* renamed from: a */
    C5484b mo7217a(LatLngBounds latLngBounds, int i, int i2, int i3);

    /* renamed from: b */
    C5484b mo7218b();

    /* renamed from: b */
    C5484b mo7219b(float f);
}
