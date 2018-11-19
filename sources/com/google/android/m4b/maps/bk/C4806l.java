package com.google.android.m4b.maps.bk;

/* renamed from: com.google.android.m4b.maps.bk.l */
public final class C4806l {
    /* renamed from: a */
    private double f17529a;
    /* renamed from: b */
    private double f17530b;

    /* renamed from: a */
    public static int m21280a(double d, double d2, double d3, double d4) {
        d = Double.compare(d, d3);
        return d == null ? Double.compare(d2, d4) : d;
    }

    /* renamed from: a */
    public static double m21279a(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = ((d3 - d) * (d6 - d2)) - ((d5 - d) * (d4 - d2));
        double d8 = d - d5;
        double d9 = d2 - d6;
        double d10 = d - d3;
        d8 = ((d8 * d8) + (d9 * d9)) + (d10 * d10);
        d10 = d2 - d4;
        return Math.abs(d7) < (d8 + (d10 * d10)) * 1.0E-10d ? 0.0d : d7;
    }

    public final String toString() {
        double d = this.f17529a;
        double d2 = this.f17530b;
        StringBuilder stringBuilder = new StringBuilder(51);
        stringBuilder.append("(");
        stringBuilder.append(d);
        stringBuilder.append(",");
        stringBuilder.append(d2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4806l)) {
            return false;
        }
        C4806l c4806l = (C4806l) obj;
        return c4806l.f17529a == this.f17529a && c4806l.f17530b == this.f17530b;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f17529a) ^ (Double.doubleToLongBits(this.f17530b) * 31);
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }
}
