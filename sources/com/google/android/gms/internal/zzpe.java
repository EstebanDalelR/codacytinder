package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAdOptions;

@zzzv
public final class zzpe extends zzbfm {
    public static final Creator<zzpe> CREATOR = new ane();
    public final int versionCode;
    public final boolean zzbve;
    public final int zzbvf;
    public final boolean zzbvg;
    public final int zzbvh;
    @Nullable
    public final zzmr zzbvi;

    public zzpe(int i, boolean z, int i2, boolean z2, int i3, zzmr zzmr) {
        this.versionCode = i;
        this.zzbve = z;
        this.zzbvf = i2;
        this.zzbvg = z2;
        this.zzbvh = i3;
        this.zzbvi = zzmr;
    }

    public zzpe(NativeAdOptions nativeAdOptions) {
        this(3, nativeAdOptions.a(), nativeAdOptions.b(), nativeAdOptions.c(), nativeAdOptions.d(), nativeAdOptions.e() != null ? new zzmr(nativeAdOptions.e()) : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.versionCode);
        oj.m20101a(parcel, 2, this.zzbve);
        oj.m20091a(parcel, 3, this.zzbvf);
        oj.m20101a(parcel, 4, this.zzbvg);
        oj.m20091a(parcel, 5, this.zzbvh);
        oj.m20096a(parcel, 6, this.zzbvi, i, false);
        oj.m20088a(parcel, a);
    }
}
