package com.airbnb.lottie.model.content;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4321m;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C4067a;
import com.airbnb.lottie.model.animatable.C4067a.C0801a;
import com.airbnb.lottie.model.animatable.C4068b;
import com.airbnb.lottie.model.animatable.C4068b.C0803a;
import com.airbnb.lottie.model.animatable.C4070d;
import com.airbnb.lottie.model.animatable.C4070d.C0807a;
import com.airbnb.lottie.model.layer.C4077a;
import com.facebook.ads.internal.C1391d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class ShapeStroke implements ContentModel {
    /* renamed from: a */
    private final String f9251a;
    @Nullable
    /* renamed from: b */
    private final C4068b f9252b;
    /* renamed from: c */
    private final List<C4068b> f9253c;
    /* renamed from: d */
    private final C4067a f9254d;
    /* renamed from: e */
    private final C4070d f9255e;
    /* renamed from: f */
    private final C4068b f9256f;
    /* renamed from: g */
    private final LineCapType f9257g;
    /* renamed from: h */
    private final LineJoinType f9258h;

    public enum LineCapType {
        Butt,
        Round,
        Unknown;

        public Cap toPaintCap() {
            switch (this) {
                case Butt:
                    return Cap.BUTT;
                case Round:
                    return Cap.ROUND;
                default:
                    return Cap.SQUARE;
            }
        }
    }

    public enum LineJoinType {
        Miter,
        Round,
        Bevel;

        public Join toPaintJoin() {
            switch (this) {
                case Bevel:
                    return Join.BEVEL;
                case Miter:
                    return Join.MITER;
                case Round:
                    return Join.ROUND;
                default:
                    return null;
            }
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$a */
    static class C0829a {
        /* renamed from: a */
        static ShapeStroke m2901a(JSONObject jSONObject, C0788c c0788c) {
            C4068b c4068b;
            String optString = jSONObject.optString("nm");
            List arrayList = new ArrayList();
            C4067a a = C0801a.m2868a(jSONObject.optJSONObject("c"), c0788c);
            C4068b a2 = C0803a.m2870a(jSONObject.optJSONObject("w"), c0788c);
            C4070d a3 = C0807a.m2874a(jSONObject.optJSONObject("o"), c0788c);
            LineCapType lineCapType = LineCapType.values()[jSONObject.optInt("lc") - 1];
            LineJoinType lineJoinType = LineJoinType.values()[jSONObject.optInt("lj") - 1];
            if (jSONObject.has(C1391d.f3780a)) {
                jSONObject = jSONObject.optJSONArray(C1391d.f3780a);
                C4068b c4068b2 = null;
                for (int i = 0; i < jSONObject.length(); i++) {
                    JSONObject optJSONObject = jSONObject.optJSONObject(i);
                    String optString2 = optJSONObject.optString("n");
                    if (optString2.equals("o")) {
                        c4068b2 = C0803a.m2870a(optJSONObject.optJSONObject("v"), c0788c);
                    } else if (optString2.equals(C1391d.f3780a) || optString2.equals("g")) {
                        arrayList.add(C0803a.m2870a(optJSONObject.optJSONObject("v"), c0788c));
                    }
                }
                if (arrayList.size() == 1) {
                    arrayList.add(arrayList.get(0));
                }
                c4068b = c4068b2;
            } else {
                c4068b = null;
            }
            return new ShapeStroke(optString, c4068b, arrayList, a, a3, a2, lineCapType, lineJoinType);
        }
    }

    private ShapeStroke(String str, @Nullable C4068b c4068b, List<C4068b> list, C4067a c4067a, C4070d c4070d, C4068b c4068b2, LineCapType lineCapType, LineJoinType lineJoinType) {
        this.f9251a = str;
        this.f9252b = c4068b;
        this.f9253c = list;
        this.f9254d = c4067a;
        this.f9255e = c4070d;
        this.f9256f = c4068b2;
        this.f9257g = lineCapType;
        this.f9258h = lineJoinType;
    }

    public Content toContent(C0792d c0792d, C4077a c4077a) {
        return new C4321m(c0792d, c4077a, this);
    }

    /* renamed from: a */
    public String m11529a() {
        return this.f9251a;
    }

    /* renamed from: b */
    public C4067a m11530b() {
        return this.f9254d;
    }

    /* renamed from: c */
    public C4070d m11531c() {
        return this.f9255e;
    }

    /* renamed from: d */
    public C4068b m11532d() {
        return this.f9256f;
    }

    /* renamed from: e */
    public List<C4068b> m11533e() {
        return this.f9253c;
    }

    /* renamed from: f */
    public C4068b m11534f() {
        return this.f9252b;
    }

    /* renamed from: g */
    public LineCapType m11535g() {
        return this.f9257g;
    }

    /* renamed from: h */
    public LineJoinType m11536h() {
        return this.f9258h;
    }
}
