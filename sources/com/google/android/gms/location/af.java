package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import java.util.List;

public final class af implements Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        List list = LocationResult.zziju;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                oi.m20060b(parcel, readInt);
            } else {
                list = oi.m20062c(parcel, readInt, Location.CREATOR);
            }
        }
        oi.m20054A(parcel, a);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
