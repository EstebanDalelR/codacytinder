package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class StreetViewPanoramaLinkCreator implements Creator<StreetViewPanoramaLink> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23898a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23899a(i);
    }

    /* renamed from: a */
    public StreetViewPanoramaLink m23898a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        int i = 0;
        String str = null;
        float f = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    str = C5466a.m23791k(parcel, readInt);
                    break;
                case 3:
                    f = C5466a.m23789i(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new StreetViewPanoramaLink(i, str, f);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public StreetViewPanoramaLink[] m23899a(int i) {
        return new StreetViewPanoramaLink[i];
    }

    /* renamed from: a */
    static void m23897a(StreetViewPanoramaLink streetViewPanoramaLink, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, streetViewPanoramaLink.m30009a());
        C5467b.m23806a(parcel, 2, streetViewPanoramaLink.panoId, false);
        C5467b.m23799a(parcel, 3, streetViewPanoramaLink.bearing);
        C5467b.m23796a(parcel, a);
    }
}
