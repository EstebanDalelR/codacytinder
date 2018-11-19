package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.p125y.C5571j;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;

final class ac<K extends Enum<K>, V> extends af<K, V> {
    /* renamed from: a */
    private final transient EnumMap<K, V> f23629a;

    /* renamed from: com.google.android.m4b.maps.aa.ac$a */
    static class C4537a<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        /* renamed from: a */
        private EnumMap<K, V> f16852a;

        C4537a(EnumMap<K, V> enumMap) {
            this.f16852a = enumMap;
        }

        final Object readResolve() {
            return new ac(this.f16852a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.ac$1 */
    class C73961 extends al<K> {
        /* renamed from: a */
        private /* synthetic */ ac f27140a;

        /* renamed from: d */
        final boolean mo4791d() {
            return true;
        }

        C73961(ac acVar) {
            this.f27140a = acVar;
        }

        public final /* synthetic */ Iterator iterator() {
            return mo4785a();
        }

        public final boolean contains(Object obj) {
            return this.f27140a.f23629a.containsKey(obj);
        }

        public final int size() {
            return this.f27140a.size();
        }

        /* renamed from: a */
        public final bw<K> mo4785a() {
            return at.m20507a(this.f27140a.f23629a.keySet().iterator());
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.ac$2 */
    class C80392 extends ah<K, V> {
        /* renamed from: a */
        final /* synthetic */ ac f28831a;

        /* renamed from: com.google.android.m4b.maps.aa.ac$2$1 */
        class C63081 extends bw<Entry<K, V>> {
            /* renamed from: a */
            private final Iterator<Entry<K, V>> f23627a = this.f23628b.f28831a.f23629a.entrySet().iterator();
            /* renamed from: b */
            private /* synthetic */ C80392 f23628b;

            C63081(C80392 c80392) {
                this.f23628b = c80392;
            }

            public final boolean hasNext() {
                return this.f23627a.hasNext();
            }

            public final /* synthetic */ Object next() {
                Entry entry = (Entry) this.f23627a.next();
                return ax.m20620a(entry.getKey(), entry.getValue());
            }
        }

        C80392(ac acVar) {
            this.f28831a = acVar;
        }

        public final /* synthetic */ Iterator iterator() {
            return mo4785a();
        }

        /* renamed from: e */
        final af<K, V> mo7518e() {
            return this.f28831a;
        }

        /* renamed from: a */
        public final bw<Entry<K, V>> mo4785a() {
            return new C63081(this);
        }
    }

    /* renamed from: c */
    final boolean mo4780c() {
        return false;
    }

    /* renamed from: a */
    static <K extends Enum<K>, V> af<K, V> m27675a(EnumMap<K, V> enumMap) {
        switch (enumMap.size()) {
            case 0:
                return C6372z.m27852j();
            case 1:
                Entry entry = (Entry) as.m20502a(enumMap.entrySet());
                return C6372z.m27851c(entry.getKey(), entry.getValue());
            default:
                return new ac(enumMap);
        }
    }

    private ac(EnumMap<K, V> enumMap) {
        this.f23629a = enumMap;
        C5571j.m24297a(enumMap.isEmpty() ^ 1);
    }

    /* renamed from: a */
    final al<K> mo4778a() {
        return new C73961(this);
    }

    public final int size() {
        return this.f23629a.size();
    }

    public final boolean containsKey(Object obj) {
        return this.f23629a.containsKey(obj);
    }

    public final V get(Object obj) {
        return this.f23629a.get(obj);
    }

    /* renamed from: b */
    final al<Entry<K, V>> mo4779b() {
        return new C80392(this);
    }

    final Object writeReplace() {
        return new C4537a(this.f23629a);
    }
}
