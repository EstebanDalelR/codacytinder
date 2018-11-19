package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class pn implements EtlEvent {

    /* renamed from: com.tinder.etl.event.pn$a */
    public static class C9188a {
        /* renamed from: a */
        private pn f31330a;

        private C9188a() {
            this.f31330a = new pn();
        }

        /* renamed from: a */
        public pn m38577a() {
            return this.f31330a;
        }
    }

    /* renamed from: com.tinder.etl.event.pn$b */
    public class C11411b extends fw {
        /* renamed from: a */
        final /* synthetic */ pn f37124a;

        /* renamed from: a */
        public String mo10346a() {
            return "Paywall.View";
        }

        public C11411b(pn pnVar, Map<EtlField<?>, Object> map) {
            this.f37124a = pnVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.pn$c */
    private final class C11412c implements DescriptorFactory<C11411b, pn> {
        /* renamed from: a */
        final /* synthetic */ pn f37125a;

        private C11412c(pn pnVar) {
            this.f37125a = pnVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45823a((pn) etlEvent);
        }

        /* renamed from: a */
        public final C11411b m45823a(pn pnVar) {
            return new C11411b(this.f37125a, new HashMap());
        }
    }

    private pn() {
    }

    /* renamed from: a */
    public static C9188a m45824a() {
        return new C9188a();
    }

    public final DescriptorFactory<C11411b, pn> getDescriptorFactory() {
        return new C11412c();
    }
}
