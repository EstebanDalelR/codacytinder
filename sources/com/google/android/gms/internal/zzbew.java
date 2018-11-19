package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2507w;
import com.google.android.gms.common.internal.ad;
import java.util.Arrays;

public final class zzbew extends zzbfm {
    public static final Creator<zzbew> CREATOR = new of();
    private String packageName;
    private int zzfja;
    public final String zzfjb;
    public final int zzfjc;
    private String zzfjd;
    private String zzfje;
    private boolean zzfjf;
    private int zzfjg;
    private boolean zzfko;

    public zzbew(String str, int i, int i2, String str2, String str3, String str4, boolean z, int i3) {
        this.packageName = (String) ad.a(str);
        this.zzfja = i;
        this.zzfjc = i2;
        this.zzfjb = str2;
        this.zzfjd = str3;
        this.zzfje = str4;
        this.zzfko = z ^ 1;
        this.zzfjf = z;
        this.zzfjg = i3;
    }

    public zzbew(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
        this.packageName = str;
        this.zzfja = i;
        this.zzfjc = i2;
        this.zzfjd = str2;
        this.zzfje = str3;
        this.zzfko = z;
        this.zzfjb = str4;
        this.zzfjf = z2;
        this.zzfjg = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbew) {
            zzbew zzbew = (zzbew) obj;
            return C2507w.a(this.packageName, zzbew.packageName) && this.zzfja == zzbew.zzfja && this.zzfjc == zzbew.zzfjc && C2507w.a(this.zzfjb, zzbew.zzfjb) && C2507w.a(this.zzfjd, zzbew.zzfjd) && C2507w.a(this.zzfje, zzbew.zzfje) && this.zzfko == zzbew.zzfko && this.zzfjf == zzbew.zzfjf && this.zzfjg == zzbew.zzfjg;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.packageName, Integer.valueOf(this.zzfja), Integer.valueOf(this.zzfjc), this.zzfjb, this.zzfjd, this.zzfje, Boolean.valueOf(this.zzfko), Boolean.valueOf(this.zzfjf), Integer.valueOf(this.zzfjg)});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlayLoggerContext[");
        stringBuilder.append("package=");
        stringBuilder.append(this.packageName);
        stringBuilder.append(',');
        stringBuilder.append("packageVersionCode=");
        stringBuilder.append(this.zzfja);
        stringBuilder.append(',');
        stringBuilder.append("logSource=");
        stringBuilder.append(this.zzfjc);
        stringBuilder.append(',');
        stringBuilder.append("logSourceName=");
        stringBuilder.append(this.zzfjb);
        stringBuilder.append(',');
        stringBuilder.append("uploadAccount=");
        stringBuilder.append(this.zzfjd);
        stringBuilder.append(',');
        stringBuilder.append("loggingId=");
        stringBuilder.append(this.zzfje);
        stringBuilder.append(',');
        stringBuilder.append("logAndroidId=");
        stringBuilder.append(this.zzfko);
        stringBuilder.append(',');
        stringBuilder.append("isAnonymous=");
        stringBuilder.append(this.zzfjf);
        stringBuilder.append(',');
        stringBuilder.append("qosTier=");
        stringBuilder.append(this.zzfjg);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.m20087a(parcel);
        oj.m20098a(parcel, 2, this.packageName, false);
        oj.m20091a(parcel, 3, this.zzfja);
        oj.m20091a(parcel, 4, this.zzfjc);
        oj.m20098a(parcel, 5, this.zzfjd, false);
        oj.m20098a(parcel, 6, this.zzfje, false);
        oj.m20101a(parcel, 7, this.zzfko);
        oj.m20098a(parcel, 8, this.zzfjb, false);
        oj.m20101a(parcel, 9, this.zzfjf);
        oj.m20091a(parcel, 10, this.zzfjg);
        oj.m20088a(parcel, i);
    }
}
