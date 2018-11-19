package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import com.google.android.gms.internal.zzbfo;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.d */
public final class C2426d implements Creator<zzu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        Set hashSet = new HashSet();
        String str = null;
        byte[] bArr = str;
        PendingIntent pendingIntent = bArr;
        DeviceMetaData deviceMetaData = pendingIntent;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    readInt = 1;
                    break;
                case 2:
                    str = oi.l(parcel, readInt);
                    readInt = 2;
                    break;
                case 3:
                    i2 = oi.e(parcel, readInt);
                    readInt = 3;
                    break;
                case 4:
                    bArr = oi.o(parcel, readInt);
                    readInt = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) oi.a(parcel, readInt, PendingIntent.CREATOR);
                    readInt = 5;
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) oi.a(parcel, readInt, DeviceMetaData.CREATOR);
                    readInt = 6;
                    break;
                default:
                    oi.b(parcel, readInt);
                    continue;
            }
            hashSet.add(Integer.valueOf(readInt));
        }
        if (parcel.dataPosition() == a) {
            return new zzu(hashSet, i, str, i2, bArr, pendingIntent, deviceMetaData);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new zzbfo(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
