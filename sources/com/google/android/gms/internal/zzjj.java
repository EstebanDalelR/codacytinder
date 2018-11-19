package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2507w;
import java.util.Arrays;
import java.util.List;

@zzzv
public final class zzjj extends zzbfm {
    public static final Creator<zzjj> CREATOR = new aim();
    public final Bundle extras;
    public final int versionCode;
    public final long zzbdf;
    public final int zzbdg;
    public final List<String> zzbdh;
    public final boolean zzbdi;
    public final int zzbdj;
    public final boolean zzbdk;
    public final String zzbdl;
    public final zzmn zzbdm;
    public final Location zzbdn;
    public final String zzbdo;
    public final Bundle zzbdp;
    public final Bundle zzbdq;
    public final List<String> zzbdr;
    public final String zzbds;
    public final String zzbdt;
    public final boolean zzbdu;

    public zzjj(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzmn zzmn, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.versionCode = i;
        this.zzbdf = j;
        r0.extras = bundle == null ? new Bundle() : bundle;
        r0.zzbdg = i2;
        r0.zzbdh = list;
        r0.zzbdi = z;
        r0.zzbdj = i3;
        r0.zzbdk = z2;
        r0.zzbdl = str;
        r0.zzbdm = zzmn;
        r0.zzbdn = location;
        r0.zzbdo = str2;
        r0.zzbdp = bundle2 == null ? new Bundle() : bundle2;
        r0.zzbdq = bundle3;
        r0.zzbdr = list2;
        r0.zzbds = str3;
        r0.zzbdt = str4;
        r0.zzbdu = z3;
    }

    public static void zzh(zzjj zzjj) {
        zzjj.zzbdp.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzjj.extras);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjj)) {
            return false;
        }
        zzjj zzjj = (zzjj) obj;
        return this.versionCode == zzjj.versionCode && this.zzbdf == zzjj.zzbdf && C2507w.a(this.extras, zzjj.extras) && this.zzbdg == zzjj.zzbdg && C2507w.a(this.zzbdh, zzjj.zzbdh) && this.zzbdi == zzjj.zzbdi && this.zzbdj == zzjj.zzbdj && this.zzbdk == zzjj.zzbdk && C2507w.a(this.zzbdl, zzjj.zzbdl) && C2507w.a(this.zzbdm, zzjj.zzbdm) && C2507w.a(this.zzbdn, zzjj.zzbdn) && C2507w.a(this.zzbdo, zzjj.zzbdo) && C2507w.a(this.zzbdp, zzjj.zzbdp) && C2507w.a(this.zzbdq, zzjj.zzbdq) && C2507w.a(this.zzbdr, zzjj.zzbdr) && C2507w.a(this.zzbds, zzjj.zzbds) && C2507w.a(this.zzbdt, zzjj.zzbdt) && this.zzbdu == zzjj.zzbdu;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.versionCode), Long.valueOf(this.zzbdf), this.extras, Integer.valueOf(this.zzbdg), this.zzbdh, Boolean.valueOf(this.zzbdi), Integer.valueOf(this.zzbdj), Boolean.valueOf(this.zzbdk), this.zzbdl, this.zzbdm, this.zzbdn, this.zzbdo, this.zzbdp, this.zzbdq, this.zzbdr, this.zzbds, this.zzbdt, Boolean.valueOf(this.zzbdu)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.versionCode);
        oj.m20092a(parcel, 2, this.zzbdf);
        oj.m20093a(parcel, 3, this.extras, false);
        oj.m20091a(parcel, 4, this.zzbdg);
        oj.m20110b(parcel, 5, this.zzbdh, false);
        oj.m20101a(parcel, 6, this.zzbdi);
        oj.m20091a(parcel, 7, this.zzbdj);
        oj.m20101a(parcel, 8, this.zzbdk);
        oj.m20098a(parcel, 9, this.zzbdl, false);
        oj.m20096a(parcel, 10, this.zzbdm, i, false);
        oj.m20096a(parcel, 11, this.zzbdn, i, false);
        oj.m20098a(parcel, 12, this.zzbdo, false);
        oj.m20093a(parcel, 13, this.zzbdp, false);
        oj.m20093a(parcel, 14, this.zzbdq, false);
        oj.m20110b(parcel, 15, this.zzbdr, false);
        oj.m20098a(parcel, 16, this.zzbds, false);
        oj.m20098a(parcel, 17, this.zzbdt, false);
        oj.m20101a(parcel, 18, this.zzbdu);
        oj.m20088a(parcel, a);
    }
}
