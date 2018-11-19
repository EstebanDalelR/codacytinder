package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.e */
public final class C2427e implements Creator<DeviceMetaData> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    break;
                case 2:
                    z = oi.c(parcel, readInt);
                    break;
                case 3:
                    j = oi.f(parcel, readInt);
                    break;
                case 4:
                    z2 = oi.c(parcel, readInt);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new DeviceMetaData(i, z, j, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceMetaData[i];
    }
}
