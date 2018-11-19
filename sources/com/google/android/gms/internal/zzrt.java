package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@zzzv
public final class zzrt extends zzbfm {
    public static final Creator<zzrt> CREATOR = new apb();
    public final byte[] data;
    public final int statusCode;
    public final boolean zzad;
    public final long zzae;
    public final String[] zzbyo;
    public final String[] zzbyp;
    public final boolean zzbyq;
    public final String zzbyr;

    zzrt(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.zzbyq = z;
        this.zzbyr = str;
        this.statusCode = i;
        this.data = bArr;
        this.zzbyo = strArr;
        this.zzbyp = strArr2;
        this.zzad = z2;
        this.zzae = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20101a(parcel, 1, this.zzbyq);
        oj.m20098a(parcel, 2, this.zzbyr, false);
        oj.m20091a(parcel, 3, this.statusCode);
        oj.m20102a(parcel, 4, this.data, false);
        oj.m20105a(parcel, 5, this.zzbyo, false);
        oj.m20105a(parcel, 6, this.zzbyp, false);
        oj.m20101a(parcel, 7, this.zzad);
        oj.m20092a(parcel, 8, this.zzae);
        oj.m20088a(parcel, i);
    }
}
