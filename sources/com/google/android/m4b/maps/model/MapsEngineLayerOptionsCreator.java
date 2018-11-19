package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class MapsEngineLayerOptionsCreator implements Creator<MapsEngineLayerOptions> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23873a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23874a(i);
    }

    /* renamed from: a */
    public MapsEngineLayerOptions m23873a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        MapsEngineLayerInfo mapsEngineLayerInfo = null;
        int i = 0;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    mapsEngineLayerInfo = (MapsEngineLayerInfo) C5466a.m23778a(parcel, readInt, MapsEngineLayerInfo.CREATOR);
                    break;
                case 3:
                    z = C5466a.m23783c(parcel, readInt);
                    break;
                case 4:
                    f = C5466a.m23789i(parcel, readInt);
                    break;
                case 5:
                    z2 = C5466a.m23783c(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new MapsEngineLayerOptions(i, mapsEngineLayerInfo, z, f, z2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public MapsEngineLayerOptions[] m23874a(int i) {
        return new MapsEngineLayerOptions[i];
    }

    /* renamed from: a */
    static void m23872a(MapsEngineLayerOptions mapsEngineLayerOptions, Parcel parcel, int i) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, mapsEngineLayerOptions.m30001a());
        C5467b.m23804a(parcel, 2, mapsEngineLayerOptions.getLayerInfo(), i, false);
        C5467b.m23809a(parcel, 3, mapsEngineLayerOptions.isVisible());
        C5467b.m23799a(parcel, 4, mapsEngineLayerOptions.getZIndex());
        C5467b.m23809a(parcel, 5, mapsEngineLayerOptions.isDefaultUiEnabled());
        C5467b.m23796a(parcel, a);
    }
}
