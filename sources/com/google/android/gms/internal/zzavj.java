package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;

public final class zzavj extends zzbfm {
    public static final Creator<zzavj> CREATOR = new mm();
    private String accountType;
    private int zzeck;
    private byte[] zzeen;

    zzavj(int i, String str, byte[] bArr) {
        this.zzeck = 1;
        this.accountType = (String) ad.a(str);
        this.zzeen = (byte[]) ad.a(bArr);
    }

    public zzavj(String str, byte[] bArr) {
        this(1, str, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzeck);
        oj.m20098a(parcel, 2, this.accountType, false);
        oj.m20102a(parcel, 3, this.zzeen, false);
        oj.m20088a(parcel, i);
    }
}
