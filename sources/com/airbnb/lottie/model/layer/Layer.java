package com.airbnb.lottie.model.layer;

import android.graphics.Color;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.C0768a;
import com.airbnb.lottie.model.animatable.C0816k;
import com.airbnb.lottie.model.animatable.C0816k.C0815a;
import com.airbnb.lottie.model.animatable.C2983l;
import com.airbnb.lottie.model.animatable.C2983l.C0818a;
import com.airbnb.lottie.model.animatable.C4068b;
import com.airbnb.lottie.model.animatable.C4068b.C0803a;
import com.airbnb.lottie.model.animatable.C4074j;
import com.airbnb.lottie.model.animatable.C4074j.C0814a;
import com.airbnb.lottie.model.content.C2993i;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.Mask.C0823a;
import com.airbnb.lottie.p017b.C0784f;
import com.facebook.ads.internal.C1391d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public class Layer {
    /* renamed from: a */
    private static final String f2229a = "Layer";
    /* renamed from: b */
    private final List<ContentModel> f2230b;
    /* renamed from: c */
    private final C0788c f2231c;
    /* renamed from: d */
    private final String f2232d;
    /* renamed from: e */
    private final long f2233e;
    /* renamed from: f */
    private final LayerType f2234f;
    /* renamed from: g */
    private final long f2235g;
    @Nullable
    /* renamed from: h */
    private final String f2236h;
    /* renamed from: i */
    private final List<Mask> f2237i;
    /* renamed from: j */
    private final C2983l f2238j;
    /* renamed from: k */
    private final int f2239k;
    /* renamed from: l */
    private final int f2240l;
    /* renamed from: m */
    private final int f2241m;
    /* renamed from: n */
    private final float f2242n;
    /* renamed from: o */
    private final float f2243o;
    /* renamed from: p */
    private final int f2244p;
    /* renamed from: q */
    private final int f2245q;
    @Nullable
    /* renamed from: r */
    private final C4074j f2246r;
    @Nullable
    /* renamed from: s */
    private final C0816k f2247s;
    @Nullable
    /* renamed from: t */
    private final C4068b f2248t;
    /* renamed from: u */
    private final List<C0768a<Float>> f2249u;
    /* renamed from: v */
    private final MatteType f2250v;

    public enum LayerType {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown
    }

    enum MatteType {
        None,
        Add,
        Invert,
        Unknown
    }

    /* renamed from: com.airbnb.lottie.model.layer.Layer$a */
    public static class C0858a {
        /* renamed from: a */
        public static Layer m2934a(C0788c c0788c) {
            Rect b = c0788c.m2799b();
            return new Layer(Collections.emptyList(), c0788c, "root", -1, LayerType.PreComp, -1, null, Collections.emptyList(), C0818a.m2881a(), 0, 0, 0, 0.0f, 0.0f, b.width(), b.height(), null, null, Collections.emptyList(), MatteType.None, null);
        }

        /* renamed from: a */
        public static Layer m2935a(JSONObject jSONObject, C0788c c0788c) {
            LayerType layerType;
            int optInt;
            int optInt2;
            int parseColor;
            int i;
            C0816k a;
            C4074j c4074j;
            int optInt3;
            int optInt4;
            C0768a c0768a;
            float f;
            float f2;
            List list;
            List list2;
            List list3;
            float f3;
            JSONObject jSONObject2 = jSONObject;
            C0788c c0788c2 = c0788c;
            String optString = jSONObject2.optString("nm");
            String optString2 = jSONObject2.optString("refId");
            if (optString.endsWith(".ai") || jSONObject2.optString("cl", "").equals("ai")) {
                c0788c2.m2797a("Convert your Illustrator layers to shape layers.");
            }
            long optLong = jSONObject2.optLong("ind");
            int optInt5 = jSONObject2.optInt("ty", -1);
            if (optInt5 < LayerType.Unknown.ordinal()) {
                layerType = LayerType.values()[optInt5];
            } else {
                layerType = LayerType.Unknown;
            }
            if (layerType == LayerType.Text && !C0784f.m2774a(c0788c2, 4, 8, 0)) {
                layerType = LayerType.Unknown;
                c0788c2.m2797a("Text is only supported on bodymovin >= 4.8.0");
            }
            LayerType layerType2 = layerType;
            long optLong2 = jSONObject2.optLong("parent", -1);
            if (layerType2 == LayerType.Solid) {
                optInt = (int) (((float) jSONObject2.optInt("sw")) * c0788c.m2812n());
                optInt2 = (int) (((float) jSONObject2.optInt("sh")) * c0788c.m2812n());
                parseColor = Color.parseColor(jSONObject2.optString("sc"));
            } else {
                optInt = 0;
                optInt2 = 0;
                parseColor = 0;
            }
            C2983l a2 = C0818a.m2882a(jSONObject2.optJSONObject("ks"), c0788c2);
            MatteType matteType = MatteType.values()[jSONObject2.optInt("tt")];
            List arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = jSONObject2.optJSONArray("masksProperties");
            if (optJSONArray != null) {
                for (i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(C0823a.m2895a(optJSONArray.optJSONObject(i), c0788c2));
                }
            }
            List arrayList3 = new ArrayList();
            optJSONArray = jSONObject2.optJSONArray("shapes");
            if (optJSONArray != null) {
                for (i = 0; i < optJSONArray.length(); i++) {
                    ContentModel a3 = C2993i.m11577a(optJSONArray.optJSONObject(i), c0788c2);
                    if (a3 != null) {
                        arrayList3.add(a3);
                    }
                }
            }
            JSONObject optJSONObject = jSONObject2.optJSONObject("t");
            if (optJSONObject != null) {
                C4074j a4 = C0814a.m2879a(optJSONObject.optJSONObject(C1391d.f3780a), c0788c2);
                a = C0815a.m2880a(optJSONObject.optJSONArray("a").optJSONObject(0), c0788c2);
                c4074j = a4;
            } else {
                c4074j = null;
                a = c4074j;
            }
            if (jSONObject2.has("ef")) {
                c0788c2.m2797a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape.");
            }
            float optDouble = (float) jSONObject2.optDouble("sr", 1.0d);
            float optDouble2 = ((float) jSONObject2.optDouble("st")) / c0788c.m2811m();
            if (layerType2 == LayerType.PreComp) {
                optInt3 = (int) (((float) jSONObject2.optInt("w")) * c0788c.m2812n());
                optInt4 = (int) (((float) jSONObject2.optInt("h")) * c0788c.m2812n());
            } else {
                optInt3 = 0;
                optInt4 = 0;
            }
            float optLong3 = ((float) jSONObject2.optLong("ip")) / optDouble;
            float optLong4 = ((float) jSONObject2.optLong("op")) / optDouble;
            if (optLong3 > 0.0f) {
                Float valueOf = Float.valueOf(0.0f);
                Float valueOf2 = Float.valueOf(0.0f);
                Float valueOf3 = Float.valueOf(optLong3);
                C0768a c0768a2 = c0768a;
                f = optLong3;
                Float f4 = valueOf;
                f2 = optDouble;
                Float f5 = valueOf2;
                list = arrayList3;
                list2 = arrayList2;
                list3 = arrayList;
                c0768a = new C0768a(c0788c2, f4, f5, null, 0.0f, valueOf3);
                list2.add(c0768a);
            } else {
                f = optLong3;
                f2 = optDouble;
                list = arrayList3;
                list2 = arrayList2;
                list3 = arrayList;
            }
            if (optLong4 > 0.0f) {
                f3 = optLong4;
            } else {
                f3 = (float) (c0788c.m2806h() + 1);
            }
            C0788c c0788c3 = c0788c2;
            C0768a c0768a3 = c0768a;
            float f6 = f3;
            c0768a = new C0768a(c0788c3, Float.valueOf(1.0f), Float.valueOf(1.0f), null, f, Float.valueOf(f3));
            list2.add(c0768a3);
            String str = optString2;
            C0768a c0768a4 = c0768a;
            c0768a = new C0768a(c0788c3, Float.valueOf(0.0f), Float.valueOf(0.0f), null, f6, Float.valueOf(Float.MAX_VALUE));
            list2.add(c0768a4);
            return new Layer(list, c0788c2, optString, optLong, layerType2, optLong2, str, list3, a2, optInt, optInt2, parseColor, f2, optDouble2, optInt3, optInt4, c4074j, a, list2, matteType, jSONObject2.has("tm") ? C0803a.m2871a(jSONObject2.optJSONObject("tm"), c0788c2, false) : null);
        }
    }

    private Layer(List<ContentModel> list, C0788c c0788c, String str, long j, LayerType layerType, long j2, @Nullable String str2, List<Mask> list2, C2983l c2983l, int i, int i2, int i3, float f, float f2, int i4, int i5, @Nullable C4074j c4074j, @Nullable C0816k c0816k, List<C0768a<Float>> list3, MatteType matteType, @Nullable C4068b c4068b) {
        this.f2230b = list;
        this.f2231c = c0788c;
        this.f2232d = str;
        this.f2233e = j;
        this.f2234f = layerType;
        this.f2235g = j2;
        this.f2236h = str2;
        this.f2237i = list2;
        this.f2238j = c2983l;
        this.f2239k = i;
        this.f2240l = i2;
        this.f2241m = i3;
        this.f2242n = f;
        this.f2243o = f2;
        this.f2244p = i4;
        this.f2245q = i5;
        this.f2246r = c4074j;
        this.f2247s = c0816k;
        this.f2249u = list3;
        this.f2250v = matteType;
        this.f2248t = c4068b;
    }

    /* renamed from: a */
    C0788c m2936a() {
        return this.f2231c;
    }

    /* renamed from: b */
    float m2938b() {
        return this.f2242n;
    }

    /* renamed from: c */
    float m2939c() {
        return this.f2243o;
    }

    /* renamed from: d */
    List<C0768a<Float>> m2940d() {
        return this.f2249u;
    }

    /* renamed from: e */
    public long m2941e() {
        return this.f2233e;
    }

    /* renamed from: f */
    String m2942f() {
        return this.f2232d;
    }

    @Nullable
    /* renamed from: g */
    String m2943g() {
        return this.f2236h;
    }

    /* renamed from: h */
    int m2944h() {
        return this.f2244p;
    }

    /* renamed from: i */
    int m2945i() {
        return this.f2245q;
    }

    /* renamed from: j */
    List<Mask> m2946j() {
        return this.f2237i;
    }

    /* renamed from: k */
    public LayerType m2947k() {
        return this.f2234f;
    }

    /* renamed from: l */
    MatteType m2948l() {
        return this.f2250v;
    }

    /* renamed from: m */
    long m2949m() {
        return this.f2235g;
    }

    /* renamed from: n */
    List<ContentModel> m2950n() {
        return this.f2230b;
    }

    /* renamed from: o */
    C2983l m2951o() {
        return this.f2238j;
    }

    /* renamed from: p */
    int m2952p() {
        return this.f2241m;
    }

    /* renamed from: q */
    int m2953q() {
        return this.f2240l;
    }

    /* renamed from: r */
    int m2954r() {
        return this.f2239k;
    }

    @Nullable
    /* renamed from: s */
    C4074j m2955s() {
        return this.f2246r;
    }

    @Nullable
    /* renamed from: t */
    C0816k m2956t() {
        return this.f2247s;
    }

    @Nullable
    /* renamed from: u */
    C4068b m2957u() {
        return this.f2248t;
    }

    public String toString() {
        return m2937a("");
    }

    /* renamed from: a */
    public String m2937a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(m2942f());
        stringBuilder.append("\n");
        Layer a = this.f2231c.m2796a(m2949m());
        if (a != null) {
            stringBuilder.append("\t\tParents: ");
            stringBuilder.append(a.m2942f());
            a = this.f2231c.m2796a(a.m2949m());
            while (a != null) {
                stringBuilder.append("->");
                stringBuilder.append(a.m2942f());
                a = this.f2231c.m2796a(a.m2949m());
            }
            stringBuilder.append(str);
            stringBuilder.append("\n");
        }
        if (!m2946j().isEmpty()) {
            stringBuilder.append(str);
            stringBuilder.append("\tMasks: ");
            stringBuilder.append(m2946j().size());
            stringBuilder.append("\n");
        }
        if (!(m2954r() == 0 || m2953q() == 0)) {
            stringBuilder.append(str);
            stringBuilder.append("\tBackground: ");
            stringBuilder.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(m2954r()), Integer.valueOf(m2953q()), Integer.valueOf(m2952p())}));
        }
        if (!this.f2230b.isEmpty()) {
            stringBuilder.append(str);
            stringBuilder.append("\tShapes:\n");
            for (Object next : this.f2230b) {
                stringBuilder.append(str);
                stringBuilder.append("\t\t");
                stringBuilder.append(next);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
