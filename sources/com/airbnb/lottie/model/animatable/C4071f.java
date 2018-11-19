package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C2971m;
import com.airbnb.lottie.animation.keyframe.C4064i;
import com.airbnb.lottie.model.C2995j;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.f */
public class C4071f extends C2984n<PointF, PointF> {

    /* renamed from: com.airbnb.lottie.model.animatable.f$a */
    public static final class C0809a {
        /* renamed from: a */
        public static C4071f m2875a(JSONObject jSONObject, C0788c c0788c) {
            jSONObject = C0820m.m2884a(jSONObject, c0788c.m2812n(), c0788c, C2995j.f9306a).m2888a();
            return new C4071f(jSONObject.f2186a, (PointF) jSONObject.f2187b);
        }
    }

    private C4071f(List<C0768a<PointF>> list, PointF pointF) {
        super(list, pointF);
    }

    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        if (hasAnimation()) {
            return new C4064i(this.a);
        }
        return new C2971m(this.b);
    }
}
