package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ti implements Creator<zzcxg> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 2:
                    i2 = oi.m20065e(parcel, readInt);
                    break;
                case 3:
                    intent = (Intent) oi.m20057a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzcxg(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcxg[i];
    }
}
