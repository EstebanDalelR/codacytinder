package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class cj implements EtlEvent {
    /* renamed from: a */
    private Boolean f36318a;

    /* renamed from: com.tinder.etl.event.cj$a */
    public static class C9012a {
        /* renamed from: a */
        private cj f31241a;

        private C9012a() {
            this.f31241a = new cj();
        }

        /* renamed from: a */
        public final C9012a m37932a(Boolean bool) {
            this.f31241a.f36318a = bool;
            return this;
        }

        /* renamed from: a */
        public cj m37933a() {
            return this.f31241a;
        }
    }

    /* renamed from: com.tinder.etl.event.cj$b */
    public class C11220b extends fw {
        /* renamed from: a */
        final /* synthetic */ cj f36316a;

        /* renamed from: a */
        public String mo10346a() {
            return "BoostTutorial.View";
        }

        public C11220b(cj cjVar, Map<EtlField<?>, Object> map) {
            this.f36316a = cjVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.cj$c */
    private final class C11221c implements DescriptorFactory<C11220b, cj> {
        /* renamed from: a */
        final /* synthetic */ cj f36317a;

        private C11221c(cj cjVar) {
            this.f36317a = cjVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44372a((cj) etlEvent);
        }

        /* renamed from: a */
        public final C11220b m44372a(cj cjVar) {
            Map hashMap = new HashMap();
            if (cjVar.f36318a != null) {
                hashMap.put(new iz(), cjVar.f36318a);
            }
            return new C11220b(this.f36317a, hashMap);
        }
    }

    private cj() {
    }

    /* renamed from: a */
    public static C9012a m44373a() {
        return new C9012a();
    }

    public final DescriptorFactory<C11220b, cj> getDescriptorFactory() {
        return new C11221c();
    }
}
