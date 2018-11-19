package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ql implements EtlEvent {
    /* renamed from: a */
    private Number f37169a;
    /* renamed from: b */
    private Number f37170b;
    /* renamed from: c */
    private Number f37171c;

    /* renamed from: com.tinder.etl.event.ql$a */
    public static class C9202a {
        /* renamed from: a */
        private ql f31337a;

        private C9202a() {
            this.f31337a = new ql();
        }

        /* renamed from: a */
        public final C9202a m38613a(Number number) {
            this.f31337a.f37169a = number;
            return this;
        }

        /* renamed from: b */
        public final C9202a m38615b(Number number) {
            this.f31337a.f37170b = number;
            return this;
        }

        /* renamed from: c */
        public final C9202a m38616c(Number number) {
            this.f31337a.f37171c = number;
            return this;
        }

        /* renamed from: a */
        public ql m38614a() {
            return this.f31337a;
        }
    }

    /* renamed from: com.tinder.etl.event.ql$b */
    public class C11426b extends fw {
        /* renamed from: a */
        final /* synthetic */ ql f37167a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.LoadedRecentPlaces";
        }

        public C11426b(ql qlVar, Map<EtlField<?>, Object> map) {
            this.f37167a = qlVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ql$c */
    private final class C11427c implements DescriptorFactory<C11426b, ql> {
        /* renamed from: a */
        final /* synthetic */ ql f37168a;

        private C11427c(ql qlVar) {
            this.f37168a = qlVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45902a((ql) etlEvent);
        }

        /* renamed from: a */
        public final C11426b m45902a(ql qlVar) {
            Map hashMap = new HashMap();
            if (qlVar.f37169a != null) {
                hashMap.put(new fl(), qlVar.f37169a);
            }
            if (qlVar.f37170b != null) {
                hashMap.put(new ft(), qlVar.f37170b);
            }
            if (qlVar.f37171c != null) {
                hashMap.put(new oe(), qlVar.f37171c);
            }
            return new C11426b(this.f37168a, hashMap);
        }
    }

    private ql() {
    }

    /* renamed from: a */
    public static C9202a m45903a() {
        return new C9202a();
    }

    public final DescriptorFactory<C11426b, ql> getDescriptorFactory() {
        return new C11427c();
    }
}
