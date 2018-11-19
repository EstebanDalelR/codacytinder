package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qn implements EtlEvent {
    /* renamed from: a */
    private String f37183a;

    /* renamed from: com.tinder.etl.event.qn$a */
    public static class C9206a {
        /* renamed from: a */
        private qn f31339a;

        private C9206a() {
            this.f31339a = new qn();
        }

        /* renamed from: a */
        public final C9206a m38623a(String str) {
            this.f31339a.f37183a = str;
            return this;
        }

        /* renamed from: a */
        public qn m38624a() {
            return this.f31339a;
        }
    }

    /* renamed from: com.tinder.etl.event.qn$b */
    public class C11430b extends fw {
        /* renamed from: a */
        final /* synthetic */ qn f37181a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.MapInteraction";
        }

        public C11430b(qn qnVar, Map<EtlField<?>, Object> map) {
            this.f37181a = qnVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qn$c */
    private final class C11431c implements DescriptorFactory<C11430b, qn> {
        /* renamed from: a */
        final /* synthetic */ qn f37182a;

        private C11431c(qn qnVar) {
            this.f37182a = qnVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45926a((qn) etlEvent);
        }

        /* renamed from: a */
        public final C11430b m45926a(qn qnVar) {
            Map hashMap = new HashMap();
            if (qnVar.f37183a != null) {
                hashMap.put(new mq(), qnVar.f37183a);
            }
            return new C11430b(this.f37182a, hashMap);
        }
    }

    private qn() {
    }

    /* renamed from: a */
    public static C9206a m45927a() {
        return new C9206a();
    }

    public final DescriptorFactory<C11430b, qn> getDescriptorFactory() {
        return new C11431c();
    }
}
