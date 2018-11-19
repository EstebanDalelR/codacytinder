package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.aa.t */
public abstract class C6368t<K, V> extends C4586u implements Map<K, V> {
    /* renamed from: b */
    protected abstract Map<K, V> mo7017b();

    /* renamed from: c */
    protected /* synthetic */ Object mo4837c() {
        return mo7017b();
    }

    protected C6368t() {
    }

    public int size() {
        return mo7017b().size();
    }

    public boolean isEmpty() {
        return mo7017b().isEmpty();
    }

    public V remove(Object obj) {
        return mo7017b().remove(obj);
    }

    public void clear() {
        mo7017b().clear();
    }

    public boolean containsKey(Object obj) {
        return mo7017b().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo7017b().containsValue(obj);
    }

    public V get(Object obj) {
        return mo7017b().get(obj);
    }

    public V put(K k, V v) {
        return mo7017b().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo7017b().putAll(map);
    }

    public Set<K> keySet() {
        return mo7017b().keySet();
    }

    public Collection<V> values() {
        return mo7017b().values();
    }

    public Set<Entry<K, V>> entrySet() {
        return mo7017b().entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (mo7017b().equals(obj) == null) {
                return null;
            }
        }
        return true;
    }

    public int hashCode() {
        return mo7017b().hashCode();
    }
}
