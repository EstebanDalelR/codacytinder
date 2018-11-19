package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.facebook.ads.AdError;
import com.facebook.ads.AdNetwork;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAd.Image;
import com.facebook.ads.NativeAd.Rating;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.VideoAutoplayBehavior;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.p034a.C1348a;
import com.facebook.ads.internal.p034a.C1349b;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1481b.C1479a;
import com.facebook.ads.internal.p047k.C1482c;
import com.facebook.ads.internal.p047k.C1486f;
import com.facebook.ads.internal.p047k.C1488g;
import com.facebook.ads.internal.p047k.C1488g.C1487a;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.ah;
import com.facebook.ads.internal.p047k.ap;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.n */
public class C4145n extends C3276y implements C1487a {
    /* renamed from: a */
    private static final String f13183a = "n";
    /* renamed from: A */
    private Image f13184A;
    /* renamed from: B */
    private String f13185B;
    /* renamed from: C */
    private String f13186C;
    /* renamed from: D */
    private NativeAdViewAttributes f13187D;
    /* renamed from: E */
    private List<NativeAd> f13188E;
    /* renamed from: F */
    private int f13189F = -1;
    /* renamed from: G */
    private int f13190G;
    /* renamed from: H */
    private String f13191H;
    /* renamed from: I */
    private boolean f13192I;
    /* renamed from: J */
    private boolean f13193J;
    /* renamed from: K */
    private boolean f13194K;
    /* renamed from: L */
    private boolean f13195L;
    /* renamed from: M */
    private boolean f13196M;
    /* renamed from: N */
    private long f13197N = 0;
    /* renamed from: O */
    private C1479a f13198O = null;
    @Nullable
    /* renamed from: P */
    private C1425f f13199P;
    /* renamed from: b */
    private Context f13200b;
    /* renamed from: c */
    private C1369z f13201c;
    /* renamed from: d */
    private Uri f13202d;
    /* renamed from: e */
    private String f13203e;
    /* renamed from: f */
    private String f13204f;
    /* renamed from: g */
    private String f13205g;
    /* renamed from: h */
    private String f13206h;
    /* renamed from: i */
    private String f13207i;
    /* renamed from: j */
    private Image f13208j;
    /* renamed from: k */
    private Image f13209k;
    /* renamed from: l */
    private Rating f13210l;
    /* renamed from: m */
    private String f13211m;
    /* renamed from: n */
    private C1486f f13212n;
    /* renamed from: o */
    private Collection<String> f13213o;
    /* renamed from: p */
    private boolean f13214p;
    /* renamed from: q */
    private boolean f13215q;
    /* renamed from: r */
    private boolean f13216r;
    /* renamed from: s */
    private int f13217s;
    /* renamed from: t */
    private int f13218t;
    /* renamed from: u */
    private int f13219u;
    /* renamed from: v */
    private int f13220v;
    /* renamed from: w */
    private String f13221w;
    /* renamed from: x */
    private String f13222x;
    /* renamed from: y */
    private VideoAutoplayBehavior f13223y;
    /* renamed from: z */
    private String f13224z;

    /* renamed from: I */
    private boolean m16334I() {
        return this.f13203e != null && this.f13203e.length() > 0 && this.f13206h != null && this.f13206h.length() > 0 && ((this.f13208j != null || this.f13192I) && this.f13209k != null);
    }

    /* renamed from: J */
    private void m16335J() {
        if (!this.f13196M) {
            if (this.f13199P != null) {
                this.f13199P.mo1741a(this.f13211m);
            }
            this.f13196M = true;
        }
    }

    /* renamed from: a */
    private void m16337a(Context context, JSONObject jSONObject, C1425f c1425f, String str, int i, int i2) {
        this.f13192I = true;
        this.f13200b = context;
        this.f13199P = c1425f;
        this.f13189F = i;
        this.f13190G = i2;
        m16339a(jSONObject, str);
    }

    /* renamed from: a */
    private void m16338a(java.util.Map<java.lang.String, java.lang.String> r3, final java.util.Map<java.lang.String, java.lang.String> r4) {
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
        r2 = this;
        r3 = r2.m16341c(r3);	 Catch:{ Exception -> 0x0016 }
        r0 = new android.os.Handler;	 Catch:{ Exception -> 0x0016 }
        r0.<init>();	 Catch:{ Exception -> 0x0016 }
        r1 = new com.facebook.ads.internal.adapters.n$1;	 Catch:{ Exception -> 0x0016 }
        r1.<init>(r2, r4, r3);	 Catch:{ Exception -> 0x0016 }
        r3 = r2.f13217s;	 Catch:{ Exception -> 0x0016 }
        r3 = r3 * 1000;	 Catch:{ Exception -> 0x0016 }
        r3 = (long) r3;	 Catch:{ Exception -> 0x0016 }
        r0.postDelayed(r1, r3);	 Catch:{ Exception -> 0x0016 }
    L_0x0016:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.n.a(java.util.Map, java.util.Map):void");
    }

    /* renamed from: a */
    private void m16339a(JSONObject jSONObject, String str) {
        if (this.f13193J) {
            throw new IllegalStateException("Adapter already loaded data");
        } else if (jSONObject != null) {
            NativeAdViewAttributes nativeAdViewAttributes;
            JSONArray jSONArray;
            VideoAutoplayBehavior videoAutoplayBehavior;
            JSONArray optJSONArray;
            int length;
            List arrayList;
            C3276y c4145n;
            C1490h.m5250a(this.f13200b, "Audience Network Loaded");
            this.f13191H = str;
            this.f13202d = Uri.parse(C1490h.m5245a(jSONObject, "fbad_command"));
            this.f13203e = C1490h.m5245a(jSONObject, ManagerWebServices.PARAM_JOB_TITLE);
            this.f13204f = C1490h.m5245a(jSONObject, "subtitle");
            this.f13205g = C1490h.m5245a(jSONObject, "body");
            this.f13206h = C1490h.m5245a(jSONObject, "call_to_action");
            this.f13207i = C1490h.m5245a(jSONObject, "social_context");
            this.f13208j = Image.fromJSONObject(jSONObject.optJSONObject(AnalyticsConstants.VALUE_SHARE_METHOD_ICON));
            this.f13209k = Image.fromJSONObject(jSONObject.optJSONObject(ManagerWebServices.IG_PARAM_IMAGE));
            this.f13210l = Rating.fromJSONObject(jSONObject.optJSONObject("star_rating"));
            this.f13211m = C1490h.m5245a(jSONObject, "used_report_url");
            this.f13214p = jSONObject.optBoolean("manual_imp");
            this.f13215q = jSONObject.optBoolean("enable_view_log");
            this.f13216r = jSONObject.optBoolean("enable_snapshot_log");
            this.f13217s = jSONObject.optInt("snapshot_log_delay_second", 4);
            int i = 0;
            this.f13218t = jSONObject.optInt("snapshot_compress_quality", 0);
            this.f13219u = jSONObject.optInt("viewability_check_initial_delay", 0);
            this.f13220v = jSONObject.optInt("viewability_check_interval", AdError.NETWORK_ERROR_CODE);
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_choices_icon");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("native_ui_config");
            if (optJSONObject2 != null) {
                if (optJSONObject2.length() != 0) {
                    nativeAdViewAttributes = new NativeAdViewAttributes(optJSONObject2);
                    this.f13187D = nativeAdViewAttributes;
                    if (optJSONObject != null) {
                        this.f13184A = Image.fromJSONObject(optJSONObject);
                    }
                    this.f13185B = C1490h.m5245a(jSONObject, "ad_choices_link_url");
                    this.f13186C = C1490h.m5245a(jSONObject, "request_id");
                    this.f13212n = C1486f.m5229a(jSONObject.optString("invalidation_behavior"));
                    jSONArray = new JSONArray(jSONObject.optString("detection_strings"));
                    this.f13213o = C1488g.m5233a(jSONArray);
                    this.f13221w = C1490h.m5245a(jSONObject, "video_url");
                    this.f13222x = C1490h.m5245a(jSONObject, "video_mpd");
                    videoAutoplayBehavior = jSONObject.has("video_autoplay_enabled") ? VideoAutoplayBehavior.DEFAULT : jSONObject.optBoolean("video_autoplay_enabled") ? VideoAutoplayBehavior.ON : VideoAutoplayBehavior.OFF;
                    this.f13223y = videoAutoplayBehavior;
                    this.f13224z = C1490h.m5245a(jSONObject, "video_report_url");
                    optJSONArray = jSONObject.optJSONArray(ManagerWebServices.PARAM_CAROUSEL);
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        length = optJSONArray.length();
                        arrayList = new ArrayList(length);
                        while (i < length) {
                            c4145n = new C4145n();
                            c4145n.m16337a(this.f13200b, optJSONArray.getJSONObject(i), this.f13199P, str, i, length);
                            arrayList.add(new NativeAd(this.f13200b, c4145n, null));
                            i++;
                        }
                        this.f13188E = arrayList;
                    }
                    this.f13193J = true;
                    this.f13194K = m16334I();
                }
            }
            nativeAdViewAttributes = null;
            this.f13187D = nativeAdViewAttributes;
            if (optJSONObject != null) {
                this.f13184A = Image.fromJSONObject(optJSONObject);
            }
            this.f13185B = C1490h.m5245a(jSONObject, "ad_choices_link_url");
            this.f13186C = C1490h.m5245a(jSONObject, "request_id");
            this.f13212n = C1486f.m5229a(jSONObject.optString("invalidation_behavior"));
            try {
                jSONArray = new JSONArray(jSONObject.optString("detection_strings"));
            } catch (JSONException e) {
                e.printStackTrace();
                jSONArray = null;
            }
            this.f13213o = C1488g.m5233a(jSONArray);
            this.f13221w = C1490h.m5245a(jSONObject, "video_url");
            this.f13222x = C1490h.m5245a(jSONObject, "video_mpd");
            if (jSONObject.has("video_autoplay_enabled")) {
                if (jSONObject.optBoolean("video_autoplay_enabled")) {
                }
            }
            this.f13223y = videoAutoplayBehavior;
            this.f13224z = C1490h.m5245a(jSONObject, "video_report_url");
            try {
                optJSONArray = jSONObject.optJSONArray(ManagerWebServices.PARAM_CAROUSEL);
                length = optJSONArray.length();
                arrayList = new ArrayList(length);
                while (i < length) {
                    c4145n = new C4145n();
                    c4145n.m16337a(this.f13200b, optJSONArray.getJSONObject(i), this.f13199P, str, i, length);
                    arrayList.add(new NativeAd(this.f13200b, c4145n, null));
                    i++;
                }
                this.f13188E = arrayList;
            } catch (Throwable e2) {
                Log.e(f13183a, "Unable to parse carousel data.", e2);
            }
            this.f13193J = true;
            this.f13194K = m16334I();
        }
    }

    /* renamed from: c */
    private Map<String, String> m16341c(Map<String, String> map) {
        Map<String, String> hashMap = new HashMap();
        if (map.containsKey("view")) {
            hashMap.put("view", map.get("view"));
        }
        if (map.containsKey("snapshot")) {
            hashMap.put("snapshot", map.get("snapshot"));
        }
        return hashMap;
    }

    /* renamed from: A */
    public List<NativeAd> mo3289A() {
        return !mo3302b() ? null : this.f13188E;
    }

    /* renamed from: B */
    public int mo3290B() {
        return this.f13189F;
    }

    /* renamed from: C */
    public int mo3291C() {
        return this.f13190G;
    }

    /* renamed from: D */
    public String mo3292D() {
        return this.f13191H;
    }

    /* renamed from: E */
    public AdNetwork mo3293E() {
        return AdNetwork.AN;
    }

    /* renamed from: F */
    public C1486f mo1729F() {
        return this.f13212n;
    }

    /* renamed from: G */
    public Collection<String> mo1730G() {
        return this.f13213o;
    }

    /* renamed from: H */
    public String mo3333H() {
        if (!mo3302b()) {
            return null;
        }
        m16335J();
        return this.f13205g;
    }

    /* renamed from: a */
    public void mo3295a() {
    }

    /* renamed from: a */
    public void mo3296a(int i) {
        if (mo3302b() && i == 0 && this.f13197N > 0 && this.f13198O != null) {
            C1482c.m5218a(C1481b.m5213a(this.f13197N, this.f13198O, this.f13186C));
            this.f13197N = 0;
            this.f13198O = null;
        }
    }

    /* renamed from: a */
    public void mo3297a(Context context, C1369z c1369z, C1425f c1425f, Map<String, Object> map) {
        this.f13200b = context;
        this.f13201c = c1369z;
        this.f13199P = c1425f;
        JSONObject jSONObject = (JSONObject) map.get(ManagerWebServices.FB_DATA);
        m16339a(jSONObject, C1490h.m5245a(jSONObject, "ct"));
        if (C1488g.m5234a(context, (C1487a) this)) {
            c1369z.mo1676a(this, AdError.NO_FILL);
            return;
        }
        if (c1369z != null) {
            c1369z.mo1675a(this);
        }
        C1481b.f4104a = this.f13186C;
    }

    /* renamed from: a */
    public void mo3298a(View view, List<View> list) {
    }

    /* renamed from: a */
    public void mo3299a(C1369z c1369z) {
        this.f13201c = c1369z;
    }

    /* renamed from: a */
    public void mo3300a(Map<String, String> map) {
        if (mo3302b() && !this.f13195L) {
            if (this.f13201c != null) {
                this.f13201c.mo1677b(this);
            }
            Map hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.f13192I) {
                hashMap.put("cardind", String.valueOf(this.f13189F));
                hashMap.put("cardcnt", String.valueOf(this.f13190G));
            }
            if (!(TextUtils.isEmpty(mo3292D()) || this.f13199P == null)) {
                this.f13199P.mo1743a(mo3292D(), hashMap);
            }
            if (mo3305e() || mo3304d()) {
                m16338a((Map) map, hashMap);
            }
            this.f13195L = true;
        }
    }

    /* renamed from: b */
    public void mo3301b(Map<String, String> map) {
        if (!mo3302b()) {
            return;
        }
        if (C1418g.m4932c(this.f13200b) && ap.m5211b((Map) map)) {
            Log.e(f13183a, "Click happened on lockscreen ad");
            return;
        }
        Map hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        C1490h.m5250a(this.f13200b, "Click logged");
        if (this.f13201c != null) {
            this.f13201c.mo1678c(this);
        }
        if (this.f13192I) {
            hashMap.put("cardind", String.valueOf(this.f13189F));
            hashMap.put("cardcnt", String.valueOf(this.f13190G));
        }
        C1348a a = C1349b.m4701a(this.f13200b, this.f13199P, this.f13191H, this.f13202d, hashMap);
        if (a != null) {
            try {
                this.f13197N = System.currentTimeMillis();
                this.f13198O = a.mo1717a();
                a.mo1718b();
            } catch (Throwable e) {
                Log.e(f13183a, "Error executing action", e);
            }
        }
    }

    /* renamed from: b */
    public boolean mo3302b() {
        return this.f13193J && this.f13194K;
    }

    /* renamed from: c */
    public boolean mo3303c() {
        return mo3302b() && this.f13214p;
    }

    /* renamed from: d */
    public boolean mo3304d() {
        return mo3302b() && this.f13216r;
    }

    /* renamed from: e */
    public boolean mo3305e() {
        return mo3302b() && this.f13215q;
    }

    /* renamed from: f */
    public boolean mo3306f() {
        return mo3302b() && this.f13187D != null;
    }

    /* renamed from: g */
    public boolean mo3307g() {
        return true;
    }

    /* renamed from: h */
    public int mo3308h() {
        if (this.f13218t >= 0) {
            if (this.f13218t <= 100) {
                return this.f13218t;
            }
        }
        return 0;
    }

    /* renamed from: i */
    public int mo3309i() {
        return this.f13219u;
    }

    /* renamed from: j */
    public int mo3310j() {
        return this.f13220v;
    }

    /* renamed from: k */
    public Image mo3311k() {
        return !mo3302b() ? null : this.f13208j;
    }

    /* renamed from: l */
    public Image mo3312l() {
        return !mo3302b() ? null : this.f13209k;
    }

    /* renamed from: m */
    public NativeAdViewAttributes mo3313m() {
        return !mo3302b() ? null : this.f13187D;
    }

    /* renamed from: n */
    public String mo3314n() {
        if (!mo3302b()) {
            return null;
        }
        m16335J();
        return this.f13203e;
    }

    /* renamed from: o */
    public String mo3315o() {
        if (!mo3302b()) {
            return null;
        }
        m16335J();
        return this.f13204f;
    }

    public void onDestroy() {
    }

    /* renamed from: p */
    public String mo3317p() {
        if (!mo3302b()) {
            return null;
        }
        m16335J();
        return ah.m5180a(this.f13205g);
    }

    /* renamed from: q */
    public String mo3318q() {
        if (!mo3302b()) {
            return null;
        }
        m16335J();
        return this.f13206h;
    }

    /* renamed from: r */
    public String mo3319r() {
        if (!mo3302b()) {
            return null;
        }
        m16335J();
        return this.f13207i;
    }

    /* renamed from: s */
    public Rating mo3320s() {
        if (!mo3302b()) {
            return null;
        }
        m16335J();
        return this.f13210l;
    }

    /* renamed from: t */
    public Image mo3321t() {
        return !mo3302b() ? null : this.f13184A;
    }

    /* renamed from: u */
    public String mo3322u() {
        return !mo3302b() ? null : this.f13185B;
    }

    /* renamed from: v */
    public String mo3323v() {
        return !mo3302b() ? null : "AdChoices";
    }

    /* renamed from: w */
    public String mo3324w() {
        return !mo3302b() ? null : this.f13221w;
    }

    /* renamed from: x */
    public String mo3325x() {
        return !mo3302b() ? null : this.f13222x;
    }

    /* renamed from: y */
    public VideoAutoplayBehavior mo3326y() {
        return !mo3302b() ? VideoAutoplayBehavior.DEFAULT : this.f13223y;
    }

    /* renamed from: z */
    public String mo3327z() {
        return this.f13224z;
    }
}
