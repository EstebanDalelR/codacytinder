package com.spotify.sdk.android.authentication;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

class WebViewUtils {
    WebViewUtils() {
    }

    static void clearFacebookCookies(Context context) {
        clearCookiesForDomain(context, "facebook.com");
        clearCookiesForDomain(context, ".facebook.com");
        clearCookiesForDomain(context, "https://facebook.com");
        clearCookiesForDomain(context, "https://.facebook.com");
    }

    static void clearCookiesForDomain(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        context = CookieManager.getInstance();
        String cookie = context.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(split2[0].trim());
                    stringBuilder.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    context.setCookie(str, stringBuilder.toString());
                }
            }
            context.removeExpiredCookie();
        }
    }
}
