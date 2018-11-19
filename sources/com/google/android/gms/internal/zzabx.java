package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@zzzv
public final class zzabx extends zzbfm {
    public static final Creator<zzabx> CREATOR = new an();
    String zzbsw;

    public zzabx(String str) {
        this.zzbsw = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20098a(parcel, 2, this.zzbsw, false);
        oj.m20088a(parcel, i);
    }
}
