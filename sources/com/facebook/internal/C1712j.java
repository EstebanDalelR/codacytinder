package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.C1652c;
import com.facebook.appevents.internal.C1653d;
import com.facebook.internal.C1709i.C1708a;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.j */
public final class C1712j {
    /* renamed from: a */
    private static final String f4739a = C1712j.class.getCanonicalName();
    /* renamed from: b */
    private static final String[] f4740b = new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "gdpv4_chrome_custom_tabs_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url"};
    /* renamed from: c */
    private static Map<String, C1709i> f4741c = new ConcurrentHashMap();
    /* renamed from: d */
    private static AtomicBoolean f4742d = new AtomicBoolean(false);
    /* renamed from: e */
    private static boolean f4743e = false;

    /* renamed from: a */
    public static void m5911a() {
        final Context e = FacebookSdk.m3994e();
        final String i = FacebookSdk.m3998i();
        boolean compareAndSet = f4742d.compareAndSet(false, true);
        if (!(Utility.m5785a(i) || f4741c.containsKey(i))) {
            if (compareAndSet) {
                final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{i});
                FacebookSdk.m3990c().execute(new Runnable() {
                    public void run() {
                        SharedPreferences sharedPreferences = e.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                        C1709i c1709i = null;
                        String string = sharedPreferences.getString(format, null);
                        if (!Utility.m5785a(string)) {
                            JSONObject jSONObject;
                            try {
                                jSONObject = new JSONObject(string);
                            } catch (Exception e) {
                                Utility.m5777a("FacebookSDK", e);
                                jSONObject = null;
                            }
                            if (jSONObject != null) {
                                c1709i = C1712j.m5914b(i, jSONObject);
                            }
                        }
                        JSONObject b = C1712j.m5919c(i);
                        if (b != null) {
                            C1712j.m5914b(i, b);
                            sharedPreferences.edit().putString(format, b.toString()).apply();
                        }
                        if (c1709i != null) {
                            String k = c1709i.m5906k();
                            if (!(C1712j.f4743e || k == null || k.length() <= 0)) {
                                C1712j.f4743e = true;
                                Log.w(C1712j.f4739a, k);
                            }
                        }
                        C1652c.m5601a();
                        C1712j.m5916b(e);
                        C1712j.f4742d.set(false);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static C1709i m5907a(String str) {
        return str != null ? (C1709i) f4741c.get(str) : null;
    }

    /* renamed from: a */
    public static C1709i m5909a(String str, boolean z) {
        if (!z && f4741c.containsKey(str)) {
            return (C1709i) f4741c.get(str);
        }
        z = C1712j.m5919c(str);
        if (z) {
            return C1712j.m5914b(str, z);
        }
        return null;
    }

    /* renamed from: b */
    private static C1709i m5914b(String str, JSONObject jSONObject) {
        C1705f a;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            a = C1705f.m5881a();
        } else {
            a = C1705f.m5882a(optJSONArray);
        }
        C1705f c1705f = a;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        C1709i c1709i = new C1709i(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optBoolean("gdpv4_chrome_custom_tabs_enabled", false), jSONObject2.optInt("app_events_session_timeout", C1653d.m5607a()), SmartLoginOption.parseOptions(jSONObject2.optLong("seamless_login")), C1712j.m5910a(jSONObject2.optJSONObject("android_dialog_configs")), (optInt & 8) != 0, c1705f, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), (optInt & 16) != 0, jSONObject2.optString("sdk_update_message"));
        f4741c.put(str, c1709i);
        return c1709i;
    }

    /* renamed from: c */
    private static JSONObject m5919c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ManagerWebServices.FB_PARAM_BATCH_FIELDS, TextUtils.join(",", new ArrayList(Arrays.asList(f4740b))));
        str = GraphRequest.m4012a(null, str, null);
        str.m4057a(true);
        str.m4051a(bundle);
        return str.m4065i().m4093b();
    }

    /* renamed from: a */
    private static Map<String, Map<String, C1708a>> m5910a(JSONObject jSONObject) {
        Map hashMap = new HashMap();
        if (jSONObject != null) {
            jSONObject = jSONObject.optJSONArray(ManagerWebServices.FB_DATA);
            if (jSONObject != null) {
                for (int i = 0; i < jSONObject.length(); i++) {
                    C1708a a = C1708a.m5889a(jSONObject.optJSONObject(i));
                    if (a != null) {
                        String a2 = a.m5891a();
                        Map map = (Map) hashMap.get(a2);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(a2, map);
                        }
                        map.put(a.m5892b(), a);
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private static void m5916b(final Context context) {
        CallbackManagerImpl.m13080a(RequestCodeOffset.InAppPurchase.toRequestCode(), new Callback() {
            public boolean onActivityResult(final int i, final Intent intent) {
                FacebookSdk.m3990c().execute(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ C34162 f4738c;

                    public void run() {
                        C1652c.m5603a(context, i, intent);
                    }
                });
                return true;
            }
        });
    }
}
