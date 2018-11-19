package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.util.C2521f;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.afd;
import com.google.android.gms.internal.ahw;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.ajm;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.alz;
import com.google.android.gms.internal.amb;
import com.google.android.gms.internal.bn;
import com.google.android.gms.internal.dh;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.dv;
import com.google.android.gms.internal.ea;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.mb;
import com.google.android.gms.internal.zzadp;
import com.google.android.gms.internal.zzaeq;
import com.google.android.gms.internal.zzafy;
import com.google.android.gms.internal.zziu.zza;
import com.google.android.gms.internal.zzje;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlr;
import com.google.android.gms.internal.zzmp;
import com.google.android.gms.internal.zzmr;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzxl;
import com.google.android.gms.internal.zzxr;
import com.google.android.gms.internal.zzyb;
import com.google.android.gms.internal.zzzv;
import com.google.android.gms.internal.zzzx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.a */
public abstract class C4269a extends ajm implements zzb, zzq, zzafy, zzje, zzyb, zzzx {
    /* renamed from: a */
    protected amb f13838a;
    /* renamed from: b */
    protected alz f13839b;
    /* renamed from: c */
    protected boolean f13840c = false;
    /* renamed from: d */
    protected final ai f13841d;
    /* renamed from: e */
    protected final as f13842e;
    @Nullable
    /* renamed from: f */
    protected transient zzjj f13843f;
    /* renamed from: g */
    protected final afd f13844g;
    /* renamed from: h */
    protected final bn f13845h;
    /* renamed from: i */
    private alz f13846i;

    C4269a(as asVar, @Nullable ai aiVar, bn bnVar) {
        this.f13842e = asVar;
        this.f13841d = new ai(this);
        this.f13845h = bnVar;
        ar.m8648e().b(this.f13842e.f7163c);
        ar.m8648e().c(this.f13842e.f7163c);
        ea.a(this.f13842e.f7163c);
        ar.m8640A().m8717a(this.f13842e.f7163c);
        ar.m8652i().a(this.f13842e.f7163c, this.f13842e.f7165e);
        ar.m8653j().a(this.f13842e.f7163c);
        this.f13844g = ar.m8652i().u();
        ar.m8651h().a(this.f13842e.f7163c);
        ar.m8642C().a(this.f13842e.f7163c);
        if (((Boolean) aja.f().a(alo.bX)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new C2410z(this, new CountDownLatch(((Integer) aja.f().a(alo.bZ)).intValue()), timer), 0, ((Long) aja.f().a(alo.bY)).longValue());
        }
    }

    /* renamed from: a */
    private static long m17084a(java.lang.String r3) {
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
        r0 = "ufe";
        r0 = r3.indexOf(r0);
        r1 = 44;
        r1 = r3.indexOf(r1, r0);
        r2 = -1;
        if (r1 != r2) goto L_0x0013;
    L_0x000f:
        r1 = r3.length();
    L_0x0013:
        r0 = r0 + 4;
        r3 = r3.substring(r0, r1);	 Catch:{ IndexOutOfBoundsException -> 0x0021, NumberFormatException -> 0x001e }
        r0 = java.lang.Long.parseLong(r3);	 Catch:{ IndexOutOfBoundsException -> 0x0021, NumberFormatException -> 0x001e }
        return r0;
    L_0x001e:
        r3 = "Cannot find valid format of Url fetch time in CSI latency info.";
        goto L_0x0023;
    L_0x0021:
        r3 = "Invalid index for Url fetch time in CSI latency info.";
    L_0x0023:
        com.google.android.gms.internal.ec.e(r3);
        r0 = -1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.a.a(java.lang.String):long");
    }

    /* renamed from: a */
    protected static boolean m17085a(zzjj zzjj) {
        Bundle bundle = zzjj.zzbdp.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            if (bundle.containsKey("gw")) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final bn m17086a() {
        return this.f13845h;
    }

    /* renamed from: a */
    protected final List<String> m17087a(List<String> list) {
        List arrayList = new ArrayList(list.size());
        for (String a : list) {
            arrayList.add(dh.a(a, this.f13842e.f7163c));
        }
        return arrayList;
    }

    /* renamed from: a */
    protected void mo3997a(int i) {
        mo3998a(i, false);
    }

    /* renamed from: a */
    protected void mo3998a(int i, boolean z) {
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("Failed to load ad: ");
        stringBuilder.append(i);
        ec.e(stringBuilder.toString());
        this.f13840c = z;
        if (this.f13842e.f7174n != null) {
            try {
                this.f13842e.f7174n.onAdFailedToLoad(i);
            } catch (Throwable e) {
                ec.c("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        if (this.f13842e.f7147A != null) {
            try {
                this.f13842e.f7147A.onRewardedVideoAdFailedToLoad(i);
            } catch (Throwable e2) {
                ec.c("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    /* renamed from: a */
    protected final void m17090a(View view) {
        at atVar = this.f13842e.f7166f;
        if (atVar != null) {
            atVar.addView(view, ar.m8650g().d());
        }
    }

    /* renamed from: a */
    public final void m17091a(alz alz) {
        this.f13838a = new amb(((Boolean) aja.f().a(alo.f15430H)).booleanValue(), "load_ad", this.f13842e.f7169i.zzbek);
        this.f13846i = new alz(-1, null, null);
        if (alz == null) {
            this.f13839b = new alz(-1, null, null);
        } else {
            this.f13839b = new alz(alz.a(), alz.b(), alz.c());
        }
    }

    /* renamed from: a */
    protected abstract void mo3999a(dm dmVar, amb amb);

    /* renamed from: a */
    protected final void m17093a(@Nullable zzaeq zzaeq) {
        if (this.f13842e.f7147A != null) {
            try {
                String str = "";
                int i = 1;
                if (zzaeq != null) {
                    str = zzaeq.type;
                    i = zzaeq.zzcwd;
                }
                this.f13842e.f7147A.zza(new bn(str, i));
            } catch (Throwable e) {
                ec.c("Could not call RewardedVideoAdListener.onRewarded().", e);
            }
        }
    }

    /* renamed from: a */
    protected void mo4000a(boolean z) {
        ec.d("Ad finished loading.");
        this.f13840c = z;
        if (this.f13842e.f7174n != null) {
            try {
                this.f13842e.f7174n.onAdLoaded();
            } catch (Throwable e) {
                ec.c("Could not call AdListener.onAdLoaded().", e);
            }
        }
        if (this.f13842e.f7147A != null) {
            try {
                this.f13842e.f7147A.onRewardedVideoAdLoaded();
            } catch (Throwable e2) {
                ec.c("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    /* renamed from: a */
    boolean mo3742a(dl dlVar) {
        return false;
    }

    /* renamed from: a */
    protected abstract boolean mo3743a(@Nullable dl dlVar, dl dlVar2);

    /* renamed from: a */
    protected abstract boolean mo3744a(zzjj zzjj, amb amb);

    /* renamed from: b */
    protected void mo4037b() {
        ec.d("Ad closing.");
        if (this.f13842e.f7174n != null) {
            try {
                this.f13842e.f7174n.onAdClosed();
            } catch (Throwable e) {
                ec.c("Could not call AdListener.onAdClosed().", e);
            }
        }
        if (this.f13842e.f7147A != null) {
            try {
                this.f13842e.f7147A.onRewardedVideoAdClosed();
            } catch (Throwable e2) {
                ec.c("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    /* renamed from: b */
    protected boolean mo3745b(zzjj zzjj) {
        if (this.f13842e.f7166f == null) {
            return false;
        }
        ViewParent parent = this.f13842e.f7166f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return ar.m8648e().a(view, view.getContext());
    }

    /* renamed from: c */
    protected final void m17100c() {
        ec.d("Ad leaving application.");
        if (this.f13842e.f7174n != null) {
            try {
                this.f13842e.f7174n.onAdLeftApplication();
            } catch (Throwable e) {
                ec.c("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        if (this.f13842e.f7147A != null) {
            try {
                this.f13842e.f7147A.onRewardedVideoAdLeftApplication();
            } catch (Throwable e2) {
                ec.c("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    /* renamed from: d */
    protected final void m17101d() {
        ec.d("Ad opening.");
        if (this.f13842e.f7174n != null) {
            try {
                this.f13842e.f7174n.onAdOpened();
            } catch (Throwable e) {
                ec.c("Could not call AdListener.onAdOpened().", e);
            }
        }
        if (this.f13842e.f7147A != null) {
            try {
                this.f13842e.f7147A.onRewardedVideoAdOpened();
            } catch (Throwable e2) {
                ec.c("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    public void destroy() {
        ad.m9053b("destroy must be called on the main UI thread.");
        this.f13841d.m8625a();
        this.f13844g.b(this.f13842e.f7170j);
        as asVar = this.f13842e;
        if (asVar.f7166f != null) {
            asVar.f7166f.m8681b();
        }
        asVar.f7174n = null;
        asVar.f7175o = null;
        asVar.f7186z = null;
        asVar.f7176p = null;
        asVar.m8674a(false);
        if (asVar.f7166f != null) {
            asVar.f7166f.removeAllViews();
        }
        asVar.m8675b();
        asVar.m8676c();
        asVar.f7170j = null;
    }

    /* renamed from: e */
    protected void mo4002e() {
        mo4000a(false);
    }

    /* renamed from: f */
    protected final void m17103f() {
        if (this.f13842e.f7147A != null) {
            try {
                this.f13842e.f7147A.onRewardedVideoStarted();
            } catch (Throwable e) {
                ec.c("Could not call RewardedVideoAdListener.onVideoStarted().", e);
            }
        }
    }

    public String getAdUnitId() {
        return this.f13842e.f7162b;
    }

    public zzll getVideoController() {
        return null;
    }

    public final boolean isLoading() {
        return this.f13840c;
    }

    public final boolean isReady() {
        ad.m9053b("isLoaded must be called on the main UI thread.");
        return this.f13842e.f7167g == null && this.f13842e.f7168h == null && this.f13842e.f7170j != null;
    }

    public void onAdClicked() {
        if (this.f13842e.f7170j == null) {
            ec.e("Ad state was null when trying to ping click URLs.");
            return;
        }
        ec.b("Pinging click URLs.");
        if (this.f13842e.f7172l != null) {
            this.f13842e.f7172l.b();
        }
        if (this.f13842e.f7170j.f15971c != null) {
            ar.m8648e();
            fk.a(this.f13842e.f7163c, this.f13842e.f7165e.zzcv, m17087a(this.f13842e.f7170j.f15971c));
        }
        if (this.f13842e.f7173m != null) {
            try {
                this.f13842e.f7173m.onAdClicked();
            } catch (Throwable e) {
                ec.c("Could not notify onAdClicked event.", e);
            }
        }
    }

    public final void onAppEvent(String str, @Nullable String str2) {
        if (this.f13842e.f7175o != null) {
            try {
                this.f13842e.f7175o.onAppEvent(str, str2);
            } catch (Throwable e) {
                ec.c("Could not call the AppEventListener.", e);
            }
        }
    }

    public void pause() {
        ad.m9053b("pause must be called on the main UI thread.");
    }

    public void resume() {
        ad.m9053b("resume must be called on the main UI thread.");
    }

    public void setImmersiveMode(boolean z) {
        throw new IllegalStateException("onImmersiveModeUpdated is not supported for current ad type");
    }

    public void setManualImpressionsEnabled(boolean z) {
        ec.e("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public final void setUserId(String str) {
        ad.m9053b("setUserId must be called on the main UI thread.");
        this.f13842e.f7148B = str;
    }

    public final void stopLoading() {
        ad.m9053b("stopLoading must be called on the main UI thread.");
        this.f13840c = false;
        this.f13842e.m8674a(true);
    }

    public final void zza(dm dmVar) {
        if (!(dmVar.f15996b.zzcpa == -1 || TextUtils.isEmpty(dmVar.f15996b.zzcpj))) {
            long a = C4269a.m17084a(dmVar.f15996b.zzcpj);
            if (a != -1) {
                this.f13838a.a(this.f13838a.a(dmVar.f15996b.zzcpa + a), new String[]{"stc"});
            }
        }
        this.f13838a.a(dmVar.f15996b.zzcpj);
        this.f13838a.a(this.f13839b, new String[]{"arf"});
        this.f13846i = this.f13838a.a();
        this.f13838a.a("gqi", dmVar.f15996b.zzcpk);
        this.f13842e.f7167g = null;
        this.f13842e.f7171k = dmVar;
        dmVar.f16003i.a(new au(this, dmVar));
        dmVar.f16003i.a(zza.zzb.zzbbn);
        mo3999a(dmVar, this.f13838a);
    }

    public final void zza(zzadp zzadp) {
        ad.m9053b("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f13842e.f7147A = zzadp;
    }

    public final void zza(zzjn zzjn) {
        ad.m9053b("setAdSize must be called on the main UI thread.");
        this.f13842e.f7169i = zzjn;
        if (!(this.f13842e.f7170j == null || this.f13842e.f7170j.f15970b == null || this.f13842e.f7152F != 0)) {
            this.f13842e.f7170j.f15970b.zza(mb.a(zzjn));
        }
        if (this.f13842e.f7166f != null) {
            if (this.f13842e.f7166f.getChildCount() > 1) {
                this.f13842e.f7166f.removeView(this.f13842e.f7166f.getNextView());
            }
            this.f13842e.f7166f.setMinimumWidth(zzjn.widthPixels);
            this.f13842e.f7166f.setMinimumHeight(zzjn.heightPixels);
            this.f13842e.f7166f.requestLayout();
        }
    }

    public final void zza(zzke zzke) {
        ad.m9053b("setAdListener must be called on the main UI thread.");
        this.f13842e.f7173m = zzke;
    }

    public final void zza(zzkh zzkh) {
        ad.m9053b("setAdListener must be called on the main UI thread.");
        this.f13842e.f7174n = zzkh;
    }

    public final void zza(zzkx zzkx) {
        ad.m9053b("setAppEventListener must be called on the main UI thread.");
        this.f13842e.f7175o = zzkx;
    }

    public final void zza(zzld zzld) {
        ad.m9053b("setCorrelationIdProvider must be called on the main UI thread");
        this.f13842e.f7176p = zzld;
    }

    public final void zza(@Nullable zzlr zzlr) {
        ad.m9053b("setIconAdOptions must be called on the main UI thread.");
        this.f13842e.f7183w = zzlr;
    }

    public final void zza(@Nullable zzmr zzmr) {
        ad.m9053b("setVideoOptions must be called on the main UI thread.");
        this.f13842e.f7182v = zzmr;
    }

    public void zza(zzoa zzoa) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void zza(zzxl zzxl) {
        ec.e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void zza(zzxr zzxr, String str) {
        ec.e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    public final void zza(HashSet<dn> hashSet) {
        this.f13842e.m8673a((HashSet) hashSet);
    }

    public void zzb(dl dlVar) {
        this.f13838a.a(this.f13846i, new String[]{"awr"});
        this.f13842e.f7168h = null;
        if (!(dlVar.f15972d == -2 || dlVar.f15972d == 3 || this.f13842e.m8671a() == null)) {
            ar.m8652i().a(this.f13842e.m8671a());
        }
        if (dlVar.f15972d == -1) {
            this.f13840c = false;
            return;
        }
        if (mo3742a(dlVar)) {
            ec.b("Ad refresh scheduled.");
        }
        if (dlVar.f15972d != -2) {
            ahw ahw;
            zza.zzb zzb;
            if (dlVar.f15972d == 3) {
                ahw = dlVar.f15963H;
                zzb = zza.zzb.zzbbp;
            } else {
                ahw = dlVar.f15963H;
                zzb = zza.zzb.zzbbo;
            }
            ahw.a(zzb);
            mo3997a(dlVar.f15972d);
            return;
        }
        if (this.f13842e.f7150D == null) {
            this.f13842e.f7150D = new dv(this.f13842e.f7162b);
        }
        if (this.f13842e.f7166f != null) {
            this.f13842e.f7166f.m8680a().d(dlVar.f15956A);
        }
        this.f13844g.a(this.f13842e.f7170j);
        if (mo3743a(this.f13842e.f7170j, dlVar)) {
            this.f13842e.f7170j = dlVar;
            as asVar = this.f13842e;
            if (asVar.f7172l != null) {
                if (asVar.f7170j != null) {
                    asVar.f7172l.a(asVar.f7170j.f15992x);
                    asVar.f7172l.b(asVar.f7170j.f15993y);
                    asVar.f7172l.b(asVar.f7170j.f15981m);
                }
                asVar.f7172l.a(asVar.f7169i.zzbel);
            }
            this.f13838a.a("is_mraid", this.f13842e.f7170j.a() ? "1" : "0");
            this.f13838a.a("is_mediation", this.f13842e.f7170j.f15981m ? "1" : "0");
            if (!(this.f13842e.f7170j.f15970b == null || this.f13842e.f7170j.f15970b.zzsz() == null)) {
                this.f13838a.a("is_delay_pl", this.f13842e.f7170j.f15970b.zzsz().f() ? "1" : "0");
            }
            this.f13838a.a(this.f13839b, new String[]{"ttc"});
            if (ar.m8652i().e() != null) {
                ar.m8652i().e().a(this.f13838a);
            }
            zzcc();
            if (this.f13842e.m8677d()) {
                mo4002e();
            }
        }
        if (dlVar.f15962G != null) {
            ar.m8648e().a(this.f13842e.f7163c, dlVar.f15962G);
        }
    }

    public boolean zzb(zzjj zzjj) {
        ad.m9053b("loadAd must be called on the main UI thread.");
        ar.m8653j().a();
        if (((Boolean) aja.f().a(alo.aB)).booleanValue()) {
            zzjj.zzh(zzjj);
        }
        if (C2521f.m9201c(this.f13842e.f7163c) && zzjj.zzbdn != null) {
            zzjj = new ail(zzjj).a(null).a();
        }
        if (this.f13842e.f7167g == null) {
            if (this.f13842e.f7168h == null) {
                String str;
                ec.d("Starting ad request.");
                m17091a(null);
                this.f13839b = this.f13838a.a();
                if (zzjj.zzbdi) {
                    str = "This request is sent from a test device.";
                } else {
                    aja.a();
                    str = hn.a(this.f13842e.f7163c);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
                    stringBuilder.append("Use AdRequest.Builder.addTestDevice(\"");
                    stringBuilder.append(str);
                    stringBuilder.append("\") to get test ads on this device.");
                    str = stringBuilder.toString();
                }
                ec.d(str);
                this.f13841d.m8626a(zzjj);
                this.f13840c = mo3744a(zzjj, this.f13838a);
                return this.f13840c;
            }
        }
        ec.e(this.f13843f != null ? "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes." : "Loading already in progress, saving this object for future refreshes.");
        this.f13843f = zzjj;
        return false;
    }

    public final IObjectWrapper zzbr() {
        ad.m9053b("getAdFrame must be called on the main UI thread.");
        return C4296b.m17261a(this.f13842e.f7166f);
    }

    @Nullable
    public final zzjn zzbs() {
        ad.m9053b("getAdSize must be called on the main UI thread.");
        return this.f13842e.f7169i == null ? null : new zzmp(this.f13842e.f7169i);
    }

    public final void zzbt() {
        m17100c();
    }

    public final void zzbu() {
        ad.m9053b("recordManualImpression must be called on the main UI thread.");
        if (this.f13842e.f7170j == null) {
            ec.e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        ec.b("Pinging manual tracking URLs.");
        if (!this.f13842e.f7170j.f15960E) {
            List arrayList = new ArrayList();
            if (this.f13842e.f7170j.f15974f != null) {
                arrayList.addAll(this.f13842e.f7170j.f15974f);
            }
            if (!(this.f13842e.f7170j.f15982n == null || this.f13842e.f7170j.f15982n.f15629h == null)) {
                arrayList.addAll(this.f13842e.f7170j.f15982n.f15629h);
            }
            if (!arrayList.isEmpty()) {
                ar.m8648e();
                fk.a(this.f13842e.f7163c, this.f13842e.f7165e.zzcv, arrayList);
                this.f13842e.f7170j.f15960E = true;
            }
        }
    }

    public final void zzbz() {
        ec.d("Ad impression.");
        if (this.f13842e.f7174n != null) {
            try {
                this.f13842e.f7174n.onAdImpression();
            } catch (Throwable e) {
                ec.c("Could not call AdListener.onAdImpression().", e);
            }
        }
    }

    public final void zzca() {
        ec.d("Ad clicked.");
        if (this.f13842e.f7174n != null) {
            try {
                this.f13842e.f7174n.onAdClicked();
            } catch (Throwable e) {
                ec.c("Could not call AdListener.onAdClicked().", e);
            }
        }
    }

    public final void zzcc() {
        dl dlVar = this.f13842e.f7170j;
        if (dlVar != null && !TextUtils.isEmpty(dlVar.f15956A) && !dlVar.f15961F && ar.m8657n().b()) {
            ec.b("Sending troubleshooting signals to the server.");
            ar.m8657n().b(this.f13842e.f7163c, this.f13842e.f7165e.zzcv, dlVar.f15956A, this.f13842e.f7162b);
            dlVar.f15961F = true;
        }
    }

    public final zzkx zzcd() {
        return this.f13842e.f7175o;
    }

    public final zzkh zzce() {
        return this.f13842e.f7174n;
    }
}
