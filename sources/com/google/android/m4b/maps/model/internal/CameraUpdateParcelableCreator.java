package com.google.android.m4b.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.m4b.maps.p111k.C5466a;
import com.google.android.m4b.maps.p111k.C5466a.C5465a;
import com.google.android.m4b.maps.p111k.C5467b;

public class CameraUpdateParcelableCreator implements Creator<CameraUpdateParcelable> {
    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m23922a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m23923a(i);
    }

    /* renamed from: a */
    public CameraUpdateParcelable m23922a(Parcel parcel) {
        int a = C5466a.m23776a(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5466a.m23786f(parcel, readInt);
                    break;
                case 2:
                    i2 = C5466a.m23786f(parcel, readInt);
                    break;
                case 3:
                    bundle = C5466a.m23793m(parcel, readInt);
                    break;
                default:
                    C5466a.m23780b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new CameraUpdateParcelable(i, i2, bundle);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new C5465a(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public CameraUpdateParcelable[] m23923a(int i) {
        return new CameraUpdateParcelable[i];
    }

    /* renamed from: a */
    static void m23921a(CameraUpdateParcelable cameraUpdateParcelable, Parcel parcel) {
        int a = C5467b.m23795a(parcel);
        C5467b.m23800a(parcel, 1, cameraUpdateParcelable.getVersionCode());
        C5467b.m23800a(parcel, 2, cameraUpdateParcelable.getType());
        C5467b.m23802a(parcel, 3, cameraUpdateParcelable.getParameters(), false);
        C5467b.m23796a(parcel, a);
    }
}
