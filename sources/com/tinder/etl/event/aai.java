package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class aai implements EtlEvent {
    /* renamed from: a */
    private String f36109a;

    /* renamed from: com.tinder.etl.event.aai$a */
    public static class C8958a {
        /* renamed from: a */
        private aai f31214a;

        private C8958a() {
            this.f31214a = new aai();
        }

        /* renamed from: a */
        public final C8958a m37766a(String str) {
            this.f31214a.f36109a = str;
            return this;
        }

        /* renamed from: a */
        public aai m37767a() {
            return this.f31214a;
        }
    }

    /* renamed from: com.tinder.etl.event.aai$b */
    public class C11164b extends fw {
        /* renamed from: a */
        final /* synthetic */ aai f36107a;

        /* renamed from: a */
        public String mo10346a() {
            return "Variant.Reset";
        }

        public C11164b(aai aai, Map<EtlField<?>, Object> map) {
            this.f36107a = aai;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.aai$c */
    private final class C11165c implements DescriptorFactory<C11164b, aai> {
        /* renamed from: a */
        final /* synthetic */ aai f36108a;

        private C11165c(aai aai) {
            this.f36108a = aai;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m43997a((aai) etlEvent);
        }

        /* renamed from: a */
        public final C11164b m43997a(aai aai) {
            Map hashMap = new HashMap();
            if (aai.f36109a != null) {
                hashMap.put(new vb(), aai.f36109a);
            }
            return new C11164b(this.f36108a, hashMap);
        }
    }

    private aai() {
    }

    /* renamed from: a */
    public static C8958a m43998a() {
        return new C8958a();
    }

    public final DescriptorFactory<C11164b, aai> getDescriptorFactory() {
        return new C11165c();
    }
}
