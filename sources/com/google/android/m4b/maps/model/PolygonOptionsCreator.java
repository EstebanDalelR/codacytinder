package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;
import java.util.ArrayList;
import java.util.List;

public class PolygonOptionsCreator implements Creator<PolygonOptions> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23889a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23890a(i);
    }

    /* renamed from: a */
    public PolygonOptions m23889a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        List arrayList = new ArrayList();
        int i = 0;
        List list = null;
        float f = 0.0f;
        int i2 = 0;
        int i3 = 0;
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
                    ClassLoader classLoader = getClass().getClassLoader();
                    readInt = C5466a.m23777a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (readInt == 0) {
                        break;
                    }
                    parcel.readList(arrayList, classLoader);
                    parcel.setDataPosition(dataPosition + readInt);
                    break;
                case 4:
                    f = C5466a.m23789i(parcel, readInt);
                    break;
                case 5:
                    i2 = C5466a.m23786f(parcel, readInt);
                    break;
                case 6:
                    i3 = C5466a.m23786f(parcel, readInt);
                    break;
                case 7:
                    f2 = C5466a.m23789i(parcel, readInt);
                    break;
                case 8:
                    z = C5466a.m23783c(parcel, readInt);
                    break;
                case 9:
                    z2 = C5466a.m23783c(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new PolygonOptions(i, list, arrayList, f, i2, i3, f2, z, z2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public PolygonOptions[] m23890a(int i) {
        return new PolygonOptions[i];
    }

    /* renamed from: a */
    static void m23888a(PolygonOptions polygonOptions, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, polygonOptions.m30005a());
        C5467b.m23815b(parcel, 2, polygonOptions.getPoints(), false);
        C5467b.m23817c(parcel, 3, polygonOptions.m30006b(), false);
        C5467b.m23799a(parcel, 4, polygonOptions.getStrokeWidth());
        C5467b.m23800a(parcel, 5, polygonOptions.getStrokeColor());
        C5467b.m23800a(parcel, 6, polygonOptions.getFillColor());
        C5467b.m23799a(parcel, 7, polygonOptions.getZIndex());
        C5467b.m23809a(parcel, 8, polygonOptions.isVisible());
        C5467b.m23809a(parcel, 9, polygonOptions.isGeodesic());
        C5467b.m23796a(parcel, a);
    }
}
