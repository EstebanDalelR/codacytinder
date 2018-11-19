package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class yv implements EtlEvent {
    /* renamed from: a */
    private Number f37875a;
    /* renamed from: b */
    private String f37876b;
    /* renamed from: c */
    private Number f37877c;
    /* renamed from: d */
    private String f37878d;
    /* renamed from: e */
    private String f37879e;
    /* renamed from: f */
    private List f37880f;
    /* renamed from: g */
    private List f37881g;
    /* renamed from: h */
    private List f37882h;
    /* renamed from: i */
    private String f37883i;
    /* renamed from: j */
    private Number f37884j;
    /* renamed from: k */
    private Number f37885k;
    /* renamed from: l */
    private Number f37886l;
    /* renamed from: m */
    private Number f37887m;
    /* renamed from: n */
    private String f37888n;
    /* renamed from: o */
    private Number f37889o;
    /* renamed from: p */
    private List f37890p;
    /* renamed from: q */
    private String f37891q;
    /* renamed from: r */
    private Number f37892r;
    /* renamed from: s */
    private Number f37893s;
    /* renamed from: t */
    private String f37894t;
    /* renamed from: u */
    private Boolean f37895u;

    /* renamed from: com.tinder.etl.event.yv$a */
    public static class C9346a {
        /* renamed from: a */
        private yv f31409a;

        private C9346a() {
            this.f31409a = new yv();
        }

        /* renamed from: a */
        public final C9346a m39118a(Number number) {
            this.f31409a.f37875a = number;
            return this;
        }

        /* renamed from: a */
        public final C9346a m39119a(String str) {
            this.f31409a.f37876b = str;
            return this;
        }

        /* renamed from: b */
        public final C9346a m39122b(Number number) {
            this.f31409a.f37877c = number;
            return this;
        }

        /* renamed from: b */
        public final C9346a m39123b(String str) {
            this.f31409a.f37878d = str;
            return this;
        }

        /* renamed from: c */
        public final C9346a m39126c(String str) {
            this.f31409a.f37879e = str;
            return this;
        }

        /* renamed from: a */
        public final C9346a m39120a(List list) {
            this.f31409a.f37880f = list;
            return this;
        }

        /* renamed from: b */
        public final C9346a m39124b(List list) {
            this.f31409a.f37881g = list;
            return this;
        }

        /* renamed from: c */
        public final C9346a m39127c(List list) {
            this.f31409a.f37882h = list;
            return this;
        }

        /* renamed from: c */
        public final C9346a m39125c(Number number) {
            this.f31409a.f37884j = number;
            return this;
        }

        /* renamed from: d */
        public final C9346a m39128d(Number number) {
            this.f31409a.f37885k = number;
            return this;
        }

        /* renamed from: e */
        public final C9346a m39131e(Number number) {
            this.f31409a.f37886l = number;
            return this;
        }

        /* renamed from: f */
        public final C9346a m39133f(Number number) {
            this.f31409a.f37887m = number;
            return this;
        }

        /* renamed from: d */
        public final C9346a m39129d(String str) {
            this.f31409a.f37888n = str;
            return this;
        }

        /* renamed from: g */
        public final C9346a m39134g(Number number) {
            this.f31409a.f37889o = number;
            return this;
        }

        /* renamed from: d */
        public final C9346a m39130d(List list) {
            this.f31409a.f37890p = list;
            return this;
        }

        /* renamed from: e */
        public final C9346a m39132e(String str) {
            this.f31409a.f37891q = str;
            return this;
        }

        /* renamed from: h */
        public final C9346a m39135h(Number number) {
            this.f31409a.f37892r = number;
            return this;
        }

        /* renamed from: i */
        public final C9346a m39136i(Number number) {
            this.f31409a.f37893s = number;
            return this;
        }

        /* renamed from: a */
        public final C9346a m39117a(Boolean bool) {
            this.f31409a.f37895u = bool;
            return this;
        }

        /* renamed from: a */
        public yv m39121a() {
            return this.f31409a;
        }
    }

    /* renamed from: com.tinder.etl.event.yv$b */
    public class C11578b extends fw {
        /* renamed from: a */
        final /* synthetic */ yv f37873a;

        /* renamed from: a */
        public String mo10346a() {
            return "TinderPlus.Select";
        }

        public C11578b(yv yvVar, Map<EtlField<?>, Object> map) {
            this.f37873a = yvVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.yv$c */
    private final class C11579c implements DescriptorFactory<C11578b, yv> {
        /* renamed from: a */
        final /* synthetic */ yv f37874a;

        private C11579c(yv yvVar) {
            this.f37874a = yvVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m47112a((yv) etlEvent);
        }

        /* renamed from: a */
        public final C11578b m47112a(yv yvVar) {
            Map hashMap = new HashMap();
            if (yvVar.f37875a != null) {
                hashMap.put(new bq(), yvVar.f37875a);
            }
            if (yvVar.f37876b != null) {
                hashMap.put(new ej(), yvVar.f37876b);
            }
            if (yvVar.f37877c != null) {
                hashMap.put(new ez(), yvVar.f37877c);
            }
            if (yvVar.f37878d != null) {
                hashMap.put(new ey(), yvVar.f37878d);
            }
            if (yvVar.f37879e != null) {
                hashMap.put(new ex(), yvVar.f37879e);
            }
            if (yvVar.f37880f != null) {
                hashMap.put(new ge(), yvVar.f37880f);
            }
            if (yvVar.f37881g != null) {
                hashMap.put(new je(), yvVar.f37881g);
            }
            if (yvVar.f37882h != null) {
                hashMap.put(new jf(), yvVar.f37882h);
            }
            if (yvVar.f37883i != null) {
                hashMap.put(new lc(), yvVar.f37883i);
            }
            if (yvVar.f37884j != null) {
                hashMap.put(new pk(), yvVar.f37884j);
            }
            if (yvVar.f37885k != null) {
                hashMap.put(new pl(), yvVar.f37885k);
            }
            if (yvVar.f37886l != null) {
                hashMap.put(new pm(), yvVar.f37886l);
            }
            if (yvVar.f37887m != null) {
                hashMap.put(new po(), yvVar.f37887m);
            }
            if (yvVar.f37888n != null) {
                hashMap.put(new qw(), yvVar.f37888n);
            }
            if (yvVar.f37889o != null) {
                hashMap.put(new rj(), yvVar.f37889o);
            }
            if (yvVar.f37890p != null) {
                hashMap.put(new rm(), yvVar.f37890p);
            }
            if (yvVar.f37891q != null) {
                hashMap.put(new wr(), yvVar.f37891q);
            }
            if (yvVar.f37892r != null) {
                hashMap.put(new xs(), yvVar.f37892r);
            }
            if (yvVar.f37893s != null) {
                hashMap.put(new ye(), yvVar.f37893s);
            }
            if (yvVar.f37894t != null) {
                hashMap.put(new yf(), yvVar.f37894t);
            }
            if (yvVar.f37895u != null) {
                hashMap.put(new zn(), yvVar.f37895u);
            }
            return new C11578b(this.f37874a, hashMap);
        }
    }

    private yv() {
    }

    /* renamed from: a */
    public static C9346a m47113a() {
        return new C9346a();
    }

    public final DescriptorFactory<C11578b, yv> getDescriptorFactory() {
        return new C11579c();
    }
}
