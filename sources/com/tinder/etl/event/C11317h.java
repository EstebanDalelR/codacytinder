package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.h */
public final class C11317h implements EtlEvent {

    /* renamed from: com.tinder.etl.event.h$a */
    public static class C9102a {
        /* renamed from: a */
        private C11317h f31287a;

        private C9102a() {
            this.f31287a = new C11317h();
        }

        /* renamed from: a */
        public C11317h m38328a() {
            return this.f31287a;
        }
    }

    /* renamed from: com.tinder.etl.event.h$b */
    public class C11315b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11317h f36792a;

        /* renamed from: a */
        public String mo10346a() {
            return "Account.IntroCardShake";
        }

        public C11315b(C11317h c11317h, Map<EtlField<?>, Object> map) {
            this.f36792a = c11317h;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.h$c */
    private final class C11316c implements DescriptorFactory<C11315b, C11317h> {
        /* renamed from: a */
        final /* synthetic */ C11317h f36793a;

        private C11316c(C11317h c11317h) {
            this.f36793a = c11317h;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45242a((C11317h) etlEvent);
        }

        /* renamed from: a */
        public final C11315b m45242a(C11317h c11317h) {
            return new C11315b(this.f36793a, new HashMap());
        }
    }

    private C11317h() {
    }

    /* renamed from: a */
    public static C9102a m45243a() {
        return new C9102a();
    }

    public final DescriptorFactory<C11315b, C11317h> getDescriptorFactory() {
        return new C11316c();
    }
}
