package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import java.util.List;

/* renamed from: com.google.android.gms.auth.d */
public final class C2460d implements Creator<TokenData> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = null;
        Long l = str;
        List list = l;
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
                    str = oi.l(parcel, readInt);
                    break;
                case 3:
                    l = oi.g(parcel, readInt);
                    break;
                case 4:
                    z = oi.c(parcel, readInt);
                    break;
                case 5:
                    z2 = oi.c(parcel, readInt);
                    break;
                case 6:
                    list = oi.x(parcel, readInt);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new TokenData(i, str, l, z, z2, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
