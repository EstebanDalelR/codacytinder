package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class sz implements Creator<zzctx> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        String str = null;
        byte[] bArr = str;
        byte[][] bArr2 = bArr;
        byte[][] bArr3 = bArr2;
        byte[][] bArr4 = bArr3;
        byte[][] bArr5 = bArr4;
        int[] iArr = bArr5;
        byte[][] bArr6 = iArr;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = oi.m20072l(parcel, readInt);
                    break;
                case 3:
                    bArr = oi.m20075o(parcel, readInt);
                    break;
                case 4:
                    bArr2 = oi.m20076p(parcel, readInt);
                    break;
                case 5:
                    bArr3 = oi.m20076p(parcel, readInt);
                    break;
                case 6:
                    bArr4 = oi.m20076p(parcel, readInt);
                    break;
                case 7:
                    bArr5 = oi.m20076p(parcel, readInt);
                    break;
                case 8:
                    iArr = oi.m20078r(parcel, readInt);
                    break;
                case 9:
                    bArr6 = oi.m20076p(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzctx(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzctx[i];
    }
}
