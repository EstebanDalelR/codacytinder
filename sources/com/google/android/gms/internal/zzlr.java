package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@zzzv
public final class zzlr extends zzbfm {
    public static final Creator<zzlr> CREATOR = new akd();
    public final int zzbfr;

    public zzlr(int i) {
        this.zzbfr = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20091a(parcel, 2, this.zzbfr);
        oj.m20088a(parcel, i);
    }
}
