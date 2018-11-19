package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.AdNetwork;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAd.Image;
import com.facebook.ads.NativeAd.Rating;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1513y;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.InMobiNative.NativeAdListener;
import com.inmobi.sdk.InMobiSdk;
import com.tinder.api.ManagerWebServices;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.s */
public class C4148s extends C3276y implements C1368w {
    /* renamed from: a */
    private C1369z f13257a;
    /* renamed from: b */
    private InMobiNative f13258b;
    /* renamed from: c */
    private boolean f13259c;
    /* renamed from: d */
    private View f13260d;
    /* renamed from: e */
    private String f13261e;
    /* renamed from: f */
    private String f13262f;
    /* renamed from: g */
    private String f13263g;
    /* renamed from: h */
    private Rating f13264h;
    /* renamed from: i */
    private Image f13265i;
    /* renamed from: j */
    private Image f13266j;

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
        return AdNetwork.INMOBI;
    }

    /* renamed from: F */
    public C1357f mo3294F() {
        return C1357f.INMOBI;
    }

    /* renamed from: a */
    public void mo3295a() {
        if (mo3302b()) {
            InMobiNative inMobiNative = this.f13258b;
            InMobiNative.unbind(this.f13260d);
        }
        this.f13260d = null;
    }

    /* renamed from: a */
    public void mo3296a(int i) {
    }

    /* renamed from: a */
    public void mo3297a(final Context context, C1369z c1369z, C1425f c1425f, Map<String, Object> map) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1513y.m5314a(mo3294F()));
        stringBuilder.append(" Loading");
        C1490h.m5250a(context, stringBuilder.toString());
        JSONObject jSONObject = (JSONObject) map.get(ManagerWebServices.FB_DATA);
        Object optString = jSONObject.optString("account_id");
        Long valueOf = Long.valueOf(jSONObject.optLong("placement_id"));
        if (!TextUtils.isEmpty(optString)) {
            if (valueOf != null) {
                this.f13257a = c1369z;
                InMobiSdk.init(context, optString);
                this.f13258b = new InMobiNative(valueOf.longValue(), new NativeAdListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C4148s f3690b;

                    public void onAdDismissed(InMobiNative inMobiNative) {
                    }

                    public void onAdDisplayed(InMobiNative inMobiNative) {
                    }

                    public void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus inMobiAdRequestStatus) {
                        Context context = context;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(C1513y.m5314a(this.f3690b.mo3294F()));
                        stringBuilder.append(" Failed with InMobi error: ");
                        stringBuilder.append(inMobiAdRequestStatus.getMessage());
                        C1490h.m5250a(context, stringBuilder.toString());
                        if (this.f3690b.f13257a != null) {
                            this.f3690b.f13257a.mo1676a(this.f3690b, new AdError(AdError.MEDIATION_ERROR_CODE, inMobiAdRequestStatus.getMessage()));
                        }
                    }

                    public void onAdLoadSucceeded(com.inmobi.ads.InMobiNative r7) {
                        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                        /*
                        r6 = this;
                        r0 = new org.json.JSONObject;	 Catch:{ Exception -> 0x00da }
                        r1 = r7.getAdContent();	 Catch:{ Exception -> 0x00da }
                        r1 = (java.lang.String) r1;	 Catch:{ Exception -> 0x00da }
                        r0.<init>(r1);	 Catch:{ Exception -> 0x00da }
                        r1 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r2 = "title";	 Catch:{ Exception -> 0x00da }
                        r2 = r0.optString(r2);	 Catch:{ Exception -> 0x00da }
                        r1.f13261e = r2;	 Catch:{ Exception -> 0x00da }
                        r1 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r2 = "description";	 Catch:{ Exception -> 0x00da }
                        r2 = r0.optString(r2);	 Catch:{ Exception -> 0x00da }
                        r1.f13262f = r2;	 Catch:{ Exception -> 0x00da }
                        r1 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r2 = "cta";	 Catch:{ Exception -> 0x00da }
                        r2 = r0.optString(r2);	 Catch:{ Exception -> 0x00da }
                        r1.f13263g = r2;	 Catch:{ Exception -> 0x00da }
                        r1 = "icon";	 Catch:{ Exception -> 0x00da }
                        r1 = r0.optJSONObject(r1);	 Catch:{ Exception -> 0x00da }
                        if (r1 == 0) goto L_0x0050;	 Catch:{ Exception -> 0x00da }
                    L_0x0034:
                        r2 = "width";	 Catch:{ Exception -> 0x00da }
                        r2 = r1.optInt(r2);	 Catch:{ Exception -> 0x00da }
                        r3 = "height";	 Catch:{ Exception -> 0x00da }
                        r3 = r1.optInt(r3);	 Catch:{ Exception -> 0x00da }
                        r4 = "url";	 Catch:{ Exception -> 0x00da }
                        r1 = r1.optString(r4);	 Catch:{ Exception -> 0x00da }
                        r4 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r5 = new com.facebook.ads.NativeAd$Image;	 Catch:{ Exception -> 0x00da }
                        r5.<init>(r1, r2, r3);	 Catch:{ Exception -> 0x00da }
                        r4.f13265i = r5;	 Catch:{ Exception -> 0x00da }
                    L_0x0050:
                        r1 = "screenshots";	 Catch:{ Exception -> 0x00da }
                        r1 = r0.optJSONObject(r1);	 Catch:{ Exception -> 0x00da }
                        if (r1 == 0) goto L_0x0074;	 Catch:{ Exception -> 0x00da }
                    L_0x0058:
                        r2 = "width";	 Catch:{ Exception -> 0x00da }
                        r2 = r1.optInt(r2);	 Catch:{ Exception -> 0x00da }
                        r3 = "height";	 Catch:{ Exception -> 0x00da }
                        r3 = r1.optInt(r3);	 Catch:{ Exception -> 0x00da }
                        r4 = "url";	 Catch:{ Exception -> 0x00da }
                        r1 = r1.optString(r4);	 Catch:{ Exception -> 0x00da }
                        r4 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r5 = new com.facebook.ads.NativeAd$Image;	 Catch:{ Exception -> 0x00da }
                        r5.<init>(r1, r2, r3);	 Catch:{ Exception -> 0x00da }
                        r4.f13266j = r5;	 Catch:{ Exception -> 0x00da }
                    L_0x0074:
                        r1 = "rating";	 Catch:{ Exception -> 0x00da }
                        r0 = r0.optString(r1);	 Catch:{ Exception -> 0x00da }
                        r0 = java.lang.Double.parseDouble(r0);	 Catch:{ Exception -> 0x008a }
                        r2 = r6.f3690b;	 Catch:{ Exception -> 0x008a }
                        r3 = new com.facebook.ads.NativeAd$Rating;	 Catch:{ Exception -> 0x008a }
                        r4 = 4617315517961601024; // 0x4014000000000000 float:0.0 double:5.0;	 Catch:{ Exception -> 0x008a }
                        r3.<init>(r0, r4);	 Catch:{ Exception -> 0x008a }
                        r2.f13264h = r3;	 Catch:{ Exception -> 0x008a }
                    L_0x008a:
                        r0 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r1 = 1;	 Catch:{ Exception -> 0x00da }
                        r0.f13259c = r1;	 Catch:{ Exception -> 0x00da }
                        r0 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r0 = r0.f13260d;	 Catch:{ Exception -> 0x00da }
                        if (r0 == 0) goto L_0x00a6;	 Catch:{ Exception -> 0x00da }
                    L_0x0098:
                        r0 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r0.f13258b;	 Catch:{ Exception -> 0x00da }
                        r0 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r0 = r0.f13260d;	 Catch:{ Exception -> 0x00da }
                        com.inmobi.ads.InMobiNative.bind(r0, r7);	 Catch:{ Exception -> 0x00da }
                    L_0x00a6:
                        r7 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r7 = r7.f13257a;	 Catch:{ Exception -> 0x00da }
                        if (r7 == 0) goto L_0x010f;	 Catch:{ Exception -> 0x00da }
                    L_0x00ae:
                        r7 = r3;	 Catch:{ Exception -> 0x00da }
                        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00da }
                        r0.<init>();	 Catch:{ Exception -> 0x00da }
                        r1 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r1 = r1.mo3294F();	 Catch:{ Exception -> 0x00da }
                        r1 = com.facebook.ads.internal.p047k.C1513y.m5314a(r1);	 Catch:{ Exception -> 0x00da }
                        r0.append(r1);	 Catch:{ Exception -> 0x00da }
                        r1 = " Loaded";	 Catch:{ Exception -> 0x00da }
                        r0.append(r1);	 Catch:{ Exception -> 0x00da }
                        r0 = r0.toString();	 Catch:{ Exception -> 0x00da }
                        com.facebook.ads.internal.p047k.C1490h.m5250a(r7, r0);	 Catch:{ Exception -> 0x00da }
                        r7 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r7 = r7.f13257a;	 Catch:{ Exception -> 0x00da }
                        r0 = r6.f3690b;	 Catch:{ Exception -> 0x00da }
                        r7.mo1675a(r0);	 Catch:{ Exception -> 0x00da }
                        return;
                    L_0x00da:
                        r7 = r6.f3690b;
                        r7 = r7.f13257a;
                        if (r7 == 0) goto L_0x010f;
                    L_0x00e2:
                        r7 = r3;
                        r0 = new java.lang.StringBuilder;
                        r0.<init>();
                        r1 = r6.f3690b;
                        r1 = r1.mo3294F();
                        r1 = com.facebook.ads.internal.p047k.C1513y.m5314a(r1);
                        r0.append(r1);
                        r1 = " Failed. Internal AN SDK error";
                        r0.append(r1);
                        r0 = r0.toString();
                        com.facebook.ads.internal.p047k.C1490h.m5250a(r7, r0);
                        r7 = r6.f3690b;
                        r7 = r7.f13257a;
                        r0 = r6.f3690b;
                        r1 = com.facebook.ads.AdError.INTERNAL_ERROR;
                        r7.mo1676a(r0, r1);
                    L_0x010f:
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.s.1.onAdLoadSucceeded(com.inmobi.ads.InMobiNative):void");
                    }

                    public void onUserLeftApplication(InMobiNative inMobiNative) {
                    }
                });
                this.f13258b.load();
                return;
            }
        }
        c1369z.mo1676a(this, AdError.MEDIATION_ERROR);
    }

    /* renamed from: a */
    public void mo3298a(View view, List<View> list) {
        this.f13260d = view;
        if (mo3302b()) {
            InMobiNative inMobiNative = this.f13258b;
            InMobiNative.bind(this.f13260d, this.f13258b);
        }
    }

    /* renamed from: a */
    public void mo3299a(C1369z c1369z) {
        this.f13257a = c1369z;
    }

    /* renamed from: a */
    public void mo3300a(Map<String, String> map) {
        this.f13257a.mo1677b(this);
    }

    /* renamed from: b */
    public void mo3301b(Map<String, String> map) {
        if (mo3302b()) {
            this.f13257a.mo1678c(this);
            this.f13258b.reportAdClickAndOpenLandingPage(null);
        }
    }

    /* renamed from: b */
    public boolean mo3302b() {
        return this.f13258b != null && this.f13259c;
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
        return true;
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
        return this.f13265i;
    }

    /* renamed from: l */
    public Image mo3312l() {
        return this.f13266j;
    }

    /* renamed from: m */
    public NativeAdViewAttributes mo3313m() {
        return null;
    }

    /* renamed from: n */
    public String mo3314n() {
        return this.f13261e;
    }

    /* renamed from: o */
    public String mo3315o() {
        return null;
    }

    public void onDestroy() {
        mo3295a();
        this.f13258b = null;
        this.f13257a = null;
    }

    /* renamed from: p */
    public String mo3317p() {
        return this.f13262f;
    }

    /* renamed from: q */
    public String mo3318q() {
        return this.f13263g;
    }

    /* renamed from: r */
    public String mo3319r() {
        return null;
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
        return "Ad";
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
