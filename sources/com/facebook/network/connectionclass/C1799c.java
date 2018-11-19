package com.facebook.network.connectionclass;

/* renamed from: com.facebook.network.connectionclass.c */
class C1799c {
    /* renamed from: a */
    private final double f4919a;
    /* renamed from: b */
    private final int f4920b;
    /* renamed from: c */
    private double f4921c = -1.0d;
    /* renamed from: d */
    private int f4922d;

    public C1799c(double d) {
        this.f4919a = d;
        if (d == 0.0d) {
            d = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        } else {
            d = (int) Math.ceil(1.0d / d);
        }
        this.f4920b = d;
    }

    /* renamed from: a */
    public void m6207a(double d) {
        double d2 = 1.0d - this.f4919a;
        if (this.f4922d > this.f4920b) {
            this.f4921c = Math.exp((d2 * Math.log(this.f4921c)) + (this.f4919a * Math.log(d)));
        } else if (this.f4922d > 0) {
            d2 = (d2 * ((double) this.f4922d)) / (((double) this.f4922d) + 1.0d);
            this.f4921c = Math.exp((d2 * Math.log(this.f4921c)) + ((1.0d - d2) * Math.log(d)));
        } else {
            this.f4921c = d;
        }
        this.f4922d++;
    }

    /* renamed from: a */
    public double m6206a() {
        return this.f4921c;
    }
}
