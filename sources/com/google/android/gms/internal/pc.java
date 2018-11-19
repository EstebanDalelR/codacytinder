package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class pc implements Creator<zzbgv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = null;
        int i = 0;
        zzbgo zzbgo = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 2:
                    str = oi.m20072l(parcel, readInt);
                    break;
                case 3:
                    zzbgo = (zzbgo) oi.m20057a(parcel, readInt, zzbgo.CREATOR);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzbgv(i, str, zzbgo);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbgv[i];
    }
}
