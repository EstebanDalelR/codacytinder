package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class zw implements EtlEvent {
    /* renamed from: a */
    private Number f37972a;
    /* renamed from: b */
    private Number f37973b;
    /* renamed from: c */
    private Boolean f37974c;
    /* renamed from: d */
    private String f37975d;
    /* renamed from: e */
    private Boolean f37976e;
    /* renamed from: f */
    private Number f37977f;
    /* renamed from: g */
    private Boolean f37978g;
    /* renamed from: h */
    private Number f37979h;
    /* renamed from: i */
    private Boolean f37980i;
    /* renamed from: j */
    private Boolean f37981j;
    /* renamed from: k */
    private Number f37982k;
    /* renamed from: l */
    private Number f37983l;
    /* renamed from: m */
    private Boolean f37984m;
    /* renamed from: n */
    private Number f37985n;
    /* renamed from: o */
    private Boolean f37986o;
    /* renamed from: p */
    private Number f37987p;
    /* renamed from: q */
    private Boolean f37988q;
    /* renamed from: r */
    private String f37989r;
    /* renamed from: s */
    private Boolean f37990s;

    /* renamed from: com.tinder.etl.event.zw$a */
    public static class C9362a {
        /* renamed from: a */
        private zw f31417a;

        private C9362a() {
            this.f31417a = new zw();
        }

        /* renamed from: a */
        public final C9362a m39195a(Number number) {
            this.f31417a.f37972a = number;
            return this;
        }

        /* renamed from: b */
        public final C9362a m39198b(Number number) {
            this.f31417a.f37973b = number;
            return this;
        }

        /* renamed from: a */
        public final C9362a m39194a(Boolean bool) {
            this.f31417a.f37974c = bool;
            return this;
        }

        /* renamed from: c */
        public final C9362a m39199c(Number number) {
            this.f31417a.f37977f = number;
            return this;
        }

        /* renamed from: d */
        public final C9362a m39200d(Number number) {
            this.f31417a.f37979h = number;
            return this;
        }

        /* renamed from: e */
        public final C9362a m39201e(Number number) {
            this.f31417a.f37982k = number;
            return this;
        }

        /* renamed from: f */
        public final C9362a m39202f(Number number) {
            this.f31417a.f37985n = number;
            return this;
        }

        /* renamed from: g */
        public final C9362a m39203g(Number number) {
            this.f31417a.f37987p = number;
            return this;
        }

        /* renamed from: b */
        public final C9362a m39197b(Boolean bool) {
            this.f31417a.f37988q = bool;
            return this;
        }

        /* renamed from: a */
        public zw m39196a() {
            return this.f31417a;
        }
    }

    /* renamed from: com.tinder.etl.event.zw$b */
    public class C11595b extends fw {
        /* renamed from: a */
        final /* synthetic */ zw f37970a;

        /* renamed from: a */
        public String mo10346a() {
            return "UserInteraction.Settings";
        }

        public C11595b(zw zwVar, Map<EtlField<?>, Object> map) {
            this.f37970a = zwVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.zw$c */
    private final class C11596c implements DescriptorFactory<C11595b, zw> {
        /* renamed from: a */
        final /* synthetic */ zw f37971a;

        private C11596c(zw zwVar) {
            this.f37971a = zwVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m47286a((zw) etlEvent);
        }

        /* renamed from: a */
        public final C11595b m47286a(zw zwVar) {
            Map hashMap = new HashMap();
            if (zwVar.f37972a != null) {
                hashMap.put(new bo(), zwVar.f37972a);
            }
            if (zwVar.f37973b != null) {
                hashMap.put(new cv(), zwVar.f37973b);
            }
            if (zwVar.f37974c != null) {
                hashMap.put(new fa(), zwVar.f37974c);
            }
            if (zwVar.f37975d != null) {
                hashMap.put(new fi(), zwVar.f37975d);
            }
            if (zwVar.f37976e != null) {
                hashMap.put(new gv(), zwVar.f37976e);
            }
            if (zwVar.f37977f != null) {
                hashMap.put(new ks(), zwVar.f37977f);
            }
            if (zwVar.f37978g != null) {
                hashMap.put(new lr(), zwVar.f37978g);
            }
            if (zwVar.f37979h != null) {
                hashMap.put(new ly(), zwVar.f37979h);
            }
            if (zwVar.f37980i != null) {
                hashMap.put(new mn(), zwVar.f37980i);
            }
            if (zwVar.f37981j != null) {
                hashMap.put(new mo(), zwVar.f37981j);
            }
            if (zwVar.f37982k != null) {
                hashMap.put(new mr(), zwVar.f37982k);
            }
            if (zwVar.f37983l != null) {
                hashMap.put(new rw(), zwVar.f37983l);
            }
            if (zwVar.f37984m != null) {
                hashMap.put(new wu(), zwVar.f37984m);
            }
            if (zwVar.f37985n != null) {
                hashMap.put(new xf(), zwVar.f37985n);
            }
            if (zwVar.f37986o != null) {
                hashMap.put(new xt(), zwVar.f37986o);
            }
            if (zwVar.f37987p != null) {
                hashMap.put(new xw(), zwVar.f37987p);
            }
            if (zwVar.f37988q != null) {
                hashMap.put(new zd(), zwVar.f37988q);
            }
            if (zwVar.f37989r != null) {
                hashMap.put(new zx(), zwVar.f37989r);
            }
            if (zwVar.f37990s != null) {
                hashMap.put(new aat(), zwVar.f37990s);
            }
            return new C11595b(this.f37971a, hashMap);
        }
    }

    private zw() {
    }

    /* renamed from: a */
    public static C9362a m47287a() {
        return new C9362a();
    }

    public final DescriptorFactory<C11595b, zw> getDescriptorFactory() {
        return new C11596c();
    }
}
