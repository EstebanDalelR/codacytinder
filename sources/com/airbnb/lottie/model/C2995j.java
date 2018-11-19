package com.airbnb.lottie.model;

import android.graphics.PointF;
import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import com.airbnb.lottie.p017b.C0778b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.j */
public class C2995j implements Factory<PointF> {
    /* renamed from: a */
    public static final C2995j f9306a = new C2995j();

    public /* synthetic */ Object valueFromObject(Object obj, float f) {
        return m11582a(obj, f);
    }

    private C2995j() {
    }

    /* renamed from: a */
    public PointF m11582a(Object obj, float f) {
        if (obj instanceof JSONArray) {
            return C0778b.m2740a((JSONArray) obj, f);
        }
        if (obj instanceof JSONObject) {
            return C0778b.m2741a((JSONObject) obj, f);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to parse point from ");
        stringBuilder.append(obj);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
