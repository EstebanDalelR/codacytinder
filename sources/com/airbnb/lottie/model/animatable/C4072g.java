package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C2971m;
import com.airbnb.lottie.animation.keyframe.C4065j;
import com.airbnb.lottie.model.C0856k;
import com.airbnb.lottie.model.C0856k.C2996a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.g */
public class C4072g extends C2984n<C0856k, C0856k> {

    /* renamed from: com.airbnb.lottie.model.animatable.g$a */
    static final class C0811a {
        /* renamed from: a */
        static C4072g m2877a(JSONObject jSONObject, C0788c c0788c) {
            jSONObject = C0820m.m2884a(jSONObject, 1.0f, c0788c, C2996a.f9307a).m2888a();
            return new C4072g(jSONObject.f2186a, (C0856k) jSONObject.f2187b);
        }

        /* renamed from: a */
        static C4072g m2876a() {
            return new C4072g();
        }
    }

    private C4072g() {
        super(new C0856k());
    }

    C4072g(List<C0768a<C0856k>> list, C0856k c0856k) {
        super(list, c0856k);
    }

    public BaseKeyframeAnimation<C0856k, C0856k> createAnimation() {
        if (hasAnimation()) {
            return new C4065j(this.a);
        }
        return new C2971m(this.b);
    }
}
