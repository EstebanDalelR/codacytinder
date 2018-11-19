package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class sb implements Creator<zzcfq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        zzcfo zzcfo = null;
        IBinder iBinder = zzcfo;
        PendingIntent pendingIntent = iBinder;
        IBinder iBinder2 = pendingIntent;
        IBinder iBinder3 = iBinder2;
        int i = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 2:
                    zzcfo = (zzcfo) oi.m20057a(parcel, readInt, zzcfo.CREATOR);
                    break;
                case 3:
                    iBinder = oi.m20073m(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) oi.m20057a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = oi.m20073m(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = oi.m20073m(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzcfq(i, zzcfo, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcfq[i];
    }
}
