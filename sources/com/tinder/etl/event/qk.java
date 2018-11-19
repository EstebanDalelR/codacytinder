package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qk implements EtlEvent {
    /* renamed from: a */
    private Boolean f37166a;

    /* renamed from: com.tinder.etl.event.qk$a */
    public static class C9200a {
        /* renamed from: a */
        private qk f31336a;

        private C9200a() {
            this.f31336a = new qk();
        }

        /* renamed from: a */
        public final C9200a m38611a(Boolean bool) {
            this.f31336a.f37166a = bool;
            return this;
        }

        /* renamed from: a */
        public qk m38612a() {
            return this.f31336a;
        }
    }

    /* renamed from: com.tinder.etl.event.qk$b */
    public class C11424b extends fw {
        /* renamed from: a */
        final /* synthetic */ qk f37164a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.ExperimentToggle";
        }

        public C11424b(qk qkVar, Map<EtlField<?>, Object> map) {
            this.f37164a = qkVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qk$c */
    private final class C11425c implements DescriptorFactory<C11424b, qk> {
        /* renamed from: a */
        final /* synthetic */ qk f37165a;

        private C11425c(qk qkVar) {
            this.f37165a = qkVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45897a((qk) etlEvent);
        }

        /* renamed from: a */
        public final C11424b m45897a(qk qkVar) {
            Map hashMap = new HashMap();
            if (qkVar.f37166a != null) {
                hashMap.put(new fz(), qkVar.f37166a);
            }
            return new C11424b(this.f37165a, hashMap);
        }
    }

    private qk() {
    }

    /* renamed from: a */
    public static C9200a m45898a() {
        return new C9200a();
    }

    public final DescriptorFactory<C11424b, qk> getDescriptorFactory() {
        return new C11425c();
    }
}
