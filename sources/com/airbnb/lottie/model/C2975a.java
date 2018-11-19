package com.airbnb.lottie.model;

import android.graphics.Color;
import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import org.json.JSONArray;

/* renamed from: com.airbnb.lottie.model.a */
public class C2975a implements Factory<Integer> {
    /* renamed from: a */
    public static final C2975a f9221a = new C2975a();

    public /* synthetic */ Object valueFromObject(Object obj, float f) {
        return m11495a(obj, f);
    }

    /* renamed from: a */
    public Integer m11495a(Object obj, float f) {
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray.length() != 4) {
            return Integer.valueOf(-16777216);
        }
        Object obj2 = 1;
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.optDouble(i) > 1.0d) {
                obj2 = null;
            }
        }
        double d = (double) (obj2 != null ? 255.0f : 1.0f);
        return Integer.valueOf(Color.argb((int) (jSONArray.optDouble(3) * d), (int) (jSONArray.optDouble(0.0f) * d), (int) (jSONArray.optDouble(1) * d), (int) (jSONArray.optDouble(2) * d)));
    }
}
