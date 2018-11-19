package com.google.android.m4b.maps.aa;

abstract class ag<K, V> extends ab<K, V> {

    /* renamed from: com.google.android.m4b.maps.aa.ag$a */
    static final class C8041a<K, V> extends ag<K, V> {
        /* renamed from: a */
        final ag<K, V> mo7520a() {
            return null;
        }

        /* renamed from: b */
        final ag<K, V> mo7521b() {
            return null;
        }

        C8041a(K k, V v) {
            super(k, v);
        }
    }

    /* renamed from: a */
    abstract ag<K, V> mo7520a();

    /* renamed from: b */
    abstract ag<K, V> mo7521b();

    ag(K k, V v) {
        super(k, v);
        C4583i.m20669a((Object) k, (Object) v);
    }

    ag(ag<K, V> agVar) {
        super(agVar.getKey(), agVar.getValue());
    }
}
