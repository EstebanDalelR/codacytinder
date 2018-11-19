package com.facebook.internal;

import com.facebook.FacebookRequestError.Category;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.f */
public final class C1705f {
    /* renamed from: g */
    private static C1705f f4707g;
    /* renamed from: a */
    private final Map<Integer, Set<Integer>> f4708a;
    /* renamed from: b */
    private final Map<Integer, Set<Integer>> f4709b;
    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f4710c;
    /* renamed from: d */
    private final String f4711d;
    /* renamed from: e */
    private final String f4712e;
    /* renamed from: f */
    private final String f4713f;

    C1705f(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f4708a = map;
        this.f4709b = map2;
        this.f4710c = map3;
        this.f4711d = str;
        this.f4712e = str2;
        this.f4713f = str3;
    }

    /* renamed from: a */
    public String m5886a(Category category) {
        switch (category) {
            case OTHER:
                return this.f4711d;
            case LOGIN_RECOVERABLE:
                return this.f4713f;
            case TRANSIENT:
                return this.f4712e;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public Category m5885a(int i, int i2, boolean z) {
        if (z) {
            return Category.TRANSIENT;
        }
        Set set;
        if (this.f4708a && this.f4708a.containsKey(Integer.valueOf(i))) {
            set = (Set) this.f4708a.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(i2))) {
                return Category.OTHER;
            }
        }
        if (this.f4710c && this.f4710c.containsKey(Integer.valueOf(i))) {
            set = (Set) this.f4710c.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(i2))) {
                return Category.LOGIN_RECOVERABLE;
            }
        }
        if (this.f4709b && this.f4709b.containsKey(Integer.valueOf(i))) {
            Set set2 = (Set) this.f4709b.get(Integer.valueOf(i));
            if (set2 == null || set2.contains(Integer.valueOf(i2)) != 0) {
                return Category.TRANSIENT;
            }
        }
        return Category.OTHER;
    }

    /* renamed from: a */
    public static synchronized C1705f m5881a() {
        C1705f c1705f;
        synchronized (C1705f.class) {
            if (f4707g == null) {
                f4707g = C1705f.m5884b();
            }
            c1705f = f4707g;
        }
        return c1705f;
    }

    /* renamed from: b */
    private static C1705f m5884b() {
        return new C1705f(null, new FacebookRequestErrorClassification$1(), new FacebookRequestErrorClassification$2(), null, null, null);
    }

    /* renamed from: a */
    private static Map<Integer, Set<Integer>> m5883a(JSONObject jSONObject) {
        jSONObject = jSONObject.optJSONArray("items");
        if (jSONObject.length() == 0) {
            return null;
        }
        Map<Integer, Set<Integer>> hashMap = new HashMap();
        for (int i = 0; i < jSONObject.length(); i++) {
            JSONObject optJSONObject = jSONObject.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("code");
                if (optInt != 0) {
                    Object obj;
                    JSONArray optJSONArray = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        obj = null;
                    } else {
                        obj = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            int optInt2 = optJSONArray.optInt(i2);
                            if (optInt2 != 0) {
                                obj.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), obj);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static C1705f m5882a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        Map map = null;
        Map map2 = map;
        Map map3 = map2;
        String str = map3;
        String str2 = str;
        String str3 = str2;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("name");
                if (optString != null) {
                    if (optString.equalsIgnoreCase("other")) {
                        str = optJSONObject.optString("recovery_message", null);
                        map = C1705f.m5883a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("transient")) {
                        str2 = optJSONObject.optString("recovery_message", null);
                        map2 = C1705f.m5883a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("login_recoverable")) {
                        str3 = optJSONObject.optString("recovery_message", null);
                        map3 = C1705f.m5883a(optJSONObject);
                    }
                }
            }
        }
        return new C1705f(map, map2, map3, str, str2, str3);
    }
}
