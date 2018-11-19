package android.arch.core.p003b;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@RestrictTo({Scope.LIBRARY_GROUP})
/* renamed from: android.arch.core.b.b */
public class C0008b<K, V> implements Iterable<Entry<K, V>> {
    /* renamed from: a */
    private C0006c<K, V> f9a;
    /* renamed from: b */
    private C0006c<K, V> f10b;
    /* renamed from: c */
    private WeakHashMap<C0007f<K, V>, Boolean> f11c = new WeakHashMap();
    /* renamed from: d */
    private int f12d = 0;

    /* renamed from: android.arch.core.b.b$c */
    static class C0006c<K, V> implements Entry<K, V> {
        @NonNull
        /* renamed from: a */
        final K f5a;
        @NonNull
        /* renamed from: b */
        final V f6b;
        /* renamed from: c */
        C0006c<K, V> f7c;
        /* renamed from: d */
        C0006c<K, V> f8d;

        C0006c(@NonNull K k, @NonNull V v) {
            this.f5a = k;
            this.f6b = v;
        }

        @NonNull
        public K getKey() {
            return this.f5a;
        }

        @NonNull
        public V getValue() {
            return this.f6b;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f5a);
            stringBuilder.append("=");
            stringBuilder.append(this.f6b);
            return stringBuilder.toString();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0006c)) {
                return false;
            }
            C0006c c0006c = (C0006c) obj;
            if (!this.f5a.equals(c0006c.f5a) || this.f6b.equals(c0006c.f6b) == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: android.arch.core.b.b$f */
    interface C0007f<K, V> {
        void a_(@NonNull C0006c<K, V> c0006c);
    }

    /* renamed from: android.arch.core.b.b$d */
    private class C2676d implements C0007f<K, V>, Iterator<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ C0008b f8482a;
        /* renamed from: b */
        private C0006c<K, V> f8483b;
        /* renamed from: c */
        private boolean f8484c;

        private C2676d(C0008b c0008b) {
            this.f8482a = c0008b;
            this.f8484c = true;
        }

        public /* synthetic */ Object next() {
            return m10437a();
        }

        public void a_(@NonNull C0006c<K, V> c0006c) {
            if (c0006c == this.f8483b) {
                this.f8483b = this.f8483b.f8d;
                this.f8484c = this.f8483b == null ? true : null;
            }
        }

        public boolean hasNext() {
            boolean z = false;
            if (this.f8484c) {
                if (this.f8482a.f9a != null) {
                    z = true;
                }
                return z;
            }
            if (!(this.f8483b == null || this.f8483b.f7c == null)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        public Entry<K, V> m10437a() {
            if (this.f8484c) {
                this.f8484c = false;
                this.f8483b = this.f8482a.f9a;
            } else {
                this.f8483b = this.f8483b != null ? this.f8483b.f7c : null;
            }
            return this.f8483b;
        }
    }

    /* renamed from: android.arch.core.b.b$e */
    private static abstract class C2677e<K, V> implements C0007f<K, V>, Iterator<Entry<K, V>> {
        /* renamed from: a */
        C0006c<K, V> f8485a;
        /* renamed from: b */
        C0006c<K, V> f8486b;

        /* renamed from: a */
        abstract C0006c<K, V> mo2952a(C0006c<K, V> c0006c);

        /* renamed from: b */
        abstract C0006c<K, V> mo2953b(C0006c<K, V> c0006c);

        public /* synthetic */ Object next() {
            return m10440a();
        }

        C2677e(C0006c<K, V> c0006c, C0006c<K, V> c0006c2) {
            this.f8485a = c0006c2;
            this.f8486b = c0006c;
        }

        public boolean hasNext() {
            return this.f8486b != null;
        }

        public void a_(@NonNull C0006c<K, V> c0006c) {
            if (this.f8485a == c0006c && c0006c == this.f8486b) {
                this.f8486b = null;
                this.f8485a = null;
            }
            if (this.f8485a == c0006c) {
                this.f8485a = mo2953b(this.f8485a);
            }
            if (this.f8486b == c0006c) {
                this.f8486b = m10438b();
            }
        }

        /* renamed from: b */
        private C0006c<K, V> m10438b() {
            if (this.f8486b != this.f8485a) {
                if (this.f8485a != null) {
                    return mo2952a(this.f8486b);
                }
            }
            return null;
        }

        /* renamed from: a */
        public Entry<K, V> m10440a() {
            Entry entry = this.f8486b;
            this.f8486b = m10438b();
            return entry;
        }
    }

    /* renamed from: android.arch.core.b.b$a */
    static class C3974a<K, V> extends C2677e<K, V> {
        C3974a(C0006c<K, V> c0006c, C0006c<K, V> c0006c2) {
            super(c0006c, c0006c2);
        }

        /* renamed from: a */
        C0006c<K, V> mo2952a(C0006c<K, V> c0006c) {
            return c0006c.f7c;
        }

        /* renamed from: b */
        C0006c<K, V> mo2953b(C0006c<K, V> c0006c) {
            return c0006c.f8d;
        }
    }

    /* renamed from: android.arch.core.b.b$b */
    private static class C3975b<K, V> extends C2677e<K, V> {
        C3975b(C0006c<K, V> c0006c, C0006c<K, V> c0006c2) {
            super(c0006c, c0006c2);
        }

        /* renamed from: a */
        C0006c<K, V> mo2952a(C0006c<K, V> c0006c) {
            return c0006c.f8d;
        }

        /* renamed from: b */
        C0006c<K, V> mo2953b(C0006c<K, V> c0006c) {
            return c0006c.f7c;
        }
    }

    /* renamed from: a */
    protected C0006c<K, V> mo18a(K k) {
        C0006c<K, V> c0006c = this.f9a;
        while (c0006c != null) {
            if (c0006c.f5a.equals(k)) {
                break;
            }
            c0006c = c0006c.f7c;
        }
        return c0006c;
    }

    /* renamed from: a */
    public V mo19a(@NonNull K k, @NonNull V v) {
        C0006c a = mo18a((Object) k);
        if (a != null) {
            return a.f6b;
        }
        m42b(k, v);
        return null;
    }

    /* renamed from: b */
    protected C0006c<K, V> m42b(@NonNull K k, @NonNull V v) {
        C0006c<K, V> c0006c = new C0006c(k, v);
        this.f12d++;
        if (this.f10b == null) {
            this.f9a = c0006c;
            this.f10b = this.f9a;
            return c0006c;
        }
        this.f10b.f7c = c0006c;
        c0006c.f8d = this.f10b;
        this.f10b = c0006c;
        return c0006c;
    }

    /* renamed from: b */
    public V mo20b(@NonNull K k) {
        k = mo18a((Object) k);
        if (k == null) {
            return null;
        }
        this.f12d--;
        if (!this.f11c.isEmpty()) {
            for (C0007f a_ : this.f11c.keySet()) {
                a_.a_(k);
            }
        }
        if (k.f8d != null) {
            k.f8d.f7c = k.f7c;
        } else {
            this.f9a = k.f7c;
        }
        if (k.f7c != null) {
            k.f7c.f8d = k.f8d;
        } else {
            this.f10b = k.f8d;
        }
        k.f7c = null;
        k.f8d = null;
        return k.f6b;
    }

    /* renamed from: a */
    public int m39a() {
        return this.f12d;
    }

    @NonNull
    public Iterator<Entry<K, V>> iterator() {
        Iterator c3974a = new C3974a(this.f9a, this.f10b);
        this.f11c.put(c3974a, Boolean.valueOf(false));
        return c3974a;
    }

    /* renamed from: b */
    public Iterator<Entry<K, V>> m44b() {
        Iterator c3975b = new C3975b(this.f10b, this.f9a);
        this.f11c.put(c3975b, Boolean.valueOf(false));
        return c3975b;
    }

    /* renamed from: c */
    public C2676d m45c() {
        C2676d c2676d = new C2676d();
        this.f11c.put(c2676d, Boolean.valueOf(false));
        return c2676d;
    }

    /* renamed from: d */
    public Entry<K, V> m46d() {
        return this.f9a;
    }

    /* renamed from: e */
    public Entry<K, V> m47e() {
        return this.f10b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0008b)) {
            return false;
        }
        C0008b c0008b = (C0008b) obj;
        if (m39a() != c0008b.m39a()) {
            return false;
        }
        Iterator it = iterator();
        obj = c0008b.iterator();
        while (it.hasNext() && obj.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = obj.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || obj.hasNext() != null) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
