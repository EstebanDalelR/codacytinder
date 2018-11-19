package com.facebook.ads.internal.server;

import android.text.TextUtils;
import com.facebook.ads.AdSettings;

/* renamed from: com.facebook.ads.internal.server.b */
public class C1528b {
    /* renamed from: a */
    public static String m5383a() {
        if (TextUtils.isEmpty(AdSettings.getUrlPrefix())) {
            return "https://graph.facebook.com/network_ads_common";
        }
        return String.format("https://graph.%s.facebook.com/network_ads_common", new Object[]{AdSettings.getUrlPrefix()});
    }

    /* renamed from: b */
    public static String m5384b() {
        if (TextUtils.isEmpty(AdSettings.getUrlPrefix())) {
            return "https://www.facebook.com/adnw_logging/";
        }
        return String.format("https://www.%s.facebook.com/adnw_logging/", new Object[]{AdSettings.getUrlPrefix()});
    }
}
