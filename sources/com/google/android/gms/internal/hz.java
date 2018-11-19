package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class hz implements Creator<zzakd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
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
                    z2 = oi.m20063c(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzakd(str, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzakd[i];
    }
}
