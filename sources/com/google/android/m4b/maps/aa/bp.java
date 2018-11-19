package com.google.android.m4b.maps.aa;

import java.util.Map.Entry;

final class bp<K, V> extends C6372z<K, V> {
    /* renamed from: a */
    private transient K f27200a;
    /* renamed from: b */
    private transient V f27201b;
    /* renamed from: c */
    private transient C6372z<V, K> f27202c;

    /* renamed from: c */
    final boolean mo4780c() {
        return false;
    }

    public final int size() {
        return 1;
    }

    bp(K k, V v) {
        C4583i.m20669a((Object) k, (Object) v);
        this.f27200a = k;
        this.f27201b = v;
    }

    private bp(K k, V v, C6372z<V, K> c6372z) {
        this.f27200a = k;
        this.f27201b = v;
        this.f27202c = c6372z;
    }

    public final V get(Object obj) {
        return this.f27200a.equals(obj) != null ? this.f27201b : null;
    }

    public final boolean containsKey(Object obj) {
        return this.f27200a.equals(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f27201b.equals(obj);
    }

    /* renamed from: b */
    final al<Entry<K, V>> mo4779b() {
        return al.m27700a(ax.m20620a(this.f27200a, this.f27201b));
    }

    /* renamed from: a */
    final al<K> mo4778a() {
        return al.m27700a(this.f27200a);
    }

    /* renamed from: i */
    public final C6372z<V, K> mo7002i() {
        C6372z<V, K> c6372z = this.f27202c;
        if (c6372z != null) {
            return c6372z;
        }
        c6372z = new bp(this.f27201b, this.f27200a, this);
        this.f27202c = c6372z;
        return c6372z;
    }
}
