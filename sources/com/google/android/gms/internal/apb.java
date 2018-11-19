package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class apb implements Creator<zzrt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = oi.m20055a(parcel);
        String str = null;
        byte[] bArr = str;
        String[] strArr = bArr;
        String[] strArr2 = strArr;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = oi.m20063c(parcel2, readInt);
                    break;
                case 2:
                    str = oi.m20072l(parcel2, readInt);
                    break;
                case 3:
                    i = oi.m20065e(parcel2, readInt);
                    break;
                case 4:
                    bArr = oi.m20075o(parcel2, readInt);
                    break;
                case 5:
                    strArr = oi.m20082v(parcel2, readInt);
                    break;
                case 6:
                    strArr2 = oi.m20082v(parcel2, readInt);
                    break;
                case 7:
                    z2 = oi.m20063c(parcel2, readInt);
                    break;
                case 8:
                    j = oi.m20066f(parcel2, readInt);
                    break;
                default:
                    oi.m20060b(parcel2, readInt);
                    break;
            }
        }
        oi.m20054A(parcel2, a);
        return new zzrt(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzrt[i];
    }
}
