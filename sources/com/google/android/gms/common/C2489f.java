package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.common.f */
public final class C2489f implements Creator<zzc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = oi.l(parcel, readInt);
                    break;
                case 2:
                    i = oi.e(parcel, readInt);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new zzc(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
