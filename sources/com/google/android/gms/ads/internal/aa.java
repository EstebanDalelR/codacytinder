package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.util.C0562m;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.afd;
import com.google.android.gms.internal.afi;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.amb;
import com.google.android.gms.internal.amn;
import com.google.android.gms.internal.amp;
import com.google.android.gms.internal.amr;
import com.google.android.gms.internal.amu;
import com.google.android.gms.internal.arj;
import com.google.android.gms.internal.aum;
import com.google.android.gms.internal.avo;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fe;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.hx;
import com.google.android.gms.internal.iw;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzakv;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanv;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzoq;
import com.google.android.gms.internal.zzos;
import com.google.android.gms.internal.zzot;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzqm;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzva;
import com.google.android.gms.internal.zzvj;
import com.google.android.gms.internal.zzvm;
import com.google.android.gms.internal.zzxl;
import com.google.android.gms.internal.zzzb;
import com.google.android.gms.internal.zzzv;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

@zzzv
public final class aa extends av implements zzot {
    /* renamed from: j */
    private final Object f14801j;
    /* renamed from: k */
    private boolean f14802k;
    /* renamed from: l */
    private iw<zzou> f14803l;
    /* renamed from: m */
    private zzanh f14804m;
    /* renamed from: n */
    private boolean f14805n;
    /* renamed from: o */
    private int f14806o;
    /* renamed from: p */
    private zzzb f14807p;
    /* renamed from: q */
    private final String f14808q;

    public aa(Context context, bn bnVar, zzjn zzjn, String str, zzux zzux, zzakd zzakd) {
        this(context, bnVar, zzjn, str, zzux, zzakd, false);
    }

    public aa(Context context, bn bnVar, zzjn zzjn, String str, zzux zzux, zzakd zzakd, boolean z) {
        super(context, zzjn, str, zzux, zzakd, bnVar);
        this.f14801j = new Object();
        this.f14803l = new iw();
        this.f14806o = 1;
        this.f14808q = UUID.randomUUID().toString();
        this.f14802k = z;
    }

    /* renamed from: a */
    private static void m18553a(as asVar, as asVar2) {
        if (asVar2.f7177q == null) {
            asVar2.f7177q = asVar.f7177q;
        }
        if (asVar2.f7178r == null) {
            asVar2.f7178r = asVar.f7178r;
        }
        if (asVar2.f7179s == null) {
            asVar2.f7179s = asVar.f7179s;
        }
        if (asVar2.f7180t == null) {
            asVar2.f7180t = asVar.f7180t;
        }
        if (asVar2.f7182v == null) {
            asVar2.f7182v = asVar.f7182v;
        }
        if (asVar2.f7181u == null) {
            asVar2.f7181u = asVar.f7181u;
        }
        if (asVar2.f7149C == null) {
            asVar2.f7149C = asVar.f7149C;
        }
        if (asVar2.f7172l == null) {
            asVar2.f7172l = asVar.f7172l;
        }
        if (asVar2.f7150D == null) {
            asVar2.f7150D = asVar.f7150D;
        }
        if (asVar2.f7173m == null) {
            asVar2.f7173m = asVar.f7173m;
        }
        if (asVar2.f7174n == null) {
            asVar2.f7174n = asVar.f7174n;
        }
        if (asVar2.f7169i == null) {
            asVar2.f7169i = asVar.f7169i;
        }
        if (asVar2.f7170j == null) {
            asVar2.f7170j = asVar.f7170j;
        }
        if (asVar2.f7171k == null) {
            asVar2.f7171k = asVar.f7171k;
        }
    }

    /* renamed from: a */
    private final void m18554a(amn amn) {
        fk.f16060a.post(new ae(this, amn));
    }

    /* renamed from: a */
    private final void m18555a(amp amp) {
        fk.f16060a.post(new af(this, amp));
    }

    @Nullable
    /* renamed from: p */
    private final arj m18556p() {
        return (this.e.f7170j == null || !this.e.f7170j.f15981m) ? null : this.e.f7170j.f15985q;
    }

    /* renamed from: q */
    private final void m18557q() {
        zzzb i = m18571i();
        if (i != null) {
            i.zzls();
        }
    }

    /* renamed from: a */
    protected final void mo3997a(int i) {
        mo3998a(i, false);
    }

    /* renamed from: a */
    protected final void mo3998a(int i, boolean z) {
        m18557q();
        super.mo3998a(i, z);
    }

    /* renamed from: a */
    public final void mo3999a(dm dmVar, amb amb) {
        if (dmVar.f15998d != null) {
            this.e.f7169i = dmVar.f15998d;
        }
        if (dmVar.f15999e != -2) {
            fk.f16060a.post(new ab(this, dmVar));
            return;
        }
        int i = dmVar.f15995a.zzcoo;
        int i2 = 0;
        if (i == 1) {
            this.e.f7152F = 0;
            as asVar = this.e;
            ar.m8647d();
            asVar.f7168h = aum.a(this.e.f7163c, this, dmVar, this.e.f7164d, null, this.i, this, amb);
            String str = "AdRenderer: ";
            String valueOf = String.valueOf(this.e.f7168h.getClass().getName());
            ec.b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(dmVar.f15996b.body).getJSONArray("slots");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i3).getJSONArray("ads");
                for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                    jSONArray.put(jSONArray3.get(i4));
                }
            }
            m18557q();
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i);
            List arrayList = new ArrayList();
            for (int i5 = 0; i5 < i; i5++) {
                arrayList.add(fe.a(newFixedThreadPool, new ac(this, i5, jSONArray, i, dmVar)));
            }
            while (i2 < arrayList.size()) {
                try {
                    fk.f16060a.post(new ad(this, (zzou) ((zzakv) arrayList.get(i2)).get(((Long) aja.f().a(alo.bn)).longValue(), TimeUnit.MILLISECONDS), i2, arrayList));
                } catch (Throwable e) {
                    ec.c("Exception occurred while getting an ad response", e);
                    Thread.currentThread().interrupt();
                } catch (Throwable e2) {
                    ec.c("Exception occurred while getting an ad response", e2);
                }
                i2++;
            }
        } catch (Throwable e22) {
            ec.c("Malformed native ad response", e22);
            mo3997a(0);
        }
    }

    /* renamed from: a */
    public final void m18561a(zzanh zzanh) {
        this.f14804m = zzanh;
    }

    /* renamed from: a */
    protected final void mo4000a(boolean z) {
        super.mo4000a(z);
        if (this.f14805n) {
            if (((Boolean) aja.f().a(alo.bS)).booleanValue()) {
                m18573k();
            }
        }
    }

    /* renamed from: a */
    protected final boolean mo3743a(dl dlVar, dl dlVar2) {
        dl dlVar3 = dlVar2;
        List list = null;
        m18567b(null);
        if (this.e.m8677d()) {
            if (dlVar3.f15981m) {
                m18557q();
                try {
                    zzvj zzme = dlVar3.f15983o != null ? dlVar3.f15983o.zzme() : null;
                    zzvm zzmf = dlVar3.f15983o != null ? dlVar3.f15983o.zzmf() : null;
                    zzqm zzmj = dlVar3.f15983o != null ? dlVar3.f15983o.zzmj() : null;
                    String b = av.m18135b(dlVar2);
                    String headline;
                    List images;
                    String body;
                    zzpq zzjs;
                    String callToAction;
                    if (zzme != null && r7.e.f7177q != null) {
                        headline = zzme.getHeadline();
                        images = zzme.getImages();
                        body = zzme.getBody();
                        zzjs = zzme.zzjs() != null ? zzme.zzjs() : null;
                        callToAction = zzme.getCallToAction();
                        double starRating = zzme.getStarRating();
                        String store = zzme.getStore();
                        String price = zzme.getPrice();
                        Bundle extras = zzme.getExtras();
                        zzll videoController = zzme.getVideoController();
                        if (zzme.zzml() != null) {
                            list = (View) C4296b.m17262a(zzme.zzml());
                        }
                        zzou amn = new amn(headline, images, body, zzjs, callToAction, starRating, store, price, null, extras, videoController, list, zzme.zzjx(), b);
                        amn amn2 = amn;
                        amn2.zzb(new amu(r7.e.f7163c, r7, r7.e.f7164d, zzme, amn));
                        m18554a(amn2);
                    } else if (zzmf != null && r7.e.f7178r != null) {
                        headline = zzmf.getHeadline();
                        images = zzmf.getImages();
                        body = zzmf.getBody();
                        zzjs = zzmf.zzjz() != null ? zzmf.zzjz() : null;
                        callToAction = zzmf.getCallToAction();
                        String advertiser = zzmf.getAdvertiser();
                        Bundle extras2 = zzmf.getExtras();
                        zzll videoController2 = zzmf.getVideoController();
                        if (zzmf.zzml() != null) {
                            list = (View) C4296b.m17262a(zzmf.zzml());
                        }
                        amp amp = new amp(headline, images, body, zzjs, callToAction, advertiser, null, extras2, videoController2, list, zzmf.zzjx(), b);
                        amp.zzb(new amu(r7.e.f7163c, r7, r7.e.f7164d, zzmf, amp));
                        m18555a(amp);
                    } else if (zzmj == null || r7.e.f7180t == null || r7.e.f7180t.get(zzmj.getCustomTemplateId()) == null) {
                        ec.e("No matching mapper/listener for retrieved native ad template.");
                        mo3997a(0);
                        return false;
                    } else {
                        fk.f16060a.post(new ah(r7, zzmj));
                    }
                } catch (Throwable e) {
                    ec.c("Failed to get native ad mapper", e);
                }
            } else {
                zzou zzou = dlVar3.f15957B;
                if (r7.f14802k) {
                    r7.f14803l.b(zzou);
                } else if ((zzou instanceof amp) && r7.e.f7178r != null) {
                    m18555a((amp) dlVar3.f15957B);
                } else if (!(zzou instanceof amn) || r7.e.f7177q == null) {
                    if ((zzou instanceof amr) && r7.e.f7180t != null) {
                        amr amr = (amr) zzou;
                        if (r7.e.f7180t.get(amr.getCustomTemplateId()) != null) {
                            fk.f16060a.post(new ag(r7, amr.getCustomTemplateId(), dlVar3));
                        }
                    }
                    ec.e("No matching listener for retrieved native ad template.");
                    mo3997a(0);
                    return false;
                } else {
                    m18554a((amn) dlVar3.f15957B);
                }
            }
            return super.mo3743a(dlVar, dlVar2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    /* renamed from: a */
    public final boolean mo3744a(zzjj zzjj, amb amb) {
        try {
            m18570h();
            return super.m18141a(zzjj, amb, this.f14806o);
        } catch (Throwable e) {
            String str = "Error initializing webview.";
            if (hx.a(4)) {
                Log.i("Ads", str, e);
            }
            return false;
        }
    }

    /* renamed from: a */
    protected final boolean mo4001a(zzjj zzjj, dl dlVar, boolean z) {
        return this.d.m8631d();
    }

    /* renamed from: b */
    public final void m18566b(int i) {
        ad.m9053b("setMaxNumberOfAds must be called on the main UI thread.");
        this.f14806o = i;
    }

    /* renamed from: b */
    public final void m18567b(@Nullable List<String> list) {
        ad.m9053b("setNativeTemplates must be called on the main UI thread.");
        this.e.f7149C = list;
    }

    /* renamed from: e */
    protected final void mo4002e() {
        mo4000a(false);
    }

    /* renamed from: g */
    public final String m18569g() {
        return this.f14808q;
    }

    public final String getAdUnitId() {
        return this.e.f7162b;
    }

    /* renamed from: h */
    final void m18570h() throws zzanv {
        synchronized (this.f14801j) {
            ec.a("Initializing webview native ads utills");
            this.f14807p = new avo(this.e.f7163c, this, this.f14808q, this.e.f7164d, this.e.f7165e);
        }
    }

    @Nullable
    /* renamed from: i */
    public final zzzb m18571i() {
        zzzb zzzb;
        synchronized (this.f14801j) {
            zzzb = this.f14807p;
        }
        return zzzb;
    }

    /* renamed from: j */
    protected final Future<zzou> m18572j() {
        return this.f14803l;
    }

    /* renamed from: k */
    public final void m18573k() {
        if (this.e.f7170j == null || this.f14804m == null) {
            this.f14805n = true;
            ec.e("Request to enable ActiveView before adState is available.");
            return;
        }
        afd u = ar.m8652i().u();
        zzjn zzjn = this.e.f7169i;
        dl dlVar = this.e.f7170j;
        zzanh zzanh = this.f14804m;
        if (zzanh == null) {
            throw null;
        }
        u.a(zzjn, dlVar, (View) zzanh, this.f14804m);
        this.f14805n = false;
    }

    /* renamed from: l */
    public final void m18574l() {
        this.f14805n = false;
        if (this.e.f7170j == null || this.f14804m == null) {
            ec.e("Request to enable ActiveView before adState is available.");
        } else {
            ar.m8652i().u().a(this.e.f7170j);
        }
    }

    /* renamed from: m */
    public final C0562m<String, zzqz> m18575m() {
        ad.m9053b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.e.f7180t;
    }

    /* renamed from: n */
    public final void m18576n() {
        if (this.f14804m != null && this.f14804m.zzsg() != null && this.e.f7181u != null && this.e.f7181u.zzbvi != null) {
            this.f14804m.zzsg().a(this.e.f7181u.zzbvi);
        }
    }

    public final void pause() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public final void resume() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final void zza(zzoa zzoa) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void zza(zzoq zzoq) {
        if (this.f14804m != null) {
            this.f14804m.zzb(zzoq);
        }
    }

    public final void zza(zzos zzos) {
        if (this.e.f7170j.f15978j != null) {
            ar.m8652i().u().a(this.e.f7169i, this.e.f7170j, new afi(zzos), null);
        }
    }

    public final void zza(zzxl zzxl) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public final void zzci() {
        dl dlVar = this.e.f7170j;
        if (dlVar.f15983o == null) {
            super.zzci();
            return;
        }
        try {
            zzva zzva = dlVar.f15983o;
            zzll zzll = null;
            zzvj zzme = zzva.zzme();
            if (zzme != null) {
                zzll = zzme.getVideoController();
            } else {
                zzvm zzmf = zzva.zzmf();
                if (zzmf != null) {
                    zzll = zzmf.getVideoController();
                } else {
                    zzqm zzmj = zzva.zzmj();
                    if (zzmj != null) {
                        zzll = zzmj.getVideoController();
                    }
                }
            }
            if (zzll != null) {
                zzlo zzij = zzll.zzij();
                if (zzij != null) {
                    zzij.onVideoEnd();
                }
            }
        } catch (Throwable e) {
            ec.c("Unable to call onVideoEnd()", e);
        }
    }

    public final void zzcj() {
        if (this.e.f7170j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.f7170j.f15984p)) {
            super.zzcj();
        } else {
            zzca();
        }
    }

    public final void zzco() {
        if (this.e.f7170j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.f7170j.f15984p)) {
            super.zzco();
        } else {
            zzbz();
        }
    }

    public final void zzcv() {
        if (this.f14804m != null) {
            this.f14804m.destroy();
            this.f14804m = null;
        }
    }

    public final boolean zzcw() {
        return m18556p() != null ? m18556p().f15655o : false;
    }

    public final boolean zzcx() {
        return m18556p() != null ? m18556p().f15656p : false;
    }

    @Nullable
    public final zzqw zzs(String str) {
        ad.m9053b("getOnCustomClickListener must be called on the main UI thread.");
        return this.e.f7179s == null ? null : (zzqw) this.e.f7179s.get(str);
    }
}
