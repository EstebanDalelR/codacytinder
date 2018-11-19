package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.Type;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.p036c.C1374a;
import com.facebook.ads.internal.p036c.C1380b;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1488g;
import com.facebook.ads.internal.view.C1604d;
import com.facebook.ads.internal.view.C4191l;
import com.facebook.ads.internal.view.C4192m;
import com.facebook.ads.internal.view.C4198n;
import com.facebook.ads.p033a.C1341a;
import com.tinder.api.ManagerWebServices;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.l */
public class C4144l extends InterstitialAdapter {
    /* renamed from: a */
    private static final ConcurrentMap<String, C1604d> f13171a = new ConcurrentHashMap();
    /* renamed from: b */
    private final String f13172b = UUID.randomUUID().toString();
    /* renamed from: c */
    private String f13173c;
    /* renamed from: d */
    private long f13174d;
    /* renamed from: e */
    private Context f13175e;
    /* renamed from: f */
    private C1367v f13176f;
    /* renamed from: g */
    private InterstitialAdapterListener f13177g;
    /* renamed from: h */
    private boolean f13178h = false;
    /* renamed from: i */
    private C3272q f13179i;
    /* renamed from: j */
    private C1360a f13180j = C1360a.UNSPECIFIED;
    /* renamed from: k */
    private C1366u f13181k;
    /* renamed from: l */
    private Type f13182l;

    /* renamed from: com.facebook.ads.internal.adapters.l$a */
    public enum C1360a {
        UNSPECIFIED,
        VERTICAL,
        HORIZONTAL;

        /* renamed from: a */
        public static C1360a m4760a(int i) {
            return i == 0 ? UNSPECIFIED : i == 2 ? HORIZONTAL : VERTICAL;
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.l$2 */
    class C32672 implements C1374a {
        /* renamed from: a */
        final /* synthetic */ C4144l f9992a;

        C32672(C4144l c4144l) {
            this.f9992a = c4144l;
        }

        /* renamed from: c */
        private void m12554c() {
            this.f9992a.f13178h = true;
            this.f9992a.f13177g.onInterstitialAdLoaded(this.f9992a);
        }

        /* renamed from: a */
        public void mo1673a() {
            m12554c();
        }

        /* renamed from: b */
        public void mo1674b() {
            m12554c();
        }
    }

    /* renamed from: a */
    private int m16324a() {
        int rotation = ((WindowManager) this.f13175e.getSystemService("window")).getDefaultDisplay().getRotation();
        if (this.f13180j == C1360a.UNSPECIFIED) {
            return -1;
        }
        if (this.f13180j != C1360a.HORIZONTAL) {
            return rotation != 2 ? 1 : 9;
        } else {
            switch (rotation) {
                case 2:
                case 3:
                    return 8;
                default:
                    return 0;
            }
        }
    }

    /* renamed from: a */
    public static C1604d m16327a(String str) {
        return (C1604d) f13171a.get(str);
    }

    /* renamed from: a */
    public static void m16328a(C1604d c1604d) {
        for (Entry entry : f13171a.entrySet()) {
            if (entry.getValue() == c1604d) {
                f13171a.remove(entry.getKey());
            }
        }
    }

    /* renamed from: b */
    private static void m16332b(String str, C1604d c1604d) {
        f13171a.put(str, c1604d);
    }

    public void loadInterstitialAd(final Context context, InterstitialAdapterListener interstitialAdapterListener, Map<String, Object> map, final C1425f c1425f, EnumSet<CacheFlag> enumSet) {
        this.f13175e = context;
        this.f13177g = interstitialAdapterListener;
        this.f13173c = (String) map.get(AudienceNetworkActivity.PLACEMENT_ID);
        this.f13174d = ((Long) map.get(AudienceNetworkActivity.REQUEST_TIME)).longValue();
        JSONObject jSONObject = (JSONObject) map.get(ManagerWebServices.FB_DATA);
        if (jSONObject.has("markup")) {
            this.f13182l = Type.INTERSTITIAL_WEB_VIEW;
            this.f13179i = C3272q.m12567a(jSONObject);
            if (C1488g.m5234a(context, this.f13179i)) {
                interstitialAdapterListener.onInterstitialError(this, AdError.NO_FILL);
                return;
            }
            this.f13176f = new C1367v(context, this.f13172b, this, this.f13177g);
            this.f13176f.m4772a();
            Map c = this.f13179i.m12575c();
            if (c.containsKey("orientation")) {
                this.f13180j = C1360a.m4760a(Integer.parseInt((String) c.get("orientation")));
            }
            this.f13178h = true;
            if (this.f13177g != null) {
            }
            return;
        } else if (jSONObject.has("video")) {
            this.f13182l = Type.INTERSTITIAL_NATIVE_VIDEO;
            this.f13176f = new C1367v(context, this.f13172b, this, this.f13177g);
            this.f13176f.m4772a();
            final C4352m c4352m = new C4352m();
            c4352m.mo3329a(context, new C1341a(this) {
                /* renamed from: b */
                final /* synthetic */ C4144l f9991b;

                /* renamed from: a */
                public void mo1656a(C3274t c3274t) {
                    this.f9991b.f13178h = true;
                    if (this.f9991b.f13177g != null) {
                        this.f9991b.f13177g.onInterstitialAdLoaded(this.f9991b);
                    }
                }

                /* renamed from: a */
                public void mo1657a(C3274t c3274t, View view) {
                    this.f9991b.f13180j = c4352m.m17746j();
                    C4144l.m16332b(this.f9991b.f13172b, c4352m);
                }

                /* renamed from: a */
                public void mo1658a(C3274t c3274t, AdError adError) {
                    c4352m.m17747k();
                    this.f9991b.f13177g.onInterstitialError(this.f9991b, adError);
                }

                /* renamed from: b */
                public void mo1659b(C3274t c3274t) {
                    this.f9991b.f13177g.onInterstitialAdClicked(this.f9991b, "", true);
                }

                /* renamed from: c */
                public void mo1660c(C3274t c3274t) {
                    this.f9991b.f13177g.onInterstitialLoggingImpression(this.f9991b);
                }

                /* renamed from: d */
                public void mo1661d(C3274t c3274t) {
                }
            }, (Map) map, c1425f, (EnumSet) enumSet);
            return;
        } else {
            this.f13181k = C1366u.m4761a(jSONObject, context);
            if (this.f13181k.m4765d().size() == 0) {
                this.f13177g.onInterstitialError(this, AdError.NO_FILL);
            }
            this.f13176f = new C1367v(context, this.f13172b, this, this.f13177g);
            this.f13176f.m4772a();
            int i = 0;
            C1380b c1380b;
            if (jSONObject.has(ManagerWebServices.PARAM_CAROUSEL)) {
                this.f13182l = Type.INTERSTITIAL_NATIVE_CAROUSEL;
                C4144l.m16332b(this.f13172b, new C4191l(context, c1425f));
                c1380b = new C1380b(context);
                c1380b.m4807a(this.f13181k.m4764c());
                List d = this.f13181k.m4765d();
                while (i < d.size()) {
                    c1380b.m4807a(((C1353c) d.get(i)).m4740f());
                    i++;
                }
                c1380b.m4806a(new C32672(this));
                this.f13178h = true;
            } else {
                C1374a c32694;
                if (jSONObject.has("video_url")) {
                    this.f13182l = Type.INTERSTITIAL_NATIVE_VIDEO;
                    c1380b = new C1380b(context);
                    c1380b.m4807a(((C1353c) this.f13181k.m4765d().get(0)).m4740f());
                    c1380b.m4807a(this.f13181k.m4764c());
                    if (enumSet.contains(CacheFlag.VIDEO)) {
                        c1380b.m4808b(((C1353c) this.f13181k.m4765d().get(0)).m4743i());
                    }
                    final EnumSet<CacheFlag> enumSet2 = enumSet;
                    final Context context2 = context;
                    final C1425f c1425f2 = c1425f;
                    final C1380b c1380b2 = c1380b;
                    C1374a c32683 = new C1374a(this) {
                        /* renamed from: e */
                        final /* synthetic */ C4144l f9997e;

                        /* renamed from: a */
                        private void m12557a(boolean z) {
                            C4144l.m16332b(this.f9997e.f13172b, new C4198n(context2, c1425f2, this.f9997e.f13181k, z ? c1380b2 : null));
                            this.f9997e.f13178h = true;
                            this.f9997e.f13177g.onInterstitialAdLoaded(this.f9997e);
                        }

                        /* renamed from: a */
                        public void mo1673a() {
                            m12557a(enumSet2.contains(CacheFlag.VIDEO));
                        }

                        /* renamed from: b */
                        public void mo1674b() {
                            m12557a(false);
                        }
                    };
                } else {
                    this.f13182l = Type.INTERSTITIAL_NATIVE_IMAGE;
                    c1380b = new C1380b(context);
                    c1380b.m4807a(((C1353c) this.f13181k.m4765d().get(0)).m4740f());
                    c1380b.m4807a(this.f13181k.m4764c());
                    c32694 = new C1374a(this) {
                        /* renamed from: c */
                        final /* synthetic */ C4144l f10000c;

                        /* renamed from: c */
                        private void m12560c() {
                            C4144l.m16332b(this.f10000c.f13172b, new C4192m(context, this.f10000c.f13181k, c1425f));
                            this.f10000c.f13178h = true;
                            this.f10000c.f13177g.onInterstitialAdLoaded(this.f10000c);
                        }

                        /* renamed from: a */
                        public void mo1673a() {
                            m12560c();
                        }

                        /* renamed from: b */
                        public void mo1674b() {
                            m12560c();
                        }
                    };
                }
                c1380b.m4806a(c32694);
                return;
            }
        }
        this.f13177g.onInterstitialAdLoaded(this);
    }

    public void onDestroy() {
        if (this.f13176f != null) {
            this.f13176f.m4773b();
        }
    }

    public boolean show() {
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
        r4 = this;
        r0 = r4.f13178h;
        if (r0 != 0) goto L_0x0011;
    L_0x0004:
        r0 = r4.f13177g;
        if (r0 == 0) goto L_0x000f;
    L_0x0008:
        r0 = r4.f13177g;
        r1 = com.facebook.ads.AdError.INTERNAL_ERROR;
        r0.onInterstitialError(r4, r1);
    L_0x000f:
        r0 = 0;
        return r0;
    L_0x0011:
        r0 = new android.content.Intent;
        r1 = r4.f13175e;
        r2 = com.facebook.ads.AudienceNetworkActivity.class;
        r0.<init>(r1, r2);
        r1 = "predefinedOrientationKey";
        r2 = r4.m16324a();
        r0.putExtra(r1, r2);
        r1 = "uniqueId";
        r2 = r4.f13172b;
        r0.putExtra(r1, r2);
        r1 = "placementId";
        r2 = r4.f13173c;
        r0.putExtra(r1, r2);
        r1 = "requestTime";
        r2 = r4.f13174d;
        r0.putExtra(r1, r2);
        r1 = "viewType";
        r2 = r4.f13182l;
        r0.putExtra(r1, r2);
        r1 = r4.f13181k;
        if (r1 == 0) goto L_0x004b;
    L_0x0043:
        r1 = "ad_data_bundle";
        r2 = r4.f13181k;
        r0.putExtra(r1, r2);
        goto L_0x0054;
    L_0x004b:
        r1 = r4.f13179i;
        if (r1 == 0) goto L_0x0054;
    L_0x004f:
        r1 = r4.f13179i;
        r1.m12573a(r0);
    L_0x0054:
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.addFlags(r1);
        r1 = r4.f13175e;	 Catch:{ ActivityNotFoundException -> 0x005f }
        r1.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x005f }
        goto L_0x006b;
    L_0x005f:
        r1 = r4.f13175e;
        r2 = com.facebook.ads.InterstitialAdActivity.class;
        r0.setClass(r1, r2);
        r1 = r4.f13175e;
        r1.startActivity(r0);
    L_0x006b:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.l.show():boolean");
    }
}
