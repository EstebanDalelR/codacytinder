package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.as;
import com.google.android.gms.ads.internal.av;
import com.google.android.gms.ads.internal.bn;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.dynamic.C4296b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@zzzv
public final class bp extends av implements zzaef {
    /* renamed from: j */
    private static bp f29168j;
    /* renamed from: k */
    private static final arv f29169k = new arv();
    /* renamed from: l */
    private final Map<String, cp> f29170l = new HashMap();
    /* renamed from: m */
    private boolean f29171m;
    /* renamed from: n */
    private boolean f29172n;
    /* renamed from: o */
    private dd f29173o;

    public bp(Context context, bn bnVar, zzjn zzjn, zzux zzux, zzakd zzakd) {
        super(context, zzjn, null, zzux, zzakd, bnVar);
        f29168j = this;
        this.f29173o = new dd(context, null);
    }

    /* renamed from: a */
    private static dm m34568a(dm dmVar) {
        dm dmVar2 = dmVar;
        ec.m27332a("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            String jSONObject = au.m19497a(dmVar2.f15996b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, dmVar2.f15995a.zzatw);
            ari ari = new ari(jSONObject, null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1);
            arj arj = new arj(Arrays.asList(new ari[]{ari}), ((Long) aja.m19221f().m19334a(alo.bn)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false);
            return new dm(dmVar2.f15995a, dmVar2.f15996b, arj, dmVar2.f15998d, dmVar2.f15999e, dmVar2.f16000f, dmVar2.f16001g, dmVar2.f16002h, dmVar2.f16003i, null);
        } catch (Throwable e) {
            hx.m19912b("Unable to generate ad state for non-mediated rewarded video.", e);
            return new dm(dmVar2.f15995a, dmVar2.f15996b, null, dmVar2.f15998d, 0, dmVar2.f16000f, dmVar2.f16001g, dmVar2.f16002h, dmVar2.f16003i, null);
        }
    }

    /* renamed from: g */
    public static bp m34570g() {
        return f29168j;
    }

    @Nullable
    /* renamed from: a */
    public final cp m34571a(String str) {
        Throwable e;
        String str2;
        cp cpVar = (cp) this.f29170l.get(str);
        if (cpVar == null) {
            try {
                zzux zzux = this.i;
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    zzux = f29169k;
                }
                cp cpVar2 = new cp(zzux.zzbg(str), this);
                try {
                    this.f29170l.put(str, cpVar2);
                    return cpVar2;
                } catch (Exception e2) {
                    e = e2;
                    cpVar = cpVar2;
                    str2 = "Fail to instantiate adapter ";
                    str = String.valueOf(str);
                    hx.m19914c(str.length() == 0 ? new String(str2) : str2.concat(str), e);
                    return cpVar;
                }
            } catch (Exception e3) {
                e = e3;
                str2 = "Fail to instantiate adapter ";
                str = String.valueOf(str);
                if (str.length() == 0) {
                }
                hx.m19914c(str.length() == 0 ? new String(str2) : str2.concat(str), e);
                return cpVar;
            }
        }
        return cpVar;
    }

    /* renamed from: a */
    public final void m34572a(@NonNull Context context) {
        for (cp a : this.f29170l.values()) {
            try {
                a.m19581a().zzg(C4296b.a(context));
            } catch (Throwable e) {
                hx.m19912b("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    /* renamed from: a */
    public final void m34573a(dm dmVar, amb amb) {
        if (dmVar.f15999e != -2) {
            fk.f16060a.post(new br(this, dmVar));
            return;
        }
        this.e.f7171k = dmVar;
        if (dmVar.f15997c == null) {
            this.e.f7171k = m34568a(dmVar);
        }
        this.e.f7152F = 0;
        as asVar = this.e;
        ar.d();
        zzaif cmVar = new cm(this.e.f7163c, this.e.f7171k, this);
        String str = "AdRenderer: ";
        String valueOf = String.valueOf(cmVar.getClass().getName());
        hx.m19911b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        cmVar.zznd();
        asVar.f7168h = cmVar;
    }

    /* renamed from: a */
    public final void m34574a(zzadv zzadv) {
        ad.b("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzadv.zzatw)) {
            hx.m19916e("Invalid ad unit id. Aborting.");
            fk.f16060a.post(new bq(this));
            return;
        }
        this.f29171m = false;
        this.e.f7162b = zzadv.zzatw;
        this.f29173o.m27280a(zzadv.zzatw);
        super.zzb(zzadv.zzcnd);
    }

    /* renamed from: a */
    public final boolean m34575a(dl dlVar, dl dlVar2) {
        return true;
    }

    /* renamed from: a */
    protected final boolean m34576a(zzjj zzjj, dl dlVar, boolean z) {
        return false;
    }

    /* renamed from: b */
    protected final void m34577b() {
        this.e.f7170j = null;
        super.b();
    }

    public final void destroy() {
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
        r0 = "destroy must be called on the main UI thread.";
        com.google.android.gms.common.internal.ad.b(r0);
        r0 = r4.f29170l;
        r0 = r0.keySet();
        r0 = r0.iterator();
    L_0x000f:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x004d;
    L_0x0015:
        r1 = r0.next();
        r1 = (java.lang.String) r1;
        r2 = r4.f29170l;	 Catch:{ RemoteException -> 0x0033 }
        r2 = r2.get(r1);	 Catch:{ RemoteException -> 0x0033 }
        r2 = (com.google.android.gms.internal.cp) r2;	 Catch:{ RemoteException -> 0x0033 }
        if (r2 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x0025:
        r3 = r2.m19581a();	 Catch:{ RemoteException -> 0x0033 }
        if (r3 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x002b:
        r2 = r2.m19581a();	 Catch:{ RemoteException -> 0x0033 }
        r2.destroy();	 Catch:{ RemoteException -> 0x0033 }
        goto L_0x000f;
    L_0x0033:
        r2 = "Fail to destroy adapter: ";
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0044;
    L_0x003f:
        r1 = r2.concat(r1);
        goto L_0x0049;
    L_0x0044:
        r1 = new java.lang.String;
        r1.<init>(r2);
    L_0x0049:
        com.google.android.gms.internal.hx.m19916e(r1);
        goto L_0x000f;
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bp.destroy():void");
    }

    /* renamed from: h */
    public final void m34578h() {
        ad.b("showAd must be called on the main UI thread.");
        if (m34579i()) {
            this.f29171m = true;
            cp a = m34571a(this.e.f7170j.f15984p);
            if (!(a == null || a.m19581a() == null)) {
                try {
                    a.m19581a().setImmersiveMode(this.f29172n);
                    a.m19581a().showVideo();
                    return;
                } catch (Throwable e) {
                    hx.m19914c("Could not call showVideo.", e);
                }
            }
            return;
        }
        hx.m19916e("The reward video has not loaded.");
    }

    /* renamed from: i */
    public final boolean m34579i() {
        ad.b("isLoaded must be called on the main UI thread.");
        return this.e.f7167g == null && this.e.f7168h == null && this.e.f7170j != null && !this.f29171m;
    }

    public final void onRewardedVideoAdClosed() {
        if (ar.z().m19606e(this.e.f7163c)) {
            this.f29173o.m27281a(false);
        }
        b();
    }

    public final void onRewardedVideoAdLeftApplication() {
        c();
    }

    public final void onRewardedVideoAdOpened() {
        if (ar.z().m19606e(this.e.f7163c)) {
            this.f29173o.m27281a(true);
        }
        a(this.e.f7170j, false);
        d();
    }

    public final void onRewardedVideoStarted() {
        if (!(this.e.f7170j == null || this.e.f7170j.f15982n == null)) {
            ar.v();
            arp.m19462a(this.e.f7163c, this.e.f7165e.zzcv, this.e.f7170j, this.e.f7162b, false, this.e.f7170j.f15982n.f15632k);
        }
        f();
    }

    public final void pause() {
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
        r0 = "pause must be called on the main UI thread.";
        com.google.android.gms.common.internal.ad.b(r0);
        r0 = r4.f29170l;
        r0 = r0.keySet();
        r0 = r0.iterator();
    L_0x000f:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x004d;
    L_0x0015:
        r1 = r0.next();
        r1 = (java.lang.String) r1;
        r2 = r4.f29170l;	 Catch:{ RemoteException -> 0x0033 }
        r2 = r2.get(r1);	 Catch:{ RemoteException -> 0x0033 }
        r2 = (com.google.android.gms.internal.cp) r2;	 Catch:{ RemoteException -> 0x0033 }
        if (r2 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x0025:
        r3 = r2.m19581a();	 Catch:{ RemoteException -> 0x0033 }
        if (r3 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x002b:
        r2 = r2.m19581a();	 Catch:{ RemoteException -> 0x0033 }
        r2.pause();	 Catch:{ RemoteException -> 0x0033 }
        goto L_0x000f;
    L_0x0033:
        r2 = "Fail to pause adapter: ";
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0044;
    L_0x003f:
        r1 = r2.concat(r1);
        goto L_0x0049;
    L_0x0044:
        r1 = new java.lang.String;
        r1.<init>(r2);
    L_0x0049:
        com.google.android.gms.internal.hx.m19916e(r1);
        goto L_0x000f;
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bp.pause():void");
    }

    public final void resume() {
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
        r0 = "resume must be called on the main UI thread.";
        com.google.android.gms.common.internal.ad.b(r0);
        r0 = r4.f29170l;
        r0 = r0.keySet();
        r0 = r0.iterator();
    L_0x000f:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x004d;
    L_0x0015:
        r1 = r0.next();
        r1 = (java.lang.String) r1;
        r2 = r4.f29170l;	 Catch:{ RemoteException -> 0x0033 }
        r2 = r2.get(r1);	 Catch:{ RemoteException -> 0x0033 }
        r2 = (com.google.android.gms.internal.cp) r2;	 Catch:{ RemoteException -> 0x0033 }
        if (r2 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x0025:
        r3 = r2.m19581a();	 Catch:{ RemoteException -> 0x0033 }
        if (r3 == 0) goto L_0x000f;	 Catch:{ RemoteException -> 0x0033 }
    L_0x002b:
        r2 = r2.m19581a();	 Catch:{ RemoteException -> 0x0033 }
        r2.resume();	 Catch:{ RemoteException -> 0x0033 }
        goto L_0x000f;
    L_0x0033:
        r2 = "Fail to resume adapter: ";
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0044;
    L_0x003f:
        r1 = r2.concat(r1);
        goto L_0x0049;
    L_0x0044:
        r1 = new java.lang.String;
        r1.<init>(r2);
    L_0x0049:
        com.google.android.gms.internal.hx.m19916e(r1);
        goto L_0x000f;
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bp.resume():void");
    }

    public final void setImmersiveMode(boolean z) {
        ad.b("setImmersiveMode must be called on the main UI thread.");
        this.f29172n = z;
    }

    public final void zzc(@Nullable zzaeq zzaeq) {
        if (!(this.e.f7170j == null || this.e.f7170j.f15985q == null || TextUtils.isEmpty(this.e.f7170j.f15985q.f15650j))) {
            zzaeq = new zzaeq(this.e.f7170j.f15985q.f15650j, this.e.f7170j.f15985q.f15651k);
        }
        if (!(this.e.f7170j == null || this.e.f7170j.f15982n == null)) {
            ar.v();
            arp.m19463a(this.e.f7163c, this.e.f7165e.zzcv, this.e.f7170j.f15982n.f15633l, this.e.f7148B, zzaeq);
        }
        if (ar.z().m19606e(this.e.f7163c) && zzaeq != null) {
            ar.z().m19597a(this.e.f7163c, ar.z().m19611i(this.e.f7163c), this.e.f7162b, zzaeq.type, zzaeq.zzcwd);
        }
        a(zzaeq);
    }

    public final void zzoc() {
        onAdClicked();
    }
}
