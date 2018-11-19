package com.airbnb.lottie.p017b;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0785b;
import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.animation.content.C2966n;

/* renamed from: com.airbnb.lottie.b.f */
public final class C0784f {
    /* renamed from: a */
    private static final PathMeasure f2127a = new PathMeasure();
    /* renamed from: b */
    private static final Path f2128b = new Path();
    /* renamed from: c */
    private static final Path f2129c = new Path();
    /* renamed from: d */
    private static final float[] f2130d = new float[4];
    /* renamed from: e */
    private static final float f2131e = ((float) Math.sqrt(2.0d));

    /* renamed from: a */
    public static int m2769a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) 527) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: a */
    public static Path m2770a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            Path path2 = path;
            path2.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: a */
    public static void m2773a(java.io.Closeable r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        if (r0 == 0) goto L_0x0008;
    L_0x0002:
        r0.close();	 Catch:{ RuntimeException -> 0x0006, Exception -> 0x0008 }
        goto L_0x0008;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.f.a(java.io.Closeable):void");
    }

    /* renamed from: a */
    public static float m2768a(Matrix matrix) {
        f2130d[0] = 0.0f;
        f2130d[1] = 0.0f;
        f2130d[2] = f2131e;
        f2130d[3] = f2131e;
        matrix.mapPoints(f2130d);
        return ((float) Math.hypot((double) (f2130d[2] - f2130d[0]), (double) (f2130d[3] - f2130d[1]))) / 2.0f;
    }

    /* renamed from: a */
    public static void m2772a(Path path, @Nullable C2966n c2966n) {
        if (c2966n != null) {
            C0784f.m2771a(path, ((Float) c2966n.m11476b().mo1163b()).floatValue() / 100.0f, ((Float) c2966n.m11477c().mo1163b()).floatValue() / 100.0f, ((Float) c2966n.m11478d().mo1163b()).floatValue() / 360.0f);
        }
    }

    /* renamed from: a */
    public static void m2771a(Path path, float f, float f2, float f3) {
        C0785b.m2775a("applyTrimPathIfNeeded");
        f2127a.setPath(path, false);
        float length = f2127a.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C0785b.m2776b("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f) {
            if (((double) Math.abs((f2 - f) - 1.0f)) >= 0.01d) {
                f *= length;
                f2 *= length;
                f3 *= length;
                float min = Math.min(f, f2) + f3;
                f = Math.max(f, f2) + f3;
                if (min >= length && f >= length) {
                    min = (float) C0783e.m2760a(min, length);
                    f = (float) C0783e.m2760a(f, length);
                }
                if (min < 0.0f) {
                    min = (float) C0783e.m2760a(min, length);
                }
                if (f < 0.0f) {
                    f = (float) C0783e.m2760a(f, length);
                }
                if (min == f) {
                    path.reset();
                    C0785b.m2776b("applyTrimPathIfNeeded");
                    return;
                }
                if (min >= f) {
                    min -= length;
                }
                f2128b.reset();
                f2127a.getSegment(min, f, f2128b, true);
                if (f > length) {
                    f2129c.reset();
                    f2127a.getSegment(0.0f, f % length, f2129c, true);
                    f2128b.addPath(f2129c);
                } else if (min < 0.0f) {
                    f2129c.reset();
                    f2127a.getSegment(min + length, length, f2129c, true);
                    f2128b.addPath(f2129c);
                }
                path.set(f2128b);
                C0785b.m2776b("applyTrimPathIfNeeded");
                return;
            }
        }
        C0785b.m2776b("applyTrimPathIfNeeded");
    }

    /* renamed from: a */
    public static boolean m2774a(C0788c c0788c, int i, int i2, int i3) {
        boolean z = false;
        if (c0788c.m2802d() < i) {
            return false;
        }
        if (c0788c.m2802d() > i) {
            return true;
        }
        if (c0788c.m2803e() < i2) {
            return false;
        }
        if (c0788c.m2803e() > i2) {
            return true;
        }
        if (c0788c.m2804f() >= i3) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static float m2767a(Context context) {
        if (VERSION.SDK_INT >= 17) {
            return Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        return System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }
}
