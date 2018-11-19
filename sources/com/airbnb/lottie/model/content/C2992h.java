package com.airbnb.lottie.model.content;

import android.graphics.Path.FillType;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4052d;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C4067a;
import com.airbnb.lottie.model.animatable.C4067a.C0801a;
import com.airbnb.lottie.model.animatable.C4070d;
import com.airbnb.lottie.model.animatable.C4070d.C0807a;
import com.airbnb.lottie.model.layer.C4077a;
import com.tinder.api.ManagerWebServices;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.content.h */
public class C2992h implements ContentModel {
    /* renamed from: a */
    private final boolean f9296a;
    /* renamed from: b */
    private final FillType f9297b;
    /* renamed from: c */
    private final String f9298c;
    @Nullable
    /* renamed from: d */
    private final C4067a f9299d;
    @Nullable
    /* renamed from: e */
    private final C4070d f9300e;

    /* renamed from: com.airbnb.lottie.model.content.h$a */
    static class C0845a {
        /* renamed from: a */
        static C2992h m2917a(JSONObject jSONObject, C0788c c0788c) {
            String optString = jSONObject.optString("nm");
            JSONObject optJSONObject = jSONObject.optJSONObject("c");
            C4067a a = optJSONObject != null ? C0801a.m2868a(optJSONObject, c0788c) : null;
            optJSONObject = jSONObject.optJSONObject("o");
            return new C2992h(optString, jSONObject.optBoolean("fillEnabled"), jSONObject.optInt("r", 1) == 1 ? FillType.WINDING : FillType.EVEN_ODD, a, optJSONObject != null ? C0807a.m2874a(optJSONObject, c0788c) : null);
        }
    }

    private C2992h(String str, boolean z, FillType fillType, @Nullable C4067a c4067a, @Nullable C4070d c4070d) {
        this.f9298c = str;
        this.f9296a = z;
        this.f9297b = fillType;
        this.f9299d = c4067a;
        this.f9300e = c4070d;
    }

    /* renamed from: a */
    public String m11573a() {
        return this.f9298c;
    }

    @Nullable
    /* renamed from: b */
    public C4067a m11574b() {
        return this.f9299d;
    }

    @Nullable
    /* renamed from: c */
    public C4070d m11575c() {
        return this.f9300e;
    }

    /* renamed from: d */
    public FillType m11576d() {
        return this.f9297b;
    }

    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return new C4052d(c0792d, c4077a, this);
    }

    public String toString() {
        String str;
        Object obj;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeFill{color=");
        if (this.f9299d == null) {
            str = ManagerWebServices.NULL_STRING_VALUE;
        } else {
            str = Integer.toHexString(((Integer) this.f9299d.mo3177b()).intValue());
        }
        stringBuilder.append(str);
        stringBuilder.append(", fillEnabled=");
        stringBuilder.append(this.f9296a);
        stringBuilder.append(", opacity=");
        if (this.f9300e == null) {
            obj = ManagerWebServices.NULL_STRING_VALUE;
        } else {
            obj = this.f9300e.m15891a();
        }
        stringBuilder.append(obj);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
