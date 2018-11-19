package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzzv;

@zzzv
public final class zzao extends zzbfm {
    public static final Creator<zzao> CREATOR = new C2393o();
    public final boolean zzaqo;
    public final boolean zzaqp;
    private String zzaqq;
    public final boolean zzaqr;
    public final float zzaqs;
    public final int zzaqt;
    public final boolean zzaqu;
    public final boolean zzaqv;

    zzao(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5) {
        this.zzaqo = z;
        this.zzaqp = z2;
        this.zzaqq = str;
        this.zzaqr = z3;
        this.zzaqs = f;
        this.zzaqt = i;
        this.zzaqu = z4;
        this.zzaqv = z5;
    }

    public zzao(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5) {
        this(z, z2, null, z3, f, i, z4, z5);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.a(parcel);
        oj.a(parcel, 2, this.zzaqo);
        oj.a(parcel, 3, this.zzaqp);
        oj.a(parcel, 4, this.zzaqq, false);
        oj.a(parcel, 5, this.zzaqr);
        oj.a(parcel, 6, this.zzaqs);
        oj.a(parcel, 7, this.zzaqt);
        oj.a(parcel, 8, this.zzaqu);
        oj.a(parcel, 9, this.zzaqv);
        oj.a(parcel, i);
    }
}
