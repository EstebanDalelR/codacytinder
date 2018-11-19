package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class akz implements Creator<zzmr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 3:
                    z2 = oi.m20063c(parcel, readInt);
                    break;
                case 4:
                    z3 = oi.m20063c(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzmr(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmr[i];
    }
}
