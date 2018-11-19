package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class oe implements Creator<zzbeh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        zzbew zzbew = null;
        byte[] bArr = zzbew;
        int[] iArr = bArr;
        String[] strArr = iArr;
        int[] iArr2 = strArr;
        byte[][] bArr2 = iArr2;
        zzctx[] zzctxArr = bArr2;
        boolean z = true;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    zzbew = (zzbew) oi.m20057a(parcel, readInt, zzbew.CREATOR);
                    break;
                case 3:
                    bArr = oi.m20075o(parcel, readInt);
                    break;
                case 4:
                    iArr = oi.m20078r(parcel, readInt);
                    break;
                case 5:
                    strArr = oi.m20082v(parcel, readInt);
                    break;
                case 6:
                    iArr2 = oi.m20078r(parcel, readInt);
                    break;
                case 7:
                    bArr2 = oi.m20076p(parcel, readInt);
                    break;
                case 8:
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 9:
                    zzctxArr = (zzctx[]) oi.m20061b(parcel, readInt, zzctx.CREATOR);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzbeh(zzbew, bArr, iArr, strArr, iArr2, bArr2, z, zzctxArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbeh[i];
    }
}
