package android.support.v4.util;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.util.a */
public class C2880a<K, V> extends C0562m<K, V> implements Map<K, V> {
    /* renamed from: a */
    C0557h<K, V> f9103a;

    /* renamed from: android.support.v4.util.a$1 */
    class C28791 extends C0557h<K, V> {
        /* renamed from: a */
        final /* synthetic */ C2880a f9102a;

        C28791(C2880a c2880a) {
            this.f9102a = c2880a;
        }

        /* renamed from: a */
        protected int mo573a() {
            return this.f9102a.h;
        }

        /* renamed from: a */
        protected Object mo575a(int i, int i2) {
            return this.f9102a.g[(i << 1) + i2];
        }

        /* renamed from: a */
        protected int mo574a(Object obj) {
            return this.f9102a.m2069a(obj);
        }

        /* renamed from: b */
        protected int mo579b(Object obj) {
            return this.f9102a.m2074b(obj);
        }

        /* renamed from: b */
        protected Map<K, V> mo580b() {
            return this.f9102a;
        }

        /* renamed from: a */
        protected void mo578a(K k, V v) {
            this.f9102a.put(k, v);
        }

        /* renamed from: a */
        protected V mo576a(int i, V v) {
            return this.f9102a.m2071a(i, (Object) v);
        }

        /* renamed from: a */
        protected void mo577a(int i) {
            this.f9102a.m2077d(i);
        }

        /* renamed from: c */
        protected void mo581c() {
            this.f9102a.clear();
        }
    }

    public C2880a(int i) {
        super(i);
    }

    public C2880a(C0562m c0562m) {
        super(c0562m);
    }

    /* renamed from: b */
    private C0557h<K, V> m11342b() {
        if (this.f9103a == null) {
            this.f9103a = new C28791(this);
        }
        return this.f9103a;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m2072a(this.h + map.size());
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public boolean m11343a(Collection<?> collection) {
        return C0557h.m2042c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m11342b().m2054d();
    }

    public Set<K> keySet() {
        return m11342b().m2055e();
    }

    public Collection<V> values() {
        return m11342b().m2056f();
    }
}
