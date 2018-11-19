package com.facebook.ads.internal.adapters;

import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.facebook.ads.AdNetwork;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAd.Image;
import com.facebook.ads.NativeAd.Rating;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.VideoAutoplayBehavior;
import com.google.android.gms.ads.formats.C2356c;
import com.google.android.gms.ads.formats.C2357d;
import com.google.android.gms.ads.formats.C3732f;
import com.google.android.gms.ads.formats.C3733g;
import com.google.android.gms.ads.formats.NativeContentAd;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.d */
public class C4141d extends C3276y implements C1368w {
    /* renamed from: a */
    private static final String f13133a = "d";
    /* renamed from: b */
    private View f13134b;
    /* renamed from: c */
    private C2356c f13135c;
    /* renamed from: d */
    private C1369z f13136d;
    /* renamed from: e */
    private C2357d f13137e;
    /* renamed from: f */
    private View f13138f;
    /* renamed from: g */
    private boolean f13139g;
    /* renamed from: h */
    private Uri f13140h;
    /* renamed from: i */
    private Uri f13141i;
    /* renamed from: j */
    private String f13142j;
    /* renamed from: k */
    private String f13143k;
    /* renamed from: l */
    private String f13144l;
    /* renamed from: m */
    private String f13145m;

    /* renamed from: com.facebook.ads.internal.adapters.d$4 */
    class C13544 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4141d f3641a;

        C13544(C4141d c4141d) {
            this.f3641a = c4141d;
        }

        public void onClick(View view) {
            this.f3641a.f13138f.performClick();
        }
    }

    /* renamed from: a */
    private void m16256a(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: A */
    public List<NativeAd> mo3289A() {
        return null;
    }

    /* renamed from: B */
    public int mo3290B() {
        return 0;
    }

    /* renamed from: C */
    public int mo3291C() {
        return 0;
    }

    /* renamed from: D */
    public String mo3292D() {
        return null;
    }

    /* renamed from: E */
    public AdNetwork mo3293E() {
        return AdNetwork.ADMOB;
    }

    /* renamed from: F */
    public C1357f mo3294F() {
        return C1357f.ADMOB;
    }

    /* renamed from: a */
    public void mo3295a() {
        m16256a(this.f13138f);
        this.f13138f = null;
        if (this.f13134b != null) {
            View view = (ViewGroup) this.f13134b.getParent();
            if ((view instanceof C3733g) || (view instanceof C3732f)) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    int indexOfChild = viewGroup.indexOfChild(view);
                    m16256a(this.f13134b);
                    m16256a(view);
                    viewGroup.addView(this.f13134b, indexOfChild);
                }
            }
            this.f13134b = null;
        }
        this.f13137e = null;
    }

    /* renamed from: a */
    public void mo3296a(int i) {
    }

    /* renamed from: a */
    public void mo3297a(final android.content.Context r11, com.facebook.ads.internal.adapters.C1369z r12, com.facebook.ads.internal.p041h.C1425f r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r10 = this;
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r0 = r10.mo3294F();
        r0 = com.facebook.ads.internal.p047k.C1513y.m5314a(r0);
        r13.append(r0);
        r0 = " Loading";
        r13.append(r0);
        r13 = r13.toString();
        com.facebook.ads.internal.p047k.C1490h.m5250a(r11, r13);
        r13 = "data";
        r13 = r14.get(r13);
        r13 = (org.json.JSONObject) r13;
        r14 = "ad_unit_id";
        r14 = r13.optString(r14);
        r0 = "creative_types";
        r13 = r13.optJSONArray(r0);
        r0 = 0;
        r1 = 1;
        if (r13 == 0) goto L_0x0094;
    L_0x0034:
        r2 = r13.length();
        r3 = 0;
        r4 = 0;
        r5 = 0;
    L_0x003b:
        if (r3 >= r2) goto L_0x0092;
    L_0x003d:
        r6 = r13.getString(r3);	 Catch:{ JSONException -> 0x0070 }
        if (r6 == 0) goto L_0x006d;	 Catch:{ JSONException -> 0x0070 }
    L_0x0043:
        r7 = -1;	 Catch:{ JSONException -> 0x0070 }
        r8 = r6.hashCode();	 Catch:{ JSONException -> 0x0070 }
        r9 = 704091517; // 0x29f7957d float:1.09949356E-13 double:3.4786743E-315;	 Catch:{ JSONException -> 0x0070 }
        if (r8 == r9) goto L_0x005d;	 Catch:{ JSONException -> 0x0070 }
    L_0x004d:
        r9 = 883765328; // 0x34ad3050 float:3.2258913E-7 double:4.366380876E-315;	 Catch:{ JSONException -> 0x0070 }
        if (r8 == r9) goto L_0x0053;	 Catch:{ JSONException -> 0x0070 }
    L_0x0052:
        goto L_0x0066;	 Catch:{ JSONException -> 0x0070 }
    L_0x0053:
        r8 = "page_post";	 Catch:{ JSONException -> 0x0070 }
        r6 = r6.equals(r8);	 Catch:{ JSONException -> 0x0070 }
        if (r6 == 0) goto L_0x0066;	 Catch:{ JSONException -> 0x0070 }
    L_0x005b:
        r7 = 1;	 Catch:{ JSONException -> 0x0070 }
        goto L_0x0066;	 Catch:{ JSONException -> 0x0070 }
    L_0x005d:
        r8 = "app_install";	 Catch:{ JSONException -> 0x0070 }
        r6 = r6.equals(r8);	 Catch:{ JSONException -> 0x0070 }
        if (r6 == 0) goto L_0x0066;
    L_0x0065:
        r7 = 0;
    L_0x0066:
        switch(r7) {
            case 0: goto L_0x006c;
            case 1: goto L_0x006a;
            default: goto L_0x0069;
        };
    L_0x0069:
        goto L_0x006d;
    L_0x006a:
        r5 = 1;
        goto L_0x006d;
    L_0x006c:
        r4 = 1;
    L_0x006d:
        r3 = r3 + 1;
        goto L_0x003b;
    L_0x0070:
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r14 = r10.mo3294F();
        r14 = com.facebook.ads.internal.p047k.C1513y.m5314a(r14);
        r13.append(r14);
        r14 = " AN server error";
        r13.append(r14);
        r13 = r13.toString();
        com.facebook.ads.internal.p047k.C1490h.m5250a(r11, r13);
        r11 = com.facebook.ads.AdError.SERVER_ERROR;
        r12.mo1676a(r10, r11);
        return;
    L_0x0092:
        r0 = r4;
        goto L_0x0095;
    L_0x0094:
        r5 = 0;
    L_0x0095:
        r13 = android.text.TextUtils.isEmpty(r14);
        if (r13 != 0) goto L_0x00e6;
    L_0x009b:
        if (r0 != 0) goto L_0x00a0;
    L_0x009d:
        if (r5 != 0) goto L_0x00a0;
    L_0x009f:
        goto L_0x00e6;
    L_0x00a0:
        r10.f13136d = r12;
        r12 = new com.google.android.gms.ads.b$a;
        r12.<init>(r11, r14);
        if (r0 == 0) goto L_0x00b1;
    L_0x00a9:
        r13 = new com.facebook.ads.internal.adapters.d$1;
        r13.<init>(r10, r11);
        r12.m8544a(r13);
    L_0x00b1:
        if (r5 == 0) goto L_0x00bb;
    L_0x00b3:
        r13 = new com.facebook.ads.internal.adapters.d$2;
        r13.<init>(r10, r11);
        r12.m8545a(r13);
    L_0x00bb:
        r13 = new com.facebook.ads.internal.adapters.d$3;
        r13.<init>(r10, r11);
        r11 = r12.m8542a(r13);
        r12 = new com.google.android.gms.ads.formats.NativeAdOptions$a;
        r12.<init>();
        r12 = r12.m8588a(r1);
        r12 = r12.m8589a();
        r11 = r11.m8543a(r12);
        r11 = r11.m8547a();
        r12 = new com.google.android.gms.ads.c$a;
        r12.<init>();
        r12 = r12.m8558a();
        r11.m8549a(r12);
        return;
    L_0x00e6:
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r14 = r10.mo3294F();
        r14 = com.facebook.ads.internal.p047k.C1513y.m5314a(r14);
        r13.append(r14);
        r14 = " AN server error";
        r13.append(r14);
        r13 = r13.toString();
        com.facebook.ads.internal.p047k.C1490h.m5250a(r11, r13);
        r11 = com.facebook.ads.AdError.SERVER_ERROR;
        r12.mo1676a(r10, r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.d.a(android.content.Context, com.facebook.ads.internal.adapters.z, com.facebook.ads.internal.h.f, java.util.Map):void");
    }

    /* renamed from: a */
    public void mo3298a(View view, List<View> list) {
        this.f13134b = view;
        if (mo3302b() && view != null) {
            ViewGroup viewGroup = null;
            int i = -1;
            do {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2 != null) {
                    if (viewGroup2 instanceof C2357d) {
                        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                        if (viewGroup3 != null) {
                            int indexOfChild = viewGroup3.indexOfChild(viewGroup2);
                            viewGroup2.removeView(view);
                            viewGroup3.removeView(viewGroup2);
                            viewGroup3.addView(view, indexOfChild);
                            continue;
                        }
                    } else {
                        i = viewGroup2.indexOfChild(view);
                        viewGroup = viewGroup2;
                        continue;
                    }
                }
                Log.e(f13133a, "View must have valid parent for AdMob registration, skipping registration. Impressions and clicks will not be logged.");
                return;
            } while (viewGroup == null);
            View c3733g = this.f13135c instanceof NativeContentAd ? new C3733g(view.getContext()) : new C3732f(view.getContext());
            if (view instanceof ViewGroup) {
                c3733g.setLayoutParams(view.getLayoutParams());
            }
            m16256a(view);
            c3733g.addView(view);
            viewGroup.removeView(c3733g);
            viewGroup.addView(c3733g, i);
            this.f13137e = c3733g;
            this.f13137e.setNativeAd(this.f13135c);
            this.f13138f = new View(view.getContext());
            this.f13137e.addView(this.f13138f);
            this.f13138f.setVisibility(8);
            if (this.f13137e instanceof C3733g) {
                ((C3733g) this.f13137e).setCallToActionView(this.f13138f);
            } else if (this.f13137e instanceof C3732f) {
                ((C3732f) this.f13137e).setCallToActionView(this.f13138f);
            }
            OnClickListener c13544 = new C13544(this);
            for (View onClickListener : list) {
                onClickListener.setOnClickListener(c13544);
            }
        }
    }

    /* renamed from: a */
    public void mo3299a(C1369z c1369z) {
        this.f13136d = c1369z;
    }

    /* renamed from: a */
    public void mo3300a(Map<String, String> map) {
        if (mo3302b() && this.f13136d != null) {
            this.f13136d.mo1677b(this);
        }
    }

    /* renamed from: b */
    public void mo3301b(Map<String, String> map) {
    }

    /* renamed from: b */
    public boolean mo3302b() {
        return this.f13139g && this.f13135c != null;
    }

    /* renamed from: c */
    public boolean mo3303c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo3304d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo3305e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo3306f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo3307g() {
        return false;
    }

    /* renamed from: h */
    public int mo3308h() {
        return 0;
    }

    /* renamed from: i */
    public int mo3309i() {
        return 0;
    }

    /* renamed from: j */
    public int mo3310j() {
        return 0;
    }

    /* renamed from: k */
    public Image mo3311k() {
        return (!mo3302b() || this.f13141i == null) ? null : new Image(this.f13141i.toString(), 50, 50);
    }

    /* renamed from: l */
    public Image mo3312l() {
        return (!mo3302b() || this.f13140h == null) ? null : new Image(this.f13140h.toString(), 1200, 600);
    }

    /* renamed from: m */
    public NativeAdViewAttributes mo3313m() {
        return null;
    }

    /* renamed from: n */
    public String mo3314n() {
        return this.f13142j;
    }

    /* renamed from: o */
    public String mo3315o() {
        return null;
    }

    public void onDestroy() {
        mo3295a();
        this.f13136d = null;
        this.f13135c = null;
        this.f13139g = false;
        this.f13140h = null;
        this.f13141i = null;
        this.f13142j = null;
        this.f13143k = null;
        this.f13144l = null;
        this.f13145m = null;
    }

    /* renamed from: p */
    public String mo3317p() {
        return this.f13143k;
    }

    /* renamed from: q */
    public String mo3318q() {
        return this.f13144l;
    }

    /* renamed from: r */
    public String mo3319r() {
        return this.f13145m;
    }

    /* renamed from: s */
    public Rating mo3320s() {
        return null;
    }

    /* renamed from: t */
    public Image mo3321t() {
        return null;
    }

    /* renamed from: u */
    public String mo3322u() {
        return null;
    }

    /* renamed from: v */
    public String mo3323v() {
        return null;
    }

    /* renamed from: w */
    public String mo3324w() {
        return null;
    }

    /* renamed from: x */
    public String mo3325x() {
        return null;
    }

    /* renamed from: y */
    public VideoAutoplayBehavior mo3326y() {
        return VideoAutoplayBehavior.DEFAULT;
    }

    /* renamed from: z */
    public String mo3327z() {
        return null;
    }
}
