package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public final class zzbv extends zzbfm {
    public static final Creator<zzbv> CREATOR = new ag();
    private int zzeck;
    private final int zzgbp;
    private final int zzgbq;
    @Deprecated
    private final Scope[] zzgbr;

    zzbv(int i, int i2, int i3, Scope[] scopeArr) {
        this.zzeck = i;
        this.zzgbp = i2;
        this.zzgbq = i3;
        this.zzgbr = scopeArr;
    }

    public zzbv(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, this.zzeck);
        oj.a(parcel, 2, this.zzgbp);
        oj.a(parcel, 3, this.zzgbq);
        oj.a(parcel, 4, this.zzgbr, i, false);
        oj.a(parcel, a);
    }
}
