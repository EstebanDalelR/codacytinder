package android.support.v4.graphics;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;

/* renamed from: android.support.v4.graphics.a */
public final class C0443a {
    /* renamed from: a */
    private static final ThreadLocal<double[]> f1484a = new ThreadLocal();

    /* renamed from: a */
    public static int m1681a(@ColorInt int i, @ColorInt int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int d = C0443a.m1689d(alpha2, alpha);
        return Color.argb(d, C0443a.m1683a(Color.red(i), alpha2, Color.red(i2), alpha, d), C0443a.m1683a(Color.green(i), alpha2, Color.green(i2), alpha, d), C0443a.m1683a(Color.blue(i), alpha2, Color.blue(i2), alpha, d));
    }

    /* renamed from: d */
    private static int m1689d(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: a */
    private static int m1683a(int i, int i2, int i3, int i4, int i5) {
        return i5 == 0 ? 0 : (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    /* renamed from: a */
    public static double m1680a(@ColorInt int i) {
        double[] a = C0443a.m1686a();
        C0443a.m1685a(i, a);
        return a[1] / 100.0d;
    }

    /* renamed from: b */
    public static double m1687b(@ColorInt int i, @ColorInt int i2) {
        if (Color.alpha(i2) != 255) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("background can not be translucent: #");
            stringBuilder.append(Integer.toHexString(i2));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (Color.alpha(i) < 255) {
            i = C0443a.m1681a(i, i2);
        }
        double a = C0443a.m1680a(i) + 0.05d;
        i = C0443a.m1680a(i2) + -1717986918;
        return Math.max(a, i) / Math.min(a, i);
    }

    @ColorInt
    /* renamed from: c */
    public static int m1688c(@ColorInt int i, @IntRange(from = 0, to = 255) int i2) {
        if (i2 >= 0) {
            if (i2 <= 255) {
                return (i & 16777215) | (i2 << 24);
            }
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: a */
    public static void m1685a(@ColorInt int i, @NonNull double[] dArr) {
        C0443a.m1684a(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: a */
    public static void m1684a(@IntRange(from = 0, to = 255) int i, @IntRange(from = 0, to = 255) int i2, @IntRange(from = 0, to = 255) int i3, @NonNull double[] dArr) {
        double[] dArr2 = dArr;
        if (dArr2.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) i) / 255.0d;
        if (d < 0.04045d) {
            d /= 12.92d;
        } else {
            d = Math.pow((d + 0.055d) / 1.055d, 2.4d);
        }
        double d2 = d;
        d = ((double) i2) / 255.0d;
        if (d < 0.04045d) {
            d /= 12.92d;
        } else {
            d = Math.pow((d + 0.055d) / 1.055d, 2.4d);
        }
        double d3 = d;
        d = ((double) i3) / 255.0d;
        if (d < 0.04045d) {
            d /= 12.92d;
        } else {
            d = Math.pow((d + 0.055d) / 1.055d, 2.4d);
        }
        dArr2[0] = (((0.4124d * d2) + (0.3576d * d3)) + (0.1805d * d)) * 100.0d;
        dArr2[1] = (((0.2126d * d2) + (0.7152d * d3)) + (0.0722d * d)) * 100.0d;
        dArr2[2] = (((d2 * 0.0193d) + (d3 * 0.1192d)) + (d * 0.9505d)) * 100.0d;
    }

    @ColorInt
    /* renamed from: a */
    public static int m1682a(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static double[] m1686a() {
        double[] dArr = (double[]) f1484a.get();
        if (dArr != null) {
            return dArr;
        }
        Object obj = new double[3];
        f1484a.set(obj);
        return obj;
    }
}
