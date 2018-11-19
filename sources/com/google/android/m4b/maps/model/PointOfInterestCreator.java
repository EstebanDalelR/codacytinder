package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class PointOfInterestCreator implements Creator<PointOfInterest> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23886a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23887a(i);
    }

    /* renamed from: a */
    public PointOfInterest m23886a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        LatLng latLng = null;
        int i = 0;
        String str = null;
        String str2 = str;
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
                    str = C5466a.m23791k(parcel, readInt);
                    break;
                case 4:
                    str2 = C5466a.m23791k(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new PointOfInterest(i, latLng, str, str2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public PointOfInterest[] m23887a(int i) {
        return new PointOfInterest[i];
    }

    /* renamed from: a */
    static void m23885a(PointOfInterest pointOfInterest, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, pointOfInterest.m30004a());
        C5467b.m23804a(parcel, 2, pointOfInterest.latLng, i, false);
        C5467b.m23806a(parcel, 3, pointOfInterest.placeId, false);
        C5467b.m23806a(parcel, 4, pointOfInterest.name, false);
        C5467b.m23796a(parcel, a);
    }
}
