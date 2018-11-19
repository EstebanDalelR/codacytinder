package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsLogger.FlushBehavior;
import com.facebook.internal.C1738r;
import java.util.Locale;

/* renamed from: com.facebook.appevents.internal.h */
class C1656h {
    /* renamed from: a */
    private static final String f4573a = C1656h.class.getCanonicalName();
    /* renamed from: b */
    private static final long[] f4574b = new long[]{300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    C1656h() {
    }

    /* renamed from: a */
    public static void m5625a(Context context, String str, C1659i c1659i, String str2) {
        context = c1659i != null ? c1659i.toString() : "Unclassified";
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", context);
        context = new C3397f(str, str2, null);
        context.m5536a("fb_mobile_activate_app", bundle);
        if (AppEventsLogger.m5520a() != FlushBehavior.EXPLICIT_ONLY) {
            context.m5538b();
        }
    }

    /* renamed from: a */
    public static void m5624a(Context context, String str, C1655g c1655g, String str2) {
        context = Long.valueOf(c1655g.m5617f() - c1655g.m5614c().longValue());
        if (context.longValue() < 0) {
            context = Long.valueOf(0);
            C1656h.m5623a();
        }
        Long valueOf = Long.valueOf(c1655g.m5619h());
        if (valueOf.longValue() < 0) {
            C1656h.m5623a();
            valueOf = Long.valueOf(0);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", c1655g.m5615d());
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(C1656h.m5622a(context.longValue()))}));
        context = c1655g.m5620i();
        bundle.putString("fb_mobile_launch_source", context != null ? context.toString() : "Unclassified");
        bundle.putLong("_logTime", c1655g.m5614c().longValue() / 1000);
        new C3397f(str, str2, null).m5535a("fb_mobile_deactivate_app", (double) (double) (valueOf.longValue() / 1000), bundle);
    }

    /* renamed from: a */
    private static void m5623a() {
        C1738r.m5978a(LoggingBehavior.APP_EVENTS, f4573a, "Clock skew detected");
    }

    /* renamed from: a */
    private static int m5622a(long j) {
        int i = 0;
        while (i < f4574b.length && f4574b[i] < j) {
            i++;
        }
        return i;
    }
}
