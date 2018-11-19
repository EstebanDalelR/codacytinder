package com.tinder.analytics.fireworks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.ads.source.dfp.DfpCustomTargetingValuesKt;
import com.tinder.analytics.fireworks.C2632i.C2631a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.networkperf.InstrumentationConstantsKt;

/* renamed from: com.tinder.analytics.fireworks.d */
public class C7322d implements EventInterceptor {
    /* renamed from: a */
    private static final C2633r f26448a = C2633r.a(ManagerWebServices.FB_PARAM_BIRTH_DATE, String.class);
    /* renamed from: b */
    private static final C2633r f26449b = C2633r.a("spotifyConnected", Boolean.class);
    /* renamed from: c */
    private static final C2633r f26450c = C2633r.a("appVersion", String.class);
    /* renamed from: d */
    private static final C2633r f26451d = C2633r.a("gender", Number.class);
    /* renamed from: e */
    private static final C2633r f26452e = C2633r.a("advertisingId", String.class);
    /* renamed from: f */
    private static final C2633r f26453f = C2633r.a("targetGender", Number.class);
    /* renamed from: g */
    private static final C2633r f26454g = C2633r.a("language", String.class);
    /* renamed from: h */
    private static final C2633r f26455h = C2633r.a("platform", Number.class);
    /* renamed from: i */
    private static final C2633r f26456i = C2633r.a(InstrumentationConstantsKt.FIELD_UID, String.class);
    /* renamed from: j */
    private static final C2633r f26457j = C2633r.a("osVersion", String.class);
    /* renamed from: k */
    private static final C2633r f26458k = C2633r.a("model", String.class);
    /* renamed from: l */
    private static final C2633r f26459l = C2633r.a("tinderPlus", Boolean.class);
    /* renamed from: m */
    private static final C2633r f26460m = C2633r.a("anthemConnected", Boolean.class);
    /* renamed from: n */
    private static final C2633r f26461n = C2633r.a("manu", String.class);
    /* renamed from: o */
    private static final C2633r f26462o = C2633r.a("dataProvider", String.class);
    /* renamed from: p */
    private static final C2633r f26463p = C2633r.a(DfpCustomTargetingValuesKt.ADS_TARGETING_AGE, String.class);
    /* renamed from: q */
    private static final C2633r f26464q = C2633r.a(ManagerWebServices.IG_PARAM_TIMESTAMP, Number.class);
    /* renamed from: r */
    private static final C2633r f26465r = C2633r.a(ManagerWebServices.PARAM_LAT, Number.class);
    /* renamed from: s */
    private static final C2633r f26466s = C2633r.a(ManagerWebServices.PARAM_LON, Number.class);
    /* renamed from: t */
    private static final C2633r f26467t = C2633r.a("appBuild", Number.class);
    /* renamed from: u */
    private static final C2633r f26468u = C2633r.a("instanceId", String.class);
    /* renamed from: v */
    private static final C2633r f26469v = C2633r.a("authId", String.class);
    /* renamed from: w */
    private static final C2633r f26470w = C2633r.a("androidDeviceId", String.class);
    @NonNull
    /* renamed from: x */
    private final C6226b f26471x;
    @NonNull
    /* renamed from: y */
    private final C6225a f26472y;

    /* renamed from: com.tinder.analytics.fireworks.d$a */
    interface C6225a {
        @Nullable
        /* renamed from: a */
        String mo6765a();

        @Nullable
        /* renamed from: b */
        String mo6766b();

        @Nullable
        /* renamed from: c */
        String mo6767c();

        @Nullable
        /* renamed from: d */
        Number mo6768d();

        @Nullable
        /* renamed from: e */
        String mo6769e();

        @Nullable
        /* renamed from: f */
        String mo6770f();

        @Nullable
        /* renamed from: g */
        String mo6771g();

        @Nullable
        /* renamed from: h */
        String mo6772h();

        @Nullable
        /* renamed from: i */
        Number mo6773i();

        @Nullable
        /* renamed from: j */
        Number mo6774j();

        @Nullable
        /* renamed from: k */
        Number mo6775k();

        @Nullable
        /* renamed from: l */
        Number mo6776l();

        @Nullable
        /* renamed from: m */
        String mo6777m();

        @Nullable
        /* renamed from: n */
        String mo6778n();

        @Nullable
        /* renamed from: o */
        String mo6779o();
    }

    /* renamed from: com.tinder.analytics.fireworks.d$b */
    interface C6226b {
        @Nullable
        /* renamed from: a */
        String mo6785a();

        @Nullable
        /* renamed from: b */
        Boolean mo6786b();

        @Nullable
        /* renamed from: c */
        Number mo6787c();

        @Nullable
        /* renamed from: d */
        Number mo6788d();

        @Nullable
        /* renamed from: e */
        String mo6789e();

        @Nullable
        /* renamed from: f */
        Boolean mo6790f();

        @Nullable
        /* renamed from: g */
        Boolean mo6791g();

        @Nullable
        /* renamed from: h */
        String mo6792h();
    }

    public C7322d(@NonNull C6226b c6226b, @NonNull C6225a c6225a) {
        this.f26471x = c6226b;
        this.f26472y = c6225a;
    }

    @NonNull
    public C2632i intercept(@NonNull C2631a c2631a) {
        m31263a(c2631a);
        m31265b(c2631a);
        return c2631a.a();
    }

    /* renamed from: a */
    private void m31263a(@NonNull C2631a c2631a) {
        C7322d.m31264a(c2631a, f26448a, this.f26471x.mo6785a());
        C7322d.m31264a(c2631a, f26449b, this.f26471x.mo6786b());
        C7322d.m31264a(c2631a, f26451d, this.f26471x.mo6787c());
        C7322d.m31264a(c2631a, f26453f, this.f26471x.mo6788d());
        C7322d.m31264a(c2631a, f26456i, this.f26471x.mo6789e());
        C7322d.m31264a(c2631a, f26459l, this.f26471x.mo6790f());
        C7322d.m31264a(c2631a, f26460m, this.f26471x.mo6791g());
        C7322d.m31264a(c2631a, f26463p, this.f26471x.mo6792h());
    }

    /* renamed from: b */
    private void m31265b(@NonNull C2631a c2631a) {
        C7322d.m31264a(c2631a, f26450c, this.f26472y.mo6765a());
        C7322d.m31264a(c2631a, f26452e, this.f26472y.mo6766b());
        C7322d.m31264a(c2631a, f26454g, this.f26472y.mo6767c());
        C7322d.m31264a(c2631a, f26455h, this.f26472y.mo6768d());
        C7322d.m31264a(c2631a, f26457j, this.f26472y.mo6769e());
        C7322d.m31264a(c2631a, f26458k, this.f26472y.mo6770f());
        C7322d.m31264a(c2631a, f26461n, this.f26472y.mo6771g());
        C7322d.m31264a(c2631a, f26462o, this.f26472y.mo6772h());
        C7322d.m31264a(c2631a, f26464q, this.f26472y.mo6773i());
        C7322d.m31264a(c2631a, f26465r, this.f26472y.mo6774j());
        C7322d.m31264a(c2631a, f26466s, this.f26472y.mo6775k());
        C7322d.m31264a(c2631a, f26467t, this.f26472y.mo6776l());
        C7322d.m31264a(c2631a, f26468u, this.f26472y.mo6777m());
        C7322d.m31264a(c2631a, f26469v, this.f26472y.mo6778n());
        C7322d.m31264a(c2631a, f26470w, this.f26472y.mo6779o());
    }

    /* renamed from: a */
    private static void m31264a(@NonNull C2631a c2631a, @NonNull C2633r c2633r, @Nullable Object obj) {
        if (obj != null) {
            c2631a.a(c2633r, obj);
        }
    }
}
