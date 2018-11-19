package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import com.google.android.gms.internal.zzbfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.a */
public final class C2423a implements Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        zzp zzp = arrayList;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    readInt = 1;
                    break;
                case 2:
                    arrayList = oi.c(parcel, readInt, zzs.CREATOR);
                    readInt = 2;
                    break;
                case 3:
                    i2 = oi.e(parcel, readInt);
                    readInt = 3;
                    break;
                case 4:
                    zzp = (zzp) oi.a(parcel, readInt, zzp.CREATOR);
                    readInt = 4;
                    break;
                default:
                    oi.b(parcel, readInt);
                    continue;
            }
            hashSet.add(Integer.valueOf(readInt));
        }
        if (parcel.dataPosition() == a) {
            return new zzm(hashSet, i, arrayList, i2, zzp);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new zzbfo(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
