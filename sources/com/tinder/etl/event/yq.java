package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class yq implements EtlEvent {
    /* renamed from: a */
    private Number f37766a;
    /* renamed from: b */
    private String f37767b;
    /* renamed from: c */
    private Number f37768c;
    /* renamed from: d */
    private String f37769d;
    /* renamed from: e */
    private String f37770e;
    /* renamed from: f */
    private List f37771f;
    /* renamed from: g */
    private List f37772g;
    /* renamed from: h */
    private List f37773h;
    /* renamed from: i */
    private String f37774i;
    /* renamed from: j */
    private Number f37775j;
    /* renamed from: k */
    private Number f37776k;
    /* renamed from: l */
    private Number f37777l;
    /* renamed from: m */
    private Number f37778m;
    /* renamed from: n */
    private String f37779n;
    /* renamed from: o */
    private Number f37780o;
    /* renamed from: p */
    private List f37781p;
    /* renamed from: q */
    private List f37782q;
    /* renamed from: r */
    private String f37783r;
    /* renamed from: s */
    private List f37784s;
    /* renamed from: t */
    private Number f37785t;
    /* renamed from: u */
    private Number f37786u;
    /* renamed from: v */
    private String f37787v;
    /* renamed from: w */
    private Boolean f37788w;

    /* renamed from: com.tinder.etl.event.yq$a */
    public static class C9336a {
        /* renamed from: a */
        private yq f31404a;

        private C9336a() {
            this.f31404a = new yq();
        }

        /* renamed from: a */
        public final C9336a m39023a(Number number) {
            this.f31404a.f37766a = number;
            return this;
        }

        /* renamed from: a */
        public final C9336a m39024a(String str) {
            this.f31404a.f37767b = str;
            return this;
        }

        /* renamed from: b */
        public final C9336a m39027b(Number number) {
            this.f31404a.f37768c = number;
            return this;
        }

        /* renamed from: b */
        public final C9336a m39028b(String str) {
            this.f31404a.f37769d = str;
            return this;
        }

        /* renamed from: c */
        public final C9336a m39031c(String str) {
            this.f31404a.f37770e = str;
            return this;
        }

        /* renamed from: a */
        public final C9336a m39025a(List list) {
            this.f31404a.f37771f = list;
            return this;
        }

        /* renamed from: b */
        public final C9336a m39029b(List list) {
            this.f31404a.f37772g = list;
            return this;
        }

        /* renamed from: c */
        public final C9336a m39032c(List list) {
            this.f31404a.f37773h = list;
            return this;
        }

        /* renamed from: c */
        public final C9336a m39030c(Number number) {
            this.f31404a.f37775j = number;
            return this;
        }

        /* renamed from: d */
        public final C9336a m39033d(Number number) {
            this.f31404a.f37776k = number;
            return this;
        }

        /* renamed from: e */
        public final C9336a m39036e(Number number) {
            this.f31404a.f37777l = number;
            return this;
        }

        /* renamed from: f */
        public final C9336a m39039f(Number number) {
            this.f31404a.f37778m = number;
            return this;
        }

        /* renamed from: d */
        public final C9336a m39034d(String str) {
            this.f31404a.f37779n = str;
            return this;
        }

        /* renamed from: g */
        public final C9336a m39041g(Number number) {
            this.f31404a.f37780o = number;
            return this;
        }

        /* renamed from: d */
        public final C9336a m39035d(List list) {
            this.f31404a.f37781p = list;
            return this;
        }

        /* renamed from: e */
        public final C9336a m39038e(List list) {
            this.f31404a.f37782q = list;
            return this;
        }

        /* renamed from: e */
        public final C9336a m39037e(String str) {
            this.f31404a.f37783r = str;
            return this;
        }

        /* renamed from: f */
        public final C9336a m39040f(List list) {
            this.f31404a.f37784s = list;
            return this;
        }

        /* renamed from: h */
        public final C9336a m39042h(Number number) {
            this.f31404a.f37785t = number;
            return this;
        }

        /* renamed from: i */
        public final C9336a m39043i(Number number) {
            this.f31404a.f37786u = number;
            return this;
        }

        /* renamed from: a */
        public final C9336a m39022a(Boolean bool) {
            this.f31404a.f37788w = bool;
            return this;
        }

        /* renamed from: a */
        public yq m39026a() {
            return this.f31404a;
        }
    }

    /* renamed from: com.tinder.etl.event.yq$b */
    public class C11568b extends fw {
        /* renamed from: a */
        final /* synthetic */ yq f37764a;

        /* renamed from: a */
        public String mo10346a() {
            return "TinderPlus.Cancel";
        }

        public C11568b(yq yqVar, Map<EtlField<?>, Object> map) {
            this.f37764a = yqVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.yq$c */
    private final class C11569c implements DescriptorFactory<C11568b, yq> {
        /* renamed from: a */
        final /* synthetic */ yq f37765a;

        private C11569c(yq yqVar) {
            this.f37765a = yqVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46908a((yq) etlEvent);
        }

        /* renamed from: a */
        public final C11568b m46908a(yq yqVar) {
            Map hashMap = new HashMap();
            if (yqVar.f37766a != null) {
                hashMap.put(new bq(), yqVar.f37766a);
            }
            if (yqVar.f37767b != null) {
                hashMap.put(new ej(), yqVar.f37767b);
            }
            if (yqVar.f37768c != null) {
                hashMap.put(new ez(), yqVar.f37768c);
            }
            if (yqVar.f37769d != null) {
                hashMap.put(new ey(), yqVar.f37769d);
            }
            if (yqVar.f37770e != null) {
                hashMap.put(new ex(), yqVar.f37770e);
            }
            if (yqVar.f37771f != null) {
                hashMap.put(new ge(), yqVar.f37771f);
            }
            if (yqVar.f37772g != null) {
                hashMap.put(new je(), yqVar.f37772g);
            }
            if (yqVar.f37773h != null) {
                hashMap.put(new jf(), yqVar.f37773h);
            }
            if (yqVar.f37774i != null) {
                hashMap.put(new lc(), yqVar.f37774i);
            }
            if (yqVar.f37775j != null) {
                hashMap.put(new pk(), yqVar.f37775j);
            }
            if (yqVar.f37776k != null) {
                hashMap.put(new pl(), yqVar.f37776k);
            }
            if (yqVar.f37777l != null) {
                hashMap.put(new pm(), yqVar.f37777l);
            }
            if (yqVar.f37778m != null) {
                hashMap.put(new po(), yqVar.f37778m);
            }
            if (yqVar.f37779n != null) {
                hashMap.put(new qw(), yqVar.f37779n);
            }
            if (yqVar.f37780o != null) {
                hashMap.put(new rj(), yqVar.f37780o);
            }
            if (yqVar.f37781p != null) {
                hashMap.put(new rk(), yqVar.f37781p);
            }
            if (yqVar.f37782q != null) {
                hashMap.put(new rm(), yqVar.f37782q);
            }
            if (yqVar.f37783r != null) {
                hashMap.put(new wr(), yqVar.f37783r);
            }
            if (yqVar.f37784s != null) {
                hashMap.put(new ws(), yqVar.f37784s);
            }
            if (yqVar.f37785t != null) {
                hashMap.put(new xs(), yqVar.f37785t);
            }
            if (yqVar.f37786u != null) {
                hashMap.put(new ye(), yqVar.f37786u);
            }
            if (yqVar.f37787v != null) {
                hashMap.put(new yf(), yqVar.f37787v);
            }
            if (yqVar.f37788w != null) {
                hashMap.put(new zn(), yqVar.f37788w);
            }
            return new C11568b(this.f37765a, hashMap);
        }
    }

    private yq() {
    }

    /* renamed from: a */
    public static C9336a m46909a() {
        return new C9336a();
    }

    public final DescriptorFactory<C11568b, yq> getDescriptorFactory() {
        return new C11569c();
    }
}
