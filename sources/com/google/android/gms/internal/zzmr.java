package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.C2414k;

@zzzv
public final class zzmr extends zzbfm {
    public static final Creator<zzmr> CREATOR = new akz();
    public final boolean zzbgx;
    public final boolean zzbgy;
    public final boolean zzbgz;

    public zzmr(C2414k c2414k) {
        this(c2414k.a(), c2414k.b(), c2414k.c());
    }

    public zzmr(boolean z, boolean z2, boolean z3) {
        this.zzbgx = z;
        this.zzbgy = z2;
        this.zzbgz = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20101a(parcel, 2, this.zzbgx);
        oj.m20101a(parcel, 3, this.zzbgy);
        oj.m20101a(parcel, 4, this.zzbgz);
        oj.m20088a(parcel, i);
    }
}
