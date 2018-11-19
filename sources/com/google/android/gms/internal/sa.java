package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public final class sa implements Creator<zzcfo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        List list = zzcfo.zzikv;
        LocationRequest locationRequest = null;
        String str = locationRequest;
        String str2 = str;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i != 1) {
                switch (i) {
                    case 5:
                        list = oi.m20062c(parcel, readInt, zzcdv.CREATOR);
                        break;
                    case 6:
                        str = oi.m20072l(parcel, readInt);
                        break;
                    case 7:
                        z = oi.m20063c(parcel, readInt);
                        break;
                    case 8:
                        z2 = oi.m20063c(parcel, readInt);
                        break;
                    case 9:
                        z3 = oi.m20063c(parcel, readInt);
                        break;
                    case 10:
                        str2 = oi.m20072l(parcel, readInt);
                        break;
                    default:
                        oi.m20060b(parcel, readInt);
                        break;
                }
            }
            locationRequest = (LocationRequest) oi.m20057a(parcel, readInt, LocationRequest.CREATOR);
        }
        oi.m20054A(parcel, a);
        return new zzcfo(locationRequest, list, str, z, z2, z3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcfo[i];
    }
}
