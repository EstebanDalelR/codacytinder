package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.Map.Entry;

abstract class ah<K, V> extends al<Entry<K, V>> {

    /* renamed from: com.google.android.m4b.maps.aa.ah$a */
    static class C4542a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private af<K, V> f16863a;

        C4542a(af<K, V> afVar) {
            this.f16863a = afVar;
        }

        final Object readResolve() {
            return this.f16863a.mo6997f();
        }
    }

    /* renamed from: e */
    abstract af<K, V> mo7518e();

    ah() {
    }

    public int size() {
        return mo7518e().size();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object obj2 = mo7518e().get(entry.getKey());
        if (obj2 == null || obj2.equals(entry.getValue()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    final boolean mo4791d() {
        return mo7518e().mo4780c();
    }

    Object writeReplace() {
        return new C4542a(mo7518e());
    }
}
