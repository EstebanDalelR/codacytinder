package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.C1359i;
import com.facebook.ads.internal.adapters.C1366u;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C1604d.C1603a;
import com.facebook.ads.internal.view.p051b.C3326b;
import com.facebook.ads.internal.view.p051b.C3326b.C1553a;

/* renamed from: com.facebook.ads.internal.view.o */
public abstract class C3387o extends RelativeLayout implements C1604d {
    /* renamed from: a */
    protected static final int f10296a = ((int) (an.f4090b * 56.0f));
    /* renamed from: b */
    protected final C1425f f10297b;
    /* renamed from: c */
    protected final C3326b f10298c = new C3326b(getContext());
    /* renamed from: d */
    protected C1359i f10299d;
    /* renamed from: e */
    protected C1359i f10300e;
    @Nullable
    /* renamed from: f */
    private C1603a f10301f;

    C3387o(Context context, C1425f c1425f) {
        super(context.getApplicationContext());
        this.f10297b = c1425f;
    }

    /* renamed from: a */
    private void mo3347a() {
        removeAllViews();
        an.m5206b(this);
    }

    /* renamed from: a */
    void m13014a(View view, boolean z, int i) {
        C3326b c3326b;
        C1359i c1359i;
        mo3347a();
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : f10296a, 0, 0);
        addView(view, layoutParams);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, f10296a);
        layoutParams2.addRule(10);
        if (i == 1) {
            i = this.f10299d.m4756d(z);
            c3326b = this.f10298c;
            c1359i = this.f10299d;
        } else {
            i = this.f10300e.m4756d(z);
            c3326b = this.f10298c;
            c1359i = this.f10300e;
        }
        c3326b.m12863a(c1359i, z);
        addView(this.f10298c, layoutParams2);
        an.m5204a((View) this, i);
        if (this.f10301f != null) {
            this.f10301f.mo1645a((View) this);
        }
    }

    /* renamed from: a */
    public void m13015a(final AudienceNetworkActivity audienceNetworkActivity, C1366u c1366u) {
        this.f10299d = c1366u.m4768g();
        this.f10300e = c1366u.m4769h();
        this.f10298c.setPageDetails(c1366u);
        this.f10298c.setInterstitialControlsListener(new C1553a(this) {
            /* renamed from: b */
            final /* synthetic */ C3387o f10295b;

            /* renamed from: a */
            public void mo1832a() {
                audienceNetworkActivity.finish();
            }
        });
    }

    C1603a getAudienceNetworkListener() {
        return this.f10301f;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        this.f10298c.m12866b();
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.f10298c.setInterstitialControlsListener(null);
        mo3347a();
    }

    public void setListener(C1603a c1603a) {
        this.f10301f = c1603a;
    }
}
