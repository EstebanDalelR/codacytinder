package com.facebook.ads.internal.protocol;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: com.facebook.ads.internal.protocol.c */
public enum C1522c {
    UNKNOWN(0),
    WEBVIEW_BANNER_LEGACY(4),
    WEBVIEW_BANNER_50(5),
    WEBVIEW_BANNER_90(6),
    WEBVIEW_BANNER_250(7),
    WEBVIEW_INTERSTITIAL_UNKNOWN(100),
    WEBVIEW_INTERSTITIAL_HORIZONTAL(101),
    WEBVIEW_INTERSTITIAL_VERTICAL(102),
    WEBVIEW_INTERSTITIAL_TABLET(103),
    NATIVE_UNKNOWN(Callback.DEFAULT_DRAG_ANIMATION_DURATION),
    REWARDED_VIDEO(400),
    NATIVE_250(201),
    INSTREAM_VIDEO(MapboxConstants.ANIMATION_DURATION);
    
    /* renamed from: n */
    private final int f4264n;

    private C1522c(int i) {
        this.f4264n = i;
    }

    /* renamed from: a */
    public int m5362a() {
        return this.f4264n;
    }
}
