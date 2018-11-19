package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.bn.C4572a;
import com.tinder.api.ManagerWebServices;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public abstract class ak<K, V> extends C6362e<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    /* renamed from: a */
    final transient af<K, ? extends aa<V>> f27148a;
    /* renamed from: b */
    private transient int f27149b;

    /* renamed from: com.google.android.m4b.maps.aa.ak$a */
    public static class C4545a<K, V> {
        /* renamed from: a */
        ay<K, V> f16866a = new C8044b();
    }

    /* renamed from: com.google.android.m4b.maps.aa.ak$c */
    static class C4546c {
        /* renamed from: a */
        static final C4572a<ak> f16867a = bn.m20650a(ak.class, "map");
        /* renamed from: b */
        static final C4572a<ak> f16868b = bn.m20650a(ak.class, ManagerWebServices.PARAM_SIZE);
        /* renamed from: c */
        static final C4572a<am> f16869c = bn.m20650a(am.class, "emptySet");
    }

    /* renamed from: com.google.android.m4b.maps.aa.ak$b */
    static class C8044b<K, V> extends C7418c<K, V> {
        private static final long serialVersionUID = 0;

        C8044b() {
            super(new LinkedHashMap());
        }

        /* renamed from: d */
        final Collection<V> mo7523d() {
            return new ArrayList();
        }
    }

    /* renamed from: b */
    public abstract aa<V> mo7524b(K k);

    /* renamed from: a */
    public /* synthetic */ Collection mo6988a(Object obj) {
        return mo7524b(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ boolean mo4835f() {
        return super.mo4835f();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    ak(af<K, ? extends aa<V>> afVar, int i) {
        this.f27148a = afVar;
        this.f27149b = i;
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo4834a(K k, V v) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final int mo6990b() {
        return this.f27149b;
    }

    /* renamed from: a */
    final Map<K, Collection<V>> mo6989a() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: h */
    public final /* synthetic */ Map mo4836h() {
        return this.f27148a;
    }

    /* renamed from: c */
    public final /* synthetic */ Set mo6991c() {
        return this.f27148a.mo6998g();
    }
}
