package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class CameraPositionCreator implements Creator<CameraPosition> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23853a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23854a(i);
    }

    /* renamed from: a */
    public CameraPosition m23853a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        LatLng latLng = null;
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
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
                    f = C5466a.m23789i(parcel, readInt);
                    break;
                case 4:
                    f2 = C5466a.m23789i(parcel, readInt);
                    break;
                case 5:
                    f3 = C5466a.m23789i(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new CameraPosition(i, latLng, f, f2, f3);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public CameraPosition[] m23854a(int i) {
        return new CameraPosition[i];
    }

    /* renamed from: a */
    static void m23852a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, cameraPosition.m29985a());
        C5467b.m23804a(parcel, 2, cameraPosition.target, i, false);
        C5467b.m23799a(parcel, 3, cameraPosition.zoom);
        C5467b.m23799a(parcel, 4, cameraPosition.tilt);
        C5467b.m23799a(parcel, 5, cameraPosition.bearing);
        C5467b.m23796a(parcel, a);
    }
}
