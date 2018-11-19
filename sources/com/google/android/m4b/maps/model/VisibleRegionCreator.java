package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class VisibleRegionCreator implements Creator<VisibleRegion> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23916a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23917a(i);
    }

    /* renamed from: a */
    public VisibleRegion m23916a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        LatLng latLng = null;
        LatLng latLng2 = latLng;
        LatLng latLng3 = latLng2;
        LatLng latLng4 = latLng3;
        LatLngBounds latLngBounds = latLng4;
        int i = 0;
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
                case 4:
                    latLng3 = (LatLng) C5466a.m23778a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    latLng4 = (LatLng) C5466a.m23778a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C5466a.m23778a(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new VisibleRegion(i, latLng, latLng2, latLng3, latLng4, latLngBounds);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public VisibleRegion[] m23917a(int i) {
        return new VisibleRegion[i];
    }

    /* renamed from: a */
    static void m23915a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, visibleRegion.m30016a());
        C5467b.m23804a(parcel, 2, visibleRegion.nearLeft, i, false);
        C5467b.m23804a(parcel, 3, visibleRegion.nearRight, i, false);
        C5467b.m23804a(parcel, 4, visibleRegion.farLeft, i, false);
        C5467b.m23804a(parcel, 5, visibleRegion.farRight, i, false);
        C5467b.m23804a(parcel, 6, visibleRegion.latLngBounds, i, false);
        C5467b.m23796a(parcel, a);
    }
}
