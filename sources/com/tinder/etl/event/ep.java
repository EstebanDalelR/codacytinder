package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ep implements EtlEvent {

    /* renamed from: com.tinder.etl.event.ep$a */
    public static class C9074a {
        /* renamed from: a */
        private ep f31272a;

        private C9074a() {
            this.f31272a = new ep();
        }

        /* renamed from: a */
        public ep m38219a() {
            return this.f31272a;
        }
    }

    /* renamed from: com.tinder.etl.event.ep$b */
    public class C11285b extends fw {
        /* renamed from: a */
        final /* synthetic */ ep f36664a;

        /* renamed from: a */
        public String mo10346a() {
            return "DeepLink.DeleteID";
        }

        public C11285b(ep epVar, Map<EtlField<?>, Object> map) {
            this.f36664a = epVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ep$c */
    private final class C11286c implements DescriptorFactory<C11285b, ep> {
        /* renamed from: a */
        final /* synthetic */ ep f36665a;

        private C11286c(ep epVar) {
            this.f36665a = epVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45007a((ep) etlEvent);
        }

        /* renamed from: a */
        public final C11285b m45007a(ep epVar) {
            return new C11285b(this.f36665a, new HashMap());
        }
    }

    private ep() {
    }

    /* renamed from: a */
    public static C9074a m45008a() {
        return new C9074a();
    }

    public final DescriptorFactory<C11285b, ep> getDescriptorFactory() {
        return new C11286c();
    }
}
