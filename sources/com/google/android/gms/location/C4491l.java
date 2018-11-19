package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.location.l */
public final class C4491l implements Creator<LocationSettingsStates> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 2:
                    z2 = oi.m20063c(parcel, readInt);
                    break;
                case 3:
                    z3 = oi.m20063c(parcel, readInt);
                    break;
                case 4:
                    z4 = oi.m20063c(parcel, readInt);
                    break;
                case 5:
                    z5 = oi.m20063c(parcel, readInt);
                    break;
                case 6:
                    z6 = oi.m20063c(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
