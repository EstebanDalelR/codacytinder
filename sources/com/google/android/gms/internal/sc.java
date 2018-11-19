package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class sc implements Creator<zzcfs> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = oi.m20055a(parcel);
        double d = 0.0d;
        double d2 = d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = (short) 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = oi.m20072l(parcel2, readInt);
                    break;
                case 2:
                    j = oi.m20066f(parcel2, readInt);
                    break;
                case 3:
                    s = oi.m20064d(parcel2, readInt);
                    break;
                case 4:
                    d = oi.m20070j(parcel2, readInt);
                    break;
                case 5:
                    d2 = oi.m20070j(parcel2, readInt);
                    break;
                case 6:
                    f = oi.m20069i(parcel2, readInt);
                    break;
                case 7:
                    i = oi.m20065e(parcel2, readInt);
                    break;
                case 8:
                    i2 = oi.m20065e(parcel2, readInt);
                    break;
                case 9:
                    i3 = oi.m20065e(parcel2, readInt);
                    break;
                default:
                    oi.m20060b(parcel2, readInt);
                    break;
            }
        }
        oi.m20054A(parcel2, a);
        return new zzcfs(str, i, s, d, d2, f, j, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcfs[i];
    }
}
