package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;

public final class ahq implements Creator<zzii> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                oi.m20060b(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) oi.m20057a(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        oi.m20054A(parcel, a);
        return new zzii(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzii[i];
    }
}
