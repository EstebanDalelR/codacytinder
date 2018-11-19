package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.p035b.C1370b;
import com.facebook.ads.internal.p035b.C1372c;
import com.facebook.ads.internal.p036c.C1374a;
import com.facebook.ads.internal.p036c.C1380b;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p041h.C1429s;
import com.facebook.ads.internal.p047k.ad;
import com.facebook.ads.internal.p047k.ag;
import com.facebook.ads.internal.p047k.al;
import com.facebook.ads.internal.p047k.p048a.C1475a;
import com.facebook.ads.internal.p047k.p048a.C1475a.C1474a;
import com.facebook.ads.internal.view.C3394u;
import com.facebook.ads.internal.view.p052c.p053b.C1582n;
import com.facebook.ads.internal.view.p052c.p053b.C3354d;
import com.facebook.ads.internal.view.p052c.p053b.C3354d.C1572a;
import com.facebook.ads.internal.view.p052c.p053b.C4157a;
import com.facebook.ads.internal.view.p052c.p053b.C4161b;
import com.facebook.ads.internal.view.p052c.p053b.C4162c;
import com.facebook.ads.internal.view.p052c.p053b.C4166e;
import com.facebook.ads.internal.view.p052c.p053b.C4173i;
import com.facebook.ads.internal.view.p052c.p053b.C4177k;
import com.facebook.ads.internal.view.p052c.p053b.C4181l;
import com.facebook.ads.internal.view.p052c.p080a.C3328a;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3331d;
import com.facebook.ads.internal.view.p052c.p080a.C3339l;
import com.facebook.ads.p033a.C1341a;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.k */
public class C4143k extends C3274t implements ag<Bundle> {
    /* renamed from: e */
    static final /* synthetic */ boolean f13155e = true;
    @Nullable
    /* renamed from: a */
    protected C1425f f13156a;
    @Nullable
    /* renamed from: b */
    protected C3394u f13157b;
    @Nullable
    /* renamed from: c */
    protected JSONObject f13158c;
    @Nullable
    /* renamed from: d */
    protected Context f13159d;
    /* renamed from: f */
    private final C1429s<C3329b> f13160f = new C32601(this);
    /* renamed from: g */
    private final C1429s<C3339l> f13161g = new C32612(this);
    /* renamed from: h */
    private final C1429s<C3331d> f13162h = new C32623(this);
    /* renamed from: i */
    private final C1429s<C3328a> f13163i = new C32634(this);
    @Nullable
    /* renamed from: j */
    private C1341a f13164j;
    @Nullable
    /* renamed from: k */
    private String f13165k;
    /* renamed from: l */
    private boolean f13166l = false;
    @Nullable
    /* renamed from: m */
    private al f13167m;
    @Nullable
    /* renamed from: n */
    private String f13168n;
    /* renamed from: o */
    private boolean f13169o = false;
    /* renamed from: p */
    private C1380b f13170p;

    /* renamed from: com.facebook.ads.internal.adapters.k$1 */
    class C32601 extends C1429s<C3329b> {
        /* renamed from: a */
        final /* synthetic */ C4143k f9984a;

        C32601(C4143k c4143k) {
            this.f9984a = c4143k;
        }

        /* renamed from: a */
        public Class<C3329b> mo1725a() {
            return C3329b.class;
        }

        /* renamed from: a */
        public void m12535a(C3329b c3329b) {
            if (this.f9984a.f13164j != null) {
                this.f9984a.f13164j.mo1661d(this.f9984a);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.k$2 */
    class C32612 extends C1429s<C3339l> {
        /* renamed from: a */
        final /* synthetic */ C4143k f9985a;

        C32612(C4143k c4143k) {
            this.f9985a = c4143k;
        }

        /* renamed from: a */
        public Class<C3339l> mo1725a() {
            return C3339l.class;
        }

        /* renamed from: a */
        public void m12538a(C3339l c3339l) {
            this.f9985a.f13166l = C4143k.f13155e;
            if (this.f9985a.f13164j != null) {
                this.f9985a.f13164j.mo1656a(this.f9985a);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.k$3 */
    class C32623 extends C1429s<C3331d> {
        /* renamed from: a */
        final /* synthetic */ C4143k f9986a;

        C32623(C4143k c4143k) {
            this.f9986a = c4143k;
        }

        /* renamed from: a */
        public Class<C3331d> mo1725a() {
            return C3331d.class;
        }

        /* renamed from: a */
        public void m12541a(C3331d c3331d) {
            if (this.f9986a.f13164j != null) {
                this.f9986a.f13164j.mo1658a(this.f9986a, AdError.INTERNAL_ERROR);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.k$4 */
    class C32634 extends C1429s<C3328a> {
        /* renamed from: a */
        final /* synthetic */ C4143k f9987a;

        C32634(C4143k c4143k) {
            this.f9987a = c4143k;
        }

        /* renamed from: a */
        public Class<C3328a> mo1725a() {
            return C3328a.class;
        }

        /* renamed from: a */
        public void m12544a(C3328a c3328a) {
            if (this.f9987a.f13164j != null) {
                this.f9987a.f13164j.mo1659b(this.f9987a);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.k$6 */
    class C32656 implements C1374a {
        /* renamed from: a */
        final /* synthetic */ C4143k f9989a;

        C32656(C4143k c4143k) {
            this.f9989a = c4143k;
        }

        /* renamed from: a */
        public void mo1673a() {
            this.f9989a.f13157b.setVideoURI(this.f9989a.mo3703g());
        }

        /* renamed from: b */
        public void mo1674b() {
            this.f9989a.f13157b.setVideoURI(this.f9989a.mo3703g());
        }
    }

    /* renamed from: a */
    private void m16312a(Context context, C1341a c1341a, JSONObject jSONObject, C1425f c1425f, @Nullable Bundle bundle, EnumSet<CacheFlag> enumSet) {
        Context context2 = context;
        JSONObject jSONObject2 = jSONObject;
        Bundle bundle2 = bundle;
        this.f13159d = context2;
        this.f13164j = c1341a;
        C1425f c1425f2 = c1425f;
        this.f13156a = c1425f2;
        this.f13158c = jSONObject2;
        this.f13166l = false;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("video");
        this.f13168n = jSONObject2.optString("ct");
        this.f13157b = new C3394u(context2);
        mo3702a();
        this.f13157b.getEventBus().m4995a(this.f13160f, this.f13161g, this.f13162h, this.f13163i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1370b(this, 1.0E-7d, -1.0d, 0.001d, false) {
            /* renamed from: a */
            final /* synthetic */ C4143k f9988a;

            /* renamed from: a */
            protected void mo1727a(boolean z, boolean z2, C1372c c1372c) {
                this.f9988a.m16323f();
            }
        });
        if (bundle2 != null) {
            r9.f13167m = new ad(context2, c1425f2, r9.f13157b, arrayList, r9.f13168n, bundle2.getBundle("logger"));
        } else {
            r9.f13167m = new ad(context2, c1425f2, r9.f13157b, (List) arrayList, r9.f13168n);
        }
        r9.f13164j.mo1657a(r9, r9.f13157b);
        String str = (C1475a.m5158c(context) == C1474a.MOBILE_INTERNET && jSONObject3.has("videoHDURL") && !jSONObject3.isNull("videoHDURL")) ? "videoHDURL" : AudienceNetworkActivity.VIDEO_URL;
        r9.f13165k = jSONObject3.getString(str);
        if (enumSet.contains(CacheFlag.VIDEO)) {
            r9.f13170p = new C1380b(context2);
            r9.f13170p.m4808b(r9.f13165k);
            r9.f13170p.m4806a(new C32656(r9));
            return;
        }
        r9.f13157b.setVideoURI(mo3703g());
    }

    /* renamed from: g */
    private String mo3703g() {
        Object obj = "";
        if (!(this.f13170p == null || this.f13165k == null)) {
            obj = this.f13170p.m4809c(this.f13165k);
        }
        return TextUtils.isEmpty(obj) ? this.f13165k : obj;
    }

    /* renamed from: a */
    protected void mo3702a() {
        if (!f13155e && this.f13159d == null) {
            throw new AssertionError();
        } else if (f13155e || this.f13158c != null) {
            LayoutParams layoutParams;
            C1582n c4166e;
            JSONObject optJSONObject = this.f13158c.optJSONObject(ManagerWebServices.PARAM_TEXT);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            this.f13157b.m13056a(new C4177k(this.f13159d));
            C1582n c4181l = new C4181l(this.f13159d);
            this.f13157b.m13056a(c4181l);
            this.f13157b.m13056a(new C3354d(c4181l, C1572a.INVSIBLE));
            this.f13157b.m13056a(new C4161b(this.f13159d));
            String b = m16319b();
            if (b != null) {
                C1582n c4162c = new C4162c(this.f13159d, b);
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12);
                layoutParams.addRule(9);
                c4162c.setLayoutParams(layoutParams);
                c4162c.setCountdownTextColor(-1);
                this.f13157b.m13056a(c4162c);
            }
            if (this.f13158c.has("cta") && !this.f13158c.isNull("cta")) {
                JSONObject jSONObject = this.f13158c.getJSONObject("cta");
                c4166e = new C4166e(this.f13159d, jSONObject.getString("url"), this.f13156a, this.f13168n, jSONObject.getString(ManagerWebServices.PARAM_TEXT));
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                c4166e.setLayoutParams(layoutParams);
                this.f13157b.m13056a(c4166e);
            }
            Object d = m16321d();
            if (!TextUtils.isEmpty(d)) {
                this.f13157b.m13056a(new C4157a(this.f13159d, d, this.f13168n, new float[]{0.0f, 0.0f, 8.0f, 0.0f}));
            }
            int c = m16320c();
            if (c > 0) {
                c4166e = new C4173i(this.f13159d, c, optJSONObject.optString("skipAdIn", "Skip Ad in"), optJSONObject.optString("skipAd", "Skip Ad"));
                LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(12);
                layoutParams2.addRule(11);
                c4166e.setLayoutParams(layoutParams2);
                c4166e.setPadding(0, 0, 0, 30);
                this.f13157b.m13056a(c4166e);
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public final void m16317a(android.content.Context r8, com.facebook.ads.p033a.C1341a r9, com.facebook.ads.internal.p041h.C1425f r10, android.os.Bundle r11, java.util.EnumSet<com.facebook.ads.CacheFlag> r12) {
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
        r7 = this;
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0015 }
        r0 = "ad_response";	 Catch:{ JSONException -> 0x0015 }
        r0 = r11.getString(r0);	 Catch:{ JSONException -> 0x0015 }
        r3.<init>(r0);	 Catch:{ JSONException -> 0x0015 }
        r0 = r7;	 Catch:{ JSONException -> 0x0015 }
        r1 = r8;	 Catch:{ JSONException -> 0x0015 }
        r2 = r9;	 Catch:{ JSONException -> 0x0015 }
        r4 = r10;	 Catch:{ JSONException -> 0x0015 }
        r5 = r11;	 Catch:{ JSONException -> 0x0015 }
        r6 = r12;	 Catch:{ JSONException -> 0x0015 }
        r0.m16312a(r1, r2, r3, r4, r5, r6);	 Catch:{ JSONException -> 0x0015 }
        return;
    L_0x0015:
        r8 = com.facebook.ads.AdError.INTERNAL_ERROR;
        r9.mo1658a(r7, r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.k.a(android.content.Context, com.facebook.ads.a.a, com.facebook.ads.internal.h.f, android.os.Bundle, java.util.EnumSet):void");
    }

    /* renamed from: a */
    public final void mo3329a(android.content.Context r8, com.facebook.ads.p033a.C1341a r9, java.util.Map<java.lang.String, java.lang.Object> r10, com.facebook.ads.internal.p041h.C1425f r11, java.util.EnumSet<com.facebook.ads.CacheFlag> r12) {
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
        r7 = this;
        r0 = "data";	 Catch:{ JSONException -> 0x0013 }
        r10 = r10.get(r0);	 Catch:{ JSONException -> 0x0013 }
        r3 = r10;	 Catch:{ JSONException -> 0x0013 }
        r3 = (org.json.JSONObject) r3;	 Catch:{ JSONException -> 0x0013 }
        r5 = 0;	 Catch:{ JSONException -> 0x0013 }
        r0 = r7;	 Catch:{ JSONException -> 0x0013 }
        r1 = r8;	 Catch:{ JSONException -> 0x0013 }
        r2 = r9;	 Catch:{ JSONException -> 0x0013 }
        r4 = r11;	 Catch:{ JSONException -> 0x0013 }
        r6 = r12;	 Catch:{ JSONException -> 0x0013 }
        r0.m16312a(r1, r2, r3, r4, r5, r6);	 Catch:{ JSONException -> 0x0013 }
        return;
    L_0x0013:
        r8 = com.facebook.ads.AdError.INTERNAL_ERROR;
        r9.mo1658a(r7, r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.k.a(android.content.Context, com.facebook.ads.a.a, java.util.Map, com.facebook.ads.internal.h.f, java.util.EnumSet):void");
    }

    /* renamed from: b */
    protected String m16319b() {
        if (f13155e || this.f13158c != null) {
            try {
                JSONObject jSONObject = this.f13158c.getJSONObject("capabilities");
                if (!jSONObject.has("countdown") || jSONObject.isNull("countdown")) {
                    return null;
                }
                jSONObject = jSONObject.getJSONObject("countdown");
                if (jSONObject.has("format")) {
                    return jSONObject.optString("format");
                }
                return null;
            } catch (Throwable e) {
                Log.w(String.valueOf(C4143k.class), "Invalid JSON", e);
                return null;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    protected int m16320c() {
        if (f13155e || this.f13158c != null) {
            try {
                JSONObject jSONObject = this.f13158c.getJSONObject("capabilities");
                if (!jSONObject.has("skipButton") || jSONObject.isNull("skipButton")) {
                    return -1;
                }
                jSONObject = jSONObject.getJSONObject("skipButton");
                if (jSONObject.has("skippableSeconds")) {
                    return jSONObject.getInt("skippableSeconds");
                }
                return -1;
            } catch (Throwable e) {
                Log.w(String.valueOf(C4143k.class), "Invalid JSON", e);
                return -1;
            }
        }
        throw new AssertionError();
    }

    @Nullable
    /* renamed from: d */
    protected String m16321d() {
        if (f13155e || this.f13158c != null) {
            try {
                JSONObject jSONObject = this.f13158c.getJSONObject("capabilities");
                if (!jSONObject.has("adChoices") || jSONObject.isNull("adChoices")) {
                    return null;
                }
                jSONObject = jSONObject.getJSONObject("adChoices");
                if (jSONObject.has("url")) {
                    return jSONObject.getString("url");
                }
                return null;
            } catch (Throwable e) {
                Log.w(String.valueOf(C4143k.class), "Invalid JSON", e);
                return null;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: e */
    public boolean mo3330e() {
        if (this.f13166l) {
            if (this.f13157b != null) {
                if (this.f13167m.m12824k() > 0) {
                    this.f13157b.m13053a(this.f13167m.m12824k());
                }
                this.f13157b.m13055a(VideoStartReason.AUTO_STARTED);
                return f13155e;
            }
        }
        return false;
    }

    /* renamed from: f */
    protected void m16323f() {
        if (this.f13156a != null && !this.f13169o) {
            this.f13169o = f13155e;
            this.f13156a.mo1743a(this.f13168n, new HashMap());
            if (this.f13164j != null) {
                this.f13164j.mo1660c(this);
            }
        }
    }

    public Bundle getSaveInstanceState() {
        if (this.f13167m != null) {
            if (this.f13158c != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("logger", this.f13167m.getSaveInstanceState());
                bundle.putString("ad_response", this.f13158c.toString());
                return bundle;
            }
        }
        return null;
    }

    public void onDestroy() {
        if (this.f13157b != null) {
            this.f13157b.m13064h();
            this.f13157b.m13067k();
        }
        this.f13164j = null;
        this.f13156a = null;
        this.f13165k = null;
        this.f13166l = false;
        this.f13168n = null;
        this.f13157b = null;
        this.f13167m = null;
        this.f13158c = null;
        this.f13159d = null;
        this.f13169o = false;
    }
}
