package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectArguments.C4218a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CameraEffectJSONUtility {
    /* renamed from: a */
    private static final Map<Class<?>, Setter> f4967a = new HashMap();

    public interface Setter {
        void setOnArgumentsBuilder(C4218a c4218a, String str, Object obj) throws JSONException;

        void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    /* renamed from: com.facebook.share.internal.CameraEffectJSONUtility$1 */
    static class C34441 implements Setter {
        C34441() {
        }

        public void setOnArgumentsBuilder(C4218a c4218a, String str, Object obj) throws JSONException {
            c4218a.m16708a(str, (String) obj);
        }

        public void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: com.facebook.share.internal.CameraEffectJSONUtility$2 */
    static class C34452 implements Setter {
        C34452() {
        }

        public void setOnArgumentsBuilder(C4218a c4218a, String str, Object obj) throws JSONException {
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

    /* renamed from: com.facebook.share.internal.CameraEffectJSONUtility$3 */
    static class C34463 implements Setter {
        C34463() {
        }

        public void setOnArgumentsBuilder(C4218a c4218a, String str, Object obj) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            String[] strArr = new String[jSONArray.length()];
            int i = 0;
            while (i < jSONArray.length()) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    strArr[i] = (String) obj2;
                    i++;
                } else {
                    str = new StringBuilder();
                    str.append("Unexpected type in an array: ");
                    str.append(obj2.getClass());
                    throw new IllegalArgumentException(str.toString());
                }
            }
            c4218a.m16709a(str, strArr);
        }

        public void setOnJSON(JSONObject jSONObject, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }

    static {
        f4967a.put(String.class, new C34441());
        f4967a.put(String[].class, new C34452());
        f4967a.put(JSONArray.class, new C34463());
    }

    /* renamed from: a */
    public static JSONObject m6260a(CameraEffectArguments cameraEffectArguments) throws JSONException {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.keySet()) {
            Object obj = cameraEffectArguments.get(str);
            if (obj != null) {
                Setter setter = (Setter) f4967a.get(obj.getClass());
                if (setter == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported type: ");
                    stringBuilder.append(obj.getClass());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                setter.setOnJSON(jSONObject, str, obj);
            }
        }
        return jSONObject;
    }
}
