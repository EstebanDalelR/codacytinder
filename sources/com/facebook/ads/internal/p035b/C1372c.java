package com.facebook.ads.internal.p035b;

import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.b.c */
public class C1372c implements Serializable {
    /* renamed from: a */
    private C1371a f3720a;
    /* renamed from: b */
    private C1371a f3721b;

    /* renamed from: com.facebook.ads.internal.b.c$a */
    public static class C1371a implements Serializable {
        /* renamed from: a */
        private double f3709a;
        /* renamed from: b */
        private double f3710b;
        /* renamed from: c */
        private double f3711c;
        /* renamed from: d */
        private double f3712d;
        /* renamed from: e */
        private double f3713e;
        /* renamed from: f */
        private double f3714f;
        /* renamed from: g */
        private double f3715g;
        /* renamed from: h */
        private int f3716h;
        /* renamed from: i */
        private double f3717i;
        /* renamed from: j */
        private double f3718j;
        /* renamed from: k */
        private double f3719k;

        public C1371a(double d) {
            this.f3713e = d;
        }

        /* renamed from: a */
        public void m4780a() {
            this.f3709a = 0.0d;
            this.f3711c = 0.0d;
            this.f3712d = 0.0d;
            this.f3714f = 0.0d;
            this.f3716h = 0;
            this.f3717i = 0.0d;
            this.f3718j = 1.0d;
            this.f3719k = 0.0d;
        }

        /* renamed from: a */
        public void m4781a(double d, double d2) {
            this.f3716h++;
            this.f3717i += d;
            this.f3711c = d2;
            this.f3719k += d2 * d;
            this.f3709a = this.f3719k / this.f3717i;
            this.f3718j = Math.min(this.f3718j, d2);
            this.f3714f = Math.max(this.f3714f, d2);
            if (d2 >= this.f3713e) {
                this.f3712d += d;
                this.f3710b += d;
                this.f3715g = Math.max(this.f3715g, this.f3710b);
                return;
            }
            this.f3710b = 0.0d;
        }

        /* renamed from: b */
        public double m4782b() {
            return this.f3716h == 0 ? 0.0d : this.f3718j;
        }

        /* renamed from: c */
        public double m4783c() {
            return this.f3709a;
        }

        /* renamed from: d */
        public double m4784d() {
            return this.f3714f;
        }

        /* renamed from: e */
        public double m4785e() {
            return this.f3717i;
        }

        /* renamed from: f */
        public double m4786f() {
            return this.f3712d;
        }

        /* renamed from: g */
        public double m4787g() {
            return this.f3715g;
        }
    }

    public C1372c() {
        this(0.5d, 0.05d);
    }

    public C1372c(double d) {
        this(d, 0.05d);
    }

    public C1372c(double d, double d2) {
        this.f3720a = new C1371a(d);
        this.f3721b = new C1371a(d2);
        m4788a();
    }

    /* renamed from: a */
    void m4788a() {
        this.f3720a.m4780a();
        this.f3721b.m4780a();
    }

    /* renamed from: a */
    void m4789a(double d, double d2) {
        this.f3720a.m4781a(d, d2);
    }

    /* renamed from: b */
    public C1371a m4790b() {
        return this.f3720a;
    }

    /* renamed from: b */
    void m4791b(double d, double d2) {
        this.f3721b.m4781a(d, d2);
    }

    /* renamed from: c */
    public C1371a m4792c() {
        return this.f3721b;
    }
}
