package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ih implements EtlEvent {
    /* renamed from: a */
    private Number f36857a;

    /* renamed from: com.tinder.etl.event.ih$a */
    public static class C9116a {
        /* renamed from: a */
        private ih f31294a;

        private C9116a() {
            this.f31294a = new ih();
        }

        /* renamed from: a */
        public final C9116a m38384a(Number number) {
            this.f31294a.f36857a = number;
            return this;
        }

        /* renamed from: a */
        public ih m38385a() {
            return this.f31294a;
        }
    }

    /* renamed from: com.tinder.etl.event.ih$b */
    public class C11332b extends fw {
        /* renamed from: a */
        final /* synthetic */ ih f36855a;

        /* renamed from: a */
        public String mo10346a() {
            return "Gold.CancelIntroduction";
        }

        public C11332b(ih ihVar, Map<EtlField<?>, Object> map) {
            this.f36855a = ihVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ih$c */
    private final class C11333c implements DescriptorFactory<C11332b, ih> {
        /* renamed from: a */
        final /* synthetic */ ih f36856a;

        private C11333c(ih ihVar) {
            this.f36856a = ihVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45361a((ih) etlEvent);
        }

        /* renamed from: a */
        public final C11332b m45361a(ih ihVar) {
            Map hashMap = new HashMap();
            if (ihVar.f36857a != null) {
                hashMap.put(new ij(), ihVar.f36857a);
            }
            return new C11332b(this.f36856a, hashMap);
        }
    }

    private ih() {
    }

    /* renamed from: a */
    public static C9116a m45362a() {
        return new C9116a();
    }

    public final DescriptorFactory<C11332b, ih> getDescriptorFactory() {
        return new C11333c();
    }
}
