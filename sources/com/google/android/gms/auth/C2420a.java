package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.auth.a */
public final class C2420a implements Creator<AccountChangeEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = null;
        String str2 = str;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    break;
                case 2:
                    j = oi.f(parcel, readInt);
                    break;
                case 3:
                    str = oi.l(parcel, readInt);
                    break;
                case 4:
                    i2 = oi.e(parcel, readInt);
                    break;
                case 5:
                    i3 = oi.e(parcel, readInt);
                    break;
                case 6:
                    str2 = oi.l(parcel, readInt);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new AccountChangeEvent(i, j, str, i2, i3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }
}
