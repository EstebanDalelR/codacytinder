package com.airbnb.lottie.model.content;

import android.support.annotation.Nullable;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4320f;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C4068b;
import com.airbnb.lottie.model.animatable.C4068b.C0803a;
import com.airbnb.lottie.model.animatable.C4069c;
import com.airbnb.lottie.model.animatable.C4069c.C0805a;
import com.airbnb.lottie.model.animatable.C4070d;
import com.airbnb.lottie.model.animatable.C4070d.C0807a;
import com.airbnb.lottie.model.animatable.C4071f;
import com.airbnb.lottie.model.animatable.C4071f.C0809a;
import com.airbnb.lottie.model.content.ShapeStroke.LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke.LineJoinType;
import com.airbnb.lottie.model.layer.C4077a;
import com.facebook.ads.internal.C1391d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.content.d */
public class C2988d implements ContentModel {
    /* renamed from: a */
    private final String f9276a;
    /* renamed from: b */
    private final GradientType f9277b;
    /* renamed from: c */
    private final C4069c f9278c;
    /* renamed from: d */
    private final C4070d f9279d;
    /* renamed from: e */
    private final C4071f f9280e;
    /* renamed from: f */
    private final C4071f f9281f;
    /* renamed from: g */
    private final C4068b f9282g;
    /* renamed from: h */
    private final LineCapType f9283h;
    /* renamed from: i */
    private final LineJoinType f9284i;
    /* renamed from: j */
    private final List<C4068b> f9285j;
    @Nullable
    /* renamed from: k */
    private final C4068b f9286k;

    /* renamed from: com.airbnb.lottie.model.content.d$a */
    static class C0838a {
        /* renamed from: a */
        static C2988d m2909a(JSONObject jSONObject, C0788c c0788c) {
            C4068b c4068b;
            JSONObject jSONObject2 = jSONObject;
            C0788c c0788c2 = c0788c;
            String optString = jSONObject2.optString("nm");
            JSONObject optJSONObject = jSONObject2.optJSONObject("g");
            if (optJSONObject != null && optJSONObject.has("k")) {
                optJSONObject = optJSONObject.optJSONObject("k");
            }
            C4069c a = optJSONObject != null ? C0805a.m2872a(optJSONObject, c0788c2) : null;
            optJSONObject = jSONObject2.optJSONObject("o");
            C4070d a2 = optJSONObject != null ? C0807a.m2874a(optJSONObject, c0788c2) : null;
            GradientType gradientType = jSONObject2.optInt("t", 1) == 1 ? GradientType.Linear : GradientType.Radial;
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("s");
            C4071f a3 = optJSONObject2 != null ? C0809a.m2875a(optJSONObject2, c0788c2) : null;
            JSONObject optJSONObject3 = jSONObject2.optJSONObject("e");
            C4071f a4 = optJSONObject3 != null ? C0809a.m2875a(optJSONObject3, c0788c2) : null;
            C4068b a5 = C0803a.m2870a(jSONObject2.optJSONObject("w"), c0788c2);
            LineCapType lineCapType = LineCapType.values()[jSONObject2.optInt("lc") - 1];
            LineJoinType lineJoinType = LineJoinType.values()[jSONObject2.optInt("lj") - 1];
            List arrayList = new ArrayList();
            if (jSONObject2.has(C1391d.f3780a)) {
                JSONArray optJSONArray = jSONObject2.optJSONArray(C1391d.f3780a);
                C4068b c4068b2 = null;
                int i = 0;
                while (i < optJSONArray.length()) {
                    JSONObject optJSONObject4 = optJSONArray.optJSONObject(i);
                    String optString2 = optJSONObject4.optString("n");
                    JSONArray jSONArray = optJSONArray;
                    if (optString2.equals("o")) {
                        c4068b2 = C0803a.m2870a(optJSONObject4.optJSONObject("v"), c0788c2);
                    } else if (optString2.equals(C1391d.f3780a) || optString2.equals("g")) {
                        arrayList.add(C0803a.m2870a(optJSONObject4.optJSONObject("v"), c0788c2));
                    }
                    i++;
                    optJSONArray = jSONArray;
                }
                if (arrayList.size() == 1) {
                    arrayList.add(arrayList.get(0));
                }
                c4068b = c4068b2;
            } else {
                c4068b = null;
            }
            return new C2988d(optString, gradientType, a, a2, a3, a4, a5, lineCapType, lineJoinType, arrayList, c4068b);
        }
    }

    private C2988d(String str, GradientType gradientType, C4069c c4069c, C4070d c4070d, C4071f c4071f, C4071f c4071f2, C4068b c4068b, LineCapType lineCapType, LineJoinType lineJoinType, List<C4068b> list, @Nullable C4068b c4068b2) {
        this.f9276a = str;
        this.f9277b = gradientType;
        this.f9278c = c4069c;
        this.f9279d = c4070d;
        this.f9280e = c4071f;
        this.f9281f = c4071f2;
        this.f9282g = c4068b;
        this.f9283h = lineCapType;
        this.f9284i = lineJoinType;
        this.f9285j = list;
        this.f9286k = c4068b2;
    }

    /* renamed from: a */
    public String m11552a() {
        return this.f9276a;
    }

    /* renamed from: b */
    public GradientType m11553b() {
        return this.f9277b;
    }

    /* renamed from: c */
    public C4069c m11554c() {
        return this.f9278c;
    }

    /* renamed from: d */
    public C4070d m11555d() {
        return this.f9279d;
    }

    /* renamed from: e */
    public C4071f m11556e() {
        return this.f9280e;
    }

    /* renamed from: f */
    public C4071f m11557f() {
        return this.f9281f;
    }

    /* renamed from: g */
    public C4068b m11558g() {
        return this.f9282g;
    }

    /* renamed from: h */
    public LineCapType m11559h() {
        return this.f9283h;
    }

    /* renamed from: i */
    public LineJoinType m11560i() {
        return this.f9284i;
    }

    /* renamed from: j */
    public List<C4068b> m11561j() {
        return this.f9285j;
    }

    @Nullable
    /* renamed from: k */
    public C4068b m11562k() {
        return this.f9286k;
    }

    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return new C4320f(c0792d, c4077a, this);
    }
}
