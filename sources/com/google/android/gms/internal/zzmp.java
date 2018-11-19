package com.google.android.gms.internal;

import android.os.Parcel;

@zzzv
public final class zzmp extends zzjn {
    public zzmp(zzjn zzjn) {
        super(zzjn.zzbek, zzjn.height, zzjn.heightPixels, zzjn.zzbel, zzjn.width, zzjn.widthPixels, zzjn.zzbem, zzjn.zzben, zzjn.zzbeo, zzjn.zzbep);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20098a(parcel, 2, this.zzbek, false);
        oj.m20091a(parcel, 3, this.height);
        oj.m20091a(parcel, 6, this.width);
        oj.m20088a(parcel, i);
    }
}
