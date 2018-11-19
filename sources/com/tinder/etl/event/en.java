package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class en implements EtlEvent {

    /* renamed from: com.tinder.etl.event.en$a */
    public static class C9070a {
        /* renamed from: a */
        private en f31270a;

        private C9070a() {
            this.f31270a = new en();
        }

        /* renamed from: a */
        public en m38217a() {
            return this.f31270a;
        }
    }

    /* renamed from: com.tinder.etl.event.en$b */
    public class C11281b extends fw {
        /* renamed from: a */
        final /* synthetic */ en f36660a;

        /* renamed from: a */
        public String mo10346a() {
            return "DeepLink.ChangeID";
        }

        public C11281b(en enVar, Map<EtlField<?>, Object> map) {
            this.f36660a = enVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.en$c */
    private final class C11282c implements DescriptorFactory<C11281b, en> {
        /* renamed from: a */
        final /* synthetic */ en f36661a;

        private C11282c(en enVar) {
            this.f36661a = enVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45001a((en) etlEvent);
        }

        /* renamed from: a */
        public final C11281b m45001a(en enVar) {
            return new C11281b(this.f36661a, new HashMap());
        }
    }

    private en() {
    }

    /* renamed from: a */
    public static C9070a m45002a() {
        return new C9070a();
    }

    public final DescriptorFactory<C11281b, en> getDescriptorFactory() {
        return new C11282c();
    }
}
