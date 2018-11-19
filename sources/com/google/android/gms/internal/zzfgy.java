package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzfgy<K, V> extends LinkedHashMap<K, V> {
    /* renamed from: b */
    private static final zzfgy f16700b;
    /* renamed from: a */
    private boolean f16701a = true;

    static {
        zzfgy zzfgy = new zzfgy();
        f16700b = zzfgy;
        zzfgy.f16701a = false;
    }

    private zzfgy() {
    }

    private zzfgy(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    private static int m20324a(Object obj) {
        if (obj instanceof byte[]) {
            return abx.m18858a((byte[]) obj);
        }
        if (!(obj instanceof zzfga)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private final void m20325c() {
        if (!this.f16701a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final zzfgy<K, V> m20326a() {
        return isEmpty() ? new zzfgy() : new zzfgy(this);
    }

    /* renamed from: a */
    public final void m20327a(zzfgy<K, V> zzfgy) {
        m20325c();
        if (!zzfgy.isEmpty()) {
            putAll(zzfgy);
        }
    }

    /* renamed from: b */
    public final boolean m20328b() {
        return this.f16701a;
    }

    public final void clear() {
        m20325c();
        super.clear();
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            obj = (Map) obj;
            if (this != obj) {
                if (size() == obj.size()) {
                    for (Entry entry : entrySet()) {
                        if (obj.containsKey(entry.getKey())) {
                            boolean equals;
                            Object value = entry.getValue();
                            Object obj2 = obj.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                }
            }
            obj = 1;
            return obj != null;
        }
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += m20324a(entry.getValue()) ^ m20324a(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m20325c();
        abx.m18859a((Object) k);
        abx.m18859a((Object) v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m20325c();
        for (Object next : map.keySet()) {
            abx.m18859a(next);
            abx.m18859a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m20325c();
        return super.remove(obj);
    }
}
