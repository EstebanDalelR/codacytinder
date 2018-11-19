package com.facebook.ads.internal.p047k;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.util.Log;
import android.view.Window;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.k.ap */
public class ap {
    /* renamed from: a */
    private static final String f4093a = "ap";

    private ap() {
    }

    /* renamed from: a */
    public static Map<String, String> m5208a(Context context) {
        Map<String, String> hashMap = new HashMap();
        try {
            String str;
            String str2;
            hashMap.put("kgr", String.valueOf(ap.m5210b(context)));
            if (context == null || !(context instanceof Activity)) {
                str = f4093a;
                str2 = "Invalid Activity context in window interactive check, assuming interactive.";
            } else {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    int i = window.getAttributes().flags;
                    hashMap.put("wt", Integer.toString(window.getAttributes().type));
                    hashMap.put("wfdkg", (4194304 & i) > 0 ? "1" : "0");
                    hashMap.put("wfswl", (524288 & i) > 0 ? "1" : "0");
                    return hashMap;
                }
                str = f4093a;
                str2 = "Invalid window in window interactive check, assuming interactive.";
            }
            Log.v(str, str2);
            return hashMap;
        } catch (Exception e) {
            Log.e(f4093a, "Exception in window info check", e);
            C1502p.m5285a(e, context);
            return hashMap;
        }
    }

    /* renamed from: a */
    public static boolean m5209a(Map<String, String> map) {
        boolean z = false;
        if (map != null) {
            if (!map.isEmpty()) {
                String str = (String) map.get("wfdkg");
                String str2 = (String) map.get("wfswl");
                if ((str != null && str.equals("1")) || (str2 != null && str2.equals("1"))) {
                    return false;
                }
                String str3 = (String) map.get("kgr");
                if (str3 != null && str3.equals("true")) {
                    z = true;
                }
                return z;
            }
        }
        Log.v(f4093a, "Invalid Window info in window interactive check, assuming not obstructed by Keyguard.");
        return false;
    }

    /* renamed from: b */
    public static boolean m5210b(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }

    /* renamed from: b */
    public static boolean m5211b(Map<String, String> map) {
        if (map != null) {
            if (!map.isEmpty()) {
                String str = (String) map.get("wfdkg");
                String str2 = (String) map.get("wfswl");
                String str3 = (String) map.get("kgr");
                return str != null && str.equals("1") && str2 != null && str2.equals("1") && str3 != null && str3.equals("true");
            }
        }
        Log.v(f4093a, "Invalid Window info in window interactive check, assuming is not a Lockscreen.");
        return false;
    }

    /* renamed from: c */
    public static boolean m5212c(Context context) {
        return ap.m5209a(ap.m5208a(context)) ^ 1;
    }
}
