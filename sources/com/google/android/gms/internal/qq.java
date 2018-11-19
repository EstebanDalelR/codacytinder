package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class qq implements Creator<zzcdz> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        zzcdx zzcdx = null;
        int i = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = iBinder;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 2:
                    zzcdx = (zzcdx) oi.m20057a(parcel, readInt, zzcdx.CREATOR);
                    break;
                case 3:
                    iBinder = oi.m20073m(parcel, readInt);
                    break;
                case 4:
                    iBinder2 = oi.m20073m(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzcdz(i, zzcdx, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdz[i];
    }
}
