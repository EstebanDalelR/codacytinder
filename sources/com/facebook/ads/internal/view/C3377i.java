package com.facebook.ads.internal.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.C1352b;
import com.facebook.ads.internal.adapters.C3272q;
import com.facebook.ads.internal.adapters.C3273r;
import com.facebook.ads.internal.p034a.C1348a;
import com.facebook.ads.internal.p034a.C1349b;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p041h.C3288g;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1481b.C1479a;
import com.facebook.ads.internal.p047k.C1482c;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1491i;
import com.facebook.ads.internal.view.C1604d.C1603a;
import com.facebook.ads.internal.view.C3365c.C1560b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.i */
public class C3377i implements C1604d {
    /* renamed from: a */
    private static final String f10265a = "i";
    /* renamed from: b */
    private final C1603a f10266b;
    /* renamed from: c */
    private final C3365c f10267c;
    /* renamed from: d */
    private final C3273r f10268d;
    /* renamed from: e */
    private C3272q f10269e;
    /* renamed from: f */
    private long f10270f = System.currentTimeMillis();
    /* renamed from: g */
    private long f10271g;
    /* renamed from: h */
    private C1479a f10272h;

    /* renamed from: com.facebook.ads.internal.view.i$2 */
    class C33762 extends C1352b {
        /* renamed from: a */
        final /* synthetic */ C3377i f10264a;

        C33762(C3377i c3377i) {
            this.f10264a = c3377i;
        }

        /* renamed from: d */
        public void mo1683d() {
            this.f10264a.f10266b.mo1646a("com.facebook.ads.interstitial.impression.logged");
        }
    }

    public C3377i(final AudienceNetworkActivity audienceNetworkActivity, final C1425f c1425f, C1603a c1603a) {
        this.f10266b = c1603a;
        this.f10267c = new C3365c(audienceNetworkActivity, new C1560b(this) {
            /* renamed from: c */
            final /* synthetic */ C3377i f10262c;
            /* renamed from: d */
            private long f10263d = 0;

            /* renamed from: a */
            public void mo1651a() {
                this.f10262c.f10268d.m12585b();
            }

            /* renamed from: a */
            public void mo1652a(int i) {
            }

            /* renamed from: a */
            public void mo1653a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if ("fbad".equals(parse.getScheme()) && "close".equals(parse.getAuthority())) {
                    audienceNetworkActivity.finish();
                    return;
                }
                long j = this.f10263d;
                this.f10263d = System.currentTimeMillis();
                if (this.f10263d - j >= 1000) {
                    if ("fbad".equals(parse.getScheme()) && C1349b.m4702a(parse.getAuthority())) {
                        this.f10262c.f10266b.mo1646a("com.facebook.ads.interstitial.clicked");
                    }
                    C1348a a = C1349b.m4701a(audienceNetworkActivity, c1425f, this.f10262c.f10269e.mo1728D(), parse, map);
                    if (a != null) {
                        try {
                            this.f10262c.f10272h = a.mo1717a();
                            this.f10262c.f10271g = System.currentTimeMillis();
                            a.mo1718b();
                        } catch (Throwable e) {
                            Log.e(C3377i.f10265a, "Error executing action", e);
                        }
                    }
                }
            }

            /* renamed from: b */
            public void mo1654b() {
                this.f10262c.f10268d.m4716a();
            }
        }, 1);
        this.f10267c.setLayoutParams(new LayoutParams(-1, -1));
        this.f10268d = new C3273r(audienceNetworkActivity, this.f10267c, this.f10267c.getViewabilityChecker(), new C33762(this));
        c1603a.mo1645a(this.f10267c);
    }

    /* renamed from: a */
    public void mo1823a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (bundle == null || !bundle.containsKey("dataModel")) {
            this.f10269e = C3272q.m12568b(intent);
            if (this.f10269e != null) {
                this.f10268d.m12583a(this.f10269e);
                this.f10267c.loadDataWithBaseURL(C1491i.m5258a(), this.f10269e.m12572a(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
                this.f10267c.m12960a(this.f10269e.m12577e(), this.f10269e.m12578f());
            }
            return;
        }
        this.f10269e = C3272q.m12566a(bundle.getBundle("dataModel"));
        if (this.f10269e != null) {
            this.f10267c.loadDataWithBaseURL(C1491i.m5258a(), this.f10269e.m12572a(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
            this.f10267c.m12960a(this.f10269e.m12577e(), this.f10269e.m12578f());
        }
    }

    /* renamed from: a */
    public void mo1824a(Bundle bundle) {
        if (this.f10269e != null) {
            bundle.putBundle("dataModel", this.f10269e.m12579g());
        }
    }

    /* renamed from: h */
    public void mo1825h() {
        this.f10267c.onPause();
    }

    /* renamed from: i */
    public void mo1826i() {
        if (!(this.f10271g <= 0 || this.f10272h == null || this.f10269e == null)) {
            C1482c.m5218a(C1481b.m5213a(this.f10271g, this.f10272h, this.f10269e.m12576d()));
        }
        this.f10267c.onResume();
    }

    public void onDestroy() {
        if (this.f10269e != null) {
            C1482c.m5218a(C1481b.m5213a(this.f10270f, C1479a.XOUT, this.f10269e.m12576d()));
            if (!TextUtils.isEmpty(this.f10269e.mo1728D())) {
                Map hashMap = new HashMap();
                this.f10267c.getViewabilityChecker().m5350a(hashMap);
                hashMap.put("touch", C1490h.m5244a(this.f10267c.getTouchData()));
                C3288g.m12671a(this.f10267c.getContext()).mo1753g(this.f10269e.mo1728D(), hashMap);
            }
        }
        C1491i.m5259a(this.f10267c);
        this.f10267c.destroy();
    }

    public void setListener(C1603a c1603a) {
    }
}
