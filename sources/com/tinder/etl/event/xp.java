package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class xp implements EtlEvent {
    /* renamed from: a */
    private Number f37728a;
    /* renamed from: b */
    private Number f37729b;
    /* renamed from: c */
    private Number f37730c;
    /* renamed from: d */
    private Number f37731d;
    /* renamed from: e */
    private Number f37732e;
    /* renamed from: f */
    private Number f37733f;
    /* renamed from: g */
    private Number f37734g;
    /* renamed from: h */
    private Number f37735h;
    /* renamed from: i */
    private Number f37736i;
    /* renamed from: j */
    private Number f37737j;
    /* renamed from: k */
    private Number f37738k;
    /* renamed from: l */
    private String f37739l;
    /* renamed from: m */
    private String f37740m;

    /* renamed from: com.tinder.etl.event.xp$a */
    public static class C9330a {
        /* renamed from: a */
        private xp f31401a;

        private C9330a() {
            this.f31401a = new xp();
        }

        /* renamed from: a */
        public final C9330a m38989a(Number number) {
            this.f31401a.f37728a = number;
            return this;
        }

        /* renamed from: b */
        public final C9330a m38992b(Number number) {
            this.f31401a.f37729b = number;
            return this;
        }

        /* renamed from: c */
        public final C9330a m38994c(Number number) {
            this.f31401a.f37730c = number;
            return this;
        }

        /* renamed from: d */
        public final C9330a m38995d(Number number) {
            this.f31401a.f37731d = number;
            return this;
        }

        /* renamed from: e */
        public final C9330a m38996e(Number number) {
            this.f31401a.f37732e = number;
            return this;
        }

        /* renamed from: f */
        public final C9330a m38997f(Number number) {
            this.f31401a.f37733f = number;
            return this;
        }

        /* renamed from: g */
        public final C9330a m38998g(Number number) {
            this.f31401a.f37734g = number;
            return this;
        }

        /* renamed from: h */
        public final C9330a m38999h(Number number) {
            this.f31401a.f37735h = number;
            return this;
        }

        /* renamed from: i */
        public final C9330a m39000i(Number number) {
            this.f31401a.f37736i = number;
            return this;
        }

        /* renamed from: j */
        public final C9330a m39001j(Number number) {
            this.f31401a.f37737j = number;
            return this;
        }

        /* renamed from: k */
        public final C9330a m39002k(Number number) {
            this.f31401a.f37738k = number;
            return this;
        }

        /* renamed from: a */
        public final C9330a m38990a(String str) {
            this.f31401a.f37739l = str;
            return this;
        }

        /* renamed from: b */
        public final C9330a m38993b(String str) {
            this.f31401a.f37740m = str;
            return this;
        }

        /* renamed from: a */
        public xp m38991a() {
            return this.f31401a;
        }
    }

    /* renamed from: com.tinder.etl.event.xp$b */
    public class C11561b extends fw {
        /* renamed from: a */
        final /* synthetic */ xp f37726a;

        /* renamed from: a */
        public String mo10346a() {
            return "SuperLikeable.Session";
        }

        public C11561b(xp xpVar, Map<EtlField<?>, Object> map) {
            this.f37726a = xpVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.xp$c */
    private final class C11562c implements DescriptorFactory<C11561b, xp> {
        /* renamed from: a */
        final /* synthetic */ xp f37727a;

        private C11562c(xp xpVar) {
            this.f37727a = xpVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46837a((xp) etlEvent);
        }

        /* renamed from: a */
        public final C11561b m46837a(xp xpVar) {
            Map hashMap = new HashMap();
            if (xpVar.f37728a != null) {
                hashMap.put(new fk(), xpVar.f37728a);
            }
            if (xpVar.f37729b != null) {
                hashMap.put(new og(), xpVar.f37729b);
            }
            if (xpVar.f37730c != null) {
                hashMap.put(new qz(), xpVar.f37730c);
            }
            if (xpVar.f37731d != null) {
                hashMap.put(new tn(), xpVar.f37731d);
            }
            if (xpVar.f37732e != null) {
                hashMap.put(new tm(), xpVar.f37732e);
            }
            if (xpVar.f37733f != null) {
                hashMap.put(new tp(), xpVar.f37733f);
            }
            if (xpVar.f37734g != null) {
                hashMap.put(new to(), xpVar.f37734g);
            }
            if (xpVar.f37735h != null) {
                hashMap.put(new tr(), xpVar.f37735h);
            }
            if (xpVar.f37736i != null) {
                hashMap.put(new tq(), xpVar.f37736i);
            }
            if (xpVar.f37737j != null) {
                hashMap.put(new tt(), xpVar.f37737j);
            }
            if (xpVar.f37738k != null) {
                hashMap.put(new ts(), xpVar.f37738k);
            }
            if (xpVar.f37739l != null) {
                hashMap.put(new xq(), xpVar.f37739l);
            }
            if (xpVar.f37740m != null) {
                hashMap.put(new wy(), xpVar.f37740m);
            }
            return new C11561b(this.f37727a, hashMap);
        }
    }

    private xp() {
    }

    /* renamed from: a */
    public static C9330a m46838a() {
        return new C9330a();
    }

    public final DescriptorFactory<C11561b, xp> getDescriptorFactory() {
        return new C11562c();
    }
}
