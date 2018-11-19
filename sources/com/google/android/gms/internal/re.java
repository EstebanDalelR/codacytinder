package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

public final class re implements Creator<zzceo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        Status status = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                oi.m20060b(parcel, readInt);
            } else {
                status = (Status) oi.m20057a(parcel, readInt, Status.CREATOR);
            }
        }
        oi.m20054A(parcel, a);
        return new zzceo(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzceo[i];
    }
}
