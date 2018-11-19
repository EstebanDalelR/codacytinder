package com.facebook.ads.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import com.facebook.ads.internal.p047k.C1490h;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.tinder.api.ManagerWebServices;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.g */
public class C1418g {
    /* renamed from: a */
    private static C1418g f3917a;
    /* renamed from: b */
    private final SharedPreferences f3918b;

    public C1418g(Context context) {
        this.f3918b = context.getApplicationContext().getSharedPreferences("com.facebook.ads.FEATURE_CONFIG", 0);
    }

    /* renamed from: a */
    public static boolean m4930a(Context context) {
        return VERSION.SDK_INT >= 14 && C1490h.m5255a("com.google.android.exoplayer2", "ExoPlayer") && C1418g.m4947r(context).m4952a("adnw_enable_exoplayer", false);
    }

    /* renamed from: b */
    public static boolean m4931b(Context context) {
        return VERSION.SDK_INT >= 18 && C1418g.m4947r(context).m4952a("adnw_enable_debug_overlay", false);
    }

    /* renamed from: c */
    public static boolean m4932c(Context context) {
        return C1418g.m4947r(context).m4952a("adnw_block_lockscreen", false);
    }

    /* renamed from: d */
    public static boolean m4933d(Context context) {
        return C1418g.m4947r(context).m4952a("show_metadata_rewarded_video", false);
    }

    /* renamed from: e */
    public static boolean m4934e(Context context) {
        return VERSION.SDK_INT >= 19 && C1418g.m4947r(context).m4952a("adnw_enable_iab", false);
    }

    /* renamed from: f */
    public static boolean m4935f(Context context) {
        return C1418g.m4947r(context).m4952a("adnw_debug_logging", false);
    }

    /* renamed from: g */
    public static long m4936g(Context context) {
        return C1418g.m4947r(context).m4949a("unified_logging_immediate_delay_ms", 500);
    }

    /* renamed from: h */
    public static long m4937h(Context context) {
        return ((long) C1418g.m4947r(context).m4948a("unified_logging_dispatch_interval_seconds", (int) MapboxConstants.ANIMATION_DURATION)) * 1000;
    }

    /* renamed from: i */
    public static int m4938i(Context context) {
        return C1418g.m4947r(context).m4948a("unified_logging_event_limit", -1);
    }

    /* renamed from: j */
    public static boolean m4939j(Context context) {
        return C1418g.m4947r(context).m4950a("video_and_endcard_autorotate", "autorotate_disabled").equals("autorotate_enabled");
    }

    /* renamed from: k */
    public static boolean m4940k(Context context) {
        return C1418g.m4947r(context).m4952a("show_play_pause_rewarded_video", false);
    }

    /* renamed from: l */
    public static int m4941l(Context context) {
        return C1418g.m4947r(context).m4948a("minimum_elapsed_time_after_impression", -1);
    }

    /* renamed from: m */
    public static int m4942m(Context context) {
        return C1418g.m4947r(context).m4948a("stack_trace_sample_rate", 0);
    }

    /* renamed from: n */
    public static boolean m4943n(Context context) {
        return C1418g.m4947r(context).m4952a("visible_area_check_enabled", false);
    }

    /* renamed from: o */
    public static int m4944o(Context context) {
        return C1418g.m4947r(context).m4948a("visible_area_percentage", 50);
    }

    /* renamed from: p */
    public static boolean m4945p(Context context) {
        return C1418g.m4947r(context).m4952a("adnw_measurement_method", false);
    }

    /* renamed from: q */
    public static boolean m4946q(Context context) {
        return C1418g.m4947r(context).m4952a("adnw_client_request_id_enabled", false);
    }

    /* renamed from: r */
    private static C1418g m4947r(Context context) {
        if (f3917a == null) {
            synchronized (C1418g.class) {
                if (f3917a == null) {
                    f3917a = new C1418g(context);
                }
            }
        }
        return f3917a;
    }

    /* renamed from: a */
    public int m4948a(String str, int i) {
        str = this.f3918b.getString(str, String.valueOf(i));
        if (str != null) {
            if (str.equals(ManagerWebServices.NULL_STRING_VALUE)) {
                return i;
            }
            i = Integer.valueOf(str).intValue();
        }
        return i;
    }

    /* renamed from: a */
    public long m4949a(String str, long j) {
        str = this.f3918b.getString(str, String.valueOf(j));
        if (str != null) {
            if (str.equals(ManagerWebServices.NULL_STRING_VALUE)) {
                return j;
            }
            j = Long.valueOf(str).longValue();
        }
        return j;
    }

    @Nullable
    /* renamed from: a */
    public String m4950a(String str, String str2) {
        str = this.f3918b.getString(str, str2);
        return (str == null || str.equals(ManagerWebServices.NULL_STRING_VALUE)) ? str2 : str;
    }

    /* renamed from: a */
    public void m4951a(@Nullable String str) {
        if (str != null && !str.isEmpty() && !str.equals("[]")) {
            Editor edit = this.f3918b.edit();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                edit.putString(str2, jSONObject.getString(str2));
            }
            edit.commit();
        }
    }

    /* renamed from: a */
    public boolean m4952a(String str, boolean z) {
        str = this.f3918b.getString(str, String.valueOf(z));
        if (str != null) {
            if (str.equals(ManagerWebServices.NULL_STRING_VALUE)) {
                return z;
            }
            z = Boolean.valueOf(str).booleanValue();
        }
        return z;
    }
}
