package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class aaf implements EtlEvent {
    /* renamed from: a */
    private Number f36106a;

    /* renamed from: com.tinder.etl.event.aaf$a */
    public static class C8956a {
        /* renamed from: a */
        private aaf f31213a;

        private C8956a() {
            this.f31213a = new aaf();
        }

        /* renamed from: a */
        public final C8956a m37764a(Number number) {
            this.f31213a.f36106a = number;
            return this;
        }

        /* renamed from: a */
        public aaf m37765a() {
            return this.f31213a;
        }
    }

    /* renamed from: com.tinder.etl.event.aaf$b */
    public class C11162b extends fw {
        /* renamed from: a */
        final /* synthetic */ aaf f36104a;

        /* renamed from: a */
        public String mo10346a() {
            return "Variant.Add";
        }

        public C11162b(aaf aaf, Map<EtlField<?>, Object> map) {
            this.f36104a = aaf;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.aaf$c */
    private final class C11163c implements DescriptorFactory<C11162b, aaf> {
        /* renamed from: a */
        final /* synthetic */ aaf f36105a;

        private C11163c(aaf aaf) {
            this.f36105a = aaf;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m43992a((aaf) etlEvent);
        }

        /* renamed from: a */
        public final C11162b m43992a(aaf aaf) {
            Map hashMap = new HashMap();
            if (aaf.f36106a != null) {
                hashMap.put(new aah(), aaf.f36106a);
            }
            return new C11162b(this.f36105a, hashMap);
        }
    }

    private aaf() {
    }

    /* renamed from: a */
    public static C8956a m43993a() {
        return new C8956a();
    }

    public final DescriptorFactory<C11162b, aaf> getDescriptorFactory() {
        return new C11163c();
    }
}
