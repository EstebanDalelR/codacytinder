package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public final class zzz extends zzbfm {
    public static final Creator<zzz> CREATOR = new C4488i();
    private final String zzeuy;
    private final String zzijw;
    private final String zzijx;
    private final int zzijy;
    private final boolean zzijz;

    zzz(String str, String str2, String str3, int i, boolean z) {
        this.zzeuy = str;
        this.zzijw = str2;
        this.zzijx = str3;
        this.zzijy = i;
        this.zzijz = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20098a(parcel, 1, this.zzijw, false);
        oj.m20098a(parcel, 2, this.zzijx, false);
        oj.m20091a(parcel, 3, this.zzijy);
        oj.m20101a(parcel, 4, this.zzijz);
        oj.m20098a(parcel, 5, this.zzeuy, false);
        oj.m20088a(parcel, i);
    }
}
