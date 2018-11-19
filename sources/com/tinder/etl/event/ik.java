package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ik implements EtlEvent {
    /* renamed from: a */
    private Number f36863a;
    /* renamed from: b */
    private String f36864b;
    /* renamed from: c */
    private Number f36865c;
    /* renamed from: d */
    private String f36866d;
    /* renamed from: e */
    private Number f36867e;
    /* renamed from: f */
    private Number f36868f;
    /* renamed from: g */
    private List f36869g;
    /* renamed from: h */
    private Number f36870h;
    /* renamed from: i */
    private String f36871i;
    /* renamed from: j */
    private List f36872j;
    /* renamed from: k */
    private Boolean f36873k;
    /* renamed from: l */
    private List f36874l;
    /* renamed from: m */
    private Number f36875m;
    /* renamed from: n */
    private String f36876n;
    /* renamed from: o */
    private String f36877o;
    /* renamed from: p */
    private String f36878p;

    /* renamed from: com.tinder.etl.event.ik$a */
    public static class C9120a {
        /* renamed from: a */
        private ik f31296a;

        private C9120a() {
            this.f31296a = new ik();
        }

        /* renamed from: a */
        public final C9120a m38388a(Number number) {
            this.f31296a.f36863a = number;
            return this;
        }

        /* renamed from: a */
        public final C9120a m38389a(String str) {
            this.f31296a.f36864b = str;
            return this;
        }

        /* renamed from: b */
        public final C9120a m38392b(Number number) {
            this.f31296a.f36865c = number;
            return this;
        }

        /* renamed from: b */
        public final C9120a m38393b(String str) {
            this.f31296a.f36866d = str;
            return this;
        }

        /* renamed from: c */
        public final C9120a m38395c(Number number) {
            this.f31296a.f36867e = number;
            return this;
        }

        /* renamed from: d */
        public final C9120a m38396d(Number number) {
            this.f31296a.f36868f = number;
            return this;
        }

        /* renamed from: a */
        public final C9120a m38390a(List list) {
            this.f31296a.f36869g = list;
            return this;
        }

        /* renamed from: e */
        public final C9120a m38397e(Number number) {
            this.f31296a.f36870h = number;
            return this;
        }

        /* renamed from: b */
        public final C9120a m38394b(List list) {
            this.f31296a.f36872j = list;
            return this;
        }

        /* renamed from: a */
        public ik m38391a() {
            return this.f31296a;
        }
    }

    /* renamed from: com.tinder.etl.event.ik$b */
    public class C11336b extends fw {
        /* renamed from: a */
        final /* synthetic */ ik f36861a;

        /* renamed from: a */
        public String mo10346a() {
            return "Gold.Paywall";
        }

        public C11336b(ik ikVar, Map<EtlField<?>, Object> map) {
            this.f36861a = ikVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ik$c */
    private final class C11337c implements DescriptorFactory<C11336b, ik> {
        /* renamed from: a */
        final /* synthetic */ ik f36862a;

        private C11337c(ik ikVar) {
            this.f36862a = ikVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45371a((ik) etlEvent);
        }

        /* renamed from: a */
        public final C11336b m45371a(ik ikVar) {
            Map hashMap = new HashMap();
            if (ikVar.f36863a != null) {
                hashMap.put(new bq(), ikVar.f36863a);
            }
            if (ikVar.f36864b != null) {
                hashMap.put(new ej(), ikVar.f36864b);
            }
            if (ikVar.f36865c != null) {
                hashMap.put(new kf(), ikVar.f36865c);
            }
            if (ikVar.f36866d != null) {
                hashMap.put(new lc(), ikVar.f36866d);
            }
            if (ikVar.f36867e != null) {
                hashMap.put(new pk(), ikVar.f36867e);
            }
            if (ikVar.f36868f != null) {
                hashMap.put(new pl(), ikVar.f36868f);
            }
            if (ikVar.f36869g != null) {
                hashMap.put(new rm(), ikVar.f36869g);
            }
            if (ikVar.f36870h != null) {
                hashMap.put(new sk(), ikVar.f36870h);
            }
            if (ikVar.f36871i != null) {
                hashMap.put(new wr(), ikVar.f36871i);
            }
            if (ikVar.f36872j != null) {
                hashMap.put(new ws(), ikVar.f36872j);
            }
            if (ikVar.f36873k != null) {
                hashMap.put(new kd(), ikVar.f36873k);
            }
            if (ikVar.f36874l != null) {
                hashMap.put(new aag(), ikVar.f36874l);
            }
            if (ikVar.f36875m != null) {
                hashMap.put(new ez(), ikVar.f36875m);
            }
            if (ikVar.f36876n != null) {
                hashMap.put(new ey(), ikVar.f36876n);
            }
            if (ikVar.f36877o != null) {
                hashMap.put(new ex(), ikVar.f36877o);
            }
            if (ikVar.f36878p != null) {
                hashMap.put(new yf(), ikVar.f36878p);
            }
            return new C11336b(this.f36862a, hashMap);
        }
    }

    private ik() {
    }

    /* renamed from: a */
    public static C9120a m45372a() {
        return new C9120a();
    }

    public final DescriptorFactory<C11336b, ik> getDescriptorFactory() {
        return new C11337c();
    }
}
