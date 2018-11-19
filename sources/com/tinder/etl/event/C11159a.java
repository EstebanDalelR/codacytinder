package com.tinder.etl.event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tinder.etl.event.a */
public final class C11159a implements EtlEvent {
    /* renamed from: a */
    private String f36070a;
    /* renamed from: b */
    private List f36071b;
    /* renamed from: c */
    private List f36072c;
    /* renamed from: d */
    private List f36073d;
    /* renamed from: e */
    private Number f36074e;
    /* renamed from: f */
    private String f36075f;
    /* renamed from: g */
    private List f36076g;
    /* renamed from: h */
    private List f36077h;
    /* renamed from: i */
    private List f36078i;
    /* renamed from: j */
    private String f36079j;
    /* renamed from: k */
    private Number f36080k;
    /* renamed from: l */
    private String f36081l;
    /* renamed from: m */
    private Number f36082m;
    /* renamed from: n */
    private String f36083n;
    /* renamed from: o */
    private List f36084o;
    /* renamed from: p */
    private List f36085p;
    /* renamed from: q */
    private List f36086q;
    /* renamed from: r */
    private Number f36087r;
    /* renamed from: s */
    private String f36088s;
    /* renamed from: t */
    private Number f36089t;
    /* renamed from: u */
    private List f36090u;
    /* renamed from: v */
    private List f36091v;

    /* renamed from: com.tinder.etl.event.a$a */
    public static class C8952a {
        /* renamed from: a */
        private C11159a f31211a;

        private C8952a() {
            this.f31211a = new C11159a();
        }

        /* renamed from: a */
        public final C8952a m37733a(String str) {
            this.f31211a.f36070a = str;
            return this;
        }

        /* renamed from: a */
        public final C8952a m37734a(List list) {
            this.f31211a.f36071b = list;
            return this;
        }

        /* renamed from: b */
        public final C8952a m37738b(List list) {
            this.f31211a.f36072c = list;
            return this;
        }

        /* renamed from: c */
        public final C8952a m37741c(List list) {
            this.f31211a.f36073d = list;
            return this;
        }

        /* renamed from: a */
        public final C8952a m37732a(Number number) {
            this.f31211a.f36074e = number;
            return this;
        }

        /* renamed from: b */
        public final C8952a m37737b(String str) {
            this.f31211a.f36075f = str;
            return this;
        }

        /* renamed from: d */
        public final C8952a m37744d(List list) {
            this.f31211a.f36076g = list;
            return this;
        }

        /* renamed from: e */
        public final C8952a m37747e(List list) {
            this.f31211a.f36077h = list;
            return this;
        }

        /* renamed from: f */
        public final C8952a m37749f(List list) {
            this.f31211a.f36078i = list;
            return this;
        }

        /* renamed from: c */
        public final C8952a m37740c(String str) {
            this.f31211a.f36079j = str;
            return this;
        }

        /* renamed from: b */
        public final C8952a m37736b(Number number) {
            this.f31211a.f36080k = number;
            return this;
        }

        /* renamed from: d */
        public final C8952a m37743d(String str) {
            this.f31211a.f36081l = str;
            return this;
        }

        /* renamed from: c */
        public final C8952a m37739c(Number number) {
            this.f31211a.f36082m = number;
            return this;
        }

        /* renamed from: e */
        public final C8952a m37746e(String str) {
            this.f31211a.f36083n = str;
            return this;
        }

        /* renamed from: g */
        public final C8952a m37750g(List list) {
            this.f31211a.f36084o = list;
            return this;
        }

        /* renamed from: h */
        public final C8952a m37751h(List list) {
            this.f31211a.f36085p = list;
            return this;
        }

        /* renamed from: i */
        public final C8952a m37752i(List list) {
            this.f31211a.f36086q = list;
            return this;
        }

        /* renamed from: d */
        public final C8952a m37742d(Number number) {
            this.f31211a.f36087r = number;
            return this;
        }

        /* renamed from: f */
        public final C8952a m37748f(String str) {
            this.f31211a.f36088s = str;
            return this;
        }

        /* renamed from: e */
        public final C8952a m37745e(Number number) {
            this.f31211a.f36089t = number;
            return this;
        }

        /* renamed from: j */
        public final C8952a m37753j(List list) {
            this.f31211a.f36090u = list;
            return this;
        }

        /* renamed from: k */
        public final C8952a m37754k(List list) {
            this.f31211a.f36091v = list;
            return this;
        }

        /* renamed from: a */
        public C11159a m37735a() {
            return this.f31211a;
        }
    }

    /* renamed from: com.tinder.etl.event.a$b */
    public class C11157b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11159a f36068a;

        /* renamed from: a */
        public String mo10346a() {
            return "Account.DeleteSurvey";
        }

        public C11157b(C11159a c11159a, Map<EtlField<?>, Object> map) {
            this.f36068a = c11159a;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.a$c */
    private final class C11158c implements DescriptorFactory<C11157b, C11159a> {
        /* renamed from: a */
        final /* synthetic */ C11159a f36069a;

        private C11158c(C11159a c11159a) {
            this.f36069a = c11159a;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m43924a((C11159a) etlEvent);
        }

        /* renamed from: a */
        public final C11157b m43924a(C11159a c11159a) {
            Map hashMap = new HashMap();
            if (c11159a.f36070a != null) {
                hashMap.put(new cm(), c11159a.f36070a);
            }
            if (c11159a.f36071b != null) {
                hashMap.put(new cn(), c11159a.f36071b);
            }
            if (c11159a.f36072c != null) {
                hashMap.put(new co(), c11159a.f36072c);
            }
            if (c11159a.f36073d != null) {
                hashMap.put(new cp(), c11159a.f36073d);
            }
            if (c11159a.f36074e != null) {
                hashMap.put(new em(), c11159a.f36074e);
            }
            if (c11159a.f36075f != null) {
                hashMap.put(new fc(), c11159a.f36075f);
            }
            if (c11159a.f36076g != null) {
                hashMap.put(new fd(), c11159a.f36076g);
            }
            if (c11159a.f36077h != null) {
                hashMap.put(new fe(), c11159a.f36077h);
            }
            if (c11159a.f36078i != null) {
                hashMap.put(new ff(), c11159a.f36078i);
            }
            if (c11159a.f36079j != null) {
                hashMap.put(new fu(), c11159a.f36079j);
            }
            if (c11159a.f36080k != null) {
                hashMap.put(new fv(), c11159a.f36080k);
            }
            if (c11159a.f36081l != null) {
                hashMap.put(new fx(), c11159a.f36081l);
            }
            if (c11159a.f36082m != null) {
                hashMap.put(new fy(), c11159a.f36082m);
            }
            if (c11159a.f36083n != null) {
                hashMap.put(new gq(), c11159a.f36083n);
            }
            if (c11159a.f36084o != null) {
                hashMap.put(new gz(), c11159a.f36084o);
            }
            if (c11159a.f36085p != null) {
                hashMap.put(new ha(), c11159a.f36085p);
            }
            if (c11159a.f36086q != null) {
                hashMap.put(new hb(), c11159a.f36086q);
            }
            if (c11159a.f36087r != null) {
                hashMap.put(new rf(), c11159a.f36087r);
            }
            if (c11159a.f36088s != null) {
                hashMap.put(new rg(), c11159a.f36088s);
            }
            if (c11159a.f36089t != null) {
                hashMap.put(new tj(), c11159a.f36089t);
            }
            if (c11159a.f36090u != null) {
                hashMap.put(new tk(), c11159a.f36090u);
            }
            if (c11159a.f36091v != null) {
                hashMap.put(new tl(), c11159a.f36091v);
            }
            return new C11157b(this.f36069a, hashMap);
        }
    }

    private C11159a() {
    }

    /* renamed from: a */
    public static C8952a m43925a() {
        return new C8952a();
    }

    public final DescriptorFactory<C11157b, C11159a> getDescriptorFactory() {
        return new C11158c();
    }
}
