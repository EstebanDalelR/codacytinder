package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class pi implements EtlEvent {

    /* renamed from: com.tinder.etl.event.pi$a */
    public static class C9186a {
        /* renamed from: a */
        private pi f31329a;

        private C9186a() {
            this.f31329a = new pi();
        }

        /* renamed from: a */
        public pi m38576a() {
            return this.f31329a;
        }
    }

    /* renamed from: com.tinder.etl.event.pi$b */
    public class C11409b extends fw {
        /* renamed from: a */
        final /* synthetic */ pi f37122a;

        /* renamed from: a */
        public String mo10346a() {
            return "Paywall.Expired.View";
        }

        public C11409b(pi piVar, Map<EtlField<?>, Object> map) {
            this.f37122a = piVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.pi$c */
    private final class C11410c implements DescriptorFactory<C11409b, pi> {
        /* renamed from: a */
        final /* synthetic */ pi f37123a;

        private C11410c(pi piVar) {
            this.f37123a = piVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45820a((pi) etlEvent);
        }

        /* renamed from: a */
        public final C11409b m45820a(pi piVar) {
            return new C11409b(this.f37123a, new HashMap());
        }
    }

    private pi() {
    }

    /* renamed from: a */
    public static C9186a m45821a() {
        return new C9186a();
    }

    public final DescriptorFactory<C11409b, pi> getDescriptorFactory() {
        return new C11410c();
    }
}
