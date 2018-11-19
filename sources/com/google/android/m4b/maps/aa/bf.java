package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.aa.ag.C8041a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

final class bf<K, V> extends C6372z<K, V> {
    /* renamed from: a */
    private final transient ag<K, V>[] f27187a;
    /* renamed from: b */
    private final transient ag<K, V>[] f27188b;
    /* renamed from: c */
    private final transient ag<K, V>[] f27189c;
    /* renamed from: d */
    private final transient int f27190d;
    /* renamed from: e */
    private final transient int f27191e;
    /* renamed from: f */
    private transient C6372z<V, K> f27192f;

    /* renamed from: com.google.android.m4b.maps.aa.bf$b */
    static class C4571b<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        /* renamed from: a */
        private final C6372z<K, V> f16959a;

        C4571b(C6372z<K, V> c6372z) {
            this.f16959a = c6372z;
        }

        final Object readResolve() {
            return this.f16959a.mo7002i();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.bf$a */
    final class C7413a extends C6372z<V, K> {
        /* renamed from: a */
        final /* synthetic */ bf f27186a;

        /* renamed from: com.google.android.m4b.maps.aa.bf$a$a */
        final class C8053a extends ah<V, K> {
            /* renamed from: a */
            final /* synthetic */ C7413a f28858a;

            /* renamed from: com.google.android.m4b.maps.aa.bf$a$a$1 */
            class C80521 extends C7423y<Entry<V, K>> {
                /* renamed from: a */
                private /* synthetic */ C8053a f28857a;

                C80521(C8053a c8053a) {
                    this.f28857a = c8053a;
                }

                /* renamed from: h */
                final aa<Entry<V, K>> mo7522h() {
                    return this.f28857a;
                }

                public final /* synthetic */ Object get(int i) {
                    i = this.f28857a.f28858a.f27186a.f27189c[i];
                    return ax.m20620a(i.getValue(), i.getKey());
                }
            }

            /* renamed from: g */
            final boolean mo7005g() {
                return true;
            }

            C8053a(C7413a c7413a) {
                this.f28858a = c7413a;
            }

            /* renamed from: e */
            final af<V, K> mo7518e() {
                return this.f28858a;
            }

            public final int hashCode() {
                return this.f28858a.f27186a.f27191e;
            }

            /* renamed from: a */
            public final bw<Entry<V, K>> mo4785a() {
                return mo4786b().mo4785a();
            }

            /* renamed from: c */
            final ae<Entry<V, K>> mo4790c() {
                return new C80521(this);
            }

            public final /* synthetic */ Iterator iterator() {
                return mo4786b().mo4785a();
            }
        }

        /* renamed from: c */
        final boolean mo4780c() {
            return false;
        }

        private C7413a(bf bfVar) {
            this.f27186a = bfVar;
        }

        /* renamed from: i */
        public final C6372z<K, V> mo7002i() {
            return this.f27186a;
        }

        public final K get(Object obj) {
            if (obj == null) {
                return null;
            }
            for (ag agVar = this.f27186a.f27188b[C4588x.m20678a(obj.hashCode()) & this.f27186a.f27190d]; agVar != null; agVar = agVar.mo7521b()) {
                if (obj.equals(agVar.getValue())) {
                    return agVar.getKey();
                }
            }
            return null;
        }

        /* renamed from: b */
        final al<Entry<V, K>> mo4779b() {
            return new C8053a(this);
        }

        final Object writeReplace() {
            return new C4571b(this.f27186a);
        }

        public final int size() {
            return this.f27186a.size();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.bf$1 */
    class C80511 extends ah<K, V> {
        /* renamed from: a */
        private /* synthetic */ bf f28856a;

        /* renamed from: g */
        final boolean mo7005g() {
            return true;
        }

        C80511(bf bfVar) {
            this.f28856a = bfVar;
        }

        /* renamed from: e */
        final af<K, V> mo7518e() {
            return this.f28856a;
        }

        /* renamed from: a */
        public final bw<Entry<K, V>> mo4785a() {
            return mo4786b().mo4785a();
        }

        /* renamed from: c */
        final ae<Entry<K, V>> mo4790c() {
            return new be((aa) this, this.f28856a.f27189c);
        }

        public final int hashCode() {
            return this.f28856a.f27191e;
        }

        public final /* synthetic */ Iterator iterator() {
            return mo4786b().mo4785a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.bf$c */
    static final class C8054c<K, V> extends ag<K, V> {
        /* renamed from: a */
        private final ag<K, V> f28859a;
        /* renamed from: b */
        private final ag<K, V> f28860b;

        C8054c(ag<K, V> agVar, ag<K, V> agVar2, ag<K, V> agVar3) {
            super(agVar);
            this.f28859a = agVar2;
            this.f28860b = agVar3;
        }

        /* renamed from: a */
        final ag<K, V> mo7520a() {
            return this.f28859a;
        }

        /* renamed from: b */
        final ag<K, V> mo7521b() {
            return this.f28860b;
        }
    }

    /* renamed from: c */
    final boolean mo4780c() {
        return false;
    }

    bf(int i, C8041a<?, ?>[] c8041aArr) {
        int i2 = i;
        int a = C4588x.m20679a(i2, 1.2d);
        this.f27190d = a - 1;
        ag[] agVarArr = new ag[a];
        ag[] agVarArr2 = new ag[a];
        ag[] agVarArr3 = new ag[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            C8054c c8054c;
            C8054c c8054c2 = c8041aArr[i3];
            Object key = c8054c2.getKey();
            Object value = c8054c2.getValue();
            int hashCode = key.hashCode();
            int hashCode2 = value.hashCode();
            int a2 = C4588x.m20678a(hashCode) & r0.f27190d;
            int a3 = C4588x.m20678a(hashCode2) & r0.f27190d;
            ag agVar = agVarArr[a2];
            Object obj = agVar;
            while (obj != null) {
                Object obj2 = key;
                af.m20490a(key.equals(obj.getKey()) ^ 1, "key", c8054c2, obj);
                obj = obj.mo7520a();
                key = obj2;
            }
            ag agVar2 = agVarArr2[a3];
            Object obj3 = agVar2;
            while (obj3 != null) {
                Object obj4 = value;
                af.m20490a(value.equals(obj3.getValue()) ^ 1, "value", c8054c2, obj3);
                obj3 = obj3.mo7521b();
                value = obj4;
            }
            if (agVar == null && agVar2 == null) {
                c8054c = c8054c2;
            } else {
                c8054c = new C8054c(c8054c2, agVar, agVar2);
            }
            agVarArr[a2] = c8054c;
            agVarArr2[a3] = c8054c;
            agVarArr3[i3] = c8054c;
            i4 += hashCode ^ hashCode2;
            i3++;
            i2 = i;
        }
        r0.f27187a = agVarArr;
        r0.f27188b = agVarArr2;
        r0.f27189c = agVarArr3;
        r0.f27191e = i4;
    }

    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        for (ag agVar = this.f27187a[C4588x.m20678a(obj.hashCode()) & this.f27190d]; agVar != null; agVar = agVar.mo7520a()) {
            if (obj.equals(agVar.getKey())) {
                return agVar.getValue();
            }
        }
        return null;
    }

    /* renamed from: b */
    final al<Entry<K, V>> mo4779b() {
        return new C80511(this);
    }

    public final int size() {
        return this.f27189c.length;
    }

    /* renamed from: i */
    public final C6372z<V, K> mo7002i() {
        C6372z<V, K> c6372z = this.f27192f;
        if (c6372z != null) {
            return c6372z;
        }
        c6372z = new C7413a();
        this.f27192f = c6372z;
        return c6372z;
    }
}
