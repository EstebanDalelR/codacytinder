package com.squareup.okhttp.internal;

import com.squareup.okhttp.C6077u;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.squareup.okhttp.internal.h */
public final class C6041h {
    /* renamed from: a */
    private final Set<C6077u> f22137a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void m26119a(C6077u c6077u) {
        this.f22137a.add(c6077u);
    }

    /* renamed from: b */
    public synchronized void m26120b(C6077u c6077u) {
        this.f22137a.remove(c6077u);
    }

    /* renamed from: c */
    public synchronized boolean m26121c(C6077u c6077u) {
        return this.f22137a.contains(c6077u);
    }
}
