package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.x */
public final class C11550x implements EtlEvent {
    /* renamed from: a */
    private Number f37662a;
    /* renamed from: b */
    private Number f37663b;
    /* renamed from: c */
    private String f37664c;
    /* renamed from: d */
    private String f37665d;
    /* renamed from: e */
    private Number f37666e;
    /* renamed from: f */
    private Boolean f37667f;
    /* renamed from: g */
    private String f37668g;

    /* renamed from: com.tinder.etl.event.x$a */
    public static class C9318a {
        /* renamed from: a */
        private C11550x f31395a;

        private C9318a() {
            this.f31395a = new C11550x();
        }

        /* renamed from: a */
        public final C9318a m38933a(Number number) {
            this.f31395a.f37662a = number;
            return this;
        }

        /* renamed from: b */
        public final C9318a m38936b(Number number) {
            this.f31395a.f37663b = number;
            return this;
        }

        /* renamed from: a */
        public final C9318a m38934a(String str) {
            this.f31395a.f37664c = str;
            return this;
        }

        /* renamed from: b */
        public final C9318a m38937b(String str) {
            this.f31395a.f37665d = str;
            return this;
        }

        /* renamed from: c */
        public final C9318a m38938c(Number number) {
            this.f31395a.f37666e = number;
            return this;
        }

        /* renamed from: a */
        public final C9318a m38932a(Boolean bool) {
            this.f31395a.f37667f = bool;
            return this;
        }

        /* renamed from: c */
        public final C9318a m38939c(String str) {
            this.f31395a.f37668g = str;
            return this;
        }

        /* renamed from: a */
        public C11550x m38935a() {
            return this.f31395a;
        }
    }

    /* renamed from: com.tinder.etl.event.x$b */
    public class C11548b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11550x f37660a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.DetailsOpen";
        }

        public C11548b(C11550x c11550x, Map<EtlField<?>, Object> map) {
            this.f37660a = c11550x;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.x$c */
    private final class C11549c implements DescriptorFactory<C11548b, C11550x> {
        /* renamed from: a */
        final /* synthetic */ C11550x f37661a;

        private C11549c(C11550x c11550x) {
            this.f37661a = c11550x;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46714a((C11550x) etlEvent);
        }

        /* renamed from: a */
        public final C11548b m46714a(C11550x c11550x) {
            Map hashMap = new HashMap();
            if (c11550x.f37662a != null) {
                hashMap.put(new C11413q(), c11550x.f37662a);
            }
            if (c11550x.f37663b != null) {
                hashMap.put(new ad(), c11550x.f37663b);
            }
            if (c11550x.f37664c != null) {
                hashMap.put(new cr(), c11550x.f37664c);
            }
            if (c11550x.f37665d != null) {
                hashMap.put(new eh(), c11550x.f37665d);
            }
            if (c11550x.f37666e != null) {
                hashMap.put(new hc(), c11550x.f37666e);
            }
            if (c11550x.f37667f != null) {
                hashMap.put(new ms(), c11550x.f37667f);
            }
            if (c11550x.f37668g != null) {
                hashMap.put(new zl(), c11550x.f37668g);
            }
            return new C11548b(this.f37661a, hashMap);
        }
    }

    private C11550x() {
    }

    /* renamed from: a */
    public static C9318a m46715a() {
        return new C9318a();
    }

    public final DescriptorFactory<C11548b, C11550x> getDescriptorFactory() {
        return new C11549c();
    }
}
