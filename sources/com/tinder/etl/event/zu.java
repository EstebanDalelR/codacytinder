package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class zu implements EtlEvent {
    /* renamed from: a */
    private String f37930a;
    /* renamed from: b */
    private Number f37931b;
    /* renamed from: c */
    private String f37932c;
    /* renamed from: d */
    private Boolean f37933d;
    /* renamed from: e */
    private String f37934e;
    /* renamed from: f */
    private String f37935f;
    /* renamed from: g */
    private Map f37936g;
    /* renamed from: h */
    private Boolean f37937h;
    /* renamed from: i */
    private Number f37938i;
    /* renamed from: j */
    private String f37939j;
    /* renamed from: k */
    private Number f37940k;
    /* renamed from: l */
    private Number f37941l;
    /* renamed from: m */
    private String f37942m;
    /* renamed from: n */
    private Boolean f37943n;
    /* renamed from: o */
    private Number f37944o;
    /* renamed from: p */
    private Number f37945p;
    /* renamed from: q */
    private Number f37946q;
    /* renamed from: r */
    private Number f37947r;
    /* renamed from: s */
    private Map f37948s;
    /* renamed from: t */
    private Number f37949t;
    /* renamed from: u */
    private String f37950u;
    /* renamed from: v */
    private String f37951v;
    /* renamed from: w */
    private String f37952w;
    /* renamed from: x */
    private Boolean f37953x;

    /* renamed from: com.tinder.etl.event.zu$a */
    public static class C9358a {
        /* renamed from: a */
        private zu f31415a;

        private C9358a() {
            this.f31415a = new zu();
        }

        /* renamed from: a */
        public final C9358a m39165a(String str) {
            this.f31415a.f37930a = str;
            return this;
        }

        /* renamed from: a */
        public final C9358a m39164a(Number number) {
            this.f31415a.f37931b = number;
            return this;
        }

        /* renamed from: b */
        public final C9358a m39170b(String str) {
            this.f31415a.f37932c = str;
            return this;
        }

        /* renamed from: a */
        public final C9358a m39163a(Boolean bool) {
            this.f31415a.f37933d = bool;
            return this;
        }

        /* renamed from: c */
        public final C9358a m39173c(String str) {
            this.f31415a.f37934e = str;
            return this;
        }

        /* renamed from: d */
        public final C9358a m39175d(String str) {
            this.f31415a.f37935f = str;
            return this;
        }

        /* renamed from: a */
        public final C9358a m39166a(Map map) {
            this.f31415a.f37936g = map;
            return this;
        }

        /* renamed from: b */
        public final C9358a m39169b(Number number) {
            this.f31415a.f37938i = number;
            return this;
        }

        /* renamed from: e */
        public final C9358a m39177e(String str) {
            this.f31415a.f37939j = str;
            return this;
        }

        /* renamed from: c */
        public final C9358a m39172c(Number number) {
            this.f31415a.f37940k = number;
            return this;
        }

        /* renamed from: d */
        public final C9358a m39174d(Number number) {
            this.f31415a.f37941l = number;
            return this;
        }

        /* renamed from: f */
        public final C9358a m39179f(String str) {
            this.f31415a.f37942m = str;
            return this;
        }

        /* renamed from: b */
        public final C9358a m39168b(Boolean bool) {
            this.f31415a.f37943n = bool;
            return this;
        }

        /* renamed from: e */
        public final C9358a m39176e(Number number) {
            this.f31415a.f37947r = number;
            return this;
        }

        /* renamed from: b */
        public final C9358a m39171b(Map map) {
            this.f31415a.f37948s = map;
            return this;
        }

        /* renamed from: f */
        public final C9358a m39178f(Number number) {
            this.f31415a.f37949t = number;
            return this;
        }

        /* renamed from: g */
        public final C9358a m39180g(String str) {
            this.f31415a.f37950u = str;
            return this;
        }

        /* renamed from: h */
        public final C9358a m39181h(String str) {
            this.f31415a.f37952w = str;
            return this;
        }

        /* renamed from: a */
        public zu m39167a() {
            return this.f31415a;
        }
    }

    /* renamed from: com.tinder.etl.event.zu$b */
    public class C11591b extends fw {
        /* renamed from: a */
        final /* synthetic */ zu f37928a;

        /* renamed from: a */
        public String mo10346a() {
            return "User";
        }

        public C11591b(zu zuVar, Map<EtlField<?>, Object> map) {
            this.f37928a = zuVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.zu$c */
    private final class C11592c implements DescriptorFactory<C11591b, zu> {
        /* renamed from: a */
        final /* synthetic */ zu f37929a;

        private C11592c(zu zuVar) {
            this.f37929a = zuVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m47213a((zu) etlEvent);
        }

        /* renamed from: a */
        public final C11591b m47213a(zu zuVar) {
            Map hashMap = new HashMap();
            if (zuVar.f37930a != null) {
                hashMap.put(new bs(), zuVar.f37930a);
            }
            if (zuVar.f37931b != null) {
                hashMap.put(new eg(), zuVar.f37931b);
            }
            if (zuVar.f37932c != null) {
                hashMap.put(new ek(), zuVar.f37932c);
            }
            if (zuVar.f37933d != null) {
                hashMap.put(new fb(), zuVar.f37933d);
            }
            if (zuVar.f37934e != null) {
                hashMap.put(new fq(), zuVar.f37934e);
            }
            if (zuVar.f37935f != null) {
                hashMap.put(new fo(), zuVar.f37935f);
            }
            if (zuVar.f37936g != null) {
                hashMap.put(new fp(), zuVar.f37936g);
            }
            if (zuVar.f37937h != null) {
                hashMap.put(new gv(), zuVar.f37937h);
            }
            if (zuVar.f37938i != null) {
                hashMap.put(new jb(), zuVar.f37938i);
            }
            if (zuVar.f37939j != null) {
                hashMap.put(new ka(), zuVar.f37939j);
            }
            if (zuVar.f37940k != null) {
                hashMap.put(new ly(), zuVar.f37940k);
            }
            if (zuVar.f37941l != null) {
                hashMap.put(new mr(), zuVar.f37941l);
            }
            if (zuVar.f37942m != null) {
                hashMap.put(new mu(), zuVar.f37942m);
            }
            if (zuVar.f37943n != null) {
                hashMap.put(new qj(), zuVar.f37943n);
            }
            if (zuVar.f37944o != null) {
                hashMap.put(new ry(), zuVar.f37944o);
            }
            if (zuVar.f37945p != null) {
                hashMap.put(new rz(), zuVar.f37945p);
            }
            if (zuVar.f37946q != null) {
                hashMap.put(new sc(), zuVar.f37946q);
            }
            if (zuVar.f37947r != null) {
                hashMap.put(new sg(), zuVar.f37947r);
            }
            if (zuVar.f37948s != null) {
                hashMap.put(new st(), zuVar.f37948s);
            }
            if (zuVar.f37949t != null) {
                hashMap.put(new te(), zuVar.f37949t);
            }
            if (zuVar.f37950u != null) {
                hashMap.put(new vj(), zuVar.f37950u);
            }
            if (zuVar.f37951v != null) {
                hashMap.put(new yp(), zuVar.f37951v);
            }
            if (zuVar.f37952w != null) {
                hashMap.put(new yw(), zuVar.f37952w);
            }
            if (zuVar.f37953x != null) {
                hashMap.put(new aak(), zuVar.f37953x);
            }
            return new C11591b(this.f37929a, hashMap);
        }
    }

    private zu() {
    }

    /* renamed from: a */
    public static C9358a m47214a() {
        return new C9358a();
    }

    public final DescriptorFactory<C11591b, zu> getDescriptorFactory() {
        return new C11592c();
    }
}
