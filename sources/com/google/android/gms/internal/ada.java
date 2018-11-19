package com.google.android.gms.internal;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class ada<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    /* renamed from: a */
    private final int f15028a;
    /* renamed from: b */
    private List<adf> f15029b;
    /* renamed from: c */
    private Map<K, V> f15030c;
    /* renamed from: d */
    private boolean f15031d;
    /* renamed from: e */
    private volatile adh f15032e;
    /* renamed from: f */
    private Map<K, V> f15033f;

    private ada(int i) {
        this.f15028a = i;
        this.f15029b = Collections.emptyList();
        this.f15030c = Collections.emptyMap();
        this.f15033f = Collections.emptyMap();
    }

    /* renamed from: a */
    private final int m18895a(K k) {
        int compareTo;
        int size = this.f15029b.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo((Comparable) ((adf) this.f15029b.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((adf) this.f15029b.get(i)).getKey());
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

    /* renamed from: a */
    static <FieldDescriptorType extends zzffs<FieldDescriptorType>> ada<FieldDescriptorType, Object> m18896a(int i) {
        return new adb(i);
    }

    /* renamed from: c */
    private final V m18900c(int i) {
        m18902e();
        V value = ((adf) this.f15029b.remove(i)).getValue();
        if (!this.f15030c.isEmpty()) {
            Iterator it = m18903f().entrySet().iterator();
            this.f15029b.add(new adf(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: e */
    private final void m18902e() {
        if (this.f15031d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    private final SortedMap<K, V> m18903f() {
        m18902e();
        if (this.f15030c.isEmpty() && !(this.f15030c instanceof TreeMap)) {
            this.f15030c = new TreeMap();
            this.f15033f = ((TreeMap) this.f15030c).descendingMap();
        }
        return (SortedMap) this.f15030c;
    }

    /* renamed from: a */
    public final V m18904a(K k, V v) {
        m18902e();
        int a = m18895a((Comparable) k);
        if (a >= 0) {
            return ((adf) this.f15029b.get(a)).setValue(v);
        }
        m18902e();
        if (this.f15029b.isEmpty() && !(this.f15029b instanceof ArrayList)) {
            this.f15029b = new ArrayList(this.f15028a);
        }
        a = -(a + 1);
        if (a >= this.f15028a) {
            return m18903f().put(k, v);
        }
        if (this.f15029b.size() == this.f15028a) {
            adf adf = (adf) this.f15029b.remove(this.f15028a - 1);
            m18903f().put((Comparable) adf.getKey(), adf.getValue());
        }
        this.f15029b.add(a, new adf(this, k, v));
        return null;
    }

    /* renamed from: a */
    public void mo4207a() {
        if (!this.f15031d) {
            this.f15030c = this.f15030c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15030c);
            this.f15033f = this.f15033f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f15033f);
            this.f15031d = true;
        }
    }

    /* renamed from: b */
    public final Entry<K, V> m18906b(int i) {
        return (Entry) this.f15029b.get(i);
    }

    /* renamed from: b */
    public final boolean m18907b() {
        return this.f15031d;
    }

    /* renamed from: c */
    public final int m18908c() {
        return this.f15029b.size();
    }

    public void clear() {
        m18902e();
        if (!this.f15029b.isEmpty()) {
            this.f15029b.clear();
        }
        if (!this.f15030c.isEmpty()) {
            this.f15030c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m18895a(comparable) < 0) {
            if (!this.f15030c.containsKey(comparable)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final Iterable<Entry<K, V>> m18909d() {
        return this.f15030c.isEmpty() ? adc.m18910a() : this.f15030c.entrySet();
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f15032e == null) {
            this.f15032e = new adh();
        }
        return this.f15032e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ada)) {
            return super.equals(obj);
        }
        ada ada = (ada) obj;
        int size = size();
        if (size != ada.size()) {
            return false;
        }
        int c = m18908c();
        if (c != ada.m18908c()) {
            return entrySet().equals(ada.entrySet());
        }
        for (int i = 0; i < c; i++) {
            if (!m18906b(i).equals(ada.m18906b(i))) {
                return false;
            }
        }
        return c != size ? this.f15030c.equals(ada.f15030c) : true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m18895a(comparable);
        return a >= 0 ? ((adf) this.f15029b.get(a)).getValue() : this.f15030c.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < m18908c(); i2++) {
            i += ((adf) this.f15029b.get(i2)).hashCode();
        }
        return this.f15030c.size() > 0 ? i + this.f15030c.hashCode() : i;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m18904a((Comparable) obj, obj2);
    }

    public V remove(Object obj) {
        m18902e();
        Comparable comparable = (Comparable) obj;
        int a = m18895a(comparable);
        return a >= 0 ? m18900c(a) : this.f15030c.isEmpty() ? null : this.f15030c.remove(comparable);
    }

    public int size() {
        return this.f15029b.size() + this.f15030c.size();
    }
}
