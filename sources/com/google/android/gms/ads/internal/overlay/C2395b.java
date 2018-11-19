package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.ads.internal.overlay.b */
public final class C2395b implements Creator<zzc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        Intent intent = str7;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = oi.l(parcel, readInt);
                    break;
                case 3:
                    str2 = oi.l(parcel, readInt);
                    break;
                case 4:
                    str3 = oi.l(parcel, readInt);
                    break;
                case 5:
                    str4 = oi.l(parcel, readInt);
                    break;
                case 6:
                    str5 = oi.l(parcel, readInt);
                    break;
                case 7:
                    str6 = oi.l(parcel, readInt);
                    break;
                case 8:
                    str7 = oi.l(parcel, readInt);
                    break;
                case 9:
                    intent = (Intent) oi.a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
