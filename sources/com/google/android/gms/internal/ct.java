package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ct implements Creator<zzaeq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = oi.m20072l(parcel, readInt);
                    break;
                case 3:
                    i = oi.m20065e(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzaeq(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaeq[i];
    }
}
