package com.google.android.m4b.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class StreetViewPanoramaOptionsCreator implements Creator<StreetViewPanoramaOptions> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m20407a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m20408a(i);
    }

    /* renamed from: a */
    public StreetViewPanoramaOptions m20407a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = streetViewPanoramaCamera;
        LatLng latLng = str;
        Integer num = latLng;
        int i = 0;
        byte b = (byte) 0;
        byte b2 = (byte) 0;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        byte b5 = (byte) 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) C5466a.m23778a(parcel, readInt, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = C5466a.m23791k(parcel, readInt);
                    break;
                case 4:
                    latLng = (LatLng) C5466a.m23778a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    num = C5466a.m23787g(parcel, readInt);
                    break;
                case 6:
                    b = C5466a.m23784d(parcel, readInt);
                    break;
                case 7:
                    b2 = C5466a.m23784d(parcel, readInt);
                    break;
                case 8:
                    b3 = C5466a.m23784d(parcel, readInt);
                    break;
                case 9:
                    b4 = C5466a.m23784d(parcel, readInt);
                    break;
                case 10:
                    b5 = C5466a.m23784d(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new StreetViewPanoramaOptions(i, streetViewPanoramaCamera, str, latLng, num, b, b2, b3, b4, b5);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public StreetViewPanoramaOptions[] m20408a(int i) {
        return new StreetViewPanoramaOptions[i];
    }

    /* renamed from: a */
    static void m20406a(StreetViewPanoramaOptions streetViewPanoramaOptions, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, streetViewPanoramaOptions.m27653a());
        C5467b.m23804a(parcel, 2, streetViewPanoramaOptions.getStreetViewPanoramaCamera(), i, false);
        C5467b.m23806a(parcel, 3, streetViewPanoramaOptions.getPanoramaId(), false);
        C5467b.m23804a(parcel, 4, streetViewPanoramaOptions.getPosition(), i, false);
        C5467b.m23805a(parcel, 5, streetViewPanoramaOptions.getRadius(), false);
        C5467b.m23797a(parcel, 6, streetViewPanoramaOptions.m27654b());
        C5467b.m23797a(parcel, 7, streetViewPanoramaOptions.m27655c());
        C5467b.m23797a(parcel, 8, streetViewPanoramaOptions.m27656d());
        C5467b.m23797a(parcel, 9, streetViewPanoramaOptions.m27657e());
        C5467b.m23797a(parcel, 10, streetViewPanoramaOptions.m27658f());
        C5467b.m23796a(parcel, a);
    }
}
