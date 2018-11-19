package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class CircleOptionsCreator implements Creator<CircleOptions> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23856a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23857a(i);
    }

    /* renamed from: a */
    public CircleOptions m23856a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = C5466a.m23776a(parcel);
        LatLng latLng = null;
        double d = 0.0d;
        int i = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f2 = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel2, readInt);
                    break;
                case 2:
                    latLng = (LatLng) C5466a.m23778a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    d = C5466a.m23790j(parcel2, readInt);
                    break;
                case 4:
                    f = C5466a.m23789i(parcel2, readInt);
                    break;
                case 5:
                    i2 = C5466a.m23786f(parcel2, readInt);
                    break;
                case 6:
                    i3 = C5466a.m23786f(parcel2, readInt);
                    break;
                case 7:
                    f2 = C5466a.m23789i(parcel2, readInt);
                    break;
                case 8:
                    z = C5466a.m23783c(parcel2, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new CircleOptions(i, latLng, d, f, i2, i3, f2, z);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel2);
    }

    /* renamed from: a */
    public CircleOptions[] m23857a(int i) {
        return new CircleOptions[i];
    }

    /* renamed from: a */
    static void m23855a(CircleOptions circleOptions, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, circleOptions.m29986a());
        C5467b.m23804a(parcel, 2, circleOptions.getCenter(), i, false);
        C5467b.m23798a(parcel, 3, circleOptions.getRadius());
        C5467b.m23799a(parcel, 4, circleOptions.getStrokeWidth());
        C5467b.m23800a(parcel, 5, circleOptions.getStrokeColor());
        C5467b.m23800a(parcel, 6, circleOptions.getFillColor());
        C5467b.m23799a(parcel, 7, circleOptions.getZIndex());
        C5467b.m23809a(parcel, 8, circleOptions.isVisible());
        C5467b.m23796a(parcel, a);
    }
}
