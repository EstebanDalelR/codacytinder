package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class of implements Creator<zzbew> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = oi.m20072l(parcel, readInt);
                    break;
                case 3:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 4:
                    i2 = oi.m20065e(parcel, readInt);
                    break;
                case 5:
                    str2 = oi.m20072l(parcel, readInt);
                    break;
                case 6:
                    str3 = oi.m20072l(parcel, readInt);
                    break;
                case 7:
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 8:
                    str4 = oi.m20072l(parcel, readInt);
                    break;
                case 9:
                    z2 = oi.m20063c(parcel, readInt);
                    break;
                case 10:
                    i3 = oi.m20065e(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzbew(str, i, i2, str2, str3, z, str4, z2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbew[i];
    }
}
