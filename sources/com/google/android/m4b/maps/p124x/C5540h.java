package com.google.android.m4b.maps.p124x;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate.Stub;

/* renamed from: com.google.android.m4b.maps.x.h */
public interface C5540h extends IInterface {

    /* renamed from: com.google.android.m4b.maps.x.h$a */
    public static abstract class C6810a extends Binder implements C5540h {
        public IBinder asBinder() {
            return this;
        }

        public C6810a() {
            attachInterface(this, "com.google.android.m4b.maps.internal.IInfoWindowRenderer");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.google.android.m4b.maps.internal.IInfoWindowRenderer");
                i = mo7149a(Stub.m30024a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                if (i != 0) {
                    parcel2.writeInt(1);
                    i.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.google.android.m4b.maps.internal.IInfoWindowRenderer");
                return true;
            }
        }
    }

    /* renamed from: a */
    Bitmap mo7149a(IMarkerDelegate iMarkerDelegate, int i, int i2);
}
