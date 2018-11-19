package com.google.i18n.phonenumbers.internal;

import com.google.i18n.phonenumbers.internal.C5628b.C5627a;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

class RegexCache$LRUCache$1 extends LinkedHashMap<K, V> {
    /* renamed from: a */
    final /* synthetic */ C5627a f20895a;

    RegexCache$LRUCache$1(C5627a c5627a, int i, float f, boolean z) {
        this.f20895a = c5627a;
        super(i, f, z);
    }

    protected boolean removeEldestEntry(Entry<K, V> entry) {
        return size() > this.f20895a.f20897b ? true : null;
    }
}
