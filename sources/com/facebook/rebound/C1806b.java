package com.facebook.rebound;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.rebound.b */
public class C1806b {
    /* renamed from: a */
    private final Map<String, C1811f> f4935a = new HashMap();
    /* renamed from: b */
    private final Set<C1811f> f4936b = new CopyOnWriteArraySet();
    /* renamed from: c */
    private final C1813h f4937c;
    /* renamed from: d */
    private final CopyOnWriteArraySet<SpringSystemListener> f4938d = new CopyOnWriteArraySet();
    /* renamed from: e */
    private boolean f4939e = true;

    public C1806b(C1813h c1813h) {
        if (c1813h == null) {
            throw new IllegalArgumentException("springLooper is required");
        }
        this.f4937c = c1813h;
        this.f4937c.m6257a(this);
    }

    /* renamed from: a */
    public boolean m6218a() {
        return this.f4939e;
    }

    /* renamed from: b */
    public C1811f m6219b() {
        C1811f c1811f = new C1811f(this);
        m6216a(c1811f);
        return c1811f;
    }

    /* renamed from: a */
    void m6216a(C1811f c1811f) {
        if (c1811f == null) {
            throw new IllegalArgumentException("spring is required");
        } else if (this.f4935a.containsKey(c1811f.m6244b())) {
            throw new IllegalArgumentException("spring is already registered");
        } else {
            this.f4935a.put(c1811f.m6244b(), c1811f);
        }
    }

    /* renamed from: b */
    void m6221b(C1811f c1811f) {
        if (c1811f == null) {
            throw new IllegalArgumentException("spring is required");
        }
        this.f4936b.remove(c1811f);
        this.f4935a.remove(c1811f.m6244b());
    }

    /* renamed from: a */
    void m6215a(double d) {
        for (C1811f c1811f : this.f4936b) {
            if (c1811f.m6250e()) {
                c1811f.m6249e(d / 1000.0d);
            } else {
                this.f4936b.remove(c1811f);
            }
        }
    }

    /* renamed from: b */
    public void m6220b(double d) {
        Iterator it = this.f4938d.iterator();
        while (it.hasNext()) {
            ((SpringSystemListener) it.next()).onBeforeIntegrate(this);
        }
        m6215a(d);
        if (this.f4936b.isEmpty() != null) {
            this.f4939e = Double.MIN_VALUE;
        }
        d = this.f4938d.iterator();
        while (d.hasNext()) {
            ((SpringSystemListener) d.next()).onAfterIntegrate(this);
        }
        if (this.f4939e != null) {
            this.f4937c.mo1882c();
        }
    }

    /* renamed from: a */
    void m6217a(String str) {
        C1811f c1811f = (C1811f) this.f4935a.get(str);
        if (c1811f == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("springId ");
            stringBuilder.append(str);
            stringBuilder.append(" does not reference a registered spring");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4936b.add(c1811f);
        if (m6218a() != null) {
            this.f4939e = null;
            this.f4937c.mo1881b();
        }
    }
}
