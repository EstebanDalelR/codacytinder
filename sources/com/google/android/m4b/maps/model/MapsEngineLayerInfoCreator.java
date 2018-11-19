package com.google.android.m4b.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class MapsEngineLayerInfoCreator implements Creator<MapsEngineLayerInfo> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23870a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23871a(i);
    }

    /* renamed from: a */
    public MapsEngineLayerInfo m23870a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        int i = 0;
        boolean z = false;
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
                    str2 = C5466a.m23791k(parcel, readInt);
                    break;
                case 4:
                    str3 = C5466a.m23791k(parcel, readInt);
                    break;
                case 5:
                    z = C5466a.m23783c(parcel, readInt);
                    break;
                case 6:
                    str4 = C5466a.m23791k(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new MapsEngineLayerInfo(i, str, str2, str3, z, str4);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public MapsEngineLayerInfo[] m23871a(int i) {
        return new MapsEngineLayerInfo[i];
    }

    /* renamed from: a */
    static void m23869a(MapsEngineLayerInfo mapsEngineLayerInfo, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, mapsEngineLayerInfo.m29997a());
        C5467b.m23806a(parcel, 2, mapsEngineLayerInfo.getMapId(), false);
        C5467b.m23806a(parcel, 3, mapsEngineLayerInfo.getLayerKey(), false);
        C5467b.m23806a(parcel, 4, mapsEngineLayerInfo.getLayerId(), false);
        C5467b.m23809a(parcel, 5, mapsEngineLayerInfo.isLite());
        C5467b.m23806a(parcel, 6, mapsEngineLayerInfo.getVersion(), false);
        C5467b.m23796a(parcel, a);
    }
}
