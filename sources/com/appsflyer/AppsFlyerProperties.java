package com.appsflyer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import com.appsflyer.AFLogger.LogLevel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AppsFlyerProperties {
    /* renamed from: a */
    private static AppsFlyerProperties f2395a = new AppsFlyerProperties();
    /* renamed from: b */
    private Map<String, Object> f2396b = new HashMap();
    /* renamed from: c */
    private boolean f2397c;
    /* renamed from: d */
    private boolean f2398d;
    /* renamed from: e */
    private String f2399e;
    /* renamed from: f */
    private boolean f2400f = false;

    public enum EmailsCryptType {
        NONE(0),
        SHA1(1),
        MD5(2),
        SHA256(3);
        
        private final int value;

        private EmailsCryptType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    private AppsFlyerProperties() {
    }

    /* renamed from: a */
    public static AppsFlyerProperties m3086a() {
        return f2395a;
    }

    /* renamed from: a */
    public void m3092a(String str, String str2) {
        this.f2396b.put(str, str2);
    }

    /* renamed from: a */
    public void m3093a(String str, boolean z) {
        this.f2396b.put(str, Boolean.toString(z));
    }

    /* renamed from: a */
    public String m3090a(String str) {
        return (String) this.f2396b.get(str);
    }

    /* renamed from: b */
    public boolean m3098b(String str, boolean z) {
        str = m3090a(str);
        if (str == null) {
            return z;
        }
        return Boolean.valueOf(str).booleanValue();
    }

    /* renamed from: b */
    int m3095b() {
        return m3088a("logLevel", LogLevel.NONE.getLevel());
    }

    /* renamed from: a */
    public int m3088a(String str, int i) {
        str = m3090a(str);
        if (str == null) {
            return i;
        }
        return Integer.valueOf(str).intValue();
    }

    /* renamed from: c */
    protected void m3099c() {
        this.f2397c = true;
    }

    /* renamed from: d */
    protected boolean m3100d() {
        return this.f2398d;
    }

    /* renamed from: a */
    protected void m3094a(boolean z) {
        this.f2398d = z;
    }

    /* renamed from: e */
    protected void m3101e() {
        this.f2398d = true;
    }

    /* renamed from: b */
    protected void m3097b(String str) {
        m3092a("AF_REFERRER", str);
        this.f2399e = str;
    }

    /* renamed from: a */
    public String m3089a(Context context) {
        if (this.f2399e != null) {
            return this.f2399e;
        }
        if (m3090a("AF_REFERRER") != null) {
            return m3090a("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("appsflyer-data", 0).getString("referrer", null);
    }

    /* renamed from: f */
    public boolean m3102f() {
        return m3098b("disableLogs", false);
    }

    /* renamed from: g */
    public boolean m3103g() {
        return m3098b("disableOtherSdk", false);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public void m3091a(SharedPreferences sharedPreferences) {
        String jSONObject = new JSONObject(this.f2396b).toString();
        sharedPreferences = sharedPreferences.edit();
        sharedPreferences.putString("savedProperties", jSONObject);
        if (VERSION.SDK_INT >= 9) {
            sharedPreferences.apply();
        } else {
            sharedPreferences.commit();
        }
    }

    /* renamed from: b */
    public void m3096b(Context context) {
        if (!m3087h()) {
            context = context.getSharedPreferences("appsflyer-data", 0).getString("savedProperties", null);
            if (context != null) {
                AFLogger.m3080c("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(context);
                    context = jSONObject.keys();
                    while (context.hasNext()) {
                        String str = (String) context.next();
                        if (this.f2396b.get(str) == null) {
                            this.f2396b.put(str, jSONObject.getString(str));
                        }
                    }
                    this.f2400f = true;
                } catch (Throwable e) {
                    AFLogger.m3073a("Failed loading properties", e);
                }
                context = new StringBuilder("Done loading properties: ");
                context.append(this.f2400f);
                AFLogger.m3080c(context.toString());
            }
        }
    }

    /* renamed from: h */
    private boolean m3087h() {
        return this.f2400f;
    }
}
