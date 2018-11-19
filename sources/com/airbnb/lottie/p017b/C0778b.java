package com.airbnb.lottie.p017b;

import android.graphics.PointF;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.b.b */
public class C0778b {
    /* renamed from: a */
    public static PointF m2741a(JSONObject jSONObject, float f) {
        return new PointF(C0778b.m2739a(jSONObject.opt("x")) * f, C0778b.m2739a(jSONObject.opt("y")) * f);
    }

    /* renamed from: a */
    public static PointF m2740a(JSONArray jSONArray, float f) {
        if (jSONArray.length() >= 2) {
            return new PointF(((float) jSONArray.optDouble(0, 1.0d)) * f, ((float) jSONArray.optDouble(1, 1.0d)) * f);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to parse point for ");
        stringBuilder.append(jSONArray);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static float m2739a(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof Integer) {
            return (float) ((Integer) obj).intValue();
        }
        if (obj instanceof Double) {
            return (float) ((Double) obj).doubleValue();
        }
        return obj instanceof JSONArray ? (float) ((JSONArray) obj).optDouble(0) : null;
    }
}
