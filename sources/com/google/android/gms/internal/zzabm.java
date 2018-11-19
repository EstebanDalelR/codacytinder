package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

@zzzv
public final class zzabm extends zzbfm {
    public static final Creator<zzabm> CREATOR = new ad();
    private ApplicationInfo applicationInfo;
    private String packageName;
    private PackageInfo zzcne;
    private List<String> zzcnr;
    private String zzcoa;
    private Bundle zzcqd;
    private zzakd zzcqe;
    private boolean zzcqf;
    private String zzcqg;

    public zzabm(Bundle bundle, zzakd zzakd, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.zzcqd = bundle;
        this.zzcqe = zzakd;
        this.packageName = str;
        this.applicationInfo = applicationInfo;
        this.zzcnr = list;
        this.zzcne = packageInfo;
        this.zzcoa = str2;
        this.zzcqf = z;
        this.zzcqg = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20093a(parcel, 1, this.zzcqd, false);
        oj.m20096a(parcel, 2, this.zzcqe, i, false);
        oj.m20096a(parcel, 3, this.applicationInfo, i, false);
        oj.m20098a(parcel, 4, this.packageName, false);
        oj.m20110b(parcel, 5, this.zzcnr, false);
        oj.m20096a(parcel, 6, this.zzcne, i, false);
        oj.m20098a(parcel, 7, this.zzcoa, false);
        oj.m20101a(parcel, 8, this.zzcqf);
        oj.m20098a(parcel, 9, this.zzcqg, false);
        oj.m20088a(parcel, a);
    }
}
