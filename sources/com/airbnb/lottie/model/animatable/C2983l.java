package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.Log;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.animation.keyframe.C0776o;
import com.airbnb.lottie.model.C0856k;
import com.airbnb.lottie.model.animatable.C4068b.C0803a;
import com.airbnb.lottie.model.animatable.C4070d.C0807a;
import com.airbnb.lottie.model.animatable.C4072g.C0811a;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.C4077a;
import com.leanplum.BuildConfig;
import java.util.Collections;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.animatable.l */
public class C2983l implements ModifierContent, ContentModel {
    /* renamed from: a */
    private final C2980e f9231a;
    /* renamed from: b */
    private final AnimatableValue<PointF, PointF> f9232b;
    /* renamed from: c */
    private final C4072g f9233c;
    /* renamed from: d */
    private final C4068b f9234d;
    /* renamed from: e */
    private final C4070d f9235e;
    @Nullable
    /* renamed from: f */
    private final C4068b f9236f;
    @Nullable
    /* renamed from: g */
    private final C4068b f9237g;

    /* renamed from: com.airbnb.lottie.model.animatable.l$a */
    public static class C0818a {
        /* renamed from: a */
        public static C2983l m2881a() {
            return new C2983l(new C2980e(), new C2980e(), C0811a.m2876a(), C0803a.m2869a(), C0807a.m2873a(), C0803a.m2869a(), C0803a.m2869a());
        }

        /* renamed from: a */
        public static C2983l m2882a(JSONObject jSONObject, C0788c c0788c) {
            C2980e c2980e;
            AnimatableValue a;
            C4072g a2;
            C4068b a3;
            C4070d a4;
            JSONObject optJSONObject = jSONObject.optJSONObject("a");
            if (optJSONObject != null) {
                c2980e = new C2980e(optJSONObject.opt("k"), c0788c);
            } else {
                Log.w("LOTTIE", "Layer has no transform property. You may be using an unsupported layer type such as a camera.");
                c2980e = new C2980e();
            }
            C2980e c2980e2 = c2980e;
            optJSONObject = jSONObject.optJSONObject(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER);
            if (optJSONObject != null) {
                a = C2980e.m11504a(optJSONObject, c0788c);
            } else {
                C0818a.m2883a("position");
                a = null;
            }
            optJSONObject = jSONObject.optJSONObject("s");
            if (optJSONObject != null) {
                a2 = C0811a.m2877a(optJSONObject, c0788c);
            } else {
                a2 = new C4072g(Collections.emptyList(), new C0856k());
            }
            C4072g c4072g = a2;
            optJSONObject = jSONObject.optJSONObject("r");
            if (optJSONObject == null) {
                optJSONObject = jSONObject.optJSONObject("rz");
            }
            if (optJSONObject != null) {
                a3 = C0803a.m2871a(optJSONObject, c0788c, false);
            } else {
                C0818a.m2883a("rotation");
                a3 = null;
            }
            optJSONObject = jSONObject.optJSONObject("o");
            if (optJSONObject != null) {
                a4 = C0807a.m2874a(optJSONObject, c0788c);
            } else {
                a4 = new C4070d(Collections.emptyList(), Integer.valueOf(100));
            }
            C4070d c4070d = a4;
            optJSONObject = jSONObject.optJSONObject("so");
            C4068b a5 = optJSONObject != null ? C0803a.m2871a(optJSONObject, c0788c, false) : null;
            jSONObject = jSONObject.optJSONObject("eo");
            return new C2983l(c2980e2, a, c4072g, a3, c4070d, a5, jSONObject != null ? C0803a.m2871a(jSONObject, c0788c, false) : null);
        }

        /* renamed from: a */
        private static void m2883a(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing transform for ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    @Nullable
    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return null;
    }

    private C2983l(C2980e c2980e, AnimatableValue<PointF, PointF> animatableValue, C4072g c4072g, C4068b c4068b, C4070d c4070d, @Nullable C4068b c4068b2, @Nullable C4068b c4068b3) {
        this.f9231a = c2980e;
        this.f9232b = animatableValue;
        this.f9233c = c4072g;
        this.f9234d = c4068b;
        this.f9235e = c4070d;
        this.f9236f = c4068b2;
        this.f9237g = c4068b3;
    }

    /* renamed from: a */
    public C2980e m11508a() {
        return this.f9231a;
    }

    /* renamed from: b */
    public AnimatableValue<PointF, PointF> m11509b() {
        return this.f9232b;
    }

    /* renamed from: c */
    public C4072g m11510c() {
        return this.f9233c;
    }

    /* renamed from: d */
    public C4068b m11511d() {
        return this.f9234d;
    }

    /* renamed from: e */
    public C4070d m11512e() {
        return this.f9235e;
    }

    @Nullable
    /* renamed from: f */
    public C4068b m11513f() {
        return this.f9236f;
    }

    @Nullable
    /* renamed from: g */
    public C4068b m11514g() {
        return this.f9237g;
    }

    /* renamed from: h */
    public C0776o m11515h() {
        return new C0776o(this);
    }
}
