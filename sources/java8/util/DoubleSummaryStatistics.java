package java8.util;

import java8.util.function.DoubleConsumer;

public class DoubleSummaryStatistics implements DoubleConsumer {
    /* renamed from: a */
    private long f54220a;
    /* renamed from: b */
    private double f54221b;
    /* renamed from: c */
    private double f54222c;
    /* renamed from: d */
    private double f54223d;
    /* renamed from: e */
    private double f54224e = Double.POSITIVE_INFINITY;
    /* renamed from: f */
    private double f54225f = Double.NEGATIVE_INFINITY;

    public void accept(double d) {
        this.f54220a++;
        this.f54223d += d;
        m63815a(d);
        this.f54224e = Math.min(this.f54224e, d);
        this.f54225f = Math.max(this.f54225f, d);
    }

    /* renamed from: a */
    public void m63817a(DoubleSummaryStatistics doubleSummaryStatistics) {
        this.f54220a += doubleSummaryStatistics.f54220a;
        this.f54223d += doubleSummaryStatistics.f54223d;
        m63815a(doubleSummaryStatistics.f54221b);
        m63815a(doubleSummaryStatistics.f54222c);
        this.f54224e = Math.min(this.f54224e, doubleSummaryStatistics.f54224e);
        this.f54225f = Math.max(this.f54225f, doubleSummaryStatistics.f54225f);
    }

    /* renamed from: a */
    private void m63815a(double d) {
        d -= this.f54222c;
        double d2 = this.f54221b + d;
        this.f54222c = (d2 - this.f54221b) - d;
        this.f54221b = d2;
    }

    /* renamed from: a */
    public final long m63816a() {
        return this.f54220a;
    }

    /* renamed from: b */
    public final double m63818b() {
        double d = this.f54221b + this.f54222c;
        return (Double.isNaN(d) && Double.isInfinite(this.f54223d)) ? this.f54223d : d;
    }

    /* renamed from: c */
    public final double m63819c() {
        return this.f54224e;
    }

    /* renamed from: d */
    public final double m63820d() {
        return this.f54225f;
    }

    /* renamed from: e */
    public final double m63821e() {
        return m63816a() > 0 ? m63818b() / ((double) m63816a()) : 0.0d;
    }

    public String toString() {
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", new Object[]{getClass().getSimpleName(), Long.valueOf(m63816a()), Double.valueOf(m63818b()), Double.valueOf(m63819c()), Double.valueOf(m63821e()), Double.valueOf(m63820d())});
    }
}
