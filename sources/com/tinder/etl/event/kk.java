package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class kk implements EtlEvent {

    /* renamed from: com.tinder.etl.event.kk$a */
    public static class C9148a {
        /* renamed from: a */
        private kk f31310a;

        private C9148a() {
            this.f31310a = new kk();
        }

        /* renamed from: a */
        public kk m38484a() {
            return this.f31310a;
        }
    }

    /* renamed from: com.tinder.etl.event.kk$b */
    public class C11366b extends fw {
        /* renamed from: a */
        final /* synthetic */ kk f36982a;

        /* renamed from: a */
        public String mo10346a() {
            return "LikesYouList.ConnectionFail";
        }

        public C11366b(kk kkVar, Map<EtlField<?>, Object> map) {
            this.f36982a = kkVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.kk$c */
    private final class C11367c implements DescriptorFactory<C11366b, kk> {
        /* renamed from: a */
        final /* synthetic */ kk f36983a;

        private C11367c(kk kkVar) {
            this.f36983a = kkVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45588a((kk) etlEvent);
        }

        /* renamed from: a */
        public final C11366b m45588a(kk kkVar) {
            return new C11366b(this.f36983a, new HashMap());
        }
    }

    private kk() {
    }

    /* renamed from: a */
    public static C9148a m45589a() {
        return new C9148a();
    }

    public final DescriptorFactory<C11366b, kk> getDescriptorFactory() {
        return new C11367c();
    }
}
