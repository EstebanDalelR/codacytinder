package com.google.android.gms.internal;

import java.util.Map.Entry;

final class adf implements Comparable<adf>, Entry<K, V> {
    /* renamed from: a */
    private final K f15036a;
    /* renamed from: b */
    private V f15037b;
    /* renamed from: c */
    private /* synthetic */ ada f15038c;

    adf(ada ada, K k, V v) {
        this.f15038c = ada;
        this.f15036a = k;
        this.f15037b = v;
    }

    adf(ada ada, Entry<K, V> entry) {
        this(ada, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m18912a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((adf) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m18912a(this.f15036a, entry.getKey()) && m18912a(this.f15037b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f15036a;
    }

    public final V getValue() {
        return this.f15037b;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f15036a == null ? 0 : this.f15036a.hashCode();
        if (this.f15037b != null) {
            i = this.f15037b.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f15038c.m18902e();
        V v2 = this.f15037b;
        this.f15037b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15036a);
        String valueOf2 = String.valueOf(this.f15037b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append("=");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }
}
