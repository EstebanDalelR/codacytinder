package com.facebook.appevents;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C1738r;
import com.facebook.internal.Utility;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

class AppEvent implements Serializable {
    /* renamed from: a */
    private static final HashSet<String> f4498a = new HashSet();
    private static final long serialVersionUID = 1;
    /* renamed from: b */
    private final JSONObject f4499b;
    /* renamed from: c */
    private final boolean f4500c;
    /* renamed from: d */
    private final String f4501d;
    /* renamed from: e */
    private final String f4502e;

    static class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        /* renamed from: a */
        private final String f4493a;
        /* renamed from: b */
        private final boolean f4494b;

        private Object readResolve() throws JSONException {
            return new AppEvent(this.f4493a, this.f4494b, null);
        }
    }

    static class SerializationProxyV2 implements Serializable {
        private static final long serialVersionUID = 20160803001L;
        /* renamed from: a */
        private final String f4495a;
        /* renamed from: b */
        private final boolean f4496b;
        /* renamed from: c */
        private final String f4497c;

        private SerializationProxyV2(String str, boolean z, String str2) {
            this.f4495a = str;
            this.f4496b = z;
            this.f4497c = str2;
        }

        private Object readResolve() throws JSONException {
            return new AppEvent(this.f4495a, this.f4496b, this.f4497c);
        }
    }

    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, @Nullable UUID uuid) throws JSONException, FacebookException {
        this.f4499b = m5512a(str, str2, d, bundle, z, uuid);
        this.f4500c = z;
        this.f4501d = str2;
        this.f4502e = m5515e();
    }

    /* renamed from: a */
    public String m5516a() {
        return this.f4501d;
    }

    private AppEvent(String str, boolean z, String str2) throws JSONException {
        this.f4499b = new JSONObject(str);
        this.f4500c = z;
        this.f4501d = this.f4499b.optString("_eventName");
        this.f4502e = str2;
    }

    /* renamed from: b */
    public boolean m5517b() {
        return this.f4500c;
    }

    /* renamed from: c */
    public JSONObject m5518c() {
        return this.f4499b;
    }

    /* renamed from: d */
    public boolean m5519d() {
        if (this.f4502e == null) {
            return true;
        }
        return m5515e().equals(this.f4502e);
    }

    /* renamed from: a */
    private static void m5513a(String str) throws FacebookException {
        if (!(str == null || str.length() == 0)) {
            if (str.length() <= 40) {
                boolean contains;
                synchronized (f4498a) {
                    contains = f4498a.contains(str);
                }
                if (!contains) {
                    if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
                        synchronized (f4498a) {
                            f4498a.add(str);
                        }
                        return;
                    }
                    throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
                }
                return;
            }
        }
        if (str == null) {
            str = "<None Provided>";
        }
        throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, Integer.valueOf(40)}));
    }

    /* renamed from: a */
    private static JSONObject m5512a(String str, String str2, Double d, Bundle bundle, boolean z, @Nullable UUID uuid) throws FacebookException, JSONException {
        m5513a(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", m5514b(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (z) {
            jSONObject.put("_implicitlyLogged", "1");
        }
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                m5513a(str3);
                Object obj = bundle.get(str3);
                if ((obj instanceof String) || (obj instanceof Number)) {
                    jSONObject.put(str3, obj.toString());
                } else {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str3}));
                }
            }
        }
        if (!z) {
            C1738r.m5979a(LoggingBehavior.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    private Object writeReplace() {
        return new SerializationProxyV2(this.f4499b.toString(), this.f4500c, this.f4502e);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.f4499b.optString("_eventName"), Boolean.valueOf(this.f4500c), this.f4499b.toString()});
    }

    /* renamed from: e */
    private String m5515e() {
        if (VERSION.SDK_INT > 19) {
            return m5514b(this.f4499b.toString());
        }
        Object arrayList = new ArrayList();
        Iterator keys = this.f4499b.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            stringBuilder.append(str);
            stringBuilder.append(" = ");
            stringBuilder.append(this.f4499b.optString(str));
            stringBuilder.append('\n');
        }
        return m5514b(stringBuilder.toString());
    }

    /* renamed from: b */
    private static String m5514b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            str = str.getBytes("UTF-8");
            instance.update(str, 0, str.length);
            return m5511a(instance.digest());
        } catch (Exception e) {
            Utility.m5777a("Failed to generate checksum: ", e);
            return "0";
        } catch (Exception e2) {
            Utility.m5777a("Failed to generate checksum: ", e2);
            return "1";
        }
    }

    /* renamed from: a */
    private static String m5511a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }
}
