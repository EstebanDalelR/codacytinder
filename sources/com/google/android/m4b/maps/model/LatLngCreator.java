package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class LatLngCreator implements Creator<LatLng> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23867a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23868a(i);
    }

    /* renamed from: a */
    public LatLng m23867a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        double d = 0.0d;
        double d2 = d;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    d = C5466a.m23790j(parcel, readInt);
                    break;
                case 3:
                    d2 = C5466a.m23790j(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LatLng(i, d, d2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public LatLng[] m23868a(int i) {
        return new LatLng[i];
    }

    /* renamed from: a */
    static void m23866a(LatLng latLng, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, latLng.m29990a());
        C5467b.m23798a(parcel, 2, latLng.latitude);
        C5467b.m23798a(parcel, 3, latLng.longitude);
        C5467b.m23796a(parcel, a);
    }
}
