package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.aa.o */
final class C8060o<K, V> extends ao<K, V> {
    /* renamed from: a */
    private final transient aq<K> f28869a;

    /* renamed from: c */
    final boolean mo4780c() {
        return false;
    }

    public final V get(Object obj) {
        return null;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    C8060o(Comparator<? super K> comparator) {
        this.f28869a = aq.m34143a(comparator);
    }

    /* renamed from: i */
    public final aq<K> mo7534i() {
        return this.f28869a;
    }

    /* renamed from: h */
    public final aa<V> mo4838h() {
        return ae.m27685e();
    }

    /* renamed from: f */
    public final al<Entry<K, V>> mo6997f() {
        return al.m27704f();
    }

    /* renamed from: b */
    final al<Entry<K, V>> mo4779b() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: a */
    public final ao<K, V> mo7532a(K k, boolean z) {
        C5571j.m24292a((Object) k);
        return this;
    }

    /* renamed from: b */
    public final ao<K, V> mo7533b(K k, boolean z) {
        C5571j.m24292a((Object) k);
        return this;
    }

    public final /* synthetic */ Set entrySet() {
        return al.m27704f();
    }

    public final /* synthetic */ Collection values() {
        return ae.m27685e();
    }

    public final /* synthetic */ Set keySet() {
        return this.f28869a;
    }

    /* renamed from: g */
    public final /* synthetic */ al mo6998g() {
        return this.f28869a;
    }
}
