package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    /* renamed from: g */
    static final /* synthetic */ boolean f21830g = true;
    /* renamed from: h */
    private static final Comparator<Comparable> f21831h = new C59721();
    /* renamed from: a */
    Comparator<? super K> f21832a;
    /* renamed from: b */
    C5978f<K, V>[] f21833b;
    /* renamed from: c */
    final C5978f<K, V> f21834c;
    /* renamed from: d */
    int f21835d;
    /* renamed from: e */
    int f21836e;
    /* renamed from: f */
    int f21837f;
    /* renamed from: i */
    private C5975c f21838i;
    /* renamed from: j */
    private C5976d f21839j;

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$1 */
    class C59721 implements Comparator<Comparable> {
        C59721() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m25608a((Comparable) obj, (Comparable) obj2);
        }

        /* renamed from: a */
        public int m25608a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$a */
    static final class C5973a<K, V> {
        /* renamed from: a */
        private C5978f<K, V> f21810a;
        /* renamed from: b */
        private int f21811b;
        /* renamed from: c */
        private int f21812c;
        /* renamed from: d */
        private int f21813d;

        C5973a() {
        }

        /* renamed from: a */
        void m25610a(int i) {
            this.f21811b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f21813d = 0;
            this.f21812c = 0;
            this.f21810a = 0;
        }

        /* renamed from: a */
        void m25611a(C5978f<K, V> c5978f) {
            c5978f.f21823c = null;
            c5978f.f21821a = null;
            c5978f.f21822b = null;
            c5978f.f21829i = 1;
            if (this.f21811b > 0 && (this.f21813d & 1) == 0) {
                this.f21813d++;
                this.f21811b--;
                this.f21812c++;
            }
            c5978f.f21821a = this.f21810a;
            this.f21810a = c5978f;
            this.f21813d += 1;
            if (this.f21811b > null && (this.f21813d & 1) == null) {
                this.f21813d += 1;
                this.f21811b -= 1;
                this.f21812c += 1;
            }
            c5978f = 4;
            while (true) {
                int i = c5978f - 1;
                if ((this.f21813d & i) == i) {
                    C5978f c5978f2;
                    C5978f c5978f3;
                    if (this.f21812c == 0) {
                        c5978f2 = this.f21810a;
                        C5978f c5978f4 = c5978f2.f21821a;
                        c5978f3 = c5978f4.f21821a;
                        c5978f4.f21821a = c5978f3.f21821a;
                        this.f21810a = c5978f4;
                        c5978f4.f21822b = c5978f3;
                        c5978f4.f21823c = c5978f2;
                        c5978f4.f21829i = c5978f2.f21829i + 1;
                        c5978f3.f21821a = c5978f4;
                        c5978f2.f21821a = c5978f4;
                    } else if (this.f21812c == 1) {
                        c5978f2 = this.f21810a;
                        c5978f3 = c5978f2.f21821a;
                        this.f21810a = c5978f3;
                        c5978f3.f21823c = c5978f2;
                        c5978f3.f21829i = c5978f2.f21829i + 1;
                        c5978f2.f21821a = c5978f3;
                        this.f21812c = 0;
                    } else if (this.f21812c == 2) {
                        this.f21812c = 0;
                    }
                    c5978f *= 2;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        C5978f<K, V> m25609a() {
            C5978f<K, V> c5978f = this.f21810a;
            if (c5978f.f21821a == null) {
                return c5978f;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$b */
    static class C5974b<K, V> {
        /* renamed from: a */
        private C5978f<K, V> f21814a;

        C5974b() {
        }

        /* renamed from: a */
        void m25613a(C5978f<K, V> c5978f) {
            C5978f<K, V> c5978f2 = null;
            while (true) {
                C5978f<K, V> c5978f3 = c5978f2;
                c5978f2 = c5978f;
                c5978f = c5978f3;
                if (c5978f2 != null) {
                    c5978f2.f21821a = c5978f;
                    c5978f = c5978f2.f21822b;
                } else {
                    this.f21814a = c5978f;
                    return;
                }
            }
        }

        /* renamed from: a */
        public C5978f<K, V> m25612a() {
            C5978f<K, V> c5978f = this.f21814a;
            if (c5978f == null) {
                return null;
            }
            C5978f c5978f2 = c5978f.f21821a;
            c5978f.f21821a = null;
            C5978f c5978f3 = c5978f.f21823c;
            while (true) {
                C5978f c5978f4 = c5978f2;
                c5978f2 = c5978f3;
                c5978f3 = c5978f4;
                if (c5978f2 != null) {
                    c5978f2.f21821a = c5978f3;
                    c5978f3 = c5978f2.f21822b;
                } else {
                    this.f21814a = c5978f3;
                    return c5978f;
                }
            }
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$c */
    final class C5975c extends AbstractSet<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ LinkedHashTreeMap f21815a;

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$c$1 */
        class C71731 extends C5977e<Entry<K, V>> {
            /* renamed from: a */
            final /* synthetic */ C5975c f25948a;

            C71731(C5975c c5975c) {
                this.f25948a = c5975c;
                super(c5975c.f21815a);
            }

            public /* synthetic */ Object next() {
                return m30827a();
            }

            /* renamed from: a */
            public Entry<K, V> m30827a() {
                return m25614b();
            }
        }

        C5975c(LinkedHashTreeMap linkedHashTreeMap) {
            this.f21815a = linkedHashTreeMap;
        }

        public int size() {
            return this.f21815a.f21835d;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C71731(this);
        }

        public boolean contains(Object obj) {
            return (!(obj instanceof Entry) || this.f21815a.m25627a((Entry) obj) == null) ? null : LinkedHashTreeMap.f21830g;
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C5978f a = this.f21815a.m25627a((Entry) obj);
            if (a == null) {
                return false;
            }
            this.f21815a.m25628a(a, (boolean) LinkedHashTreeMap.f21830g);
            return LinkedHashTreeMap.f21830g;
        }

        public void clear() {
            this.f21815a.clear();
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$d */
    final class C5976d extends AbstractSet<K> {
        /* renamed from: a */
        final /* synthetic */ LinkedHashTreeMap f21816a;

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$d$1 */
        class C71741 extends C5977e<K> {
            /* renamed from: a */
            final /* synthetic */ C5976d f25949a;

            C71741(C5976d c5976d) {
                this.f25949a = c5976d;
                super(c5976d.f21816a);
            }

            public K next() {
                return m25614b().f21826f;
            }
        }

        C5976d(LinkedHashTreeMap linkedHashTreeMap) {
            this.f21816a = linkedHashTreeMap;
        }

        public int size() {
            return this.f21816a.f21835d;
        }

        public Iterator<K> iterator() {
            return new C71741(this);
        }

        public boolean contains(Object obj) {
            return this.f21816a.containsKey(obj);
        }

        public boolean remove(Object obj) {
            return this.f21816a.m25629b(obj) != null ? LinkedHashTreeMap.f21830g : null;
        }

        public void clear() {
            this.f21816a.clear();
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$e */
    abstract class C5977e<T> implements Iterator<T> {
        /* renamed from: b */
        C5978f<K, V> f21817b = this.f21820e.f21834c.f21824d;
        /* renamed from: c */
        C5978f<K, V> f21818c = null;
        /* renamed from: d */
        int f21819d = this.f21820e.f21836e;
        /* renamed from: e */
        final /* synthetic */ LinkedHashTreeMap f21820e;

        C5977e(LinkedHashTreeMap linkedHashTreeMap) {
            this.f21820e = linkedHashTreeMap;
        }

        public final boolean hasNext() {
            return this.f21817b != this.f21820e.f21834c ? LinkedHashTreeMap.f21830g : false;
        }

        /* renamed from: b */
        final C5978f<K, V> m25614b() {
            C5978f<K, V> c5978f = this.f21817b;
            if (c5978f == this.f21820e.f21834c) {
                throw new NoSuchElementException();
            } else if (this.f21820e.f21836e != this.f21819d) {
                throw new ConcurrentModificationException();
            } else {
                this.f21817b = c5978f.f21824d;
                this.f21818c = c5978f;
                return c5978f;
            }
        }

        public final void remove() {
            if (this.f21818c == null) {
                throw new IllegalStateException();
            }
            this.f21820e.m25628a(this.f21818c, (boolean) LinkedHashTreeMap.f21830g);
            this.f21818c = null;
            this.f21819d = this.f21820e.f21836e;
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$f */
    static final class C5978f<K, V> implements Entry<K, V> {
        /* renamed from: a */
        C5978f<K, V> f21821a;
        /* renamed from: b */
        C5978f<K, V> f21822b;
        /* renamed from: c */
        C5978f<K, V> f21823c;
        /* renamed from: d */
        C5978f<K, V> f21824d;
        /* renamed from: e */
        C5978f<K, V> f21825e;
        /* renamed from: f */
        final K f21826f;
        /* renamed from: g */
        final int f21827g;
        /* renamed from: h */
        V f21828h;
        /* renamed from: i */
        int f21829i;

        C5978f() {
            this.f21826f = null;
            this.f21827g = -1;
            this.f21825e = this;
            this.f21824d = this;
        }

        C5978f(C5978f<K, V> c5978f, K k, int i, C5978f<K, V> c5978f2, C5978f<K, V> c5978f3) {
            this.f21821a = c5978f;
            this.f21826f = k;
            this.f21827g = i;
            this.f21829i = 1;
            this.f21824d = c5978f2;
            this.f21825e = c5978f3;
            c5978f3.f21824d = this;
            c5978f2.f21825e = this;
        }

        public K getKey() {
            return this.f21826f;
        }

        public V getValue() {
            return this.f21828h;
        }

        public V setValue(V v) {
            V v2 = this.f21828h;
            this.f21828h = v;
            return v2;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
            r3 = this;
            r0 = r4 instanceof java.util.Map.Entry;
            r1 = 0;
            if (r0 == 0) goto L_0x0037;
        L_0x0005:
            r4 = (java.util.Map.Entry) r4;
            r0 = r3.f21826f;
            if (r0 != 0) goto L_0x0012;
        L_0x000b:
            r0 = r4.getKey();
            if (r0 != 0) goto L_0x0036;
        L_0x0011:
            goto L_0x001e;
        L_0x0012:
            r0 = r3.f21826f;
            r2 = r4.getKey();
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0036;
        L_0x001e:
            r0 = r3.f21828h;
            if (r0 != 0) goto L_0x0029;
        L_0x0022:
            r4 = r4.getValue();
            if (r4 != 0) goto L_0x0036;
        L_0x0028:
            goto L_0x0035;
        L_0x0029:
            r0 = r3.f21828h;
            r4 = r4.getValue();
            r4 = r0.equals(r4);
            if (r4 == 0) goto L_0x0036;
        L_0x0035:
            r1 = 1;
        L_0x0036:
            return r1;
        L_0x0037:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.f.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 0;
            int hashCode = this.f21826f == null ? 0 : this.f21826f.hashCode();
            if (this.f21828h != null) {
                i = this.f21828h.hashCode();
            }
            return hashCode ^ i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f21826f);
            stringBuilder.append("=");
            stringBuilder.append(this.f21828h);
            return stringBuilder.toString();
        }

        /* renamed from: a */
        public C5978f<K, V> m25615a() {
            C5978f<K, V> c5978f = this;
            for (C5978f<K, V> c5978f2 = this.f21822b; c5978f2 != null; c5978f2 = c5978f2.f21822b) {
                c5978f = c5978f2;
            }
            return c5978f;
        }

        /* renamed from: b */
        public C5978f<K, V> m25616b() {
            C5978f<K, V> c5978f = this;
            for (C5978f<K, V> c5978f2 = this.f21823c; c5978f2 != null; c5978f2 = c5978f2.f21823c) {
                c5978f = c5978f2;
            }
            return c5978f;
        }
    }

    /* renamed from: a */
    private static int m25617a(int i) {
        i ^= (i >>> 20) ^ (i >>> 12);
        return (i >>> 4) ^ ((i >>> 7) ^ i);
    }

    LinkedHashTreeMap() {
        this(null);
    }

    LinkedHashTreeMap(Comparator<? super K> comparator) {
        this.f21835d = 0;
        this.f21836e = 0;
        if (comparator == null) {
            comparator = f21831h;
        }
        this.f21832a = comparator;
        this.f21834c = new C5978f();
        this.f21833b = new C5978f[16];
        this.f21837f = (this.f21833b.length / 2) + (this.f21833b.length / 4);
    }

    public int size() {
        return this.f21835d;
    }

    public V get(Object obj) {
        obj = m25625a(obj);
        return obj != null ? obj.f21828h : null;
    }

    public boolean containsKey(Object obj) {
        return m25625a(obj) != null ? f21830g : null;
    }

    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        k = m25626a((Object) k, (boolean) f21830g);
        V v2 = k.f21828h;
        k.f21828h = v;
        return v2;
    }

    public void clear() {
        Arrays.fill(this.f21833b, null);
        this.f21835d = 0;
        this.f21836e++;
        C5978f c5978f = this.f21834c;
        C5978f c5978f2 = c5978f.f21824d;
        while (c5978f2 != c5978f) {
            C5978f c5978f3 = c5978f2.f21824d;
            c5978f2.f21825e = null;
            c5978f2.f21824d = null;
            c5978f2 = c5978f3;
        }
        c5978f.f21825e = c5978f;
        c5978f.f21824d = c5978f;
    }

    public V remove(Object obj) {
        obj = m25629b(obj);
        return obj != null ? obj.f21828h : null;
    }

    /* renamed from: a */
    C5978f<K, V> m25626a(K k, boolean z) {
        C5978f c5978f;
        int i;
        Comparator comparator = this.f21832a;
        C5978f[] c5978fArr = this.f21833b;
        int a = m25617a(k.hashCode());
        int length = (c5978fArr.length - 1) & a;
        C5978f<K, V> c5978f2 = c5978fArr[length];
        if (c5978f2 != null) {
            int compareTo;
            Comparable comparable = comparator == f21831h ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    compareTo = comparable.compareTo(c5978f2.f21826f);
                } else {
                    compareTo = comparator.compare(k, c5978f2.f21826f);
                }
                if (compareTo == 0) {
                    return c5978f2;
                }
                C5978f<K, V> c5978f3;
                if (compareTo < 0) {
                    c5978f3 = c5978f2.f21822b;
                } else {
                    c5978f3 = c5978f2.f21823c;
                }
                if (c5978f3 == null) {
                    break;
                }
                c5978f2 = c5978f3;
            }
            c5978f = c5978f2;
            i = compareTo;
        } else {
            c5978f = c5978f2;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C5978f c5978f4 = this.f21834c;
        C5978f c5978f5;
        if (c5978f != null) {
            c5978f5 = new C5978f(c5978f, k, a, c5978f4, c5978f4.f21825e);
            if (i < 0) {
                c5978f.f21822b = c5978f5;
            } else {
                c5978f.f21823c = c5978f5;
            }
            m25624b(c5978f, f21830g);
        } else if (comparator != f21831h || (k instanceof Comparable)) {
            c5978f5 = new C5978f(c5978f, k, a, c5978f4, c5978f4.f21825e);
            c5978fArr[length] = c5978f5;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(k.getClass().getName());
            stringBuilder.append(" is not Comparable");
            throw new ClassCastException(stringBuilder.toString());
        }
        k = this.f21835d;
        this.f21835d = k + 1;
        if (k > this.f21837f) {
            m25618a();
        }
        this.f21836e += 1;
        return z;
    }

    /* renamed from: a */
    com.squareup.moshi.LinkedHashTreeMap.C5978f<K, V> m25625a(java.lang.Object r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 0;
        if (r3 == 0) goto L_0x000a;
    L_0x0003:
        r1 = 0;
        r3 = r2.m25626a(r3, r1);	 Catch:{ ClassCastException -> 0x0009 }
        goto L_0x000b;
    L_0x0009:
        return r0;
    L_0x000a:
        r3 = r0;
    L_0x000b:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.LinkedHashTreeMap.a(java.lang.Object):com.squareup.moshi.LinkedHashTreeMap$f<K, V>");
    }

    /* renamed from: a */
    C5978f<K, V> m25627a(Entry<?, ?> entry) {
        C5978f<K, V> a = m25625a(entry.getKey());
        entry = (a == null || m25621a(a.f21828h, entry.getValue()) == null) ? null : f21830g;
        return entry != null ? a : null;
    }

    /* renamed from: a */
    private boolean m25621a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return f21830g;
    }

    /* renamed from: a */
    void m25628a(C5978f<K, V> c5978f, boolean z) {
        if (z) {
            c5978f.f21825e.f21824d = c5978f.f21824d;
            c5978f.f21824d.f21825e = c5978f.f21825e;
            c5978f.f21825e = null;
            c5978f.f21824d = null;
        }
        C5978f c5978f2 = c5978f.f21822b;
        C5978f c5978f3 = c5978f.f21823c;
        C5978f c5978f4 = c5978f.f21821a;
        int i = 0;
        if (!c5978f2 != false || c5978f3 == null) {
            if (c5978f2 == true) {
                m25620a((C5978f) c5978f, c5978f2);
                c5978f.f21822b = null;
            } else if (c5978f3 != null) {
                m25620a((C5978f) c5978f, c5978f3);
                c5978f.f21823c = null;
            } else {
                m25620a((C5978f) c5978f, null);
            }
            m25624b(c5978f4, false);
            this.f21835d--;
            this.f21836e++;
            return;
        }
        int i2;
        c5978f2 = c5978f2.f21829i > c5978f3.f21829i ? c5978f2.m25616b() : c5978f3.m25615a();
        m25628a(c5978f2, false);
        c5978f3 = c5978f.f21822b;
        if (c5978f3 != null) {
            i2 = c5978f3.f21829i;
            c5978f2.f21822b = c5978f3;
            c5978f3.f21821a = c5978f2;
            c5978f.f21822b = null;
        } else {
            i2 = 0;
        }
        c5978f3 = c5978f.f21823c;
        if (c5978f3 != null) {
            i = c5978f3.f21829i;
            c5978f2.f21823c = c5978f3;
            c5978f3.f21821a = c5978f2;
            c5978f.f21823c = null;
        }
        c5978f2.f21829i = Math.max(i2, i) + 1;
        m25620a((C5978f) c5978f, c5978f2);
    }

    /* renamed from: b */
    C5978f<K, V> m25629b(Object obj) {
        C5978f a = m25625a(obj);
        if (a != null) {
            m25628a(a, (boolean) f21830g);
        }
        return a;
    }

    /* renamed from: a */
    private void m25620a(C5978f<K, V> c5978f, C5978f<K, V> c5978f2) {
        C5978f c5978f3 = c5978f.f21821a;
        c5978f.f21821a = null;
        if (c5978f2 != null) {
            c5978f2.f21821a = c5978f3;
        }
        if (c5978f3 == null) {
            this.f21833b[c5978f.f21827g & (this.f21833b.length - 1)] = c5978f2;
        } else if (c5978f3.f21822b == c5978f) {
            c5978f3.f21822b = c5978f2;
        } else if (f21830g || c5978f3.f21823c == c5978f) {
            c5978f3.f21823c = c5978f2;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    private void m25624b(C5978f<K, V> c5978f, boolean z) {
        C5978f c5978f2;
        while (c5978f2 != null) {
            C5978f c5978f3 = c5978f2.f21822b;
            C5978f c5978f4 = c5978f2.f21823c;
            int i = 0;
            int i2 = c5978f3 != null ? c5978f3.f21829i : 0;
            int i3 = c5978f4 != null ? c5978f4.f21829i : 0;
            int i4 = i2 - i3;
            C5978f c5978f5;
            if (i4 == -2) {
                c5978f3 = c5978f4.f21822b;
                c5978f5 = c5978f4.f21823c;
                i2 = c5978f5 != null ? c5978f5.f21829i : 0;
                if (c5978f3 != null) {
                    i = c5978f3.f21829i;
                }
                i -= i2;
                if (i != -1) {
                    if (i != 0 || z) {
                        if (f21830g || i == 1) {
                            m25623b(c5978f4);
                            m25619a(c5978f2);
                            if (z) {
                                return;
                            }
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
                m25619a(c5978f2);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                c5978f4 = c5978f3.f21822b;
                c5978f5 = c5978f3.f21823c;
                i2 = c5978f5 != null ? c5978f5.f21829i : 0;
                if (c5978f4 != null) {
                    i = c5978f4.f21829i;
                }
                i -= i2;
                if (i != 1) {
                    if (i != 0 || z) {
                        if (f21830g || i == -1) {
                            m25619a(c5978f3);
                            m25623b(c5978f2);
                            if (z) {
                                return;
                            }
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
                m25623b(c5978f2);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                c5978f2.f21829i = i2 + 1;
                if (z) {
                    return;
                }
            } else if (f21830g || i4 == -1 || i4 == 1) {
                c5978f2.f21829i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            } else {
                throw new AssertionError();
            }
            c5978f2 = c5978f2.f21821a;
        }
    }

    /* renamed from: a */
    private void m25619a(C5978f<K, V> c5978f) {
        C5978f c5978f2 = c5978f.f21822b;
        C5978f c5978f3 = c5978f.f21823c;
        C5978f c5978f4 = c5978f3.f21822b;
        C5978f c5978f5 = c5978f3.f21823c;
        c5978f.f21823c = c5978f4;
        if (c5978f4 != null) {
            c5978f4.f21821a = c5978f;
        }
        m25620a((C5978f) c5978f, c5978f3);
        c5978f3.f21822b = c5978f;
        c5978f.f21821a = c5978f3;
        int i = 0;
        c5978f.f21829i = Math.max(c5978f2 != null ? c5978f2.f21829i : 0, c5978f4 != null ? c5978f4.f21829i : 0) + 1;
        c5978f = c5978f.f21829i;
        if (c5978f5 != null) {
            i = c5978f5.f21829i;
        }
        c5978f3.f21829i = Math.max(c5978f, i) + 1;
    }

    /* renamed from: b */
    private void m25623b(C5978f<K, V> c5978f) {
        C5978f c5978f2 = c5978f.f21822b;
        C5978f c5978f3 = c5978f.f21823c;
        C5978f c5978f4 = c5978f2.f21822b;
        C5978f c5978f5 = c5978f2.f21823c;
        c5978f.f21822b = c5978f5;
        if (c5978f5 != null) {
            c5978f5.f21821a = c5978f;
        }
        m25620a((C5978f) c5978f, c5978f2);
        c5978f2.f21823c = c5978f;
        c5978f.f21821a = c5978f2;
        int i = 0;
        c5978f.f21829i = Math.max(c5978f3 != null ? c5978f3.f21829i : 0, c5978f5 != null ? c5978f5.f21829i : 0) + 1;
        c5978f = c5978f.f21829i;
        if (c5978f4 != null) {
            i = c5978f4.f21829i;
        }
        c5978f2.f21829i = Math.max(c5978f, i) + 1;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.f21838i;
        if (set != null) {
            return set;
        }
        Set c5975c = new C5975c(this);
        this.f21838i = c5975c;
        return c5975c;
    }

    public Set<K> keySet() {
        Set<K> set = this.f21839j;
        if (set != null) {
            return set;
        }
        Set c5976d = new C5976d(this);
        this.f21839j = c5976d;
        return c5976d;
    }

    /* renamed from: a */
    private void m25618a() {
        this.f21833b = m25622a(this.f21833b);
        this.f21837f = (this.f21833b.length / 2) + (this.f21833b.length / 4);
    }

    /* renamed from: a */
    static <K, V> C5978f<K, V>[] m25622a(C5978f<K, V>[] c5978fArr) {
        int length = c5978fArr.length;
        C5978f<K, V>[] c5978fArr2 = new C5978f[(length * 2)];
        C5974b c5974b = new C5974b();
        C5973a c5973a = new C5973a();
        C5973a c5973a2 = new C5973a();
        for (int i = 0; i < length; i++) {
            C5978f c5978f = c5978fArr[i];
            if (c5978f != null) {
                c5974b.m25613a(c5978f);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C5978f a = c5974b.m25612a();
                    if (a == null) {
                        break;
                    } else if ((a.f21827g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                c5973a.m25610a(i2);
                c5973a2.m25610a(i3);
                c5974b.m25613a(c5978f);
                while (true) {
                    c5978f = c5974b.m25612a();
                    if (c5978f == null) {
                        break;
                    } else if ((c5978f.f21827g & length) == 0) {
                        c5973a.m25611a(c5978f);
                    } else {
                        c5973a2.m25611a(c5978f);
                    }
                }
                c5978f = null;
                c5978fArr2[i] = i2 > 0 ? c5973a.m25609a() : null;
                i2 = i + length;
                if (i3 > 0) {
                    c5978f = c5973a2.m25609a();
                }
                c5978fArr2[i2] = c5978f;
            }
        }
        return c5978fArr2;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }
}
