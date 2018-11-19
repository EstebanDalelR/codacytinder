package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.oi;

public final class af implements Creator<zzbt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = iBinder;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    break;
                case 2:
                    iBinder = oi.m(parcel, readInt);
                    break;
                case 3:
                    connectionResult = (ConnectionResult) oi.a(parcel, readInt, ConnectionResult.CREATOR);
                    break;
                case 4:
                    z = oi.c(parcel, readInt);
                    break;
                case 5:
                    z2 = oi.c(parcel, readInt);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new zzbt(i, iBinder, connectionResult, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbt[i];
    }
}
