package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class cg implements EtlEvent {
    /* renamed from: a */
    private Boolean f36303a;

    /* renamed from: com.tinder.etl.event.cg$a */
    public static class C9008a {
        /* renamed from: a */
        private cg f31239a;

        private C9008a() {
            this.f31239a = new cg();
        }

        /* renamed from: a */
        public final C9008a m37923a(Boolean bool) {
            this.f31239a.f36303a = bool;
            return this;
        }

        /* renamed from: a */
        public cg m37924a() {
            return this.f31239a;
        }
    }

    /* renamed from: com.tinder.etl.event.cg$b */
    public class C11216b extends fw {
        /* renamed from: a */
        final /* synthetic */ cg f36301a;

        /* renamed from: a */
        public String mo10346a() {
            return "BoostReminder.View";
        }

        public C11216b(cg cgVar, Map<EtlField<?>, Object> map) {
            this.f36301a = cgVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.cg$c */
    private final class C11217c implements DescriptorFactory<C11216b, cg> {
        /* renamed from: a */
        final /* synthetic */ cg f36302a;

        private C11217c(cg cgVar) {
            this.f36302a = cgVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44348a((cg) etlEvent);
        }

        /* renamed from: a */
        public final C11216b m44348a(cg cgVar) {
            Map hashMap = new HashMap();
            if (cgVar.f36303a != null) {
                hashMap.put(new iz(), cgVar.f36303a);
            }
            return new C11216b(this.f36302a, hashMap);
        }
    }

    private cg() {
    }

    /* renamed from: a */
    public static C9008a m44349a() {
        return new C9008a();
    }

    public final DescriptorFactory<C11216b, cg> getDescriptorFactory() {
        return new C11217c();
    }
}
