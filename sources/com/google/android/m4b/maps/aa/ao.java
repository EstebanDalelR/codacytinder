package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.ae.C7397a;
import com.google.android.m4b.maps.aa.af.C4540a;
import com.google.android.m4b.maps.aa.af.C4541b;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public abstract class ao<K, V> extends ap<K, V> implements SortedMap<K, V> {
    /* renamed from: a */
    private static final Comparator<Comparable> f27150a = bc.m20643b();
    /* renamed from: b */
    private static final ao<Comparable, Object> f27151b = new C8060o(f27150a);
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.android.m4b.maps.aa.ao$a */
    public static class C6310a<K, V> extends C4540a<K, V> {
        /* renamed from: c */
        private final Comparator<? super K> f23632c;

        public C6310a(Comparator<? super K> comparator) {
            this.f23632c = (Comparator) C5571j.m24292a((Object) comparator);
        }

        /* renamed from: a */
        public final /* synthetic */ af mo4795a() {
            return ao.m31865a(this.f23632c, false, this.b, this.a);
        }

        /* renamed from: a */
        public final /* synthetic */ C4540a mo4794a(Map map) {
            super.mo4794a(map);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C4540a mo4793a(Entry entry) {
            super.mo4793a(entry);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C4540a mo4792a(Object obj, Object obj2) {
            super.mo4792a(obj, obj2);
            return this;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.ao$b */
    static class C6311b extends C4541b {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Comparator<Object> f23633a;

        C6311b(ao<?, ?> aoVar) {
            super(aoVar);
            this.f23633a = aoVar.comparator();
        }

        final Object readResolve() {
            return m20487a(new C6310a(this.f23633a));
        }
    }

    /* renamed from: a */
    public abstract ao<K, V> mo7532a(K k, boolean z);

    /* renamed from: b */
    public abstract ao<K, V> mo7533b(K k, boolean z);

    /* renamed from: h */
    public abstract aa<V> mo4838h();

    /* renamed from: i */
    public abstract aq<K> mo7534i();

    public /* synthetic */ Set entrySet() {
        return mo6997f();
    }

    /* renamed from: g */
    public /* synthetic */ al mo6998g() {
        return mo7534i();
    }

    public /* synthetic */ Set keySet() {
        return mo7534i();
    }

    public /* synthetic */ Collection values() {
        return mo4838h();
    }

    /* renamed from: a */
    static <K, V> ao<K, V> m31864a(Comparator<? super K> comparator) {
        if (bc.m20643b().equals(comparator)) {
            return f27151b;
        }
        return new C8060o(comparator);
    }

    /* renamed from: a */
    static <K, V> ao<K, V> m31863a(aq<K> aqVar, ae<V> aeVar) {
        if (aqVar.isEmpty()) {
            return m31864a(aqVar.comparator());
        }
        return new bj((bk) aqVar, aeVar);
    }

    /* renamed from: a */
    static <K, V> ao<K, V> m31865a(Comparator<? super K> comparator, boolean z, int i, Entry<K, V>... entryArr) {
        z = false;
        for (int i2 = 0; i2 < i; i2++) {
            Entry entry = entryArr[i2];
            entryArr[i2] = af.m20491b(entry.getKey(), entry.getValue());
        }
        Arrays.sort(entryArr, 0, i, bc.m20642a((Comparator) comparator).m20646a(ax.m20615a()));
        for (int i3 = 1; i3 < i; i3++) {
            int i4 = i3 - 1;
            af.m20490a(comparator.compare(entryArr[i4].getKey(), entryArr[i3].getKey()) != 0, "key", entryArr[i4], entryArr[i3]);
        }
        if (i == 0) {
            return m31864a(comparator);
        }
        C7397a g = ae.m27686g();
        C7397a g2 = ae.m27686g();
        while (z < i) {
            Entry entry2 = entryArr[z];
            g.m31831c(entry2.getKey());
            g2.m31831c(entry2.getValue());
            z++;
        }
        return new bj(new bk(g.m31828a(), comparator), g2.m31828a());
    }

    ao() {
    }

    public int size() {
        return mo4838h().size();
    }

    public boolean containsValue(Object obj) {
        return mo4838h().contains(obj);
    }

    /* renamed from: c */
    boolean mo4780c() {
        if (!mo7534i().mo4791d()) {
            if (!mo4838h().mo4791d()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public al<Entry<K, V>> mo6997f() {
        return super.mo6997f();
    }

    public Comparator<? super K> comparator() {
        return mo7534i().comparator();
    }

    public K firstKey() {
        return mo7534i().first();
    }

    public K lastKey() {
        return mo7534i().last();
    }

    Object writeReplace() {
        return new C6311b(this);
    }

    public /* synthetic */ SortedMap tailMap(Object obj) {
        return mo7533b(obj, true);
    }

    public /* synthetic */ SortedMap headMap(Object obj) {
        return mo7532a(obj, false);
    }

    public /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        C5571j.m24292a(obj);
        C5571j.m24292a(obj2);
        C5571j.m24299a(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return mo7532a(obj2, false).mo7533b(obj, true);
    }
}
