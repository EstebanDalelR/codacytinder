package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4055i;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.animatable.C2980e;
import com.airbnb.lottie.model.animatable.C4068b;
import com.airbnb.lottie.model.animatable.C4068b.C0803a;
import com.airbnb.lottie.model.layer.C4077a;
import com.leanplum.BuildConfig;
import org.json.JSONObject;

public class PolystarShape implements ContentModel {
    /* renamed from: a */
    private final String f9242a;
    /* renamed from: b */
    private final Type f9243b;
    /* renamed from: c */
    private final C4068b f9244c;
    /* renamed from: d */
    private final AnimatableValue<PointF, PointF> f9245d;
    /* renamed from: e */
    private final C4068b f9246e;
    /* renamed from: f */
    private final C4068b f9247f;
    /* renamed from: g */
    private final C4068b f9248g;
    /* renamed from: h */
    private final C4068b f9249h;
    /* renamed from: i */
    private final C4068b f9250i;

    public enum Type {
        Star(1),
        Polygon(2);
        
        private final int value;

        private Type(int i) {
            this.value = i;
        }

        static Type forValue(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return 0;
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.PolystarShape$a */
    static class C0827a {
        /* renamed from: a */
        static PolystarShape m2900a(JSONObject jSONObject, C0788c c0788c) {
            C4068b a;
            String optString = jSONObject.optString("nm");
            Type forValue = Type.forValue(jSONObject.optInt("sy"));
            C4068b a2 = C0803a.m2871a(jSONObject.optJSONObject("pt"), c0788c, false);
            AnimatableValue a3 = C2980e.m11504a(jSONObject.optJSONObject(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER), c0788c);
            C4068b a4 = C0803a.m2871a(jSONObject.optJSONObject("r"), c0788c, false);
            C4068b a5 = C0803a.m2870a(jSONObject.optJSONObject("or"), c0788c);
            C4068b a6 = C0803a.m2871a(jSONObject.optJSONObject("os"), c0788c, false);
            C4068b c4068b = null;
            if (forValue == Type.Star) {
                C4068b a7 = C0803a.m2870a(jSONObject.optJSONObject("ir"), c0788c);
                a = C0803a.m2871a(jSONObject.optJSONObject("is"), c0788c, false);
                c4068b = a7;
            } else {
                a = null;
            }
            return new PolystarShape(optString, forValue, a2, a3, a4, c4068b, a5, a, a6);
        }
    }

    private PolystarShape(String str, Type type, C4068b c4068b, AnimatableValue<PointF, PointF> animatableValue, C4068b c4068b2, C4068b c4068b3, C4068b c4068b4, C4068b c4068b5, C4068b c4068b6) {
        this.f9242a = str;
        this.f9243b = type;
        this.f9244c = c4068b;
        this.f9245d = animatableValue;
        this.f9246e = c4068b2;
        this.f9247f = c4068b3;
        this.f9248g = c4068b4;
        this.f9249h = c4068b5;
        this.f9250i = c4068b6;
    }

    /* renamed from: a */
    public String m11520a() {
        return this.f9242a;
    }

    /* renamed from: b */
    public Type m11521b() {
        return this.f9243b;
    }

    /* renamed from: c */
    public C4068b m11522c() {
        return this.f9244c;
    }

    /* renamed from: d */
    public AnimatableValue<PointF, PointF> m11523d() {
        return this.f9245d;
    }

    /* renamed from: e */
    public C4068b m11524e() {
        return this.f9246e;
    }

    /* renamed from: f */
    public C4068b m11525f() {
        return this.f9247f;
    }

    /* renamed from: g */
    public C4068b m11526g() {
        return this.f9248g;
    }

    /* renamed from: h */
    public C4068b m11527h() {
        return this.f9249h;
    }

    /* renamed from: i */
    public C4068b m11528i() {
        return this.f9250i;
    }

    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return new C4055i(c0792d, c4077a, this);
    }
}
