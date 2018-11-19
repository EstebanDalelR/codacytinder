package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qo implements EtlEvent {
    /* renamed from: a */
    private Number f37186a;
    /* renamed from: b */
    private String f37187b;

    /* renamed from: com.tinder.etl.event.qo$a */
    public static class C9208a {
        /* renamed from: a */
        private qo f31340a;

        private C9208a() {
            this.f31340a = new qo();
        }

        /* renamed from: a */
        public final C9208a m38625a(String str) {
            this.f31340a.f37187b = str;
            return this;
        }

        /* renamed from: a */
        public qo m38626a() {
            return this.f31340a;
        }
    }

    /* renamed from: com.tinder.etl.event.qo$b */
    public class C11432b extends fw {
        /* renamed from: a */
        final /* synthetic */ qo f37184a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.Onboarding";
        }

        public C11432b(qo qoVar, Map<EtlField<?>, Object> map) {
            this.f37184a = qoVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qo$c */
    private final class C11433c implements DescriptorFactory<C11432b, qo> {
        /* renamed from: a */
        final /* synthetic */ qo f37185a;

        private C11433c(qo qoVar) {
            this.f37185a = qoVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45931a((qo) etlEvent);
        }

        /* renamed from: a */
        public final C11432b m45931a(qo qoVar) {
            Map hashMap = new HashMap();
            if (qoVar.f37186a != null) {
                hashMap.put(new om(), qoVar.f37186a);
            }
            if (qoVar.f37187b != null) {
                hashMap.put(new on(), qoVar.f37187b);
            }
            return new C11432b(this.f37185a, hashMap);
        }
    }

    private qo() {
    }

    /* renamed from: a */
    public static C9208a m45932a() {
        return new C9208a();
    }

    public final DescriptorFactory<C11432b, qo> getDescriptorFactory() {
        return new C11433c();
    }
}
