package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.u */
public final class C11503u implements EtlEvent {
    /* renamed from: a */
    private Number f37389a;
    /* renamed from: b */
    private Number f37390b;
    /* renamed from: c */
    private Number f37391c;
    /* renamed from: d */
    private Number f37392d;
    /* renamed from: e */
    private String f37393e;
    /* renamed from: f */
    private String f37394f;
    /* renamed from: g */
    private Boolean f37395g;
    /* renamed from: h */
    private Boolean f37396h;
    /* renamed from: i */
    private Number f37397i;
    /* renamed from: j */
    private Number f37398j;
    /* renamed from: k */
    private String f37399k;

    /* renamed from: com.tinder.etl.event.u$a */
    public static class C9274a {
        /* renamed from: a */
        private C11503u f31373a;

        private C9274a() {
            this.f31373a = new C11503u();
        }

        /* renamed from: a */
        public final C9274a m38758a(Number number) {
            this.f31373a.f37389a = number;
            return this;
        }

        /* renamed from: b */
        public final C9274a m38762b(Number number) {
            this.f31373a.f37390b = number;
            return this;
        }

        /* renamed from: c */
        public final C9274a m38764c(Number number) {
            this.f31373a.f37391c = number;
            return this;
        }

        /* renamed from: d */
        public final C9274a m38765d(Number number) {
            this.f31373a.f37392d = number;
            return this;
        }

        /* renamed from: a */
        public final C9274a m38759a(String str) {
            this.f31373a.f37393e = str;
            return this;
        }

        /* renamed from: b */
        public final C9274a m38763b(String str) {
            this.f31373a.f37394f = str;
            return this;
        }

        /* renamed from: a */
        public final C9274a m38757a(Boolean bool) {
            this.f31373a.f37395g = bool;
            return this;
        }

        /* renamed from: b */
        public final C9274a m38761b(Boolean bool) {
            this.f31373a.f37396h = bool;
            return this;
        }

        /* renamed from: e */
        public final C9274a m38766e(Number number) {
            this.f31373a.f37397i = number;
            return this;
        }

        /* renamed from: f */
        public final C9274a m38767f(Number number) {
            this.f31373a.f37398j = number;
            return this;
        }

        /* renamed from: a */
        public C11503u m38760a() {
            return this.f31373a;
        }
    }

    /* renamed from: com.tinder.etl.event.u$b */
    public class C11501b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11503u f37387a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.Close";
        }

        public C11501b(C11503u c11503u, Map<EtlField<?>, Object> map) {
            this.f37387a = c11503u;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.u$c */
    private final class C11502c implements DescriptorFactory<C11501b, C11503u> {
        /* renamed from: a */
        final /* synthetic */ C11503u f37388a;

        private C11502c(C11503u c11503u) {
            this.f37388a = c11503u;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46266a((C11503u) etlEvent);
        }

        /* renamed from: a */
        public final C11501b m46266a(C11503u c11503u) {
            Map hashMap = new HashMap();
            if (c11503u.f37389a != null) {
                hashMap.put(new C11413q(), c11503u.f37389a);
            }
            if (c11503u.f37390b != null) {
                hashMap.put(new C11582z(), c11503u.f37390b);
            }
            if (c11503u.f37391c != null) {
                hashMap.put(new ad(), c11503u.f37391c);
            }
            if (c11503u.f37392d != null) {
                hashMap.put(new aj(), c11503u.f37392d);
            }
            if (c11503u.f37393e != null) {
                hashMap.put(new cr(), c11503u.f37393e);
            }
            if (c11503u.f37394f != null) {
                hashMap.put(new eh(), c11503u.f37394f);
            }
            if (c11503u.f37395g != null) {
                hashMap.put(new ke(), c11503u.f37395g);
            }
            if (c11503u.f37396h != null) {
                hashMap.put(new ms(), c11503u.f37396h);
            }
            if (c11503u.f37397i != null) {
                hashMap.put(new sh(), c11503u.f37397i);
            }
            if (c11503u.f37398j != null) {
                hashMap.put(new yo(), c11503u.f37398j);
            }
            if (c11503u.f37399k != null) {
                hashMap.put(new xe(), c11503u.f37399k);
            }
            return new C11501b(this.f37388a, hashMap);
        }
    }

    private C11503u() {
    }

    /* renamed from: a */
    public static C9274a m46267a() {
        return new C9274a();
    }

    public final DescriptorFactory<C11501b, C11503u> getDescriptorFactory() {
        return new C11502c();
    }
}
