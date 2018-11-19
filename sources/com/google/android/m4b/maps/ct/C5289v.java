package com.google.android.m4b.maps.ct;

import com.google.android.m4b.maps.ct.C5265i.C5264a;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.m4b.maps.ct.v */
class C5289v<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    /* renamed from: a */
    private final int f19624a;
    /* renamed from: b */
    private List<C5286b> f19625b;
    /* renamed from: c */
    private Map<K, V> f19626c;
    /* renamed from: d */
    private boolean f19627d;
    /* renamed from: e */
    private volatile C5288d f19628e;

    /* renamed from: com.google.android.m4b.maps.ct.v$a */
    static class C5285a {
        /* renamed from: a */
        private static final Iterator<Object> f19614a = new C52831();
        /* renamed from: b */
        private static final Iterable<Object> f19615b = new C52842();

        /* renamed from: com.google.android.m4b.maps.ct.v$a$1 */
        class C52831 implements Iterator<Object> {
            public final boolean hasNext() {
                return false;
            }

            C52831() {
            }

            public final Object next() {
                throw new NoSuchElementException();
            }

            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.android.m4b.maps.ct.v$a$2 */
        class C52842 implements Iterable<Object> {
            C52842() {
            }

            public final Iterator<Object> iterator() {
                return C5285a.f19614a;
            }
        }

        /* renamed from: a */
        static <T> Iterable<T> m23441a() {
            return f19615b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.v$b */
    class C5286b implements Comparable<C5286b>, Entry<K, V> {
        /* renamed from: a */
        private final K f19616a;
        /* renamed from: b */
        private V f19617b;
        /* renamed from: c */
        private /* synthetic */ C5289v f19618c;

        public final /* synthetic */ int compareTo(Object obj) {
            return this.f19616a.compareTo(((C5286b) obj).f19616a);
        }

        C5286b(C5289v c5289v, Entry<K, V> entry) {
            this(c5289v, (Comparable) entry.getKey(), entry.getValue());
        }

        C5286b(C5289v c5289v, K k, V v) {
            this.f19618c = c5289v;
            this.f19616a = k;
            this.f19617b = v;
        }

        /* renamed from: a */
        public final K m23444a() {
            return this.f19616a;
        }

        public final V getValue() {
            return this.f19617b;
        }

        public final V setValue(V v) {
            this.f19618c.m23453e();
            V v2 = this.f19617b;
            this.f19617b = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return C5286b.m23443a(this.f19616a, entry.getKey()) && C5286b.m23443a(this.f19617b, entry.getValue()) != null;
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = this.f19616a == null ? 0 : this.f19616a.hashCode();
            if (this.f19617b != null) {
                i = this.f19617b.hashCode();
            }
            return hashCode ^ i;
        }

        public final String toString() {
            String valueOf = String.valueOf(this.f19616a);
            String valueOf2 = String.valueOf(this.f19617b);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length());
            stringBuilder.append(valueOf);
            stringBuilder.append("=");
            stringBuilder.append(valueOf2);
            return stringBuilder.toString();
        }

        /* renamed from: a */
        private static boolean m23443a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null ? true : null;
            } else {
                return obj.equals(obj2);
            }
        }

        public final /* synthetic */ Object getKey() {
            return this.f19616a;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.v$c */
    class C5287c implements Iterator<Entry<K, V>> {
        /* renamed from: a */
        private int f19619a;
        /* renamed from: b */
        private boolean f19620b;
        /* renamed from: c */
        private Iterator<Entry<K, V>> f19621c;
        /* renamed from: d */
        private /* synthetic */ C5289v f19622d;

        private C5287c(C5289v c5289v) {
            this.f19622d = c5289v;
            this.f19619a = -1;
        }

        public final boolean hasNext() {
            if (this.f19619a + 1 >= this.f19622d.f19625b.size()) {
                if (!m23445a().hasNext()) {
                    return false;
                }
            }
            return true;
        }

        public final void remove() {
            if (this.f19620b) {
                this.f19620b = false;
                this.f19622d.m23453e();
                if (this.f19619a < this.f19622d.f19625b.size()) {
                    C5289v c5289v = this.f19622d;
                    int i = this.f19619a;
                    this.f19619a = i - 1;
                    c5289v.m23451c(i);
                    return;
                }
                m23445a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* renamed from: a */
        private Iterator<Entry<K, V>> m23445a() {
            if (this.f19621c == null) {
                this.f19621c = this.f19622d.f19626c.entrySet().iterator();
            }
            return this.f19621c;
        }

        public final /* synthetic */ Object next() {
            this.f19620b = true;
            int i = this.f19619a + 1;
            this.f19619a = i;
            if (i < this.f19622d.f19625b.size()) {
                return (Entry) this.f19622d.f19625b.get(this.f19619a);
            }
            return (Entry) m23445a().next();
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.v$d */
    class C5288d extends AbstractSet<Entry<K, V>> {
        /* renamed from: a */
        private /* synthetic */ C5289v f19623a;

        private C5288d(C5289v c5289v) {
            this.f19623a = c5289v;
        }

        public final /* synthetic */ boolean add(Object obj) {
            Entry entry = (Entry) obj;
            if (contains(entry)) {
                return null;
            }
            this.f19623a.m23455a((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C5287c();
        }

        public final int size() {
            return this.f19623a.size();
        }

        public final boolean contains(Object obj) {
            Entry entry = (Entry) obj;
            Object obj2 = this.f19623a.get(entry.getKey());
            obj = entry.getValue();
            if (obj2 != obj) {
                if (obj2 == null || obj2.equals(obj) == null) {
                    return null;
                }
            }
            return true;
        }

        public final boolean remove(Object obj) {
            Entry entry = (Entry) obj;
            if (!contains(entry)) {
                return null;
            }
            this.f19623a.remove(entry.getKey());
            return true;
        }

        public final void clear() {
            this.f19623a.clear();
        }
    }

    /* renamed from: com.google.android.m4b.maps.ct.v$1 */
    class C66591 extends C5289v<FieldDescriptorType, Object> {
        C66591(int i) {
            super(i);
        }

        public final /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m23455a((C5264a) obj, obj2);
        }

        /* renamed from: a */
        public final void mo5388a() {
            if (!m23458b()) {
                Entry b;
                for (int i = 0; i < m23459c(); i++) {
                    b = m23457b(i);
                    if (((C5264a) b.getKey()).mo5375d()) {
                        b.setValue(Collections.unmodifiableList((List) b.getValue()));
                    }
                }
                for (Entry b2 : m23460d()) {
                    if (((C5264a) b2.getKey()).mo5375d()) {
                        b2.setValue(Collections.unmodifiableList((List) b2.getValue()));
                    }
                }
            }
            super.mo5388a();
        }
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m23455a((Comparable) obj, obj2);
    }

    /* renamed from: a */
    static <FieldDescriptorType extends C5264a<FieldDescriptorType>> C5289v<FieldDescriptorType, Object> m23447a(int i) {
        return new C66591(i);
    }

    private C5289v(int i) {
        this.f19624a = i;
        this.f19625b = Collections.emptyList();
        this.f19626c = Collections.emptyMap();
    }

    /* renamed from: a */
    public void mo5388a() {
        if (!this.f19627d) {
            Map emptyMap;
            if (this.f19626c.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f19626c);
            }
            this.f19626c = emptyMap;
            this.f19627d = true;
        }
    }

    /* renamed from: b */
    public final boolean m23458b() {
        return this.f19627d;
    }

    /* renamed from: c */
    public final int m23459c() {
        return this.f19625b.size();
    }

    /* renamed from: b */
    public final Entry<K, V> m23457b(int i) {
        return (Entry) this.f19625b.get(i);
    }

    /* renamed from: d */
    public final Iterable<Entry<K, V>> m23460d() {
        if (this.f19626c.isEmpty()) {
            return C5285a.m23441a();
        }
        return this.f19626c.entrySet();
    }

    public int size() {
        return this.f19625b.size() + this.f19626c.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m23446a(comparable) < 0) {
            if (this.f19626c.containsKey(comparable) == null) {
                return null;
            }
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m23446a(comparable);
        if (a >= 0) {
            return ((C5286b) this.f19625b.get(a)).getValue();
        }
        return this.f19626c.get(comparable);
    }

    /* renamed from: a */
    public final V m23455a(K k, V v) {
        m23453e();
        int a = m23446a((Comparable) k);
        if (a >= 0) {
            return ((C5286b) this.f19625b.get(a)).setValue(v);
        }
        m23453e();
        if (this.f19625b.isEmpty() && !(this.f19625b instanceof ArrayList)) {
            this.f19625b = new ArrayList(this.f19624a);
        }
        a = -(a + 1);
        if (a >= this.f19624a) {
            return m23454f().put(k, v);
        }
        if (this.f19625b.size() == this.f19624a) {
            C5286b c5286b = (C5286b) this.f19625b.remove(this.f19624a - 1);
            m23454f().put(c5286b.m23444a(), c5286b.getValue());
        }
        this.f19625b.add(a, new C5286b(this, k, v));
        return null;
    }

    public void clear() {
        m23453e();
        if (!this.f19625b.isEmpty()) {
            this.f19625b.clear();
        }
        if (!this.f19626c.isEmpty()) {
            this.f19626c.clear();
        }
    }

    public V remove(Object obj) {
        m23453e();
        Comparable comparable = (Comparable) obj;
        int a = m23446a(comparable);
        if (a >= 0) {
            return m23451c(a);
        }
        if (this.f19626c.isEmpty()) {
            return null;
        }
        return this.f19626c.remove(comparable);
    }

    /* renamed from: c */
    private V m23451c(int i) {
        m23453e();
        i = ((C5286b) this.f19625b.remove(i)).getValue();
        if (!this.f19626c.isEmpty()) {
            Iterator it = m23454f().entrySet().iterator();
            this.f19625b.add(new C5286b(this, (Entry) it.next()));
            it.remove();
        }
        return i;
    }

    /* renamed from: a */
    private int m23446a(K k) {
        int compareTo;
        int size = this.f19625b.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo(((C5286b) this.f19625b.get(size)).m23444a());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        compareTo = 0;
        while (compareTo <= size) {
            int i = (compareTo + size) / 2;
            int compareTo2 = k.compareTo(((C5286b) this.f19625b.get(i)).m23444a());
            if (compareTo2 < 0) {
                size = i - 1;
            } else if (compareTo2 <= 0) {
                return i;
            } else {
                compareTo = i + 1;
            }
        }
        return -(compareTo + 1);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f19628e == null) {
            this.f19628e = new C5288d();
        }
        return this.f19628e;
    }

    /* renamed from: e */
    private void m23453e() {
        if (this.f19627d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    private SortedMap<K, V> m23454f() {
        m23453e();
        if (this.f19626c.isEmpty() && !(this.f19626c instanceof TreeMap)) {
            this.f19626c = new TreeMap();
        }
        return (SortedMap) this.f19626c;
    }
}
