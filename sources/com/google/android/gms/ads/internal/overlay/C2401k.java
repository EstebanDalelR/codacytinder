package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzao;
import com.google.android.gms.internal.oi;
import com.google.android.gms.internal.zzakd;

/* renamed from: com.google.android.gms.ads.internal.overlay.k */
public final class C2401k implements Creator<AdOverlayInfoParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = oi.a(parcel);
        zzc zzc = null;
        IBinder iBinder = zzc;
        IBinder iBinder2 = iBinder;
        IBinder iBinder3 = iBinder2;
        IBinder iBinder4 = iBinder3;
        String str = iBinder4;
        String str2 = str;
        IBinder iBinder5 = str2;
        String str3 = iBinder5;
        zzakd zzakd = str3;
        String str4 = zzakd;
        zzao zzao = str4;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    zzc = (zzc) oi.a(parcel2, readInt, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = oi.m(parcel2, readInt);
                    break;
                case 4:
                    iBinder2 = oi.m(parcel2, readInt);
                    break;
                case 5:
                    iBinder3 = oi.m(parcel2, readInt);
                    break;
                case 6:
                    iBinder4 = oi.m(parcel2, readInt);
                    break;
                case 7:
                    str = oi.l(parcel2, readInt);
                    break;
                case 8:
                    z = oi.c(parcel2, readInt);
                    break;
                case 9:
                    str2 = oi.l(parcel2, readInt);
                    break;
                case 10:
                    iBinder5 = oi.m(parcel2, readInt);
                    break;
                case 11:
                    i = oi.e(parcel2, readInt);
                    break;
                case 12:
                    i2 = oi.e(parcel2, readInt);
                    break;
                case 13:
                    str3 = oi.l(parcel2, readInt);
                    break;
                case 14:
                    zzakd = (zzakd) oi.a(parcel2, readInt, zzakd.CREATOR);
                    break;
                case 16:
                    str4 = oi.l(parcel2, readInt);
                    break;
                case 17:
                    zzao = (zzao) oi.a(parcel2, readInt, zzao.CREATOR);
                    break;
                default:
                    oi.b(parcel2, readInt);
                    break;
            }
        }
        oi.A(parcel2, a);
        return new AdOverlayInfoParcel(zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzakd, str4, zzao);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
