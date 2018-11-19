package com.google.android.m4b.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class MarkerOptionsCreator implements Creator<MarkerOptions> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23883a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23884a(i);
    }

    /* renamed from: a */
    public MarkerOptions m23883a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = C5466a.m23776a(parcel);
        LatLng latLng = null;
        String str = latLng;
        String str2 = str;
        IBinder iBinder = str2;
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
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
                    str = C5466a.m23791k(parcel2, readInt);
                    break;
                case 4:
                    str2 = C5466a.m23791k(parcel2, readInt);
                    break;
                case 5:
                    iBinder = C5466a.m23792l(parcel2, readInt);
                    break;
                case 6:
                    f = C5466a.m23789i(parcel2, readInt);
                    break;
                case 7:
                    f2 = C5466a.m23789i(parcel2, readInt);
                    break;
                case 8:
                    z = C5466a.m23783c(parcel2, readInt);
                    break;
                case 9:
                    z2 = C5466a.m23783c(parcel2, readInt);
                    break;
                case 10:
                    z3 = C5466a.m23783c(parcel2, readInt);
                    break;
                case 11:
                    f3 = C5466a.m23789i(parcel2, readInt);
                    break;
                case 12:
                    f4 = C5466a.m23789i(parcel2, readInt);
                    break;
                case 13:
                    f5 = C5466a.m23789i(parcel2, readInt);
                    break;
                case 14:
                    f6 = C5466a.m23789i(parcel2, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new MarkerOptions(i, latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel2);
    }

    /* renamed from: a */
    public MarkerOptions[] m23884a(int i) {
        return new MarkerOptions[i];
    }

    /* renamed from: a */
    static void m23882a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, markerOptions.m30002a());
        C5467b.m23804a(parcel, 2, markerOptions.getPosition(), i, false);
        C5467b.m23806a(parcel, 3, markerOptions.getTitle(), false);
        C5467b.m23806a(parcel, 4, markerOptions.getSnippet(), false);
        C5467b.m23803a(parcel, 5, markerOptions.m30003b(), false);
        C5467b.m23799a(parcel, 6, markerOptions.getAnchorU());
        C5467b.m23799a(parcel, 7, markerOptions.getAnchorV());
        C5467b.m23809a(parcel, 8, markerOptions.isDraggable());
        C5467b.m23809a(parcel, 9, markerOptions.isVisible());
        C5467b.m23809a(parcel, 10, markerOptions.isFlat());
        C5467b.m23799a(parcel, 11, markerOptions.getRotation());
        C5467b.m23799a(parcel, 12, markerOptions.getInfoWindowAnchorU());
        C5467b.m23799a(parcel, 13, markerOptions.getInfoWindowAnchorV());
        C5467b.m23799a(parcel, 14, markerOptions.getAlpha());
        C5467b.m23796a(parcel, a);
    }
}
