package android.support.v4.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: android.support.v4.util.h */
abstract class C0557h<K, V> {
    /* renamed from: b */
    C0553b f1721b;
    /* renamed from: c */
    C0554c f1722c;
    /* renamed from: d */
    C0556e f1723d;

    /* renamed from: android.support.v4.util.h$a */
    final class C0552a<T> implements Iterator<T> {
        /* renamed from: a */
        final int f1709a;
        /* renamed from: b */
        int f1710b;
        /* renamed from: c */
        int f1711c;
        /* renamed from: d */
        boolean f1712d = false;
        /* renamed from: e */
        final /* synthetic */ C0557h f1713e;

        C0552a(C0557h c0557h, int i) {
            this.f1713e = c0557h;
            this.f1709a = i;
            this.f1710b = c0557h.mo573a();
        }

        public boolean hasNext() {
            return this.f1711c < this.f1710b;
        }

        public T next() {
            if (hasNext()) {
                T a = this.f1713e.mo575a(this.f1711c, this.f1709a);
                this.f1711c++;
                this.f1712d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1712d) {
                this.f1711c--;
                this.f1710b--;
                this.f1712d = false;
                this.f1713e.mo577a(this.f1711c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: android.support.v4.util.h$b */
    final class C0553b implements Set<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ C0557h f1714a;

        C0553b(C0557h c0557h) {
            this.f1714a = c0557h;
        }

        public /* synthetic */ boolean add(Object obj) {
            return m2037a((Entry) obj);
        }

        /* renamed from: a */
        public boolean m2037a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = this.f1714a.mo573a();
            for (Entry entry : collection) {
                this.f1714a.mo578a(entry.getKey(), entry.getValue());
            }
            return a != this.f1714a.mo573a() ? true : null;
        }

        public void clear() {
            this.f1714a.mo581c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = this.f1714a.mo574a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return C0547c.m2018a(this.f1714a.mo575a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return null;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return this.f1714a.mo573a() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C0555d(this.f1714a);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f1714a.mo573a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return C0557h.m2040a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = this.f1714a.mo573a() - 1; a >= 0; a--) {
                int i2;
                int i3;
                Object a2 = this.f1714a.mo575a(a, 0);
                Object a3 = this.f1714a.mo575a(a, 1);
                if (a2 == null) {
                    i2 = 0;
                } else {
                    i2 = a2.hashCode();
                }
                if (a3 == null) {
                    i3 = 0;
                } else {
                    i3 = a3.hashCode();
                }
                i += i2 ^ i3;
            }
            return i;
        }
    }

    /* renamed from: android.support.v4.util.h$c */
    final class C0554c implements Set<K> {
        /* renamed from: a */
        final /* synthetic */ C0557h f1715a;

        C0554c(C0557h c0557h) {
            this.f1715a = c0557h;
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f1715a.mo581c();
        }

        public boolean contains(Object obj) {
            return this.f1715a.mo574a(obj) >= null ? true : null;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0557h.m2039a(this.f1715a.mo580b(), (Collection) collection);
        }

        public boolean isEmpty() {
            return this.f1715a.mo573a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0552a(this.f1715a, 0);
        }

        public boolean remove(Object obj) {
            int a = this.f1715a.mo574a(obj);
            if (a < null) {
                return null;
            }
            this.f1715a.mo577a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0557h.m2041b(this.f1715a.mo580b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0557h.m2042c(this.f1715a.mo580b(), collection);
        }

        public int size() {
            return this.f1715a.mo573a();
        }

        public Object[] toArray() {
            return this.f1715a.m2052b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f1715a.m2049a((Object[]) tArr, 0);
        }

        public boolean equals(Object obj) {
            return C0557h.m2040a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = this.f1715a.mo573a() - 1; a >= 0; a--) {
                int i2;
                Object a2 = this.f1715a.mo575a(a, 0);
                if (a2 == null) {
                    i2 = 0;
                } else {
                    i2 = a2.hashCode();
                }
                i += i2;
            }
            return i;
        }
    }

    /* renamed from: android.support.v4.util.h$d */
    final class C0555d implements Iterator<Entry<K, V>>, Entry<K, V> {
        /* renamed from: a */
        int f1716a;
        /* renamed from: b */
        int f1717b;
        /* renamed from: c */
        boolean f1718c = false;
        /* renamed from: d */
        final /* synthetic */ C0557h f1719d;

        public /* synthetic */ Object next() {
            return m2038a();
        }

        C0555d(C0557h c0557h) {
            this.f1719d = c0557h;
            this.f1716a = c0557h.mo573a() - 1;
            this.f1717b = -1;
        }

        public boolean hasNext() {
            return this.f1717b < this.f1716a;
        }

        /* renamed from: a */
        public Entry<K, V> m2038a() {
            if (hasNext()) {
                this.f1717b++;
                this.f1718c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1718c) {
                this.f1719d.mo577a(this.f1717b);
                this.f1717b--;
                this.f1716a--;
                this.f1718c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public K getKey() {
            if (this.f1718c) {
                return this.f1719d.mo575a(this.f1717b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f1718c) {
                return this.f1719d.mo575a(this.f1717b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V setValue(V v) {
            if (this.f1718c) {
                return this.f1719d.mo576a(this.f1717b, (Object) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object obj) {
            if (this.f1718c) {
                boolean z = false;
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (C0547c.m2018a(entry.getKey(), this.f1719d.mo575a(this.f1717b, 0)) && C0547c.m2018a(entry.getValue(), this.f1719d.mo575a(this.f1717b, 1)) != null) {
                    z = true;
                }
                return z;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public int hashCode() {
            if (this.f1718c) {
                int i;
                int i2 = 0;
                Object a = this.f1719d.mo575a(this.f1717b, 0);
                Object a2 = this.f1719d.mo575a(this.f1717b, 1);
                if (a == null) {
                    i = 0;
                } else {
                    i = a.hashCode();
                }
                if (a2 != null) {
                    i2 = a2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getKey());
            stringBuilder.append("=");
            stringBuilder.append(getValue());
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v4.util.h$e */
    final class C0556e implements Collection<V> {
        /* renamed from: a */
        final /* synthetic */ C0557h f1720a;

        C0556e(C0557h c0557h) {
            this.f1720a = c0557h;
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f1720a.mo581c();
        }

        public boolean contains(Object obj) {
            return this.f1720a.mo579b(obj) >= null ? true : null;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return null;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return this.f1720a.mo573a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0552a(this.f1720a, 1);
        }

        public boolean remove(Object obj) {
            int b = this.f1720a.mo579b(obj);
            if (b < null) {
                return null;
            }
            this.f1720a.mo577a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int a = this.f1720a.mo573a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(this.f1720a.mo575a(i, 1))) {
                    this.f1720a.mo577a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int a = this.f1720a.mo573a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(this.f1720a.mo575a(i, 1))) {
                    this.f1720a.mo577a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return this.f1720a.mo573a();
        }

        public Object[] toArray() {
            return this.f1720a.m2052b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f1720a.m2049a((Object[]) tArr, 1);
        }
    }

    /* renamed from: a */
    protected abstract int mo573a();

    /* renamed from: a */
    protected abstract int mo574a(Object obj);

    /* renamed from: a */
    protected abstract Object mo575a(int i, int i2);

    /* renamed from: a */
    protected abstract V mo576a(int i, V v);

    /* renamed from: a */
    protected abstract void mo577a(int i);

    /* renamed from: a */
    protected abstract void mo578a(K k, V v);

    /* renamed from: b */
    protected abstract int mo579b(Object obj);

    /* renamed from: b */
    protected abstract Map<K, V> mo580b();

    /* renamed from: c */
    protected abstract void mo581c();

    C0557h() {
    }

    /* renamed from: a */
    public static <K, V> boolean m2039a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m2041b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size() ? true : null;
    }

    /* renamed from: c */
    public static <K, V> boolean m2042c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size() ? true : null;
    }

    /* renamed from: b */
    public Object[] m2052b(int i) {
        int a = mo573a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo575a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public <T> T[] m2049a(T[] tArr, int i) {
        int a = mo573a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo575a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = 0;
        }
        return tArr;
    }

    /* renamed from: a */
    public static <T> boolean m2040a(java.util.Set<T> r4, java.lang.Object r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof java.util.Set;
        r2 = 0;
        if (r1 == 0) goto L_0x0020;
    L_0x0009:
        r5 = (java.util.Set) r5;
        r1 = r4.size();	 Catch:{ NullPointerException -> 0x001f, ClassCastException -> 0x001e }
        r3 = r5.size();	 Catch:{ NullPointerException -> 0x001f, ClassCastException -> 0x001e }
        if (r1 != r3) goto L_0x001c;	 Catch:{ NullPointerException -> 0x001f, ClassCastException -> 0x001e }
    L_0x0015:
        r4 = r4.containsAll(r5);	 Catch:{ NullPointerException -> 0x001f, ClassCastException -> 0x001e }
        if (r4 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001d;
    L_0x001c:
        r0 = 0;
    L_0x001d:
        return r0;
    L_0x001e:
        return r2;
    L_0x001f:
        return r2;
    L_0x0020:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.h.a(java.util.Set, java.lang.Object):boolean");
    }

    /* renamed from: d */
    public Set<Entry<K, V>> m2054d() {
        if (this.f1721b == null) {
            this.f1721b = new C0553b(this);
        }
        return this.f1721b;
    }

    /* renamed from: e */
    public Set<K> m2055e() {
        if (this.f1722c == null) {
            this.f1722c = new C0554c(this);
        }
        return this.f1722c;
    }

    /* renamed from: f */
    public Collection<V> m2056f() {
        if (this.f1723d == null) {
            this.f1723d = new C0556e(this);
        }
        return this.f1723d;
    }
}
