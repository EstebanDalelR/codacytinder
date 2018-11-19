package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class aio implements Creator<zzjn> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = null;
        zzjn[] zzjnArr = str;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
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
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 6:
                    i3 = oi.m20065e(parcel, readInt);
                    break;
                case 7:
                    i4 = oi.m20065e(parcel, readInt);
                    break;
                case 8:
                    zzjnArr = (zzjn[]) oi.m20061b(parcel, readInt, zzjn.CREATOR);
                    break;
                case 9:
                    z2 = oi.m20063c(parcel, readInt);
                    break;
                case 10:
                    z3 = oi.m20063c(parcel, readInt);
                    break;
                case 11:
                    z4 = oi.m20063c(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzjn(str, i, i2, z, i3, i4, zzjnArr, z2, z3, z4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjn[i];
    }
}
