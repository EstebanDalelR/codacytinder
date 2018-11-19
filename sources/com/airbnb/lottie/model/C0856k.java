package com.airbnb.lottie.model;

import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import org.json.JSONArray;

/* renamed from: com.airbnb.lottie.model.k */
public class C0856k {
    /* renamed from: a */
    private final float f2227a;
    /* renamed from: b */
    private final float f2228b;

    /* renamed from: com.airbnb.lottie.model.k$a */
    public static class C2996a implements Factory<C0856k> {
        /* renamed from: a */
        public static final C2996a f9307a = new C2996a();

        public /* synthetic */ Object valueFromObject(Object obj, float f) {
            return m11583a(obj, f);
        }

        private C2996a() {
        }

        /* renamed from: a */
        public C0856k m11583a(Object obj, float f) {
            JSONArray jSONArray = (JSONArray) obj;
            return new C0856k((((float) jSONArray.optDouble(0, 1.0d)) / 100.0f) * f, (((float) jSONArray.optDouble(1, 1.0d)) / 1120403456) * f);
        }
    }

    public C0856k(float f, float f2) {
        this.f2227a = f;
        this.f2228b = f2;
    }

    public C0856k() {
        this(1.0f, 1.0f);
    }

    /* renamed from: a */
    public float m2932a() {
        return this.f2227a;
    }

    /* renamed from: b */
    public float m2933b() {
        return this.f2228b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m2932a());
        stringBuilder.append("x");
        stringBuilder.append(m2933b());
        return stringBuilder.toString();
    }
}
