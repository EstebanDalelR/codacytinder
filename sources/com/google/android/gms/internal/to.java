package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzbt;

public final class to implements Creator<zzcxq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        zzbt zzbt = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 2:
                    connectionResult = (ConnectionResult) oi.m20057a(parcel, readInt, ConnectionResult.CREATOR);
                    break;
                case 3:
                    zzbt = (zzbt) oi.m20057a(parcel, readInt, zzbt.CREATOR);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzcxq(i, connectionResult, zzbt);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcxq[i];
    }
}
