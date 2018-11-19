package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.de.C5338l;
import java.util.Formatter;
import java.util.regex.Pattern;

/* renamed from: com.google.android.m4b.maps.bv.m */
public final class C4938m {
    /* renamed from: d */
    private static final Pattern f18236d = Pattern.compile(",");
    /* renamed from: a */
    private final double f18237a;
    /* renamed from: b */
    private final double f18238b;
    /* renamed from: c */
    private final int f18239c;

    public C4938m(double d, double d2) {
        this.f18237a = d;
        this.f18238b = d2;
        d2 = ((Double.doubleToRawLongBits(d) + 17) * 37) + Double.doubleToRawLongBits(d2);
        this.f18239c = (int) (d2 ^ (d2 >>> 1.58E-322d));
    }

    /* renamed from: a */
    public final C4662a m22127a() {
        C4662a c4662a = new C4662a(C5338l.f20034a);
        c4662a.m20841f(1, (int) Math.round(this.f18237a * 1000000.0d));
        c4662a.m20841f(2, (int) Math.round(this.f18238b * 1000000.0d));
        return c4662a;
    }

    public final int hashCode() {
        return this.f18239c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C4938m c4938m = (C4938m) obj;
                return Double.doubleToRawLongBits(this.f18237a) == Double.doubleToRawLongBits(c4938m.f18237a) && Double.doubleToRawLongBits(this.f18238b) == Double.doubleToRawLongBits(c4938m.f18238b);
            }
        }
        return false;
    }

    public final String toString() {
        return new Formatter(null).format("%f,%f", new Object[]{Double.valueOf(this.f18237a), Double.valueOf(this.f18238b)}).toString();
    }
}
