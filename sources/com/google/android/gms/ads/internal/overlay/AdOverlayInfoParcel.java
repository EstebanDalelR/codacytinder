package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.zzao;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzje;
import com.google.android.gms.internal.zzzv;

@zzzv
public final class AdOverlayInfoParcel extends zzbfm implements ReflectedParcelable {
    public static final Creator<AdOverlayInfoParcel> CREATOR = new C2401k();
    public final int orientation;
    public final String url;
    public final zzakd zzaty;
    public final zzc zzciv;
    public final zzje zzciw;
    public final zzn zzcix;
    public final zzanh zzciy;
    public final zzb zzciz;
    public final String zzcja;
    public final boolean zzcjb;
    public final String zzcjc;
    public final zzq zzcjd;
    public final int zzcje;
    public final String zzcjf;
    public final zzao zzcjg;

    AdOverlayInfoParcel(zzc zzc, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzakd zzakd, String str4, zzao zzao) {
        this.zzciv = zzc;
        this.zzciw = (zzje) C4296b.m17262a(C3828a.m14461a(iBinder));
        this.zzcix = (zzn) C4296b.m17262a(C3828a.m14461a(iBinder2));
        this.zzciy = (zzanh) C4296b.m17262a(C3828a.m14461a(iBinder3));
        this.zzciz = (zzb) C4296b.m17262a(C3828a.m14461a(iBinder4));
        this.zzcja = str;
        this.zzcjb = z;
        this.zzcjc = str2;
        this.zzcjd = (zzq) C4296b.m17262a(C3828a.m14461a(iBinder5));
        this.orientation = i;
        this.zzcje = i2;
        this.url = str3;
        this.zzaty = zzakd;
        this.zzcjf = str4;
        this.zzcjg = zzao;
    }

    public AdOverlayInfoParcel(zzc zzc, zzje zzje, zzn zzn, zzq zzq, zzakd zzakd) {
        this.zzciv = zzc;
        this.zzciw = zzje;
        this.zzcix = zzn;
        this.zzciy = null;
        this.zzciz = null;
        this.zzcja = null;
        this.zzcjb = false;
        this.zzcjc = null;
        this.zzcjd = zzq;
        this.orientation = -1;
        this.zzcje = 4;
        this.url = null;
        this.zzaty = zzakd;
        this.zzcjf = null;
        this.zzcjg = null;
    }

    public AdOverlayInfoParcel(zzje zzje, zzn zzn, zzb zzb, zzq zzq, zzanh zzanh, boolean z, int i, String str, zzakd zzakd) {
        this.zzciv = null;
        this.zzciw = zzje;
        this.zzcix = zzn;
        this.zzciy = zzanh;
        this.zzciz = zzb;
        this.zzcja = null;
        this.zzcjb = z;
        this.zzcjc = null;
        this.zzcjd = zzq;
        this.orientation = i;
        this.zzcje = 3;
        this.url = str;
        this.zzaty = zzakd;
        this.zzcjf = null;
        this.zzcjg = null;
    }

    public AdOverlayInfoParcel(zzje zzje, zzn zzn, zzb zzb, zzq zzq, zzanh zzanh, boolean z, int i, String str, String str2, zzakd zzakd) {
        this.zzciv = null;
        this.zzciw = zzje;
        this.zzcix = zzn;
        this.zzciy = zzanh;
        this.zzciz = zzb;
        this.zzcja = str2;
        this.zzcjb = z;
        this.zzcjc = str;
        this.zzcjd = zzq;
        this.orientation = i;
        this.zzcje = 3;
        this.url = null;
        this.zzaty = zzakd;
        this.zzcjf = null;
        this.zzcjg = null;
    }

    public AdOverlayInfoParcel(zzje zzje, zzn zzn, zzq zzq, zzanh zzanh, int i, zzakd zzakd, String str, zzao zzao) {
        this.zzciv = null;
        this.zzciw = zzje;
        this.zzcix = zzn;
        this.zzciy = zzanh;
        this.zzciz = null;
        this.zzcja = null;
        this.zzcjb = false;
        this.zzcjc = null;
        this.zzcjd = zzq;
        this.orientation = i;
        this.zzcje = 1;
        this.url = null;
        this.zzaty = zzakd;
        this.zzcjf = str;
        this.zzcjg = zzao;
    }

    public AdOverlayInfoParcel(zzje zzje, zzn zzn, zzq zzq, zzanh zzanh, boolean z, int i, zzakd zzakd) {
        this.zzciv = null;
        this.zzciw = zzje;
        this.zzcix = zzn;
        this.zzciy = zzanh;
        this.zzciz = null;
        this.zzcja = null;
        this.zzcjb = z;
        this.zzcjc = null;
        this.zzcjd = zzq;
        this.orientation = i;
        this.zzcje = 2;
        this.url = null;
        this.zzaty = zzakd;
        this.zzcjf = null;
        this.zzcjg = null;
    }

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zzc(android.content.Intent r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";	 Catch:{ Exception -> 0x0018 }
        r1 = r1.getBundleExtra(r0);	 Catch:{ Exception -> 0x0018 }
        r0 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.class;	 Catch:{ Exception -> 0x0018 }
        r0 = r0.getClassLoader();	 Catch:{ Exception -> 0x0018 }
        r1.setClassLoader(r0);	 Catch:{ Exception -> 0x0018 }
        r0 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";	 Catch:{ Exception -> 0x0018 }
        r1 = r1.getParcelable(r0);	 Catch:{ Exception -> 0x0018 }
        r1 = (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel) r1;	 Catch:{ Exception -> 0x0018 }
        return r1;
    L_0x0018:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzc(android.content.Intent):com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 2, this.zzciv, i, false);
        oj.a(parcel, 3, C4296b.m17261a(this.zzciw).asBinder(), false);
        oj.a(parcel, 4, C4296b.m17261a(this.zzcix).asBinder(), false);
        oj.a(parcel, 5, C4296b.m17261a(this.zzciy).asBinder(), false);
        oj.a(parcel, 6, C4296b.m17261a(this.zzciz).asBinder(), false);
        oj.a(parcel, 7, this.zzcja, false);
        oj.a(parcel, 8, this.zzcjb);
        oj.a(parcel, 9, this.zzcjc, false);
        oj.a(parcel, 10, C4296b.m17261a(this.zzcjd).asBinder(), false);
        oj.a(parcel, 11, this.orientation);
        oj.a(parcel, 12, this.zzcje);
        oj.a(parcel, 13, this.url, false);
        oj.a(parcel, 14, this.zzaty, i, false);
        oj.a(parcel, 16, this.zzcjf, false);
        oj.a(parcel, 17, this.zzcjg, i, false);
        oj.a(parcel, a);
    }
}
