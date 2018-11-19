package com.tinder.fireboarding.view.animation.p255a;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/fireboarding/view/animation/interpolator/SpringInterpolator;", "Landroid/view/animation/Interpolator;", "springConstants", "Lcom/tinder/fireboarding/view/animation/interpolator/SpringInterpolator$SpringConstants;", "(Lcom/tinder/fireboarding/view/animation/interpolator/SpringInterpolator$SpringConstants;)V", "getInterpolation", "", "input", "isWithinThresholdForSpring", "", "spring", "amplitude", "", "frequency", "SpringConstants", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.a.a */
public final class C9576a implements Interpolator {
    /* renamed from: a */
    private final C9575a f32014a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/fireboarding/view/animation/interpolator/SpringInterpolator$SpringConstants;", "", "amplitude", "", "frequency", "(DD)V", "getAmplitude", "()D", "getFrequency", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.a.a$a */
    public static final class C9575a {
        /* renamed from: a */
        private final double f32012a;
        /* renamed from: b */
        private final double f32013b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9575a) {
                    C9575a c9575a = (C9575a) obj;
                    if (Double.compare(this.f32012a, c9575a.f32012a) == 0 && Double.compare(this.f32013b, c9575a.f32013b) == 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.f32012a);
            int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
            long doubleToLongBits2 = Double.doubleToLongBits(this.f32013b);
            return i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpringConstants(amplitude=");
            stringBuilder.append(this.f32012a);
            stringBuilder.append(", frequency=");
            stringBuilder.append(this.f32013b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9575a(double d, double d2) {
            this.f32012a = d;
            this.f32013b = d2;
        }

        /* renamed from: a */
        public final double m39906a() {
            return this.f32012a;
        }

        /* renamed from: b */
        public final double m39907b() {
            return this.f32013b;
        }
    }

    /* renamed from: a */
    private final boolean m39909a(float f) {
        double d = (double) f;
        return d > 0.005d && d < 0.995d;
    }

    public C9576a(@NotNull C9575a c9575a) {
        C2668g.b(c9575a, "springConstants");
        this.f32014a = c9575a;
    }

    public float getInterpolation(float f) {
        if (m39909a(f)) {
            return m39908a(this.f32014a.m39906a(), this.f32014a.m39907b(), f);
        }
        return f * f;
    }

    /* renamed from: a */
    private final float m39908a(double d, double d2, float f) {
        double d3 = (double) f;
        return 1.0f - ((float) (Math.cos(d2 * d3) * Math.pow(2.718281828459045d, -(d3 / d))));
    }
}
