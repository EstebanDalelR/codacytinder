package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.Arrays;

public final class zzae extends zzbfm {
    public static final Creator<zzae> CREATOR = new C4492m();
    private int zzikl;
    private int zzikm;
    private long zzikn;
    private long zziko;

    zzae(int i, int i2, long j, long j2) {
        this.zzikl = i;
        this.zzikm = i2;
        this.zzikn = j;
        this.zziko = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzae zzae = (zzae) obj;
        return this.zzikl == zzae.zzikl && this.zzikm == zzae.zzikm && this.zzikn == zzae.zzikn && this.zziko == zzae.zziko;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzikm), Integer.valueOf(this.zzikl), Long.valueOf(this.zziko), Long.valueOf(this.zzikn)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkLocationStatus:");
        stringBuilder.append(" Wifi status: ");
        stringBuilder.append(this.zzikl);
        stringBuilder.append(" Cell status: ");
        stringBuilder.append(this.zzikm);
        stringBuilder.append(" elapsed time NS: ");
        stringBuilder.append(this.zziko);
        stringBuilder.append(" system time ms: ");
        stringBuilder.append(this.zzikn);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzikl);
        oj.m20091a(parcel, 2, this.zzikm);
        oj.m20092a(parcel, 3, this.zzikn);
        oj.m20092a(parcel, 4, this.zziko);
        oj.m20088a(parcel, i);
    }
}
