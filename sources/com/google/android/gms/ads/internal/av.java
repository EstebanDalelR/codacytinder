package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.internal.C4474r;
import com.google.android.gms.internal.ae;
import com.google.android.gms.internal.ags;
import com.google.android.gms.internal.ahz;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.amb;
import com.google.android.gms.internal.arp;
import com.google.android.gms.internal.awe;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.dy;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zziu.zza.zzb;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzqm;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzuj;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzzv;

@zzzv
public abstract class av extends C4269a implements zzn, zzbl, zzuj {
    /* renamed from: i */
    protected final zzux f14558i;
    /* renamed from: j */
    private transient boolean f14559j;

    public av(Context context, zzjn zzjn, String str, zzux zzux, zzakd zzakd, bn bnVar) {
        this(new as(context, zzjn, str, zzakd), zzux, null, bnVar);
    }

    private av(as asVar, zzux zzux, @Nullable ai aiVar, bn bnVar) {
        super(asVar, null, bnVar);
        this.f14558i = zzux;
        this.f14559j = false;
    }

    /* renamed from: a */
    private final com.google.android.gms.internal.C4474r m18134a(com.google.android.gms.internal.zzjj r63, android.os.Bundle r64, com.google.android.gms.internal.dp r65, int r66) {
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
        r62 = this;
        r0 = r62;
        r1 = r0.e;
        r1 = r1.f7163c;
        r7 = r1.getApplicationInfo();
        r1 = 0;
        r2 = 0;
        r3 = r0.e;	 Catch:{ NameNotFoundException -> 0x001c }
        r3 = r3.f7163c;	 Catch:{ NameNotFoundException -> 0x001c }
        r3 = com.google.android.gms.internal.pl.a(r3);	 Catch:{ NameNotFoundException -> 0x001c }
        r4 = r7.packageName;	 Catch:{ NameNotFoundException -> 0x001c }
        r3 = r3.b(r4, r2);	 Catch:{ NameNotFoundException -> 0x001c }
        r8 = r3;
        goto L_0x001d;
    L_0x001c:
        r8 = r1;
    L_0x001d:
        r3 = r0.e;
        r3 = r3.f7163c;
        r3 = r3.getResources();
        r3 = r3.getDisplayMetrics();
        r4 = r0.e;
        r4 = r4.f7166f;
        if (r4 == 0) goto L_0x0094;
    L_0x002f:
        r4 = r0.e;
        r4 = r4.f7166f;
        r4 = r4.getParent();
        if (r4 == 0) goto L_0x0094;
    L_0x0039:
        r4 = 2;
        r4 = new int[r4];
        r5 = r0.e;
        r5 = r5.f7166f;
        r5.getLocationOnScreen(r4);
        r5 = r4[r2];
        r6 = 1;
        r4 = r4[r6];
        r9 = r0.e;
        r9 = r9.f7166f;
        r9 = r9.getWidth();
        r10 = r0.e;
        r10 = r10.f7166f;
        r10 = r10.getHeight();
        r11 = r0.e;
        r11 = r11.f7166f;
        r11 = r11.isShown();
        if (r11 == 0) goto L_0x0073;
    L_0x0062:
        r11 = r5 + r9;
        if (r11 <= 0) goto L_0x0073;
    L_0x0066:
        r11 = r4 + r10;
        if (r11 <= 0) goto L_0x0073;
    L_0x006a:
        r11 = r3.widthPixels;
        if (r5 > r11) goto L_0x0073;
    L_0x006e:
        r11 = r3.heightPixels;
        if (r4 > r11) goto L_0x0073;
    L_0x0072:
        goto L_0x0074;
    L_0x0073:
        r6 = 0;
    L_0x0074:
        r11 = new android.os.Bundle;
        r12 = 5;
        r11.<init>(r12);
        r12 = "x";
        r11.putInt(r12, r5);
        r5 = "y";
        r11.putInt(r5, r4);
        r4 = "width";
        r11.putInt(r4, r9);
        r4 = "height";
        r11.putInt(r4, r10);
        r4 = "visible";
        r11.putInt(r4, r6);
        goto L_0x0095;
    L_0x0094:
        r11 = r1;
    L_0x0095:
        r4 = com.google.android.gms.ads.internal.ar.m8652i();
        r9 = r4.c();
        r4 = r0.e;
        r5 = new com.google.android.gms.internal.dn;
        r6 = r0.e;
        r6 = r6.f7162b;
        r5.<init>(r9, r6);
        r4.f7172l = r5;
        r4 = r0.e;
        r4 = r4.f7172l;
        r5 = r63;
        r4.a(r5);
        com.google.android.gms.ads.internal.ar.m8648e();
        r4 = r0.e;
        r4 = r4.f7163c;
        r6 = r0.e;
        r6 = r6.f7166f;
        r10 = r0.e;
        r10 = r10.f7169i;
        r20 = com.google.android.gms.internal.fk.a(r4, r6, r10);
        r12 = 0;
        r4 = r0.e;
        r4 = r4.f7176p;
        if (r4 == 0) goto L_0x00de;
    L_0x00ce:
        r4 = r0.e;	 Catch:{ RemoteException -> 0x00d9 }
        r4 = r4.f7176p;	 Catch:{ RemoteException -> 0x00d9 }
        r14 = r4.getValue();	 Catch:{ RemoteException -> 0x00d9 }
        r21 = r14;
        goto L_0x00e0;
    L_0x00d9:
        r4 = "Cannot get correlation id, default to 0.";
        com.google.android.gms.internal.ec.e(r4);
    L_0x00de:
        r21 = r12;
    L_0x00e0:
        r4 = java.util.UUID.randomUUID();
        r23 = r4.toString();
        r4 = com.google.android.gms.ads.internal.ar.m8652i();
        r6 = r0.e;
        r6 = r6.f7163c;
        r12 = r4.a(r6, r0, r9);
        r14 = new java.util.ArrayList;
        r14.<init>();
        r15 = new java.util.ArrayList;
        r15.<init>();
        r4 = 0;
    L_0x00ff:
        r6 = r0.e;
        r6 = r6.f7180t;
        r6 = r6.size();
        if (r4 >= r6) goto L_0x0130;
    L_0x0109:
        r6 = r0.e;
        r6 = r6.f7180t;
        r6 = r6.m2075b(r4);
        r6 = (java.lang.String) r6;
        r14.add(r6);
        r10 = r0.e;
        r10 = r10.f7179s;
        r10 = r10.containsKey(r6);
        if (r10 == 0) goto L_0x012d;
    L_0x0120:
        r10 = r0.e;
        r10 = r10.f7179s;
        r10 = r10.get(r6);
        if (r10 == 0) goto L_0x012d;
    L_0x012a:
        r15.add(r6);
    L_0x012d:
        r4 = r4 + 1;
        goto L_0x00ff;
    L_0x0130:
        r4 = new com.google.android.gms.ads.internal.aw;
        r4.<init>(r0);
        r6 = com.google.android.gms.internal.fe.f16050a;
        r34 = com.google.android.gms.internal.fe.a(r6, r4);
        r4 = new com.google.android.gms.ads.internal.ax;
        r4.<init>(r0);
        r6 = com.google.android.gms.internal.fe.f16050a;
        r44 = com.google.android.gms.internal.fe.a(r6, r4);
        if (r65 == 0) goto L_0x014f;
    L_0x0148:
        r4 = r65.c();
        r35 = r4;
        goto L_0x0151;
    L_0x014f:
        r35 = r1;
    L_0x0151:
        r4 = r0.e;
        r4 = r4.f7149C;
        if (r4 == 0) goto L_0x0198;
    L_0x0157:
        r4 = r0.e;
        r4 = r4.f7149C;
        r4 = r4.size();
        if (r4 <= 0) goto L_0x0198;
    L_0x0161:
        if (r8 == 0) goto L_0x0166;
    L_0x0163:
        r4 = r8.versionCode;
        goto L_0x0167;
    L_0x0166:
        r4 = 0;
    L_0x0167:
        r6 = com.google.android.gms.ads.internal.ar.m8652i();
        r6 = r6.m();
        if (r4 <= r6) goto L_0x0180;
    L_0x0171:
        r6 = com.google.android.gms.ads.internal.ar.m8652i();
        r6.t();
        r6 = com.google.android.gms.ads.internal.ar.m8652i();
        r6.a(r4);
        goto L_0x0198;
    L_0x0180:
        r4 = com.google.android.gms.ads.internal.ar.m8652i();
        r4 = r4.s();
        if (r4 == 0) goto L_0x0198;
    L_0x018a:
        r6 = r0.e;
        r6 = r6.f7162b;
        r4 = r4.optJSONArray(r6);
        if (r4 == 0) goto L_0x0198;
    L_0x0194:
        r1 = r4.toString();
    L_0x0198:
        r46 = r1;
        r1 = new com.google.android.gms.internal.r;
        r4 = r0.e;
        r6 = r4.f7169i;
        r4 = r0.e;
        r10 = r4.f7162b;
        r13 = com.google.android.gms.internal.aja.c();
        r4 = r0.e;
        r4 = r4.f7165e;
        r2 = r0.e;
        r2 = r2.f7149C;
        r52 = r2;
        r2 = com.google.android.gms.ads.internal.ar.m8652i();
        r16 = r2.f();
        r2 = r3.widthPixels;
        r53 = r15;
        r15 = r3.heightPixels;
        r3 = r3.density;
        r24 = com.google.android.gms.internal.alo.a();
        r54 = r2;
        r2 = r0.e;
        r2 = r2.f7161a;
        r55 = r2;
        r2 = r0.e;
        r2 = r2.f7181u;
        r56 = r2;
        r2 = r0.e;
        r27 = r2.m8679f();
        com.google.android.gms.ads.internal.ar.m8648e();
        r28 = com.google.android.gms.internal.fk.c();
        com.google.android.gms.ads.internal.ar.m8648e();
        r29 = com.google.android.gms.internal.fk.d();
        com.google.android.gms.ads.internal.ar.m8648e();
        r2 = r0.e;
        r2 = r2.f7163c;
        r30 = com.google.android.gms.internal.fk.k(r2);
        com.google.android.gms.ads.internal.ar.m8648e();
        r2 = r0.e;
        r2 = r2.f7166f;
        r31 = com.google.android.gms.internal.fk.d(r2);
        r2 = r0.e;
        r2 = r2.f7163c;
        r2 = r2 instanceof android.app.Activity;
        r57 = r2;
        r2 = com.google.android.gms.ads.internal.ar.m8652i();
        r33 = r2.j();
        r2 = com.google.android.gms.ads.internal.ar.m8652i();
        r36 = r2.o();
        r2 = com.google.android.gms.ads.internal.ar.m8667x();
        r37 = r2.a();
        com.google.android.gms.ads.internal.ar.m8648e();
        r38 = com.google.android.gms.internal.fk.e();
        r2 = com.google.android.gms.ads.internal.ar.m8657n();
        r39 = r2.a();
        r2 = r0.e;
        r2 = r2.f7183w;
        r58 = r2;
        r2 = com.google.android.gms.ads.internal.ar.m8657n();
        r41 = r2.b();
        r2 = com.google.android.gms.internal.aqs.a();
        r42 = r2.j();
        com.google.android.gms.ads.internal.ar.m8652i();
        r2 = r0.e;
        r2 = r2.f7163c;
        r59 = r3;
        r3 = r0.e;
        r3 = r3.f7162b;
        r60 = r4;
        r4 = "admob";
        r61 = r15;
        r15 = 0;
        r2 = r2.getSharedPreferences(r4, r15);
        r4 = java.util.Collections.emptySet();
        r15 = "never_pool_slots";
        r2 = r2.getStringSet(r15, r4);
        r43 = r2.contains(r3);
        r2 = r0.e;
        r15 = r2.f7185y;
        r2 = r0.e;
        r2 = r2.f7163c;
        r2 = com.google.android.gms.internal.pl.a(r2);
        r49 = r2.a();
        r2 = com.google.android.gms.ads.internal.ar.m8652i();
        r50 = r2.p();
        com.google.android.gms.ads.internal.ar.m8650g();
        r51 = com.google.android.gms.internal.fq.e();
        r17 = r52;
        r18 = r54;
        r25 = r55;
        r26 = r56;
        r32 = r57;
        r40 = r58;
        r2 = r1;
        r19 = r59;
        r3 = r11;
        r11 = r60;
        r4 = r5;
        r5 = r6;
        r6 = r10;
        r10 = r13;
        r13 = r17;
        r48 = r15;
        r47 = r53;
        r45 = r61;
        r15 = r64;
        r17 = r18;
        r18 = r45;
        r45 = r48;
        r48 = r66;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.av.a(com.google.android.gms.internal.zzjj, android.os.Bundle, com.google.android.gms.internal.dp, int):com.google.android.gms.internal.r");
    }

    @android.support.annotation.Nullable
    /* renamed from: b */
    static java.lang.String m18135b(com.google.android.gms.internal.dl r2) {
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
        if (r2 != 0) goto L_0x0004;
    L_0x0002:
        r2 = 0;
        return r2;
    L_0x0004:
        r0 = r2.f15984p;
        r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0019;
    L_0x000e:
        r1 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0019;
    L_0x0017:
        r1 = 0;
        goto L_0x001a;
    L_0x0019:
        r1 = 1;
    L_0x001a:
        if (r1 == 0) goto L_0x0030;
    L_0x001c:
        r1 = r2.f15982n;
        if (r1 == 0) goto L_0x0030;
    L_0x0020:
        r2 = r2.f15982n;
        r2 = r2.f15631j;
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        r1.<init>(r2);	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        r2 = "class_name";	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        r2 = r1.getString(r2);	 Catch:{ JSONException -> 0x0030, JSONException -> 0x0030 }
        return r2;
    L_0x0030:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.av.b(com.google.android.gms.internal.dl):java.lang.String");
    }

    /* renamed from: a */
    protected void mo4035a(@Nullable dl dlVar, boolean z) {
        if (dlVar == null) {
            ec.e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (dlVar == null) {
            ec.e("Ad state was null when trying to ping impression URLs.");
        } else {
            ec.b("Pinging Impression URLs.");
            if (this.f13842e.f7172l != null) {
                this.f13842e.f7172l.a();
            }
            dlVar.f15963H.a(zzb.zzbbq);
            if (!(dlVar.f15973e == null || dlVar.f15958C)) {
                ar.m8648e();
                fk.a(this.f13842e.f7163c, this.f13842e.f7165e.zzcv, m17087a(dlVar.f15973e));
                dlVar.f15958C = true;
            }
        }
        if (!dlVar.f15959D || z) {
            if (!(dlVar.f15985q == null || dlVar.f15985q.f15644d == null)) {
                ar.m8665v();
                arp.a(this.e.f7163c, this.e.f7165e.zzcv, dlVar, this.e.f7162b, z, m17087a(dlVar.f15985q.f15644d));
            }
            if (!(dlVar.f15982n == null || dlVar.f15982n.f15628g == null)) {
                ar.m8665v();
                arp.a(this.e.f7163c, this.e.f7165e.zzcv, dlVar, this.e.f7162b, z, dlVar.f15982n.f15628g);
            }
            dlVar.f15959D = true;
        }
    }

    /* renamed from: a */
    final boolean mo3742a(dl dlVar) {
        zzjj zzjj;
        boolean z = false;
        if (this.f != null) {
            zzjj = this.f;
            this.f = null;
        } else {
            zzjj = dlVar.f15969a;
            if (zzjj.extras != null) {
                z = zzjj.extras.getBoolean("_noRefresh", false);
            }
        }
        return mo4001a(zzjj, dlVar, z);
    }

    /* renamed from: a */
    protected boolean mo3743a(@Nullable dl dlVar, dl dlVar2) {
        int i;
        if (!(dlVar == null || dlVar.f15986r == null)) {
            dlVar.f15986r.a(null);
        }
        if (dlVar2.f15986r != null) {
            dlVar2.f15986r.a(this);
        }
        int i2 = 0;
        if (dlVar2.f15985q != null) {
            i2 = dlVar2.f15985q.f15657q;
            i = dlVar2.f15985q.f15658r;
        } else {
            i = 0;
        }
        this.e.f7150D.a(i2, i);
        return true;
    }

    /* renamed from: a */
    public final boolean m18139a(C4474r c4474r, amb amb) {
        this.a = amb;
        amb.a("seq_num", c4474r.f16487g);
        amb.a("request_id", c4474r.f16502v);
        amb.a("session_id", c4474r.f16488h);
        if (c4474r.f16486f != null) {
            amb.a("app_version", String.valueOf(c4474r.f16486f.versionCode));
        }
        as asVar = this.e;
        ar.m8644a();
        Context context = this.e.f7163c;
        ahz ahz = this.h.f7215d;
        dy aeVar = c4474r.f16482b.extras.getBundle("sdk_less_server_data") != null ? new ae(context, c4474r, this, ahz) : new awe(context, c4474r, this, ahz);
        aeVar.e();
        asVar.f7167g = aeVar;
        return true;
    }

    /* renamed from: a */
    public boolean mo3744a(zzjj zzjj, amb amb) {
        return m18141a(zzjj, amb, 1);
    }

    /* renamed from: a */
    public final boolean m18141a(zzjj zzjj, amb amb, int i) {
        if (!mo4036o()) {
            return false;
        }
        dp r;
        ar.m8648e();
        ags a = ar.m8652i().a(this.e.f7163c);
        String str = null;
        Bundle a2 = a == null ? null : fk.a(a);
        this.d.m8625a();
        this.e.f7152F = 0;
        if (((Boolean) aja.f().a(alo.cc)).booleanValue()) {
            r = ar.m8652i().r();
            C2371d l = ar.m8655l();
            Context context = this.e.f7163c;
            zzakd zzakd = this.e.f7165e;
            String str2 = this.e.f7162b;
            if (r != null) {
                str = r.d();
            }
            l.m8693a(context, zzakd, false, r, str, str2, null);
        } else {
            r = null;
        }
        return m18139a(m18134a(zzjj, a2, r, i), amb);
    }

    /* renamed from: a */
    protected boolean mo4001a(zzjj zzjj, dl dlVar, boolean z) {
        if (!z && this.e.m8677d()) {
            ai aiVar;
            long j;
            if (dlVar.f15976h > 0) {
                aiVar = this.d;
                j = dlVar.f15976h;
            } else if (dlVar.f15985q != null && dlVar.f15985q.f15649i > 0) {
                aiVar = this.d;
                j = dlVar.f15985q.f15649i;
            } else if (!dlVar.f15981m && dlVar.f15972d == 2) {
                this.d.m8629b(zzjj);
            }
            aiVar.m8627a(zzjj, j);
        }
        return this.d.m8631d();
    }

    /* renamed from: b */
    protected final boolean mo3745b(zzjj zzjj) {
        return super.mo3745b(zzjj) && !this.f14559j;
    }

    @Nullable
    public final String getMediationAdapterClassName() {
        return this.e.f7170j == null ? null : this.e.f7170j.f15984p;
    }

    /* renamed from: o */
    protected boolean mo4036o() {
        ar.m8648e();
        if (fk.a(this.e.f7163c, this.e.f7163c.getPackageName(), "android.permission.INTERNET")) {
            ar.m8648e();
            if (fk.a(this.e.f7163c)) {
                return true;
            }
        }
        return false;
    }

    public void onAdClicked() {
        if (this.e.f7170j == null) {
            ec.e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.e.f7170j.f15985q == null || this.e.f7170j.f15985q.f15643c == null)) {
            ar.m8665v();
            arp.a(this.e.f7163c, this.e.f7165e.zzcv, this.e.f7170j, this.e.f7162b, false, m17087a(this.e.f7170j.f15985q.f15643c));
        }
        if (!(this.e.f7170j.f15982n == null || this.e.f7170j.f15982n.f15627f == null)) {
            ar.m8665v();
            arp.a(this.e.f7163c, this.e.f7165e.zzcv, this.e.f7170j, this.e.f7162b, false, this.e.f7170j.f15982n.f15627f);
        }
        super.onAdClicked();
    }

    public final void onPause() {
        this.g.c(this.e.f7170j);
    }

    public final void onResume() {
        this.g.d(this.e.f7170j);
    }

    public void pause() {
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
        r2 = this;
        r0 = "pause must be called on the main UI thread.";
        com.google.android.gms.common.internal.ad.m9053b(r0);
        r0 = r2.e;
        r0 = r0.f7170j;
        if (r0 == 0) goto L_0x0027;
    L_0x000b:
        r0 = r2.e;
        r0 = r0.f7170j;
        r0 = r0.f15970b;
        if (r0 == 0) goto L_0x0027;
    L_0x0013:
        r0 = r2.e;
        r0 = r0.m8677d();
        if (r0 == 0) goto L_0x0027;
    L_0x001b:
        com.google.android.gms.ads.internal.ar.m8650g();
        r0 = r2.e;
        r0 = r0.f7170j;
        r0 = r0.f15970b;
        com.google.android.gms.internal.fq.a(r0);
    L_0x0027:
        r0 = r2.e;
        r0 = r0.f7170j;
        if (r0 == 0) goto L_0x0044;
    L_0x002d:
        r0 = r2.e;
        r0 = r0.f7170j;
        r0 = r0.f15983o;
        if (r0 == 0) goto L_0x0044;
    L_0x0035:
        r0 = r2.e;	 Catch:{ RemoteException -> 0x003f }
        r0 = r0.f7170j;	 Catch:{ RemoteException -> 0x003f }
        r0 = r0.f15983o;	 Catch:{ RemoteException -> 0x003f }
        r0.pause();	 Catch:{ RemoteException -> 0x003f }
        goto L_0x0044;
    L_0x003f:
        r0 = "Could not pause mediation adapter.";
        com.google.android.gms.internal.ec.e(r0);
    L_0x0044:
        r0 = r2.g;
        r1 = r2.e;
        r1 = r1.f7170j;
        r0.c(r1);
        r0 = r2.d;
        r0.m8628b();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.av.pause():void");
    }

    public final void recordImpression() {
        mo4035a(this.e.f7170j, false);
    }

    public void resume() {
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
        r2 = this;
        r0 = "resume must be called on the main UI thread.";
        com.google.android.gms.common.internal.ad.m9053b(r0);
        r0 = r2.e;
        r0 = r0.f7170j;
        if (r0 == 0) goto L_0x001a;
    L_0x000b:
        r0 = r2.e;
        r0 = r0.f7170j;
        r0 = r0.f15970b;
        if (r0 == 0) goto L_0x001a;
    L_0x0013:
        r0 = r2.e;
        r0 = r0.f7170j;
        r0 = r0.f15970b;
        goto L_0x001b;
    L_0x001a:
        r0 = 0;
    L_0x001b:
        if (r0 == 0) goto L_0x0031;
    L_0x001d:
        r1 = r2.e;
        r1 = r1.m8677d();
        if (r1 == 0) goto L_0x0031;
    L_0x0025:
        com.google.android.gms.ads.internal.ar.m8650g();
        r1 = r2.e;
        r1 = r1.f7170j;
        r1 = r1.f15970b;
        com.google.android.gms.internal.fq.b(r1);
    L_0x0031:
        r1 = r2.e;
        r1 = r1.f7170j;
        if (r1 == 0) goto L_0x004e;
    L_0x0037:
        r1 = r2.e;
        r1 = r1.f7170j;
        r1 = r1.f15983o;
        if (r1 == 0) goto L_0x004e;
    L_0x003f:
        r1 = r2.e;	 Catch:{ RemoteException -> 0x0049 }
        r1 = r1.f7170j;	 Catch:{ RemoteException -> 0x0049 }
        r1 = r1.f15983o;	 Catch:{ RemoteException -> 0x0049 }
        r1.resume();	 Catch:{ RemoteException -> 0x0049 }
        goto L_0x004e;
    L_0x0049:
        r1 = "Could not resume mediation adapter.";
        com.google.android.gms.internal.ec.e(r1);
    L_0x004e:
        if (r0 == 0) goto L_0x0056;
    L_0x0050:
        r0 = r0.zztf();
        if (r0 != 0) goto L_0x005b;
    L_0x0056:
        r0 = r2.d;
        r0.m8630c();
    L_0x005b:
        r0 = r2.g;
        r1 = r2.e;
        r1 = r1.f7170j;
        r0.d(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.av.resume():void");
    }

    public void showInterstitial() {
        ec.e("showInterstitial is not supported for current ad type");
    }

    public final void zza(zzqm zzqm, String str) {
        zzqw zzqw = null;
        if (zzqm != null) {
            try {
                Object customTemplateId = zzqm.getCustomTemplateId();
            } catch (Throwable e) {
                ec.c("Unable to call onCustomClick.", e);
                return;
            }
        }
        customTemplateId = null;
        if (!(this.e.f7179s == null || customTemplateId == null)) {
            zzqw = (zzqw) this.e.f7179s.get(customTemplateId);
        }
        if (zzqw == null) {
            ec.e("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            zzqw.zzb(zzqm, str);
        }
    }

    public final void zzb(dl dlVar) {
        super.zzb(dlVar);
        if (dlVar.f15982n != null) {
            ec.b("Disable the debug gesture detector on the mediation ad frame.");
            if (this.e.f7166f != null) {
                this.e.f7166f.m8683d();
            }
            ec.b("Pinging network fill URLs.");
            ar.m8665v();
            arp.a(this.e.f7163c, this.e.f7165e.zzcv, dlVar, this.e.f7162b, false, dlVar.f15982n.f15630i);
            if (!(dlVar.f15985q == null || dlVar.f15985q.f15646f == null || dlVar.f15985q.f15646f.size() <= 0)) {
                ec.b("Pinging urls remotely");
                ar.m8648e().a(this.e.f7163c, dlVar.f15985q.f15646f);
            }
        } else {
            ec.b("Enable the debug gesture detector on the admob ad frame.");
            if (this.e.f7166f != null) {
                this.e.f7166f.m8682c();
            }
        }
        if (dlVar.f15972d == 3 && dlVar.f15985q != null && dlVar.f15985q.f15645e != null) {
            ec.b("Pinging no fill URLs.");
            ar.m8665v();
            arp.a(this.e.f7163c, this.e.f7165e.zzcv, dlVar, this.e.f7162b, false, dlVar.f15985q.f15645e);
        }
    }

    public final void zzc(String str, String str2) {
        onAppEvent(str, str2);
    }

    public void zzcg() {
        this.f14559j = false;
        mo4037b();
        this.e.f7172l.c();
    }

    public void zzch() {
        this.f14559j = true;
        m17101d();
    }

    public void zzci() {
        ec.e("Mediated ad does not support onVideoEnd callback");
    }

    public void zzcj() {
        onAdClicked();
    }

    public final void zzck() {
        zzcg();
    }

    public final void zzcl() {
        m17100c();
    }

    public final void zzcm() {
        zzch();
    }

    public final void zzcn() {
        if (this.e.f7170j != null) {
            String str = this.e.f7170j.f15984p;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 74);
            stringBuilder.append("Mediation adapter ");
            stringBuilder.append(str);
            stringBuilder.append(" refreshed, but mediation adapters should never refresh.");
            ec.e(stringBuilder.toString());
        }
        mo4035a(this.e.f7170j, true);
        mo4002e();
    }

    public void zzco() {
        recordImpression();
    }

    @Nullable
    public final String zzcp() {
        return this.e.f7170j == null ? null : m18135b(this.e.f7170j);
    }

    public final void zzcq() {
        ar.m8648e();
        fk.a(new ay(this));
    }

    public final void zzcr() {
        ar.m8648e();
        fk.a(new az(this));
    }
}
