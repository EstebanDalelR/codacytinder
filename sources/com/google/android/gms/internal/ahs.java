package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ahs implements Creator<zzil> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = oi.m20055a(parcel);
        long j = 0;
        long j2 = j;
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        Bundle bundle = str4;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = oi.m20072l(parcel2, readInt);
                    break;
                case 3:
                    j = oi.m20066f(parcel2, readInt);
                    break;
                case 4:
                    str2 = oi.m20072l(parcel2, readInt);
                    break;
                case 5:
                    str3 = oi.m20072l(parcel2, readInt);
                    break;
                case 6:
                    str4 = oi.m20072l(parcel2, readInt);
                    break;
                case 7:
                    bundle = oi.m20074n(parcel2, readInt);
                    break;
                case 8:
                    z = oi.m20063c(parcel2, readInt);
                    break;
                case 9:
                    j2 = oi.m20066f(parcel2, readInt);
                    break;
                default:
                    oi.m20060b(parcel2, readInt);
                    break;
            }
        }
        oi.m20054A(parcel2, a);
        return new zzil(str, j, str2, str3, str4, bundle, z, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzil[i];
    }
}
