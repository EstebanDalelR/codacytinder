package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class akd implements Creator<zzlr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                oi.m20060b(parcel, readInt);
            } else {
                i = oi.m20065e(parcel, readInt);
            }
        }
        oi.m20054A(parcel, a);
        return new zzlr(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlr[i];
    }
}
