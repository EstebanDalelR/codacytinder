package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4058l;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C4073h;
import com.airbnb.lottie.model.animatable.C4073h.C0813a;
import com.airbnb.lottie.model.layer.C4077a;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.content.j */
public class C2994j implements ContentModel {
    /* renamed from: a */
    private final String f9303a;
    /* renamed from: b */
    private final int f9304b;
    /* renamed from: c */
    private final C4073h f9305c;

    /* renamed from: com.airbnb.lottie.model.content.j$a */
    static class C0848a {
        /* renamed from: a */
        static C2994j m2920a(JSONObject jSONObject, C0788c c0788c) {
            return new C2994j(jSONObject.optString("nm"), jSONObject.optInt("ind"), C0813a.m2878a(jSONObject.optJSONObject("ks"), c0788c));
        }
    }

    private C2994j(String str, int i, C4073h c4073h) {
        this.f9303a = str;
        this.f9304b = i;
        this.f9305c = c4073h;
    }

    /* renamed from: a */
    public String m11580a() {
        return this.f9303a;
    }

    /* renamed from: b */
    public C4073h m11581b() {
        return this.f9305c;
    }

    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return new C4058l(c0792d, c4077a, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapePath{name=");
        stringBuilder.append(this.f9303a);
        stringBuilder.append(", index=");
        stringBuilder.append(this.f9304b);
        stringBuilder.append(", hasAnimation=");
        stringBuilder.append(this.f9305c.hasAnimation());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
