package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class da implements Creator<zzaey> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = null;
        String str2 = str;
        List list = str2;
        boolean z = false;
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
                    str2 = oi.m20072l(parcel, readInt);
                    break;
                case 4:
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 5:
                    z2 = oi.m20063c(parcel, readInt);
                    break;
                case 6:
                    list = oi.m20084x(parcel, readInt);
                    break;
                case 7:
                    z3 = oi.m20063c(parcel, readInt);
                    break;
                case 8:
                    z4 = oi.m20063c(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzaey(str, str2, z, z2, list, z3, z4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaey[i];
    }
}
