package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzbef extends zzbfm {
    public static final Creator<zzbef> CREATOR = new od();
    private boolean zzfju;
    private long zzfjv;
    private long zzfjw;

    public zzbef(boolean z, long j, long j2) {
        this.zzfju = z;
        this.zzfjv = j;
        this.zzfjw = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbef) {
            zzbef zzbef = (zzbef) obj;
            return this.zzfju == zzbef.zzfju && this.zzfjv == zzbef.zzfjv && this.zzfjw == zzbef.zzfjw;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zzfju), Long.valueOf(this.zzfjv), Long.valueOf(this.zzfjw)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        stringBuilder.append(this.zzfju);
        stringBuilder.append(",collectForDebugStartTimeMillis: ");
        stringBuilder.append(this.zzfjv);
        stringBuilder.append(",collectForDebugExpiryTimeMillis: ");
        stringBuilder.append(this.zzfjw);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20101a(parcel, 1, this.zzfju);
        oj.m20092a(parcel, 2, this.zzfjw);
        oj.m20092a(parcel, 3, this.zzfjv);
        oj.m20088a(parcel, i);
    }
}
