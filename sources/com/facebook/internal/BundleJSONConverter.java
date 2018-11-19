package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BundleJSONConverter {
    /* renamed from: a */
    private static final Map<Class<?>, Setter> f4620a = new HashMap();

    public interface Setter {
        void setOnBundle(Bundle bundle, String str, Object obj) throws JSONException;

        void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    /* renamed from: com.facebook.internal.BundleJSONConverter$1 */
    static class C34021 implements Setter {
        C34021() {
        }

        public void setOnBundle(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }

        public void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: com.facebook.internal.BundleJSONConverter$2 */
    static class C34032 implements Setter {
        C34032() {
        }

        public void setOnBundle(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putInt(str, ((Integer) obj).intValue());
        }

        public void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: com.facebook.internal.BundleJSONConverter$3 */
    static class C34043 implements Setter {
        C34043() {
        }

        public void setOnBundle(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putLong(str, ((Long) obj).longValue());
        }

        public void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: com.facebook.internal.BundleJSONConverter$4 */
    static class C34054 implements Setter {
        C34054() {
        }

        public void setOnBundle(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }

        public void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: com.facebook.internal.BundleJSONConverter$5 */
    static class C34065 implements Setter {
        C34065() {
        }

        public void setOnBundle(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putString(str, (String) obj);
        }

        public void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: com.facebook.internal.BundleJSONConverter$6 */
    static class C34076 implements Setter {
        C34076() {
        }

        public void setOnBundle(Bundle bundle, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }

        public void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            for (Object put : (String[]) obj) {
                jSONArray.put(put);
            }
            jSONObject.put(str, jSONArray);
        }
    }

    /* renamed from: com.facebook.internal.BundleJSONConverter$7 */
    static class C34087 implements Setter {
        C34087() {
        }

        public void setOnBundle(Bundle bundle, String str, Object obj) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i = 0;
            while (i < jSONArray.length()) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                    i++;
                } else {
                    str = new StringBuilder();
                    str.append("Unexpected type in an array: ");
                    str.append(obj2.getClass());
                    throw new IllegalArgumentException(str.toString());
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }

        public void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    static {
        f4620a.put(Boolean.class, new C34021());
        f4620a.put(Integer.class, new C34032());
        f4620a.put(Long.class, new C34043());
        f4620a.put(Double.class, new C34054());
        f4620a.put(String.class, new C34065());
        f4620a.put(String[].class, new C34076());
        f4620a.put(JSONArray.class, new C34087());
    }

    /* renamed from: a */
    public static JSONObject m5710a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (String put : (List) obj) {
                        jSONArray.put(put);
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, m5710a((Bundle) obj));
                } else {
                    Setter setter = (Setter) f4620a.get(obj.getClass());
                    if (setter == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unsupported type: ");
                        stringBuilder.append(obj.getClass());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    setter.setOnJSON(jSONObject, str, obj);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static Bundle m5709a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (obj != null) {
                if (obj != JSONObject.NULL) {
                    if (obj instanceof JSONObject) {
                        bundle.putBundle(str, m5709a((JSONObject) obj));
                    } else {
                        Setter setter = (Setter) f4620a.get(obj.getClass());
                        if (setter == null) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unsupported type: ");
                            stringBuilder.append(obj.getClass());
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        setter.setOnBundle(bundle, str, obj);
                    }
                }
            }
        }
        return bundle;
    }
}
