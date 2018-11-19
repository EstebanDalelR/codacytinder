package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.common.util.C2526k;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.atv;
import com.google.android.gms.internal.atx;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzzv;
import java.util.Collections;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.overlay.c */
public final class C4275c extends atx implements zzt {
    /* renamed from: b */
    private static int f13900b = Color.argb(0, 0, 0, 0);
    /* renamed from: a */
    AdOverlayInfoParcel f13901a;
    /* renamed from: c */
    private final Activity f13902c;
    /* renamed from: d */
    private zzanh f13903d;
    /* renamed from: e */
    private C2398g f13904e;
    /* renamed from: f */
    private C2402l f13905f;
    /* renamed from: g */
    private boolean f13906g = false;
    /* renamed from: h */
    private FrameLayout f13907h;
    /* renamed from: i */
    private CustomViewCallback f13908i;
    /* renamed from: j */
    private boolean f13909j = false;
    /* renamed from: k */
    private boolean f13910k = false;
    /* renamed from: l */
    private C2397f f13911l;
    /* renamed from: m */
    private boolean f13912m = false;
    /* renamed from: n */
    private int f13913n = 0;
    /* renamed from: o */
    private final Object f13914o = new Object();
    /* renamed from: p */
    private Runnable f13915p;
    /* renamed from: q */
    private boolean f13916q;
    /* renamed from: r */
    private boolean f13917r;
    /* renamed from: s */
    private boolean f13918s = false;
    /* renamed from: t */
    private boolean f13919t = false;
    /* renamed from: u */
    private boolean f13920u = true;

    public C4275c(Activity activity) {
        this.f13902c = activity;
    }

    /* renamed from: a */
    private final void m17139a(boolean z) {
        int intValue = ((Integer) aja.f().a(alo.cI)).intValue();
        C2403m c2403m = new C2403m();
        c2403m.f7317e = 50;
        c2403m.f7313a = z ? intValue : 0;
        c2403m.f7314b = z ? 0 : intValue;
        c2403m.f7315c = 0;
        c2403m.f7316d = intValue;
        this.f13905f = new C2402l(this.f13902c, c2403m, this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        m17146a(z, this.f13901a.zzcjb);
        this.f13911l.addView(this.f13905f, layoutParams);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final void m17140b(boolean r21) throws com.google.android.gms.ads.internal.overlay.zzg {
        /*
        r20 = this;
        r1 = r20;
        r3 = r1.f13917r;
        r4 = 1;
        if (r3 != 0) goto L_0x000c;
    L_0x0007:
        r3 = r1.f13902c;
        r3.requestWindowFeature(r4);
    L_0x000c:
        r3 = r1.f13902c;
        r3 = r3.getWindow();
        if (r3 != 0) goto L_0x001c;
    L_0x0014:
        r2 = new com.google.android.gms.ads.internal.overlay.zzg;
        r3 = "Invalid activity, no window available.";
        r2.<init>(r3);
        throw r2;
    L_0x001c:
        r5 = com.google.android.gms.common.util.C2526k.m9217h();
        if (r5 == 0) goto L_0x0048;
    L_0x0022:
        r5 = com.google.android.gms.internal.alo.cG;
        r6 = com.google.android.gms.internal.aja.f();
        r5 = r6.a(r5);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x0048;
    L_0x0034:
        com.google.android.gms.ads.internal.ar.m8648e();
        r5 = r1.f13902c;
        r6 = r1.f13902c;
        r6 = r6.getResources();
        r6 = r6.getConfiguration();
        r5 = com.google.android.gms.internal.fk.a(r5, r6);
        goto L_0x0049;
    L_0x0048:
        r5 = 1;
    L_0x0049:
        r6 = r1.f13901a;
        r6 = r6.zzcjg;
        r7 = 0;
        if (r6 == 0) goto L_0x005a;
    L_0x0050:
        r6 = r1.f13901a;
        r6 = r6.zzcjg;
        r6 = r6.zzaqp;
        if (r6 == 0) goto L_0x005a;
    L_0x0058:
        r6 = 1;
        goto L_0x005b;
    L_0x005a:
        r6 = 0;
    L_0x005b:
        r8 = r1.f13910k;
        if (r8 == 0) goto L_0x0061;
    L_0x005f:
        if (r6 == 0) goto L_0x0097;
    L_0x0061:
        if (r5 == 0) goto L_0x0097;
    L_0x0063:
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3.setFlags(r5, r5);
        r5 = com.google.android.gms.internal.alo.aD;
        r6 = com.google.android.gms.internal.aja.f();
        r5 = r6.a(r5);
        r5 = (java.lang.Boolean) r5;
        r5 = r5.booleanValue();
        if (r5 == 0) goto L_0x0097;
    L_0x007a:
        r5 = com.google.android.gms.common.util.C2526k.m9214e();
        if (r5 == 0) goto L_0x0097;
    L_0x0080:
        r5 = r1.f13901a;
        r5 = r5.zzcjg;
        if (r5 == 0) goto L_0x0097;
    L_0x0086:
        r5 = r1.f13901a;
        r5 = r5.zzcjg;
        r5 = r5.zzaqu;
        if (r5 == 0) goto L_0x0097;
    L_0x008e:
        r5 = r3.getDecorView();
        r6 = 4098; // 0x1002 float:5.743E-42 double:2.0247E-320;
        r5.setSystemUiVisibility(r6);
    L_0x0097:
        r5 = r1.f13901a;
        r5 = r5.zzciy;
        r6 = 0;
        if (r5 == 0) goto L_0x00a7;
    L_0x009e:
        r5 = r1.f13901a;
        r5 = r5.zzciy;
        r5 = r5.zzsz();
        goto L_0x00a8;
    L_0x00a7:
        r5 = r6;
    L_0x00a8:
        if (r5 == 0) goto L_0x00af;
    L_0x00aa:
        r5 = r5.b();
        goto L_0x00b0;
    L_0x00af:
        r5 = 0;
    L_0x00b0:
        r1.f13912m = r7;
        if (r5 == 0) goto L_0x00f2;
    L_0x00b4:
        r8 = r1.f13901a;
        r8 = r8.orientation;
        r9 = com.google.android.gms.ads.internal.ar.m8650g();
        r9 = r9.a();
        if (r8 != r9) goto L_0x00d4;
    L_0x00c2:
        r8 = r1.f13902c;
        r8 = r8.getResources();
        r8 = r8.getConfiguration();
        r8 = r8.orientation;
        if (r8 != r4) goto L_0x00d1;
    L_0x00d0:
        r7 = 1;
    L_0x00d1:
        r1.f13912m = r7;
        goto L_0x00f2;
    L_0x00d4:
        r8 = r1.f13901a;
        r8 = r8.orientation;
        r9 = com.google.android.gms.ads.internal.ar.m8650g();
        r9 = r9.b();
        if (r8 != r9) goto L_0x00f2;
    L_0x00e2:
        r8 = r1.f13902c;
        r8 = r8.getResources();
        r8 = r8.getConfiguration();
        r8 = r8.orientation;
        r9 = 2;
        if (r8 != r9) goto L_0x00d1;
    L_0x00f1:
        goto L_0x00d0;
    L_0x00f2:
        r7 = r1.f13912m;
        r8 = 46;
        r9 = new java.lang.StringBuilder;
        r9.<init>(r8);
        r8 = "Delay onShow to next orientation change: ";
        r9.append(r8);
        r9.append(r7);
        r7 = r9.toString();
        com.google.android.gms.internal.ec.b(r7);
        r7 = r1.f13901a;
        r7 = r7.orientation;
        r1.m17144a(r7);
        r7 = com.google.android.gms.ads.internal.ar.m8650g();
        r3 = r7.a(r3);
        if (r3 == 0) goto L_0x0120;
    L_0x011b:
        r3 = "Hardware acceleration on the AdActivity window enabled.";
        com.google.android.gms.internal.ec.b(r3);
    L_0x0120:
        r3 = r1.f13910k;
        if (r3 != 0) goto L_0x012c;
    L_0x0124:
        r3 = r1.f13911l;
        r7 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
    L_0x0128:
        r3.setBackgroundColor(r7);
        goto L_0x0131;
    L_0x012c:
        r3 = r1.f13911l;
        r7 = f13900b;
        goto L_0x0128;
    L_0x0131:
        r3 = r1.f13902c;
        r7 = r1.f13911l;
        r3.setContentView(r7);
        r1.f13917r = r4;
        if (r21 == 0) goto L_0x0214;
    L_0x013c:
        r8 = com.google.android.gms.ads.internal.ar.m8649f();	 Catch:{ Exception -> 0x0205 }
        r9 = r1.f13902c;	 Catch:{ Exception -> 0x0205 }
        r3 = r1.f13901a;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzciy;	 Catch:{ Exception -> 0x0205 }
        if (r3 == 0) goto L_0x0152;
    L_0x0148:
        r3 = r1.f13901a;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzciy;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzsx();	 Catch:{ Exception -> 0x0205 }
        r10 = r3;
        goto L_0x0153;
    L_0x0152:
        r10 = r6;
    L_0x0153:
        r3 = r1.f13901a;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzciy;	 Catch:{ Exception -> 0x0205 }
        if (r3 == 0) goto L_0x0163;
    L_0x0159:
        r3 = r1.f13901a;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzciy;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzsy();	 Catch:{ Exception -> 0x0205 }
        r11 = r3;
        goto L_0x0164;
    L_0x0163:
        r11 = r6;
    L_0x0164:
        r12 = 1;
        r14 = 0;
        r3 = r1.f13901a;	 Catch:{ Exception -> 0x0205 }
        r15 = r3.zzaty;	 Catch:{ Exception -> 0x0205 }
        r16 = 0;
        r17 = 0;
        r3 = r1.f13901a;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzciy;	 Catch:{ Exception -> 0x0205 }
        if (r3 == 0) goto L_0x017f;
    L_0x0174:
        r3 = r1.f13901a;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzciy;	 Catch:{ Exception -> 0x0205 }
        r3 = r3.zzbq();	 Catch:{ Exception -> 0x0205 }
        r18 = r3;
        goto L_0x0181;
    L_0x017f:
        r18 = r6;
    L_0x0181:
        r19 = com.google.android.gms.internal.ahw.a();	 Catch:{ Exception -> 0x0205 }
        r13 = r5;
        r3 = r8.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);	 Catch:{ Exception -> 0x0205 }
        r1.f13903d = r3;	 Catch:{ Exception -> 0x0205 }
        r3 = r1.f13903d;
        r7 = r3.zzsz();
        r8 = 0;
        r9 = 0;
        r3 = r1.f13901a;
        r10 = r3.zzciz;
        r3 = r1.f13901a;
        r11 = r3.zzcjd;
        r12 = 1;
        r13 = 0;
        r3 = r1.f13901a;
        r3 = r3.zzciy;
        if (r3 == 0) goto L_0x01b2;
    L_0x01a4:
        r3 = r1.f13901a;
        r3 = r3.zzciy;
        r3 = r3.zzsz();
        r3 = r3.a();
        r14 = r3;
        goto L_0x01b3;
    L_0x01b2:
        r14 = r6;
    L_0x01b3:
        r15 = 0;
        r16 = 0;
        r7.a(r8, r9, r10, r11, r12, r13, r14, r15, r16);
        r3 = r1.f13903d;
        r3 = r3.zzsz();
        r7 = new com.google.android.gms.ads.internal.overlay.d;
        r7.<init>(r1);
        r3.a(r7);
        r3 = r1.f13901a;
        r3 = r3.url;
        if (r3 == 0) goto L_0x01d7;
    L_0x01cd:
        r3 = r1.f13903d;
        r7 = r1.f13901a;
        r7 = r7.url;
        r3.loadUrl(r7);
        goto L_0x01ef;
    L_0x01d7:
        r3 = r1.f13901a;
        r3 = r3.zzcjc;
        if (r3 == 0) goto L_0x01fd;
    L_0x01dd:
        r7 = r1.f13903d;
        r3 = r1.f13901a;
        r8 = r3.zzcja;
        r3 = r1.f13901a;
        r9 = r3.zzcjc;
        r10 = "text/html";
        r11 = "UTF-8";
        r12 = 0;
        r7.loadDataWithBaseURL(r8, r9, r10, r11, r12);
    L_0x01ef:
        r3 = r1.f13901a;
        r3 = r3.zzciy;
        if (r3 == 0) goto L_0x0221;
    L_0x01f5:
        r3 = r1.f13901a;
        r3 = r3.zzciy;
        r3.zzc(r1);
        goto L_0x0221;
    L_0x01fd:
        r2 = new com.google.android.gms.ads.internal.overlay.zzg;
        r3 = "No URL or HTML to display in ad overlay.";
        r2.<init>(r3);
        throw r2;
    L_0x0205:
        r0 = move-exception;
        r2 = r0;
        r3 = "Error obtaining webview.";
        com.google.android.gms.internal.ec.b(r3, r2);
        r2 = new com.google.android.gms.ads.internal.overlay.zzg;
        r3 = "Could not obtain webview for the overlay.";
        r2.<init>(r3);
        throw r2;
    L_0x0214:
        r3 = r1.f13901a;
        r3 = r3.zzciy;
        r1.f13903d = r3;
        r3 = r1.f13903d;
        r7 = r1.f13902c;
        r3.setContext(r7);
    L_0x0221:
        r3 = r1.f13903d;
        r3.zzb(r1);
        r3 = r1.f13903d;
        r3 = r3.getParent();
        if (r3 == 0) goto L_0x023e;
    L_0x022e:
        r7 = r3 instanceof android.view.ViewGroup;
        if (r7 == 0) goto L_0x023e;
    L_0x0232:
        r3 = (android.view.ViewGroup) r3;
        r7 = r1.f13903d;
        if (r7 != 0) goto L_0x0239;
    L_0x0238:
        throw r6;
    L_0x0239:
        r7 = (android.view.View) r7;
        r3.removeView(r7);
    L_0x023e:
        r3 = r1.f13910k;
        if (r3 == 0) goto L_0x0247;
    L_0x0242:
        r3 = r1.f13903d;
        r3.zztk();
    L_0x0247:
        r3 = r1.f13911l;
        r7 = r1.f13903d;
        if (r7 != 0) goto L_0x024e;
    L_0x024d:
        throw r6;
    L_0x024e:
        r7 = (android.view.View) r7;
        r6 = -1;
        r3.addView(r7, r6, r6);
        if (r21 != 0) goto L_0x025d;
    L_0x0256:
        r2 = r1.f13912m;
        if (r2 != 0) goto L_0x025d;
    L_0x025a:
        r20.m17142i();
    L_0x025d:
        r1.m17139a(r5);
        r2 = r1.f13903d;
        r2 = r2.zzta();
        if (r2 == 0) goto L_0x026b;
    L_0x0268:
        r1.m17146a(r5, r4);
    L_0x026b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.c.b(boolean):void");
    }

    /* renamed from: h */
    private final void m17141h() {
        if (this.f13902c.isFinishing() && !this.f13918s) {
            this.f13918s = true;
            if (this.f13903d != null) {
                this.f13903d.zzag(this.f13913n);
                synchronized (this.f13914o) {
                    if (this.f13916q || !this.f13903d.zztg()) {
                    } else {
                        this.f13915p = new C2396e(this);
                        fk.f16060a.postDelayed(this.f13915p, ((Long) aja.f().a(alo.aC)).longValue());
                        return;
                    }
                }
            }
            m17149d();
        }
    }

    /* renamed from: i */
    private final void m17142i() {
        this.f13903d.zzmz();
    }

    /* renamed from: a */
    public final void m17143a() {
        this.f13913n = 2;
        this.f13902c.finish();
    }

    /* renamed from: a */
    public final void m17144a(int i) {
        this.f13902c.setRequestedOrientation(i);
    }

    /* renamed from: a */
    public final void m17145a(View view, CustomViewCallback customViewCallback) {
        this.f13907h = new FrameLayout(this.f13902c);
        this.f13907h.setBackgroundColor(-16777216);
        this.f13907h.addView(view, -1, -1);
        this.f13902c.setContentView(this.f13907h);
        this.f13917r = true;
        this.f13908i = customViewCallback;
        this.f13906g = true;
    }

    /* renamed from: a */
    public final void m17146a(boolean z, boolean z2) {
        boolean z3 = false;
        Object obj = (!((Boolean) aja.f().a(alo.aE)).booleanValue() || this.f13901a == null || this.f13901a.zzcjg == null || !this.f13901a.zzcjg.zzaqv) ? null : 1;
        if (z && z2 && obj != null) {
            new atv(this.f13903d, "useCustomClose").a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.f13905f != null) {
            C2402l c2402l = this.f13905f;
            if (z2 && obj == null) {
                z3 = true;
            }
            c2402l.m8732a(z, z3);
        }
    }

    /* renamed from: b */
    public final void m17147b() {
        if (this.f13901a != null && this.f13906g) {
            m17144a(this.f13901a.orientation);
        }
        if (this.f13907h != null) {
            this.f13902c.setContentView(this.f13911l);
            this.f13917r = true;
            this.f13907h.removeAllViews();
            this.f13907h = null;
        }
        if (this.f13908i != null) {
            this.f13908i.onCustomViewHidden();
            this.f13908i = null;
        }
        this.f13906g = false;
    }

    /* renamed from: c */
    public final void m17148c() {
        this.f13911l.removeView(this.f13905f);
        m17139a(true);
    }

    /* renamed from: d */
    final void m17149d() {
        if (!this.f13919t) {
            this.f13919t = true;
            if (this.f13903d != null) {
                C2397f c2397f = this.f13911l;
                zzanh zzanh = this.f13903d;
                if (zzanh == null) {
                    throw null;
                }
                c2397f.removeView((View) zzanh);
                if (this.f13904e != null) {
                    this.f13903d.setContext(this.f13904e.f7308d);
                    this.f13903d.zzad(false);
                    ViewGroup viewGroup = this.f13904e.f7307c;
                    zzanh = this.f13903d;
                    if (zzanh == null) {
                        throw null;
                    }
                    viewGroup.addView((View) zzanh, this.f13904e.f7305a, this.f13904e.f7306b);
                    this.f13904e = null;
                } else if (this.f13902c.getApplicationContext() != null) {
                    this.f13903d.setContext(this.f13902c.getApplicationContext());
                }
                this.f13903d = null;
            }
            if (!(this.f13901a == null || this.f13901a.zzcix == null)) {
                this.f13901a.zzcix.zzcg();
            }
        }
    }

    /* renamed from: e */
    public final void m17150e() {
        if (this.f13912m) {
            this.f13912m = false;
            m17142i();
        }
    }

    /* renamed from: f */
    public final void m17151f() {
        this.f13911l.f7303a = true;
    }

    /* renamed from: g */
    public final void m17152g() {
        synchronized (this.f13914o) {
            this.f13916q = true;
            if (this.f13915p != null) {
                fk.f16060a.removeCallbacks(this.f13915p);
                fk.f16060a.post(this.f13915p);
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed() {
        this.f13913n = 0;
    }

    public final void onCreate(Bundle bundle) {
        this.f13902c.requestWindowFeature(1);
        this.f13909j = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.f13901a = AdOverlayInfoParcel.zzc(this.f13902c.getIntent());
            if (this.f13901a == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (this.f13901a.zzaty.zzdek > 7500000) {
                this.f13913n = 3;
            }
            if (this.f13902c.getIntent() != null) {
                this.f13920u = this.f13902c.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.f13901a.zzcjg != null) {
                this.f13910k = this.f13901a.zzcjg.zzaqo;
            } else {
                this.f13910k = false;
            }
            if (((Boolean) aja.f().a(alo.bE)).booleanValue() && this.f13910k && this.f13901a.zzcjg.zzaqt != -1) {
                new C4276h().e();
            }
            if (bundle == null) {
                if (this.f13901a.zzcix != null && this.f13920u) {
                    this.f13901a.zzcix.zzch();
                }
                if (!(this.f13901a.zzcje == 1 || this.f13901a.zzciw == null)) {
                    this.f13901a.zzciw.onAdClicked();
                }
            }
            this.f13911l = new C2397f(this.f13902c, this.f13901a.zzcjf, this.f13901a.zzaty.zzcv);
            this.f13911l.setId(AdError.NETWORK_ERROR_CODE);
            switch (this.f13901a.zzcje) {
                case 1:
                    m17140b(false);
                    return;
                case 2:
                    this.f13904e = new C2398g(this.f13901a.zzciy);
                    m17140b(false);
                    return;
                case 3:
                    m17140b(true);
                    return;
                case 4:
                    if (this.f13909j) {
                        this.f13913n = 3;
                        this.f13902c.finish();
                        return;
                    }
                    ar.m8645b();
                    if (!C2394a.m8730a(this.f13902c, this.f13901a.zzciv, this.f13901a.zzcjd)) {
                        this.f13913n = 3;
                        this.f13902c.finish();
                    }
                    return;
                default:
                    throw new zzg("Could not determine ad overlay type.");
            }
        } catch (zzg e) {
            ec.e(e.getMessage());
            this.f13913n = 3;
            this.f13902c.finish();
        }
    }

    public final void onDestroy() {
        if (this.f13903d != null) {
            C2397f c2397f = this.f13911l;
            zzanh zzanh = this.f13903d;
            if (zzanh == null) {
                throw null;
            }
            c2397f.removeView((View) zzanh);
        }
        m17141h();
    }

    public final void onPause() {
        m17147b();
        if (this.f13901a.zzcix != null) {
            this.f13901a.zzcix.onPause();
        }
        if (!(((Boolean) aja.f().a(alo.cH)).booleanValue() || this.f13903d == null || (this.f13902c.isFinishing() && this.f13904e != null))) {
            ar.m8650g();
            fq.a(this.f13903d);
        }
        m17141h();
    }

    public final void onRestart() {
    }

    public final void onResume() {
        if (this.f13901a != null && this.f13901a.zzcje == 4) {
            if (this.f13909j) {
                this.f13913n = 3;
                this.f13902c.finish();
            } else {
                this.f13909j = true;
            }
        }
        if (this.f13901a.zzcix != null) {
            this.f13901a.zzcix.onResume();
        }
        if (!((Boolean) aja.f().a(alo.cH)).booleanValue()) {
            if (this.f13903d == null || this.f13903d.isDestroyed()) {
                ec.e("The webview does not exist. Ignoring action.");
            } else {
                ar.m8650g();
                fq.b(this.f13903d);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f13909j);
    }

    public final void onStart() {
        if (((Boolean) aja.f().a(alo.cH)).booleanValue()) {
            if (this.f13903d == null || this.f13903d.isDestroyed()) {
                ec.e("The webview does not exist. Ignoring action.");
            } else {
                ar.m8650g();
                fq.b(this.f13903d);
            }
        }
    }

    public final void onStop() {
        if (((Boolean) aja.f().a(alo.cH)).booleanValue() && this.f13903d != null && (!this.f13902c.isFinishing() || this.f13904e == null)) {
            ar.m8650g();
            fq.a(this.f13903d);
        }
        m17141h();
    }

    public final void zzbf() {
        this.f13917r = true;
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        if (((Boolean) aja.f().a(alo.cG)).booleanValue() && C2526k.m9217h()) {
            Configuration configuration = (Configuration) C4296b.m17262a(iObjectWrapper);
            ar.m8648e();
            if (fk.a(this.f13902c, configuration)) {
                this.f13902c.getWindow().addFlags(1024);
                this.f13902c.getWindow().clearFlags(ItemAnimator.FLAG_MOVED);
                return;
            }
            this.f13902c.getWindow().addFlags(ItemAnimator.FLAG_MOVED);
            this.f13902c.getWindow().clearFlags(1024);
        }
    }

    public final void zzmt() {
        this.f13913n = 1;
        this.f13902c.finish();
    }

    public final boolean zzmu() {
        this.f13913n = 0;
        if (this.f13903d == null) {
            return true;
        }
        boolean zzte = this.f13903d.zzte();
        if (!zzte) {
            this.f13903d.zza("onbackblocked", Collections.emptyMap());
        }
        return zzte;
    }
}
