package com.facebook.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.C0436c;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.C1404f;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.C1432i;
import com.facebook.ads.internal.adapters.C4144l;
import com.facebook.ads.internal.adapters.C4352m;
import com.facebook.ads.internal.p034a.C1348a;
import com.facebook.ads.internal.p034a.C1349b;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p041h.C1427q;
import com.facebook.ads.internal.p041h.C3288g;
import com.facebook.ads.internal.p047k.C1481b;
import com.facebook.ads.internal.p047k.C1482c;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1491i;
import com.facebook.ads.internal.p047k.C1515z;
import com.facebook.ads.internal.p047k.C1515z.C1514a;
import com.facebook.ads.internal.p047k.aa;
import com.facebook.ads.internal.view.C1604d;
import com.facebook.ads.internal.view.C1604d.C1603a;
import com.facebook.ads.internal.view.C3365c;
import com.facebook.ads.internal.view.C3365c.C1560b;
import com.facebook.ads.internal.view.C3371f;
import com.facebook.ads.internal.view.C3377i;
import com.facebook.ads.internal.view.C3393s;
import com.facebook.ads.internal.view.C3394u;
import com.facebook.ads.internal.view.C3395y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AudienceNetworkActivity extends Activity {
    public static final String AD_ICON_URL = "adIconUrl";
    public static final String AD_SUBTITLE = "adSubtitle";
    public static final String AD_TITLE = "adTitle";
    public static final String AUDIENCE_NETWORK_UNIQUE_ID_EXTRA = "uniqueId";
    public static final String AUTOPLAY = "autoplay";
    public static final String BROWSER_URL = "browserURL";
    public static final String CLIENT_TOKEN = "clientToken";
    public static final String CONTEXT_SWITCH_BEHAVIOR = "contextSwitchBehavior";
    public static final String END_CARD_ACTIVATION_COMMAND = "facebookRewardedVideoEndCardActivationCommand";
    public static final String END_CARD_MARKUP = "facebookRewardedVideoEndCardMarkup";
    public static final String HANDLER_TIME = "handlerTime";
    public static final String PLACEMENT_ID = "placementId";
    public static final String PREDEFINED_ORIENTATION_KEY = "predefinedOrientationKey";
    public static final String REQUEST_TIME = "requestTime";
    public static final String REWARD_SERVER_URL = "rewardServerURL";
    public static final String SKIP_DELAY_SECONDS_KEY = "skipAfterSeconds";
    public static final String VIDEO_LOGGER = "videoLogger";
    public static final String VIDEO_MPD = "videoMPD";
    public static final String VIDEO_REPORT_URL = "videoReportURL";
    public static final String VIDEO_SEEK_TIME = "videoSeekTime";
    public static final String VIDEO_URL = "videoURL";
    public static final String VIEW_TYPE = "viewType";
    public static final String WEBVIEW_ENCODING = "utf-8";
    public static final String WEBVIEW_MIME_TYPE = "text/html";
    /* renamed from: a */
    private static final String f3511a = "AudienceNetworkActivity";
    @Nullable
    /* renamed from: b */
    private C1425f f3512b;
    /* renamed from: c */
    private String f3513c;
    /* renamed from: d */
    private String f3514d;
    /* renamed from: e */
    private C3365c f3515e;
    /* renamed from: f */
    private boolean f3516f = false;
    /* renamed from: g */
    private RelativeLayout f3517g;
    /* renamed from: h */
    private Intent f3518h;
    /* renamed from: i */
    private int f3519i = -1;
    /* renamed from: j */
    private String f3520j;
    /* renamed from: k */
    private Type f3521k;
    /* renamed from: l */
    private long f3522l;
    /* renamed from: m */
    private long f3523m;
    /* renamed from: n */
    private int f3524n;
    /* renamed from: o */
    private C1604d f3525o;
    /* renamed from: p */
    private List<BackButtonInterceptor> f3526p = new ArrayList();
    /* renamed from: q */
    private TextView f3527q;
    /* renamed from: r */
    private C1404f f3528r;
    /* renamed from: s */
    private boolean f3529s;
    /* renamed from: t */
    private String f3530t;
    /* renamed from: u */
    private long f3531u;

    public interface BackButtonInterceptor {
        boolean interceptBackButton();
    }

    public enum Type {
        INTERSTITIAL_WEB_VIEW,
        INTERSTITIAL_NATIVE_VIDEO,
        INTERSTITIAL_NATIVE_IMAGE,
        INTERSTITIAL_NATIVE_CAROUSEL,
        FULL_SCREEN_VIDEO,
        REWARDED_VIDEO,
        BROWSER
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$a */
    private class C1336a implements OnLongClickListener {
        /* renamed from: a */
        final /* synthetic */ AudienceNetworkActivity f3510a;

        private C1336a(AudienceNetworkActivity audienceNetworkActivity) {
            this.f3510a = audienceNetworkActivity;
        }

        public boolean onLongClick(View view) {
            if (!(this.f3510a.f3528r == null || this.f3510a.f3517g == null)) {
                this.f3510a.f3528r.setBounds(0, 0, this.f3510a.f3517g.getWidth(), this.f3510a.f3517g.getHeight());
                this.f3510a.f3528r.m4884a(this.f3510a.f3528r.m4885a() ^ true);
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$1 */
    class C32191 implements C1603a {
        /* renamed from: a */
        final /* synthetic */ AudienceNetworkActivity f9829a;

        C32191(AudienceNetworkActivity audienceNetworkActivity) {
            this.f9829a = audienceNetworkActivity;
        }

        /* renamed from: a */
        public void mo1645a(View view) {
            this.f9829a.f3517g.addView(view);
        }

        /* renamed from: a */
        public void mo1646a(String str) {
            this.f9829a.m4659a(str);
        }

        /* renamed from: a */
        public void mo1647a(String str, C1427q c1427q) {
            this.f9829a.m4660a(str, c1427q);
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$2 */
    class C32202 implements C1603a {
        /* renamed from: a */
        final /* synthetic */ AudienceNetworkActivity f9830a;

        C32202(AudienceNetworkActivity audienceNetworkActivity) {
            this.f9830a = audienceNetworkActivity;
        }

        /* renamed from: a */
        public void mo1645a(View view) {
            this.f9830a.f3517g.addView(view);
        }

        /* renamed from: a */
        public void mo1646a(String str) {
            this.f9830a.m4659a(str);
            if (str.equals(C1432i.REWARDED_VIDEO_END_ACTIVITY.m5005a())) {
                this.f9830a.finish();
            }
        }

        /* renamed from: a */
        public void mo1647a(String str, C1427q c1427q) {
            this.f9830a.m4659a(str);
            if (str.startsWith(C1432i.REWARDED_VIDEO_COMPLETE.m5005a())) {
                if (!str.equals(C1432i.REWARDED_VIDEO_COMPLETE_WITHOUT_REWARD.m5005a())) {
                    this.f9830a.m4663b();
                }
                this.f9830a.f3516f = true;
                this.f9830a.m4664c();
                this.f9830a.m4666d();
            }
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$3 */
    class C32213 implements BackButtonInterceptor {
        /* renamed from: a */
        final /* synthetic */ AudienceNetworkActivity f9831a;

        C32213(AudienceNetworkActivity audienceNetworkActivity) {
            this.f9831a = audienceNetworkActivity;
        }

        public boolean interceptBackButton() {
            return this.f9831a.f3516f ^ 1;
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$4 */
    class C32224 implements C1603a {
        /* renamed from: a */
        final /* synthetic */ AudienceNetworkActivity f9832a;

        C32224(AudienceNetworkActivity audienceNetworkActivity) {
            this.f9832a = audienceNetworkActivity;
        }

        /* renamed from: a */
        public void mo1645a(View view) {
            this.f9832a.f3517g.addView(view);
        }

        /* renamed from: a */
        public void mo1646a(String str) {
            this.f9832a.m4659a(str);
        }

        /* renamed from: a */
        public void mo1647a(String str, C1427q c1427q) {
            this.f9832a.m4660a(str, c1427q);
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$5 */
    class C32235 implements C1603a {
        /* renamed from: a */
        final /* synthetic */ AudienceNetworkActivity f9833a;

        C32235(AudienceNetworkActivity audienceNetworkActivity) {
            this.f9833a = audienceNetworkActivity;
        }

        /* renamed from: a */
        public void mo1645a(View view) {
            this.f9833a.f3517g.addView(view);
        }

        /* renamed from: a */
        public void mo1646a(String str) {
            this.f9833a.m4659a(str);
        }

        /* renamed from: a */
        public void mo1647a(String str, C1427q c1427q) {
            this.f9833a.m4660a(str, c1427q);
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$6 */
    class C32246 implements C1603a {
        /* renamed from: a */
        final /* synthetic */ AudienceNetworkActivity f9834a;

        C32246(AudienceNetworkActivity audienceNetworkActivity) {
            this.f9834a = audienceNetworkActivity;
        }

        /* renamed from: a */
        public void mo1645a(View view) {
            this.f9834a.f3517g.addView(view);
        }

        /* renamed from: a */
        public void mo1646a(String str) {
            this.f9834a.m4659a(str);
        }

        /* renamed from: a */
        public void mo1647a(String str, C1427q c1427q) {
            this.f9834a.m4660a(str, c1427q);
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$7 */
    class C32257 implements C1514a {
        /* renamed from: a */
        final /* synthetic */ AudienceNetworkActivity f9835a;

        C32257(AudienceNetworkActivity audienceNetworkActivity) {
            this.f9835a = audienceNetworkActivity;
        }

        /* renamed from: a */
        public void mo1649a() {
            this.f9835a.m4659a(C1432i.REWARD_SERVER_FAILED.m5005a());
        }

        /* renamed from: a */
        public void mo1650a(aa aaVar) {
            AudienceNetworkActivity audienceNetworkActivity;
            C1432i c1432i;
            if (aaVar == null || !aaVar.m5173a()) {
                audienceNetworkActivity = this.f9835a;
                c1432i = C1432i.REWARD_SERVER_FAILED;
            } else {
                audienceNetworkActivity = this.f9835a;
                c1432i = C1432i.REWARD_SERVER_SUCCESS;
            }
            audienceNetworkActivity.m4659a(c1432i.m5005a());
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$8 */
    class C32268 implements C1560b {
        /* renamed from: a */
        final /* synthetic */ AudienceNetworkActivity f9836a;

        /* renamed from: com.facebook.ads.AudienceNetworkActivity$8$1 */
        class C13351 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C32268 f3508a;

            C13351(C32268 c32268) {
                this.f3508a = c32268;
            }

            public void run() {
                if (this.f3508a.f9836a.f3515e.m5423c()) {
                    Log.w(AudienceNetworkActivity.f3511a, "Webview already destroyed, cannot activate");
                    return;
                }
                C3365c i = this.f3508a.f9836a.f3515e;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("javascript:");
                stringBuilder.append(this.f3508a.f9836a.f3514d);
                i.loadUrl(stringBuilder.toString());
            }
        }

        C32268(AudienceNetworkActivity audienceNetworkActivity) {
            this.f9836a = audienceNetworkActivity;
        }

        /* renamed from: a */
        public void mo1651a() {
            if (this.f9836a.f3515e != null && !TextUtils.isEmpty(this.f9836a.f3514d)) {
                this.f9836a.f3515e.post(new C13351(this));
            }
        }

        /* renamed from: a */
        public void mo1652a(int i) {
        }

        /* renamed from: a */
        public void mo1653a(String str, Map<String, String> map) {
            Uri parse = Uri.parse(str);
            if ("fbad".equals(parse.getScheme()) && parse.getAuthority().equals("close")) {
                this.f9836a.finish();
                return;
            }
            if ("fbad".equals(parse.getScheme()) && C1349b.m4702a(parse.getAuthority())) {
                this.f9836a.m4659a(C1432i.REWARDED_VIDEO_AD_CLICK.m5005a());
            }
            C1348a a = C1349b.m4701a(this.f9836a, this.f9836a.f3512b, this.f9836a.f3513c, parse, map);
            if (a != null) {
                try {
                    a.mo1718b();
                } catch (Throwable e) {
                    Log.e(AudienceNetworkActivity.f3511a, "Error executing action", e);
                }
            }
        }

        /* renamed from: b */
        public void mo1654b() {
        }
    }

    /* renamed from: a */
    private void m4656a(Intent intent, Bundle bundle) {
        if (bundle != null) {
            this.f3519i = bundle.getInt(PREDEFINED_ORIENTATION_KEY, -1);
            this.f3520j = bundle.getString(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA);
            this.f3521k = (Type) bundle.getSerializable(VIEW_TYPE);
            return;
        }
        this.f3519i = intent.getIntExtra(PREDEFINED_ORIENTATION_KEY, -1);
        this.f3520j = intent.getStringExtra(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA);
        this.f3521k = (Type) intent.getSerializableExtra(VIEW_TYPE);
        this.f3524n = intent.getIntExtra(SKIP_DELAY_SECONDS_KEY, 0) * AdError.NETWORK_ERROR_CODE;
    }

    /* renamed from: a */
    private void m4659a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(this.f3520j);
        C0436c.m1648a((Context) this).m1653a(new Intent(stringBuilder.toString()));
    }

    /* renamed from: a */
    private void m4660a(String str, C1427q c1427q) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(this.f3520j);
        Intent intent = new Intent(stringBuilder.toString());
        intent.putExtra("event", c1427q);
        C0436c.m1648a((Context) this).m1653a(intent);
    }

    /* renamed from: b */
    private void m4663b() {
        if (!TextUtils.isEmpty(this.f3518h.getStringExtra(REWARD_SERVER_URL))) {
            C1515z c1515z = new C1515z(new HashMap());
            c1515z.m5322a(new C32257(this));
            c1515z.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{r0});
        }
    }

    /* renamed from: c */
    private void m4664c() {
        Object a = C1490h.m5247a(this.f3518h.getByteArrayExtra(END_CARD_MARKUP));
        if (!TextUtils.isEmpty(a)) {
            this.f3515e = new C3365c(this, new C32268(this), 1);
            this.f3515e.setLayoutParams(new LayoutParams(-1, -1));
            this.f3514d = this.f3518h.getStringExtra(END_CARD_ACTIVATION_COMMAND);
            this.f3515e.loadDataWithBaseURL(C1491i.m5258a(), a, WEBVIEW_MIME_TYPE, WEBVIEW_ENCODING, null);
        }
    }

    /* renamed from: d */
    private void m4666d() {
        if (this.f3515e == null) {
            finish();
            return;
        }
        this.f3517g.removeAllViews();
        this.f3517g.setOnLongClickListener(null);
        this.f3525o.onDestroy();
        this.f3525o = null;
        this.f3517g.addView(this.f3515e);
        if (this.f3527q != null) {
            this.f3517g.addView(this.f3527q);
        }
    }

    public void addBackButtonInterceptor(BackButtonInterceptor backButtonInterceptor) {
        this.f3526p.add(backButtonInterceptor);
    }

    public void finish() {
        if (this.f3521k == Type.REWARDED_VIDEO) {
            m4659a(C1432i.REWARDED_VIDEO_CLOSED.m5005a());
            if (!(this.f3512b == null || TextUtils.isEmpty(this.f3513c))) {
                this.f3512b.mo1753g(this.f3513c, new HashMap());
            }
        } else {
            m4659a("com.facebook.ads.interstitial.dismissed");
        }
        super.finish();
    }

    public void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f3523m += currentTimeMillis - this.f3522l;
        this.f3522l = currentTimeMillis;
        if (this.f3523m > ((long) this.f3524n)) {
            Object obj = null;
            for (BackButtonInterceptor interceptBackButton : this.f3526p) {
                if (interceptBackButton.interceptBackButton()) {
                    obj = 1;
                }
            }
            if (obj == null) {
                super.onBackPressed();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f3525o instanceof C4352m) {
            ((C4352m) this.f3525o).m17741a(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        C1604d c3395y;
        ViewGroup.LayoutParams layoutParams;
        OnLongClickListener c1336a;
        super.onCreate(bundle);
        this.f3512b = C3288g.m12671a((Context) this);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        this.f3517g = new RelativeLayout(this);
        this.f3517g.setBackgroundColor(-16777216);
        setContentView(this.f3517g, new LayoutParams(-1, -1));
        this.f3518h = getIntent();
        this.f3513c = this.f3518h.getStringExtra(CLIENT_TOKEN);
        this.f3530t = this.f3518h.getStringExtra(PLACEMENT_ID);
        this.f3531u = this.f3518h.getLongExtra(REQUEST_TIME, 0);
        m4656a(this.f3518h, bundle);
        this.f3529s = false;
        if (this.f3521k == Type.FULL_SCREEN_VIDEO) {
            c3395y = new C3395y(this, new C32191(this));
            c3395y.m13072a(this.f3517g);
        } else {
            if (this.f3521k == Type.REWARDED_VIDEO) {
                this.f3525o = new C3393s(this, new C3394u(this), new C32202(this));
                addBackButtonInterceptor(new C32213(this));
            } else if (this.f3521k == Type.INTERSTITIAL_WEB_VIEW) {
                this.f3529s = true;
                c3395y = new C3377i(this, this.f3512b, new C32224(this));
            } else if (this.f3521k == Type.BROWSER) {
                c3395y = new C3371f(this, new C32235(this));
            } else {
                String str;
                if (!(this.f3521k == Type.INTERSTITIAL_NATIVE_VIDEO || this.f3521k == Type.INTERSTITIAL_NATIVE_IMAGE)) {
                    if (this.f3521k != Type.INTERSTITIAL_NATIVE_CAROUSEL) {
                        str = "Unable to infer viewType from intent or savedInstanceState";
                        C1482c.m5218a(C1481b.m5215a(null, str));
                        m4659a("com.facebook.ads.interstitial.error");
                        finish();
                        return;
                    }
                }
                this.f3525o = C4144l.m16327a(this.f3518h.getStringExtra(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA));
                if (this.f3525o == null) {
                    str = "Unable to find view";
                    C1482c.m5218a(C1481b.m5215a(null, str));
                    m4659a("com.facebook.ads.interstitial.error");
                    finish();
                    return;
                }
                this.f3525o.setListener(new C32246(this));
            }
            this.f3525o.mo1823a(this.f3518h, bundle, this);
            m4659a("com.facebook.ads.interstitial.displayed");
            this.f3522l = System.currentTimeMillis();
            if (C1418g.m4931b(this) && this.f3521k != Type.BROWSER) {
                this.f3528r = new C1404f();
                this.f3528r.m4883a(this.f3530t);
                this.f3528r.m4887b(getPackageName());
                if (this.f3531u != 0) {
                    this.f3528r.m4881a(this.f3531u);
                }
                this.f3527q = new TextView(this);
                this.f3527q.setText("Debug");
                this.f3527q.setTextColor(-1);
                this.f3527q.setBackgroundColor(Color.argb(160, 0, 0, 0));
                this.f3527q.setPadding(5, 5, 5, 5);
                layoutParams = new LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                this.f3527q.setLayoutParams(layoutParams);
                c1336a = new C1336a();
                this.f3527q.setOnLongClickListener(c1336a);
                if (this.f3529s) {
                    this.f3517g.setOnLongClickListener(c1336a);
                } else {
                    this.f3517g.addView(this.f3527q);
                }
                this.f3517g.getOverlay().add(this.f3528r);
            }
        }
        this.f3525o = c3395y;
        this.f3525o.mo1823a(this.f3518h, bundle, this);
        m4659a("com.facebook.ads.interstitial.displayed");
        this.f3522l = System.currentTimeMillis();
        this.f3528r = new C1404f();
        this.f3528r.m4883a(this.f3530t);
        this.f3528r.m4887b(getPackageName());
        if (this.f3531u != 0) {
            this.f3528r.m4881a(this.f3531u);
        }
        this.f3527q = new TextView(this);
        this.f3527q.setText("Debug");
        this.f3527q.setTextColor(-1);
        this.f3527q.setBackgroundColor(Color.argb(160, 0, 0, 0));
        this.f3527q.setPadding(5, 5, 5, 5);
        layoutParams = new LayoutParams(-2, -2);
        layoutParams.addRule(12, -1);
        layoutParams.addRule(11, -1);
        this.f3527q.setLayoutParams(layoutParams);
        c1336a = new C1336a();
        this.f3527q.setOnLongClickListener(c1336a);
        if (this.f3529s) {
            this.f3517g.setOnLongClickListener(c1336a);
        } else {
            this.f3517g.addView(this.f3527q);
        }
        this.f3517g.getOverlay().add(this.f3528r);
    }

    protected void onDestroy() {
        this.f3517g.removeAllViews();
        if (this.f3525o != null) {
            C4144l.m16328a(this.f3525o);
            this.f3525o.onDestroy();
            this.f3525o = null;
        }
        if (this.f3515e != null) {
            C1491i.m5259a(this.f3515e);
            this.f3515e.destroy();
            this.f3515e = null;
            this.f3514d = null;
        }
        if (this.f3528r != null && C1418g.m4931b(this)) {
            this.f3528r.m4886b();
        }
        super.onDestroy();
    }

    public void onPause() {
        this.f3523m += System.currentTimeMillis() - this.f3522l;
        if (!(this.f3525o == null || this.f3516f)) {
            this.f3525o.mo1825h();
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f3522l = System.currentTimeMillis();
        if (this.f3525o != null) {
            this.f3525o.mo1826i();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f3525o != null) {
            this.f3525o.mo1824a(bundle);
        }
        bundle.putInt(PREDEFINED_ORIENTATION_KEY, this.f3519i);
        bundle.putString(AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.f3520j);
        bundle.putSerializable(VIEW_TYPE, this.f3521k);
    }

    public void onStart() {
        super.onStart();
        if (this.f3519i != -1) {
            setRequestedOrientation(this.f3519i);
        }
    }

    public void removeBackButtonInterceptor(BackButtonInterceptor backButtonInterceptor) {
        this.f3526p.remove(backButtonInterceptor);
    }
}
