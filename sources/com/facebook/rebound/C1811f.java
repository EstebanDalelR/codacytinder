package com.facebook.rebound;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.rebound.f */
public class C1811f {
    /* renamed from: a */
    private static int f4947a;
    /* renamed from: b */
    private C1812g f4948b;
    /* renamed from: c */
    private boolean f4949c;
    /* renamed from: d */
    private final String f4950d;
    /* renamed from: e */
    private final C1810a f4951e = new C1810a();
    /* renamed from: f */
    private final C1810a f4952f = new C1810a();
    /* renamed from: g */
    private final C1810a f4953g = new C1810a();
    /* renamed from: h */
    private double f4954h;
    /* renamed from: i */
    private double f4955i;
    /* renamed from: j */
    private boolean f4956j = true;
    /* renamed from: k */
    private double f4957k = 0.005d;
    /* renamed from: l */
    private double f4958l = 0.005d;
    /* renamed from: m */
    private CopyOnWriteArraySet<SpringListener> f4959m = new CopyOnWriteArraySet();
    /* renamed from: n */
    private double f4960n = 0.0d;
    /* renamed from: o */
    private final C1806b f4961o;

    /* renamed from: com.facebook.rebound.f$a */
    private static class C1810a {
        /* renamed from: a */
        double f4945a;
        /* renamed from: b */
        double f4946b;

        private C1810a() {
        }
    }

    C1811f(C1806b c1806b) {
        if (c1806b == null) {
            throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
        }
        this.f4961o = c1806b;
        c1806b = new StringBuilder();
        c1806b.append("spring:");
        int i = f4947a;
        f4947a = i + 1;
        c1806b.append(i);
        this.f4950d = c1806b.toString();
        m6239a(C1812g.f4962c);
    }

    /* renamed from: a */
    public void m6241a() {
        this.f4959m.clear();
        this.f4961o.m6221b(this);
    }

    /* renamed from: b */
    public String m6244b() {
        return this.f4950d;
    }

    /* renamed from: a */
    public C1811f m6239a(C1812g c1812g) {
        if (c1812g == null) {
            throw new IllegalArgumentException("springConfig is required");
        }
        this.f4948b = c1812g;
        return this;
    }

    /* renamed from: a */
    public C1811f m6236a(double d) {
        return m6237a(d, true);
    }

    /* renamed from: a */
    public C1811f m6237a(double d, boolean z) {
        this.f4954h = d;
        this.f4951e.f4945a = d;
        this.f4961o.m6217a(m6244b());
        d = this.f4959m.iterator();
        while (d.hasNext()) {
            ((SpringListener) d.next()).onSpringUpdate(this);
        }
        if (z) {
            m6253h();
        }
        return this;
    }

    /* renamed from: c */
    public double m6245c() {
        return this.f4951e.f4945a;
    }

    /* renamed from: a */
    private double m6234a(C1810a c1810a) {
        return Math.abs(this.f4955i - c1810a.f4945a);
    }

    /* renamed from: b */
    public C1811f m6242b(double d) {
        if (this.f4955i == d && m6252g()) {
            return this;
        }
        this.f4954h = m6245c();
        this.f4955i = d;
        this.f4961o.m6217a(m6244b());
        d = this.f4959m.iterator();
        while (d.hasNext()) {
            ((SpringListener) d.next()).onSpringEndStateChange(this);
        }
        return this;
    }

    /* renamed from: c */
    public C1811f m6246c(double d) {
        if (d == this.f4951e.f4946b) {
            return this;
        }
        this.f4951e.f4946b = d;
        this.f4961o.m6217a(m6244b());
        return this;
    }

    /* renamed from: d */
    public C1811f m6247d(double d) {
        this.f4958l = d;
        return this;
    }

    /* renamed from: a */
    public C1811f m6240a(boolean z) {
        this.f4949c = z;
        return this;
    }

    /* renamed from: d */
    public boolean m6248d() {
        return this.f4948b.f4964b > 0.0d && ((this.f4954h < this.f4955i && m6245c() > this.f4955i) || (this.f4954h > this.f4955i && m6245c() < this.f4955i));
    }

    /* renamed from: e */
    void m6249e(double d) {
        C1811f c1811f = this;
        boolean g = m6252g();
        if (!g || !c1811f.f4956j) {
            Object obj;
            double d2 = 0.064d;
            if (d <= 0.064d) {
                d2 = d;
            }
            c1811f.f4960n += d2;
            d2 = c1811f.f4948b.f4964b;
            double d3 = c1811f.f4948b.f4963a;
            double d4 = c1811f.f4951e.f4945a;
            double d5 = c1811f.f4951e.f4946b;
            double d6 = c1811f.f4953g.f4945a;
            double d7 = c1811f.f4953g.f4946b;
            while (c1811f.f4960n >= 0.001d) {
                c1811f.f4960n -= 0.001d;
                if (c1811f.f4960n < 0.001d) {
                    c1811f.f4952f.f4945a = d4;
                    c1811f.f4952f.f4946b = d5;
                }
                d7 = ((c1811f.f4955i - d6) * d2) - (d3 * d5);
                double d8 = d5 + ((d7 * 0.001d) * 0.5d);
                double d9 = ((c1811f.f4955i - (((d5 * 0.001d) * 0.5d) + d4)) * d2) - (d3 * d8);
                double d10 = d5 + ((d9 * 0.001d) * 0.5d);
                double d11 = d7;
                d7 = ((c1811f.f4955i - (((d8 * 0.001d) * 0.5d) + d4)) * d2) - (d3 * d10);
                d6 = (d10 * 0.001d) + d4;
                double d12 = d5 + (d7 * 0.001d);
                d4 += (((d5 + ((d8 + d10) * 2.0d)) + d12) * 0.16666666666666666d) * 0.001d;
                d5 += (((d11 + ((d9 + d7) * 2.0d)) + (((c1811f.f4955i - d6) * d2) - (d3 * d12))) * 0.16666666666666666d) * 0.001d;
                d7 = d12;
            }
            double d13 = d4;
            c1811f.f4953g.f4945a = d6;
            c1811f.f4953g.f4946b = d7;
            c1811f.f4951e.f4945a = d4;
            c1811f.f4951e.f4946b = d5;
            if (c1811f.f4960n > 0.0d) {
                m6235f(c1811f.f4960n / 0.001d);
            }
            if (m6252g() || (c1811f.f4949c && m6248d())) {
                if (d2 > 0.0d) {
                    c1811f.f4954h = c1811f.f4955i;
                    c1811f.f4951e.f4945a = c1811f.f4955i;
                } else {
                    c1811f.f4955i = c1811f.f4951e.f4945a;
                    c1811f.f4954h = c1811f.f4955i;
                }
                m6246c(0.0d);
                g = true;
            }
            boolean z = false;
            if (c1811f.f4956j) {
                c1811f.f4956j = false;
                obj = 1;
            } else {
                obj = null;
            }
            if (g) {
                c1811f.f4956j = true;
                z = true;
            }
            Iterator it = c1811f.f4959m.iterator();
            while (it.hasNext()) {
                SpringListener springListener = (SpringListener) it.next();
                if (obj != null) {
                    springListener.onSpringActivate(c1811f);
                }
                springListener.onSpringUpdate(c1811f);
                if (z) {
                    springListener.onSpringAtRest(c1811f);
                }
            }
        }
    }

    /* renamed from: e */
    public boolean m6250e() {
        if (m6252g()) {
            if (m6251f()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m6251f() {
        return this.f4956j;
    }

    /* renamed from: g */
    public boolean m6252g() {
        return Math.abs(this.f4951e.f4946b) <= this.f4957k && (m6234a(this.f4951e) <= this.f4958l || this.f4948b.f4964b == 0.0d);
    }

    /* renamed from: h */
    public C1811f m6253h() {
        this.f4955i = this.f4951e.f4945a;
        this.f4953g.f4945a = this.f4951e.f4945a;
        this.f4951e.f4946b = 0.0d;
        return this;
    }

    /* renamed from: f */
    private void m6235f(double d) {
        double d2 = 1.0d - d;
        this.f4951e.f4945a = (this.f4951e.f4945a * d) + (this.f4952f.f4945a * d2);
        this.f4951e.f4946b = (this.f4951e.f4946b * d) + (this.f4952f.f4946b * d2);
    }

    /* renamed from: a */
    public C1811f m6238a(SpringListener springListener) {
        if (springListener == null) {
            throw new IllegalArgumentException("newListener is required");
        }
        this.f4959m.add(springListener);
        return this;
    }

    /* renamed from: b */
    public C1811f m6243b(SpringListener springListener) {
        if (springListener == null) {
            throw new IllegalArgumentException("listenerToRemove is required");
        }
        this.f4959m.remove(springListener);
        return this;
    }

    /* renamed from: i */
    public C1811f m6254i() {
        this.f4959m.clear();
        return this;
    }
}
