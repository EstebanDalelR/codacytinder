package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C2507w;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzcfo extends zzbfm {
    public static final Creator<zzcfo> CREATOR = new sa();
    static final List<zzcdv> zzikv = Collections.emptyList();
    @Nullable
    private String mTag;
    @Nullable
    private String zzelc;
    private LocationRequest zzhhp;
    private List<zzcdv> zziky;
    private boolean zzilw;
    private boolean zzilx;
    private boolean zzily;
    private boolean zzilz = true;

    zzcfo(LocationRequest locationRequest, List<zzcdv> list, @Nullable String str, boolean z, boolean z2, boolean z3, String str2) {
        this.zzhhp = locationRequest;
        this.zziky = list;
        this.mTag = str;
        this.zzilw = z;
        this.zzilx = z2;
        this.zzily = z3;
        this.zzelc = str2;
    }

    @Deprecated
    public static zzcfo zza(LocationRequest locationRequest) {
        return new zzcfo(locationRequest, zzikv, null, false, false, false, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcfo)) {
            return false;
        }
        zzcfo zzcfo = (zzcfo) obj;
        return C2507w.a(this.zzhhp, zzcfo.zzhhp) && C2507w.a(this.zziky, zzcfo.zziky) && C2507w.a(this.mTag, zzcfo.mTag) && this.zzilw == zzcfo.zzilw && this.zzilx == zzcfo.zzilx && this.zzily == zzcfo.zzily && C2507w.a(this.zzelc, zzcfo.zzelc);
    }

    public final int hashCode() {
        return this.zzhhp.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.zzhhp.toString());
        if (this.mTag != null) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.mTag);
        }
        if (this.zzelc != null) {
            stringBuilder.append(" moduleId=");
            stringBuilder.append(this.zzelc);
        }
        stringBuilder.append(" hideAppOps=");
        stringBuilder.append(this.zzilw);
        stringBuilder.append(" clients=");
        stringBuilder.append(this.zziky);
        stringBuilder.append(" forceCoarseLocation=");
        stringBuilder.append(this.zzilx);
        if (this.zzily) {
            stringBuilder.append(" exemptFromBackgroundThrottle");
        }
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20096a(parcel, 1, this.zzhhp, i, false);
        oj.m20112c(parcel, 5, this.zziky, false);
        oj.m20098a(parcel, 6, this.mTag, false);
        oj.m20101a(parcel, 7, this.zzilw);
        oj.m20101a(parcel, 8, this.zzilx);
        oj.m20101a(parcel, 9, this.zzily);
        oj.m20098a(parcel, 10, this.zzelc, false);
        oj.m20088a(parcel, a);
    }
}
