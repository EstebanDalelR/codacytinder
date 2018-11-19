package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class gg implements EtlEvent {
    /* renamed from: A */
    private String f36687A;
    /* renamed from: a */
    private String f36688a;
    /* renamed from: b */
    private String f36689b;
    /* renamed from: c */
    private String f36690c;
    /* renamed from: d */
    private String f36691d;
    /* renamed from: e */
    private Number f36692e;
    /* renamed from: f */
    private Boolean f36693f;
    /* renamed from: g */
    private Number f36694g;
    /* renamed from: h */
    private Number f36695h;
    /* renamed from: i */
    private String f36696i;
    /* renamed from: j */
    private String f36697j;
    /* renamed from: k */
    private Boolean f36698k;
    /* renamed from: l */
    private String f36699l;
    /* renamed from: m */
    private Number f36700m;
    /* renamed from: n */
    private String f36701n;
    /* renamed from: o */
    private Number f36702o;
    /* renamed from: p */
    private String f36703p;
    /* renamed from: q */
    private String f36704q;
    /* renamed from: r */
    private Number f36705r;
    /* renamed from: s */
    private Boolean f36706s;
    /* renamed from: t */
    private String f36707t;
    /* renamed from: u */
    private String f36708u;
    /* renamed from: v */
    private String f36709v;
    /* renamed from: w */
    private String f36710w;
    /* renamed from: x */
    private Number f36711x;
    /* renamed from: y */
    private Number f36712y;
    /* renamed from: z */
    private String f36713z;

    /* renamed from: com.tinder.etl.event.gg$a */
    public static class C9084a {
        /* renamed from: a */
        private gg f31278a;

        private C9084a() {
            this.f31278a = new gg();
        }

        /* renamed from: a */
        public final C9084a m38238a(String str) {
            this.f31278a.f36688a = str;
            return this;
        }

        /* renamed from: b */
        public final C9084a m38241b(String str) {
            this.f31278a.f36689b = str;
            return this;
        }

        /* renamed from: c */
        public final C9084a m38243c(String str) {
            this.f31278a.f36690c = str;
            return this;
        }

        /* renamed from: d */
        public final C9084a m38245d(String str) {
            this.f31278a.f36691d = str;
            return this;
        }

        /* renamed from: a */
        public final C9084a m38237a(Number number) {
            this.f31278a.f36692e = number;
            return this;
        }

        /* renamed from: b */
        public final C9084a m38240b(Number number) {
            this.f31278a.f36694g = number;
            return this;
        }

        /* renamed from: e */
        public final C9084a m38247e(String str) {
            this.f31278a.f36696i = str;
            return this;
        }

        /* renamed from: f */
        public final C9084a m38249f(String str) {
            this.f31278a.f36697j = str;
            return this;
        }

        /* renamed from: g */
        public final C9084a m38251g(String str) {
            this.f31278a.f36699l = str;
            return this;
        }

        /* renamed from: c */
        public final C9084a m38242c(Number number) {
            this.f31278a.f36700m = number;
            return this;
        }

        /* renamed from: h */
        public final C9084a m38252h(String str) {
            this.f31278a.f36701n = str;
            return this;
        }

        /* renamed from: d */
        public final C9084a m38244d(Number number) {
            this.f31278a.f36702o = number;
            return this;
        }

        /* renamed from: i */
        public final C9084a m38253i(String str) {
            this.f31278a.f36703p = str;
            return this;
        }

        /* renamed from: j */
        public final C9084a m38254j(String str) {
            this.f31278a.f36704q = str;
            return this;
        }

        /* renamed from: e */
        public final C9084a m38246e(Number number) {
            this.f31278a.f36705r = number;
            return this;
        }

        /* renamed from: k */
        public final C9084a m38255k(String str) {
            this.f31278a.f36707t = str;
            return this;
        }

        /* renamed from: l */
        public final C9084a m38256l(String str) {
            this.f31278a.f36708u = str;
            return this;
        }

        /* renamed from: m */
        public final C9084a m38257m(String str) {
            this.f31278a.f36709v = str;
            return this;
        }

        /* renamed from: n */
        public final C9084a m38258n(String str) {
            this.f31278a.f36710w = str;
            return this;
        }

        /* renamed from: f */
        public final C9084a m38248f(Number number) {
            this.f31278a.f36711x = number;
            return this;
        }

        /* renamed from: g */
        public final C9084a m38250g(Number number) {
            this.f31278a.f36712y = number;
            return this;
        }

        /* renamed from: o */
        public final C9084a m38259o(String str) {
            this.f31278a.f36713z = str;
            return this;
        }

        /* renamed from: p */
        public final C9084a m38260p(String str) {
            this.f31278a.f36687A = str;
            return this;
        }

        /* renamed from: a */
        public gg m38239a() {
            return this.f31278a;
        }
    }

    /* renamed from: com.tinder.etl.event.gg$b */
    public class C11297b extends fw {
        /* renamed from: a */
        final /* synthetic */ gg f36685a;

        /* renamed from: a */
        public String mo10346a() {
            return "Feed.Interact";
        }

        public C11297b(gg ggVar, Map<EtlField<?>, Object> map) {
            this.f36685a = ggVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.gg$c */
    private final class C11298c implements DescriptorFactory<C11297b, gg> {
        /* renamed from: a */
        final /* synthetic */ gg f36686a;

        private C11298c(gg ggVar) {
            this.f36686a = ggVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45044a((gg) etlEvent);
        }

        /* renamed from: a */
        public final C11297b m45044a(gg ggVar) {
            Map hashMap = new HashMap();
            if (ggVar.f36688a != null) {
                hashMap.put(new C11365k(), ggVar.f36688a);
            }
            if (ggVar.f36689b != null) {
                hashMap.put(new C11378l(), ggVar.f36689b);
            }
            if (ggVar.f36690c != null) {
                hashMap.put(new C11400n(), ggVar.f36690c);
            }
            if (ggVar.f36691d != null) {
                hashMap.put(new C11401o(), ggVar.f36691d);
            }
            if (ggVar.f36692e != null) {
                hashMap.put(new bc(), ggVar.f36692e);
            }
            if (ggVar.f36693f != null) {
                hashMap.put(new bn(), ggVar.f36693f);
            }
            if (ggVar.f36694g != null) {
                hashMap.put(new fh(), ggVar.f36694g);
            }
            if (ggVar.f36695h != null) {
                hashMap.put(new fk(), ggVar.f36695h);
            }
            if (ggVar.f36696i != null) {
                hashMap.put(new gh(), ggVar.f36696i);
            }
            if (ggVar.f36697j != null) {
                hashMap.put(new gk(), ggVar.f36697j);
            }
            if (ggVar.f36698k != null) {
                hashMap.put(new ja(), ggVar.f36698k);
            }
            if (ggVar.f36699l != null) {
                hashMap.put(new ll(), ggVar.f36699l);
            }
            if (ggVar.f36700m != null) {
                hashMap.put(new lz(), ggVar.f36700m);
            }
            if (ggVar.f36701n != null) {
                hashMap.put(new mb(), ggVar.f36701n);
            }
            if (ggVar.f36702o != null) {
                hashMap.put(new md(), ggVar.f36702o);
            }
            if (ggVar.f36703p != null) {
                hashMap.put(new ml(), ggVar.f36703p);
            }
            if (ggVar.f36704q != null) {
                hashMap.put(new ov(), ggVar.f36704q);
            }
            if (ggVar.f36705r != null) {
                hashMap.put(new qz(), ggVar.f36705r);
            }
            if (ggVar.f36706s != null) {
                hashMap.put(new ww(), ggVar.f36706s);
            }
            if (ggVar.f36707t != null) {
                hashMap.put(new xy(), ggVar.f36707t);
            }
            if (ggVar.f36708u != null) {
                hashMap.put(new xz(), ggVar.f36708u);
            }
            if (ggVar.f36709v != null) {
                hashMap.put(new yb(), ggVar.f36709v);
            }
            if (ggVar.f36710w != null) {
                hashMap.put(new yc(), ggVar.f36710w);
            }
            if (ggVar.f36711x != null) {
                hashMap.put(new yj(), ggVar.f36711x);
            }
            if (ggVar.f36712y != null) {
                hashMap.put(new yl(), ggVar.f36712y);
            }
            if (ggVar.f36713z != null) {
                hashMap.put(new zl(), ggVar.f36713z);
            }
            if (ggVar.f36687A != null) {
                hashMap.put(new wy(), ggVar.f36687A);
            }
            return new C11297b(this.f36686a, hashMap);
        }
    }

    private gg() {
    }

    /* renamed from: a */
    public static C9084a m45046a() {
        return new C9084a();
    }

    public final DescriptorFactory<C11297b, gg> getDescriptorFactory() {
        return new C11298c();
    }
}
