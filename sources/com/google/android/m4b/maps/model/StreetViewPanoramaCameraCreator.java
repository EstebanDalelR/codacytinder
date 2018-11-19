package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class StreetViewPanoramaCameraCreator implements Creator<StreetViewPanoramaCamera> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23895a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23896a(i);
    }

    /* renamed from: a */
    public StreetViewPanoramaCamera m23895a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
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
                case 4:
                    f3 = C5466a.m23789i(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new StreetViewPanoramaCamera(i, f, f2, f3);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public StreetViewPanoramaCamera[] m23896a(int i) {
        return new StreetViewPanoramaCamera[i];
    }

    /* renamed from: a */
    static void m23894a(StreetViewPanoramaCamera streetViewPanoramaCamera, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, streetViewPanoramaCamera.m30008a());
        C5467b.m23799a(parcel, 2, streetViewPanoramaCamera.zoom);
        C5467b.m23799a(parcel, 3, streetViewPanoramaCamera.tilt);
        C5467b.m23799a(parcel, 4, streetViewPanoramaCamera.bearing);
        C5467b.m23796a(parcel, a);
    }
}
