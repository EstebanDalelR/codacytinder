package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzbgh extends zzbfm {
    public static final Creator<zzbgh> CREATOR = new ox();
    private int zzeck;
    private final zzbgj zzgby;

    zzbgh(int i, zzbgj zzbgj) {
        this.zzeck = i;
        this.zzgby = zzbgj;
    }

    private zzbgh(zzbgj zzbgj) {
        this.zzeck = 1;
        this.zzgby = zzbgj;
    }

    public static zzbgh zza(zzbgp<?, ?> zzbgp) {
        if (zzbgp instanceof zzbgj) {
            return new zzbgh((zzbgj) zzbgp);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzeck);
        oj.m20096a(parcel, 2, this.zzgby, i, false);
        oj.m20088a(parcel, a);
    }

    public final zzbgp<?, ?> zzalt() {
        if (this.zzgby != null) {
            return this.zzgby;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }
}
