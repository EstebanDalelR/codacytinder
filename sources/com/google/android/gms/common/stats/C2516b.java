package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.b */
public final class C2516b implements Creator<WakeLockEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = oi.a(parcel);
        long j = 0;
        long j2 = j;
        long j3 = j2;
        String str = null;
        List list = str;
        String str2 = list;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel2, readInt);
                    break;
                case 2:
                    j = oi.f(parcel2, readInt);
                    break;
                case 4:
                    str = oi.l(parcel2, readInt);
                    break;
                case 5:
                    i3 = oi.e(parcel2, readInt);
                    break;
                case 6:
                    list = oi.x(parcel2, readInt);
                    break;
                case 8:
                    j2 = oi.f(parcel2, readInt);
                    break;
                case 10:
                    str3 = oi.l(parcel2, readInt);
                    break;
                case 11:
                    i2 = oi.e(parcel2, readInt);
                    break;
                case 12:
                    str2 = oi.l(parcel2, readInt);
                    break;
                case 13:
                    str4 = oi.l(parcel2, readInt);
                    break;
                case 14:
                    i4 = oi.e(parcel2, readInt);
                    break;
                case 15:
                    f = oi.i(parcel2, readInt);
                    break;
                case 16:
                    j3 = oi.f(parcel2, readInt);
                    break;
                case 17:
                    str5 = oi.l(parcel2, readInt);
                    break;
                default:
                    oi.b(parcel2, readInt);
                    break;
            }
        }
        oi.A(parcel2, a);
        return new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
