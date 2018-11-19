package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.b */
public final class C11196b implements EtlEvent {
    /* renamed from: a */
    private Number f36226a;

    /* renamed from: com.tinder.etl.event.b$a */
    public static class C8988a {
        /* renamed from: a */
        private C11196b f31229a;

        private C8988a() {
            this.f31229a = new C11196b();
        }

        /* renamed from: a */
        public final C8988a m37857a(Number number) {
            this.f31229a.f36226a = number;
            return this;
        }

        /* renamed from: a */
        public C11196b m37858a() {
            return this.f31229a;
        }
    }

    /* renamed from: com.tinder.etl.event.b$b */
    public class C11194b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11196b f36224a;

        /* renamed from: a */
        public String mo10346a() {
            return "Account.InstagramConnect";
        }

        public C11194b(C11196b c11196b, Map<EtlField<?>, Object> map) {
            this.f36224a = c11196b;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.b$c */
    private final class C11195c implements DescriptorFactory<C11194b, C11196b> {
        /* renamed from: a */
        final /* synthetic */ C11196b f36225a;

        private C11195c(C11196b c11196b) {
            this.f36225a = c11196b;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44205a((C11196b) etlEvent);
        }

        /* renamed from: a */
        public final C11194b m44205a(C11196b c11196b) {
            Map hashMap = new HashMap();
            if (c11196b.f36226a != null) {
                hashMap.put(new rw(), c11196b.f36226a);
            }
            return new C11194b(this.f36225a, hashMap);
        }
    }

    private C11196b() {
    }

    /* renamed from: a */
    public static C8988a m44206a() {
        return new C8988a();
    }

    public final DescriptorFactory<C11194b, C11196b> getDescriptorFactory() {
        return new C11195c();
    }
}
