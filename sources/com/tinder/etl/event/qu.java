package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qu implements EtlEvent {
    /* renamed from: a */
    private String f37225a;

    /* renamed from: com.tinder.etl.event.qu$a */
    public static class C9220a {
        /* renamed from: a */
        private qu f31346a;

        private C9220a() {
            this.f31346a = new qu();
        }

        /* renamed from: a */
        public final C9220a m38655a(String str) {
            this.f31346a.f37225a = str;
            return this;
        }

        /* renamed from: a */
        public qu m38656a() {
            return this.f31346a;
        }
    }

    /* renamed from: com.tinder.etl.event.qu$b */
    public class C11444b extends fw {
        /* renamed from: a */
        final /* synthetic */ qu f37223a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.ViewOptions";
        }

        public C11444b(qu quVar, Map<EtlField<?>, Object> map) {
            this.f37223a = quVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qu$c */
    private final class C11445c implements DescriptorFactory<C11444b, qu> {
        /* renamed from: a */
        final /* synthetic */ qu f37224a;

        private C11445c(qu quVar) {
            this.f37224a = quVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46000a((qu) etlEvent);
        }

        /* renamed from: a */
        public final C11444b m46000a(qu quVar) {
            Map hashMap = new HashMap();
            if (quVar.f37225a != null) {
                hashMap.put(new qb(), quVar.f37225a);
            }
            return new C11444b(this.f37224a, hashMap);
        }
    }

    private qu() {
    }

    /* renamed from: a */
    public static C9220a m46001a() {
        return new C9220a();
    }

    public final DescriptorFactory<C11444b, qu> getDescriptorFactory() {
        return new C11445c();
    }
}
