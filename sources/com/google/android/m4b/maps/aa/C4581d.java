package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5569h;
import java.util.Map.Entry;

/* renamed from: com.google.android.m4b.maps.aa.d */
abstract class C4581d<K, V> implements Entry<K, V> {
    public abstract K getKey();

    public abstract V getValue();

    C4581d() {
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (!C5569h.m24284a(getKey(), entry.getKey()) || C5569h.m24284a(getValue(), entry.getValue()) == null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getKey());
        stringBuilder.append("=");
        stringBuilder.append(getValue());
        return stringBuilder.toString();
    }
}
