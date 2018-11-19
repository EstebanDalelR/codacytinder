package com.airbnb.lottie.model.animatable;

import android.graphics.Path;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.C2969k;
import com.airbnb.lottie.animation.keyframe.C2971m;
import com.airbnb.lottie.model.content.C0843g;
import com.airbnb.lottie.model.content.C0843g.C2991a;
import com.airbnb.lottie.p017b.C0783e;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.h */
public class C4073h extends C2984n<C0843g, Path> {
    /* renamed from: c */
    private final Path f12923c;

    /* renamed from: com.airbnb.lottie.model.animatable.h$a */
    public static final class C0813a {
        /* renamed from: a */
        public static C4073h m2878a(JSONObject jSONObject, C0788c c0788c) {
            jSONObject = C0820m.m2884a(jSONObject, c0788c.m2812n(), c0788c, C2991a.f9295a).m2888a();
            return new C4073h(jSONObject.f2186a, (C0843g) jSONObject.f2187b);
        }
    }

    private C4073h(List<C0768a<C0843g>> list, C0843g c0843g) {
        super(list, c0843g);
        this.f12923c = new Path();
    }

    public BaseKeyframeAnimation<C0843g, Path> createAnimation() {
        if (hasAnimation()) {
            return new C2969k(this.a);
        }
        return new C2971m(m15893a((C0843g) this.b));
    }

    /* renamed from: a */
    Path m15893a(C0843g c0843g) {
        this.f12923c.reset();
        C0783e.m2764a(c0843g, this.f12923c);
        return this.f12923c;
    }
}
