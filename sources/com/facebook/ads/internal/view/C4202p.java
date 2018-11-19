package com.facebook.ads.internal.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.Type;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.adapters.ad;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3336i;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3338k;
import java.util.UUID;

/* renamed from: com.facebook.ads.internal.view.p */
public class C4202p extends C3394u {
    /* renamed from: b */
    private final String f13429b = UUID.randomUUID().toString();
    /* renamed from: c */
    private final C3338k f13430c = new C41991(this);
    /* renamed from: d */
    private final C3336i f13431d = new C42002(this);
    /* renamed from: e */
    private final C3330c f13432e = new C42013(this);
    /* renamed from: f */
    private final ad f13433f;
    /* renamed from: g */
    private C1425f f13434g;
    @Nullable
    /* renamed from: h */
    private com.facebook.ads.internal.p047k.ad f13435h;
    @Nullable
    /* renamed from: i */
    private String f13436i;
    @Nullable
    /* renamed from: j */
    private Uri f13437j;
    @Nullable
    /* renamed from: k */
    private String f13438k;
    @Nullable
    /* renamed from: l */
    private String f13439l;
    @Nullable
    /* renamed from: m */
    private String f13440m;
    @Nullable
    /* renamed from: n */
    private C1613q f13441n;
    @Nullable
    /* renamed from: o */
    private NativeAd f13442o;

    /* renamed from: com.facebook.ads.internal.view.p$1 */
    class C41991 extends C3338k {
        /* renamed from: a */
        final /* synthetic */ C4202p f13426a;

        C41991(C4202p c4202p) {
            this.f13426a = c4202p;
        }

        /* renamed from: a */
        public void m16639a(C3337j c3337j) {
            if (this.f13426a.f13441n != null) {
                this.f13426a.f13441n.mo1667c();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.p$2 */
    class C42002 extends C3336i {
        /* renamed from: a */
        final /* synthetic */ C4202p f13427a;

        C42002(C4202p c4202p) {
            this.f13427a = c4202p;
        }

        /* renamed from: a */
        public void m16641a(C3335h c3335h) {
            if (this.f13427a.f13441n != null) {
                this.f13427a.f13441n.mo1666b();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.p$3 */
    class C42013 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ C4202p f13428a;

        C42013(C4202p c4202p) {
            this.f13428a = c4202p;
        }

        /* renamed from: a */
        public void m16643a(C3329b c3329b) {
            if (this.f13428a.f13441n != null) {
                this.f13428a.f13441n.mo1672h();
            }
        }
    }

    public C4202p(Context context) {
        super(context);
        this.f13433f = new ad(this, context);
        m16646m();
    }

    public C4202p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13433f = new ad(this, context);
        m16646m();
    }

    public C4202p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13433f = new ad(this, context);
        m16646m();
    }

    @TargetApi(21)
    public C4202p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f13433f = new ad(this, context);
        m16646m();
    }

    /* renamed from: a */
    private void m16645a(Intent intent) {
        if (this.f13436i != null) {
            if (this.f13435h != null) {
                if (this.f13437j == null && this.f13439l == null) {
                    throw new IllegalStateException("Must setVideoURI or setVideoMPD first.");
                }
                intent.putExtra("useNativeCtaButton", this.f13440m);
                intent.putExtra(AudienceNetworkActivity.VIEW_TYPE, Type.FULL_SCREEN_VIDEO);
                intent.putExtra(AudienceNetworkActivity.VIDEO_URL, this.f13437j.toString());
                intent.putExtra(AudienceNetworkActivity.CLIENT_TOKEN, this.f13438k == null ? "" : this.f13438k);
                intent.putExtra(AudienceNetworkActivity.VIDEO_MPD, this.f13439l);
                intent.putExtra(AudienceNetworkActivity.VIDEO_REPORT_URL, this.f13436i);
                intent.putExtra(AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY, 13);
                intent.putExtra(AudienceNetworkActivity.VIDEO_SEEK_TIME, getCurrentPosition());
                intent.putExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.f13429b);
                intent.putExtra(AudienceNetworkActivity.VIDEO_LOGGER, this.f13435h.getSaveInstanceState());
                intent.addFlags(268435456);
                return;
            }
        }
        throw new IllegalStateException("Must setVideoReportUri first.");
    }

    /* renamed from: m */
    private void m16646m() {
        getEventBus().m4995a(this.f13430c, this.f13431d, this.f13432e);
    }

    /* renamed from: a */
    public void m16647a(@Nullable String str, @Nullable String str2) {
        if (this.f13435h != null) {
            this.f13435h.m16499a();
        }
        this.f13438k = str2;
        this.f13436i = str;
        com.facebook.ads.internal.p047k.ad adVar = (str == null || str2 == null) ? null : new com.facebook.ads.internal.p047k.ad(getContext(), this.f13434g, this, str2);
        this.f13435h = adVar;
    }

    /* renamed from: c */
    public void mo3349c() {
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
        r3 = this;
        r0 = r3.getContext();
        r1 = new android.content.Intent;
        r2 = com.facebook.ads.AudienceNetworkActivity.class;
        r1.<init>(r0, r2);
        r3.m16645a(r1);
        r2 = 0;
        r3.m13058a(r2);	 Catch:{ ActivityNotFoundException -> 0x0026 }
        r2 = 8;	 Catch:{ ActivityNotFoundException -> 0x0026 }
        r3.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x0026 }
        r0.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x0026 }
        return;
    L_0x001b:
        r0 = move-exception;
        r1 = "Error occurred while loading fullscreen video activity.";
        r0 = com.facebook.ads.internal.p047k.C1481b.m5215a(r0, r1);
        com.facebook.ads.internal.p047k.C1482c.m5218a(r0);
        return;
    L_0x0026:
        r2 = com.facebook.ads.InterstitialAdActivity.class;	 Catch:{ Exception -> 0x001b }
        r1.setClass(r0, r2);	 Catch:{ Exception -> 0x001b }
        r0.startActivity(r1);	 Catch:{ Exception -> 0x001b }
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.p.c():void");
    }

    /* renamed from: d */
    public void m16649d() {
        if (this.f13442o != null) {
            this.f13442o.onCtaBroadcast();
        }
    }

    @Nullable
    public C1613q getListener() {
        return this.f13441n;
    }

    public String getUniqueId() {
        return this.f13429b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13433f.m4727a();
    }

    protected void onDetachedFromWindow() {
        this.f13433f.m4728b();
        super.onDetachedFromWindow();
    }

    public void setAdEventManager(C1425f c1425f) {
        this.f13434g = c1425f;
    }

    public void setEnableBackgroundVideo(boolean z) {
        this.a.setBackgroundPlaybackEnabled(z);
    }

    public void setListener(@Nullable C1613q c1613q) {
        this.f13441n = c1613q;
    }

    public void setNativeAd(@Nullable NativeAd nativeAd) {
        this.f13442o = nativeAd;
    }

    public void setVideoCTA(@Nullable String str) {
        this.f13440m = str;
    }

    public void setVideoMPD(@Nullable String str) {
        if (str == null || this.f13435h != null) {
            this.f13439l = str;
            super.setVideoMPD(str);
            return;
        }
        throw new IllegalStateException("Must setVideoReportUri first.");
    }

    public void setVideoURI(@Nullable Uri uri) {
        if (uri == null || this.f13435h != null) {
            this.f13437j = uri;
            super.setVideoURI(uri);
            return;
        }
        throw new IllegalStateException("Must setVideoReportUri first.");
    }
}
