package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C4066n;
import com.airbnb.lottie.model.C0850d;
import com.airbnb.lottie.model.C0850d.C0849a;
import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.j */
public class C4074j extends C2984n<C0850d, C0850d> {

    /* renamed from: com.airbnb.lottie.model.animatable.j$a */
    public static final class C0814a {
        /* renamed from: a */
        public static C4074j m2879a(JSONObject jSONObject, C0788c c0788c) {
            if (jSONObject != null && jSONObject.has("x")) {
                c0788c.m2797a("Lottie doesn't support expressions.");
            }
            jSONObject = C0820m.m2884a(jSONObject, 1.0f, c0788c, C2982b.f9230a).m2888a();
            return new C4074j(jSONObject.f2186a, (C0850d) jSONObject.f2187b);
        }
    }

    /* renamed from: com.airbnb.lottie.model.animatable.j$b */
    private static class C2982b implements Factory<C0850d> {
        /* renamed from: a */
        private static final C2982b f9230a = new C2982b();

        public /* synthetic */ Object valueFromObject(Object obj, float f) {
            return m11507a(obj, f);
        }

        private C2982b() {
        }

        /* renamed from: a */
        public C0850d m11507a(Object obj, float f) {
            return C0849a.m2921a((JSONObject) obj);
        }
    }

    public /* synthetic */ BaseKeyframeAnimation createAnimation() {
        return m15895a();
    }

    C4074j(List<C0768a<C0850d>> list, C0850d c0850d) {
        super(list, c0850d);
    }

    /* renamed from: a */
    public C4066n m15895a() {
        return new C4066n(this.a);
    }
}
