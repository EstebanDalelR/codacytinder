package com.google.android.m4b.maps.aa;

import java.io.Serializable;

class ab<K, V> extends C4581d<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    /* renamed from: a */
    private K f23625a;
    /* renamed from: b */
    private V f23626b;

    ab(K k, V v) {
        this.f23625a = k;
        this.f23626b = v;
    }

    public final K getKey() {
        return this.f23625a;
    }

    public final V getValue() {
        return this.f23626b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
