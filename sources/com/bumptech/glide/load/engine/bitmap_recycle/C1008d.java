package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.d */
class C1008d<K extends C1012g, V> {
    /* renamed from: a */
    private final C1007a<K, V> f2816a = new C1007a();
    /* renamed from: b */
    private final Map<K, C1007a<K, V>> f2817b = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.d$a */
    private static class C1007a<K, V> {
        /* renamed from: a */
        C1007a<K, V> f2812a;
        /* renamed from: b */
        C1007a<K, V> f2813b;
        /* renamed from: c */
        private final K f2814c;
        /* renamed from: d */
        private List<V> f2815d;

        public C1007a() {
            this(null);
        }

        public C1007a(K k) {
            this.f2813b = this;
            this.f2812a = this;
            this.f2814c = k;
        }

        /* renamed from: a */
        public V m3530a() {
            int b = m3532b();
            return b > 0 ? this.f2815d.remove(b - 1) : null;
        }

        /* renamed from: b */
        public int m3532b() {
            return this.f2815d != null ? this.f2815d.size() : 0;
        }

        /* renamed from: a */
        public void m3531a(V v) {
            if (this.f2815d == null) {
                this.f2815d = new ArrayList();
            }
            this.f2815d.add(v);
        }
    }

    C1008d() {
    }

    /* renamed from: a */
    public void m3539a(K k, V v) {
        C1007a c1007a = (C1007a) this.f2817b.get(k);
        if (c1007a == null) {
            c1007a = new C1007a(k);
            m3534b(c1007a);
            this.f2817b.put(k, c1007a);
        } else {
            k.mo1280a();
        }
        c1007a.m3531a((Object) v);
    }

    /* renamed from: a */
    public V m3538a(K k) {
        C1007a c1007a = (C1007a) this.f2817b.get(k);
        if (c1007a == null) {
            c1007a = new C1007a(k);
            this.f2817b.put(k, c1007a);
        } else {
            k.mo1280a();
        }
        m3533a(c1007a);
        return c1007a.m3530a();
    }

    /* renamed from: a */
    public V m3537a() {
        for (C1007a c1007a = this.f2816a.f2813b; !c1007a.equals(this.f2816a); c1007a = c1007a.f2813b) {
            V a = c1007a.m3530a();
            if (a != null) {
                return a;
            }
            C1008d.m3536d(c1007a);
            this.f2817b.remove(c1007a.f2814c);
            ((C1012g) c1007a.f2814c).mo1280a();
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        Object obj = null;
        for (C1007a c1007a = this.f2816a.f2812a; !c1007a.equals(this.f2816a); c1007a = c1007a.f2812a) {
            obj = 1;
            stringBuilder.append('{');
            stringBuilder.append(c1007a.f2814c);
            stringBuilder.append(':');
            stringBuilder.append(c1007a.m3532b());
            stringBuilder.append("}, ");
        }
        if (obj != null) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private void m3533a(C1007a<K, V> c1007a) {
        C1008d.m3536d(c1007a);
        c1007a.f2813b = this.f2816a;
        c1007a.f2812a = this.f2816a.f2812a;
        C1008d.m3535c(c1007a);
    }

    /* renamed from: b */
    private void m3534b(C1007a<K, V> c1007a) {
        C1008d.m3536d(c1007a);
        c1007a.f2813b = this.f2816a.f2813b;
        c1007a.f2812a = this.f2816a;
        C1008d.m3535c(c1007a);
    }

    /* renamed from: c */
    private static <K, V> void m3535c(C1007a<K, V> c1007a) {
        c1007a.f2812a.f2813b = c1007a;
        c1007a.f2813b.f2812a = c1007a;
    }

    /* renamed from: d */
    private static <K, V> void m3536d(C1007a<K, V> c1007a) {
        c1007a.f2813b.f2812a = c1007a.f2812a;
        c1007a.f2812a.f2813b = c1007a.f2813b;
    }
}
