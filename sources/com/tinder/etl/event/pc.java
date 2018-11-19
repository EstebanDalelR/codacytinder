package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class pc implements EtlEvent {
    /* renamed from: a */
    private Number f37115a;

    /* renamed from: com.tinder.etl.event.pc$a */
    public static class C9180a {
        /* renamed from: a */
        private pc f31326a;

        private C9180a() {
            this.f31326a = new pc();
        }

        /* renamed from: a */
        public final C9180a m38570a(Number number) {
            this.f31326a.f37115a = number;
            return this;
        }

        /* renamed from: a */
        public pc m38571a() {
            return this.f31326a;
        }
    }

    /* renamed from: com.tinder.etl.event.pc$b */
    public class C11403b extends fw {
        /* renamed from: a */
        final /* synthetic */ pc f37113a;

        /* renamed from: a */
        public String mo10346a() {
            return "Passport.MapOpen";
        }

        public C11403b(pc pcVar, Map<EtlField<?>, Object> map) {
            this.f37113a = pcVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.pc$c */
    private final class C11404c implements DescriptorFactory<C11403b, pc> {
        /* renamed from: a */
        final /* synthetic */ pc f37114a;

        private C11404c(pc pcVar) {
            this.f37114a = pcVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45805a((pc) etlEvent);
        }

        /* renamed from: a */
        public final C11403b m45805a(pc pcVar) {
            Map hashMap = new HashMap();
            if (pcVar.f37115a != null) {
                hashMap.put(new hg(), pcVar.f37115a);
            }
            return new C11403b(this.f37114a, hashMap);
        }
    }

    private pc() {
    }

    /* renamed from: a */
    public static C9180a m45806a() {
        return new C9180a();
    }

    public final DescriptorFactory<C11403b, pc> getDescriptorFactory() {
        return new C11404c();
    }
}
