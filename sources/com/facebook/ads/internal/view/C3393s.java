package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.C1432i;
import com.facebook.ads.internal.p041h.C1429s;
import com.facebook.ads.internal.p041h.C3288g;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1505r;
import com.facebook.ads.internal.p047k.ad;
import com.facebook.ads.internal.p047k.ai;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.p049l.C1517a;
import com.facebook.ads.internal.p049l.C1517a.C1516a;
import com.facebook.ads.internal.view.C1604d.C1603a;
import com.facebook.ads.internal.view.p052c.p053b.C1582n;
import com.facebook.ads.internal.view.p052c.p053b.C3354d;
import com.facebook.ads.internal.view.p052c.p053b.C3354d.C1572a;
import com.facebook.ads.internal.view.p052c.p053b.C3359j;
import com.facebook.ads.internal.view.p052c.p053b.C3359j.C1577a;
import com.facebook.ads.internal.view.p052c.p053b.C3363q;
import com.facebook.ads.internal.view.p052c.p053b.C4177k;
import com.facebook.ads.internal.view.p052c.p053b.C4181l;
import com.facebook.ads.internal.view.p052c.p054c.C1590d;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3331d;
import com.facebook.ads.internal.view.p052c.p080a.C3339l;
import com.facebook.ads.internal.view.p052c.p080a.C3347t;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.s */
public class C3393s implements C1604d {
    /* renamed from: a */
    private C1517a f10307a;
    /* renamed from: b */
    private C3394u f10308b;
    /* renamed from: c */
    private ad f10309c;
    /* renamed from: d */
    private ai f10310d;
    /* renamed from: e */
    private C1603a f10311e;
    /* renamed from: f */
    private C1429s<C3329b> f10312f;
    /* renamed from: g */
    private C1429s<C3331d> f10313g;
    /* renamed from: h */
    private C1429s<C3339l> f10314h;
    /* renamed from: i */
    private C1429s<C3347t> f10315i;
    /* renamed from: j */
    private String f10316j;
    /* renamed from: k */
    private Context f10317k;
    /* renamed from: l */
    private String f10318l;
    /* renamed from: m */
    private RelativeLayout f10319m;
    /* renamed from: n */
    private TextView f10320n;
    /* renamed from: o */
    private TextView f10321o;
    /* renamed from: p */
    private ImageView f10322p;
    /* renamed from: q */
    private C3363q f10323q;
    /* renamed from: r */
    private C3359j f10324r;

    /* renamed from: com.facebook.ads.internal.view.s$6 */
    class C16156 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C3393s f4476a;

        C16156(C3393s c3393s) {
            this.f4476a = c3393s;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1 && this.f4476a.f10324r.m12918a() && this.f4476a.f10324r.getSkipSeconds() != 0 && this.f4476a.f10308b != null) {
                this.f4476a.f10308b.m13063g();
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.s$1 */
    class C33881 extends C1429s<C3347t> {
        /* renamed from: a */
        final /* synthetic */ C3393s f10302a;

        C33881(C3393s c3393s) {
            this.f10302a = c3393s;
        }

        /* renamed from: a */
        public Class<C3347t> mo1725a() {
            return C3347t.class;
        }

        /* renamed from: a */
        public void m13018a(C3347t c3347t) {
            this.f10302a.f10310d.m5184a(c3347t.m12879b(), this.f10302a.f10308b, c3347t.m12878a());
        }
    }

    /* renamed from: com.facebook.ads.internal.view.s$2 */
    class C33892 extends C1429s<C3329b> {
        /* renamed from: a */
        final /* synthetic */ C3393s f10303a;

        C33892(C3393s c3393s) {
            this.f10303a = c3393s;
        }

        /* renamed from: a */
        public Class<C3329b> mo1725a() {
            return C3329b.class;
        }

        /* renamed from: a */
        public void m13021a(C3329b c3329b) {
            if (this.f10303a.f10311e != null) {
                this.f10303a.f10311e.mo1647a(C1432i.REWARDED_VIDEO_COMPLETE.m5005a(), c3329b);
            }
            this.f10303a.m13044e();
        }
    }

    /* renamed from: com.facebook.ads.internal.view.s$3 */
    class C33903 extends C1429s<C3331d> {
        /* renamed from: a */
        final /* synthetic */ C3393s f10304a;

        C33903(C3393s c3393s) {
            this.f10304a = c3393s;
        }

        /* renamed from: a */
        public Class<C3331d> mo1725a() {
            return C3331d.class;
        }

        /* renamed from: a */
        public void m13024a(C3331d c3331d) {
            if (this.f10304a.f10311e != null) {
                this.f10304a.f10311e.mo1646a(C1432i.REWARDED_VIDEO_ERROR.m5005a());
            }
            this.f10304a.m13044e();
        }
    }

    /* renamed from: com.facebook.ads.internal.view.s$4 */
    class C33914 extends C1429s<C3339l> {
        /* renamed from: a */
        final /* synthetic */ C3393s f10305a;

        C33914(C3393s c3393s) {
            this.f10305a = c3393s;
        }

        /* renamed from: a */
        public Class<C3339l> mo1725a() {
            return C3339l.class;
        }

        /* renamed from: a */
        public void m13027a(C3339l c3339l) {
            this.f10305a.f10308b.m13055a(VideoStartReason.USER_STARTED);
            if (this.f10305a.f10307a != null) {
                this.f10305a.f10307a.m5348a();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.s$5 */
    class C33925 extends C1516a {
        /* renamed from: a */
        final /* synthetic */ C3393s f10306a;

        C33925(C3393s c3393s) {
            this.f10306a = c3393s;
        }

        /* renamed from: a */
        public void mo1681a() {
            if (!this.f10306a.f10310d.m5185b()) {
                this.f10306a.f10310d.m5183a();
                Map hashMap = new HashMap();
                if (!TextUtils.isEmpty(this.f10306a.f10316j)) {
                    this.f10306a.f10307a.m5350a(hashMap);
                    hashMap.put("touch", C1490h.m5244a(this.f10306a.m13038a()));
                    C3288g.m12671a(this.f10306a.f10317k).mo1743a(this.f10306a.f10316j, hashMap);
                }
                if (this.f10306a.f10311e != null) {
                    this.f10306a.f10311e.mo1646a(C1432i.REWARDED_VIDEO_IMPRESSION.m5005a());
                }
            }
        }
    }

    public C3393s(Context context, C3394u c3394u, C1603a c1603a) {
        this.f10317k = context;
        this.f10311e = c1603a;
        this.f10308b = c3394u;
        m13037g();
    }

    /* renamed from: a */
    private void m13030a(int i, boolean z) {
        if (i > 0) {
            float f = this.f10317k.getResources().getDisplayMetrics().density;
            this.f10324r = new C3359j(this.f10317k, i, -12286980);
            int i2 = (int) (56.0f * f);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            int i3 = (int) (f * 16.0f);
            this.f10324r.setLayoutParams(layoutParams);
            this.f10324r.setPadding(i3, i3, i3, i3);
            if (z) {
                this.f10324r.setButtonMode(C1577a.SKIP_BUTTON_MODE);
            }
            this.f10324r.setOnTouchListener(new C16156(this));
            this.f10308b.m13056a(this.f10324r);
            this.f10311e.mo1645a(this.f10324r);
        }
    }

    /* renamed from: g */
    private void m13037g() {
        float f = an.f4090b;
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f10308b.m13065i();
        this.f10308b.setIsFullScreen(true);
        this.f10308b.setLayoutParams(layoutParams);
        this.f10308b.setBackgroundColor(-16777216);
        this.f10315i = new C33881(this);
        this.f10312f = new C33892(this);
        this.f10313g = new C33903(this);
        this.f10314h = new C33914(this);
        this.f10308b.getEventBus().m4995a(this.f10312f, this.f10313g, this.f10314h, this.f10315i);
        this.f10308b.m13056a(new C4177k(this.f10317k));
        int i = (int) (6.0f * f);
        this.f10323q = new C3363q(this.f10317k, i);
        layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.f10323q.setLayoutParams(layoutParams);
        this.f10308b.m13056a(this.f10323q);
        if (C1418g.m4940k(this.f10317k)) {
            C1582n c4181l = new C4181l(this.f10317k);
            this.f10308b.m13056a(c4181l);
            this.f10308b.m13056a(new C3354d(c4181l, C1572a.INVSIBLE));
        }
        if (C1418g.m4933d(this.f10317k)) {
            int a;
            Drawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
            gradientDrawable.setCornerRadius(0.0f);
            LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (96.0f * f));
            layoutParams2.addRule(12);
            this.f10319m = new RelativeLayout(this.f10317k);
            if (VERSION.SDK_INT >= 16) {
                this.f10319m.setBackground(gradientDrawable);
            } else {
                this.f10319m.setBackgroundDrawable(gradientDrawable);
            }
            this.f10319m.setLayoutParams(layoutParams2);
            int i2 = (int) (12.0f * f);
            this.f10319m.setPadding(i2, 0, i2, i);
            if (VERSION.SDK_INT < 17) {
                a = an.m5201a();
                i = an.m5201a();
            } else {
                a = View.generateViewId();
                i = View.generateViewId();
            }
            this.f10322p = new ImageView(this.f10317k);
            int i3 = (int) (f * 60.0f);
            layoutParams2 = new RelativeLayout.LayoutParams(i3, i3);
            layoutParams2.addRule(15);
            layoutParams2.addRule(9);
            layoutParams2.setMargins(0, 0, i2, 0);
            this.f10322p.setLayoutParams(layoutParams2);
            this.f10322p.setId(a);
            this.f10319m.addView(this.f10322p);
            View relativeLayout = new RelativeLayout(this.f10317k);
            LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(15);
            layoutParams3.addRule(1, a);
            relativeLayout.setLayoutParams(layoutParams3);
            relativeLayout.setGravity(16);
            this.f10320n = new TextView(this.f10317k);
            LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
            this.f10320n.setEllipsize(TruncateAt.END);
            this.f10320n.setGravity(8388611);
            this.f10320n.setLayoutParams(layoutParams4);
            this.f10320n.setMaxLines(1);
            this.f10320n.setId(i);
            this.f10320n.setTextColor(-1);
            this.f10320n.setTextSize(20.0f);
            this.f10320n.setTypeface(Typeface.defaultFromStyle(1));
            relativeLayout.addView(this.f10320n);
            this.f10321o = new TextView(this.f10317k);
            layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams4.addRule(3, i);
            this.f10321o.setEllipsize(TruncateAt.END);
            this.f10321o.setGravity(8388611);
            this.f10321o.setLayoutParams(layoutParams4);
            this.f10321o.setMaxLines(2);
            this.f10321o.setTextSize(14.0f);
            this.f10321o.setTextColor(-1);
            relativeLayout.addView(this.f10321o);
            this.f10319m.addView(relativeLayout);
            C1582n c3354d = new C3354d(new RelativeLayout(this.f10317k), C1572a.INVSIBLE);
            c3354d.m12893a(this.f10319m, C1572a.INVSIBLE);
            this.f10308b.m13056a(c3354d);
        }
        this.f10307a = new C1517a(this.f10308b, 1, new C33925(this));
        this.f10307a.m5349a((int) Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.f10310d = new ai();
        this.f10311e.mo1645a(this.f10308b);
        if (this.f10319m != null) {
            this.f10311e.mo1645a(this.f10319m);
        }
        this.f10311e.mo1645a(this.f10323q);
    }

    /* renamed from: a */
    public Map<String, String> m13038a() {
        return this.f10310d.m5188e();
    }

    /* renamed from: a */
    public void mo1823a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        String stringExtra = intent.getStringExtra(AudienceNetworkActivity.VIDEO_URL);
        this.f10316j = intent.getStringExtra(AudienceNetworkActivity.CLIENT_TOKEN);
        this.f10318l = intent.getStringExtra(AudienceNetworkActivity.CONTEXT_SWITCH_BEHAVIOR);
        m13030a(intent.getIntExtra(AudienceNetworkActivity.SKIP_DELAY_SECONDS_KEY, -1), TextUtils.isEmpty(C1490h.m5247a(intent.getByteArrayExtra(AudienceNetworkActivity.END_CARD_MARKUP))) ^ true);
        if (this.f10320n != null) {
            this.f10320n.setText(intent.getStringExtra(AudienceNetworkActivity.AD_TITLE));
        }
        if (this.f10321o != null) {
            this.f10321o.setText(intent.getStringExtra(AudienceNetworkActivity.AD_SUBTITLE));
        }
        if (this.f10322p != null) {
            if (!TextUtils.isEmpty(intent.getStringExtra(AudienceNetworkActivity.AD_ICON_URL))) {
                new C1505r(this.f10322p).m5301a(r4);
            }
        }
        this.f10309c = new ad(this.f10317k, C3288g.m12671a(this.f10317k), this.f10308b, this.f10316j);
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f10308b.setVideoURI(stringExtra);
        }
        this.f10308b.m13055a(VideoStartReason.USER_STARTED);
    }

    /* renamed from: a */
    public void mo1824a(Bundle bundle) {
    }

    /* renamed from: b */
    public void m13041b() {
        this.f10308b.m13053a(1);
        this.f10308b.m13055a(VideoStartReason.USER_STARTED);
    }

    /* renamed from: c */
    public void m13042c() {
        this.f10308b.m13058a(true);
    }

    /* renamed from: d */
    public boolean m13043d() {
        return this.f10308b.getState() == C1590d.PAUSED;
    }

    /* renamed from: e */
    public void m13044e() {
        if (this.f10308b != null) {
            this.f10308b.m13064h();
            this.f10308b.m13067k();
        }
        if (this.f10307a != null) {
            this.f10307a.m5351b();
        }
    }

    /* renamed from: f */
    public void m13045f() {
        this.f10308b.m13053a(this.f10308b.getCurrentPosition());
        this.f10308b.m13055a(VideoStartReason.USER_STARTED);
    }

    /* renamed from: h */
    public void mo1825h() {
        m13042c();
    }

    /* renamed from: i */
    public void mo1826i() {
        if (m13043d()) {
            if (this.f10318l.equals("restart")) {
                m13041b();
            } else if (this.f10318l.equals("resume")) {
                m13045f();
            } else {
                if (this.f10318l.equals("skip")) {
                    this.f10311e.mo1647a(C1432i.REWARDED_VIDEO_COMPLETE_WITHOUT_REWARD.m5005a(), new C3329b());
                } else if (this.f10318l.equals("endvideo")) {
                    this.f10311e.mo1646a(C1432i.REWARDED_VIDEO_END_ACTIVITY.m5005a());
                    Map hashMap = new HashMap();
                    if (!TextUtils.isEmpty(this.f10316j)) {
                        this.f10307a.m5350a(hashMap);
                        hashMap.put("touch", C1490h.m5244a(m13038a()));
                        C3288g.m12671a(this.f10317k).mo1753g(this.f10316j, hashMap);
                    }
                }
                m13044e();
            }
        }
    }

    public void onDestroy() {
        m13044e();
        this.f10320n = null;
        this.f10321o = null;
        this.f10322p = null;
        this.f10319m = null;
        this.f10324r = null;
        this.f10318l = null;
        if (this.f10308b != null) {
            this.f10308b.getEventBus().m4998b(this.f10312f);
            this.f10308b.getEventBus().m4998b(this.f10313g);
            this.f10308b.getEventBus().m4998b(this.f10314h);
            this.f10308b.getEventBus().m4998b(this.f10315i);
        }
        this.f10312f = null;
        this.f10313g = null;
        this.f10314h = null;
        this.f10315i = null;
        this.f10307a = null;
        this.f10310d = null;
        this.f10309c = null;
        this.f10308b = null;
        this.f10311e = null;
        this.f10316j = null;
        this.f10317k = null;
        this.f10323q.m12938a();
        this.f10323q = null;
    }

    public void setListener(C1603a c1603a) {
    }
}
