package com.facebook.internal;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.util.Collection;

/* renamed from: com.facebook.internal.v */
public final class C1747v {
    /* renamed from: a */
    public static final Collection<String> f4823a = Utility.m5765a("service_disabled", "AndroidAuthKillSwitchException");
    /* renamed from: b */
    public static final Collection<String> f4824b = Utility.m5765a("access_denied", "OAuthAccessDeniedException");
    /* renamed from: c */
    private static final String f4825c = "com.facebook.internal.v";

    /* renamed from: d */
    public static final String m6057d() {
        return "v3.0";
    }

    /* renamed from: a */
    public static final String m6054a() {
        return String.format("m.%s", new Object[]{FacebookSdk.m3992d()});
    }

    /* renamed from: b */
    public static final String m6055b() {
        return String.format("https://graph.%s", new Object[]{FacebookSdk.m3992d()});
    }

    /* renamed from: c */
    public static final String m6056c() {
        return String.format("https://graph-video.%s", new Object[]{FacebookSdk.m3992d()});
    }

    /* renamed from: a */
    public static Bundle m6053a(String str, int i, Bundle bundle) {
        String d = FacebookSdk.m3993d(FacebookSdk.m3994e());
        if (Utility.m5785a(d)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("android_key_hash", d);
        bundle2.putString("app_id", FacebookSdk.m3998i());
        bundle2.putInt("version", i);
        bundle2.putString("display", "touch");
        Bundle bundle3 = new Bundle();
        bundle3.putString("action_id", str);
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            str = BundleJSONConverter.m5710a(bundle3);
            i = BundleJSONConverter.m5710a(bundle);
            if (str != null) {
                if (i != 0) {
                    bundle2.putString("bridge_args", str.toString());
                    bundle2.putString("method_args", i.toString());
                    return bundle2;
                }
            }
            return null;
        } catch (String str2) {
            LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
            d = f4825c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error creating Url -- ");
            stringBuilder.append(str2);
            C1738r.m5976a(loggingBehavior, 6, d, stringBuilder.toString());
            bundle2 = null;
        }
    }
}
