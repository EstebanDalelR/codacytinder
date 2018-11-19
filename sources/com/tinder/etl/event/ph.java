package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ph implements EtlEvent {

    /* renamed from: com.tinder.etl.event.ph$a */
    public static class C9184a {
        /* renamed from: a */
        private ph f31328a;

        private C9184a() {
            this.f31328a = new ph();
        }

        /* renamed from: a */
        public ph m38575a() {
            return this.f31328a;
        }
    }

    /* renamed from: com.tinder.etl.event.ph$b */
    public class C11407b extends fw {
        /* renamed from: a */
        final /* synthetic */ ph f37120a;

        /* renamed from: a */
        public String mo10346a() {
            return "Paywall.Discounted.View";
        }

        public C11407b(ph phVar, Map<EtlField<?>, Object> map) {
            this.f37120a = phVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ph$c */
    private final class C11408c implements DescriptorFactory<C11407b, ph> {
        /* renamed from: a */
        final /* synthetic */ ph f37121a;

        private C11408c(ph phVar) {
            this.f37121a = phVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45817a((ph) etlEvent);
        }

        /* renamed from: a */
        public final C11407b m45817a(ph phVar) {
            return new C11407b(this.f37121a, new HashMap());
        }
    }

    private ph() {
    }

    /* renamed from: a */
    public static C9184a m45818a() {
        return new C9184a();
    }

    public final DescriptorFactory<C11407b, ph> getDescriptorFactory() {
        return new C11408c();
    }
}
