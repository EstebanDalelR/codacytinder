package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.s */
public final class C11467s implements EtlEvent {
    /* renamed from: a */
    private Number f37271a;
    /* renamed from: b */
    private Number f37272b;
    /* renamed from: c */
    private Number f37273c;
    /* renamed from: d */
    private String f37274d;
    /* renamed from: e */
    private String f37275e;
    /* renamed from: f */
    private String f37276f;

    /* renamed from: com.tinder.etl.event.s$a */
    public static class C9240a {
        /* renamed from: a */
        private C11467s f31356a;

        private C9240a() {
            this.f31356a = new C11467s();
        }

        /* renamed from: a */
        public final C9240a m38684a(Number number) {
            this.f31356a.f37271a = number;
            return this;
        }

        /* renamed from: b */
        public final C9240a m38687b(Number number) {
            this.f31356a.f37272b = number;
            return this;
        }

        /* renamed from: c */
        public final C9240a m38689c(Number number) {
            this.f31356a.f37273c = number;
            return this;
        }

        /* renamed from: a */
        public final C9240a m38685a(String str) {
            this.f31356a.f37274d = str;
            return this;
        }

        /* renamed from: b */
        public final C9240a m38688b(String str) {
            this.f31356a.f37275e = str;
            return this;
        }

        /* renamed from: a */
        public C11467s m38686a() {
            return this.f31356a;
        }
    }

    /* renamed from: com.tinder.etl.event.s$b */
    public class C11465b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11467s f37269a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.ChatClose";
        }

        public C11465b(C11467s c11467s, Map<EtlField<?>, Object> map) {
            this.f37269a = c11467s;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.s$c */
    private final class C11466c implements DescriptorFactory<C11465b, C11467s> {
        /* renamed from: a */
        final /* synthetic */ C11467s f37270a;

        private C11466c(C11467s c11467s) {
            this.f37270a = c11467s;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46075a((C11467s) etlEvent);
        }

        /* renamed from: a */
        public final C11465b m46075a(C11467s c11467s) {
            Map hashMap = new HashMap();
            if (c11467s.f37271a != null) {
                hashMap.put(new C11582z(), c11467s.f37271a);
            }
            if (c11467s.f37272b != null) {
                hashMap.put(new ad(), c11467s.f37272b);
            }
            if (c11467s.f37273c != null) {
                hashMap.put(new aj(), c11467s.f37273c);
            }
            if (c11467s.f37274d != null) {
                hashMap.put(new cr(), c11467s.f37274d);
            }
            if (c11467s.f37275e != null) {
                hashMap.put(new eh(), c11467s.f37275e);
            }
            if (c11467s.f37276f != null) {
                hashMap.put(new xe(), c11467s.f37276f);
            }
            return new C11465b(this.f37270a, hashMap);
        }
    }

    private C11467s() {
    }

    /* renamed from: a */
    public static C9240a m46076a() {
        return new C9240a();
    }

    public final DescriptorFactory<C11465b, C11467s> getDescriptorFactory() {
        return new C11466c();
    }
}
