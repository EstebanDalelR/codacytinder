package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C2507w;
import com.google.android.gms.location.zze;
import java.util.Collections;
import java.util.List;

public final class zzcdx extends zzbfm {
    public static final Creator<zzcdx> CREATOR = new qo();
    static final List<zzcdv> zzikv = Collections.emptyList();
    static final zze zzikw = new zze();
    @Nullable
    private String mTag;
    private zze zzikx;
    private List<zzcdv> zziky;

    zzcdx(zze zze, List<zzcdv> list, String str) {
        this.zzikx = zze;
        this.zziky = list;
        this.mTag = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcdx)) {
            return false;
        }
        zzcdx zzcdx = (zzcdx) obj;
        return C2507w.a(this.zzikx, zzcdx.zzikx) && C2507w.a(this.zziky, zzcdx.zziky) && C2507w.a(this.mTag, zzcdx.mTag);
    }

    public final int hashCode() {
        return this.zzikx.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20096a(parcel, 1, this.zzikx, i, false);
        oj.m20112c(parcel, 2, this.zziky, false);
        oj.m20098a(parcel, 3, this.mTag, false);
        oj.m20088a(parcel, a);
    }
}
