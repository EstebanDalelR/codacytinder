package com.google.android.m4b.maps.bv;

import java.util.HashMap;

/* renamed from: com.google.android.m4b.maps.bv.j */
public class C4933j<Key, Value> {
    /* renamed from: a */
    protected final int f18193a;
    /* renamed from: b */
    private final HashMap<Key, C4932a<Key, Value>> f18194b = new HashMap();
    /* renamed from: c */
    private C4932a<Key, Value> f18195c;
    /* renamed from: d */
    private C4932a<Key, Value> f18196d;

    /* renamed from: com.google.android.m4b.maps.bv.j$a */
    static class C4932a<K, V> {
        /* renamed from: a */
        public C4932a<K, V> f18189a;
        /* renamed from: b */
        public C4932a<K, V> f18190b;
        /* renamed from: c */
        public K f18191c;
        /* renamed from: d */
        public V f18192d;

        C4932a() {
        }
    }

    /* renamed from: a */
    protected void mo5201a(Key key, Value value) {
    }

    public C4933j(int i) {
        this.f18193a = i;
    }

    /* renamed from: b */
    public final void m22107b() {
        m22101a(0);
    }

    /* renamed from: b */
    public final void m22108b(Key key, Value value) {
        C4932a c4932a = (C4932a) this.f18194b.get(key);
        if (c4932a == null) {
            m22101a(this.f18193a - 1);
        }
        C4932a c4932a2 = new C4932a();
        c4932a2.f18192d = value;
        c4932a2.f18191c = key;
        if (c4932a != null) {
            m22103b(c4932a);
            mo5201a(key, c4932a.f18192d);
        }
        this.f18194b.put(c4932a2.f18191c, c4932a2);
        m22102a(c4932a2);
    }

    /* renamed from: a */
    public final Value m22104a(Key key) {
        C4932a c4932a = (C4932a) this.f18194b.get(key);
        if (c4932a == null) {
            return null;
        }
        m22103b(c4932a);
        m22102a(c4932a);
        return c4932a.f18192d;
    }

    /* renamed from: b */
    public final Value m22106b(Key key) {
        C4932a c4932a = (C4932a) this.f18194b.remove(key);
        if (c4932a == null) {
            return null;
        }
        m22103b(c4932a);
        mo5201a(key, c4932a.f18192d);
        return c4932a.f18192d;
    }

    /* renamed from: a */
    private void m22101a(int i) {
        while (this.f18194b.size() > i) {
            m22106b(this.f18195c.f18191c);
        }
    }

    /* renamed from: a */
    private void m22102a(C4932a<Key, Value> c4932a) {
        if (this.f18196d == null) {
            this.f18195c = c4932a;
            this.f18196d = c4932a;
            return;
        }
        C4932a c4932a2 = this.f18196d;
        c4932a.f18189a = c4932a2;
        c4932a2.f18190b = c4932a;
        this.f18196d = c4932a;
    }

    /* renamed from: b */
    private void m22103b(C4932a<Key, Value> c4932a) {
        C4932a c4932a2 = c4932a.f18189a;
        C4932a c4932a3 = c4932a.f18190b;
        if (c4932a2 != null) {
            c4932a2.f18190b = c4932a3;
        }
        if (c4932a3 != null) {
            c4932a3.f18189a = c4932a2;
        }
        c4932a.f18189a = null;
        c4932a.f18190b = null;
        if (this.f18195c == c4932a) {
            this.f18195c = c4932a3;
        }
        if (this.f18196d == c4932a) {
            this.f18196d = c4932a2;
        }
    }

    /* renamed from: c */
    protected final void m22109c() {
        m22101a(this.f18193a - 1);
    }
}
