package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.common.api.k */
public final class C2481k implements Creator<Scope> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    break;
                case 2:
                    str = oi.l(parcel, readInt);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new Scope(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
