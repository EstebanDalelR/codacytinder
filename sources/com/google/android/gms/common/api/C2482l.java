package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.common.api.l */
public final class C2482l implements Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = str;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 != AdError.NETWORK_ERROR_CODE) {
                switch (i3) {
                    case 1:
                        i2 = oi.e(parcel, readInt);
                        break;
                    case 2:
                        str = oi.l(parcel, readInt);
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) oi.a(parcel, readInt, PendingIntent.CREATOR);
                        break;
                    default:
                        oi.b(parcel, readInt);
                        break;
                }
            }
            i = oi.e(parcel, readInt);
        }
        oi.A(parcel, a);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
