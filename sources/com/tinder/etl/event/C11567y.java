package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.y */
public final class C11567y implements EtlEvent {
    /* renamed from: a */
    private Number f37755a;
    /* renamed from: b */
    private Number f37756b;
    /* renamed from: c */
    private Number f37757c;
    /* renamed from: d */
    private Number f37758d;
    /* renamed from: e */
    private String f37759e;
    /* renamed from: f */
    private String f37760f;
    /* renamed from: g */
    private Boolean f37761g;
    /* renamed from: h */
    private Number f37762h;
    /* renamed from: i */
    private String f37763i;

    /* renamed from: com.tinder.etl.event.y$a */
    public static class C9334a {
        /* renamed from: a */
        private C11567y f31403a;

        private C9334a() {
            this.f31403a = new C11567y();
        }

        /* renamed from: a */
        public final C9334a m39015a(Number number) {
            this.f31403a.f37755a = number;
            return this;
        }

        /* renamed from: b */
        public final C9334a m39018b(Number number) {
            this.f31403a.f37756b = number;
            return this;
        }

        /* renamed from: c */
        public final C9334a m39019c(Number number) {
            this.f31403a.f37757c = number;
            return this;
        }

        /* renamed from: d */
        public final C9334a m39020d(Number number) {
            this.f31403a.f37758d = number;
            return this;
        }

        /* renamed from: a */
        public final C9334a m39016a(String str) {
            this.f31403a.f37759e = str;
            return this;
        }

        /* renamed from: a */
        public final C9334a m39014a(Boolean bool) {
            this.f31403a.f37761g = bool;
            return this;
        }

        /* renamed from: e */
        public final C9334a m39021e(Number number) {
            this.f31403a.f37762h = number;
            return this;
        }

        /* renamed from: a */
        public C11567y m39017a() {
            return this.f31403a;
        }
    }

    /* renamed from: com.tinder.etl.event.y$b */
    public class C11565b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11567y f37753a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.Dismiss";
        }

        public C11565b(C11567y c11567y, Map<EtlField<?>, Object> map) {
            this.f37753a = c11567y;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.y$c */
    private final class C11566c implements DescriptorFactory<C11565b, C11567y> {
        /* renamed from: a */
        final /* synthetic */ C11567y f37754a;

        private C11566c(C11567y c11567y) {
            this.f37754a = c11567y;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46889a((C11567y) etlEvent);
        }

        /* renamed from: a */
        public final C11565b m46889a(C11567y c11567y) {
            Map hashMap = new HashMap();
            if (c11567y.f37755a != null) {
                hashMap.put(new C11413q(), c11567y.f37755a);
            }
            if (c11567y.f37756b != null) {
                hashMap.put(new C11582z(), c11567y.f37756b);
            }
            if (c11567y.f37757c != null) {
                hashMap.put(new ad(), c11567y.f37757c);
            }
            if (c11567y.f37758d != null) {
                hashMap.put(new aj(), c11567y.f37758d);
            }
            if (c11567y.f37759e != null) {
                hashMap.put(new cr(), c11567y.f37759e);
            }
            if (c11567y.f37760f != null) {
                hashMap.put(new eh(), c11567y.f37760f);
            }
            if (c11567y.f37761g != null) {
                hashMap.put(new ms(), c11567y.f37761g);
            }
            if (c11567y.f37762h != null) {
                hashMap.put(new yo(), c11567y.f37762h);
            }
            if (c11567y.f37763i != null) {
                hashMap.put(new xe(), c11567y.f37763i);
            }
            return new C11565b(this.f37754a, hashMap);
        }
    }

    private C11567y() {
    }

    /* renamed from: a */
    public static C9334a m46890a() {
        return new C9334a();
    }

    public final DescriptorFactory<C11565b, C11567y> getDescriptorFactory() {
        return new C11566c();
    }
}
