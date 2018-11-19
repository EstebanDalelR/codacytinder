package com.google.android.gms.ads.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.internal.C4474r;
import com.google.android.gms.internal.amb;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.zzaat;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzlr;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.internal.zzpe;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

final class ac implements Callable<zzou> {
    /* renamed from: a */
    private /* synthetic */ int f7078a;
    /* renamed from: b */
    private /* synthetic */ JSONArray f7079b;
    /* renamed from: c */
    private /* synthetic */ int f7080c;
    /* renamed from: d */
    private /* synthetic */ dm f7081d;
    /* renamed from: e */
    private /* synthetic */ aa f7082e;

    ac(aa aaVar, int i, JSONArray jSONArray, int i2, dm dmVar) {
        this.f7082e = aaVar;
        this.f7078a = i;
        this.f7079b = jSONArray;
        this.f7080c = i2;
        this.f7081d = dmVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        if (this.f7078a >= this.f7079b.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(r0.f7079b.get(r0.f7078a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        C4269a aaVar = new aa(r0.f7082e.e.f7163c, r0.f7082e.h, r0.f7082e.e.f7169i, r0.f7082e.e.f7162b, r0.f7082e.i, r0.f7082e.e.f7165e, true);
        aa.m18553a(r0.f7082e.e, aaVar.e);
        aaVar.m18570h();
        aaVar.m17091a(r0.f7082e.b);
        amb amb = aaVar.f13838a;
        int i = r0.f7078a;
        amb.a("num_ads_requested", String.valueOf(r0.f7080c));
        amb.a("ad_index", String.valueOf(i));
        zzaat zzaat = r0.f7081d.f15995a;
        String jSONObject2 = jSONObject.toString();
        Bundle bundle = zzaat.zzcnd.extras != null ? new Bundle(zzaat.zzcnd.extras) : new Bundle();
        bundle.putString("_ad", jSONObject2);
        int i2 = zzaat.zzcnd.versionCode;
        long j = zzaat.zzcnd.zzbdf;
        int i3 = zzaat.zzcnd.zzbdg;
        List list = zzaat.zzcnd.zzbdh;
        boolean z = zzaat.zzcnd.zzbdi;
        int i4 = zzaat.zzcnd.zzbdj;
        boolean z2 = zzaat.zzcnd.zzbdk;
        String str = zzaat.zzcnd.zzbdl;
        zzmn zzmn = zzaat.zzcnd.zzbdm;
        Location location = zzaat.zzcnd.zzbdn;
        String str2 = zzaat.zzcnd.zzbdo;
        zzmn zzmn2 = zzmn;
        String str3 = str2;
        zzjj zzjj = new zzjj(i2, j, bundle, i3, list, z, i4, z2, str, zzmn2, location, str3, zzaat.zzcnd.zzbdp, zzaat.zzcnd.zzbdq, zzaat.zzcnd.zzbdr, zzaat.zzcnd.zzbds, zzaat.zzcnd.zzbdt, zzaat.zzcnd.zzbdu);
        Bundle bundle2 = zzaat.zzcnc;
        zzjn zzjn = zzaat.zzauc;
        String str4 = zzaat.zzatw;
        ApplicationInfo applicationInfo = zzaat.applicationInfo;
        PackageInfo packageInfo = zzaat.zzcne;
        String str5 = zzaat.zzcng;
        String str6 = zzaat.zzcnh;
        zzakd zzakd = zzaat.zzaty;
        Bundle bundle3 = zzaat.zzcni;
        List list2 = zzaat.zzauw;
        List list3 = zzaat.zzcns;
        Bundle bundle4 = zzaat.zzcnk;
        C4269a c4269a = aaVar;
        boolean z3 = zzaat.zzcnl;
        int i5 = zzaat.zzcnm;
        int i6 = zzaat.zzcnn;
        float f = zzaat.zzaxx;
        String str7 = zzaat.zzcno;
        Bundle bundle5 = bundle3;
        List list4 = list2;
        long j2 = zzaat.zzcnp;
        String str8 = zzaat.zzcnq;
        List list5 = zzaat.zzcnr;
        String str9 = zzaat.zzatv;
        zzpe zzpe = zzaat.zzauo;
        String str10 = zzaat.zzcnu;
        float f2 = zzaat.zzcnv;
        boolean z4 = zzaat.zzcob;
        int i7 = zzaat.zzcnw;
        int i8 = zzaat.zzcnx;
        boolean z5 = zzaat.zzcny;
        boolean z6 = zzaat.zzcnz;
        Bundle bundle6 = bundle4;
        Future a = id.a(zzaat.zzcoa);
        String str11 = zzaat.zzcoc;
        boolean z7 = z6;
        boolean z8 = zzaat.zzcdo;
        int i9 = zzaat.zzcod;
        Bundle bundle7 = zzaat.zzcoe;
        String str12 = zzaat.zzcof;
        zzlr zzlr = zzaat.zzauq;
        boolean z9 = zzaat.zzcog;
        Bundle bundle8 = zzaat.zzcoh;
        List list6 = list3;
        zzjj zzjj2 = zzjj;
        PackageInfo packageInfo2 = packageInfo;
        String str13 = str5;
        str3 = str6;
        zzakd zzakd2 = zzakd;
        Bundle bundle9 = bundle5;
        List list7 = list4;
        boolean z10 = z3;
        int i10 = i5;
        int i11 = i6;
        float f3 = f;
        String str14 = str7;
        long j3 = j2;
        String str15 = str8;
        List list8 = list5;
        String str16 = str9;
        zzpe zzpe2 = zzpe;
        String str17 = str10;
        float f4 = f2;
        boolean z11 = z4;
        int i12 = i7;
        int i13 = i8;
        boolean z12 = z5;
        boolean z13 = z7;
        C4269a c4269a2 = c4269a;
        c4269a2.m18139a(new C4474r(bundle2, zzjj2, zzjn, str4, applicationInfo, packageInfo2, str13, str3, zzakd2, bundle9, list7, list6, bundle6, z10, i10, i11, f3, str14, j3, str15, list8, str16, zzpe2, str17, f4, z11, i12, i13, z12, z13, a, str11, z8, i9, bundle7, str12, zzlr, z9, bundle8, zzaat.zzcol, id.a(zzaat.zzcnf), zzaat.zzaus, zzaat.zzcom, zzaat.zzcon, 1, zzaat.zzcop, zzaat.zzcoq, zzaat.zzcor), c4269a2.f13838a);
        return (zzou) c4269a2.m18572j().get();
    }
}
