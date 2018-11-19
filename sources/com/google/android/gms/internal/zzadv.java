package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@zzzv
public final class zzadv extends zzbfm {
    public static final Creator<zzadv> CREATOR = new cc();
    public final String zzatw;
    public final zzjj zzcnd;

    public zzadv(zzjj zzjj, String str) {
        this.zzcnd = zzjj;
        this.zzatw = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20096a(parcel, 2, this.zzcnd, i, false);
        oj.m20098a(parcel, 3, this.zzatw, false);
        oj.m20088a(parcel, a);
    }
}
