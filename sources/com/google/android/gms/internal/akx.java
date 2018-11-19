package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class akx implements Creator<zzmn> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 15) {
                oi.m20060b(parcel, readInt);
            } else {
                str = oi.m20072l(parcel, readInt);
            }
        }
        oi.m20054A(parcel, a);
        return new zzmn(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmn[i];
    }
}
