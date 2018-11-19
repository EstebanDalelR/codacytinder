package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4051c;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.animatable.C2980e;
import com.airbnb.lottie.model.animatable.C4071f;
import com.airbnb.lottie.model.animatable.C4071f.C0809a;
import com.airbnb.lottie.model.layer.C4077a;
import com.leanplum.BuildConfig;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.content.a */
public class C2986a implements ContentModel {
    /* renamed from: a */
    private final String f9264a;
    /* renamed from: b */
    private final AnimatableValue<PointF, PointF> f9265b;
    /* renamed from: c */
    private final C4071f f9266c;

    /* renamed from: com.airbnb.lottie.model.content.a$a */
    static class C0833a {
        /* renamed from: a */
        static C2986a m2903a(JSONObject jSONObject, C0788c c0788c) {
            return new C2986a(jSONObject.optString("nm"), C2980e.m11504a(jSONObject.optJSONObject(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER), c0788c), C0809a.m2875a(jSONObject.optJSONObject("s"), c0788c));
        }
    }

    private C2986a(String str, AnimatableValue<PointF, PointF> animatableValue, C4071f c4071f) {
        this.f9264a = str;
        this.f9265b = animatableValue;
        this.f9266c = c4071f;
    }

    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return new C4051c(c0792d, c4077a, this);
    }

    /* renamed from: a */
    public String m11542a() {
        return this.f9264a;
    }

    /* renamed from: b */
    public AnimatableValue<PointF, PointF> m11543b() {
        return this.f9265b;
    }

    /* renamed from: c */
    public C4071f m11544c() {
        return this.f9266c;
    }
}
