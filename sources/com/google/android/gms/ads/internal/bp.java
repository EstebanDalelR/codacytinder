package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.C2343d;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.internal.aga;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.dd;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.mb;
import com.google.android.gms.internal.zzafb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanv;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzvj;
import com.google.android.gms.internal.zzvm;
import com.google.android.gms.internal.zzzv;
import java.lang.ref.WeakReference;
import java.util.List;

@zzzv
public final class bp extends ba implements OnGlobalLayoutListener, OnScrollChangedListener {
    /* renamed from: j */
    private boolean f14828j;
    /* renamed from: k */
    private WeakReference<Object> f14829k = new WeakReference(null);

    public bp(Context context, zzjn zzjn, String str, zzux zzux, zzakd zzakd, bn bnVar) {
        super(context, zzjn, str, zzux, zzakd, bnVar);
    }

    /* renamed from: b */
    private final boolean m18643b(@Nullable dl dlVar, dl dlVar2) {
        if (dlVar2.f15981m) {
            View a = C2406p.m8733a(dlVar2);
            if (a == null) {
                ec.e("Could not get mediation view");
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
                    if (ar.m8669z().b(this.e.f7163c)) {
                        new aga(this.e.f7163c, a).a(new dd(this.e.f7163c, this.e.f7162b));
                    }
                    if (dlVar2.f15988t != null) {
                        this.e.f7166f.setMinimumWidth(dlVar2.f15988t.widthPixels);
                        this.e.f7166f.setMinimumHeight(dlVar2.f15988t.heightPixels);
                    }
                    m17090a(a);
                } catch (Throwable e) {
                    ar.m8652i().a(e, "BannerAdManager.swapViews");
                    ec.c("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else if (!(dlVar2.f15988t == null || dlVar2.f15970b == null)) {
            dlVar2.f15970b.zza(mb.a(dlVar2.f15988t));
            this.e.f7166f.removeAllViews();
            this.e.f7166f.setMinimumWidth(dlVar2.f15988t.widthPixels);
            this.e.f7166f.setMinimumHeight(dlVar2.f15988t.heightPixels);
            zzanh zzanh = dlVar2.f15970b;
            if (zzanh == null) {
                throw null;
            }
            m17090a((View) zzanh);
        }
        if (this.e.f7166f.getChildCount() > 1) {
            this.e.f7166f.showNext();
        }
        if (dlVar != null) {
            View nextView2 = this.e.f7166f.getNextView();
            if (nextView2 instanceof zzanh) {
                ((zzanh) nextView2).destroy();
            } else if (nextView2 != null) {
                this.e.f7166f.removeView(nextView2);
            }
            this.e.m8676c();
        }
        this.e.f7166f.setVisibility(0);
        return true;
    }

    /* renamed from: a */
    protected final zzanh mo4034a(dm dmVar, @Nullable bo boVar, @Nullable zzafb zzafb) throws zzanv {
        if (this.e.f7169i.zzbem == null && this.e.f7169i.zzbeo) {
            zzjn zzjn;
            as asVar = this.e;
            if (dmVar.f15996b.zzbeo) {
                zzjn = this.e.f7169i;
            } else {
                C2343d c2343d;
                String str = dmVar.f15996b.zzcoz;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    c2343d = new C2343d(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    c2343d = this.e.f7169i.zzht();
                }
                zzjn = new zzjn(this.e.f7163c, c2343d);
            }
            asVar.f7169i = zzjn;
        }
        return super.mo4034a(dmVar, boVar, zzafb);
    }

    /* renamed from: a */
    protected final void mo4035a(@Nullable dl dlVar, boolean z) {
        super.mo4035a(dlVar, z);
        if (C2406p.m8745b(dlVar)) {
            C2370c c2370c = new C2370c(this);
            if (dlVar != null && C2406p.m8745b(dlVar)) {
                Object obj;
                zzanh zzanh = dlVar.f15970b;
                if (zzanh == null) {
                    obj = null;
                } else if (zzanh == null) {
                    throw null;
                } else {
                    obj = (View) zzanh;
                }
                if (obj == null) {
                    ec.e("AdWebView is null");
                    return;
                }
                try {
                    List list = dlVar.f15982n != null ? dlVar.f15982n.f15637p : null;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            zzvj zzme = dlVar.f15983o != null ? dlVar.f15983o.zzme() : null;
                            zzvm zzmf = dlVar.f15983o != null ? dlVar.f15983o.zzmf() : null;
                            if (list.contains("2") && zzme != null) {
                                zzme.zzi(C4296b.m17261a(obj));
                                if (!zzme.getOverrideImpressionRecording()) {
                                    zzme.recordImpression();
                                }
                                zzanh.zzsz().a("/nativeExpressViewClicked", C2406p.m8734a(zzme, null, c2370c));
                                return;
                            } else if (!list.contains("1") || zzmf == null) {
                                ec.e("No matching template id and mapper");
                                return;
                            } else {
                                zzmf.zzi(C4296b.m17261a(obj));
                                if (!zzmf.getOverrideImpressionRecording()) {
                                    zzmf.recordImpression();
                                }
                                zzanh.zzsz().a("/nativeExpressViewClicked", C2406p.m8734a(null, zzmf, c2370c));
                                return;
                            }
                        }
                    }
                    ec.e("No template ids present in mediation response");
                } catch (Throwable e) {
                    ec.c("Error occurred while recording impression and registering for clicks", e);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final boolean mo3743a(@android.support.annotation.Nullable com.google.android.gms.internal.dl r5, com.google.android.gms.internal.dl r6) {
        /*
        r4 = this;
        r0 = super.mo3743a(r5, r6);
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r4.e;
        r0 = r0.m8677d();
        if (r0 == 0) goto L_0x0025;
    L_0x0010:
        r5 = r4.m18643b(r5, r6);
        if (r5 != 0) goto L_0x0025;
    L_0x0016:
        r5 = r6.f15963H;
        if (r5 == 0) goto L_0x0021;
    L_0x001a:
        r5 = r6.f15963H;
        r6 = com.google.android.gms.internal.zziu.zza.zzb.zzbbo;
        r5.a(r6);
    L_0x0021:
        r4.mo3997a(r1);
        return r1;
    L_0x0025:
        r5 = r6.f15979k;
        r0 = 0;
        if (r5 == 0) goto L_0x0061;
    L_0x002a:
        r4.m18647c(r6);
        com.google.android.gms.ads.internal.ar.m8668y();
        r5 = r4.e;
        r5 = r5.f7166f;
        com.google.android.gms.internal.jb.a(r5, r4);
        com.google.android.gms.ads.internal.ar.m8668y();
        r5 = r4.e;
        r5 = r5.f7166f;
        com.google.android.gms.internal.jb.a(r5, r4);
        r5 = r6.f15980l;
        if (r5 != 0) goto L_0x007e;
    L_0x0045:
        r5 = new com.google.android.gms.ads.internal.bq;
        r5.<init>(r4);
        r1 = r6.f15970b;
        if (r1 == 0) goto L_0x0055;
    L_0x004e:
        r1 = r6.f15970b;
        r1 = r1.zzsz();
        goto L_0x0056;
    L_0x0055:
        r1 = r0;
    L_0x0056:
        if (r1 == 0) goto L_0x007e;
    L_0x0058:
        r2 = new com.google.android.gms.ads.internal.br;
        r2.<init>(r4, r6, r5);
        r1.a(r2);
        goto L_0x007e;
    L_0x0061:
        r5 = r4.e;
        r5 = r5.m8678e();
        if (r5 == 0) goto L_0x007b;
    L_0x0069:
        r5 = com.google.android.gms.internal.alo.bJ;
        r2 = com.google.android.gms.internal.aja.f();
        r5 = r2.a(r5);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x007e;
    L_0x007b:
        r4.mo4035a(r6, r1);
    L_0x007e:
        r5 = r6.f15970b;
        if (r5 == 0) goto L_0x00a2;
    L_0x0082:
        r5 = r6.f15970b;
        r5 = r5.zzsg();
        r1 = r6.f15970b;
        r1 = r1.zzsz();
        if (r1 == 0) goto L_0x0093;
    L_0x0090:
        r1.h();
    L_0x0093:
        r1 = r4.e;
        r1 = r1.f7182v;
        if (r1 == 0) goto L_0x00a2;
    L_0x0099:
        if (r5 == 0) goto L_0x00a2;
    L_0x009b:
        r1 = r4.e;
        r1 = r1.f7182v;
        r5.a(r1);
    L_0x00a2:
        r5 = r4.e;
        r5 = r5.m8677d();
        if (r5 == 0) goto L_0x0117;
    L_0x00aa:
        r5 = r6.f15970b;
        if (r5 == 0) goto L_0x0132;
    L_0x00ae:
        r5 = r6.f15978j;
        if (r5 == 0) goto L_0x00bb;
    L_0x00b2:
        r5 = r4.g;
        r1 = r4.e;
        r1 = r1.f7169i;
        r5.a(r1, r6);
    L_0x00bb:
        r5 = r6.f15970b;
        if (r5 != 0) goto L_0x00c0;
    L_0x00bf:
        throw r0;
    L_0x00c0:
        r0 = r5;
        r0 = (android.view.View) r0;
        r5 = new com.google.android.gms.internal.aga;
        r1 = r4.e;
        r1 = r1.f7163c;
        r5.<init>(r1, r0);
        r1 = com.google.android.gms.ads.internal.ar.m8669z();
        r2 = r4.e;
        r2 = r2.f7163c;
        r1 = r1.b(r2);
        if (r1 == 0) goto L_0x00fc;
    L_0x00da:
        r1 = r6.f15969a;
        r1 = com.google.android.gms.ads.internal.C4269a.m17085a(r1);
        if (r1 == 0) goto L_0x00fc;
    L_0x00e2:
        r1 = r4.e;
        r1 = r1.f7162b;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x00fc;
    L_0x00ec:
        r1 = new com.google.android.gms.internal.dd;
        r2 = r4.e;
        r2 = r2.f7163c;
        r3 = r4.e;
        r3 = r3.f7162b;
        r1.<init>(r2, r3);
        r5.a(r1);
    L_0x00fc:
        r1 = r6.a();
        if (r1 == 0) goto L_0x0108;
    L_0x0102:
        r1 = r6.f15970b;
        r5.a(r1);
        goto L_0x0132;
    L_0x0108:
        r1 = r6.f15970b;
        r1 = r1.zzsz();
        r2 = new com.google.android.gms.ads.internal.b;
        r2.<init>(r4, r5, r6);
        r1.a(r2);
        goto L_0x0132;
    L_0x0117:
        r5 = r4.e;
        r5 = r5.f7151E;
        if (r5 == 0) goto L_0x0132;
    L_0x011d:
        r5 = r6.f15978j;
        if (r5 == 0) goto L_0x0132;
    L_0x0121:
        r5 = r4.g;
        r0 = r4.e;
        r0 = r0.f7169i;
        r1 = r4.e;
        r1 = r1.f7151E;
        r5.a(r0, r6, r1);
        r5 = r4.e;
        r0 = r5.f7151E;
    L_0x0132:
        r5 = r6.f15981m;
        if (r5 != 0) goto L_0x013b;
    L_0x0136:
        r5 = r4.e;
        r5.m8672a(r0);
    L_0x013b:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.bp.a(com.google.android.gms.internal.dl, com.google.android.gms.internal.dl):boolean");
    }

    /* renamed from: c */
    final void m18647c(@Nullable dl dlVar) {
        if (dlVar != null && !dlVar.f15980l && this.e.f7166f != null && ar.m8648e().a(this.e.f7166f, this.e.f7163c) && this.e.f7166f.getGlobalVisibleRect(new Rect(), null)) {
            if (!(dlVar == null || dlVar.f15970b == null || dlVar.f15970b.zzsz() == null)) {
                dlVar.f15970b.zzsz().a(null);
            }
            mo4035a(dlVar, false);
            dlVar.f15980l = true;
        }
    }

    @Nullable
    public final zzll getVideoController() {
        ad.m9053b("getVideoController must be called from the main thread.");
        return (this.e.f7170j == null || this.e.f7170j.f15970b == null) ? null : this.e.f7170j.f15970b.zzsg();
    }

    /* renamed from: o */
    protected final boolean mo4036o() {
        boolean z;
        ar.m8648e();
        if (fk.a(this.e.f7163c, this.e.f7163c.getPackageName(), "android.permission.INTERNET")) {
            z = true;
        } else {
            aja.a().a(this.e.f7166f, this.e.f7169i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        ar.m8648e();
        if (!fk.a(this.e.f7163c)) {
            aja.a().a(this.e.f7166f, this.e.f7169i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!(z || this.e.f7166f == null)) {
            this.e.f7166f.setVisibility(0);
        }
        return z;
    }

    public final void onGlobalLayout() {
        m18647c(this.e.f7170j);
    }

    public final void onScrollChanged() {
        m18647c(this.e.f7170j);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        ad.m9053b("setManualImpressionsEnabled must be called from the main thread.");
        this.f14828j = z;
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    public final boolean zzb(zzjj zzjj) {
        ba baVar;
        zzjj zzjj2 = zzjj;
        if (zzjj2.zzbdk != this.f14828j) {
            boolean z;
            String str;
            zzmn zzmn;
            Location location;
            Location location2;
            int i = zzjj2.versionCode;
            long j = zzjj2.zzbdf;
            Bundle bundle = zzjj2.extras;
            int i2 = zzjj2.zzbdg;
            List list = zzjj2.zzbdh;
            boolean z2 = zzjj2.zzbdi;
            int i3 = zzjj2.zzbdj;
            if (!zzjj2.zzbdk) {
                if (!baVar.f14828j) {
                    z = false;
                    str = zzjj2.zzbdl;
                    zzmn = zzjj2.zzbdm;
                    location = zzjj2.zzbdn;
                    location2 = location;
                    zzjj2 = new zzjj(i, j, bundle, i2, list, z2, i3, z, str, zzmn, location2, zzjj2.zzbdo, zzjj2.zzbdp, zzjj2.zzbdq, zzjj2.zzbdr, zzjj2.zzbds, zzjj2.zzbdt, zzjj2.zzbdu);
                    baVar = this;
                }
            }
            z = true;
            str = zzjj2.zzbdl;
            zzmn = zzjj2.zzbdm;
            location = zzjj2.zzbdn;
            location2 = location;
            zzjj2 = new zzjj(i, j, bundle, i2, list, z2, i3, z, str, zzmn, location2, zzjj2.zzbdo, zzjj2.zzbdp, zzjj2.zzbdq, zzjj2.zzbdr, zzjj2.zzbds, zzjj2.zzbdt, zzjj2.zzbdu);
            baVar = this;
        }
        return super.zzb(zzjj2);
    }
}
