package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor;
import com.facebook.ads.internal.p041h.C3288g;
import com.facebook.ads.internal.p047k.C1491i;
import com.facebook.ads.internal.p047k.C1499m.C1498a;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C1604d.C1603a;
import com.facebook.ads.internal.view.p050a.C1538a;
import com.facebook.ads.internal.view.p050a.C1538a.C1537a;
import com.facebook.ads.internal.view.p050a.C1539b;
import com.facebook.ads.internal.view.p050a.C3325d;
import com.facebook.ads.internal.view.p050a.C3325d.C1543a;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.f */
public class C3371f implements C1604d {
    /* renamed from: a */
    private static final String f10239a = "f";
    /* renamed from: b */
    private final AudienceNetworkActivity f10240b;
    /* renamed from: c */
    private final C1538a f10241c;
    /* renamed from: d */
    private final C3325d f10242d;
    /* renamed from: e */
    private final C1539b f10243e;
    /* renamed from: f */
    private final BackButtonInterceptor f10244f = new C33681(this);
    /* renamed from: g */
    private String f10245g;
    /* renamed from: h */
    private String f10246h;
    /* renamed from: i */
    private long f10247i;
    /* renamed from: j */
    private boolean f10248j = true;
    /* renamed from: k */
    private long f10249k = -1;
    /* renamed from: l */
    private boolean f10250l = true;

    /* renamed from: com.facebook.ads.internal.view.f$1 */
    class C33681 implements BackButtonInterceptor {
        /* renamed from: a */
        final /* synthetic */ C3371f f10235a;

        C33681(C3371f c3371f) {
            this.f10235a = c3371f;
        }

        public boolean interceptBackButton() {
            if (!this.f10235a.f10242d.canGoBack()) {
                return false;
            }
            this.f10235a.f10242d.goBack();
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f$3 */
    class C33703 implements C1543a {
        /* renamed from: a */
        final /* synthetic */ C3371f f10238a;

        C33703(C3371f c3371f) {
            this.f10238a = c3371f;
        }

        /* renamed from: a */
        public void mo1819a(int i) {
            if (this.f10238a.f10248j) {
                this.f10238a.f10243e.setProgress(i);
            }
        }

        /* renamed from: a */
        public void mo1820a(String str) {
            this.f10238a.f10248j = true;
            this.f10238a.f10241c.setUrl(str);
        }

        /* renamed from: b */
        public void mo1821b(String str) {
            this.f10238a.f10241c.setTitle(str);
        }

        /* renamed from: c */
        public void mo1822c(String str) {
            this.f10238a.f10243e.setProgress(100);
            this.f10238a.f10248j = false;
        }
    }

    public C3371f(final AudienceNetworkActivity audienceNetworkActivity, C1603a c1603a) {
        this.f10240b = audienceNetworkActivity;
        int i = (int) (an.f4090b * 2.0f);
        this.f10241c = new C1538a(audienceNetworkActivity);
        this.f10241c.setId(View.generateViewId());
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.f10241c.setLayoutParams(layoutParams);
        this.f10241c.setListener(new C1537a(this) {
            /* renamed from: b */
            final /* synthetic */ C3371f f10237b;

            /* renamed from: a */
            public void mo1818a() {
                audienceNetworkActivity.finish();
            }
        });
        c1603a.mo1645a(this.f10241c);
        this.f10242d = new C3325d(audienceNetworkActivity);
        layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.f10241c.getId());
        layoutParams.addRule(12);
        this.f10242d.setLayoutParams(layoutParams);
        this.f10242d.setListener(new C33703(this));
        c1603a.mo1645a(this.f10242d);
        this.f10243e = new C1539b(audienceNetworkActivity, null, 16842872);
        layoutParams = new RelativeLayout.LayoutParams(-1, i);
        layoutParams.addRule(3, this.f10241c.getId());
        this.f10243e.setLayoutParams(layoutParams);
        this.f10243e.setProgress(0);
        c1603a.mo1645a(this.f10243e);
        audienceNetworkActivity.addBackButtonInterceptor(this.f10244f);
    }

    /* renamed from: a */
    public void mo1823a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        long longExtra;
        if (this.f10249k < 0) {
            this.f10249k = System.currentTimeMillis();
        }
        if (bundle == null) {
            this.f10245g = intent.getStringExtra(AudienceNetworkActivity.BROWSER_URL);
            this.f10246h = intent.getStringExtra(AudienceNetworkActivity.CLIENT_TOKEN);
            longExtra = intent.getLongExtra(AudienceNetworkActivity.HANDLER_TIME, -1);
        } else {
            this.f10245g = bundle.getString(AudienceNetworkActivity.BROWSER_URL);
            this.f10246h = bundle.getString(AudienceNetworkActivity.CLIENT_TOKEN);
            longExtra = bundle.getLong(AudienceNetworkActivity.HANDLER_TIME, -1);
        }
        this.f10247i = longExtra;
        String str = this.f10245g != null ? this.f10245g : "about:blank";
        this.f10241c.setUrl(str);
        this.f10242d.loadUrl(str);
    }

    /* renamed from: a */
    public void mo1824a(Bundle bundle) {
        bundle.putString(AudienceNetworkActivity.BROWSER_URL, this.f10245g);
    }

    /* renamed from: h */
    public void mo1825h() {
        this.f10242d.onPause();
        if (this.f10250l) {
            this.f10250l = false;
            C3288g.m12671a(this.f10240b).mo1742a(this.f10246h, new C1498a(this.f10242d.getFirstUrl()).m5271a(this.f10247i).m5273b(this.f10249k).m5274c(this.f10242d.getResponseEndMs()).m5275d(this.f10242d.getDomContentLoadedMs()).m5276e(this.f10242d.getScrollReadyMs()).m5277f(this.f10242d.getLoadFinishMs()).m5278g(System.currentTimeMillis()).m5272a());
        }
    }

    /* renamed from: i */
    public void mo1826i() {
        this.f10242d.onResume();
    }

    public void onDestroy() {
        this.f10240b.removeBackButtonInterceptor(this.f10244f);
        C1491i.m5259a(this.f10242d);
        this.f10242d.destroy();
    }

    public void setListener(C1603a c1603a) {
    }
}
