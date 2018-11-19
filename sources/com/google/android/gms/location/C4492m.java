package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.location.m */
public final class C4492m implements Creator<zzae> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        long j = -1;
        long j2 = j;
        int i = 1;
        int i2 = 1;
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
                    j = oi.m20066f(parcel, readInt);
                    break;
                case 4:
                    j2 = oi.m20066f(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzae(i, i2, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
