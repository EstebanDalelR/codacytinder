package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import android.support.annotation.FloatRange;
import com.airbnb.lottie.model.C0821c;
import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import com.airbnb.lottie.p017b.C0783e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.content.g */
public class C0843g {
    /* renamed from: a */
    private final List<C0821c> f2202a;
    /* renamed from: b */
    private PointF f2203b;
    /* renamed from: c */
    private boolean f2204c;

    /* renamed from: com.airbnb.lottie.model.content.g$a */
    public static class C2991a implements Factory<C0843g> {
        /* renamed from: a */
        public static final C2991a f9295a = new C2991a();

        public /* synthetic */ Object valueFromObject(Object obj, float f) {
            return m11572a(obj, f);
        }

        private C2991a() {
        }

        /* renamed from: a */
        public C0843g m11572a(Object obj, float f) {
            JSONObject jSONObject;
            JSONArray optJSONArray;
            JSONArray optJSONArray2;
            JSONArray optJSONArray3;
            boolean optBoolean;
            int length;
            PointF a;
            List arrayList;
            int i;
            PointF a2;
            int i2;
            PointF a3;
            PointF a4;
            PointF a5;
            PointF a6;
            PointF a7;
            PointF a8;
            PointF a9;
            StringBuilder stringBuilder;
            Object obj2 = obj;
            if (obj2 instanceof JSONArray) {
                obj2 = ((JSONArray) obj2).opt(0);
                if (obj2 instanceof JSONObject) {
                    jSONObject = (JSONObject) obj2;
                    if (jSONObject.has("v")) {
                        if (jSONObject != null) {
                            return null;
                        }
                        optJSONArray = jSONObject.optJSONArray("v");
                        optJSONArray2 = jSONObject.optJSONArray("i");
                        optJSONArray3 = jSONObject.optJSONArray("o");
                        optBoolean = jSONObject.optBoolean("c", false);
                        if (!(optJSONArray == null || optJSONArray2 == null || optJSONArray3 == null || optJSONArray.length() != optJSONArray2.length())) {
                            if (optJSONArray.length() != optJSONArray3.length()) {
                                if (optJSONArray.length() != 0) {
                                    return new C0843g(new PointF(), false, Collections.emptyList());
                                }
                                length = optJSONArray.length();
                                a = C2991a.m11571a(0, optJSONArray);
                                a.x *= f;
                                a.y *= f;
                                arrayList = new ArrayList(length);
                                for (i = 1; i < length; i++) {
                                    a2 = C2991a.m11571a(i, optJSONArray);
                                    i2 = i - 1;
                                    a3 = C2991a.m11571a(i2, optJSONArray);
                                    a4 = C2991a.m11571a(i2, optJSONArray3);
                                    a5 = C2991a.m11571a(i, optJSONArray2);
                                    a4 = C0783e.m2763a(a3, a4);
                                    a3 = C0783e.m2763a(a2, a5);
                                    a4.x *= f;
                                    a4.y *= f;
                                    a3.x *= f;
                                    a3.y *= f;
                                    a2.x *= f;
                                    a2.y *= f;
                                    arrayList.add(new C0821c(a4, a3, a2));
                                }
                                if (optBoolean) {
                                    a6 = C2991a.m11571a(0, optJSONArray);
                                    length--;
                                    a7 = C2991a.m11571a(length, optJSONArray);
                                    a8 = C2991a.m11571a(length, optJSONArray3);
                                    a9 = C2991a.m11571a(0, optJSONArray2);
                                    a8 = C0783e.m2763a(a7, a8);
                                    a7 = C0783e.m2763a(a6, a9);
                                    if (f != 1.0f) {
                                        a8.x *= f;
                                        a8.y *= f;
                                        a7.x *= f;
                                        a7.y *= f;
                                        a6.x *= f;
                                        a6.y *= f;
                                    }
                                    arrayList.add(new C0821c(a8, a7, a6));
                                }
                                return new C0843g(a, optBoolean, arrayList);
                            }
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unable to process points array or tangents. ");
                        stringBuilder.append(jSONObject);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            } else if (obj2 instanceof JSONObject) {
                jSONObject = (JSONObject) obj2;
                if (jSONObject.has("v")) {
                    if (jSONObject != null) {
                        return null;
                    }
                    optJSONArray = jSONObject.optJSONArray("v");
                    optJSONArray2 = jSONObject.optJSONArray("i");
                    optJSONArray3 = jSONObject.optJSONArray("o");
                    optBoolean = jSONObject.optBoolean("c", false);
                    if (optJSONArray.length() != optJSONArray3.length()) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unable to process points array or tangents. ");
                        stringBuilder.append(jSONObject);
                        throw new IllegalStateException(stringBuilder.toString());
                    } else if (optJSONArray.length() != 0) {
                        return new C0843g(new PointF(), false, Collections.emptyList());
                    } else {
                        length = optJSONArray.length();
                        a = C2991a.m11571a(0, optJSONArray);
                        a.x *= f;
                        a.y *= f;
                        arrayList = new ArrayList(length);
                        for (i = 1; i < length; i++) {
                            a2 = C2991a.m11571a(i, optJSONArray);
                            i2 = i - 1;
                            a3 = C2991a.m11571a(i2, optJSONArray);
                            a4 = C2991a.m11571a(i2, optJSONArray3);
                            a5 = C2991a.m11571a(i, optJSONArray2);
                            a4 = C0783e.m2763a(a3, a4);
                            a3 = C0783e.m2763a(a2, a5);
                            a4.x *= f;
                            a4.y *= f;
                            a3.x *= f;
                            a3.y *= f;
                            a2.x *= f;
                            a2.y *= f;
                            arrayList.add(new C0821c(a4, a3, a2));
                        }
                        if (optBoolean) {
                            a6 = C2991a.m11571a(0, optJSONArray);
                            length--;
                            a7 = C2991a.m11571a(length, optJSONArray);
                            a8 = C2991a.m11571a(length, optJSONArray3);
                            a9 = C2991a.m11571a(0, optJSONArray2);
                            a8 = C0783e.m2763a(a7, a8);
                            a7 = C0783e.m2763a(a6, a9);
                            if (f != 1.0f) {
                                a8.x *= f;
                                a8.y *= f;
                                a7.x *= f;
                                a7.y *= f;
                                a6.x *= f;
                                a6.y *= f;
                            }
                            arrayList.add(new C0821c(a8, a7, a6));
                        }
                        return new C0843g(a, optBoolean, arrayList);
                    }
                }
            }
            jSONObject = null;
            if (jSONObject != null) {
                return null;
            }
            optJSONArray = jSONObject.optJSONArray("v");
            optJSONArray2 = jSONObject.optJSONArray("i");
            optJSONArray3 = jSONObject.optJSONArray("o");
            optBoolean = jSONObject.optBoolean("c", false);
            if (optJSONArray.length() != optJSONArray3.length()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to process points array or tangents. ");
                stringBuilder.append(jSONObject);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (optJSONArray.length() != 0) {
                return new C0843g(new PointF(), false, Collections.emptyList());
            } else {
                length = optJSONArray.length();
                a = C2991a.m11571a(0, optJSONArray);
                a.x *= f;
                a.y *= f;
                arrayList = new ArrayList(length);
                for (i = 1; i < length; i++) {
                    a2 = C2991a.m11571a(i, optJSONArray);
                    i2 = i - 1;
                    a3 = C2991a.m11571a(i2, optJSONArray);
                    a4 = C2991a.m11571a(i2, optJSONArray3);
                    a5 = C2991a.m11571a(i, optJSONArray2);
                    a4 = C0783e.m2763a(a3, a4);
                    a3 = C0783e.m2763a(a2, a5);
                    a4.x *= f;
                    a4.y *= f;
                    a3.x *= f;
                    a3.y *= f;
                    a2.x *= f;
                    a2.y *= f;
                    arrayList.add(new C0821c(a4, a3, a2));
                }
                if (optBoolean) {
                    a6 = C2991a.m11571a(0, optJSONArray);
                    length--;
                    a7 = C2991a.m11571a(length, optJSONArray);
                    a8 = C2991a.m11571a(length, optJSONArray3);
                    a9 = C2991a.m11571a(0, optJSONArray2);
                    a8 = C0783e.m2763a(a7, a8);
                    a7 = C0783e.m2763a(a6, a9);
                    if (f != 1.0f) {
                        a8.x *= f;
                        a8.y *= f;
                        a7.x *= f;
                        a7.y *= f;
                        a6.x *= f;
                        a6.y *= f;
                    }
                    arrayList.add(new C0821c(a8, a7, a6));
                }
                return new C0843g(a, optBoolean, arrayList);
            }
        }

        /* renamed from: a */
        private static PointF m11571a(int i, JSONArray jSONArray) {
            if (i >= jSONArray.length()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid index ");
                stringBuilder.append(i);
                stringBuilder.append(". There are only ");
                stringBuilder.append(jSONArray.length());
                stringBuilder.append(" points.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            i = jSONArray.optJSONArray(i);
            jSONArray = i.opt(null);
            i = i.opt(1);
            return new PointF(jSONArray instanceof Double ? ((Double) jSONArray).floatValue() : (float) ((Integer) jSONArray).intValue(), i instanceof Double ? ((Double) i).floatValue() : (float) ((Integer) i).intValue());
        }
    }

    private C0843g(PointF pointF, boolean z, List<C0821c> list) {
        this.f2202a = new ArrayList();
        this.f2203b = pointF;
        this.f2204c = z;
        this.f2202a.addAll(list);
    }

    public C0843g() {
        this.f2202a = new ArrayList();
    }

    /* renamed from: a */
    private void m2912a(float f, float f2) {
        if (this.f2203b == null) {
            this.f2203b = new PointF();
        }
        this.f2203b.set(f, f2);
    }

    /* renamed from: a */
    public PointF m2913a() {
        return this.f2203b;
    }

    /* renamed from: b */
    public boolean m2915b() {
        return this.f2204c;
    }

    /* renamed from: c */
    public List<C0821c> m2916c() {
        return this.f2202a;
    }

    /* renamed from: a */
    public void m2914a(C0843g c0843g, C0843g c0843g2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        boolean z;
        int size;
        PointF a;
        PointF a2;
        if (this.f2203b == null) {
            this.f2203b = new PointF();
        }
        if (!c0843g.m2915b()) {
            if (!c0843g2.m2915b()) {
                z = false;
                this.f2204c = z;
                if (!this.f2202a.isEmpty() || this.f2202a.size() == c0843g.m2916c().size() || this.f2202a.size() == c0843g2.m2916c().size()) {
                    if (this.f2202a.isEmpty()) {
                        for (size = c0843g.m2916c().size() - 1; size >= 0; size--) {
                            this.f2202a.add(new C0821c());
                        }
                    }
                    a = c0843g.m2913a();
                    a2 = c0843g2.m2913a();
                    m2912a(C0783e.m2759a(a.x, a2.x, f), C0783e.m2759a(a.y, a2.y, f));
                    for (size = this.f2202a.size() - 1; size >= 0; size--) {
                        C0821c c0821c = (C0821c) c0843g.m2916c().get(size);
                        C0821c c0821c2 = (C0821c) c0843g2.m2916c().get(size);
                        PointF a3 = c0821c.m2889a();
                        PointF b = c0821c.m2891b();
                        PointF c = c0821c.m2893c();
                        PointF a4 = c0821c2.m2889a();
                        PointF b2 = c0821c2.m2891b();
                        a2 = c0821c2.m2893c();
                        ((C0821c) this.f2202a.get(size)).m2890a(C0783e.m2759a(a3.x, a4.x, f), C0783e.m2759a(a3.y, a4.y, f));
                        ((C0821c) this.f2202a.get(size)).m2892b(C0783e.m2759a(b.x, b2.x, f), C0783e.m2759a(b.y, b2.y, f));
                        ((C0821c) this.f2202a.get(size)).m2894c(C0783e.m2759a(c.x, a2.x, f), C0783e.m2759a(c.y, a2.y, f));
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Curves must have the same number of control points. This: ");
                stringBuilder.append(m2916c().size());
                stringBuilder.append("\tShape 1: ");
                stringBuilder.append(c0843g.m2916c().size());
                stringBuilder.append("\tShape 2: ");
                stringBuilder.append(c0843g2.m2916c().size());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        z = true;
        this.f2204c = z;
        if (this.f2202a.isEmpty()) {
        }
        if (this.f2202a.isEmpty()) {
            for (size = c0843g.m2916c().size() - 1; size >= 0; size--) {
                this.f2202a.add(new C0821c());
            }
        }
        a = c0843g.m2913a();
        a2 = c0843g2.m2913a();
        m2912a(C0783e.m2759a(a.x, a2.x, f), C0783e.m2759a(a.y, a2.y, f));
        for (size = this.f2202a.size() - 1; size >= 0; size--) {
            C0821c c0821c3 = (C0821c) c0843g.m2916c().get(size);
            C0821c c0821c22 = (C0821c) c0843g2.m2916c().get(size);
            PointF a32 = c0821c3.m2889a();
            PointF b3 = c0821c3.m2891b();
            PointF c2 = c0821c3.m2893c();
            PointF a42 = c0821c22.m2889a();
            PointF b22 = c0821c22.m2891b();
            a2 = c0821c22.m2893c();
            ((C0821c) this.f2202a.get(size)).m2890a(C0783e.m2759a(a32.x, a42.x, f), C0783e.m2759a(a32.y, a42.y, f));
            ((C0821c) this.f2202a.get(size)).m2892b(C0783e.m2759a(b3.x, b22.x, f), C0783e.m2759a(b3.y, b22.y, f));
            ((C0821c) this.f2202a.get(size)).m2894c(C0783e.m2759a(c2.x, a2.x, f), C0783e.m2759a(c2.y, a2.y, f));
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeData{numCurves=");
        stringBuilder.append(this.f2202a.size());
        stringBuilder.append("closed=");
        stringBuilder.append(this.f2204c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
