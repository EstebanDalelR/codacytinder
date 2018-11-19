package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class pf implements Creator<zzbgy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        Parcel parcel2 = null;
        int i = 0;
        zzbgt zzbgt = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 2:
                    parcel2 = oi.m20085y(parcel, readInt);
                    break;
                case 3:
                    zzbgt = (zzbgt) oi.m20057a(parcel, readInt, zzbgt.CREATOR);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzbgy(i, parcel2, zzbgt);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbgy[i];
    }
}
