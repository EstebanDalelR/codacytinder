package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.af.C4540a;
import com.google.android.m4b.maps.aa.af.C4541b;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.m4b.maps.aa.z */
public abstract class C6372z<K, V> extends af<K, V> implements C4582g<K, V> {
    /* renamed from: a */
    private static final Entry<?, ?>[] f23698a = new Entry[0];

    /* renamed from: com.google.android.m4b.maps.aa.z$a */
    public static final class C6370a<K, V> extends C4540a<K, V> {
        /* renamed from: a */
        public final /* synthetic */ af mo4795a() {
            switch (this.b) {
                case 0:
                    return C6372z.m27852j();
                case 1:
                    return C6372z.m27851c(this.a[0].getKey(), this.a[0].getValue());
                default:
                    return new bf(this.b, this.a);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ C4540a mo4794a(Map map) {
            super.mo4794a(map);
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C4540a mo4792a(Object obj, Object obj2) {
            super.mo4792a(obj, obj2);
            return this;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.z$b */
    static class C6371b extends C4541b {
        private static final long serialVersionUID = 0;

        C6371b(C6372z<?, ?> c6372z) {
            super(c6372z);
        }

        final Object readResolve() {
            return m20487a(new C6370a());
        }
    }

    /* renamed from: i */
    public abstract C6372z<V, K> mo7002i();

    /* renamed from: j */
    public static <K, V> C6372z<K, V> m27852j() {
        return C7419l.f27213a;
    }

    /* renamed from: c */
    public static <K, V> C6372z<K, V> m27851c(K k, V v) {
        return new bp(k, v);
    }

    C6372z() {
    }

    Object writeReplace() {
        return new C6371b(this);
    }

    /* renamed from: h */
    public final /* synthetic */ aa mo4838h() {
        return mo7002i().mo6998g();
    }

    public /* synthetic */ Collection values() {
        return mo7002i().mo6998g();
    }
}
