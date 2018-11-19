package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.aa.C4536b;
import com.google.android.m4b.maps.aa.ag.C8041a;
import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class af<K, V> implements Serializable, Map<K, V> {
    /* renamed from: a */
    private static final Entry<?, ?>[] f16859a = new Entry[0];
    /* renamed from: b */
    private transient al<Entry<K, V>> f16860b;
    /* renamed from: c */
    private transient al<K> f16861c;
    /* renamed from: d */
    private transient aa<V> f16862d;

    /* renamed from: com.google.android.m4b.maps.aa.af$a */
    public static class C4540a<K, V> {
        /* renamed from: a */
        C8041a<K, V>[] f16855a;
        /* renamed from: b */
        int f16856b;

        public C4540a() {
            this(4);
        }

        private C4540a(int i) {
            this.f16855a = new C8041a[4];
            this.f16856b = 0;
        }

        /* renamed from: a */
        private void m20482a(int i) {
            if (i > this.f16855a.length) {
                this.f16855a = (C8041a[]) bb.m20640b(this.f16855a, C4536b.m20472a(this.f16855a.length, i));
            }
        }

        /* renamed from: a */
        public C4540a<K, V> mo4792a(K k, V v) {
            m20482a(this.f16856b + 1);
            k = af.m20491b(k, v);
            v = this.f16855a;
            int i = this.f16856b;
            this.f16856b = i + 1;
            v[i] = k;
            return this;
        }

        /* renamed from: a */
        public C4540a<K, V> mo4793a(Entry<? extends K, ? extends V> entry) {
            return mo4792a(entry.getKey(), entry.getValue());
        }

        /* renamed from: a */
        public C4540a<K, V> mo4794a(Map<? extends K, ? extends V> map) {
            m20482a(this.f16856b + map.size());
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                mo4793a((Entry) map.next());
            }
            return this;
        }

        /* renamed from: a */
        public af<K, V> mo4795a() {
            switch (this.f16856b) {
                case 0:
                    return af.m20492d();
                case 1:
                    return af.m20488a(this.f16855a[0].getKey(), this.f16855a[0].getValue());
                default:
                    return new bh(this.f16856b, this.f16855a);
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.af$b */
    static class C4541b implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private final Object[] f16857a;
        /* renamed from: b */
        private final Object[] f16858b;

        C4541b(af<?, ?> afVar) {
            this.f16857a = new Object[afVar.size()];
            this.f16858b = new Object[afVar.size()];
            afVar = afVar.mo6997f().iterator();
            int i = 0;
            while (afVar.hasNext()) {
                Entry entry = (Entry) afVar.next();
                this.f16857a[i] = entry.getKey();
                this.f16858b[i] = entry.getValue();
                i++;
            }
        }

        Object readResolve() {
            return m20487a(new C4540a());
        }

        /* renamed from: a */
        final Object m20487a(C4540a<Object, Object> c4540a) {
            for (int i = 0; i < this.f16857a.length; i++) {
                c4540a.mo4792a(this.f16857a[i], this.f16858b[i]);
            }
            return c4540a.mo4795a();
        }
    }

    /* renamed from: b */
    abstract al<Entry<K, V>> mo4779b();

    /* renamed from: c */
    abstract boolean mo4780c();

    public abstract V get(Object obj);

    public /* synthetic */ Set entrySet() {
        return mo6997f();
    }

    public /* synthetic */ Set keySet() {
        return mo6998g();
    }

    public /* synthetic */ Collection values() {
        return mo4838h();
    }

    /* renamed from: d */
    public static <K, V> af<K, V> m20492d() {
        return C6372z.m27852j();
    }

    /* renamed from: a */
    public static <K, V> af<K, V> m20488a(K k, V v) {
        return C6372z.m27851c(k, v);
    }

    /* renamed from: b */
    static <K, V> C8041a<K, V> m20491b(K k, V v) {
        C4583i.m20669a((Object) k, (Object) v);
        return new C8041a(k, v);
    }

    /* renamed from: e */
    public static <K, V> C4540a<K, V> m20493e() {
        return new C4540a();
    }

    /* renamed from: a */
    static void m20490a(boolean z, String str, Entry<?, ?> entry, Entry<?, ?> entry2) {
        if (!z) {
            StringBuilder stringBuilder = new StringBuilder("Multiple entries with same ");
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(entry);
            stringBuilder.append(" and ");
            stringBuilder.append(entry2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static <K, V> af<K, V> m20489a(Map<? extends K, ? extends V> map) {
        if ((map instanceof af) && !(map instanceof ao)) {
            af<K, V> afVar = (af) map;
            if (!afVar.mo4780c()) {
                return afVar;
            }
        } else if (map instanceof EnumMap) {
            EnumMap enumMap = new EnumMap((EnumMap) map);
            map = enumMap.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                C4583i.m20669a(entry.getKey(), entry.getValue());
            }
            return ac.m27675a(enumMap);
        }
        Entry[] entryArr = (Entry[]) map.entrySet().toArray(f16859a);
        switch (entryArr.length) {
            case 0:
                return C6372z.m27852j();
            case 1:
                map = entryArr[0];
                return C6372z.m27851c(map.getKey(), map.getValue());
            default:
                return new bh(entryArr);
        }
    }

    af() {
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null ? true : null;
    }

    public boolean containsValue(Object obj) {
        return mo4838h().contains(obj);
    }

    /* renamed from: f */
    public al<Entry<K, V>> mo6997f() {
        al<Entry<K, V>> alVar = this.f16860b;
        if (alVar != null) {
            return alVar;
        }
        alVar = mo4779b();
        this.f16860b = alVar;
        return alVar;
    }

    /* renamed from: g */
    public al<K> mo6998g() {
        al<K> alVar = this.f16861c;
        if (alVar != null) {
            return alVar;
        }
        alVar = mo4778a();
        this.f16861c = alVar;
        return alVar;
    }

    /* renamed from: a */
    al<K> mo4778a() {
        return new ai(this);
    }

    /* renamed from: h */
    public aa<V> mo4838h() {
        aa<V> aaVar = this.f16862d;
        if (aaVar != null) {
            return aaVar;
        }
        aaVar = new aj(this);
        this.f16862d = aaVar;
        return aaVar;
    }

    public boolean equals(Object obj) {
        return ax.m20629d(this, obj);
    }

    public int hashCode() {
        return mo6997f().hashCode();
    }

    public String toString() {
        return ax.m20622b((Map) this);
    }

    Object writeReplace() {
        return new C4541b(this);
    }
}
