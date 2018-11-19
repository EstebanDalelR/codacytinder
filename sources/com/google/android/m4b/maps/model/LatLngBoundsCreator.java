package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class LatLngBoundsCreator implements Creator<LatLngBounds> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23864a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23865a(i);
    }

    /* renamed from: a */
    public LatLngBounds m23864a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        LatLng latLng = null;
        int i = 0;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    latLng = (LatLng) C5466a.m23778a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    latLng2 = (LatLng) C5466a.m23778a(parcel, readInt, LatLng.CREATOR);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LatLngBounds(i, latLng, latLng2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public LatLngBounds[] m23865a(int i) {
        return new LatLngBounds[i];
    }

    /* renamed from: a */
    static void m23863a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, latLngBounds.m29996a());
        C5467b.m23804a(parcel, 2, latLngBounds.southwest, i, false);
        C5467b.m23804a(parcel, 3, latLngBounds.northeast, i, false);
        C5467b.m23796a(parcel, a);
    }
}
