package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C2971m;
import com.airbnb.lottie.animation.keyframe.C4062d;
import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import com.airbnb.lottie.p017b.C0778b;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.d */
public class C4070d extends C2984n<Integer, Integer> {

    /* renamed from: com.airbnb.lottie.model.animatable.d$a */
    public static final class C0807a {
        /* renamed from: a */
        static C4070d m2873a() {
            return new C4070d();
        }

        /* renamed from: a */
        public static C4070d m2874a(JSONObject jSONObject, C0788c c0788c) {
            if (jSONObject != null && jSONObject.has("x")) {
                c0788c.m2797a("Lottie doesn't support expressions.");
            }
            jSONObject = C0820m.m2884a(jSONObject, 1.0f, c0788c, C2978b.f9224a).m2888a();
            return new C4070d(jSONObject.f2186a, (Integer) jSONObject.f2187b);
        }
    }

    /* renamed from: com.airbnb.lottie.model.animatable.d$b */
    private static class C2978b implements Factory<Integer> {
        /* renamed from: a */
        private static final C2978b f9224a = new C2978b();

        public /* synthetic */ Object valueFromObject(Object obj, float f) {
            return m11501a(obj, f);
        }

        private C2978b() {
        }

        /* renamed from: a */
        public Integer m11501a(Object obj, float f) {
            return Integer.valueOf(Math.round(C0778b.m2739a(obj) * f));
        }
    }

    /* renamed from: b */
    public /* synthetic */ Object mo3177b() {
        return m15891a();
    }

    private C4070d() {
        super(Integer.valueOf(100));
    }

    C4070d(List<C0768a<Integer>> list, Integer num) {
        super(list, num);
    }

    public BaseKeyframeAnimation<Integer, Integer> createAnimation() {
        if (hasAnimation()) {
            return new C4062d(this.a);
        }
        return new C2971m(this.b);
    }

    /* renamed from: a */
    public Integer m15891a() {
        return (Integer) this.b;
    }
}
