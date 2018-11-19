package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C2971m;
import com.airbnb.lottie.animation.keyframe.C4060b;
import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import com.airbnb.lottie.p017b.C0778b;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.b */
public class C4068b extends C2984n<Float, Float> {

    /* renamed from: com.airbnb.lottie.model.animatable.b$a */
    public static final class C0803a {
        /* renamed from: a */
        static C4068b m2869a() {
            return new C4068b();
        }

        /* renamed from: a */
        public static C4068b m2870a(JSONObject jSONObject, C0788c c0788c) {
            return C0803a.m2871a(jSONObject, c0788c, true);
        }

        /* renamed from: a */
        public static C4068b m2871a(JSONObject jSONObject, C0788c c0788c, boolean z) {
            z = z ? c0788c.m2812n() : true;
            if (jSONObject != null && jSONObject.has("x")) {
                c0788c.m2797a("Lottie doesn't support expressions.");
            }
            jSONObject = C0820m.m2884a(jSONObject, z, c0788c, C2976b.f9222a).m2888a();
            return new C4068b(jSONObject.f2186a, (Float) jSONObject.f2187b);
        }
    }

    /* renamed from: com.airbnb.lottie.model.animatable.b$b */
    private static class C2976b implements Factory<Float> {
        /* renamed from: a */
        static final C2976b f9222a = new C2976b();

        public /* synthetic */ Object valueFromObject(Object obj, float f) {
            return m11496a(obj, f);
        }

        private C2976b() {
        }

        /* renamed from: a */
        public Float m11496a(Object obj, float f) {
            return Float.valueOf(C0778b.m2739a(obj) * f);
        }
    }

    /* renamed from: b */
    public /* synthetic */ Object mo3177b() {
        return m15889a();
    }

    private C4068b() {
        super(Float.valueOf(0.0f));
    }

    private C4068b(List<C0768a<Float>> list, Float f) {
        super(list, f);
    }

    public BaseKeyframeAnimation<Float, Float> createAnimation() {
        if (hasAnimation()) {
            return new C4060b(this.a);
        }
        return new C2971m(this.b);
    }

    /* renamed from: a */
    public Float m15889a() {
        return (Float) this.b;
    }
}
