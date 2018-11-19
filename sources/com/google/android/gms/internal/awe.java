package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.internal.zziu.zza.zzb;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

@zzzv
public final class awe extends dy implements zzaal {
    /* renamed from: a */
    zzaif f26840a;
    /* renamed from: b */
    private final zzzx f26841b;
    /* renamed from: c */
    private final C4474r f26842c;
    /* renamed from: d */
    private final Object f26843d = new Object();
    /* renamed from: e */
    private final Context f26844e;
    /* renamed from: f */
    private final ahw f26845f;
    /* renamed from: g */
    private final ahz f26846g;
    /* renamed from: h */
    private zzaat f26847h;
    /* renamed from: i */
    private Runnable f26848i;
    /* renamed from: j */
    private zzaax f26849j;
    /* renamed from: k */
    private arj f26850k;

    public awe(Context context, C4474r c4474r, zzzx zzzx, ahz ahz) {
        ahw ahw;
        zzit zzit;
        this.f26841b = zzzx;
        this.f26844e = context;
        this.f26842c = c4474r;
        this.f26846g = ahz;
        this.f26845f = new ahw(this.f26846g, ((Boolean) aja.m19221f().m19334a(alo.cJ)).booleanValue());
        this.f26845f.m19188a(new awf(this));
        aig aig = new aig();
        aig.f26652a = Integer.valueOf(this.f26842c.f16490j.zzdej);
        aig.f26653b = Integer.valueOf(this.f26842c.f16490j.zzdek);
        aig.f26654c = Integer.valueOf(this.f26842c.f16490j.zzdel ? 0 : 2);
        this.f26845f.m19188a(new C6258a(aig));
        if (this.f26842c.f16486f != null) {
            this.f26845f.m19188a(new C6262b(this));
        }
        zzjn zzjn = this.f26842c.f16483c;
        if (zzjn.zzbel && "interstitial_mb".equals(zzjn.zzbek)) {
            ahw = this.f26845f;
            zzit = C6263c.f23236a;
        } else if (zzjn.zzbel && "reward_mb".equals(zzjn.zzbek)) {
            ahw = this.f26845f;
            zzit = C6264d.f23255a;
        } else if (zzjn.zzben || zzjn.zzbel) {
            ahw = this.f26845f;
            zzit = C6266f.f23297a;
        } else {
            ahw = this.f26845f;
            zzit = C6265e.f23296a;
        }
        ahw.m19188a(zzit);
        this.f26845f.m19189a(zzb.AD_REQUEST);
    }

    /* renamed from: a */
    private final com.google.android.gms.internal.zzjn m31529a(com.google.android.gms.internal.zzaat r12) throws com.google.android.gms.internal.zzaai {
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
        r11 = this;
        r0 = r11.f26847h;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0018;
    L_0x0006:
        r0 = r11.f26847h;
        r0 = r0.zzaus;
        if (r0 == 0) goto L_0x0018;
    L_0x000c:
        r0 = r11.f26847h;
        r0 = r0.zzaus;
        r0 = r0.size();
        if (r0 <= r1) goto L_0x0018;
    L_0x0016:
        r0 = 1;
        goto L_0x0019;
    L_0x0018:
        r0 = 0;
    L_0x0019:
        if (r0 == 0) goto L_0x0027;
    L_0x001b:
        r0 = r11.f26850k;
        if (r0 == 0) goto L_0x0027;
    L_0x001f:
        r0 = r11.f26850k;
        r0 = r0.f15659s;
        if (r0 != 0) goto L_0x0027;
    L_0x0025:
        r12 = 0;
        return r12;
    L_0x0027:
        r0 = r11.f26849j;
        r0 = r0.zzbeo;
        if (r0 == 0) goto L_0x0048;
    L_0x002d:
        r0 = r12.zzauc;
        r0 = r0.zzbem;
        r3 = r0.length;
        r4 = 0;
    L_0x0033:
        if (r4 >= r3) goto L_0x0048;
    L_0x0035:
        r5 = r0[r4];
        r6 = r5.zzbeo;
        if (r6 == 0) goto L_0x0045;
    L_0x003b:
        r0 = new com.google.android.gms.internal.zzjn;
        r12 = r12.zzauc;
        r12 = r12.zzbem;
        r0.<init>(r5, r12);
        return r0;
    L_0x0045:
        r4 = r4 + 1;
        goto L_0x0033;
    L_0x0048:
        r0 = r11.f26849j;
        r0 = r0.zzcoz;
        if (r0 != 0) goto L_0x0056;
    L_0x004e:
        r12 = new com.google.android.gms.internal.zzaai;
        r0 = "The ad response must specify one of the supported ad sizes.";
        r12.<init>(r0, r2);
        throw r12;
    L_0x0056:
        r0 = r11.f26849j;
        r0 = r0.zzcoz;
        r3 = "x";
        r0 = r0.split(r3);
        r3 = r0.length;
        r4 = 2;
        if (r3 == r4) goto L_0x0085;
    L_0x0064:
        r12 = new com.google.android.gms.internal.zzaai;
        r0 = "Invalid ad size format from the ad response: ";
        r1 = r11.f26849j;
        r1 = r1.zzcoz;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x007b;
    L_0x0076:
        r0 = r0.concat(r1);
        goto L_0x0081;
    L_0x007b:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0081:
        r12.<init>(r0, r2);
        throw r12;
    L_0x0085:
        r3 = r0[r2];	 Catch:{ NumberFormatException -> 0x00f7 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x00f7 }
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x00f7 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x00f7 }
        r1 = r12.zzauc;
        r1 = r1.zzbem;
        r4 = r1.length;
        r5 = 0;
    L_0x0097:
        if (r5 >= r4) goto L_0x00d6;
    L_0x0099:
        r6 = r1[r5];
        r7 = r11.f26844e;
        r7 = r7.getResources();
        r7 = r7.getDisplayMetrics();
        r7 = r7.density;
        r8 = r6.width;
        r9 = -1;
        if (r8 != r9) goto L_0x00b2;
    L_0x00ac:
        r8 = r6.widthPixels;
        r8 = (float) r8;
        r8 = r8 / r7;
        r8 = (int) r8;
        goto L_0x00b4;
    L_0x00b2:
        r8 = r6.width;
    L_0x00b4:
        r9 = r6.height;
        r10 = -2;
        if (r9 != r10) goto L_0x00bf;
    L_0x00b9:
        r9 = r6.heightPixels;
        r9 = (float) r9;
        r9 = r9 / r7;
        r7 = (int) r9;
        goto L_0x00c1;
    L_0x00bf:
        r7 = r6.height;
    L_0x00c1:
        if (r3 != r8) goto L_0x00d3;
    L_0x00c3:
        if (r0 != r7) goto L_0x00d3;
    L_0x00c5:
        r7 = r6.zzbeo;
        if (r7 != 0) goto L_0x00d3;
    L_0x00c9:
        r0 = new com.google.android.gms.internal.zzjn;
        r12 = r12.zzauc;
        r12 = r12.zzbem;
        r0.<init>(r6, r12);
        return r0;
    L_0x00d3:
        r5 = r5 + 1;
        goto L_0x0097;
    L_0x00d6:
        r12 = new com.google.android.gms.internal.zzaai;
        r0 = "The ad size from the ad response was not one of the requested sizes: ";
        r1 = r11.f26849j;
        r1 = r1.zzcoz;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x00ed;
    L_0x00e8:
        r0 = r0.concat(r1);
        goto L_0x00f3;
    L_0x00ed:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x00f3:
        r12.<init>(r0, r2);
        throw r12;
    L_0x00f7:
        r12 = new com.google.android.gms.internal.zzaai;
        r0 = "Invalid ad size number from the ad response: ";
        r1 = r11.f26849j;
        r1 = r1.zzcoz;
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x010e;
    L_0x0109:
        r0 = r0.concat(r1);
        goto L_0x0114;
    L_0x010e:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0114:
        r12.<init>(r0, r2);
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.awe.a(com.google.android.gms.internal.zzaat):com.google.android.gms.internal.zzjn");
    }

    /* renamed from: a */
    private final void m31531a(int i, String str) {
        zzaat zzaat;
        awe awe = this;
        int i2 = i;
        if (i2 != 3) {
            if (i2 != -1) {
                hx.m19916e(str);
                awe.f26849j = awe.f26849j != null ? new zzaax(i2) : new zzaax(i2, awe.f26849j.zzcdq);
                if (awe.f26847h == null) {
                    zzaat = awe.f26847h;
                } else {
                    zzaat zzaat2 = new zzaat(awe.f26842c, -1, null, null, null);
                }
                awe.f26841b.zza(new dm(zzaat, awe.f26849j, awe.f26850k, null, i2, -1, awe.f26849j.zzcpa, null, awe.f26845f, null));
            }
        }
        hx.m19915d(str);
        if (awe.f26849j != null) {
        }
        awe.f26849j = awe.f26849j != null ? new zzaax(i2) : new zzaax(i2, awe.f26849j.zzcdq);
        if (awe.f26847h == null) {
            zzaat zzaat22 = new zzaat(awe.f26842c, -1, null, null, null);
        } else {
            zzaat = awe.f26847h;
        }
        awe.f26841b.zza(new dm(zzaat, awe.f26849j, awe.f26850k, null, i2, -1, awe.f26849j.zzcpa, null, awe.f26845f, null));
    }

    /* renamed from: a */
    final zzaif m31535a(zzakd zzakd, zzalh<zzaat> zzalh) {
        Context context = this.f26844e;
        if (new C6267j(context).mo4632a(zzakd)) {
            hx.m19911b("Fetching ad response from local ad request service.");
            zzaif c7358o = new C7358o(context, zzalh, this);
            c7358o.zznd();
            return c7358o;
        }
        hx.m19911b("Fetching ad response from remote ad request service.");
        aja.m19216a();
        if (hn.m19877c(context)) {
            return new C7359p(context, zzakd, zzalh, this);
        }
        hx.m19916e("Failed to connect to remote ad request service.");
        return null;
    }

    /* renamed from: a */
    public final void mo6837a() {
        hx.m19911b("AdLoaderBackgroundTask started.");
        this.f26848i = new C4469g(this);
        fk.f16060a.postDelayed(this.f26848i, ((Long) aja.m19221f().m19334a(alo.bm)).longValue());
        long elapsedRealtime = ar.k().elapsedRealtime();
        if (((Boolean) aja.m19221f().m19334a(alo.bk)).booleanValue() && this.f26842c.f16482b.extras != null) {
            String string = this.f26842c.f16482b.extras.getString("_ad");
            if (string != null) {
                this.f26847h = new zzaat(this.f26842c, elapsedRealtime, null, null, null);
                zza(au.m19492a(this.f26844e, this.f26847h, string));
                return;
            }
        }
        zzalh izVar = new iz();
        fe.m19676a(new C4470h(this, izVar));
        String g = ar.z().m19609g(this.f26844e);
        String h = ar.z().m19610h(this.f26844e);
        String i = ar.z().m19611i(this.f26844e);
        ar.z().m19608f(this.f26844e, i);
        this.f26847h = new zzaat(this.f26842c, elapsedRealtime, g, h, i);
        izVar.zzk(this.f26847h);
    }

    /* renamed from: a */
    final /* synthetic */ void m31537a(aif aif) {
        aif.f26650c.f26646a = this.f26842c.f16486f.packageName;
    }

    /* renamed from: b */
    public final void mo6838b() {
        synchronized (this.f26843d) {
            if (this.f26840a != null) {
                this.f26840a.cancel();
            }
        }
    }

    /* renamed from: b */
    final /* synthetic */ void m31539b(aif aif) {
        aif.f26648a = this.f26842c.f16502v;
    }

    public final void zza(@NonNull zzaax zzaax) {
        String str;
        hx.m19911b("Received ad response.");
        this.f26849j = zzaax;
        long elapsedRealtime = ar.k().elapsedRealtime();
        synchronized (this.f26843d) {
            zzaif zzaif = null;
            this.f26840a = null;
        }
        ar.i().m27300b(this.f26844e, this.f26849j.zzcnz);
        if (((Boolean) aja.m19221f().m19334a(alo.aF)).booleanValue()) {
            SharedPreferences sharedPreferences;
            Set hashSet;
            Context context;
            Collection stringSet;
            if (this.f26849j.zzcol) {
                ar.i();
                context = this.f26844e;
                str = this.f26847h.zzatw;
                sharedPreferences = context.getSharedPreferences("admob", 0);
                stringSet = sharedPreferences.getStringSet("never_pool_slots", Collections.emptySet());
                if (!stringSet.contains(str)) {
                    hashSet = new HashSet(stringSet);
                    hashSet.add(str);
                }
            } else {
                ar.i();
                context = this.f26844e;
                str = this.f26847h.zzatw;
                sharedPreferences = context.getSharedPreferences("admob", 0);
                stringSet = sharedPreferences.getStringSet("never_pool_slots", Collections.emptySet());
                if (stringSet.contains(str)) {
                    hashSet = new HashSet(stringSet);
                    hashSet.remove(str);
                }
            }
            Editor edit = sharedPreferences.edit();
            edit.putStringSet("never_pool_slots", hashSet);
            edit.apply();
        }
        try {
            if (this.f26849j.errorCode == -2 || this.f26849j.errorCode == -3) {
                JSONObject jSONObject;
                Boolean valueOf;
                if (this.f26849j.errorCode != -3) {
                    if (TextUtils.isEmpty(this.f26849j.body)) {
                        throw new zzaai("No fill from ad server.", 3);
                    }
                    ar.i().m27290a(this.f26844e, this.f26849j.zzcnl);
                    if (this.f26849j.zzcow) {
                        this.f26850k = new arj(this.f26849j.body);
                        ar.i().m27305c(this.f26850k.f15647g);
                    } else {
                        ar.i().m27305c(this.f26849j.zzcdo);
                    }
                    if (!TextUtils.isEmpty(this.f26849j.zzcoa)) {
                        if (((Boolean) aja.m19221f().m19334a(alo.cm)).booleanValue()) {
                            hx.m19911b("Received cookie from server. Setting webview cookie in CookieManager.");
                            CookieManager c = ar.g().mo8493c(this.f26844e);
                            if (c != null) {
                                c.setCookie("googleads.g.doubleclick.net", this.f26849j.zzcoa);
                            }
                        }
                    }
                }
                zzjn a = this.f26847h.zzauc.zzbem != null ? m31529a(this.f26847h) : null;
                ar.i().m27298a(this.f26849j.zzcpg);
                ar.i().m27302b(this.f26849j.zzcpt);
                if (!TextUtils.isEmpty(this.f26849j.zzcpe)) {
                    try {
                        jSONObject = new JSONObject(this.f26849j.zzcpe);
                    } catch (Throwable e) {
                        hx.m19912b("Error parsing the JSON for Active View.", e);
                    }
                    if (this.f26849j.zzcpv == 2) {
                        zzaif = Boolean.valueOf(true);
                        ar.e();
                        fk.m19699a(this.f26847h.zzcnd, true);
                    }
                    if (this.f26849j.zzcpv == 1) {
                        zzaif = Boolean.valueOf(false);
                    }
                    if (this.f26849j.zzcpv != 0) {
                        ar.e();
                        valueOf = Boolean.valueOf(fk.m19708a(this.f26847h.zzcnd));
                    } else {
                        valueOf = zzaif;
                    }
                    this.f26841b.zza(new dm(this.f26847h, this.f26849j, this.f26850k, a, -2, elapsedRealtime, this.f26849j.zzcpa, jSONObject, this.f26845f, valueOf));
                    fk.f16060a.removeCallbacks(this.f26848i);
                    return;
                }
                jSONObject = null;
                if (this.f26849j.zzcpv == 2) {
                    zzaif = Boolean.valueOf(true);
                    ar.e();
                    fk.m19699a(this.f26847h.zzcnd, true);
                }
                if (this.f26849j.zzcpv == 1) {
                    zzaif = Boolean.valueOf(false);
                }
                if (this.f26849j.zzcpv != 0) {
                    valueOf = zzaif;
                } else {
                    ar.e();
                    valueOf = Boolean.valueOf(fk.m19708a(this.f26847h.zzcnd));
                }
                this.f26841b.zza(new dm(this.f26847h, this.f26849j, this.f26850k, a, -2, elapsedRealtime, this.f26849j.zzcpa, jSONObject, this.f26845f, valueOf));
                fk.f16060a.removeCallbacks(this.f26848i);
                return;
            }
            int i = this.f26849j.errorCode;
            StringBuilder stringBuilder = new StringBuilder(66);
            stringBuilder.append("There was a problem getting an ad response. ErrorCode: ");
            stringBuilder.append(i);
            throw new zzaai(stringBuilder.toString(), this.f26849j.errorCode);
        } catch (Throwable e2) {
            hx.m19912b("Could not parse mediation config.", e2);
            String str2 = "Could not parse mediation config: ";
            str = String.valueOf(this.f26849j.body);
            throw new zzaai(str.length() != 0 ? str2.concat(str) : new String(str2), 0);
        } catch (zzaai e3) {
            m31531a(e3.m20295a(), e3.getMessage());
        }
    }
}
