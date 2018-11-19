package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.i */
public final class C11328i implements EtlEvent {
    /* renamed from: a */
    private String f36839a;
    /* renamed from: b */
    private String f36840b;
    /* renamed from: c */
    private String f36841c;
    /* renamed from: d */
    private Boolean f36842d;

    /* renamed from: com.tinder.etl.event.i$a */
    public static class C9112a {
        /* renamed from: a */
        private C11328i f31292a;

        private C9112a() {
            this.f31292a = new C11328i();
        }

        /* renamed from: a */
        public final C9112a m38369a(String str) {
            this.f31292a.f36839a = str;
            return this;
        }

        /* renamed from: b */
        public final C9112a m38371b(String str) {
            this.f31292a.f36840b = str;
            return this;
        }

        /* renamed from: c */
        public final C9112a m38372c(String str) {
            this.f31292a.f36841c = str;
            return this;
        }

        /* renamed from: a */
        public final C9112a m38368a(Boolean bool) {
            this.f31292a.f36842d = bool;
            return this;
        }

        /* renamed from: a */
        public C11328i m38370a() {
            return this.f31292a;
        }
    }

    /* renamed from: com.tinder.etl.event.i$b */
    public class C11326b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11328i f36837a;

        /* renamed from: a */
        public String mo10346a() {
            return "Account.ThirdPartyIntegration";
        }

        public C11326b(C11328i c11328i, Map<EtlField<?>, Object> map) {
            this.f36837a = c11328i;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.i$c */
    private final class C11327c implements DescriptorFactory<C11326b, C11328i> {
        /* renamed from: a */
        final /* synthetic */ C11328i f36838a;

        private C11327c(C11328i c11328i) {
            this.f36838a = c11328i;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45327a((C11328i) etlEvent);
        }

        /* renamed from: a */
        public final C11326b m45327a(C11328i c11328i) {
            Map hashMap = new HashMap();
            if (c11328i.f36839a != null) {
                hashMap.put(new jk(), c11328i.f36839a);
            }
            if (c11328i.f36840b != null) {
                hashMap.put(new jl(), c11328i.f36840b);
            }
            if (c11328i.f36841c != null) {
                hashMap.put(new jm(), c11328i.f36841c);
            }
            if (c11328i.f36842d != null) {
                hashMap.put(new jn(), c11328i.f36842d);
            }
            return new C11326b(this.f36838a, hashMap);
        }
    }

    private C11328i() {
    }

    /* renamed from: a */
    public static C9112a m45328a() {
        return new C9112a();
    }

    public final DescriptorFactory<C11326b, C11328i> getDescriptorFactory() {
        return new C11327c();
    }
}
