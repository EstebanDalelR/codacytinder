package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class yt implements EtlEvent {
    /* renamed from: a */
    private List f37830a;
    /* renamed from: b */
    private String f37831b;
    /* renamed from: c */
    private Number f37832c;
    /* renamed from: d */
    private String f37833d;
    /* renamed from: e */
    private Number f37834e;
    /* renamed from: f */
    private Number f37835f;
    /* renamed from: g */
    private Number f37836g;
    /* renamed from: h */
    private Number f37837h;
    /* renamed from: i */
    private String f37838i;
    /* renamed from: j */
    private Boolean f37839j;
    /* renamed from: k */
    private Number f37840k;
    /* renamed from: l */
    private Number f37841l;
    /* renamed from: m */
    private List f37842m;
    /* renamed from: n */
    private Number f37843n;
    /* renamed from: o */
    private Number f37844o;
    /* renamed from: p */
    private String f37845p;
    /* renamed from: q */
    private List f37846q;
    /* renamed from: r */
    private List f37847r;
    /* renamed from: s */
    private Number f37848s;
    /* renamed from: t */
    private String f37849t;
    /* renamed from: u */
    private String f37850u;
    /* renamed from: v */
    private String f37851v;
    /* renamed from: w */
    private Number f37852w;

    /* renamed from: com.tinder.etl.event.yt$a */
    public static class C9342a {
        /* renamed from: a */
        private yt f31407a;

        private C9342a() {
            this.f31407a = new yt();
        }

        /* renamed from: a */
        public final C9342a m39079a(List list) {
            this.f31407a.f37830a = list;
            return this;
        }

        /* renamed from: a */
        public final C9342a m39078a(String str) {
            this.f31407a.f37831b = str;
            return this;
        }

        /* renamed from: a */
        public final C9342a m39077a(Number number) {
            this.f31407a.f37832c = number;
            return this;
        }

        /* renamed from: b */
        public final C9342a m39082b(String str) {
            this.f31407a.f37833d = str;
            return this;
        }

        /* renamed from: b */
        public final C9342a m39081b(Number number) {
            this.f31407a.f37834e = number;
            return this;
        }

        /* renamed from: c */
        public final C9342a m39084c(Number number) {
            this.f31407a.f37835f = number;
            return this;
        }

        /* renamed from: d */
        public final C9342a m39087d(Number number) {
            this.f31407a.f37836g = number;
            return this;
        }

        /* renamed from: e */
        public final C9342a m39090e(Number number) {
            this.f31407a.f37837h = number;
            return this;
        }

        /* renamed from: c */
        public final C9342a m39085c(String str) {
            this.f31407a.f37838i = str;
            return this;
        }

        /* renamed from: a */
        public final C9342a m39076a(Boolean bool) {
            this.f31407a.f37839j = bool;
            return this;
        }

        /* renamed from: f */
        public final C9342a m39092f(Number number) {
            this.f31407a.f37840k = number;
            return this;
        }

        /* renamed from: g */
        public final C9342a m39094g(Number number) {
            this.f31407a.f37841l = number;
            return this;
        }

        /* renamed from: b */
        public final C9342a m39083b(List list) {
            this.f31407a.f37842m = list;
            return this;
        }

        /* renamed from: h */
        public final C9342a m39095h(Number number) {
            this.f31407a.f37843n = number;
            return this;
        }

        /* renamed from: i */
        public final C9342a m39096i(Number number) {
            this.f31407a.f37844o = number;
            return this;
        }

        /* renamed from: d */
        public final C9342a m39088d(String str) {
            this.f31407a.f37845p = str;
            return this;
        }

        /* renamed from: c */
        public final C9342a m39086c(List list) {
            this.f31407a.f37846q = list;
            return this;
        }

        /* renamed from: d */
        public final C9342a m39089d(List list) {
            this.f31407a.f37847r = list;
            return this;
        }

        /* renamed from: j */
        public final C9342a m39097j(Number number) {
            this.f31407a.f37848s = number;
            return this;
        }

        /* renamed from: e */
        public final C9342a m39091e(String str) {
            this.f31407a.f37849t = str;
            return this;
        }

        /* renamed from: f */
        public final C9342a m39093f(String str) {
            this.f31407a.f37850u = str;
            return this;
        }

        /* renamed from: k */
        public final C9342a m39098k(Number number) {
            this.f31407a.f37852w = number;
            return this;
        }

        /* renamed from: a */
        public yt m39080a() {
            return this.f31407a;
        }
    }

    /* renamed from: com.tinder.etl.event.yt$b */
    public class C11574b extends fw {
        /* renamed from: a */
        final /* synthetic */ yt f37828a;

        /* renamed from: a */
        public String mo10346a() {
            return "TinderPlus.Purchase";
        }

        public C11574b(yt ytVar, Map<EtlField<?>, Object> map) {
            this.f37828a = ytVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.yt$c */
    private final class C11575c implements DescriptorFactory<C11574b, yt> {
        /* renamed from: a */
        final /* synthetic */ yt f37829a;

        private C11575c(yt ytVar) {
            this.f37829a = ytVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m47026a((yt) etlEvent);
        }

        /* renamed from: a */
        public final C11574b m47026a(yt ytVar) {
            Map hashMap = new HashMap();
            if (ytVar.f37830a != null) {
                hashMap.put(new rm(), ytVar.f37830a);
            }
            if (ytVar.f37831b != null) {
                hashMap.put(new ej(), ytVar.f37831b);
            }
            if (ytVar.f37832c != null) {
                hashMap.put(new hc(), ytVar.f37832c);
            }
            if (ytVar.f37833d != null) {
                hashMap.put(new lc(), ytVar.f37833d);
            }
            if (ytVar.f37834e != null) {
                hashMap.put(new pl(), ytVar.f37834e);
            }
            if (ytVar.f37835f != null) {
                hashMap.put(new po(), ytVar.f37835f);
            }
            if (ytVar.f37836g != null) {
                hashMap.put(new rj(), ytVar.f37836g);
            }
            if (ytVar.f37837h != null) {
                hashMap.put(new ve(), ytVar.f37837h);
            }
            if (ytVar.f37838i != null) {
                hashMap.put(new wr(), ytVar.f37838i);
            }
            if (ytVar.f37839j != null) {
                hashMap.put(new zn(), ytVar.f37839j);
            }
            if (ytVar.f37840k != null) {
                hashMap.put(new ye(), ytVar.f37840k);
            }
            if (ytVar.f37841l != null) {
                hashMap.put(new bq(), ytVar.f37841l);
            }
            if (ytVar.f37842m != null) {
                hashMap.put(new ge(), ytVar.f37842m);
            }
            if (ytVar.f37843n != null) {
                hashMap.put(new xs(), ytVar.f37843n);
            }
            if (ytVar.f37844o != null) {
                hashMap.put(new pm(), ytVar.f37844o);
            }
            if (ytVar.f37845p != null) {
                hashMap.put(new qw(), ytVar.f37845p);
            }
            if (ytVar.f37846q != null) {
                hashMap.put(new je(), ytVar.f37846q);
            }
            if (ytVar.f37847r != null) {
                hashMap.put(new jf(), ytVar.f37847r);
            }
            if (ytVar.f37848s != null) {
                hashMap.put(new ez(), ytVar.f37848s);
            }
            if (ytVar.f37849t != null) {
                hashMap.put(new ey(), ytVar.f37849t);
            }
            if (ytVar.f37850u != null) {
                hashMap.put(new ex(), ytVar.f37850u);
            }
            if (ytVar.f37851v != null) {
                hashMap.put(new yf(), ytVar.f37851v);
            }
            if (ytVar.f37852w != null) {
                hashMap.put(new sk(), ytVar.f37852w);
            }
            return new C11574b(this.f37829a, hashMap);
        }
    }

    private yt() {
    }

    /* renamed from: a */
    public static C9342a m47027a() {
        return new C9342a();
    }

    public final DescriptorFactory<C11574b, yt> getDescriptorFactory() {
        return new C11575c();
    }
}
