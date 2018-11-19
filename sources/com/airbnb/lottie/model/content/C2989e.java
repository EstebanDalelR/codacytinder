package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4056j;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.animatable.C2980e;
import com.airbnb.lottie.model.animatable.C4068b;
import com.airbnb.lottie.model.animatable.C4068b.C0803a;
import com.airbnb.lottie.model.animatable.C4071f;
import com.airbnb.lottie.model.animatable.C4071f.C0809a;
import com.airbnb.lottie.model.layer.C4077a;
import com.leanplum.BuildConfig;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.content.e */
public class C2989e implements ContentModel {
    /* renamed from: a */
    private final String f9287a;
    /* renamed from: b */
    private final AnimatableValue<PointF, PointF> f9288b;
    /* renamed from: c */
    private final C4071f f9289c;
    /* renamed from: d */
    private final C4068b f9290d;

    /* renamed from: com.airbnb.lottie.model.content.e$a */
    static class C0840a {
        /* renamed from: a */
        static C2989e m2910a(JSONObject jSONObject, C0788c c0788c) {
            return new C2989e(jSONObject.optString("nm"), C2980e.m11504a(jSONObject.optJSONObject(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER), c0788c), C0809a.m2875a(jSONObject.optJSONObject("s"), c0788c), C0803a.m2870a(jSONObject.optJSONObject("r"), c0788c));
        }
    }

    private C2989e(String str, AnimatableValue<PointF, PointF> animatableValue, C4071f c4071f, C4068b c4068b) {
        this.f9287a = str;
        this.f9288b = animatableValue;
        this.f9289c = c4071f;
        this.f9290d = c4068b;
    }

    /* renamed from: a */
    public String m11563a() {
        return this.f9287a;
    }

    /* renamed from: b */
    public C4068b m11564b() {
        return this.f9290d;
    }

    /* renamed from: c */
    public C4071f m11565c() {
        return this.f9289c;
    }

    /* renamed from: d */
    public AnimatableValue<PointF, PointF> m11566d() {
        return this.f9288b;
    }

    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return new C4056j(c0792d, c4077a, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RectangleShape{cornerRadius=");
        stringBuilder.append(this.f9290d.m15889a());
        stringBuilder.append(", position=");
        stringBuilder.append(this.f9288b);
        stringBuilder.append(", size=");
        stringBuilder.append(this.f9289c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
