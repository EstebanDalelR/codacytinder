package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.animation.C0768a.C0767a;
import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import com.airbnb.lottie.p017b.C0778b;
import com.airbnb.lottie.p017b.C0784f;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.animation.keyframe.g */
public class C2968g extends C0768a<PointF> {
    @Nullable
    /* renamed from: f */
    private Path f9208f;

    /* renamed from: com.airbnb.lottie.animation.keyframe.g$a */
    public static class C0775a {
        /* renamed from: a */
        public static C2968g m2728a(JSONObject jSONObject, C0788c c0788c, Factory<PointF> factory) {
            PointF pointF;
            factory = C0767a.m2703a(jSONObject, c0788c, c0788c.m2812n(), (Factory) factory);
            JSONArray optJSONArray = jSONObject.optJSONArray("ti");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("to");
            PointF pointF2 = null;
            if (optJSONArray == null || optJSONArray2 == null) {
                pointF = null;
            } else {
                pointF2 = C0778b.m2740a(optJSONArray2, c0788c.m2812n());
                pointF = C0778b.m2740a(optJSONArray, c0788c.m2812n());
            }
            C2968g c2968g = new C2968g(c0788c, (PointF) factory.f2089a, (PointF) factory.f2090b, factory.f2091c, factory.f2092d, factory.f2093e);
            c0788c = (factory.f2090b == null || factory.f2089a == null || ((PointF) factory.f2089a).equals(((PointF) factory.f2090b).x, ((PointF) factory.f2090b).y) == null) ? null : true;
            if (c2968g.b != null && c0788c == null) {
                c2968g.f9208f = C0784f.m2770a((PointF) factory.f2089a, (PointF) factory.f2090b, pointF2, pointF);
            }
            return c2968g;
        }
    }

    private C2968g(C0788c c0788c, @Nullable PointF pointF, @Nullable PointF pointF2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        super(c0788c, pointF, pointF2, interpolator, f, f2);
    }

    @Nullable
    /* renamed from: e */
    Path m11480e() {
        return this.f9208f;
    }
}
