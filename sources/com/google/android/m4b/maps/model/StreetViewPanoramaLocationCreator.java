package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class StreetViewPanoramaLocationCreator implements Creator<StreetViewPanoramaLocation> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23901a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23902a(i);
    }

    /* renamed from: a */
    public StreetViewPanoramaLocation m23901a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        int i = 0;
        LatLng latLng = null;
        String str = latLng;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) C5466a.m23781b(parcel, readInt, StreetViewPanoramaLink.CREATOR);
                    break;
                case 3:
                    latLng = (LatLng) C5466a.m23778a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    str = C5466a.m23791k(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new StreetViewPanoramaLocation(i, streetViewPanoramaLinkArr, latLng, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public StreetViewPanoramaLocation[] m23902a(int i) {
        return new StreetViewPanoramaLocation[i];
    }

    /* renamed from: a */
    static void m23900a(StreetViewPanoramaLocation streetViewPanoramaLocation, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, streetViewPanoramaLocation.m30010a());
        C5467b.m23811a(parcel, 2, streetViewPanoramaLocation.links, i, false);
        C5467b.m23804a(parcel, 3, streetViewPanoramaLocation.position, i, false);
        C5467b.m23806a(parcel, 4, streetViewPanoramaLocation.panoId, false);
        C5467b.m23796a(parcel, a);
    }
}
