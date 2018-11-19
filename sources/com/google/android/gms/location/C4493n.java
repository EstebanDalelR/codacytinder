package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import java.util.List;

/* renamed from: com.google.android.gms.location.n */
public final class C4493n implements Creator<zzag> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        List list = null;
        String str = "";
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    list = oi.m20084x(parcel, readInt);
                    break;
                case 2:
                    pendingIntent = (PendingIntent) oi.m20057a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 3:
                    str = oi.m20072l(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzag(list, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzag[i];
    }
}
