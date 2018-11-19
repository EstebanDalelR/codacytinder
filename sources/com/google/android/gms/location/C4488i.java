package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.location.i */
public final class C4488i implements Creator<zzz> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = "";
        String str2 = "";
        String str3 = "";
        int i = 0;
        boolean z = true;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str2 = oi.m20072l(parcel, readInt);
                    break;
                case 2:
                    str3 = oi.m20072l(parcel, readInt);
                    break;
                case 3:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 4:
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 5:
                    str = oi.m20072l(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzz(str, str2, str3, i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
