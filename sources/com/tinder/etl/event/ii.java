package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ii implements EtlEvent {
    /* renamed from: a */
    private Number f36860a;

    /* renamed from: com.tinder.etl.event.ii$a */
    public static class C9118a {
        /* renamed from: a */
        private ii f31295a;

        private C9118a() {
            this.f31295a = new ii();
        }

        /* renamed from: a */
        public final C9118a m38386a(Number number) {
            this.f31295a.f36860a = number;
            return this;
        }

        /* renamed from: a */
        public ii m38387a() {
            return this.f31295a;
        }
    }

    /* renamed from: com.tinder.etl.event.ii$b */
    public class C11334b extends fw {
        /* renamed from: a */
        final /* synthetic */ ii f36858a;

        /* renamed from: a */
        public String mo10346a() {
            return "Gold.ContinueIntroduction";
        }

        public C11334b(ii iiVar, Map<EtlField<?>, Object> map) {
            this.f36858a = iiVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ii$c */
    private final class C11335c implements DescriptorFactory<C11334b, ii> {
        /* renamed from: a */
        final /* synthetic */ ii f36859a;

        private C11335c(ii iiVar) {
            this.f36859a = iiVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45366a((ii) etlEvent);
        }

        /* renamed from: a */
        public final C11334b m45366a(ii iiVar) {
            Map hashMap = new HashMap();
            if (iiVar.f36860a != null) {
                hashMap.put(new ij(), iiVar.f36860a);
            }
            return new C11334b(this.f36859a, hashMap);
        }
    }

    private ii() {
    }

    /* renamed from: a */
    public static C9118a m45367a() {
        return new C9118a();
    }

    public final DescriptorFactory<C11334b, ii> getDescriptorFactory() {
        return new C11335c();
    }
}
