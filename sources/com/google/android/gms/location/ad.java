package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.oi;

public final class ad implements Creator<LocationAvailability> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        long j = 0;
        zzae[] zzaeArr = null;
        int i = AdError.NETWORK_ERROR_CODE;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = oi.m20065e(parcel, readInt);
                    break;
                case 2:
                    i3 = oi.m20065e(parcel, readInt);
                    break;
                case 3:
                    j = oi.m20066f(parcel, readInt);
                    break;
                case 4:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 5:
                    zzaeArr = (zzae[]) oi.m20061b(parcel, readInt, zzae.CREATOR);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new LocationAvailability(i, i2, i3, j, zzaeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
