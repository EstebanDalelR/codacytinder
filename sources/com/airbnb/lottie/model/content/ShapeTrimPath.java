package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C2966n;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C4068b;
import com.airbnb.lottie.model.animatable.C4068b.C0803a;
import com.airbnb.lottie.model.layer.C4077a;
import com.foursquare.internal.util.C1948m;
import org.json.JSONObject;

public class ShapeTrimPath implements ContentModel {
    /* renamed from: a */
    private final String f9259a;
    /* renamed from: b */
    private final Type f9260b;
    /* renamed from: c */
    private final C4068b f9261c;
    /* renamed from: d */
    private final C4068b f9262d;
    /* renamed from: e */
    private final C4068b f9263e;

    public enum Type {
        Simultaneously,
        Individually;

        static Type forId(int i) {
            switch (i) {
                case 1:
                    return Simultaneously;
                case 2:
                    return Individually;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown trim path type ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.ShapeTrimPath$a */
    static class C0831a {
        /* renamed from: a */
        static ShapeTrimPath m2902a(JSONObject jSONObject, C0788c c0788c) {
            return new ShapeTrimPath(jSONObject.optString("nm"), Type.forId(jSONObject.optInt(C1948m.f5228a, 1)), C0803a.m2871a(jSONObject.optJSONObject("s"), c0788c, false), C0803a.m2871a(jSONObject.optJSONObject("e"), c0788c, false), C0803a.m2871a(jSONObject.optJSONObject("o"), c0788c, false));
        }
    }

    private ShapeTrimPath(String str, Type type, C4068b c4068b, C4068b c4068b2, C4068b c4068b3) {
        this.f9259a = str;
        this.f9260b = type;
        this.f9261c = c4068b;
        this.f9262d = c4068b2;
        this.f9263e = c4068b3;
    }

    /* renamed from: a */
    public String m11537a() {
        return this.f9259a;
    }

    /* renamed from: b */
    public Type m11538b() {
        return this.f9260b;
    }

    /* renamed from: c */
    public C4068b m11539c() {
        return this.f9262d;
    }

    /* renamed from: d */
    public C4068b m11540d() {
        return this.f9261c;
    }

    /* renamed from: e */
    public C4068b m11541e() {
        return this.f9263e;
    }

    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return new C2966n(c4077a, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trim Path: {start: ");
        stringBuilder.append(this.f9261c);
        stringBuilder.append(", end: ");
        stringBuilder.append(this.f9262d);
        stringBuilder.append(", offset: ");
        stringBuilder.append(this.f9263e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
