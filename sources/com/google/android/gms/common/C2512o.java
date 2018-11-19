package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.common.o */
public final class C2512o implements Creator<zzn> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = oi.l(parcel, readInt);
                    break;
                case 2:
                    iBinder = oi.m(parcel, readInt);
                    break;
                case 3:
                    z = oi.c(parcel, readInt);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new zzn(str, iBinder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzn[i];
    }
}
