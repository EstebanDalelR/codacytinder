package com.google.android.gms.internal;

import android.content.Context;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.C2350a;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.dynamic.C4296b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@zzzv
public final class arl implements zzup {
    /* renamed from: a */
    private final String f23060a;
    /* renamed from: b */
    private final zzux f23061b;
    /* renamed from: c */
    private final long f23062c;
    /* renamed from: d */
    private final arj f23063d;
    /* renamed from: e */
    private final ari f23064e;
    /* renamed from: f */
    private zzjj f23065f;
    /* renamed from: g */
    private final zzjn f23066g;
    /* renamed from: h */
    private final Context f23067h;
    /* renamed from: i */
    private final Object f23068i = new Object();
    /* renamed from: j */
    private final zzakd f23069j;
    /* renamed from: k */
    private final boolean f23070k;
    /* renamed from: l */
    private final zzpe f23071l;
    /* renamed from: m */
    private final List<String> f23072m;
    /* renamed from: n */
    private final List<String> f23073n;
    /* renamed from: o */
    private final List<String> f23074o;
    /* renamed from: p */
    private final boolean f23075p;
    /* renamed from: q */
    private final boolean f23076q;
    /* renamed from: r */
    private zzva f23077r;
    /* renamed from: s */
    private int f23078s = -2;
    /* renamed from: t */
    private zzvg f23079t;

    public arl(Context context, String str, zzux zzux, arj arj, ari ari, zzjj zzjj, zzjn zzjn, zzakd zzakd, boolean z, boolean z2, zzpe zzpe, List<String> list, List<String> list2, List<String> list3, boolean z3) {
        String str2 = str;
        arj arj2 = arj;
        ari ari2 = ari;
        this.f23067h = context;
        this.f23061b = zzux;
        this.f23064e = ari2;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str2)) {
            str2 = m27214b();
        }
        r0.f23060a = str2;
        r0.f23063d = arj2;
        long j = ari2.f15639r != -1 ? ari2.f15639r : arj2.f15642b != -1 ? arj2.f15642b : 10000;
        r0.f23062c = j;
        r0.f23065f = zzjj;
        r0.f23066g = zzjn;
        r0.f23069j = zzakd;
        r0.f23070k = z;
        r0.f23075p = z2;
        r0.f23071l = zzpe;
        r0.f23072m = list;
        r0.f23073n = list2;
        r0.f23074o = list3;
        r0.f23076q = z3;
    }

    /* renamed from: a */
    private static zzva m27204a(MediationAdapter mediationAdapter) {
        return new asl(mediationAdapter);
    }

    /* renamed from: a */
    private final java.lang.String m27207a(java.lang.String r3) {
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
        if (r3 == 0) goto L_0x0024;
    L_0x0002:
        r0 = r2.m27219e();
        if (r0 == 0) goto L_0x0024;
    L_0x0008:
        r0 = 2;
        r0 = r2.m27210a(r0);
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        return r3;
    L_0x0010:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x001f }
        r0.<init>(r3);	 Catch:{ JSONException -> 0x001f }
        r1 = "cpm_floor_cents";	 Catch:{ JSONException -> 0x001f }
        r0.remove(r1);	 Catch:{ JSONException -> 0x001f }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x001f }
        return r0;
    L_0x001f:
        r0 = "Could not remove field. Returning the original value";
        com.google.android.gms.internal.hx.m19916e(r0);
    L_0x0024:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.arl.a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private final void m27208a(ark ark) {
        String a = m27207a(this.f23064e.f15631j);
        try {
            if (this.f23069j.zzdek >= 4100000) {
                if (!this.f23070k) {
                    if (!this.f23064e.m19458b()) {
                        if (this.f23066g.zzbel) {
                            this.f23077r.zza(C4296b.a(this.f23067h), this.f23065f, a, this.f23064e.f15622a, (zzvd) ark);
                            return;
                        } else if (!this.f23075p) {
                            this.f23077r.zza(C4296b.a(this.f23067h), this.f23066g, this.f23065f, a, this.f23064e.f15622a, ark);
                            return;
                        } else if (this.f23064e.f15634m != null) {
                            this.f23077r.zza(C4296b.a(this.f23067h), this.f23065f, a, this.f23064e.f15622a, ark, new zzpe(m27213b(this.f23064e.f15638q)), this.f23064e.f15637p);
                            return;
                        } else {
                            this.f23077r.zza(C4296b.a(this.f23067h), this.f23066g, this.f23065f, a, this.f23064e.f15622a, ark);
                            return;
                        }
                    }
                }
                List arrayList = new ArrayList(this.f23072m);
                if (this.f23073n != null) {
                    for (String str : this.f23073n) {
                        String str2 = ":false";
                        if (this.f23074o != null && this.f23074o.contains(str)) {
                            str2 = ":true";
                        }
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length());
                        stringBuilder.append("custom:");
                        stringBuilder.append(str);
                        stringBuilder.append(str2);
                        arrayList.add(stringBuilder.toString());
                    }
                }
                this.f23077r.zza(C4296b.a(this.f23067h), this.f23065f, a, this.f23064e.f15622a, ark, this.f23071l, arrayList);
            } else if (this.f23066g.zzbel) {
                this.f23077r.zza(C4296b.a(this.f23067h), this.f23065f, a, ark);
            } else {
                this.f23077r.zza(C4296b.a(this.f23067h), this.f23066g, this.f23065f, a, (zzvd) ark);
            }
        } catch (Throwable e) {
            hx.m19914c("Could not request ad from mediation adapter.", e);
            zzv(5);
        }
    }

    /* renamed from: a */
    private final boolean m27210a(int r4) {
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
        r3 = this;
        r0 = 0;
        r1 = r3.f23070k;	 Catch:{ RemoteException -> 0x002d }
        if (r1 == 0) goto L_0x000c;	 Catch:{ RemoteException -> 0x002d }
    L_0x0005:
        r1 = r3.f23077r;	 Catch:{ RemoteException -> 0x002d }
        r1 = r1.zzmh();	 Catch:{ RemoteException -> 0x002d }
        goto L_0x001f;	 Catch:{ RemoteException -> 0x002d }
    L_0x000c:
        r1 = r3.f23066g;	 Catch:{ RemoteException -> 0x002d }
        r1 = r1.zzbel;	 Catch:{ RemoteException -> 0x002d }
        if (r1 == 0) goto L_0x0019;	 Catch:{ RemoteException -> 0x002d }
    L_0x0012:
        r1 = r3.f23077r;	 Catch:{ RemoteException -> 0x002d }
        r1 = r1.getInterstitialAdapterInfo();	 Catch:{ RemoteException -> 0x002d }
        goto L_0x001f;	 Catch:{ RemoteException -> 0x002d }
    L_0x0019:
        r1 = r3.f23077r;	 Catch:{ RemoteException -> 0x002d }
        r1 = r1.zzmg();	 Catch:{ RemoteException -> 0x002d }
    L_0x001f:
        if (r1 == 0) goto L_0x002c;
    L_0x0021:
        r2 = "capabilities";
        r1 = r1.getInt(r2, r0);
        r1 = r1 & r4;
        if (r1 != r4) goto L_0x002c;
    L_0x002a:
        r4 = 1;
        return r4;
    L_0x002c:
        return r0;
    L_0x002d:
        r4 = "Could not get adapter info. Returning false";
        com.google.android.gms.internal.hx.m19916e(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.arl.a(int):boolean");
    }

    /* renamed from: b */
    private static NativeAdOptions m27213b(String str) {
        C2350a c2350a = new C2350a();
        if (str == null) {
            return c2350a.a();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = 0;
            c2350a.b(jSONObject.optBoolean("multiple_images", false));
            c2350a.a(jSONObject.optBoolean("only_urls", false));
            str = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(str)) {
                i = 2;
            } else if ("portrait".equals(str)) {
                i = 1;
            } else if (!"any".equals(str)) {
                i = -1;
            }
            c2350a.a(i);
        } catch (Throwable e) {
            hx.m19914c("Exception occurred when creating native ad options", e);
        }
        return c2350a.a();
    }

    /* renamed from: b */
    private final java.lang.String m27214b() {
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
        r0 = r2.f23064e;	 Catch:{ RemoteException -> 0x001c }
        r0 = r0.f15626e;	 Catch:{ RemoteException -> 0x001c }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ RemoteException -> 0x001c }
        if (r0 != 0) goto L_0x0021;	 Catch:{ RemoteException -> 0x001c }
    L_0x000a:
        r0 = r2.f23061b;	 Catch:{ RemoteException -> 0x001c }
        r1 = r2.f23064e;	 Catch:{ RemoteException -> 0x001c }
        r1 = r1.f15626e;	 Catch:{ RemoteException -> 0x001c }
        r0 = r0.zzbh(r1);	 Catch:{ RemoteException -> 0x001c }
        if (r0 == 0) goto L_0x0019;	 Catch:{ RemoteException -> 0x001c }
    L_0x0016:
        r0 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";	 Catch:{ RemoteException -> 0x001c }
        return r0;	 Catch:{ RemoteException -> 0x001c }
    L_0x0019:
        r0 = "com.google.ads.mediation.customevent.CustomEventAdapter";	 Catch:{ RemoteException -> 0x001c }
        return r0;
    L_0x001c:
        r0 = "Fail to determine the custom event's version, assuming the old one.";
        com.google.android.gms.internal.hx.m19916e(r0);
    L_0x0021:
        r0 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.arl.b():java.lang.String");
    }

    /* renamed from: c */
    private final com.google.android.gms.internal.zzvg m27216c() {
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
        r0 = r2.f23078s;
        if (r0 != 0) goto L_0x0030;
    L_0x0004:
        r0 = r2.m27219e();
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0030;
    L_0x000b:
        r0 = 4;
        r0 = r2.m27210a(r0);	 Catch:{ RemoteException -> 0x0021 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ RemoteException -> 0x0021 }
    L_0x0012:
        r0 = r2.f23079t;	 Catch:{ RemoteException -> 0x0021 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ RemoteException -> 0x0021 }
    L_0x0016:
        r0 = r2.f23079t;	 Catch:{ RemoteException -> 0x0021 }
        r0 = r0.zzmc();	 Catch:{ RemoteException -> 0x0021 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ RemoteException -> 0x0021 }
    L_0x001e:
        r0 = r2.f23079t;	 Catch:{ RemoteException -> 0x0021 }
        return r0;
    L_0x0021:
        r0 = "Could not get cpm value from MediationResponseMetadata";
        com.google.android.gms.internal.hx.m19916e(r0);
    L_0x0026:
        r0 = r2.m27221f();
        r1 = new com.google.android.gms.internal.arn;
        r1.<init>(r0);
        return r1;
    L_0x0030:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.arl.c():com.google.android.gms.internal.zzvg");
    }

    /* renamed from: d */
    private final zzva m27217d() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.f23060a);
        hx.m19915d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (!(this.f23070k || this.f23064e.m19458b())) {
            if (((Boolean) aja.m19221f().m19334a(alo.bi)).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.f23060a)) {
                return m27204a(new AdMobAdapter());
            }
            if (((Boolean) aja.m19221f().m19334a(alo.bj)).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.f23060a)) {
                return m27204a(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f23060a)) {
                return new asl(new zzwl());
            }
        }
        try {
            return this.f23061b.zzbg(this.f23060a);
        } catch (Throwable e) {
            valueOf = "Could not instantiate mediation adapter: ";
            String valueOf2 = String.valueOf(this.f23060a);
            hx.m19909a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), e);
            return null;
        }
    }

    /* renamed from: e */
    private final boolean m27219e() {
        return this.f23063d.f15652l != -1;
    }

    /* renamed from: f */
    private final int m27221f() {
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
        r4 = this;
        r0 = r4.f23064e;
        r0 = r0.f15631j;
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x003a }
        r2 = r4.f23064e;	 Catch:{ JSONException -> 0x003a }
        r2 = r2.f15631j;	 Catch:{ JSONException -> 0x003a }
        r0.<init>(r2);	 Catch:{ JSONException -> 0x003a }
        r2 = "com.google.ads.mediation.admob.AdMobAdapter";
        r3 = r4.f23060a;
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0022;
    L_0x001b:
        r2 = "cpm_cents";
        r0 = r0.optInt(r2, r1);
        return r0;
    L_0x0022:
        r2 = 2;
        r2 = r4.m27210a(r2);
        if (r2 == 0) goto L_0x0030;
    L_0x0029:
        r2 = "cpm_floor_cents";
        r2 = r0.optInt(r2, r1);
        goto L_0x0031;
    L_0x0030:
        r2 = 0;
    L_0x0031:
        if (r2 != 0) goto L_0x0039;
    L_0x0033:
        r2 = "penalized_average_cpm_cents";
        r2 = r0.optInt(r2, r1);
    L_0x0039:
        return r2;
    L_0x003a:
        r0 = "Could not convert to json. Returning 0";
        com.google.android.gms.internal.hx.m19916e(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.arl.f():int");
    }

    /* renamed from: a */
    public final com.google.android.gms.internal.aro m27223a(long r20, long r22) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 16, insn: 0x006e: MOVE  (r3 ?[long, double]) = (r16 ?[long, double]), block:B:22:0x006e, method: com.google.android.gms.internal.arl.a(long, long):com.google.android.gms.internal.aro
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:168)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:132)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
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
        r19 = this;
        r1 = r19;
        r2 = r1.f23068i;
        monitor-enter(r2);
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0071 }
        r9 = new com.google.android.gms.internal.ark;	 Catch:{ all -> 0x0071 }
        r9.<init>();	 Catch:{ all -> 0x0071 }
        r5 = com.google.android.gms.internal.fk.f16060a;	 Catch:{ all -> 0x0071 }
        r6 = new com.google.android.gms.internal.arm;	 Catch:{ all -> 0x0071 }
        r6.<init>(r1, r9);	 Catch:{ all -> 0x0071 }
        r5.post(r6);	 Catch:{ all -> 0x0071 }
        r5 = r1.f23062c;	 Catch:{ all -> 0x0071 }
    L_0x001a:
        r7 = r1.f23078s;	 Catch:{ all -> 0x0071 }
        r8 = -2;	 Catch:{ all -> 0x0071 }
        if (r7 == r8) goto L_0x003e;	 Catch:{ all -> 0x0071 }
    L_0x001f:
        r5 = com.google.android.gms.ads.internal.ar.k();	 Catch:{ all -> 0x0071 }
        r5 = r5.elapsedRealtime();	 Catch:{ all -> 0x0071 }
        r7 = 0;	 Catch:{ all -> 0x0071 }
        r12 = r5 - r3;	 Catch:{ all -> 0x0071 }
        r3 = new com.google.android.gms.internal.aro;	 Catch:{ all -> 0x0071 }
        r6 = r1.f23064e;	 Catch:{ all -> 0x0071 }
        r7 = r1.f23077r;	 Catch:{ all -> 0x0071 }
        r8 = r1.f23060a;	 Catch:{ all -> 0x0071 }
        r10 = r1.f23078s;	 Catch:{ all -> 0x0071 }
        r11 = m27216c();	 Catch:{ all -> 0x0071 }
        r5 = r3;	 Catch:{ all -> 0x0071 }
        r5.<init>(r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x0071 }
        monitor-exit(r2);	 Catch:{ all -> 0x0071 }
        return r3;	 Catch:{ all -> 0x0071 }
    L_0x003e:
        r7 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0071 }
        r10 = 0;
        r10 = r7 - r3;
        r12 = r5 - r10;
        r14 = r7 - r20;
        r16 = r3;
        r3 = r22 - r14;
        r14 = 0;
        r18 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r18 <= 0) goto L_0x0066;
    L_0x0053:
        r18 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1));
        if (r18 > 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0066;
    L_0x0058:
        r14 = r1.f23068i;	 Catch:{ InterruptedException -> 0x0062 }
        r3 = java.lang.Math.min(r12, r3);	 Catch:{ InterruptedException -> 0x0062 }
        r14.wait(r3);	 Catch:{ InterruptedException -> 0x0062 }
        goto L_0x006e;
    L_0x0062:
        r3 = 5;
        r1.f23078s = r3;	 Catch:{ all -> 0x0071 }
        goto L_0x006e;	 Catch:{ all -> 0x0071 }
    L_0x0066:
        r3 = "Timed out waiting for adapter.";	 Catch:{ all -> 0x0071 }
        com.google.android.gms.internal.hx.m19915d(r3);	 Catch:{ all -> 0x0071 }
        r3 = 3;	 Catch:{ all -> 0x0071 }
        r1.f23078s = r3;	 Catch:{ all -> 0x0071 }
    L_0x006e:
        r3 = r16;	 Catch:{ all -> 0x0071 }
        goto L_0x001a;	 Catch:{ all -> 0x0071 }
    L_0x0071:
        r0 = move-exception;	 Catch:{ all -> 0x0071 }
        r3 = r0;	 Catch:{ all -> 0x0071 }
        monitor-exit(r2);	 Catch:{ all -> 0x0071 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.arl.a(long, long):com.google.android.gms.internal.aro");
    }

    /* renamed from: a */
    public final void m27224a() {
        synchronized (this.f23068i) {
            try {
                if (this.f23077r != null) {
                    this.f23077r.destroy();
                }
            } catch (Throwable e) {
                hx.m19914c("Could not destroy mediation adapter.", e);
            }
            this.f23078s = -1;
            this.f23068i.notify();
        }
    }

    public final void zza(int i, zzvg zzvg) {
        synchronized (this.f23068i) {
            this.f23078s = 0;
            this.f23079t = zzvg;
            this.f23068i.notify();
        }
    }

    public final void zzv(int i) {
        synchronized (this.f23068i) {
            this.f23078s = i;
            this.f23068i.notify();
        }
    }
}
