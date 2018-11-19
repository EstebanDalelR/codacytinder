package com.google.android.m4b.maps.p126z;

import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Map.Entry;

/* renamed from: com.google.android.m4b.maps.z.m */
public final class C5604m<K, V> implements Entry<K, V> {
    /* renamed from: a */
    private final K f20692a;
    /* renamed from: b */
    private final V f20693b;
    /* renamed from: c */
    private final C5602k f20694c;

    C5604m(K k, V v, C5602k c5602k) {
        this.f20692a = k;
        this.f20693b = v;
        this.f20694c = (C5602k) C5571j.m24292a((Object) c5602k);
    }

    public final K getKey() {
        return this.f20692a;
    }

    public final V getValue() {
        return this.f20693b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (!C5569h.m24284a(getKey(), entry.getKey()) || C5569h.m24284a(getValue(), entry.getValue()) == null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
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

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getKey());
        stringBuilder.append("=");
        stringBuilder.append(getValue());
        return stringBuilder.toString();
    }
}
