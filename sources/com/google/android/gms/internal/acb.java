package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map.Entry;

final class acb<K> implements Iterator<Entry<K, Object>> {
    /* renamed from: a */
    private Iterator<Entry<K, Object>> f15008a;

    public acb(Iterator<Entry<K, Object>> it) {
        this.f15008a = it;
    }

    public final boolean hasNext() {
        return this.f15008a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f15008a.next();
        return entry.getValue() instanceof aby ? new aca(entry) : entry;
    }

    public final void remove() {
        this.f15008a.remove();
    }
}
