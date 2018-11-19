package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class od implements Creator<zzbef> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        long j = 0;
        long j2 = j;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 2:
                    j2 = oi.m20066f(parcel, readInt);
                    break;
                case 3:
                    j = oi.m20066f(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzbef(z, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbef[i];
    }
}
