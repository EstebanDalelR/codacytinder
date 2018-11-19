package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.ax.C4567c;
import com.google.android.m4b.maps.aa.ax.C6346b;
import com.google.android.m4b.maps.aa.ax.C6347d;
import com.google.android.m4b.maps.p125y.C5571j;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.m4b.maps.aa.c */
abstract class C7418c<K, V> extends C6362e<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    /* renamed from: a */
    private transient Map<K, Collection<V>> f27211a;
    /* renamed from: b */
    private transient int f27212b;

    /* renamed from: com.google.android.m4b.maps.aa.c$f */
    class C4580f extends AbstractCollection<V> {
        /* renamed from: a */
        final K f16983a;
        /* renamed from: b */
        Collection<V> f16984b;
        /* renamed from: c */
        final C4580f f16985c;
        /* renamed from: d */
        final /* synthetic */ C7418c f16986d;
        /* renamed from: e */
        private Collection<V> f16987e;

        /* renamed from: com.google.android.m4b.maps.aa.c$f$a */
        class C4579a implements Iterator<V> {
            /* renamed from: a */
            final Iterator<V> f16980a;
            /* renamed from: b */
            private Collection<V> f16981b = this.f16982c.f16984b;
            /* renamed from: c */
            private /* synthetic */ C4580f f16982c;

            C4579a(C4580f c4580f) {
                this.f16982c = c4580f;
                this.f16980a = C7418c.m31963a(c4580f.f16986d, c4580f.f16984b);
            }

            C4579a(C4580f c4580f, Iterator<V> it) {
                this.f16982c = c4580f;
                this.f16980a = it;
            }

            /* renamed from: a */
            final void m20664a() {
                this.f16982c.m20665a();
                if (this.f16982c.f16984b != this.f16981b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                m20664a();
                return this.f16980a.hasNext();
            }

            public V next() {
                m20664a();
                return this.f16980a.next();
            }

            public void remove() {
                this.f16980a.remove();
                this.f16982c.f16986d.f27212b = this.f16982c.f16986d.f27212b - 1;
                this.f16982c.m20666b();
            }
        }

        C4580f(C7418c c7418c, K k, Collection<V> collection, C4580f c4580f) {
            this.f16986d = c7418c;
            this.f16983a = k;
            this.f16984b = collection;
            this.f16985c = c4580f;
            this.f16987e = c4580f == null ? null : c4580f.f16984b;
        }

        /* renamed from: a */
        final void m20665a() {
            if (this.f16985c != null) {
                this.f16985c.m20665a();
                if (this.f16985c.f16984b != this.f16987e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f16984b.isEmpty()) {
                Collection collection = (Collection) this.f16986d.f27211a.get(this.f16983a);
                if (collection != null) {
                    this.f16984b = collection;
                }
            }
        }

        /* renamed from: b */
        final void m20666b() {
            if (this.f16985c != null) {
                this.f16985c.m20666b();
                return;
            }
            if (this.f16984b.isEmpty()) {
                this.f16986d.f27211a.remove(this.f16983a);
            }
        }

        /* renamed from: c */
        final void m20667c() {
            if (this.f16985c != null) {
                this.f16985c.m20667c();
            } else {
                this.f16986d.f27211a.put(this.f16983a, this.f16984b);
            }
        }

        public int size() {
            m20665a();
            return this.f16984b.size();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m20665a();
            return this.f16984b.equals(obj);
        }

        public int hashCode() {
            m20665a();
            return this.f16984b.hashCode();
        }

        public String toString() {
            m20665a();
            return this.f16984b.toString();
        }

        public Iterator<V> iterator() {
            m20665a();
            return new C4579a(this);
        }

        public boolean add(V v) {
            m20665a();
            boolean isEmpty = this.f16984b.isEmpty();
            v = this.f16984b.add(v);
            if (v != null) {
                this.f16986d.f27212b = this.f16986d.f27212b + 1;
                if (isEmpty) {
                    m20667c();
                }
            }
            return v;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return null;
            }
            int size = size();
            collection = this.f16984b.addAll(collection);
            if (collection != null) {
                C7418c.m31961a(this.f16986d, this.f16984b.size() - size);
                if (size == 0) {
                    m20667c();
                }
            }
            return collection;
        }

        public boolean contains(Object obj) {
            m20665a();
            return this.f16984b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            m20665a();
            return this.f16984b.containsAll(collection);
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f16984b.clear();
                C7418c.m31968b(this.f16986d, size);
                m20666b();
            }
        }

        public boolean remove(Object obj) {
            m20665a();
            obj = this.f16984b.remove(obj);
            if (obj != null) {
                this.f16986d.f27212b = this.f16986d.f27212b - 1;
                m20666b();
            }
            return obj;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return null;
            }
            int size = size();
            collection = this.f16984b.removeAll(collection);
            if (collection != null) {
                C7418c.m31961a(this.f16986d, this.f16984b.size() - size);
                m20666b();
            }
            return collection;
        }

        public boolean retainAll(Collection<?> collection) {
            C5571j.m24292a((Object) collection);
            int size = size();
            collection = this.f16984b.retainAll(collection);
            if (collection != null) {
                C7418c.m31961a(this.f16986d, this.f16984b.size() - size);
                m20666b();
            }
            return collection;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.c$a */
    class C6357a extends C4567c<K, Collection<V>> {
        /* renamed from: a */
        final transient Map<K, Collection<V>> f23683a;
        /* renamed from: b */
        final /* synthetic */ C7418c f23684b;

        /* renamed from: com.google.android.m4b.maps.aa.c$a$b */
        class C4577b implements Iterator<Entry<K, Collection<V>>> {
            /* renamed from: a */
            private Iterator<Entry<K, Collection<V>>> f16974a = this.f16976c.f23683a.entrySet().iterator();
            /* renamed from: b */
            private Collection<V> f16975b;
            /* renamed from: c */
            private /* synthetic */ C6357a f16976c;

            C4577b(C6357a c6357a) {
                this.f16976c = c6357a;
            }

            public final boolean hasNext() {
                return this.f16974a.hasNext();
            }

            public final void remove() {
                this.f16974a.remove();
                C7418c.m31968b(this.f16976c.f23684b, this.f16975b.size());
                this.f16975b.clear();
            }

            public final /* synthetic */ Object next() {
                Entry entry = (Entry) this.f16974a.next();
                this.f16975b = (Collection) entry.getValue();
                C6357a c6357a = this.f16976c;
                Object key = entry.getKey();
                return ax.m20620a(key, c6357a.f23684b.m31971a(key, (Collection) entry.getValue()));
            }
        }

        /* renamed from: com.google.android.m4b.maps.aa.c$a$a */
        class C7414a extends C6346b<K, Collection<V>> {
            /* renamed from: a */
            private /* synthetic */ C6357a f27206a;

            C7414a(C6357a c6357a) {
                this.f27206a = c6357a;
            }

            /* renamed from: a */
            final Map<K, Collection<V>> mo7008a() {
                return this.f27206a;
            }

            public final Iterator<Entry<K, Collection<V>>> iterator() {
                return new C4577b(this.f27206a);
            }

            public final boolean contains(Object obj) {
                return C4584j.m20672a(this.f27206a.f23683a.entrySet(), obj);
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return null;
                }
                C7418c.m31962a(this.f27206a.f23684b, ((Entry) obj).getKey());
                return true;
            }
        }

        C6357a(C7418c c7418c, Map<K, Collection<V>> map) {
            this.f23684b = c7418c;
            this.f23683a = map;
        }

        /* renamed from: a */
        protected final Set<Entry<K, Collection<V>>> mo4831a() {
            return new C7414a(this);
        }

        public boolean containsKey(Object obj) {
            return ax.m20625b(this.f23683a, obj);
        }

        public Set<K> keySet() {
            return this.f23684b.mo6991c();
        }

        public int size() {
            return this.f23683a.size();
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (this.f23683a.equals(obj) == null) {
                    return null;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.f23683a.hashCode();
        }

        public String toString() {
            return this.f23683a.toString();
        }

        public void clear() {
            if (this.f23683a == this.f23684b.f27211a) {
                this.f23684b.m31976e();
            } else {
                at.m20518d(new C4577b(this));
            }
        }

        public /* synthetic */ Object remove(Object obj) {
            Collection collection = (Collection) this.f23683a.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection d = this.f23684b.mo7523d();
            d.addAll(collection);
            C7418c.m31968b(this.f23684b, collection.size());
            collection.clear();
            return d;
        }

        public /* synthetic */ Object get(Object obj) {
            Collection collection = (Collection) ax.m20616a(this.f23683a, obj);
            if (collection == null) {
                return null;
            }
            return this.f23684b.m31971a(obj, collection);
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.c$g */
    class C6359g extends C4580f implements List<V> {
        /* renamed from: e */
        final /* synthetic */ C7418c f23686e;

        /* renamed from: com.google.android.m4b.maps.aa.c$g$a */
        class C6358a extends C4579a implements ListIterator<V> {
            /* renamed from: b */
            private /* synthetic */ C6359g f23685b;

            C6358a(C6359g c6359g) {
                this.f23685b = c6359g;
                super(c6359g);
            }

            public C6358a(C6359g c6359g, int i) {
                this.f23685b = c6359g;
                super(c6359g, c6359g.m27835d().listIterator(i));
            }

            public final boolean hasPrevious() {
                return m27834b().hasPrevious();
            }

            public final V previous() {
                return m27834b().previous();
            }

            public final int nextIndex() {
                return m27834b().nextIndex();
            }

            public final int previousIndex() {
                return m27834b().previousIndex();
            }

            public final void set(V v) {
                m27834b().set(v);
            }

            public final void add(V v) {
                boolean isEmpty = this.f23685b.isEmpty();
                m27834b().add(v);
                this.f23685b.f23686e.f27212b = this.f23685b.f23686e.f27212b + 1;
                if (isEmpty) {
                    this.f23685b.m20667c();
                }
            }

            /* renamed from: b */
            private ListIterator<V> m27834b() {
                m20664a();
                return (ListIterator) this.f16980a;
            }
        }

        C6359g(C7418c c7418c, K k, List<V> list, C4580f c4580f) {
            this.f23686e = c7418c;
            super(c7418c, k, list, c4580f);
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            i = m27835d().addAll(i, collection);
            if (i != 0) {
                C7418c.m31961a(this.f23686e, this.f16984b.size() - size);
                if (size == 0) {
                    m20667c();
                }
            }
            return i;
        }

        public V get(int i) {
            m20665a();
            return m27835d().get(i);
        }

        public V set(int i, V v) {
            m20665a();
            return m27835d().set(i, v);
        }

        public void add(int i, V v) {
            m20665a();
            boolean isEmpty = this.f16984b.isEmpty();
            m27835d().add(i, v);
            this.f23686e.f27212b = this.f23686e.f27212b + 1;
            if (isEmpty) {
                m20667c();
            }
        }

        public V remove(int i) {
            m20665a();
            i = m27835d().remove(i);
            this.f23686e.f27212b = this.f23686e.f27212b - 1;
            m20666b();
            return i;
        }

        public int indexOf(Object obj) {
            m20665a();
            return m27835d().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            m20665a();
            return m27835d().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            m20665a();
            return new C6358a(this);
        }

        public ListIterator<V> listIterator(int i) {
            m20665a();
            return new C6358a(this, i);
        }

        public List<V> subList(int i, int i2) {
            m20665a();
            return this.f23686e.m31965a(this.f16983a, m27835d().subList(i, i2), this.f16985c == 0 ? this : this.f16985c);
        }

        /* renamed from: d */
        final List<V> m27835d() {
            return (List) this.f16984b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.c$h */
    class C6360h extends C4580f implements Set<V> {
        /* renamed from: e */
        private /* synthetic */ C7418c f23687e;

        C6360h(C7418c c7418c, K k, Set<V> set) {
            this.f23687e = c7418c;
            super(c7418c, k, set, null);
        }

        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return null;
            }
            int size = size();
            collection = bo.m20656a((Set) this.b, (Collection) collection);
            if (collection != null) {
                C7418c.m31961a(this.f23687e, this.b.size() - size);
                m20666b();
            }
            return collection;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.c$i */
    public class C6361i extends C4580f implements SortedSet<V> {
        /* renamed from: e */
        private /* synthetic */ C7418c f23688e;

        C6361i(C7418c c7418c, K k, SortedSet<V> sortedSet, C4580f c4580f) {
            this.f23688e = c7418c;
            super(c7418c, k, sortedSet, c4580f);
        }

        public final Comparator<? super V> comparator() {
            return m27836d().comparator();
        }

        public final V first() {
            m20665a();
            return m27836d().first();
        }

        public final V last() {
            m20665a();
            return m27836d().last();
        }

        public final SortedSet<V> headSet(V v) {
            m20665a();
            return new C6361i(this.f23688e, this.f16983a, m27836d().headSet(v), this.f16985c == null ? this : this.f16985c);
        }

        public final SortedSet<V> subSet(V v, V v2) {
            m20665a();
            return new C6361i(this.f23688e, this.f16983a, m27836d().subSet(v, v2), this.f16985c == null ? this : this.f16985c);
        }

        public final SortedSet<V> tailSet(V v) {
            m20665a();
            return new C6361i(this.f23688e, this.f16983a, m27836d().tailSet(v), this.f16985c == null ? this : this.f16985c);
        }

        /* renamed from: d */
        private SortedSet<V> m27836d() {
            return (SortedSet) this.f16984b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.c$b */
    class C7415b extends C6347d<K, Collection<V>> {
        /* renamed from: b */
        final /* synthetic */ C7418c f27207b;

        C7415b(C7418c c7418c, Map<K, Collection<V>> map) {
            this.f27207b = c7418c;
            super(map);
        }

        public void clear() {
            at.m20518d(iterator());
        }

        public Iterator<K> iterator() {
            final Iterator it = this.f23674a.entrySet().iterator();
            return new Iterator<K>(this) {
                /* renamed from: a */
                private Entry<K, Collection<V>> f16977a;
                /* renamed from: c */
                private /* synthetic */ C7415b f16979c;

                public final boolean hasNext() {
                    return it.hasNext();
                }

                public final K next() {
                    this.f16977a = (Entry) it.next();
                    return this.f16977a.getKey();
                }

                public final void remove() {
                    C5571j.m24302b(this.f16977a != null, (Object) "no calls to next() since the last call to remove()");
                    Collection collection = (Collection) this.f16977a.getValue();
                    it.remove();
                    C7418c.m31968b(this.f16979c.f27207b, collection.size());
                    collection.clear();
                }
            };
        }

        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) this.f23674a.remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                C7418c.m31968b(this.f27207b, size);
            } else {
                size = 0;
            }
            if (size > 0) {
                return true;
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f23674a.keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (this.f23674a.keySet().equals(obj) == null) {
                    return null;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.f23674a.keySet().hashCode();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.c$c */
    class C7416c extends C6359g implements RandomAccess {
        /* renamed from: f */
        private /* synthetic */ C7418c f27208f;

        C7416c(C7418c c7418c, K k, List<V> list, C4580f c4580f) {
            this.f27208f = c7418c;
            super(c7418c, k, list, c4580f);
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.c$d */
    public class C7417d extends C6357a implements SortedMap<K, Collection<V>> {
        /* renamed from: c */
        private SortedSet<K> f27209c;
        /* renamed from: d */
        private /* synthetic */ C7418c f27210d;

        /* renamed from: b */
        final /* synthetic */ Set mo7014b() {
            return m31959c();
        }

        C7417d(C7418c c7418c, SortedMap<K, Collection<V>> sortedMap) {
            this.f27210d = c7418c;
            super(c7418c, sortedMap);
        }

        public final SortedMap<K, Collection<V>> headMap(K k) {
            return new C7417d(this.f27210d, ((SortedMap) this.a).headMap(k));
        }

        public final SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C7417d(this.f27210d, ((SortedMap) this.a).subMap(k, k2));
        }

        public final SortedMap<K, Collection<V>> tailMap(K k) {
            return new C7417d(this.f27210d, ((SortedMap) this.a).tailMap(k));
        }

        /* renamed from: c */
        private SortedSet<K> m31959c() {
            return new C8059e(this.f27210d, (SortedMap) this.a);
        }

        public final Comparator<? super K> comparator() {
            return ((SortedMap) this.a).comparator();
        }

        public final K firstKey() {
            return ((SortedMap) this.a).firstKey();
        }

        public final K lastKey() {
            return ((SortedMap) this.a).lastKey();
        }

        public final /* synthetic */ Set keySet() {
            Set set = this.f27209c;
            if (set != null) {
                return set;
            }
            set = m31959c();
            this.f27209c = set;
            return set;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.c$e */
    public class C8059e extends C7415b implements SortedSet<K> {
        /* renamed from: c */
        private /* synthetic */ C7418c f28868c;

        C8059e(C7418c c7418c, SortedMap<K, Collection<V>> sortedMap) {
            this.f28868c = c7418c;
            super(c7418c, sortedMap);
        }

        public final Comparator<? super K> comparator() {
            return m34190a().comparator();
        }

        public final K first() {
            return m34190a().firstKey();
        }

        public final SortedSet<K> headSet(K k) {
            return new C8059e(this.f28868c, m34190a().headMap(k));
        }

        public final K last() {
            return m34190a().lastKey();
        }

        public final SortedSet<K> subSet(K k, K k2) {
            return new C8059e(this.f28868c, m34190a().subMap(k, k2));
        }

        public final SortedSet<K> tailSet(K k) {
            return new C8059e(this.f28868c, m34190a().tailMap(k));
        }

        /* renamed from: a */
        private SortedMap<K, Collection<V>> m34190a() {
            return (SortedMap) this.f23674a;
        }
    }

    /* renamed from: d */
    abstract Collection<V> mo7523d();

    /* renamed from: a */
    static /* synthetic */ int m31961a(C7418c c7418c, int i) {
        int i2 = c7418c.f27212b + i;
        c7418c.f27212b = i2;
        return i2;
    }

    /* renamed from: b */
    static /* synthetic */ int m31968b(C7418c c7418c, int i) {
        int i2 = c7418c.f27212b - i;
        c7418c.f27212b = i2;
        return i2;
    }

    protected C7418c(Map<K, Collection<V>> map) {
        C5571j.m24297a(map.isEmpty());
        this.f27211a = map;
    }

    /* renamed from: b */
    public final int mo6990b() {
        return this.f27212b;
    }

    /* renamed from: a */
    public final boolean mo4834a(K k, V v) {
        Collection collection = (Collection) this.f27211a.get(k);
        if (collection == null) {
            collection = mo7523d();
            if (collection.add(v) != null) {
                this.f27212b += 1;
                this.f27211a.put(k, collection);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v) == null) {
            return null;
        } else {
            this.f27212b += 1;
            return true;
        }
    }

    /* renamed from: e */
    public final void m31976e() {
        for (Collection clear : this.f27211a.values()) {
            clear.clear();
        }
        this.f27211a.clear();
        this.f27212b = 0;
    }

    /* renamed from: a */
    public final Collection<V> mo6988a(K k) {
        Collection collection = (Collection) this.f27211a.get(k);
        if (collection == null) {
            collection = mo7523d();
        }
        return m31971a((Object) k, collection);
    }

    /* renamed from: a */
    final Collection<V> m31971a(K k, Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return new C6361i(this, k, (SortedSet) collection, null);
        }
        if (collection instanceof Set) {
            return new C6360h(this, k, (Set) collection);
        }
        if (collection instanceof List) {
            return m31965a(k, (List) collection, null);
        }
        return new C4580f(this, k, collection, null);
    }

    /* renamed from: a */
    private List<V> m31965a(K k, List<V> list, C4580f c4580f) {
        return list instanceof RandomAccess ? new C7416c(this, k, list, c4580f) : new C6359g(this, k, list, c4580f);
    }

    /* renamed from: g */
    final Set<K> mo7015g() {
        return this.f27211a instanceof SortedMap ? new C8059e(this, (SortedMap) this.f27211a) : new C7415b(this, this.f27211a);
    }

    /* renamed from: a */
    final Map<K, Collection<V>> mo6989a() {
        return this.f27211a instanceof SortedMap ? new C7417d(this, (SortedMap) this.f27211a) : new C6357a(this, this.f27211a);
    }

    /* renamed from: a */
    static /* synthetic */ Iterator m31963a(C7418c c7418c, Collection collection) {
        return (collection instanceof List) != null ? ((List) collection).listIterator() : collection.iterator();
    }

    /* renamed from: a */
    static /* synthetic */ int m31962a(C7418c c7418c, Object obj) {
        Collection collection = (Collection) ax.m20626c(c7418c.f27211a, obj);
        if (collection == null) {
            return 0;
        }
        int size = collection.size();
        collection.clear();
        c7418c.f27212b -= size;
        return size;
    }
}
