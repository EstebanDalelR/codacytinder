package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C2971m;
import com.airbnb.lottie.animation.keyframe.C4059a;
import com.airbnb.lottie.model.C2975a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.a */
public class C4067a extends C2984n<Integer, Integer> {

    /* renamed from: com.airbnb.lottie.model.animatable.a$a */
    public static final class C0801a {
        /* renamed from: a */
        public static C4067a m2868a(JSONObject jSONObject, C0788c c0788c) {
            jSONObject = C0820m.m2884a(jSONObject, 1.0f, c0788c, C2975a.f9221a).m2888a();
            return new C4067a(jSONObject.f2186a, (Integer) jSONObject.f2187b);
        }
    }

    private C4067a(List<C0768a<Integer>> list, Integer num) {
        super(list, num);
    }

    public BaseKeyframeAnimation<Integer, Integer> createAnimation() {
        if (hasAnimation()) {
            return new C4059a(this.a);
        }
        return new C2971m(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnimatableColorValue{initialValue=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
