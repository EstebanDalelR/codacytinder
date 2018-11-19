package com.facebook.ads.internal;

import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.c */
public enum C1384c {
    APP_AD(0),
    LINK_AD(1),
    APP_AD_V2(2),
    LINK_AD_V2(3),
    APP_ENGAGEMENT_AD(4),
    AD_CHOICES(5),
    JS_TRIGGER(6),
    JS_TRIGGER_NO_AUTO_IMP_LOGGING(7),
    VIDEO_AD(8),
    INLINE_VIDEO_AD(9),
    BANNER_TO_INTERSTITIAL(10),
    NATIVE_CLOSE_BUTTON(11),
    UNIFIED_LOGGING(16),
    HTTP_LINKS(17);
    
    /* renamed from: o */
    public static final C1384c[] f3761o = null;
    /* renamed from: q */
    private static final String f3762q = null;
    /* renamed from: p */
    private final int f3764p;

    static {
        f3761o = new C1384c[]{LINK_AD_V2, APP_ENGAGEMENT_AD, AD_CHOICES, JS_TRIGGER_NO_AUTO_IMP_LOGGING, NATIVE_CLOSE_BUTTON, UNIFIED_LOGGING, HTTP_LINKS};
        JSONArray jSONArray = new JSONArray();
        C1384c[] c1384cArr = f3761o;
        int length = c1384cArr.length;
        int i;
        while (i < length) {
            jSONArray.put(c1384cArr[i].m4822a());
            i++;
        }
        f3762q = jSONArray.toString();
    }

    private C1384c(int i) {
        this.f3764p = i;
    }

    /* renamed from: b */
    public static String m4821b() {
        return f3762q;
    }

    /* renamed from: a */
    public int m4822a() {
        return this.f3764p;
    }

    public String toString() {
        return String.valueOf(this.f3764p);
    }
}
