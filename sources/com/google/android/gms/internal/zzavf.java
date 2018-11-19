package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;

public final class zzavf extends zzbfm {
    public static final Creator<zzavf> CREATOR = new mk();
    private String accountType;
    private int zzeck;
    private int zzeeu;

    zzavf(int i, String str, int i2) {
        this.zzeck = 1;
        this.accountType = (String) ad.a(str);
        this.zzeeu = i2;
    }

    public zzavf(String str, int i) {
        this(1, str, i);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzeck);
        oj.m20098a(parcel, 2, this.accountType, false);
        oj.m20091a(parcel, 3, this.zzeeu);
        oj.m20088a(parcel, i);
    }
}
