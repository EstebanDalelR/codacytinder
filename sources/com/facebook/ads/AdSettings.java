package com.facebook.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1490h.C1489a;
import com.facebook.ads.internal.p047k.C1509v;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

public class AdSettings {
    public static final boolean DEBUG = false;
    /* renamed from: a */
    static volatile boolean f3495a = false;
    /* renamed from: b */
    private static final String f3496b = "AdSettings";
    /* renamed from: c */
    private static final Collection<String> f3497c = new HashSet();
    /* renamed from: d */
    private static final Collection<String> f3498d = new HashSet();
    /* renamed from: e */
    private static boolean f3499e;
    /* renamed from: f */
    private static boolean f3500f;
    /* renamed from: g */
    private static String f3501g;
    /* renamed from: h */
    private static boolean f3502h;
    /* renamed from: i */
    private static String f3503i;
    /* renamed from: j */
    private static TestAdType f3504j = TestAdType.DEFAULT;

    public enum TestAdType {
        DEFAULT("DEFAULT", "Default"),
        IMG_16_9_APP_INSTALL("IMG_16_9_APP_INSTALL", "Image App install"),
        IMG_16_9_LINK("IMG_16_9_LINK", "Image link"),
        VIDEO_HD_16_9_46S_APP_INSTALL("VID_HD_16_9_46S_APP_INSTALL", "Video 46 sec App install"),
        VIDEO_HD_16_9_46S_LINK("VID_HD_16_9_46S_LINK", "Video 46 sec link"),
        VIDEO_HD_16_9_15S_APP_INSTALL("VID_HD_16_9_15S_APP_INSTALL", "Video 15 sec App install"),
        VIDEO_HD_16_9_15S_LINK("VID_HD_16_9_15S_LINK", "Video 15 sec link"),
        VIDEO_HD_9_16_39S_APP_INSTALL("VID_HD_9_16_39S_APP_INSTALL", "Video 39 sec App install"),
        VIDEO_HD_9_16_39S_LINK("VID_HD_9_16_39S_LINK", "Video 39 sec link"),
        CAROUSEL_IMG_SQUARE_APP_INSTALL("CAROUSEL_IMG_SQUARE_APP_INSTALL", "Carousel App install"),
        CAROUSEL_IMG_SQUARE_LINK("CAROUSEL_IMG_SQUARE_LINK", "Carousel link");
        
        /* renamed from: a */
        private final String f3493a;
        /* renamed from: b */
        private final String f3494b;

        private TestAdType(String str, String str2) {
            this.f3493a = str;
            this.f3494b = str2;
        }

        public String getAdTypeString() {
            return this.f3493a;
        }

        public String getHumanReadable() {
            return this.f3494b;
        }
    }

    static {
        f3498d.add("sdk");
        f3498d.add("google_sdk");
        f3498d.add("vbox86p");
        f3498d.add("vbox86tp");
    }

    /* renamed from: a */
    private static void m4653a(String str) {
        if (!f3495a) {
            f3495a = true;
            String str2 = f3496b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Test mode device hash: ");
            stringBuilder.append(str);
            Log.d(str2, stringBuilder.toString());
            str2 = f3496b;
            stringBuilder = new StringBuilder();
            stringBuilder.append("When testing your app with Facebook's ad units you must specify the device hashed ID to ensure the delivery of test ads, add the following code before loading an ad: AdSettings.addTestDevice(\"");
            stringBuilder.append(str);
            stringBuilder.append("\");");
            Log.d(str2, stringBuilder.toString());
        }
    }

    public static void addTestDevice(String str) {
        f3497c.add(str);
    }

    public static void addTestDevices(Collection<String> collection) {
        f3497c.addAll(collection);
    }

    public static void clearTestDevices() {
        f3497c.clear();
    }

    public static String getMediationService() {
        return f3501g;
    }

    public static TestAdType getTestAdType() {
        return f3504j;
    }

    public static String getUrlPrefix() {
        return AdInternalSettings.getUrlPrefix();
    }

    public static boolean isChildDirected() {
        return f3502h;
    }

    public static boolean isTestMode(Context context) {
        if (AdInternalSettings.isTestMode() || f3498d.contains(Build.PRODUCT)) {
            return true;
        }
        if (f3503i == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("FBAdPrefs", 0);
            f3503i = sharedPreferences.getString("deviceIdHash", null);
            if (TextUtils.isEmpty(f3503i)) {
                C1489a a = C1490h.m5237a(context.getContentResolver());
                String uuid = !TextUtils.isEmpty(a.f4121b) ? a.f4121b : !TextUtils.isEmpty(a.f4120a) ? a.f4120a : UUID.randomUUID().toString();
                f3503i = C1509v.m5307a(uuid);
                sharedPreferences.edit().putString("deviceIdHash", f3503i).apply();
            }
        }
        if (f3497c.contains(f3503i)) {
            return true;
        }
        m4653a(f3503i);
        return false;
    }

    public static boolean isVideoAutoplay() {
        return f3499e;
    }

    public static boolean isVideoAutoplayOnMobile() {
        return f3500f;
    }

    public static void setIsChildDirected(boolean z) {
        f3502h = z;
    }

    public static void setMediationService(String str) {
        f3501g = str;
    }

    public static void setTestAdType(TestAdType testAdType) {
        f3504j = testAdType;
    }

    public static void setUrlPrefix(String str) {
        AdInternalSettings.setUrlPrefix(str);
    }

    public static void setVideoAutoplay(boolean z) {
        f3499e = z;
    }

    public static void setVideoAutoplayOnMobile(boolean z) {
        f3500f = z;
    }
}
