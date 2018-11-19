package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class eo implements EtlEvent {

    /* renamed from: com.tinder.etl.event.eo$a */
    public static class C9072a {
        /* renamed from: a */
        private eo f31271a;

        private C9072a() {
            this.f31271a = new eo();
        }

        /* renamed from: a */
        public eo m38218a() {
            return this.f31271a;
        }
    }

    /* renamed from: com.tinder.etl.event.eo$b */
    public class C11283b extends fw {
        /* renamed from: a */
        final /* synthetic */ eo f36662a;

        /* renamed from: a */
        public String mo10346a() {
            return "DeepLink.CreateID";
        }

        public C11283b(eo eoVar, Map<EtlField<?>, Object> map) {
            this.f36662a = eoVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.eo$c */
    private final class C11284c implements DescriptorFactory<C11283b, eo> {
        /* renamed from: a */
        final /* synthetic */ eo f36663a;

        private C11284c(eo eoVar) {
            this.f36663a = eoVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45004a((eo) etlEvent);
        }

        /* renamed from: a */
        public final C11283b m45004a(eo eoVar) {
            return new C11283b(this.f36663a, new HashMap());
        }
    }

    private eo() {
    }

    /* renamed from: a */
    public static C9072a m45005a() {
        return new C9072a();
    }

    public final DescriptorFactory<C11283b, eo> getDescriptorFactory() {
        return new C11284c();
    }
}
