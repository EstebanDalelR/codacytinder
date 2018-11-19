package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import com.google.android.gms.internal.zzbfo;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.c */
public final class C2425c implements Creator<zzs> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        zzu zzu = null;
        String str = zzu;
        String str2 = str;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    readInt = 1;
                    break;
                case 2:
                    zzu = (zzu) oi.a(parcel, readInt, zzu.CREATOR);
                    readInt = 2;
                    break;
                case 3:
                    str = oi.l(parcel, readInt);
                    readInt = 3;
                    break;
                case 4:
                    str2 = oi.l(parcel, readInt);
                    readInt = 4;
                    break;
                default:
                    oi.b(parcel, readInt);
                    continue;
            }
            hashSet.add(Integer.valueOf(readInt));
        }
        if (parcel.dataPosition() == a) {
            return new zzs(hashSet, i, zzu, str, str2);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new zzbfo(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
