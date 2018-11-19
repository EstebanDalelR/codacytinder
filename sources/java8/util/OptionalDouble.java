package java8.util;

import java8.lang.Doubles;

public final class OptionalDouble {
    /* renamed from: a */
    private static final OptionalDouble f48744a = new OptionalDouble();
    /* renamed from: b */
    private final boolean f48745b;
    /* renamed from: c */
    private final double f48746c;

    private OptionalDouble() {
        this.f48745b = false;
        this.f48746c = Double.NaN;
    }

    /* renamed from: a */
    public static OptionalDouble m59133a() {
        return f48744a;
    }

    private OptionalDouble(double d) {
        this.f48745b = true;
        this.f48746c = d;
    }

    /* renamed from: a */
    public static OptionalDouble m59134a(double d) {
        return new OptionalDouble(d);
    }

    /* renamed from: b */
    public boolean m59135b() {
        return this.f48745b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalDouble)) {
            return false;
        }
        OptionalDouble optionalDouble = (OptionalDouble) obj;
        if (this.f48745b && optionalDouble.f48745b) {
            if (Double.compare(this.f48746c, optionalDouble.f48746c) == null) {
                return z;
            }
        } else if (this.f48745b == optionalDouble.f48745b) {
            return z;
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return this.f48745b ? Doubles.m59015a(this.f48746c) : 0;
    }

    public String toString() {
        if (!this.f48745b) {
            return "OptionalDouble.empty";
        }
        return String.format("OptionalDouble[%s]", new Object[]{Double.valueOf(this.f48746c)});
    }
}
