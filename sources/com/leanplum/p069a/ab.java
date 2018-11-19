package com.leanplum.p069a;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.ab */
public class ab {
    /* renamed from: a */
    public final String f7891a;
    /* renamed from: b */
    public boolean f7892b;

    /* renamed from: a */
    public static String m9450a(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        try {
            return ab.m9457b((Map) map).toString();
        } catch (JSONException e) {
            Object[] objArr = new Object[2];
            StringBuilder stringBuilder = new StringBuilder("Error converting ");
            stringBuilder.append(map);
            stringBuilder.append(" to JSON");
            objArr[0] = stringBuilder.toString();
            objArr[1] = e;
            ao.m9516a(objArr);
            return null;
        }
    }

    /* renamed from: a */
    public static Map<String, Object> m9452a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return ab.m9453a(new JSONObject(str));
        } catch (JSONException e) {
            Object[] objArr = new Object[2];
            StringBuilder stringBuilder = new StringBuilder("Error converting ");
            stringBuilder.append(str);
            stringBuilder.append(" from JSON");
            objArr[0] = stringBuilder.toString();
            objArr[1] = e;
            ao.m9516a(objArr);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m9457b(Map<String, ?> map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = ab.m9457b((Map) value);
            } else if (value instanceof Iterable) {
                value = ab.m9454a((Iterable) value);
            } else if (value instanceof Editable) {
                value = value.toString();
            } else if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(str, value);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONArray m9454a(Iterable<?> iterable) throws JSONException {
        if (iterable == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object next : iterable) {
            Object next2;
            if (next2 instanceof Map) {
                next2 = ab.m9457b((Map) next2);
            } else if (next2 instanceof Iterable) {
                next2 = ab.m9454a((Iterable) next2);
            } else if (next2 == null) {
                next2 = JSONObject.NULL;
            }
            jSONArray.put(next2);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static <T> Map<String, T> m9453a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Map<String, T> hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object opt = jSONObject.opt(str);
            if (opt != null) {
                if (opt != JSONObject.NULL) {
                    if (opt instanceof JSONObject) {
                        opt = ab.m9453a((JSONObject) opt);
                    } else if (opt instanceof JSONArray) {
                        opt = ab.m9451a((JSONArray) opt);
                    } else if (!JSONObject.NULL.equals(opt)) {
                    }
                    hashMap.put(str, opt);
                }
            }
            opt = null;
            hashMap.put(str, opt);
        }
        return hashMap;
    }

    /* renamed from: b */
    public static <T> Map<String, T> m9456b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new HashMap();
        }
        return ab.m9453a(jSONObject);
    }

    /* renamed from: a */
    public static <T> List<T> m9451a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            Object opt = jSONArray.opt(i);
            if (opt != null) {
                if (opt != JSONObject.NULL) {
                    if (opt instanceof JSONObject) {
                        opt = ab.m9453a((JSONObject) opt);
                    } else if (opt instanceof JSONArray) {
                        opt = ab.m9451a((JSONArray) opt);
                    } else if (!JSONObject.NULL.equals(opt)) {
                    }
                    arrayList.add(opt);
                }
            }
            opt = null;
            arrayList.add(opt);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static <T> List<T> m9455b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        return ab.m9451a(jSONArray);
    }

    public ab(String str) {
        this.f7891a = str;
    }

    public ab(String str, boolean z) {
        this.f7891a = str;
        this.f7892b = z;
    }
}
