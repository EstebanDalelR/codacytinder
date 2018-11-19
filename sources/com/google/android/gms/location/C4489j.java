package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import java.util.List;

/* renamed from: com.google.android.gms.location.j */
public final class C4489j implements Creator<LocationSettingsRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        boolean z = false;
        List list = null;
        zzz zzz = null;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i != 5) {
                switch (i) {
                    case 1:
                        list = oi.m20062c(parcel, readInt, LocationRequest.CREATOR);
                        break;
                    case 2:
                        z = oi.m20063c(parcel, readInt);
                        break;
                    case 3:
                        z2 = oi.m20063c(parcel, readInt);
                        break;
                    default:
                        oi.m20060b(parcel, readInt);
                        break;
                }
            }
            zzz = (zzz) oi.m20057a(parcel, readInt, zzz.CREATOR);
        }
        oi.m20054A(parcel, a);
        return new LocationSettingsRequest(list, z, z2, zzz);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
