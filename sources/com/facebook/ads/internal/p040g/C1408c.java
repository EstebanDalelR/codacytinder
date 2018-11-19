package com.facebook.ads.internal.p040g;

import com.facebook.ads.internal.protocol.C1522c;

/* renamed from: com.facebook.ads.internal.g.c */
public enum C1408c {
    UNKNOWN,
    BANNER,
    INTERSTITIAL,
    NATIVE,
    REWARDED_VIDEO;

    /* renamed from: a */
    public static C1408c m4894a(C1522c c1522c) {
        switch (c1522c) {
            case NATIVE_UNKNOWN:
                return NATIVE;
            case WEBVIEW_BANNER_50:
            case WEBVIEW_BANNER_90:
            case WEBVIEW_BANNER_LEGACY:
            case WEBVIEW_BANNER_250:
                return BANNER;
            case WEBVIEW_INTERSTITIAL_HORIZONTAL:
            case WEBVIEW_INTERSTITIAL_VERTICAL:
            case WEBVIEW_INTERSTITIAL_TABLET:
            case WEBVIEW_INTERSTITIAL_UNKNOWN:
                return INTERSTITIAL;
            case REWARDED_VIDEO:
                return REWARDED_VIDEO;
            default:
                return UNKNOWN;
        }
    }
}
