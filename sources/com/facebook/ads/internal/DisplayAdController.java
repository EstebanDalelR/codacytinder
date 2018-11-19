package com.facebook.ads.internal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.BannerAdapter;
import com.facebook.ads.internal.adapters.BannerAdapterListener;
import com.facebook.ads.internal.adapters.C1356e;
import com.facebook.ads.internal.adapters.C1368w;
import com.facebook.ads.internal.adapters.C1369z;
import com.facebook.ads.internal.adapters.C3274t;
import com.facebook.ads.internal.adapters.C3276y;
import com.facebook.ads.internal.adapters.InterstitialAdapter;
import com.facebook.ads.internal.adapters.InterstitialAdapterListener;
import com.facebook.ads.internal.adapters.aa;
import com.facebook.ads.internal.adapters.ab;
import com.facebook.ads.internal.p037d.C1389a;
import com.facebook.ads.internal.p040g.C1405a;
import com.facebook.ads.internal.p040g.C1409d;
import com.facebook.ads.internal.p040g.C1410e;
import com.facebook.ads.internal.p040g.C1413g;
import com.facebook.ads.internal.p040g.C1416i;
import com.facebook.ads.internal.p040g.C1417j;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p041h.C3288g;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1482c;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1495k;
import com.facebook.ads.internal.p047k.C1504q;
import com.facebook.ads.internal.p047k.C1513y;
import com.facebook.ads.internal.p047k.C1515z;
import com.facebook.ads.internal.p047k.af;
import com.facebook.ads.internal.p047k.ao;
import com.facebook.ads.internal.p049l.C1517a;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1520a;
import com.facebook.ads.internal.protocol.C1521b;
import com.facebook.ads.internal.protocol.C1522c;
import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.server.C1527a;
import com.facebook.ads.internal.server.C1527a.C1526a;
import com.facebook.ads.internal.server.C3323f;
import com.facebook.ads.p033a.C1341a;
import com.tinder.api.ManagerWebServices;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayAdController implements C1526a {
    /* renamed from: b */
    private static final String f9927b = "DisplayAdController";
    /* renamed from: h */
    private static final Handler f9928h = new Handler(Looper.getMainLooper());
    /* renamed from: i */
    private static boolean f9929i = false;
    /* renamed from: A */
    private boolean f9930A;
    /* renamed from: B */
    private final C1425f f9931B;
    /* renamed from: C */
    private final EnumSet<CacheFlag> f9932C;
    /* renamed from: a */
    protected C1350a f9933a;
    /* renamed from: c */
    private final Context f9934c;
    /* renamed from: d */
    private final String f9935d;
    /* renamed from: e */
    private final AdPlacementType f9936e;
    /* renamed from: f */
    private final C1527a f9937f;
    /* renamed from: g */
    private final Handler f9938g;
    /* renamed from: j */
    private final Runnable f9939j;
    /* renamed from: k */
    private final Runnable f9940k;
    /* renamed from: l */
    private volatile boolean f9941l;
    /* renamed from: m */
    private boolean f9942m;
    /* renamed from: n */
    private volatile boolean f9943n;
    /* renamed from: o */
    private AdAdapter f9944o;
    /* renamed from: p */
    private AdAdapter f9945p;
    /* renamed from: q */
    private View f9946q;
    /* renamed from: r */
    private C1409d f9947r;
    /* renamed from: s */
    private C1413g f9948s;
    /* renamed from: t */
    private C1522c f9949t;
    /* renamed from: u */
    private C1521b f9950u;
    /* renamed from: v */
    private AdSize f9951v;
    /* renamed from: w */
    private int f9952w;
    /* renamed from: x */
    private boolean f9953x;
    /* renamed from: y */
    private int f9954y;
    /* renamed from: z */
    private final C1347c f9955z;

    /* renamed from: com.facebook.ads.internal.DisplayAdController$5 */
    class C13455 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ DisplayAdController f3612a;

        C13455(DisplayAdController displayAdController) {
            this.f3612a = displayAdController;
        }

        public void run() {
            try {
                this.f3612a.m12481l();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.DisplayAdController$c */
    private class C1347c extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ DisplayAdController f3615a;

        private C1347c(DisplayAdController displayAdController) {
            this.f3615a = displayAdController;
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                this.f3615a.m12486n();
                return;
            }
            if ("android.intent.action.SCREEN_ON".equals(action)) {
                this.f3615a.m12484m();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.DisplayAdController$6 */
    class C32446 implements C1341a {
        /* renamed from: a */
        final /* synthetic */ DisplayAdController f9923a;

        C32446(DisplayAdController displayAdController) {
            this.f9923a = displayAdController;
        }

        /* renamed from: a */
        public void mo1656a(C3274t c3274t) {
            this.f9923a.f9945p = c3274t;
            this.f9923a.f9943n = false;
            this.f9923a.f9933a.mo1638a((AdAdapter) c3274t);
        }

        /* renamed from: a */
        public void mo1657a(C3274t c3274t, View view) {
            this.f9923a.f9933a.mo1637a(view);
        }

        /* renamed from: a */
        public void mo1658a(C3274t c3274t, AdError adError) {
            this.f9923a.f9933a.mo1639a(new C1373b(adError.getErrorCode(), adError.getErrorMessage()));
        }

        /* renamed from: b */
        public void mo1659b(C3274t c3274t) {
            this.f9923a.f9933a.mo1636a();
        }

        /* renamed from: c */
        public void mo1660c(C3274t c3274t) {
            this.f9923a.f9933a.mo1640b();
        }

        /* renamed from: d */
        public void mo1661d(C3274t c3274t) {
            this.f9923a.f9933a.mo1655c();
        }
    }

    /* renamed from: com.facebook.ads.internal.DisplayAdController$7 */
    class C32457 implements ab {
        /* renamed from: a */
        final /* synthetic */ DisplayAdController f9924a;

        C32457(DisplayAdController displayAdController) {
            this.f9924a = displayAdController;
        }

        /* renamed from: a */
        public void mo1701a() {
            this.f9924a.f9933a.mo1691g();
        }

        /* renamed from: a */
        public void mo1702a(aa aaVar) {
            this.f9924a.f9945p = aaVar;
            this.f9924a.f9933a.mo1638a((AdAdapter) aaVar);
        }

        /* renamed from: a */
        public void mo1703a(aa aaVar, AdError adError) {
            this.f9924a.f9933a.mo1639a(new C1373b(AdErrorType.INTERNAL_ERROR, null));
            this.f9924a.m12456a((AdAdapter) aaVar);
            this.f9924a.m12479k();
        }

        /* renamed from: b */
        public void mo1704b(aa aaVar) {
            this.f9924a.f9933a.mo1636a();
        }

        /* renamed from: c */
        public void mo1705c(aa aaVar) {
            this.f9924a.f9933a.mo1640b();
        }

        /* renamed from: d */
        public void mo1706d(aa aaVar) {
            this.f9924a.f9933a.mo1690f();
        }

        /* renamed from: e */
        public void mo1707e(aa aaVar) {
            this.f9924a.f9933a.mo1692h();
        }

        /* renamed from: f */
        public void mo1708f(aa aaVar) {
            this.f9924a.f9933a.mo1693i();
        }
    }

    /* renamed from: com.facebook.ads.internal.DisplayAdController$a */
    private static final class C3247a extends ao<DisplayAdController> {
        public C3247a(DisplayAdController displayAdController) {
            super(displayAdController);
        }

        public void run() {
            DisplayAdController displayAdController = (DisplayAdController) m5207a();
            if (displayAdController != null) {
                displayAdController.f9941l = false;
                displayAdController.m12468c(null);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.DisplayAdController$b */
    private static final class C3248b extends ao<DisplayAdController> {
        public C3248b(DisplayAdController displayAdController) {
            super(displayAdController);
        }

        public void run() {
            DisplayAdController displayAdController = (DisplayAdController) m5207a();
            if (displayAdController != null) {
                displayAdController.m12484m();
            }
        }
    }

    public DisplayAdController(Context context, String str, C1522c c1522c, AdPlacementType adPlacementType, AdSize adSize, C1521b c1521b, int i, boolean z) {
        this(context, str, c1522c, adPlacementType, adSize, c1521b, i, z, EnumSet.of(CacheFlag.NONE));
    }

    public DisplayAdController(Context context, String str, C1522c c1522c, AdPlacementType adPlacementType, AdSize adSize, C1521b c1521b, int i, boolean z, EnumSet<CacheFlag> enumSet) {
        this.f9938g = new Handler();
        this.f9953x = false;
        this.f9954y = -1;
        this.f9934c = context;
        this.f9935d = str;
        this.f9949t = c1522c;
        this.f9936e = adPlacementType;
        this.f9951v = adSize;
        this.f9950u = c1521b;
        this.f9952w = i;
        this.f9955z = new C1347c();
        this.f9932C = enumSet;
        this.f9937f = new C1527a(context);
        this.f9937f.m5382a((C1526a) this);
        this.f9939j = new C3247a(this);
        this.f9940k = new C3248b(this);
        this.f9942m = z;
        m12473h();
        try {
            CookieManager.getInstance();
            if (VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(context);
            }
        } catch (Throwable e) {
            Log.w(f9927b, "Failed to initialize CookieManager.", e);
        }
        C1389a.m4826a(context).m4827a();
        this.f9931B = C3288g.m12671a(context);
    }

    /* renamed from: a */
    private Map<String, String> m12451a(long j) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("delay", String.valueOf(System.currentTimeMillis() - j));
        return hashMap;
    }

    /* renamed from: a */
    private void m12456a(AdAdapter adAdapter) {
        if (adAdapter != null) {
            adAdapter.onDestroy();
        }
    }

    /* renamed from: a */
    private void m12457a(final BannerAdapter bannerAdapter, C1409d c1409d, Map<String, Object> map) {
        final Runnable c13468 = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ DisplayAdController f3614b;

            public void run() {
                this.f3614b.m12456a(bannerAdapter);
                this.f3614b.m12479k();
            }
        };
        this.f9938g.postDelayed(c13468, (long) c1409d.m4895a().m4910j());
        bannerAdapter.loadBannerAd(this.f9934c, this.f9931B, this.f9951v, new BannerAdapterListener(this) {
            /* renamed from: b */
            final /* synthetic */ DisplayAdController f9926b;

            public void onBannerAdClicked(BannerAdapter bannerAdapter) {
                this.f9926b.f9933a.mo1636a();
            }

            public void onBannerAdExpanded(BannerAdapter bannerAdapter) {
                this.f9926b.m12486n();
            }

            public void onBannerAdLoaded(BannerAdapter bannerAdapter, View view) {
                if (bannerAdapter == this.f9926b.f9944o) {
                    this.f9926b.f9938g.removeCallbacks(c13468);
                    AdAdapter f = this.f9926b.f9945p;
                    this.f9926b.f9945p = bannerAdapter;
                    this.f9926b.f9946q = view;
                    if (this.f9926b.f9943n) {
                        this.f9926b.f9933a.mo1637a(view);
                        this.f9926b.m12456a(f);
                        this.f9926b.m12484m();
                        return;
                    }
                    this.f9926b.f9933a.mo1638a((AdAdapter) bannerAdapter);
                }
            }

            public void onBannerAdMinimized(BannerAdapter bannerAdapter) {
                this.f9926b.m12484m();
            }

            public void onBannerError(BannerAdapter bannerAdapter, AdError adError) {
                if (bannerAdapter == this.f9926b.f9944o) {
                    this.f9926b.f9938g.removeCallbacks(c13468);
                    this.f9926b.m12456a((AdAdapter) bannerAdapter);
                    this.f9926b.m12479k();
                }
            }

            public void onBannerLoggingImpression(BannerAdapter bannerAdapter) {
                this.f9926b.f9933a.mo1640b();
            }
        }, map);
    }

    /* renamed from: a */
    private void m12458a(final InterstitialAdapter interstitialAdapter, C1409d c1409d, Map<String, Object> map) {
        final Runnable anonymousClass10 = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ DisplayAdController f3602b;

            public void run() {
                this.f3602b.m12456a(interstitialAdapter);
                this.f3602b.m12479k();
            }
        };
        this.f9938g.postDelayed(anonymousClass10, (long) c1409d.m4895a().m4910j());
        interstitialAdapter.loadInterstitialAd(this.f9934c, new InterstitialAdapterListener(this) {
            /* renamed from: b */
            final /* synthetic */ DisplayAdController f9915b;

            public void onInterstitialAdClicked(InterstitialAdapter interstitialAdapter, String str, boolean z) {
                this.f9915b.f9933a.mo1636a();
                int isEmpty = TextUtils.isEmpty(str) ^ 1;
                if (z && isEmpty != 0) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (!(this.f9915b.f9948s.f3894d instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    intent.setData(Uri.parse(str));
                    this.f9915b.f9948s.f3894d.startActivity(intent);
                }
            }

            public void onInterstitialAdDismissed(InterstitialAdapter interstitialAdapter) {
                this.f9915b.f9933a.mo1664e();
            }

            public void onInterstitialAdDisplayed(InterstitialAdapter interstitialAdapter) {
                this.f9915b.f9933a.mo1663d();
            }

            public void onInterstitialAdLoaded(InterstitialAdapter interstitialAdapter) {
                if (interstitialAdapter == this.f9915b.f9944o) {
                    this.f9915b.f9938g.removeCallbacks(anonymousClass10);
                    this.f9915b.f9945p = interstitialAdapter;
                    this.f9915b.f9933a.mo1638a((AdAdapter) interstitialAdapter);
                    this.f9915b.m12484m();
                }
            }

            public void onInterstitialError(InterstitialAdapter interstitialAdapter, AdError adError) {
                if (interstitialAdapter == this.f9915b.f9944o) {
                    this.f9915b.f9938g.removeCallbacks(anonymousClass10);
                    this.f9915b.m12456a((AdAdapter) interstitialAdapter);
                    this.f9915b.m12479k();
                    this.f9915b.f9933a.mo1639a(new C1373b(adError.getErrorCode(), adError.getErrorMessage()));
                }
            }

            public void onInterstitialLoggingImpression(InterstitialAdapter interstitialAdapter) {
                this.f9915b.f9933a.mo1640b();
            }
        }, map, this.f9931B, this.f9932C);
    }

    /* renamed from: a */
    private void m12459a(aa aaVar, C1409d c1409d, Map<String, Object> map) {
        aaVar.mo3334a(this.f9934c, new C32457(this), map, this.f9953x);
    }

    /* renamed from: a */
    private void m12460a(C3274t c3274t, C1409d c1409d, Map<String, Object> map) {
        c3274t.mo3329a(this.f9934c, new C32446(this), map, this.f9931B, this.f9932C);
    }

    /* renamed from: a */
    private void m12461a(C3276y c3276y, C1409d c1409d, C1405a c1405a, Map<String, Object> map) {
        final C3276y c3276y2 = c3276y;
        final long currentTimeMillis = System.currentTimeMillis();
        final C1405a c1405a2 = c1405a;
        Runnable anonymousClass12 = new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ DisplayAdController f3606d;

            public void run() {
                this.f3606d.m12456a(c3276y2);
                if (c3276y2 instanceof C1368w) {
                    Context j = this.f3606d.f9934c;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(C1513y.m5314a(((C1368w) c3276y2).mo3294F()));
                    stringBuilder.append(" Failed. Ad request timed out");
                    C1490h.m5250a(j, stringBuilder.toString());
                }
                Map a = this.f3606d.m12451a(currentTimeMillis);
                a.put("error", "-1");
                a.put("msg", "timeout");
                this.f3606d.m12462a(c1405a2.m4889a(C1417j.REQUEST), a);
                this.f3606d.m12479k();
            }
        };
        this.f9938g.postDelayed(anonymousClass12, (long) c1409d.m4895a().m4910j());
        final Runnable runnable = anonymousClass12;
        c3276y.mo3297a(this.f9934c, new C1369z(this) {
            /* renamed from: a */
            boolean f9916a = false;
            /* renamed from: b */
            boolean f9917b = false;
            /* renamed from: c */
            boolean f9918c = false;
            /* renamed from: g */
            final /* synthetic */ DisplayAdController f9922g;

            /* renamed from: a */
            public void mo1675a(C3276y c3276y) {
                if (c3276y == this.f9922g.f9944o) {
                    this.f9922g.f9938g.removeCallbacks(runnable);
                    this.f9922g.f9945p = c3276y;
                    this.f9922g.f9933a.mo1638a((AdAdapter) c3276y);
                    if (!this.f9916a) {
                        this.f9916a = true;
                        this.f9922g.m12462a(c1405a2.m4889a(C1417j.REQUEST), this.f9922g.m12451a(currentTimeMillis));
                    }
                }
            }

            /* renamed from: a */
            public void mo1676a(C3276y c3276y, AdError adError) {
                if (c3276y == this.f9922g.f9944o) {
                    this.f9922g.f9938g.removeCallbacks(runnable);
                    this.f9922g.m12456a((AdAdapter) c3276y);
                    if (!this.f9916a) {
                        this.f9916a = true;
                        Map a = this.f9922g.m12451a(currentTimeMillis);
                        a.put("error", String.valueOf(adError.getErrorCode()));
                        a.put("msg", String.valueOf(adError.getErrorMessage()));
                        this.f9922g.m12462a(c1405a2.m4889a(C1417j.REQUEST), a);
                    }
                    this.f9922g.m12479k();
                }
            }

            /* renamed from: b */
            public void mo1677b(C3276y c3276y) {
                if (!this.f9917b) {
                    this.f9917b = true;
                    this.f9922g.m12462a(c1405a2.m4889a(C1417j.IMPRESSION), null);
                }
            }

            /* renamed from: c */
            public void mo1678c(C3276y c3276y) {
                if (!this.f9918c) {
                    this.f9918c = true;
                    this.f9922g.m12462a(c1405a2.m4889a(C1417j.CLICK), null);
                }
                if (this.f9922g.f9933a != null) {
                    this.f9922g.f9933a.mo1636a();
                }
            }
        }, this.f9931B, map);
    }

    /* renamed from: a */
    private void m12462a(List<String> list, Map<String, String> map) {
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                new C1515z(map).execute(new String[]{str});
            }
        }
    }

    /* renamed from: c */
    private void m12468c(String str) {
        try {
            this.f9948s = new C1413g(this.f9934c, new C1416i(this.f9934c, false), this.f9935d, this.f9951v, this.f9949t, this.f9950u, this.f9952w, AdSettings.isTestMode(this.f9934c), new C1495k(this.f9934c, str, this.f9935d, this.f9949t), af.m5178a(this.f9934c));
            this.f9937f.m5381a(this.f9948s);
        } catch (C1520a e) {
            mo1715a(C1373b.m4794a(e));
        }
    }

    /* renamed from: h */
    private void m12473h() {
        if (!this.f9942m) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.f9934c.registerReceiver(this.f9955z, intentFilter);
            this.f9930A = true;
        }
    }

    /* renamed from: i */
    private void m12476i() {
        if (this.f9930A) {
            try {
                this.f9934c.unregisterReceiver(this.f9955z);
                this.f9930A = false;
            } catch (Throwable e) {
                C1482c.m5218a(C1481b.m5215a(e, "Error unregistering screen state receiever"));
            }
        }
    }

    /* renamed from: j */
    private AdPlacementType m12478j() {
        return this.f9936e != null ? this.f9936e : this.f9951v == null ? AdPlacementType.NATIVE : this.f9951v == AdSize.INTERSTITIAL ? AdPlacementType.INTERSTITIAL : AdPlacementType.BANNER;
    }

    /* renamed from: k */
    private synchronized void m12479k() {
        f9928h.post(new C13455(this));
    }

    /* renamed from: l */
    private void m12481l() {
        this.f9944o = null;
        C1409d c1409d = this.f9947r;
        C1405a d = c1409d.m4899d();
        if (d == null) {
            this.f9933a.mo1639a(C1373b.m4793a(AdErrorType.NO_FILL, ""));
            m12484m();
            return;
        }
        String a = d.m4888a();
        AdAdapter a2 = C1356e.m4747a(a, c1409d.m4895a().m4902b());
        if (a2 == null) {
            String str = f9927b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Adapter does not exist: ");
            stringBuilder.append(a);
            Log.e(str, stringBuilder.toString());
            m12479k();
        } else if (m12478j() != a2.getPlacementType()) {
            this.f9933a.mo1639a(C1373b.m4793a(AdErrorType.INTERNAL_ERROR, ""));
        } else {
            this.f9944o = a2;
            Map hashMap = new HashMap();
            C1410e a3 = c1409d.m4895a();
            hashMap.put(ManagerWebServices.FB_DATA, d.m4890b());
            hashMap.put("definition", a3);
            hashMap.put(AudienceNetworkActivity.PLACEMENT_ID, this.f9935d);
            hashMap.put(AudienceNetworkActivity.REQUEST_TIME, Long.valueOf(a3.m4901a()));
            if (this.f9948s == null) {
                this.f9933a.mo1639a(C1373b.m4793a(AdErrorType.UNKNOWN_ERROR, "environment is empty"));
                return;
            }
            switch (a2.getPlacementType()) {
                case INTERSTITIAL:
                    m12458a((InterstitialAdapter) a2, c1409d, hashMap);
                    return;
                case BANNER:
                    m12457a((BannerAdapter) a2, c1409d, hashMap);
                    return;
                case NATIVE:
                    m12461a((C3276y) a2, c1409d, d, hashMap);
                    return;
                case INSTREAM:
                    m12460a((C3274t) a2, c1409d, hashMap);
                    return;
                case REWARDED_VIDEO:
                    m12459a((aa) a2, c1409d, hashMap);
                    return;
                default:
                    Log.e(f9927b, "attempt unexpected adapter type");
                    return;
            }
        }
    }

    /* renamed from: m */
    private void m12484m() {
        if (!this.f9942m && !this.f9941l) {
            switch (m12478j()) {
                case INTERSTITIAL:
                    if (!C1504q.m5292a(this.f9934c)) {
                        this.f9938g.postDelayed(this.f9940k, 1000);
                        break;
                    }
                    break;
                case BANNER:
                    boolean a = C1517a.m5330a(this.f9946q, this.f9947r == null ? 1 : this.f9947r.m4895a().m4906f()).m5354a();
                    if (!(this.f9946q == null || a)) {
                        this.f9938g.postDelayed(this.f9940k, 1000);
                        return;
                    }
                default:
                    return;
            }
            long c = this.f9947r == null ? 30000 : this.f9947r.m4895a().m4903c();
            if (c > 0) {
                this.f9938g.postDelayed(this.f9939j, c);
                this.f9941l = true;
            }
        }
    }

    /* renamed from: n */
    private void m12486n() {
        if (this.f9941l) {
            this.f9938g.removeCallbacks(this.f9939j);
            this.f9941l = false;
        }
    }

    /* renamed from: o */
    private Handler m12487o() {
        return !m12488p() ? this.f9938g : f9928h;
    }

    /* renamed from: p */
    private static synchronized boolean m12488p() {
        boolean z;
        synchronized (DisplayAdController.class) {
            z = f9929i;
        }
        return z;
    }

    protected static synchronized void setMainThreadForced(boolean z) {
        synchronized (DisplayAdController.class) {
            String str = f9927b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DisplayAdController changed main thread forced from ");
            stringBuilder.append(f9929i);
            stringBuilder.append(" to ");
            stringBuilder.append(z);
            Log.d(str, stringBuilder.toString());
            f9929i = z;
        }
    }

    /* renamed from: a */
    public C1410e m12489a() {
        return this.f9947r == null ? null : this.f9947r.m4895a();
    }

    /* renamed from: a */
    public void m12490a(int i) {
        this.f9954y = i;
    }

    /* renamed from: a */
    public void m12491a(C1350a c1350a) {
        this.f9933a = c1350a;
    }

    /* renamed from: a */
    public synchronized void mo1715a(final C1373b c1373b) {
        m12487o().post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ DisplayAdController f3610b;

            public void run() {
                this.f3610b.f9933a.mo1639a(c1373b);
                if (!this.f3610b.f9942m && !this.f3610b.f9941l) {
                    int errorCode = c1373b.m4795a().getErrorCode();
                    if ((errorCode == AdError.NETWORK_ERROR_CODE || errorCode == AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE) && C13444.f3611a[this.f3610b.m12478j().ordinal()] == 2) {
                        this.f3610b.f9938g.postDelayed(this.f3610b.f9939j, 30000);
                        this.f3610b.f9941l = true;
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public synchronized void mo1716a(final C3323f c3323f) {
        m12487o().post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ DisplayAdController f3608b;

            public void run() {
                C1409d a = c3323f.mo1784a();
                if (a != null) {
                    if (a.m4895a() != null) {
                        this.f3608b.f9947r = a;
                        this.f3608b.m12479k();
                        return;
                    }
                }
                throw new IllegalStateException("invalid placement in response");
            }
        });
    }

    /* renamed from: a */
    public void m12494a(String str) {
        m12468c(str);
    }

    /* renamed from: a */
    public void m12495a(boolean z) {
        this.f9953x = z;
    }

    /* renamed from: b */
    public void m12496b() {
        if (this.f9945p == null) {
            throw new IllegalStateException("no adapter ready to start");
        } else if (this.f9943n) {
            throw new IllegalStateException("ad already started");
        } else {
            this.f9943n = true;
            switch (this.f9945p.getPlacementType()) {
                case INTERSTITIAL:
                    ((InterstitialAdapter) this.f9945p).show();
                    break;
                case BANNER:
                    if (this.f9946q != null) {
                        this.f9933a.mo1637a(this.f9946q);
                        m12484m();
                        return;
                    }
                    break;
                case NATIVE:
                    C3276y c3276y = (C3276y) this.f9945p;
                    if (c3276y.mo3302b()) {
                        this.f9933a.mo1679a(c3276y);
                        return;
                    }
                    throw new IllegalStateException("ad is not ready or already displayed");
                case INSTREAM:
                    ((C3274t) this.f9945p).mo3330e();
                    return;
                case REWARDED_VIDEO:
                    aa aaVar = (aa) this.f9945p;
                    aaVar.m12519a(this.f9954y);
                    aaVar.mo3336c();
                    return;
                default:
                    Log.e(f9927b, "start unexpected adapter type");
                    return;
            }
        }
    }

    /* renamed from: b */
    public void m12497b(String str) {
        m12486n();
        m12468c(str);
    }

    /* renamed from: b */
    public void m12498b(boolean z) {
        m12476i();
        if (z || this.f9943n) {
            m12486n();
            m12456a(this.f9945p);
            this.f9937f.m5380a();
            this.f9946q = null;
            this.f9943n = false;
        }
    }

    /* renamed from: c */
    public void m12499c() {
        m12498b(false);
    }

    /* renamed from: d */
    public void m12500d() {
        if (this.f9943n) {
            m12486n();
        }
    }

    /* renamed from: e */
    public void m12501e() {
        if (this.f9943n) {
            m12484m();
        }
    }

    /* renamed from: f */
    public void m12502f() {
        this.f9942m = true;
        m12486n();
    }

    /* renamed from: g */
    public AdAdapter m12503g() {
        return this.f9945p;
    }
}
