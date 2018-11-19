package com.google.android.gms.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class adh extends AbstractSet<Entry<K, V>> {
    /* renamed from: a */
    private /* synthetic */ ada f15043a;

    private adh(ada ada) {
        this.f15043a = ada;
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f15043a.m18904a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f15043a.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f15043a.get(entry.getKey());
        obj = entry.getValue();
        if (obj2 != obj) {
            if (obj2 == null || !obj2.equals(obj)) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new adg(this.f15043a, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f15043a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f15043a.size();
    }
}
