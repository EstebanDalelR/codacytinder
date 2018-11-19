package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p034a.C1348a;
import com.facebook.ads.internal.p034a.C1349b;
import com.facebook.ads.internal.p040g.C1410e;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1481b.C1479a;
import com.facebook.ads.internal.p047k.C1482c;
import com.facebook.ads.internal.p047k.C1488g;
import com.facebook.ads.internal.p047k.C1488g.C1487a;
import com.facebook.ads.internal.p047k.C1491i;
import com.facebook.ads.internal.view.C3365c;
import com.facebook.ads.internal.view.C3365c.C1560b;
import com.tinder.api.ManagerWebServices;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.j */
public class C4142j extends BannerAdapter {
    /* renamed from: a */
    private static final String f13146a = "j";
    /* renamed from: b */
    private C3365c f13147b;
    /* renamed from: c */
    private C3273r f13148c;
    /* renamed from: d */
    private BannerAdapterListener f13149d;
    /* renamed from: e */
    private Map<String, Object> f13150e;
    @Nullable
    /* renamed from: f */
    private C1425f f13151f;
    /* renamed from: g */
    private Context f13152g;
    /* renamed from: h */
    private long f13153h;
    /* renamed from: i */
    private C1479a f13154i;

    /* renamed from: com.facebook.ads.internal.adapters.j$2 */
    class C32592 extends C1352b {
        /* renamed from: a */
        final /* synthetic */ C4142j f9983a;

        C32592(C4142j c4142j) {
            this.f9983a = c4142j;
        }

        /* renamed from: d */
        public void mo1683d() {
            if (this.f9983a.f13149d != null) {
                this.f9983a.f13149d.onBannerLoggingImpression(this.f9983a);
            }
        }
    }

    /* renamed from: a */
    private void m16305a(C1410e c1410e) {
        this.f13153h = 0;
        this.f13154i = null;
        final C3272q a = C3272q.m12567a((JSONObject) this.f13150e.get(ManagerWebServices.FB_DATA));
        if (C1488g.m5234a(this.f13152g, (C1487a) a)) {
            this.f13149d.onBannerError(this, AdError.NO_FILL);
            return;
        }
        this.f13147b = new C3365c(this.f13152g, new C1560b(this) {
            /* renamed from: b */
            final /* synthetic */ C4142j f9982b;

            /* renamed from: a */
            public void mo1651a() {
                this.f9982b.f13148c.m12585b();
            }

            /* renamed from: a */
            public void mo1652a(int i) {
                if (i == 0 && this.f9982b.f13153h > 0 && this.f9982b.f13154i != null) {
                    C1482c.m5218a(C1481b.m5213a(this.f9982b.f13153h, this.f9982b.f13154i, a.m12576d()));
                    this.f9982b.f13153h = 0;
                    this.f9982b.f13154i = null;
                }
            }

            /* renamed from: a */
            public void mo1653a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if ("fbad".equals(parse.getScheme()) && C1349b.m4702a(parse.getAuthority()) && this.f9982b.f13149d != null) {
                    this.f9982b.f13149d.onBannerAdClicked(this.f9982b);
                }
                C1348a a = C1349b.m4701a(this.f9982b.f13152g, this.f9982b.f13151f, a.mo1728D(), parse, map);
                if (a != null) {
                    try {
                        this.f9982b.f13154i = a.mo1717a();
                        this.f9982b.f13153h = System.currentTimeMillis();
                        a.mo1718b();
                    } catch (Throwable e) {
                        Log.e(C4142j.f13146a, "Error executing action", e);
                    }
                }
            }

            /* renamed from: b */
            public void mo1654b() {
                if (this.f9982b.f13148c != null) {
                    this.f9982b.f13148c.m4716a();
                }
            }
        }, c1410e.m4906f());
        this.f13147b.m12960a(c1410e.m4908h(), c1410e.m4909i());
        this.f13148c = new C3273r(this.f13152g, this.f13147b, this.f13147b.getViewabilityChecker(), new C32592(this));
        this.f13148c.m12583a(a);
        this.f13147b.loadDataWithBaseURL(C1491i.m5258a(), a.m12572a(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
        if (this.f13149d != null) {
            this.f13149d.onBannerAdLoaded(this, this.f13147b);
        }
    }

    public void loadBannerAd(Context context, C1425f c1425f, AdSize adSize, BannerAdapterListener bannerAdapterListener, Map<String, Object> map) {
        this.f13152g = context;
        this.f13151f = c1425f;
        this.f13149d = bannerAdapterListener;
        this.f13150e = map;
        m16305a((C1410e) map.get("definition"));
    }

    public void onDestroy() {
        if (this.f13147b != null) {
            C1491i.m5259a(this.f13147b);
            this.f13147b.destroy();
            this.f13147b = null;
        }
    }
}
