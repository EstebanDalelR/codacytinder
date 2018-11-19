package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class sj implements EtlEvent {
    /* renamed from: a */
    private Number f37301a;

    /* renamed from: com.tinder.etl.event.sj$a */
    public static class C9248a {
        /* renamed from: a */
        private sj f31360a;

        private C9248a() {
            this.f31360a = new sj();
        }

        /* renamed from: a */
        public final C9248a m38709a(Number number) {
            this.f31360a.f37301a = number;
            return this;
        }

        /* renamed from: a */
        public sj m38710a() {
            return this.f31360a;
        }
    }

    /* renamed from: com.tinder.etl.event.sj$b */
    public class C11474b extends fw {
        /* renamed from: a */
        final /* synthetic */ sj f37299a;

        /* renamed from: a */
        public String mo10346a() {
            return "ProgressiveOnboarding.Unlock";
        }

        public C11474b(sj sjVar, Map<EtlField<?>, Object> map) {
            this.f37299a = sjVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.sj$c */
    private final class C11475c implements DescriptorFactory<C11474b, sj> {
        /* renamed from: a */
        final /* synthetic */ sj f37300a;

        private C11475c(sj sjVar) {
            this.f37300a = sjVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46130a((sj) etlEvent);
        }

        /* renamed from: a */
        public final C11474b m46130a(sj sjVar) {
            Map hashMap = new HashMap();
            if (sjVar.f37301a != null) {
                hashMap.put(new gd(), sjVar.f37301a);
            }
            return new C11474b(this.f37300a, hashMap);
        }
    }

    private sj() {
    }

    /* renamed from: a */
    public static C9248a m46131a() {
        return new C9248a();
    }

    public final DescriptorFactory<C11474b, sj> getDescriptorFactory() {
        return new C11475c();
    }
}
