package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.v */
public final class C4478v implements Creator<zzaaz> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        boolean z = false;
        List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 3:
                    list = oi.m20084x(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzaaz(z, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaaz[i];
    }
}
