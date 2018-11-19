package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C2968g;
import com.airbnb.lottie.animation.keyframe.C2968g.C0775a;
import com.airbnb.lottie.animation.keyframe.C2971m;
import com.airbnb.lottie.animation.keyframe.C4063h;
import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import com.airbnb.lottie.model.animatable.C4068b.C0803a;
import com.airbnb.lottie.p017b.C0778b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.e */
public class C2980e implements AnimatableValue<PointF, PointF> {
    /* renamed from: a */
    private final List<C2968g> f9226a;
    /* renamed from: b */
    private PointF f9227b;

    /* renamed from: com.airbnb.lottie.model.animatable.e$a */
    private static class C2979a implements Factory<PointF> {
        /* renamed from: a */
        private static final Factory<PointF> f9225a = new C2979a();

        public /* synthetic */ Object valueFromObject(Object obj, float f) {
            return m11503a(obj, f);
        }

        private C2979a() {
        }

        /* renamed from: a */
        public PointF m11503a(Object obj, float f) {
            return C0778b.m2740a((JSONArray) obj, f);
        }
    }

    /* renamed from: a */
    public static AnimatableValue<PointF, PointF> m11504a(JSONObject jSONObject, C0788c c0788c) {
        if (jSONObject.has("k")) {
            return new C2980e(jSONObject.opt("k"), c0788c);
        }
        return new C2981i(C0803a.m2870a(jSONObject.optJSONObject("x"), c0788c), C0803a.m2870a(jSONObject.optJSONObject("y"), c0788c));
    }

    C2980e() {
        this.f9226a = new ArrayList();
        this.f9227b = new PointF(0.0f, 0.0f);
    }

    C2980e(Object obj, C0788c c0788c) {
        this.f9226a = new ArrayList();
        if (m11505a(obj)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                this.f9226a.add(C0775a.m2728a(jSONArray.optJSONObject(i), c0788c, C2979a.f9225a));
            }
            C0768a.m2707a(this.f9226a);
            return;
        }
        this.f9227b = C0778b.m2740a((JSONArray) obj, c0788c.m2812n());
    }

    /* renamed from: a */
    private boolean m11505a(Object obj) {
        boolean z = false;
        if (!(obj instanceof JSONArray)) {
            return false;
        }
        obj = ((JSONArray) obj).opt(0);
        if ((obj instanceof JSONObject) && ((JSONObject) obj).has("t") != null) {
            z = true;
        }
        return z;
    }

    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        if (hasAnimation()) {
            return new C4063h(this.f9226a);
        }
        return new C2971m(this.f9227b);
    }

    public boolean hasAnimation() {
        return this.f9226a.isEmpty() ^ 1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("initialPoint=");
        stringBuilder.append(this.f9227b);
        return stringBuilder.toString();
    }
}
