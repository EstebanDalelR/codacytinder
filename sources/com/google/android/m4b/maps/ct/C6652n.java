package com.google.android.m4b.maps.ct;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.m4b.maps.ct.n */
public final class C6652n extends C5277o {
    /* renamed from: b */
    private final C6656q f24936b;

    /* renamed from: com.google.android.m4b.maps.ct.n$a */
    static class C5275a<K> implements Entry<K, Object> {
        /* renamed from: a */
        private Entry<K, C6652n> f19597a;

        private C5275a(Entry<K, C6652n> entry) {
            this.f19597a = entry;
        }

        public final K getKey() {
            return this.f19597a.getKey();
        }

        public final Object getValue() {
            C6652n c6652n = (C6652n) this.f19597a.getValue();
            if (c6652n == null) {
                return null;
            }
            return c6652n.m29684b();
        }

        public final Object setValue(Object obj) {
            if (obj instanceof C6656q) {
                return ((C6652n) this.f19597a.getValue()).m23425b((C6656q) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.n$b */
    static class C5276b<K> implements Iterator<Entry<K, Object>> {
        /* renamed from: a */
        private Iterator<Entry<K, Object>> f19598a;

        public C5276b(Iterator<Entry<K, Object>> it) {
            this.f19598a = it;
        }

        public final boolean hasNext() {
            return this.f19598a.hasNext();
        }

        public final void remove() {
            this.f19598a.remove();
        }

        public final /* synthetic */ Object next() {
            Entry entry = (Entry) this.f19598a.next();
            return entry.getValue() instanceof C6652n ? new C5275a(entry) : entry;
        }
    }

    /* renamed from: a */
    public final boolean mo5377a() {
        if (!super.mo5377a()) {
            if (this.a != this.f24936b) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final C6656q m29684b() {
        return m23421a(this.f24936b);
    }

    public final int hashCode() {
        return m29684b().hashCode();
    }

    public final boolean equals(Object obj) {
        return m29684b().equals(obj);
    }

    public final String toString() {
        return m29684b().toString();
    }
}
