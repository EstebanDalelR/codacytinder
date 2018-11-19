package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ip implements EtlEvent {
    /* renamed from: a */
    private Number f36929a;

    /* renamed from: com.tinder.etl.event.ip$a */
    public static class C9130a {
        /* renamed from: a */
        private ip f31301a;

        private C9130a() {
            this.f31301a = new ip();
        }

        /* renamed from: a */
        public final C9130a m38438a(Number number) {
            this.f31301a.f36929a = number;
            return this;
        }

        /* renamed from: a */
        public ip m38439a() {
            return this.f31301a;
        }
    }

    /* renamed from: com.tinder.etl.event.ip$b */
    public class C11346b extends fw {
        /* renamed from: a */
        final /* synthetic */ ip f36927a;

        /* renamed from: a */
        public String mo10346a() {
            return "Gold.ViewIntroduction";
        }

        public C11346b(ip ipVar, Map<EtlField<?>, Object> map) {
            this.f36927a = ipVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ip$c */
    private final class C11347c implements DescriptorFactory<C11346b, ip> {
        /* renamed from: a */
        final /* synthetic */ ip f36928a;

        private C11347c(ip ipVar) {
            this.f36928a = ipVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45487a((ip) etlEvent);
        }

        /* renamed from: a */
        public final C11346b m45487a(ip ipVar) {
            Map hashMap = new HashMap();
            if (ipVar.f36929a != null) {
                hashMap.put(new ij(), ipVar.f36929a);
            }
            return new C11346b(this.f36928a, hashMap);
        }
    }

    private ip() {
    }

    /* renamed from: a */
    public static C9130a m45488a() {
        return new C9130a();
    }

    public final DescriptorFactory<C11346b, ip> getDescriptorFactory() {
        return new C11347c();
    }
}
