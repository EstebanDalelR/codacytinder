package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class yr implements EtlEvent {
    /* renamed from: a */
    private String f37791a;
    /* renamed from: b */
    private String f37792b;
    /* renamed from: c */
    private List f37793c;
    /* renamed from: d */
    private Number f37794d;
    /* renamed from: e */
    private Number f37795e;
    /* renamed from: f */
    private Number f37796f;
    /* renamed from: g */
    private Boolean f37797g;
    /* renamed from: h */
    private List f37798h;
    /* renamed from: i */
    private List f37799i;
    /* renamed from: j */
    private Number f37800j;
    /* renamed from: k */
    private List f37801k;
    /* renamed from: l */
    private Number f37802l;
    /* renamed from: m */
    private Boolean f37803m;
    /* renamed from: n */
    private String f37804n;
    /* renamed from: o */
    private List f37805o;
    /* renamed from: p */
    private List f37806p;
    /* renamed from: q */
    private Number f37807q;
    /* renamed from: r */
    private String f37808r;
    /* renamed from: s */
    private String f37809s;
    /* renamed from: t */
    private String f37810t;
    /* renamed from: u */
    private Number f37811u;
    /* renamed from: v */
    private Boolean f37812v;
    /* renamed from: w */
    private List f37813w;

    /* renamed from: com.tinder.etl.event.yr$a */
    public static class C9338a {
        /* renamed from: a */
        private yr f31405a;

        private C9338a() {
            this.f31405a = new yr();
        }

        /* renamed from: a */
        public final C9338a m39046a(String str) {
            this.f31405a.f37791a = str;
            return this;
        }

        /* renamed from: a */
        public final C9338a m39047a(List list) {
            this.f31405a.f37793c = list;
            return this;
        }

        /* renamed from: a */
        public final C9338a m39045a(Number number) {
            this.f31405a.f37794d = number;
            return this;
        }

        /* renamed from: b */
        public final C9338a m39049b(Number number) {
            this.f31405a.f37795e = number;
            return this;
        }

        /* renamed from: c */
        public final C9338a m39052c(Number number) {
            this.f31405a.f37796f = number;
            return this;
        }

        /* renamed from: a */
        public final C9338a m39044a(Boolean bool) {
            this.f31405a.f37797g = bool;
            return this;
        }

        /* renamed from: b */
        public final C9338a m39051b(List list) {
            this.f31405a.f37798h = list;
            return this;
        }

        /* renamed from: c */
        public final C9338a m39054c(List list) {
            this.f31405a.f37799i = list;
            return this;
        }

        /* renamed from: d */
        public final C9338a m39055d(Number number) {
            this.f31405a.f37800j = number;
            return this;
        }

        /* renamed from: d */
        public final C9338a m39057d(List list) {
            this.f31405a.f37801k = list;
            return this;
        }

        /* renamed from: e */
        public final C9338a m39058e(Number number) {
            this.f31405a.f37802l = number;
            return this;
        }

        /* renamed from: b */
        public final C9338a m39050b(String str) {
            this.f31405a.f37804n = str;
            return this;
        }

        /* renamed from: e */
        public final C9338a m39059e(List list) {
            this.f31405a.f37805o = list;
            return this;
        }

        /* renamed from: f */
        public final C9338a m39061f(List list) {
            this.f31405a.f37806p = list;
            return this;
        }

        /* renamed from: f */
        public final C9338a m39060f(Number number) {
            this.f31405a.f37807q = number;
            return this;
        }

        /* renamed from: c */
        public final C9338a m39053c(String str) {
            this.f31405a.f37808r = str;
            return this;
        }

        /* renamed from: d */
        public final C9338a m39056d(String str) {
            this.f31405a.f37809s = str;
            return this;
        }

        /* renamed from: g */
        public final C9338a m39062g(Number number) {
            this.f31405a.f37811u = number;
            return this;
        }

        /* renamed from: a */
        public yr m39048a() {
            return this.f31405a;
        }
    }

    /* renamed from: com.tinder.etl.event.yr$b */
    public class C11570b extends fw {
        /* renamed from: a */
        final /* synthetic */ yr f37789a;

        /* renamed from: a */
        public String mo10346a() {
            return "TinderPlus.Paywall";
        }

        public C11570b(yr yrVar, Map<EtlField<?>, Object> map) {
            this.f37789a = yrVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.yr$c */
    private final class C11571c implements DescriptorFactory<C11570b, yr> {
        /* renamed from: a */
        final /* synthetic */ yr f37790a;

        private C11571c(yr yrVar) {
            this.f37790a = yrVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46955a((yr) etlEvent);
        }

        /* renamed from: a */
        public final C11570b m46955a(yr yrVar) {
            Map hashMap = new HashMap();
            if (yrVar.f37791a != null) {
                hashMap.put(new ej(), yrVar.f37791a);
            }
            if (yrVar.f37792b != null) {
                hashMap.put(new lc(), yrVar.f37792b);
            }
            if (yrVar.f37793c != null) {
                hashMap.put(new rm(), yrVar.f37793c);
            }
            if (yrVar.f37794d != null) {
                hashMap.put(new pk(), yrVar.f37794d);
            }
            if (yrVar.f37795e != null) {
                hashMap.put(new pl(), yrVar.f37795e);
            }
            if (yrVar.f37796f != null) {
                hashMap.put(new po(), yrVar.f37796f);
            }
            if (yrVar.f37797g != null) {
                hashMap.put(new zn(), yrVar.f37797g);
            }
            if (yrVar.f37798h != null) {
                hashMap.put(new ws(), yrVar.f37798h);
            }
            if (yrVar.f37799i != null) {
                hashMap.put(new rk(), yrVar.f37799i);
            }
            if (yrVar.f37800j != null) {
                hashMap.put(new bq(), yrVar.f37800j);
            }
            if (yrVar.f37801k != null) {
                hashMap.put(new ge(), yrVar.f37801k);
            }
            if (yrVar.f37802l != null) {
                hashMap.put(new pm(), yrVar.f37802l);
            }
            if (yrVar.f37803m != null) {
                hashMap.put(new qx(), yrVar.f37803m);
            }
            if (yrVar.f37804n != null) {
                hashMap.put(new qw(), yrVar.f37804n);
            }
            if (yrVar.f37805o != null) {
                hashMap.put(new je(), yrVar.f37805o);
            }
            if (yrVar.f37806p != null) {
                hashMap.put(new jf(), yrVar.f37806p);
            }
            if (yrVar.f37807q != null) {
                hashMap.put(new ez(), yrVar.f37807q);
            }
            if (yrVar.f37808r != null) {
                hashMap.put(new ey(), yrVar.f37808r);
            }
            if (yrVar.f37809s != null) {
                hashMap.put(new ex(), yrVar.f37809s);
            }
            if (yrVar.f37810t != null) {
                hashMap.put(new yf(), yrVar.f37810t);
            }
            if (yrVar.f37811u != null) {
                hashMap.put(new sk(), yrVar.f37811u);
            }
            if (yrVar.f37812v != null) {
                hashMap.put(new kd(), yrVar.f37812v);
            }
            if (yrVar.f37813w != null) {
                hashMap.put(new aag(), yrVar.f37813w);
            }
            return new C11570b(this.f37790a, hashMap);
        }
    }

    private yr() {
    }

    /* renamed from: a */
    public static C9338a m46956a() {
        return new C9338a();
    }

    public final DescriptorFactory<C11570b, yr> getDescriptorFactory() {
        return new C11571c();
    }
}
