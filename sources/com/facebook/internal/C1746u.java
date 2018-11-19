package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.u */
class C1746u {
    /* renamed from: a */
    private static final ConcurrentHashMap<String, JSONObject> f4822a = new ConcurrentHashMap();

    /* renamed from: a */
    public static JSONObject m6051a(String str) {
        return (JSONObject) f4822a.get(str);
    }

    /* renamed from: a */
    public static void m6052a(String str, JSONObject jSONObject) {
        f4822a.put(str, jSONObject);
    }
}
