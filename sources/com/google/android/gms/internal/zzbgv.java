package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzbgv extends zzbfm {
    public static final Creator<zzbgv> CREATOR = new pc();
    final String key;
    private int versionCode;
    final zzbgo<?, ?> zzgcs;

    zzbgv(int i, String str, zzbgo<?, ?> zzbgo) {
        this.versionCode = i;
        this.key = str;
        this.zzgcs = zzbgo;
    }

    zzbgv(String str, zzbgo<?, ?> zzbgo) {
        this.versionCode = 1;
        this.key = str;
        this.zzgcs = zzbgo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.versionCode);
        oj.m20098a(parcel, 2, this.key, false);
        oj.m20096a(parcel, 3, this.zzgcs, i, false);
        oj.m20088a(parcel, a);
    }
}
