package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2507w;

public final class zzcdv extends zzbfm {
    public static final Creator<zzcdv> CREATOR = new qn();
    private String packageName;
    private int uid;

    public zzcdv(int i, String str) {
        this.uid = i;
        this.packageName = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof zzcdv)) {
            return false;
        }
        zzcdv zzcdv = (zzcdv) obj;
        return zzcdv.uid == this.uid && C2507w.a(zzcdv.packageName, this.packageName);
    }

    public final int hashCode() {
        return this.uid;
    }

    public final String toString() {
        return String.format("%d:%s", new Object[]{Integer.valueOf(this.uid), this.packageName});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.uid);
        oj.m20098a(parcel, 2, this.packageName, false);
        oj.m20088a(parcel, i);
    }
}
