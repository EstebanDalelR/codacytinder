package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import com.google.android.gms.internal.zzcfs;
import java.util.List;

/* renamed from: com.google.android.gms.location.w */
public final class C4499w implements Creator<GeofencingRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = "";
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    list = oi.m20062c(parcel, readInt, zzcfs.CREATOR);
                    break;
                case 2:
                    i = oi.m20065e(parcel, readInt);
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
        return new GeofencingRequest(list, i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GeofencingRequest[i];
    }
}
