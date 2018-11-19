package com.google.android.gms.internal;

import java.util.Map.Entry;

final class aca<K> implements Entry<K, Object> {
    /* renamed from: a */
    private Entry<K, aby> f15007a;

    private aca(Entry<K, aby> entry) {
        this.f15007a = entry;
    }

    /* renamed from: a */
    public final aby m18862a() {
        return (aby) this.f15007a.getValue();
    }

    public final K getKey() {
        return this.f15007a.getKey();
    }

    public final Object getValue() {
        return ((aby) this.f15007a.getValue()) == null ? null : aby.m27018a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzfhe) {
            return ((aby) this.f15007a.getValue()).m18864a((zzfhe) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
