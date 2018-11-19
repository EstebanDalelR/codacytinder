package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import java.util.List;

/* renamed from: com.google.android.gms.auth.c */
public final class C2459c implements Creator<AccountChangeEventsResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    break;
                case 2:
                    list = oi.c(parcel, readInt, AccountChangeEvent.CREATOR);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new AccountChangeEventsResponse(i, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEventsResponse[i];
    }
}
