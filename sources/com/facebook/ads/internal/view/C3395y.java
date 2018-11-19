package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.C1401e;
import com.facebook.ads.internal.p041h.C3288g;
import com.facebook.ads.internal.p047k.ad;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C1604d.C1603a;
import com.facebook.ads.internal.view.p051b.C1554c;
import com.facebook.ads.internal.view.p052c.p053b.C4161b;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3331d;
import com.facebook.ads.internal.view.p052c.p080a.C3332e;
import com.facebook.ads.internal.view.p052c.p080a.C3333f;
import com.facebook.ads.internal.view.p052c.p080a.C3334g;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3336i;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3338k;
import com.facebook.ads.internal.view.p052c.p080a.C3343p;

/* renamed from: com.facebook.ads.internal.view.y */
public class C3395y implements C1604d {
    /* renamed from: a */
    private final C3338k f10343a = new C42031(this);
    /* renamed from: b */
    private final C3336i f10344b = new C42042(this);
    /* renamed from: c */
    private final C3330c f10345c = new C42053(this);
    /* renamed from: d */
    private final C3332e f10346d = new C42064(this);
    /* renamed from: e */
    private final AudienceNetworkActivity f10347e;
    /* renamed from: f */
    private final C3394u f10348f;
    /* renamed from: g */
    private final C1603a f10349g;
    /* renamed from: h */
    private ad f10350h;
    /* renamed from: i */
    private int f10351i;

    /* renamed from: com.facebook.ads.internal.view.y$6 */
    class C16236 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3395y f4488a;

        C16236(C3395y c3395y) {
            this.f4488a = c3395y;
        }

        public void onClick(View view) {
            this.f4488a.f10349g.mo1646a("performCtaClick");
        }
    }

    /* renamed from: com.facebook.ads.internal.view.y$1 */
    class C42031 extends C3338k {
        /* renamed from: a */
        final /* synthetic */ C3395y f13443a;

        C42031(C3395y c3395y) {
            this.f13443a = c3395y;
        }

        /* renamed from: a */
        public void m16651a(C3337j c3337j) {
            this.f13443a.f10349g.mo1647a("videoInterstitalEvent", c3337j);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.y$2 */
    class C42042 extends C3336i {
        /* renamed from: a */
        final /* synthetic */ C3395y f13444a;

        C42042(C3395y c3395y) {
            this.f13444a = c3395y;
        }

        /* renamed from: a */
        public void m16653a(C3335h c3335h) {
            this.f13444a.f10349g.mo1647a("videoInterstitalEvent", c3335h);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.y$3 */
    class C42053 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ C3395y f13445a;

        C42053(C3395y c3395y) {
            this.f13445a = c3395y;
        }

        /* renamed from: a */
        public void m16655a(C3329b c3329b) {
            this.f13445a.f10349g.mo1647a("videoInterstitalEvent", c3329b);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.y$4 */
    class C42064 extends C3332e {
        /* renamed from: a */
        final /* synthetic */ C3395y f13446a;

        C42064(C3395y c3395y) {
            this.f13446a = c3395y;
        }

        /* renamed from: a */
        public void m16657a(C3331d c3331d) {
            this.f13446a.f10347e.finish();
        }
    }

    public C3395y(final AudienceNetworkActivity audienceNetworkActivity, C1603a c1603a) {
        this.f10347e = audienceNetworkActivity;
        this.f10348f = new C3394u(audienceNetworkActivity);
        this.f10348f.m13056a(new C4161b(audienceNetworkActivity));
        this.f10348f.getEventBus().m4995a(this.f10343a, this.f10344b, this.f10345c, this.f10346d);
        this.f10349g = c1603a;
        this.f10348f.setIsFullScreen(true);
        this.f10348f.setVolume(1.0f);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        this.f10348f.setLayoutParams(layoutParams);
        c1603a.mo1645a(this.f10348f);
        View c1401e = new C1401e(audienceNetworkActivity);
        c1401e.setOnClickListener(new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ C3395y f4487b;

            public void onClick(View view) {
                audienceNetworkActivity.finish();
            }
        });
        c1603a.mo1645a(c1401e);
    }

    /* renamed from: a */
    public void mo1823a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        String stringExtra = intent.getStringExtra("useNativeCtaButton");
        if (!(stringExtra == null || stringExtra.isEmpty())) {
            View c1554c = new C1554c(audienceNetworkActivity, stringExtra);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (an.f4090b * 16.0f);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c1554c.setLayoutParams(layoutParams);
            c1554c.setOnClickListener(new C16236(this));
            this.f10349g.mo1645a(c1554c);
        }
        this.f10351i = intent.getIntExtra(AudienceNetworkActivity.VIDEO_SEEK_TIME, 0);
        this.f10350h = new ad((Context) audienceNetworkActivity, C3288g.m12671a(audienceNetworkActivity.getApplicationContext()), this.f10348f, intent.getStringExtra(AudienceNetworkActivity.CLIENT_TOKEN), intent.getBundleExtra(AudienceNetworkActivity.VIDEO_LOGGER));
        this.f10348f.setVideoMPD(intent.getStringExtra(AudienceNetworkActivity.VIDEO_MPD));
        this.f10348f.setVideoURI(intent.getStringExtra(AudienceNetworkActivity.VIDEO_URL));
        if (this.f10351i > 0) {
            this.f10348f.m13053a(this.f10351i);
        }
        if (intent.getBooleanExtra(AudienceNetworkActivity.AUTOPLAY, false)) {
            this.f10348f.m13055a(VideoStartReason.USER_STARTED);
        }
    }

    /* renamed from: a */
    public void mo1824a(Bundle bundle) {
    }

    /* renamed from: a */
    public void m13072a(View view) {
        this.f10348f.setControlsAnchorView(view);
    }

    /* renamed from: h */
    public void mo1825h() {
        this.f10349g.mo1647a("videoInterstitalEvent", new C3333f());
        this.f10348f.m13058a(false);
    }

    /* renamed from: i */
    public void mo1826i() {
        this.f10349g.mo1647a("videoInterstitalEvent", new C3334g());
        this.f10348f.m13055a(VideoStartReason.USER_STARTED);
    }

    public void onDestroy() {
        this.f10349g.mo1647a("videoInterstitalEvent", new C3343p(this.f10351i, this.f10348f.getCurrentPosition()));
        this.f10350h.m12815b(this.f10348f.getCurrentPosition());
        this.f10348f.m13064h();
        this.f10348f.m13067k();
    }

    public void setListener(C1603a c1603a) {
    }
}
