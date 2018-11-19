package com.facebook.ads.internal.settings;

public class AdInternalSettings {
    /* renamed from: a */
    private static boolean f4290a;
    /* renamed from: b */
    private static boolean f4291b;
    /* renamed from: c */
    private static String f4292c;

    public static String getUrlPrefix() {
        return f4292c;
    }

    public static boolean isTestMode() {
        return f4290a;
    }

    public static boolean isVisibleAnimation() {
        return f4291b;
    }

    public static void setTestMode(boolean z) {
        f4290a = z;
    }

    public static void setUrlPrefix(String str) {
        f4292c = str;
    }

    public static void setVisibleAnimation(boolean z) {
        f4291b = z;
    }
}
