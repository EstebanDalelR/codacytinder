package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.ahw;
import com.google.android.gms.internal.amb;
import com.google.android.gms.internal.amn;
import com.google.android.gms.internal.amp;
import com.google.android.gms.internal.amu;
import com.google.android.gms.internal.ari;
import com.google.android.gms.internal.arj;
import com.google.android.gms.internal.aum;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.zzaaz;
import com.google.android.gms.internal.zzaeq;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzoq;
import com.google.android.gms.internal.zzos;
import com.google.android.gms.internal.zzot;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzqm;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzva;
import com.google.android.gms.internal.zzvj;
import com.google.android.gms.internal.zzvm;
import com.google.android.gms.internal.zzzv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

@zzzv
public final class bi extends av implements zzot {
    /* renamed from: j */
    private boolean f14810j;
    /* renamed from: k */
    private dl f14811k;
    /* renamed from: l */
    private boolean f14812l = false;

    public bi(Context context, bn bnVar, zzjn zzjn, String str, zzux zzux, zzakd zzakd) {
        super(context, zzjn, str, zzux, zzakd, bnVar);
    }

    /* renamed from: a */
    private static dl m18584a(dm dmVar, int i) {
        dm dmVar2 = dmVar;
        zzjj zzjj = dmVar2.f15995a.zzcnd;
        List list = dmVar2.f15996b.zzcdk;
        List list2 = dmVar2.f15996b.zzcdl;
        List list3 = dmVar2.f15996b.zzcoy;
        int i2 = dmVar2.f15996b.orientation;
        long j = dmVar2.f15996b.zzcdq;
        String str = dmVar2.f15995a.zzcng;
        boolean z = dmVar2.f15996b.zzcow;
        arj arj = dmVar2.f15997c;
        long j2 = dmVar2.f15996b.zzcox;
        zzjn zzjn = dmVar2.f15998d;
        long j3 = j2;
        arj arj2 = arj;
        long j4 = dmVar2.f15996b.zzcov;
        long j5 = dmVar2.f16000f;
        long j6 = dmVar2.f16001g;
        String str2 = dmVar2.f15996b.zzcpb;
        JSONObject jSONObject = dmVar2.f16002h;
        zzaeq zzaeq = dmVar2.f15996b.zzcpl;
        List list4 = dmVar2.f15996b.zzcpm;
        List list5 = dmVar2.f15996b.zzcpm;
        boolean z2 = dmVar2.f15996b.zzcpo;
        zzaaz zzaaz = dmVar2.f15996b.zzcpp;
        List list6 = dmVar2.f15996b.zzcdn;
        String str3 = dmVar2.f15996b.zzcps;
        long j7 = j6;
        ahw ahw = dmVar2.f16003i;
        String str4 = str3;
        zzaeq zzaeq2 = zzaeq;
        List list7 = list4;
        List list8 = list5;
        boolean z3 = z2;
        zzaaz zzaaz2 = zzaaz;
        List list9 = list6;
        zzanh zzanh = null;
        JSONObject jSONObject2 = jSONObject;
        int i3 = i;
        zzjn zzjn2 = zzjn;
        ari ari = null;
        String str5 = str2;
        zzva zzva = null;
        long j8 = j4;
        ahw ahw2 = ahw;
        String str6 = null;
        boolean z4 = dmVar2.f15996b.zzaqv;
        return new dl(zzjj, zzanh, list, i3, list2, list3, i2, j, str, z, ari, zzva, str6, arj2, null, j3, zzjn2, j8, j5, j7, str5, jSONObject2, null, zzaeq2, list7, list8, z3, zzaaz2, null, list9, str4, ahw2, z4, dmVar2.f16004j);
    }

    /* renamed from: b */
    private final boolean m18585b(dl dlVar, dl dlVar2) {
        dl dlVar3 = dlVar2;
        List list = null;
        m18591b(null);
        if (this.e.m8677d()) {
            try {
                Handler handler;
                Runnable bkVar;
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
                    zzou zzou = amn;
                    zzou.zzb(new amu(r7.e.f7163c, r7, r7.e.f7164d, zzme, amn));
                    handler = fk.f16060a;
                    bkVar = new bk(r7, zzou);
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
                    handler = fk.f16060a;
                    bkVar = new bl(r7, amp);
                } else if (zzmj == null || r7.e.f7180t == null || r7.e.f7180t.get(zzmj.getCustomTemplateId()) == null) {
                    ec.e("No matching mapper/listener for retrieved native ad template.");
                    mo3997a(0);
                    return false;
                } else {
                    fk.f16060a.post(new bm(r7, zzmj));
                    return super.mo3743a(dlVar, dlVar2);
                }
                handler.post(bkVar);
                return super.mo3743a(dlVar, dlVar2);
            } catch (Throwable e) {
                ec.c("Failed to get native ad mapper", e);
            }
        } else {
            ec.e("Native ad does not have custom rendering mode.");
        }
        mo3997a(0);
        return false;
    }

    /* renamed from: c */
    private final boolean m18586c(dl dlVar, dl dlVar2) {
        View a = C2406p.m8733a(dlVar2);
        if (a == null) {
            return false;
        }
        View nextView = this.e.f7166f.getNextView();
        if (nextView != null) {
            if (nextView instanceof zzanh) {
                ((zzanh) nextView).destroy();
            }
            this.e.f7166f.removeView(nextView);
        }
        if (!C2406p.m8745b(dlVar2)) {
            try {
                m17090a(a);
            } catch (Throwable th) {
                ar.m8652i().a(th, "AdLoaderManager.swapBannerViews");
                ec.c("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.e.f7166f.getChildCount() > 1) {
            this.e.f7166f.showNext();
        }
        if (dlVar != null) {
            View nextView2 = this.e.f7166f.getNextView();
            if (nextView2 != null) {
                this.e.f7166f.removeView(nextView2);
            }
            this.e.m8676c();
        }
        this.e.f7166f.setMinimumWidth(zzbs().widthPixels);
        this.e.f7166f.setMinimumHeight(zzbs().heightPixels);
        this.e.f7166f.requestLayout();
        this.e.f7166f.setVisibility(0);
        return true;
    }

    @Nullable
    /* renamed from: g */
    private final arj m18587g() {
        return (this.e.f7170j == null || !this.e.f7170j.f15981m) ? null : this.e.f7170j.f15985q;
    }

    /* renamed from: a */
    public final void mo3999a(dm dmVar, amb amb) {
        dl a;
        this.f14811k = null;
        if (dmVar.f15999e != -2) {
            a = m18584a(dmVar, dmVar.f15999e);
        } else {
            if (!dmVar.f15996b.zzcow) {
                ec.e("partialAdState is not mediation");
                a = m18584a(dmVar, 0);
            }
            if (this.f14811k == null) {
                fk.f16060a.post(new bj(this));
            }
            if (dmVar.f15998d != null) {
                this.e.f7169i = dmVar.f15998d;
            }
            this.e.f7152F = 0;
            as asVar = this.e;
            ar.m8647d();
            asVar.f7168h = aum.a(this.e.f7163c, this, dmVar, this.e.f7164d, null, this.i, this, amb);
            return;
        }
        this.f14811k = a;
        if (this.f14811k == null) {
            if (dmVar.f15998d != null) {
                this.e.f7169i = dmVar.f15998d;
            }
            this.e.f7152F = 0;
            as asVar2 = this.e;
            ar.m8647d();
            asVar2.f7168h = aum.a(this.e.f7163c, this, dmVar, this.e.f7164d, null, this.i, this, amb);
            return;
        }
        fk.f16060a.post(new bj(this));
    }

    /* renamed from: a */
    protected final boolean mo3743a(@Nullable dl dlVar, dl dlVar2) {
        if (this.e.m8677d()) {
            String str;
            if (dlVar2.f15981m) {
                if (dlVar2.f15982n != null && dlVar2.f15982n.a()) {
                    Object obj;
                    if (this.e.m8677d() && this.e.f7166f != null) {
                        this.e.f7166f.m8680a().c(dlVar2.f15994z);
                    }
                    if (super.mo3743a(dlVar, dlVar2)) {
                        if (!this.e.m8677d() || m18586c(dlVar, dlVar2)) {
                            if (!this.e.m8678e()) {
                                super.mo4035a(dlVar2, false);
                            }
                            obj = 1;
                            if (obj == null) {
                                return false;
                            }
                            this.f14812l = true;
                        } else {
                            mo3997a(0);
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        return false;
                    }
                    this.f14812l = true;
                } else if (dlVar2.f15982n == null || !dlVar2.f15982n.b()) {
                    mo3997a(0);
                    str = "Response is neither banner nor native.";
                } else if (!m18585b(dlVar, dlVar2)) {
                    return false;
                }
                m18592c(new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(2)})));
                return true;
            }
            mo3997a(0);
            str = "newState is not mediation.";
            ec.e(str);
            return false;
        }
        throw new IllegalStateException("AdLoader API does not support custom rendering.");
    }

    /* renamed from: a */
    protected final boolean mo4001a(zzjj zzjj, dl dlVar, boolean z) {
        return false;
    }

    /* renamed from: b */
    public final void m18591b(@Nullable List<String> list) {
        ad.m9053b("setNativeTemplates must be called on the main UI thread.");
        this.e.f7149C = list;
    }

    /* renamed from: c */
    public final void m18592c(List<Integer> list) {
        ad.m9053b("setAllowedAdTypes must be called on the main UI thread.");
        this.e.f7185y = list;
    }

    /* renamed from: e */
    protected final void mo4002e() {
        super.mo4002e();
        dl dlVar = this.e.f7170j;
        if (!(dlVar == null || dlVar.f15982n == null || !dlVar.f15982n.a() || this.e.f7184x == null)) {
            try {
                this.e.f7184x.zza(this, C4296b.m17261a(this.e.f7163c));
            } catch (Throwable e) {
                ec.c("Could not call PublisherAdViewLoadedListener.onPublisherAdViewLoaded().", e);
            }
        }
    }

    @Nullable
    public final zzll getVideoController() {
        return null;
    }

    public final void pause() {
        if (this.f14812l) {
            super.pause();
            return;
        }
        throw new IllegalStateException("Native Ad does not support pause().");
    }

    public final void resume() {
        if (this.f14812l) {
            super.resume();
            return;
        }
        throw new IllegalStateException("Native Ad does not support resume().");
    }

    public final void setManualImpressionsEnabled(boolean z) {
        ad.m9053b("setManualImpressionsEnabled must be called from the main thread.");
        this.f14810j = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    public final void zza(zzoa zzoa) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    public final void zza(zzoq zzoq) {
        ec.e("Unexpected call to AdLoaderManager method");
    }

    public final void zza(zzos zzos) {
        ec.e("Unexpected call to AdLoaderManager method");
    }

    public final boolean zzb(zzjj zzjj) {
        av avVar;
        zzjj zzjj2 = zzjj;
        Object obj = (this.e.f7185y != null && avVar.e.f7185y.size() == 1 && ((Integer) avVar.e.f7185y.get(0)).intValue() == 2) ? 1 : null;
        if (obj != null) {
            ec.c("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            mo3997a(0);
            return false;
        } else if (avVar.e.f7184x == null) {
            return super.zzb(zzjj);
        } else {
            if (zzjj2.zzbdk != avVar.f14810j) {
                boolean z;
                String str;
                zzmn zzmn;
                int i = zzjj2.versionCode;
                long j = zzjj2.zzbdf;
                Bundle bundle = zzjj2.extras;
                int i2 = zzjj2.zzbdg;
                List list = zzjj2.zzbdh;
                boolean z2 = zzjj2.zzbdi;
                int i3 = zzjj2.zzbdj;
                if (!zzjj2.zzbdk) {
                    if (!avVar.f14810j) {
                        z = false;
                        str = zzjj2.zzbdl;
                        zzmn = zzjj2.zzbdm;
                        zzjj2 = new zzjj(i, j, bundle, i2, list, z2, i3, z, str, zzmn, zzjj2.zzbdn, zzjj2.zzbdo, zzjj2.zzbdp, zzjj2.zzbdq, zzjj2.zzbdr, zzjj2.zzbds, zzjj2.zzbdt, zzjj2.zzbdu);
                        avVar = this;
                    }
                }
                z = true;
                str = zzjj2.zzbdl;
                zzmn = zzjj2.zzbdm;
                zzjj2 = new zzjj(i, j, bundle, i2, list, z2, i3, z, str, zzmn, zzjj2.zzbdn, zzjj2.zzbdo, zzjj2.zzbdp, zzjj2.zzbdq, zzjj2.zzbdr, zzjj2.zzbds, zzjj2.zzbdt, zzjj2.zzbdu);
                avVar = this;
            }
            return super.zzb(zzjj2);
        }
    }

    public final void zzcj() {
        if (this.e.f7170j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.f7170j.f15984p) || this.e.f7170j.f15982n == null || !this.e.f7170j.f15982n.b()) {
            super.zzcj();
        } else {
            zzca();
        }
    }

    public final void zzco() {
        if (this.e.f7170j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.f7170j.f15984p) || this.e.f7170j.f15982n == null || !this.e.f7170j.f15982n.b()) {
            super.zzco();
        } else {
            zzbz();
        }
    }

    public final void zzcv() {
        ec.e("Unexpected call to AdLoaderManager method");
    }

    public final boolean zzcw() {
        return m18587g() != null ? m18587g().f15655o : false;
    }

    public final boolean zzcx() {
        return m18587g() != null ? m18587g().f15656p : false;
    }

    @Nullable
    public final zzqw zzs(String str) {
        ad.m9053b("getOnCustomClickListener must be called on the main UI thread.");
        return (zzqw) this.e.f7179s.get(str);
    }
}
