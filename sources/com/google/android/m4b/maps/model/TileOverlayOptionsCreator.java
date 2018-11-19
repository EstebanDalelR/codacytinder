package com.google.android.m4b.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class TileOverlayOptionsCreator implements Creator<TileOverlayOptions> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23913a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23914a(i);
    }

    /* renamed from: a */
    public TileOverlayOptions m23913a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        IBinder iBinder = null;
        int i = 0;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    iBinder = C5466a.m23792l(parcel, readInt);
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
            return new TileOverlayOptions(i, iBinder, z, f, z2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public TileOverlayOptions[] m23914a(int i) {
        return new TileOverlayOptions[i];
    }

    /* renamed from: a */
    static void m23912a(TileOverlayOptions tileOverlayOptions, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, tileOverlayOptions.m30014a());
        C5467b.m23803a(parcel, 2, tileOverlayOptions.m30015b(), false);
        C5467b.m23809a(parcel, 3, tileOverlayOptions.isVisible());
        C5467b.m23799a(parcel, 4, tileOverlayOptions.getZIndex());
        C5467b.m23809a(parcel, 5, tileOverlayOptions.getFadeIn());
        C5467b.m23796a(parcel, a);
    }
}
