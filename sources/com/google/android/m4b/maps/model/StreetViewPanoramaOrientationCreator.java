package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class StreetViewPanoramaOrientationCreator implements Creator<StreetViewPanoramaOrientation> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23907a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23908a(i);
    }

    /* renamed from: a */
    public StreetViewPanoramaOrientation m23907a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    f = C5466a.m23789i(parcel, readInt);
                    break;
                case 3:
                    f2 = C5466a.m23789i(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new StreetViewPanoramaOrientation(i, f, f2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public StreetViewPanoramaOrientation[] m23908a(int i) {
        return new StreetViewPanoramaOrientation[i];
    }

    /* renamed from: a */
    static void m23906a(StreetViewPanoramaOrientation streetViewPanoramaOrientation, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, streetViewPanoramaOrientation.m30011a());
        C5467b.m23799a(parcel, 2, streetViewPanoramaOrientation.tilt);
        C5467b.m23799a(parcel, 3, streetViewPanoramaOrientation.bearing);
        C5467b.m23796a(parcel, a);
    }
}
