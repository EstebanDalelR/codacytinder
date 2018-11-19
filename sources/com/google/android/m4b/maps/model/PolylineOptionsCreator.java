package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;
import java.util.List;

public class PolylineOptionsCreator implements Creator<PolylineOptions> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23892a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23893a(i);
    }

    /* renamed from: a */
    public PolylineOptions m23892a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        List list = null;
        int i = 0;
        float f = 0.0f;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    list = C5466a.m23782c(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    f = C5466a.m23789i(parcel, readInt);
                    break;
                case 4:
                    i2 = C5466a.m23786f(parcel, readInt);
                    break;
                case 5:
                    f2 = C5466a.m23789i(parcel, readInt);
                    break;
                case 6:
                    z = C5466a.m23783c(parcel, readInt);
                    break;
                case 7:
                    z2 = C5466a.m23783c(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new PolylineOptions(i, list, f, i2, f2, z, z2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public PolylineOptions[] m23893a(int i) {
        return new PolylineOptions[i];
    }

    /* renamed from: a */
    static void m23891a(PolylineOptions polylineOptions, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, polylineOptions.m30007a());
        C5467b.m23815b(parcel, 2, polylineOptions.getPoints(), false);
        C5467b.m23799a(parcel, 3, polylineOptions.getWidth());
        C5467b.m23800a(parcel, 4, polylineOptions.getColor());
        C5467b.m23799a(parcel, 5, polylineOptions.getZIndex());
        C5467b.m23809a(parcel, 6, polylineOptions.isVisible());
        C5467b.m23809a(parcel, 7, polylineOptions.isGeodesic());
        C5467b.m23796a(parcel, a);
    }
}
