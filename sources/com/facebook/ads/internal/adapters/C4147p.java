package com.facebook.ads.internal.adapters;

import android.content.Context;
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
import com.flurry.android.FlurryAgent;
import com.flurry.android.ads.FlurryAdErrorType;
import com.flurry.android.ads.FlurryAdNative;
import com.flurry.android.ads.FlurryAdNativeAsset;
import com.flurry.android.ads.FlurryAdNativeListener;
import com.tinder.api.ManagerWebServices;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.p */
public class C4147p extends C3276y implements C1368w {
    /* renamed from: a */
    private static volatile boolean f13245a;
    /* renamed from: b */
    private C1369z f13246b;
    /* renamed from: c */
    private FlurryAdNative f13247c;
    /* renamed from: d */
    private boolean f13248d;
    /* renamed from: e */
    private String f13249e;
    /* renamed from: f */
    private String f13250f;
    /* renamed from: g */
    private String f13251g;
    /* renamed from: h */
    private String f13252h;
    /* renamed from: i */
    private String f13253i;
    /* renamed from: j */
    private Image f13254j;
    /* renamed from: k */
    private Image f13255k;
    /* renamed from: l */
    private Image f13256l;

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
        return AdNetwork.FLURRY;
    }

    /* renamed from: F */
    public C1357f mo3294F() {
        return C1357f.YAHOO;
    }

    /* renamed from: a */
    public void mo3295a() {
        if (this.f13247c != null) {
            this.f13247c.removeTrackingView();
        }
    }

    /* renamed from: a */
    public void mo3296a(int i) {
    }

    /* renamed from: a */
    public void mo3297a(final Context context, C1369z c1369z, C1425f c1425f, Map<String, Object> map) {
        JSONObject jSONObject = (JSONObject) map.get(ManagerWebServices.FB_DATA);
        String optString = jSONObject.optString("api_key");
        String optString2 = jSONObject.optString("placement_id");
        synchronized (C4147p.class) {
            if (!f13245a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C1513y.m5314a(mo3294F()));
                stringBuilder.append(" Initializing");
                C1490h.m5250a(context, stringBuilder.toString());
                FlurryAgent.setLogEnabled(true);
                FlurryAgent.init(context, optString);
                f13245a = true;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(C1513y.m5314a(mo3294F()));
        stringBuilder2.append(" Loading");
        C1490h.m5250a(context, stringBuilder2.toString());
        this.f13246b = c1369z;
        this.f13247c = new FlurryAdNative(context, optString2);
        this.f13247c.setListener(new FlurryAdNativeListener(this) {
            /* renamed from: b */
            final /* synthetic */ C4147p f3687b;

            public void onAppExit(FlurryAdNative flurryAdNative) {
            }

            public void onClicked(FlurryAdNative flurryAdNative) {
                if (this.f3687b.f13246b != null) {
                    this.f3687b.f13246b.mo1678c(this.f3687b);
                }
            }

            public void onCloseFullscreen(FlurryAdNative flurryAdNative) {
            }

            public void onCollapsed(FlurryAdNative flurryAdNative) {
            }

            public void onError(FlurryAdNative flurryAdNative, FlurryAdErrorType flurryAdErrorType, int i) {
                Context context = context;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C1513y.m5314a(this.f3687b.mo3294F()));
                stringBuilder.append(" Failed with FlurryError: ");
                stringBuilder.append(flurryAdErrorType.toString());
                C1490h.m5250a(context, stringBuilder.toString());
                if (this.f3687b.f13246b != null) {
                    this.f3687b.f13246b.mo1676a(this.f3687b, new AdError(AdError.MEDIATION_ERROR_CODE, flurryAdErrorType.toString()));
                }
            }

            public void onExpanded(FlurryAdNative flurryAdNative) {
            }

            public void onFetched(FlurryAdNative flurryAdNative) {
                if (this.f3687b.f13246b != null) {
                    Context context;
                    StringBuilder stringBuilder;
                    if (flurryAdNative.isVideoAd()) {
                        context = context;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(C1513y.m5314a(this.f3687b.mo3294F()));
                        stringBuilder.append(" Failed. AN does not support Flurry video ads");
                        C1490h.m5250a(context, stringBuilder.toString());
                        this.f3687b.f13246b.mo1676a(this.f3687b, new AdError(AdError.MEDIATION_ERROR_CODE, "video ad"));
                        return;
                    }
                    this.f3687b.f13248d = true;
                    FlurryAdNativeAsset asset = flurryAdNative.getAsset("headline");
                    if (asset != null) {
                        this.f3687b.f13249e = asset.getValue();
                    }
                    asset = flurryAdNative.getAsset(ManagerWebServices.FB_PARAM_SUMMARY);
                    if (asset != null) {
                        this.f3687b.f13250f = asset.getValue();
                    }
                    asset = flurryAdNative.getAsset("source");
                    if (asset != null) {
                        this.f3687b.f13251g = asset.getValue();
                    }
                    asset = flurryAdNative.getAsset("appCategory");
                    if (asset != null) {
                        this.f3687b.f13253i = asset.getValue();
                    }
                    asset = flurryAdNative.getAsset("callToAction");
                    if (asset != null) {
                        this.f3687b.f13252h = asset.getValue();
                    } else {
                        C4147p c4147p;
                        String str;
                        if (flurryAdNative.getAsset("appRating") != null) {
                            c4147p = this.f3687b;
                            str = "Install Now";
                        } else {
                            c4147p = this.f3687b;
                            str = "Learn More";
                        }
                        c4147p.f13252h = str;
                    }
                    asset = flurryAdNative.getAsset("secImage");
                    if (asset != null) {
                        this.f3687b.f13254j = new Image(asset.getValue(), 82, 82);
                    }
                    asset = flurryAdNative.getAsset("secHqImage");
                    if (asset != null) {
                        this.f3687b.f13255k = new Image(asset.getValue(), 1200, 627);
                    }
                    FlurryAdNativeAsset asset2 = flurryAdNative.getAsset("secBrandingLogo");
                    if (asset2 != null) {
                        this.f3687b.f13256l = new Image(asset2.getValue(), 20, 20);
                    }
                    context = context;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(C1513y.m5314a(this.f3687b.mo3294F()));
                    stringBuilder.append(" Loaded");
                    C1490h.m5250a(context, stringBuilder.toString());
                    this.f3687b.f13246b.mo1675a(this.f3687b);
                }
            }

            public void onImpressionLogged(FlurryAdNative flurryAdNative) {
                if (this.f3687b.f13246b != null) {
                    this.f3687b.f13246b.mo1677b(this.f3687b);
                }
            }

            public void onShowFullscreen(FlurryAdNative flurryAdNative) {
            }
        });
        this.f13247c.fetchAd();
    }

    /* renamed from: a */
    public void mo3298a(View view, List<View> list) {
        if (this.f13247c != null) {
            this.f13247c.setTrackingView(view);
        }
    }

    /* renamed from: a */
    public void mo3299a(C1369z c1369z) {
        this.f13246b = c1369z;
    }

    /* renamed from: a */
    public void mo3300a(Map<String, String> map) {
    }

    /* renamed from: b */
    public void mo3301b(Map<String, String> map) {
    }

    /* renamed from: b */
    public boolean mo3302b() {
        return this.f13248d;
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
        return this.f13254j;
    }

    /* renamed from: l */
    public Image mo3312l() {
        return this.f13255k;
    }

    /* renamed from: m */
    public NativeAdViewAttributes mo3313m() {
        return null;
    }

    /* renamed from: n */
    public String mo3314n() {
        return this.f13249e;
    }

    /* renamed from: o */
    public String mo3315o() {
        return this.f13251g;
    }

    public void onDestroy() {
        mo3295a();
        this.f13246b = null;
        if (this.f13247c != null) {
            this.f13247c.destroy();
            this.f13247c = null;
        }
    }

    /* renamed from: p */
    public String mo3317p() {
        return this.f13250f;
    }

    /* renamed from: q */
    public String mo3318q() {
        return this.f13252h;
    }

    /* renamed from: r */
    public String mo3319r() {
        return this.f13253i;
    }

    /* renamed from: s */
    public Rating mo3320s() {
        return null;
    }

    /* renamed from: t */
    public Image mo3321t() {
        return this.f13256l;
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
