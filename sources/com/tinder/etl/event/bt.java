package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class bt implements EtlEvent {
    /* renamed from: a */
    private String f36241a;

    /* renamed from: com.tinder.etl.event.bt$a */
    public static class C8994a {
        /* renamed from: a */
        private bt f31232a;

        private C8994a() {
            this.f31232a = new bt();
        }

        /* renamed from: a */
        public final C8994a m37869a(String str) {
            this.f31232a.f36241a = str;
            return this;
        }

        /* renamed from: a */
        public bt m37870a() {
            return this.f31232a;
        }
    }

    /* renamed from: com.tinder.etl.event.bt$b */
    public class C11201b extends fw {
        /* renamed from: a */
        final /* synthetic */ bt f36239a;

        /* renamed from: a */
        public String mo10346a() {
            return "Bitmoji.Interact";
        }

        public C11201b(bt btVar, Map<EtlField<?>, Object> map) {
            this.f36239a = btVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.bt$c */
    private final class C11202c implements DescriptorFactory<C11201b, bt> {
        /* renamed from: a */
        final /* synthetic */ bt f36240a;

        private C11202c(bt btVar) {
            this.f36240a = btVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44232a((bt) etlEvent);
        }

        /* renamed from: a */
        public final C11201b m44232a(bt btVar) {
            Map hashMap = new HashMap();
            if (btVar.f36241a != null) {
                hashMap.put(new zl(), btVar.f36241a);
            }
            return new C11201b(this.f36240a, hashMap);
        }
    }

    private bt() {
    }

    /* renamed from: a */
    public static C8994a m44233a() {
        return new C8994a();
    }

    public final DescriptorFactory<C11201b, bt> getDescriptorFactory() {
        return new C11202c();
    }
}
