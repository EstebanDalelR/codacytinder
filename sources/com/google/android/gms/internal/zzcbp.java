package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzcbp extends zzbfm {
    public static final Creator<zzcbp> CREATOR = new qc();
    private String packageName;
    private int versionCode;
    private String zzibq;

    zzcbp(int i, String str, String str2) {
        this.versionCode = i;
        this.packageName = str;
        this.zzibq = str2;
    }

    public zzcbp(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.versionCode);
        oj.m20098a(parcel, 2, this.packageName, false);
        oj.m20098a(parcel, 3, this.zzibq, false);
        oj.m20088a(parcel, i);
    }
}
