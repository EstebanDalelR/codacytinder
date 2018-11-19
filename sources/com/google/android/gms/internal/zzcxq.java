package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzbt;

public final class zzcxq extends zzbfm {
    public static final Creator<zzcxq> CREATOR = new to();
    private int zzeck;
    private final ConnectionResult zzfoo;
    private final zzbt zzkcc;

    public zzcxq(int i) {
        this(new ConnectionResult(8, null), null);
    }

    zzcxq(int i, ConnectionResult connectionResult, zzbt zzbt) {
        this.zzeck = i;
        this.zzfoo = connectionResult;
        this.zzkcc = zzbt;
    }

    private zzcxq(ConnectionResult connectionResult, zzbt zzbt) {
        this(1, connectionResult, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzeck);
        oj.m20096a(parcel, 2, this.zzfoo, i, false);
        oj.m20096a(parcel, 3, this.zzkcc, i, false);
        oj.m20088a(parcel, a);
    }

    public final ConnectionResult zzahf() {
        return this.zzfoo;
    }

    public final zzbt zzbdi() {
        return this.zzkcc;
    }
}
