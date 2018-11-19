package com.google.android.m4b.maps.aa;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.m4b.maps.aa.s */
public abstract class C7421s<K, V> extends C6368t<K, V> implements ConcurrentMap<K, V> {
    /* renamed from: a */
    protected abstract ConcurrentMap<K, V> mo7531a();

    /* renamed from: b */
    protected /* synthetic */ Map mo7017b() {
        return mo7531a();
    }

    /* renamed from: c */
    protected /* synthetic */ Object mo4837c() {
        return mo7531a();
    }

    protected C7421s() {
    }

    public V putIfAbsent(K k, V v) {
        return mo7531a().putIfAbsent(k, v);
    }

    public boolean remove(Object obj, Object obj2) {
        return mo7531a().remove(obj, obj2);
    }

    public V replace(K k, V v) {
        return mo7531a().replace(k, v);
    }

    public boolean replace(K k, V v, V v2) {
        return mo7531a().replace(k, v, v2);
    }
}
