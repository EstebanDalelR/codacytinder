package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzbgk extends zzbfm {
    public static final Creator<zzbgk> CREATOR = new oz();
    private int versionCode;
    final String zzgcc;
    final int zzgcd;

    zzbgk(int i, String str, int i2) {
        this.versionCode = i;
        this.zzgcc = str;
        this.zzgcd = i2;
    }

    zzbgk(String str, int i) {
        this.versionCode = 1;
        this.zzgcc = str;
        this.zzgcd = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.versionCode);
        oj.m20098a(parcel, 2, this.zzgcc, false);
        oj.m20091a(parcel, 3, this.zzgcd);
        oj.m20088a(parcel, i);
    }
}
