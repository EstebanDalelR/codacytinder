package com.facebook.rebound;

/* renamed from: com.facebook.rebound.c */
public class C1807c {
    /* renamed from: a */
    static final /* synthetic */ boolean f4940a = true;
    /* renamed from: b */
    private final double f4941b;
    /* renamed from: c */
    private final double f4942c;
    /* renamed from: d */
    private final double f4943d;
    /* renamed from: e */
    private final double f4944e;

    /* renamed from: a */
    private double m6223a(double d, double d2, double d3) {
        return (d - d2) / (d3 - d2);
    }

    /* renamed from: b */
    private double m6225b(double d, double d2, double d3) {
        return d2 + (d * (d3 - d2));
    }

    /* renamed from: c */
    private double m6227c(double d, double d2, double d3) {
        return (d3 * d) + ((1.0d - d) * d2);
    }

    public C1807c(double d, double d2) {
        double d3 = d;
        double d4 = d2;
        this.f4943d = d3;
        this.f4944e = d4;
        double b = m6225b(m6223a(d4 / 1.7d, 0.0d, 20.0d), 0.0d, 0.8d);
        this.f4941b = m6225b(m6223a(d3 / 1.7d, 0.0d, 20.0d), 0.5d, 200.0d);
        this.f4942c = m6229d(b, m6228d(this.f4941b), 0.01d);
    }

    /* renamed from: a */
    public double m6230a() {
        return this.f4941b;
    }

    /* renamed from: b */
    public double m6231b() {
        return this.f4942c;
    }

    /* renamed from: d */
    private double m6229d(double d, double d2, double d3) {
        return m6227c((2.0d * d) - (d * d), d2, d3);
    }

    /* renamed from: a */
    private double m6222a(double d) {
        return (((Math.pow(d, 3.0d) * 7.0E-4d) - (Math.pow(d, 2.0d) * 0.031d)) + (d * 0.64d)) + 1.28d;
    }

    /* renamed from: b */
    private double m6224b(double d) {
        return (((Math.pow(d, 3.0d) * 4.4E-5d) - (Math.pow(d, 2.0d) * 0.006d)) + (d * 0.36d)) + 2.0d;
    }

    /* renamed from: c */
    private double m6226c(double d) {
        return (((Math.pow(d, 3.0d) * 4.5E-7d) - (Math.pow(d, 2.0d) * 3.32E-4d)) + (d * 0.1078d)) + 5.84d;
    }

    /* renamed from: d */
    private double m6228d(double d) {
        if (d <= 18.0d) {
            return m6222a(d);
        }
        if (d > 18.0d && d <= 44.0d) {
            return m6224b(d);
        }
        if (d > 44.0d) {
            return m6226c(d);
        }
        if (f4940a != null) {
            return 0.0d;
        }
        throw new AssertionError();
    }
}
