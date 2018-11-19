package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ane implements Creator<zzpe> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        zzmr zzmr = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 2:
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 3:
                    i2 = oi.m20065e(parcel, readInt);
                    break;
                case 4:
                    z2 = oi.m20063c(parcel, readInt);
                    break;
                case 5:
                    i3 = oi.m20065e(parcel, readInt);
                    break;
                case 6:
                    zzmr = (zzmr) oi.m20057a(parcel, readInt, zzmr.CREATOR);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzpe(i, z, i2, z2, i3, zzmr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpe[i];
    }
}
