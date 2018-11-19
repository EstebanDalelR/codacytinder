package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class pb implements Creator<zzbgo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = null;
        String str2 = str;
        zzbgh zzbgh = str2;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 2:
                    i2 = oi.m20065e(parcel, readInt);
                    break;
                case 3:
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 4:
                    i3 = oi.m20065e(parcel, readInt);
                    break;
                case 5:
                    z2 = oi.m20063c(parcel, readInt);
                    break;
                case 6:
                    str = oi.m20072l(parcel, readInt);
                    break;
                case 7:
                    i4 = oi.m20065e(parcel, readInt);
                    break;
                case 8:
                    str2 = oi.m20072l(parcel, readInt);
                    break;
                case 9:
                    zzbgh = (zzbgh) oi.m20057a(parcel, readInt, zzbgh.CREATOR);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzbgo(i, i2, z, i3, z2, str, i4, str2, zzbgh);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbgo[i];
    }
}
