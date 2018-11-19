package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class apa implements Creator<zzrr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = strArr;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = oi.m20072l(parcel, readInt);
                    break;
                case 2:
                    strArr = oi.m20082v(parcel, readInt);
                    break;
                case 3:
                    strArr2 = oi.m20082v(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzrr(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzrr[i];
    }
}
