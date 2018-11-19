package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.C2507w;
import com.google.android.gms.common.internal.C2509y;
import com.google.android.gms.common.internal.ad;
import java.util.ArrayList;
import java.util.Map;

public final class zzbgo<I, O> extends zzbfm {
    public static final pb CREATOR = new pb();
    private final int zzeck;
    protected final int zzgce;
    protected final boolean zzgcf;
    protected final int zzgcg;
    protected final boolean zzgch;
    protected final String zzgci;
    protected final int zzgcj;
    protected final Class<? extends pa> zzgck;
    private String zzgcl;
    private zzbgt zzgcm;
    private zzbgp<I, O> zzgcn;

    zzbgo(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zzbgh zzbgh) {
        this.zzeck = i;
        this.zzgce = i2;
        this.zzgcf = z;
        this.zzgcg = i3;
        this.zzgch = z2;
        this.zzgci = str;
        this.zzgcj = i4;
        if (str2 == null) {
            this.zzgck = null;
            this.zzgcl = null;
        } else {
            this.zzgck = zzbgy.class;
            this.zzgcl = str2;
        }
        if (zzbgh == null) {
            this.zzgcn = null;
        } else {
            this.zzgcn = zzbgh.zzalt();
        }
    }

    private zzbgo(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends pa> cls, zzbgp<I, O> zzbgp) {
        this.zzeck = 1;
        this.zzgce = i;
        this.zzgcf = z;
        this.zzgcg = i2;
        this.zzgch = z2;
        this.zzgci = str;
        this.zzgcj = i3;
        this.zzgck = cls;
        this.zzgcl = cls == null ? null : cls.getCanonicalName();
        this.zzgcn = zzbgp;
    }

    public static zzbgo zza(String str, int i, zzbgp<?, ?> zzbgp, boolean z) {
        return new zzbgo(7, false, 0, false, str, i, null, zzbgp);
    }

    public static <T extends pa> zzbgo<T, T> zza(String str, int i, Class<T> cls) {
        return new zzbgo(11, false, 11, false, str, i, cls, null);
    }

    private String zzalv() {
        return this.zzgcl == null ? null : this.zzgcl;
    }

    public static <T extends pa> zzbgo<ArrayList<T>, ArrayList<T>> zzb(String str, int i, Class<T> cls) {
        return new zzbgo(11, true, 11, true, str, i, cls, null);
    }

    public static zzbgo<Integer, Integer> zzj(String str, int i) {
        return new zzbgo(0, false, 0, false, str, i, null, null);
    }

    public static zzbgo<Boolean, Boolean> zzk(String str, int i) {
        return new zzbgo(6, false, 6, false, str, i, null, null);
    }

    public static zzbgo<String, String> zzl(String str, int i) {
        return new zzbgo(7, false, 7, false, str, i, null, null);
    }

    public static zzbgo<ArrayList<String>, ArrayList<String>> zzm(String str, int i) {
        return new zzbgo(7, true, 7, true, str, i, null, null);
    }

    public static zzbgo<byte[], byte[]> zzn(String str, int i) {
        return new zzbgo(8, false, 8, false, str, 4, null, null);
    }

    public final I convertBack(O o) {
        return this.zzgcn.convertBack(o);
    }

    public final String toString() {
        C2509y a = C2507w.a(this).a("versionCode", Integer.valueOf(this.zzeck)).a("typeIn", Integer.valueOf(this.zzgce)).a("typeInArray", Boolean.valueOf(this.zzgcf)).a("typeOut", Integer.valueOf(this.zzgcg)).a("typeOutArray", Boolean.valueOf(this.zzgch)).a("outputFieldName", this.zzgci).a("safeParcelFieldId", Integer.valueOf(this.zzgcj)).a("concreteTypeName", zzalv());
        Class cls = this.zzgck;
        if (cls != null) {
            a.a("concreteType.class", cls.getCanonicalName());
        }
        if (this.zzgcn != null) {
            a.a("converterName", this.zzgcn.getClass().getCanonicalName());
        }
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.m20087a(parcel);
        oj.m20091a(parcel, 1, this.zzeck);
        oj.m20091a(parcel, 2, this.zzgce);
        oj.m20101a(parcel, 3, this.zzgcf);
        oj.m20091a(parcel, 4, this.zzgcg);
        oj.m20101a(parcel, 5, this.zzgch);
        oj.m20098a(parcel, 6, this.zzgci, false);
        oj.m20091a(parcel, 7, this.zzgcj);
        oj.m20098a(parcel, 8, zzalv(), false);
        oj.m20096a(parcel, 9, this.zzgcn == null ? null : zzbgh.zza(this.zzgcn), i, false);
        oj.m20088a(parcel, a);
    }

    public final void zza(zzbgt zzbgt) {
        this.zzgcm = zzbgt;
    }

    public final int zzalu() {
        return this.zzgcj;
    }

    public final boolean zzalw() {
        return this.zzgcn != null;
    }

    public final Map<String, zzbgo<?, ?>> zzalx() {
        ad.a(this.zzgcl);
        ad.a(this.zzgcm);
        return this.zzgcm.zzgq(this.zzgcl);
    }
}
