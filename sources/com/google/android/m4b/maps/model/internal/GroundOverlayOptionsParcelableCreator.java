package com.google.android.m4b.maps.model.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class GroundOverlayOptionsParcelableCreator implements Creator<GroundOverlayOptionsParcelable> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23925a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23926a(i);
    }

    /* renamed from: a */
    public GroundOverlayOptionsParcelable m23925a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        int i = 0;
        BitmapDescriptorParcelable bitmapDescriptorParcelable = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    bitmapDescriptorParcelable = (BitmapDescriptorParcelable) C5466a.m23778a(parcel, readInt, BitmapDescriptorParcelable.CREATOR);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GroundOverlayOptionsParcelable(i, bitmapDescriptorParcelable);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public GroundOverlayOptionsParcelable[] m23926a(int i) {
        return new GroundOverlayOptionsParcelable[i];
    }

    /* renamed from: a */
    static void m23924a(GroundOverlayOptionsParcelable groundOverlayOptionsParcelable, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, groundOverlayOptionsParcelable.m30017a());
        C5467b.m23804a(parcel, 2, groundOverlayOptionsParcelable.getParcelableImage(), i, false);
        C5467b.m23796a(parcel, a);
    }
}
