package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.adapters.C1353c;
import com.facebook.ads.internal.adapters.C1366u;
import com.facebook.ads.internal.p036c.C1380b;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1481b.C1479a;
import com.facebook.ads.internal.p047k.C1482c;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.ad;
import com.facebook.ads.internal.p047k.ai;
import com.facebook.ads.internal.p047k.al;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.p049l.C1517a;
import com.facebook.ads.internal.p049l.C1517a.C1516a;
import com.facebook.ads.internal.view.component.p055a.C1594c;
import com.facebook.ads.internal.view.p052c.p053b.C1582n;
import com.facebook.ads.internal.view.p052c.p053b.C3354d;
import com.facebook.ads.internal.view.p052c.p053b.C3354d.C1572a;
import com.facebook.ads.internal.view.p052c.p053b.C3355f;
import com.facebook.ads.internal.view.p052c.p053b.C3363q;
import com.facebook.ads.internal.view.p052c.p053b.C4167g;
import com.facebook.ads.internal.view.p052c.p053b.C4177k;
import com.facebook.ads.internal.view.p052c.p053b.C4181l;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3331d;
import com.facebook.ads.internal.view.p052c.p080a.C3332e;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3336i;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3338k;
import com.facebook.ads.internal.view.p052c.p080a.C3339l;
import com.facebook.ads.internal.view.p052c.p080a.C3340m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.n */
public class C4198n extends C3387o {
    /* renamed from: l */
    private static final int f13407l = ((int) (an.f4090b * 6.0f));
    /* renamed from: f */
    private final BackButtonInterceptor f13408f = new C33841(this);
    /* renamed from: g */
    private final C3332e f13409g = new C41932(this);
    /* renamed from: h */
    private final C3338k f13410h = new C41943(this);
    /* renamed from: i */
    private final C3336i f13411i = new C41954(this);
    /* renamed from: j */
    private final C3330c f13412j = new C41965(this);
    /* renamed from: k */
    private final C3340m f13413k = new C41976(this);
    /* renamed from: m */
    private final C3363q f13414m;
    /* renamed from: n */
    private final C3355f f13415n;
    /* renamed from: o */
    private final C1366u f13416o;
    /* renamed from: p */
    private final C1353c f13417p;
    /* renamed from: q */
    private final C1517a f13418q;
    /* renamed from: r */
    private final ai f13419r;
    @Nullable
    /* renamed from: s */
    private final C1380b f13420s;
    /* renamed from: t */
    private final AtomicBoolean f13421t = new AtomicBoolean(false);
    /* renamed from: u */
    private final al f13422u;
    /* renamed from: v */
    private C3394u f13423v = new C3394u(getContext());
    /* renamed from: w */
    private AudienceNetworkActivity f13424w;
    /* renamed from: x */
    private long f13425x;

    /* renamed from: com.facebook.ads.internal.view.n$1 */
    class C33841 implements BackButtonInterceptor {
        /* renamed from: a */
        final /* synthetic */ C4198n f10292a;

        C33841(C4198n c4198n) {
            this.f10292a = c4198n;
        }

        public boolean interceptBackButton() {
            return this.f10292a.c.m12865a();
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$7 */
    class C33857 extends C1516a {
        /* renamed from: a */
        final /* synthetic */ C4198n f10293a;

        C33857(C4198n c4198n) {
            this.f10293a = c4198n;
        }

        /* renamed from: a */
        public void mo1681a() {
            if (!this.f10293a.f13419r.m5185b()) {
                this.f10293a.f13419r.m5183a();
                Map hashMap = new HashMap();
                if (!TextUtils.isEmpty(this.f10293a.f13416o.m4762a())) {
                    this.f10293a.f13418q.m5350a(hashMap);
                    hashMap.put("touch", C1490h.m5244a(this.f10293a.f13419r.m5188e()));
                    this.f10293a.b.mo1743a(this.f10293a.f13416o.m4762a(), hashMap);
                    if (this.f10293a.getAudienceNetworkListener() != null) {
                        this.f10293a.getAudienceNetworkListener().mo1646a("com.facebook.ads.interstitial.impression.logged");
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$2 */
    class C41932 extends C3332e {
        /* renamed from: a */
        final /* synthetic */ C4198n f13402a;

        C41932(C4198n c4198n) {
            this.f13402a = c4198n;
        }

        /* renamed from: a */
        public void m16617a(C3331d c3331d) {
            if (this.f13402a.getAudienceNetworkListener() != null) {
                this.f13402a.getAudienceNetworkListener().mo1647a("videoInterstitalEvent", c3331d);
            }
            if (this.f13402a.f13423v != null) {
                this.f13402a.f13423v.m13064h();
                this.f13402a.f13423v.m13067k();
                this.f13402a.f13423v = null;
            }
            if (this.f13402a.f13424w != null) {
                this.f13402a.f13424w.finish();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$3 */
    class C41943 extends C3338k {
        /* renamed from: a */
        final /* synthetic */ C4198n f13403a;

        C41943(C4198n c4198n) {
            this.f13403a = c4198n;
        }

        /* renamed from: a */
        public void m16619a(C3337j c3337j) {
            if (this.f13403a.getAudienceNetworkListener() != null) {
                this.f13403a.getAudienceNetworkListener().mo1647a("videoInterstitalEvent", c3337j);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$4 */
    class C41954 extends C3336i {
        /* renamed from: a */
        final /* synthetic */ C4198n f13404a;

        C41954(C4198n c4198n) {
            this.f13404a = c4198n;
        }

        /* renamed from: a */
        public void m16621a(C3335h c3335h) {
            if (this.f13404a.getAudienceNetworkListener() != null) {
                this.f13404a.getAudienceNetworkListener().mo1647a("videoInterstitalEvent", c3335h);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$5 */
    class C41965 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ C4198n f13405a;

        C41965(C4198n c4198n) {
            this.f13405a = c4198n;
        }

        /* renamed from: a */
        public void m16623a(C3329b c3329b) {
            this.f13405a.f13421t.set(true);
            if (this.f13405a.getAudienceNetworkListener() != null) {
                this.f13405a.getAudienceNetworkListener().mo1647a("videoInterstitalEvent", c3329b);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.n$6 */
    class C41976 extends C3340m {
        /* renamed from: a */
        final /* synthetic */ C4198n f13406a;

        C41976(C4198n c4198n) {
            this.f13406a = c4198n;
        }

        /* renamed from: a */
        public void m16625a(C3339l c3339l) {
            if (this.f13406a.getAudienceNetworkListener() != null) {
                this.f13406a.getAudienceNetworkListener().mo1647a("videoInterstitalEvent", c3339l);
            }
        }
    }

    public C4198n(Context context, C1425f c1425f, C1366u c1366u, @Nullable C1380b c1380b) {
        super(context, c1425f);
        an.m5203a(this.f13423v);
        an.m5204a(this.f13423v, 0);
        this.f13416o = c1366u;
        this.f13417p = (C1353c) this.f13416o.m4765d().get(0);
        this.f13420s = c1380b;
        this.f13414m = new C3363q(getContext(), f13407l, -2130706433);
        this.f13415n = new C3355f(context);
        this.f13423v.getEventBus().m4995a(this.f13410h, this.f13411i, this.f13412j, this.f13409g, this.f13413k);
        setupPlugins(this.f13417p);
        this.f13419r = new ai();
        this.f13418q = new C1517a(this.f13423v, 1, new C33857(this));
        this.f13418q.m5349a(c1366u.m4770i());
        this.f13418q.m5352b(c1366u.m4771j());
        this.f13422u = new ad(getContext(), this.b, this.f13423v, this.f13416o.m4762a());
        this.f13423v.setVideoURI(m16628a(this.f13417p.m4743i()));
    }

    /* renamed from: a */
    private String m16628a(String str) {
        CharSequence charSequence = "";
        if (!(this.f13420s == null || str == null)) {
            charSequence = this.f13420s.m4809c(str);
        }
        return TextUtils.isEmpty(charSequence) ? str : charSequence;
    }

    private void setUpContent(int i) {
        View a = C1594c.m5457a(getContext(), this.b, getAudienceNetworkListener(), this.f13423v, this.d, this.e, a, i, this.f13417p.m4741g(), this.f13417p.m4742h(), this.f13414m, this.f13423v.m13066j() ? r0.f13415n : null);
        a.mo1815a(r0.f13417p.m4736b(), r0.f13417p.m4737c(), r0.f13417p.m4738d(), r0.f13417p.m4739e(), r0.f13416o.m4762a(), ((double) r0.f13417p.m4742h()) / ((double) r0.f13417p.m4741g()));
        m13014a(a, a.mo1814a(), i);
    }

    private void setupPlugins(C1353c c1353c) {
        C1582n c4167g;
        this.f13423v.m13062f();
        this.f13423v.m13056a(this.f13414m);
        this.f13423v.m13056a(this.f13415n);
        if (!TextUtils.isEmpty(c1353c.m4740f())) {
            c4167g = new C4167g(getContext());
            this.f13423v.m13056a(c4167g);
            c4167g.setImage(c1353c.m4740f());
        }
        c4167g = new C4181l(getContext(), true);
        this.f13423v.m13056a(c4167g);
        this.f13423v.m13056a(new C3354d(c4167g, c1353c.m4744j() ? C1572a.FADE_OUT_ON_PLAY : C1572a.VISIBLE, true));
        this.f13423v.m13056a(new C4177k(getContext()));
        this.f13423v.m13056a(this.c);
    }

    /* renamed from: a */
    public void mo1823a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        super.m13015a(audienceNetworkActivity, this.f13416o);
        this.f13424w = audienceNetworkActivity;
        setUpContent(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.f13424w.addBackButtonInterceptor(this.f13408f);
        if (((C1353c) this.f13416o.m4765d().get(0)).m4744j()) {
            this.f13423v.m13055a(VideoStartReason.AUTO_STARTED);
        }
        this.f13425x = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo1824a(Bundle bundle) {
    }

    /* renamed from: h */
    public void mo1825h() {
    }

    /* renamed from: i */
    public void mo1826i() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        removeAllViews();
        an.m5206b(this.f13423v);
        an.m5206b(this.f13414m);
        an.m5206b(this.f13415n);
        setUpContent(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        if (this.f13423v != null) {
            if (!this.f13421t.get()) {
                this.f13423v.m13063g();
            }
            if (this.f13416o != null) {
                C1482c.m5218a(C1481b.m5213a(this.f13425x, C1479a.XOUT, this.f13416o.m4767f()));
                if (!TextUtils.isEmpty(this.f13416o.m4762a())) {
                    Map hashMap = new HashMap();
                    this.f13418q.m5350a(hashMap);
                    hashMap.put("touch", C1490h.m5244a(this.f13419r.m5188e()));
                    this.b.mo1753g(this.f13416o.m4762a(), hashMap);
                }
            }
            this.f13423v.m13064h();
            this.f13423v.m13067k();
        }
        this.f13424w = null;
        super.onDestroy();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f13419r.m5184a(motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f13418q != null) {
            if (i == 0) {
                this.f13418q.m5348a();
            } else if (i == 8) {
                this.f13418q.m5351b();
            }
        }
    }
}
