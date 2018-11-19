package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.p068a.C2336a;

@zzzv
public final class zzmn extends zzbfm {
    public static final Creator<zzmn> CREATOR = new akx();
    public final String zzbgw;

    public zzmn(C2336a c2336a) {
        this.zzbgw = c2336a.a();
    }

    zzmn(String str) {
        this.zzbgw = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20098a(parcel, 15, this.zzbgw, false);
        oj.m20088a(parcel, i);
    }
}
