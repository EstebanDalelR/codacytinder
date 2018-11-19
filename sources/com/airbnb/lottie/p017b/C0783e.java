package com.airbnb.lottie.p017b;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.FloatRange;
import com.airbnb.lottie.model.C0821c;
import com.airbnb.lottie.model.content.C0843g;

/* renamed from: com.airbnb.lottie.b.e */
public class C0783e {
    /* renamed from: a */
    public static double m2758a(double d, double d2, @FloatRange(from = 0.0d, to = 1.0d) double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: a */
    public static float m2759a(float f, float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m2762a(int i, int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: a */
    public static PointF m2763a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: a */
    public static void m2764a(C0843g c0843g, Path path) {
        path.reset();
        PointF a = c0843g.m2913a();
        path.moveTo(a.x, a.y);
        PointF pointF = new PointF(a.x, a.y);
        for (int i = 0; i < c0843g.m2916c().size(); i++) {
            C0821c c0821c = (C0821c) c0843g.m2916c().get(i);
            PointF a2 = c0821c.m2889a();
            PointF b = c0821c.m2891b();
            PointF c = c0821c.m2893c();
            if (a2.equals(pointF) && b.equals(c)) {
                path.lineTo(c.x, c.y);
            } else {
                path.cubicTo(a2.x, a2.y, b.x, b.y, c.x, c.y);
            }
            pointF.set(c.x, c.y);
        }
        if (c0843g.m2915b() != null) {
            path.close();
        }
    }

    /* renamed from: a */
    public static int m2760a(float f, float f2) {
        return C0783e.m2761a((int) f, (int) f2);
    }

    /* renamed from: a */
    public static int m2761a(int i, int i2) {
        return i - (C0783e.m2766b(i, i2) * i2);
    }

    /* renamed from: b */
    private static int m2766b(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    /* renamed from: b */
    public static float m2765b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }
}
