package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

@zzzv
public final class zzaax extends zzbfm {
    public static final Creator<zzaax> CREATOR = new C4476u();
    public String body;
    public final int errorCode;
    public final int orientation;
    private int versionCode;
    public final boolean zzaqv;
    public final boolean zzben;
    public final boolean zzbeo;
    public final boolean zzbep;
    public final List<String> zzcdk;
    public final List<String> zzcdl;
    public final List<String> zzcdn;
    public final boolean zzcdo;
    public final long zzcdq;
    private zzaat zzcey;
    public final String zzcja;
    public final boolean zzcnl;
    public final boolean zzcnz;
    @Nullable
    public String zzcoa;
    public final boolean zzcol;
    public final long zzcov;
    public final boolean zzcow;
    public final long zzcox;
    public final List<String> zzcoy;
    public final String zzcoz;
    public final long zzcpa;
    public final String zzcpb;
    public final boolean zzcpc;
    public final String zzcpd;
    public final String zzcpe;
    public final boolean zzcpf;
    public final boolean zzcpg;
    public final boolean zzcph;
    private zzabj zzcpi;
    public String zzcpj;
    public final String zzcpk;
    @Nullable
    public final zzaeq zzcpl;
    @Nullable
    public final List<String> zzcpm;
    @Nullable
    public final List<String> zzcpn;
    public final boolean zzcpo;
    @Nullable
    public final zzaaz zzcpp;
    @Nullable
    public final String zzcpq;
    @Nullable
    public final zzaey zzcpr;
    @Nullable
    public final String zzcps;
    public final boolean zzcpt;
    private Bundle zzcpu;
    public final int zzcpv;

    public zzaax(int i) {
        this(19, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0);
    }

    public zzaax(int i, long j) {
        this(19, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0);
    }

    zzaax(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzabj zzabj, String str7, String str8, boolean z8, boolean z9, zzaeq zzaeq, List<String> list4, List<String> list5, boolean z10, zzaaz zzaaz, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzaey zzaey, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4) {
        this.versionCode = i;
        this.zzcja = str;
        this.body = str2;
        List list7 = null;
        r0.zzcdk = list != null ? Collections.unmodifiableList(list) : null;
        r0.errorCode = i2;
        r0.zzcdl = list2 != null ? Collections.unmodifiableList(list2) : null;
        r0.zzcov = j;
        r0.zzcow = z;
        r0.zzcox = j2;
        if (list3 != null) {
            list7 = Collections.unmodifiableList(list3);
        }
        r0.zzcoy = list7;
        r0.zzcdq = j3;
        r0.orientation = i3;
        r0.zzcoz = str3;
        r0.zzcpa = j4;
        r0.zzcpb = str4;
        r0.zzcpc = z2;
        r0.zzcpd = str5;
        r0.zzcpe = str6;
        r0.zzcpf = z3;
        r0.zzben = z4;
        r0.zzcnl = z5;
        r0.zzcpg = z6;
        r0.zzcpt = z13;
        r0.zzcph = z7;
        r0.zzcpi = zzabj;
        r0.zzcpj = str7;
        r0.zzcpk = str8;
        if (r0.body == null && r0.zzcpi != null) {
            zzabx zzabx = (zzabx) r0.zzcpi.zza(zzabx.CREATOR);
            if (!(zzabx == null || TextUtils.isEmpty(zzabx.zzbsw))) {
                r0.body = zzabx.zzbsw;
            }
        }
        r0.zzbeo = z8;
        r0.zzbep = z9;
        r0.zzcpl = zzaeq;
        r0.zzcpm = list4;
        r0.zzcpn = list5;
        r0.zzcpo = z10;
        r0.zzcpp = zzaaz;
        r0.zzcnz = z11;
        r0.zzcoa = str9;
        r0.zzcdn = list6;
        r0.zzcdo = z12;
        r0.zzcpq = str10;
        r0.zzcpr = zzaey;
        r0.zzcps = str11;
        r0.zzcol = z14;
        r0.zzcpu = bundle;
        r0.zzaqv = z15;
        r0.zzcpv = i4;
    }

    public zzaax(zzaat zzaat, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzaeq zzaeq, List<String> list4, List<String> list5, boolean z9, zzaaz zzaaz, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzaey zzaey, String str9, boolean z12, boolean z13, boolean z14, int i2) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z7, z8, zzaeq, list4, list5, z9, zzaaz, z10, str7, list6, z11, str8, zzaey, str9, z12, z13, null, z14, i2);
        this.zzcey = zzaat;
    }

    public zzaax(zzaat zzaat, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzaeq zzaeq, List<String> list4, List<String> list5, boolean z10, zzaaz zzaaz, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzaey zzaey, String str10, boolean z13, boolean z14, boolean z15, int i2) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, zzaeq, list4, list5, z10, zzaaz, z11, str8, list6, z12, str9, zzaey, str10, z13, z14, null, z15, 0);
        this.zzcey = zzaat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (!(this.zzcey == null || this.zzcey.versionCode < 9 || TextUtils.isEmpty(this.body))) {
            this.zzcpi = new zzabj(new zzabx(this.body));
            this.body = null;
        }
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.versionCode);
        oj.m20098a(parcel, 2, this.zzcja, false);
        oj.m20098a(parcel, 3, this.body, false);
        oj.m20110b(parcel, 4, this.zzcdk, false);
        oj.m20091a(parcel, 5, this.errorCode);
        oj.m20110b(parcel, 6, this.zzcdl, false);
        oj.m20092a(parcel, 7, this.zzcov);
        oj.m20101a(parcel, 8, this.zzcow);
        oj.m20092a(parcel, 9, this.zzcox);
        oj.m20110b(parcel, 10, this.zzcoy, false);
        oj.m20092a(parcel, 11, this.zzcdq);
        oj.m20091a(parcel, 12, this.orientation);
        oj.m20098a(parcel, 13, this.zzcoz, false);
        oj.m20092a(parcel, 14, this.zzcpa);
        oj.m20098a(parcel, 15, this.zzcpb, false);
        oj.m20101a(parcel, 18, this.zzcpc);
        oj.m20098a(parcel, 19, this.zzcpd, false);
        oj.m20098a(parcel, 21, this.zzcpe, false);
        oj.m20101a(parcel, 22, this.zzcpf);
        oj.m20101a(parcel, 23, this.zzben);
        oj.m20101a(parcel, 24, this.zzcnl);
        oj.m20101a(parcel, 25, this.zzcpg);
        oj.m20101a(parcel, 26, this.zzcph);
        oj.m20096a(parcel, 28, this.zzcpi, i, false);
        oj.m20098a(parcel, 29, this.zzcpj, false);
        oj.m20098a(parcel, 30, this.zzcpk, false);
        oj.m20101a(parcel, 31, this.zzbeo);
        oj.m20101a(parcel, 32, this.zzbep);
        oj.m20096a(parcel, 33, this.zzcpl, i, false);
        oj.m20110b(parcel, 34, this.zzcpm, false);
        oj.m20110b(parcel, 35, this.zzcpn, false);
        oj.m20101a(parcel, 36, this.zzcpo);
        oj.m20096a(parcel, 37, this.zzcpp, i, false);
        oj.m20101a(parcel, 38, this.zzcnz);
        oj.m20098a(parcel, 39, this.zzcoa, false);
        oj.m20110b(parcel, 40, this.zzcdn, false);
        oj.m20101a(parcel, 42, this.zzcdo);
        oj.m20098a(parcel, 43, this.zzcpq, false);
        oj.m20096a(parcel, 44, this.zzcpr, i, false);
        oj.m20098a(parcel, 45, this.zzcps, false);
        oj.m20101a(parcel, 46, this.zzcpt);
        oj.m20101a(parcel, 47, this.zzcol);
        oj.m20093a(parcel, 48, this.zzcpu, false);
        oj.m20101a(parcel, 49, this.zzaqv);
        oj.m20091a(parcel, 50, this.zzcpv);
        oj.m20088a(parcel, a);
    }
}
