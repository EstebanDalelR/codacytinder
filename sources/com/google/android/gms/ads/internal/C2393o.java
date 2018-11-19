package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.ads.internal.o */
public final class C2393o implements Creator<zzao> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z = oi.c(parcel, readInt);
                    break;
                case 3:
                    z2 = oi.c(parcel, readInt);
                    break;
                case 4:
                    str = oi.l(parcel, readInt);
                    break;
                case 5:
                    z3 = oi.c(parcel, readInt);
                    break;
                case 6:
                    f = oi.i(parcel, readInt);
                    break;
                case 7:
                    i = oi.e(parcel, readInt);
                    break;
                case 8:
                    z4 = oi.c(parcel, readInt);
                    break;
                case 9:
                    z5 = oi.c(parcel, readInt);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new zzao(z, z2, str, z3, f, i, z4, z5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzao[i];
    }
}
