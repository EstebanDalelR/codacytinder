package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class cc implements Creator<zzadv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        zzjj zzjj = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    zzjj = (zzjj) oi.m20057a(parcel, readInt, zzjj.CREATOR);
                    break;
                case 3:
                    str = oi.m20072l(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzadv(zzjj, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzadv[i];
    }
}
