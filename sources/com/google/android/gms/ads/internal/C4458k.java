package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.gmsg.C3741f;
import com.google.android.gms.ads.internal.gmsg.zzag;
import com.google.android.gms.ads.internal.gmsg.zzx;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2400j;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.aga;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.amb;
import com.google.android.gms.internal.ari;
import com.google.android.gms.internal.arj;
import com.google.android.gms.internal.au;
import com.google.android.gms.internal.dd;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.ku;
import com.google.android.gms.internal.mb;
import com.google.android.gms.internal.zzaat;
import com.google.android.gms.internal.zzaax;
import com.google.android.gms.internal.zzaeq;
import com.google.android.gms.internal.zzafb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanv;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzzv;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.k */
public final class C4458k extends ba implements zzag, zzx {
    /* renamed from: j */
    private transient boolean f14830j = false;
    /* renamed from: k */
    private int f14831k = -1;
    /* renamed from: l */
    private boolean f14832l;
    /* renamed from: m */
    private float f14833m;
    /* renamed from: n */
    private boolean f14834n;
    /* renamed from: o */
    private dd f14835o;
    /* renamed from: p */
    private String f14836p;
    /* renamed from: q */
    private final String f14837q;

    public C4458k(Context context, zzjn zzjn, String str, zzux zzux, zzakd zzakd, bn bnVar) {
        super(context, zzjn, str, zzux, zzakd, bnVar);
        String str2 = (zzjn == null || !"reward_mb".equals(zzjn.zzbek)) ? "/Interstitial" : "/Rewarded";
        this.f14837q = str2;
    }

    /* renamed from: a */
    private static dm m18649a(dm dmVar) {
        dm dmVar2;
        dm dmVar3 = dmVar;
        try {
            String jSONObject = au.a(dmVar3.f15996b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, dmVar3.f15995a.zzatw);
            ari ari = new ari(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1);
            zzaax zzaax = dmVar3.f15996b;
            arj arj = new arj(Collections.singletonList(ari), ((Long) aja.f().a(alo.bn)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzaax.zzcdn, zzaax.zzcdo, "", -1, 0, 1, null, 0, -1, -1, false);
            zzaat zzaat = dmVar3.f15995a;
            String str = zzaax.zzcja;
            String str2 = zzaax.body;
            List emptyList = Collections.emptyList();
            List emptyList2 = Collections.emptyList();
            long j = zzaax.zzcov;
            long j2 = zzaax.zzcox;
            List emptyList3 = Collections.emptyList();
            long j3 = zzaax.zzcdq;
            int i = zzaax.orientation;
            String str3 = zzaax.zzcoz;
            long j4 = zzaax.zzcpa;
            String str4 = zzaax.zzcpb;
            boolean z = zzaax.zzcpc;
            String str5 = zzaax.zzcpd;
            boolean z2 = zzaax.zzcpf;
            boolean z3 = zzaax.zzben;
            boolean z4 = zzaax.zzcnl;
            boolean z5 = zzaax.zzcpg;
            boolean z6 = zzaax.zzcph;
            String str6 = zzaax.zzcpk;
            boolean z7 = zzaax.zzbeo;
            boolean z8 = zzaax.zzbep;
            boolean z9 = z8;
            zzaax zzaax2 = new zzaax(zzaat, str, str2, emptyList, emptyList2, j, true, j2, emptyList3, j3, i, str3, j4, str4, z, str5, null, z2, z3, z4, z5, z6, str6, z7, z9, null, Collections.emptyList(), Collections.emptyList(), zzaax.zzcpo, zzaax.zzcpp, zzaax.zzcnz, zzaax.zzcoa, zzaax.zzcdn, zzaax.zzcdo, zzaax.zzcpq, null, zzaax.zzcps, zzaax.zzcpt, zzaax.zzcol, zzaax.zzaqv, 0);
            dmVar2 = dmVar;
            return new dm(dmVar2.f15995a, zzaax2, arj, dmVar2.f15998d, dmVar2.f15999e, dmVar2.f16000f, dmVar2.f16001g, null, dmVar2.f16003i, null);
        } catch (Throwable e) {
            dmVar2 = dmVar3;
            ec.b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return dmVar2;
        }
    }

    /* renamed from: a */
    private final void m18650a(Bundle bundle) {
        ar.m8648e().b(this.e.f7163c, this.e.f7165e.zzcv, "gmob-apps", bundle, false);
    }

    /* renamed from: a */
    protected final zzanh mo4034a(dm dmVar, @Nullable bo boVar, @Nullable zzafb zzafb) throws zzanv {
        zzanh a = ar.m8649f().a(this.e.f7163c, mb.a(this.e.f7169i), this.e.f7169i.zzbek, false, false, this.e.f7164d, this.e.f7165e, this.a, this, this.h, dmVar.f16003i);
        a.zzsz().a(this, null, this, this, ((Boolean) aja.f().a(alo.ac)).booleanValue(), this, boVar, null, zzafb);
        m18579a(a);
        a.zzda(dmVar.f15995a.zzcnq);
        a.zzsz().a("/reward", new C3741f(this));
        return a;
    }

    /* renamed from: a */
    public final void mo3999a(dm dmVar, amb amb) {
        if (!((Boolean) aja.f().a(alo.aF)).booleanValue()) {
            super.mo3999a(dmVar, amb);
        } else if (dmVar.f15999e != -2) {
            super.mo3999a(dmVar, amb);
        } else {
            int i = dmVar.f15996b.zzcow ^ 1;
            if (C4269a.m17085a(dmVar.f15995a.zzcnd) && i != 0) {
                this.e.f7171k = C4458k.m18649a(dmVar);
            }
            super.mo3999a(this.e.f7171k, amb);
        }
    }

    /* renamed from: a */
    public final boolean mo3743a(@Nullable dl dlVar, dl dlVar2) {
        if (!super.mo3743a(dlVar, dlVar2)) {
            return false;
        }
        if (!(this.e.m8677d() || this.e.f7151E == null || dlVar2.f15978j == null)) {
            this.g.a(this.e.f7169i, dlVar2, this.e.f7151E);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo3744a(zzjj zzjj, amb amb) {
        if (this.e.f7170j != null) {
            ec.e("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.f14835o == null && C4269a.m17085a(zzjj) && ar.m8669z().d(this.e.f7163c) && !TextUtils.isEmpty(this.e.f7162b)) {
            this.f14835o = new dd(this.e.f7163c, this.e.f7162b);
        }
        return super.mo3744a(zzjj, amb);
    }

    /* renamed from: a */
    protected final boolean mo4001a(zzjj zzjj, dl dlVar, boolean z) {
        if (this.e.m8677d() && dlVar.f15970b != null) {
            ar.m8650g();
            fq.a(dlVar.f15970b);
        }
        return this.d.m8631d();
    }

    /* renamed from: b */
    protected final void mo4037b() {
        m18662h();
        super.mo4037b();
    }

    /* renamed from: e */
    protected final void mo4002e() {
        super.mo4002e();
        this.f14830j = true;
    }

    /* renamed from: g */
    protected final boolean m18661g() {
        if (!(this.e.f7163c instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.e.f7163c).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        if (!(rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void m18662h() {
        ar.m8666w().b(Integer.valueOf(this.f14831k));
        if (this.e.m8677d()) {
            this.e.m8675b();
            this.e.f7170j = null;
            this.e.f7153G = false;
            this.f14830j = false;
        }
    }

    public final void setImmersiveMode(boolean z) {
        ad.m9053b("setImmersiveMode must be called on the main UI thread.");
        this.f14834n = z;
    }

    public final void showInterstitial() {
        ad.m9053b("showInterstitial must be called on the main UI thread.");
        if (ar.m8669z().d(this.e.f7163c)) {
            this.f14836p = ar.m8669z().f(this.e.f7163c);
            String valueOf = String.valueOf(this.f14836p);
            String valueOf2 = String.valueOf(this.f14837q);
            this.f14836p = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.e.f7170j == null) {
            ec.e("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) aja.f().a(alo.bd)).booleanValue()) {
            Bundle bundle;
            valueOf = (this.e.f7163c.getApplicationContext() != null ? this.e.f7163c.getApplicationContext() : this.e.f7163c).getPackageName();
            if (!this.f14830j) {
                ec.e("It is not recommended to show an interstitial before onAdLoaded completes.");
                bundle = new Bundle();
                bundle.putString("appid", valueOf);
                bundle.putString("action", "show_interstitial_before_load_finish");
                m18650a(bundle);
            }
            ar.m8648e();
            if (!fk.g(this.e.f7163c)) {
                ec.e("It is not recommended to show an interstitial when app is not in foreground.");
                bundle = new Bundle();
                bundle.putString("appid", valueOf);
                bundle.putString("action", "show_interstitial_app_not_in_foreground");
                m18650a(bundle);
            }
        }
        if (!this.e.m8678e()) {
            if (this.e.f7170j.f15981m && this.e.f7170j.f15983o != null) {
                try {
                    if (((Boolean) aja.f().a(alo.aD)).booleanValue()) {
                        this.e.f7170j.f15983o.setImmersiveMode(this.f14834n);
                    }
                    this.e.f7170j.f15983o.showInterstitial();
                } catch (Throwable e) {
                    ec.c("Could not show interstitial.", e);
                    m18662h();
                }
            } else if (this.e.f7170j.f15970b == null) {
                ec.e("The interstitial failed to load.");
            } else if (this.e.f7170j.f15970b.zztc()) {
                ec.e("The interstitial is already showing.");
            } else {
                this.e.f7170j.f15970b.zzad(true);
                as asVar = this.e;
                zzanh zzanh = this.e.f7170j.f15970b;
                Bitmap bitmap = null;
                if (zzanh == null) {
                    throw null;
                }
                asVar.m8672a((View) zzanh);
                if (this.e.f7170j.f15978j != null) {
                    this.g.a(this.e.f7169i, this.e.f7170j);
                }
                dl dlVar = this.e.f7170j;
                if (dlVar.a()) {
                    Context context = this.e.f7163c;
                    zzanh zzanh2 = dlVar.f15970b;
                    if (zzanh2 == null) {
                        throw null;
                    }
                    new aga(context, (View) zzanh2).a(dlVar.f15970b);
                } else {
                    dlVar.f15970b.zzsz().a(new C3771l(this, dlVar));
                }
                if (this.e.f7153G) {
                    ar.m8648e();
                    bitmap = fk.h(this.e.f7163c);
                }
                this.f14831k = ar.m8666w().a(bitmap);
                if (!((Boolean) aja.f().a(alo.bE)).booleanValue() || bitmap == null) {
                    zzao zzao = new zzao(this.e.f7153G, m18661g(), false, 0.0f, -1, this.f14834n, this.e.f7170j.f15964I);
                    int requestedOrientation = this.e.f7170j.f15970b.getRequestedOrientation();
                    if (requestedOrientation == -1) {
                        requestedOrientation = this.e.f7170j.f15975g;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.e.f7170j.f15970b, requestedOrientation, this.e.f7165e, this.e.f7170j.f15994z, zzao);
                    ar.m8646c();
                    C2400j.m8731a(this.e.f7163c, adOverlayInfoParcel, true);
                    return;
                }
                new C4274m(this, this.f14831k).e();
            }
        }
    }

    public final void zza(boolean z, float f) {
        this.f14832l = z;
        this.f14833m = f;
    }

    public final void zzb(zzaeq zzaeq) {
        if (this.e.f7170j != null) {
            if (this.e.f7170j.f15991w != null) {
                ar.m8648e();
                fk.a(this.e.f7163c, this.e.f7165e.zzcv, this.e.f7170j.f15991w);
            }
            if (this.e.f7170j.f15989u != null) {
                zzaeq = this.e.f7170j.f15989u;
            }
        }
        m17093a(zzaeq);
    }

    public final void zzcg() {
        super.zzcg();
        this.g.a(this.e.f7170j);
        if (this.f14835o != null) {
            this.f14835o.a(false);
        }
    }

    public final void zzch() {
        recordImpression();
        super.zzch();
        if (!(this.e.f7170j == null || this.e.f7170j.f15970b == null)) {
            ku zzsz = this.e.f7170j.f15970b.zzsz();
            if (zzsz != null) {
                zzsz.h();
            }
        }
        if (!(!ar.m8669z().d(this.e.f7163c) || this.e.f7170j == null || this.e.f7170j.f15970b == null)) {
            ar.m8669z().c(this.e.f7170j.f15970b.getContext(), this.f14836p);
        }
        if (this.f14835o != null) {
            this.f14835o.a(true);
        }
    }

    public final void zzd(boolean z) {
        this.e.f7153G = z;
    }

    public final void zzdl() {
        if (!(this.e.f7170j == null || this.e.f7170j.f15990v == null)) {
            ar.m8648e();
            fk.a(this.e.f7163c, this.e.f7165e.zzcv, this.e.f7170j.f15990v);
        }
        m17103f();
    }
}
