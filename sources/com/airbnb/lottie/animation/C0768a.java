package com.airbnb.lottie.animation;

import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.support.v4.util.C0563n;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.model.animatable.AnimatableValue.Factory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.airbnb.lottie.animation.a */
public class C0768a<T> {
    /* renamed from: f */
    private static final Interpolator f2088f = new LinearInterpolator();
    @Nullable
    /* renamed from: a */
    public final T f2089a;
    @Nullable
    /* renamed from: b */
    public final T f2090b;
    @Nullable
    /* renamed from: c */
    public final Interpolator f2091c;
    /* renamed from: d */
    public final float f2092d;
    @Nullable
    /* renamed from: e */
    public Float f2093e;
    /* renamed from: g */
    private final C0788c f2094g;
    /* renamed from: h */
    private float f2095h = Float.MIN_VALUE;
    /* renamed from: i */
    private float f2096i = Float.MIN_VALUE;

    /* renamed from: com.airbnb.lottie.animation.a$a */
    public static class C0767a {
        /* renamed from: a */
        private static C0563n<WeakReference<Interpolator>> f2087a;

        /* renamed from: a */
        private static C0563n<WeakReference<Interpolator>> m2702a() {
            if (f2087a == null) {
                f2087a = new C0563n();
            }
            return f2087a;
        }

        @Nullable
        /* renamed from: a */
        private static WeakReference<Interpolator> m2704a(int i) {
            WeakReference weakReference;
            synchronized (C0767a.class) {
                weakReference = (WeakReference) C0767a.m2702a().m2080a(i);
            }
            return weakReference;
        }

        /* renamed from: a */
        private static void m2706a(int i, WeakReference<Interpolator> weakReference) {
            synchronized (C0767a.class) {
                f2087a.m2084b(i, weakReference);
            }
        }

        private C0767a() {
        }

        /* renamed from: a */
        public static <T> com.airbnb.lottie.animation.C0768a<T> m2703a(org.json.JSONObject r10, com.airbnb.lottie.C0788c r11, float r12, com.airbnb.lottie.model.animatable.AnimatableValue.Factory<T> r13) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = "t";
            r0 = r10.has(r0);
            r1 = 0;
            if (r0 == 0) goto L_0x00c4;
        L_0x0009:
            r0 = "t";
            r2 = 0;
            r2 = r10.optDouble(r0, r2);
            r0 = (float) r2;
            r2 = "s";
            r2 = r10.opt(r2);
            if (r2 == 0) goto L_0x001f;
        L_0x001a:
            r2 = r13.valueFromObject(r2, r12);
            goto L_0x0020;
        L_0x001f:
            r2 = r1;
        L_0x0020:
            r3 = "e";
            r3 = r10.opt(r3);
            if (r3 == 0) goto L_0x002d;
        L_0x0028:
            r13 = r13.valueFromObject(r3, r12);
            goto L_0x002e;
        L_0x002d:
            r13 = r1;
        L_0x002e:
            r3 = "o";
            r3 = r10.optJSONObject(r3);
            r4 = "i";
            r4 = r10.optJSONObject(r4);
            if (r3 == 0) goto L_0x0047;
        L_0x003c:
            if (r4 == 0) goto L_0x0047;
        L_0x003e:
            r3 = com.airbnb.lottie.p017b.C0778b.m2741a(r3, r12);
            r4 = com.airbnb.lottie.p017b.C0778b.m2741a(r4, r12);
            goto L_0x0049;
        L_0x0047:
            r3 = r1;
            r4 = r3;
        L_0x0049:
            r5 = "h";
            r6 = 0;
            r10 = r10.optInt(r5, r6);
            r5 = 1;
            if (r10 != r5) goto L_0x0054;
        L_0x0053:
            goto L_0x0055;
        L_0x0054:
            r5 = 0;
        L_0x0055:
            if (r5 == 0) goto L_0x005e;
        L_0x0057:
            r10 = com.airbnb.lottie.animation.C0768a.f2088f;
            r1 = r10;
            r13 = r2;
            goto L_0x00bf;
        L_0x005e:
            if (r3 == 0) goto L_0x00ba;
        L_0x0060:
            r10 = r3.x;
            r5 = -r12;
            r10 = com.airbnb.lottie.p017b.C0783e.m2765b(r10, r5, r12);
            r3.x = r10;
            r10 = r3.y;
            r6 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
            r7 = -1027080192; // 0xffffffffc2c80000 float:-100.0 double:NaN;
            r10 = com.airbnb.lottie.p017b.C0783e.m2765b(r10, r7, r6);
            r3.y = r10;
            r10 = r4.x;
            r10 = com.airbnb.lottie.p017b.C0783e.m2765b(r10, r5, r12);
            r4.x = r10;
            r10 = r4.y;
            r10 = com.airbnb.lottie.p017b.C0783e.m2765b(r10, r7, r6);
            r4.y = r10;
            r10 = r3.x;
            r5 = r3.y;
            r6 = r4.x;
            r7 = r4.y;
            r10 = com.airbnb.lottie.p017b.C0784f.m2769a(r10, r5, r6, r7);
            r5 = com.airbnb.lottie.animation.C0768a.C0767a.m2704a(r10);
            if (r5 == 0) goto L_0x009d;
        L_0x0097:
            r1 = r5.get();
            r1 = (android.view.animation.Interpolator) r1;
        L_0x009d:
            if (r5 == 0) goto L_0x00a1;
        L_0x009f:
            if (r1 != 0) goto L_0x00bf;
        L_0x00a1:
            r1 = r3.x;
            r1 = r1 / r12;
            r3 = r3.y;
            r3 = r3 / r12;
            r5 = r4.x;
            r5 = r5 / r12;
            r4 = r4.y;
            r4 = r4 / r12;
            r1 = android.support.v4.view.p011a.C0581f.m2244a(r1, r3, r5, r4);
            r12 = new java.lang.ref.WeakReference;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
            r12.<init>(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
            com.airbnb.lottie.animation.C0768a.C0767a.m2706a(r10, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00bf }
            goto L_0x00bf;
        L_0x00ba:
            r10 = com.airbnb.lottie.animation.C0768a.f2088f;
            r1 = r10;
        L_0x00bf:
            r6 = r13;
            r8 = r0;
            r7 = r1;
            r5 = r2;
            goto L_0x00cd;
        L_0x00c4:
            r2 = r13.valueFromObject(r10, r12);
            r0 = 0;
            r7 = r1;
            r5 = r2;
            r6 = r5;
            r8 = 0;
        L_0x00cd:
            r10 = new com.airbnb.lottie.animation.a;
            r9 = 0;
            r3 = r10;
            r4 = r11;
            r3.<init>(r4, r5, r6, r7, r8, r9);
            return r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.a.a.a(org.json.JSONObject, com.airbnb.lottie.c, float, com.airbnb.lottie.model.animatable.AnimatableValue$Factory):com.airbnb.lottie.animation.a<T>");
        }

        /* renamed from: a */
        public static <T> List<C0768a<T>> m2705a(JSONArray jSONArray, C0788c c0788c, float f, Factory<T> factory) {
            int length = jSONArray.length();
            if (length == 0) {
                return Collections.emptyList();
            }
            List arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                arrayList.add(C0767a.m2703a(jSONArray.optJSONObject(i), c0788c, f, (Factory) factory));
            }
            C0768a.m2707a(arrayList);
            return arrayList;
        }
    }

    /* renamed from: a */
    public static void m2707a(List<? extends C0768a<?>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C0768a c0768a = (C0768a) list.get(i2);
            i2++;
            c0768a.f2093e = Float.valueOf(((C0768a) list.get(i2)).f2092d);
        }
        C0768a c0768a2 = (C0768a) list.get(i);
        if (c0768a2.f2089a == null) {
            list.remove(c0768a2);
        }
    }

    public C0768a(C0788c c0788c, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.f2094g = c0788c;
        this.f2089a = t;
        this.f2090b = t2;
        this.f2091c = interpolator;
        this.f2092d = f;
        this.f2093e = f2;
    }

    /* renamed from: a */
    public float m2709a() {
        if (this.f2095h == Float.MIN_VALUE) {
            this.f2095h = (this.f2092d - ((float) this.f2094g.m2805g())) / this.f2094g.m2811m();
        }
        return this.f2095h;
    }

    /* renamed from: b */
    public float m2711b() {
        if (this.f2096i == Float.MIN_VALUE) {
            if (this.f2093e == null) {
                this.f2096i = 1.0f;
            } else {
                this.f2096i = m2709a() + ((this.f2093e.floatValue() - this.f2092d) / this.f2094g.m2811m());
            }
        }
        return this.f2096i;
    }

    /* renamed from: c */
    public boolean m2712c() {
        return this.f2091c == null;
    }

    /* renamed from: a */
    public boolean m2710a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return f >= m2709a() && f <= m2711b();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Keyframe{startValue=");
        stringBuilder.append(this.f2089a);
        stringBuilder.append(", endValue=");
        stringBuilder.append(this.f2090b);
        stringBuilder.append(", startFrame=");
        stringBuilder.append(this.f2092d);
        stringBuilder.append(", endFrame=");
        stringBuilder.append(this.f2093e);
        stringBuilder.append(", interpolator=");
        stringBuilder.append(this.f2091c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
