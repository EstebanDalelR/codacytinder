package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzbr;

public final class zzcxo extends zzbfm {
    public static final Creator<zzcxo> CREATOR = new tn();
    private int zzeck;
    private zzbr zzkcb;

    zzcxo(int i, zzbr zzbr) {
        this.zzeck = i;
        this.zzkcb = zzbr;
    }

    public zzcxo(zzbr zzbr) {
        this(1, zzbr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzeck);
        oj.m20096a(parcel, 2, this.zzkcb, i, false);
        oj.m20088a(parcel, a);
    }
}
