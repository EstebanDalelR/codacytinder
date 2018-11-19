package com.google.android.m4b.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class GroundOverlayOptionsCreator implements Creator<GroundOverlayOptions> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23859a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23860a(i);
    }

    /* renamed from: a */
    public GroundOverlayOptions m23859a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = C5466a.m23776a(parcel);
        IBinder iBinder = null;
        LatLng latLng = iBinder;
        LatLngBounds latLngBounds = latLng;
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel2, readInt);
                    break;
                case 2:
                    iBinder = C5466a.m23792l(parcel2, readInt);
                    break;
                case 3:
                    latLng = (LatLng) C5466a.m23778a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    f = C5466a.m23789i(parcel2, readInt);
                    break;
                case 5:
                    f2 = C5466a.m23789i(parcel2, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C5466a.m23778a(parcel2, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = C5466a.m23789i(parcel2, readInt);
                    break;
                case 8:
                    f4 = C5466a.m23789i(parcel2, readInt);
                    break;
                case 9:
                    z = C5466a.m23783c(parcel2, readInt);
                    break;
                case 10:
                    f5 = C5466a.m23789i(parcel2, readInt);
                    break;
                case 11:
                    f6 = C5466a.m23789i(parcel2, readInt);
                    break;
                case 12:
                    f7 = C5466a.m23789i(parcel2, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GroundOverlayOptions(i, iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel2);
    }

    /* renamed from: a */
    public GroundOverlayOptions[] m23860a(int i) {
        return new GroundOverlayOptions[i];
    }

    /* renamed from: a */
    static void m23858a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, groundOverlayOptions.m29989b());
        C5467b.m23803a(parcel, 2, groundOverlayOptions.m29988a(), false);
        C5467b.m23804a(parcel, 3, groundOverlayOptions.getLocation(), i, false);
        C5467b.m23799a(parcel, 4, groundOverlayOptions.getWidth());
        C5467b.m23799a(parcel, 5, groundOverlayOptions.getHeight());
        C5467b.m23804a(parcel, 6, groundOverlayOptions.getBounds(), i, false);
        C5467b.m23799a(parcel, 7, groundOverlayOptions.getBearing());
        C5467b.m23799a(parcel, 8, groundOverlayOptions.getZIndex());
        C5467b.m23809a(parcel, 9, groundOverlayOptions.isVisible());
        C5467b.m23799a(parcel, 10, groundOverlayOptions.getTransparency());
        C5467b.m23799a(parcel, 11, groundOverlayOptions.getAnchorU());
        C5467b.m23799a(parcel, 12, groundOverlayOptions.getAnchorV());
        C5467b.m23796a(parcel, a);
    }
}
