package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b'\u0018\u0000 )*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001)B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0018\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\rH\u0016J#\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0014H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0002J\u001c\u0010&\u001a\u00020'2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016H\bR\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b8\b@\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006*"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "()V", "_keys", "", "_values", "", "keys", "getKeys", "()Ljava/util/Set;", "size", "", "getSize", "()I", "values", "getValues", "()Ljava/util/Collection;", "containsEntry", "", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "implFindEntry", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "isEmpty", "toString", "", "o", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
/* renamed from: kotlin.collections.c */
public abstract class C17549c<K, V> implements Map<K, V>, KMappedMarker {
    /* renamed from: a */
    public static final C15803a f54749a = new C15803a();
    /* renamed from: b */
    private volatile Set<? extends K> f54750b;
    /* renamed from: c */
    private volatile Collection<? extends V> f54751c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "()V", "entryEquals", "", "e", "", "other", "entryEquals$kotlin_stdlib", "entryHashCode", "", "entryHashCode$kotlin_stdlib", "entryToString", "", "entryToString$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.collections.c$a */
    public static final class C15803a {
        private C15803a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\nJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"kotlin/collections/AbstractMap$values$1", "Lkotlin/collections/AbstractCollection;", "(Lkotlin/collections/AbstractMap;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.collections.c$c */
    public static final class C18454c extends C17545a<V> {
        /* renamed from: a */
        final /* synthetic */ C17549c f57748a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/collections/AbstractMap$values$1$iterator$1", "", "(Ljava/util/Iterator;)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
        /* renamed from: kotlin.collections.c$c$a */
        public static final class C17548a implements Iterator<V>, KMappedMarker {
            /* renamed from: a */
            final /* synthetic */ Iterator f54748a;

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            C17548a(Iterator it) {
                this.f54748a = it;
            }

            public boolean hasNext() {
                return this.f54748a.hasNext();
            }

            public V next() {
                return ((Entry) this.f54748a.next()).getValue();
            }
        }

        C18454c(C17549c c17549c) {
            this.f57748a = c17549c;
        }

        public boolean contains(Object obj) {
            return this.f57748a.containsValue(obj);
        }

        @NotNull
        public Iterator<V> iterator() {
            return new C17548a(this.f57748a.entrySet().iterator());
        }

        /* renamed from: a */
        public int mo13772a() {
            return this.f57748a.size();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\nJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"kotlin/collections/AbstractMap$keys$1", "Lkotlin/collections/AbstractSet;", "(Lkotlin/collections/AbstractMap;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
    /* renamed from: kotlin.collections.c$b */
    public static final class C19064b extends C18455e<K> {
        /* renamed from: a */
        final /* synthetic */ C17549c f59338a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/collections/AbstractMap$keys$1$iterator$1", "", "(Ljava/util/Iterator;)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 10})
        /* renamed from: kotlin.collections.c$b$a */
        public static final class C17547a implements Iterator<K>, KMappedMarker {
            /* renamed from: a */
            final /* synthetic */ Iterator f54747a;

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            C17547a(Iterator it) {
                this.f54747a = it;
            }

            public boolean hasNext() {
                return this.f54747a.hasNext();
            }

            public K next() {
                return ((Entry) this.f54747a.next()).getKey();
            }
        }

        C19064b(C17549c c17549c) {
            this.f59338a = c17549c;
        }

        public boolean contains(Object obj) {
            return this.f59338a.containsKey(obj);
        }

        @NotNull
        public Iterator<K> iterator() {
            return new C17547a(this.f59338a.entrySet().iterator());
        }

        /* renamed from: a */
        public int mo13772a() {
            return this.f59338a.size();
        }
    }

    /* renamed from: a */
    public abstract Set m64187a();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected C17549c() {
    }

    public final Set<Entry<K, V>> entrySet() {
        return m64187a();
    }

    public final Set<K> keySet() {
        return m64190c();
    }

    public final int size() {
        return m64189b();
    }

    public final Collection<V> values() {
        return m64191d();
    }

    public boolean containsKey(Object obj) {
        return m64186b(obj) != null ? true : null;
    }

    public boolean containsValue(Object obj) {
        Iterable<Entry> entrySet = entrySet();
        if ((entrySet instanceof Collection) && ((Collection) entrySet).isEmpty()) {
            return false;
        }
        for (Entry value : entrySet) {
            if (C2668g.a(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m64188a(@Nullable Entry<?, ?> entry) {
        if (!(entry instanceof Entry)) {
            return false;
        }
        Object key = entry.getKey();
        entry = entry.getValue();
        if (this == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        }
        Map map = this;
        Object obj = get(key);
        if ((C2668g.a(entry, obj) ^ 1) != null) {
            return false;
        }
        if (obj == null) {
            if (this == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            } else if (containsKey(key) == null) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Iterable<Entry> entrySet = map.entrySet();
        if (!(entrySet instanceof Collection) || !((Collection) entrySet).isEmpty()) {
            for (Entry a : entrySet) {
                if (!m64188a(a)) {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    @Nullable
    public V get(Object obj) {
        obj = m64186b(obj);
        return obj != null ? obj.getValue() : null;
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: b */
    public int m64189b() {
        return entrySet().size();
    }

    @NotNull
    /* renamed from: c */
    public Set<K> m64190c() {
        if (this.f54750b == null) {
            this.f54750b = new C19064b(this);
        }
        Set<K> set = this.f54750b;
        if (set == null) {
            C2668g.a();
        }
        return set;
    }

    @NotNull
    public String toString() {
        return C19299w.m68797a(entrySet(), ", ", "{", "}", 0, null, new AbstractMap$toString$1(this), 24, null);
    }

    /* renamed from: b */
    private final String m64185b(Entry<? extends K, ? extends V> entry) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m64183a(entry.getKey()));
        stringBuilder.append("=");
        stringBuilder.append(m64183a(entry.getValue()));
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private final String m64183a(Object obj) {
        return obj == ((C17549c) this) ? "(this Map)" : String.valueOf(obj);
    }

    @NotNull
    /* renamed from: d */
    public Collection<V> m64191d() {
        if (this.f54751c == null) {
            this.f54751c = new C18454c(this);
        }
        Collection<V> collection = this.f54751c;
        if (collection == null) {
            C2668g.a();
        }
        return collection;
    }

    /* renamed from: b */
    private final Entry<K, V> m64186b(K k) {
        for (Object next : entrySet()) {
            if (C2668g.a(((Entry) next).getKey(), k)) {
                break;
            }
        }
        Object next2 = null;
        return (Entry) next2;
    }
}
