package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qp implements EtlEvent {
    /* renamed from: a */
    private Number f37190a;
    /* renamed from: b */
    private String f37191b;

    /* renamed from: com.tinder.etl.event.qp$a */
    public static class C9210a {
        /* renamed from: a */
        private qp f31341a;

        private C9210a() {
            this.f31341a = new qp();
        }

        /* renamed from: a */
        public final C9210a m38627a(Number number) {
            this.f31341a.f37190a = number;
            return this;
        }

        /* renamed from: a */
        public final C9210a m38628a(String str) {
            this.f31341a.f37191b = str;
            return this;
        }

        /* renamed from: a */
        public qp m38629a() {
            return this.f31341a;
        }
    }

    /* renamed from: com.tinder.etl.event.qp$b */
    public class C11434b extends fw {
        /* renamed from: a */
        final /* synthetic */ qp f37188a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.RecentPlaceClose";
        }

        public C11434b(qp qpVar, Map<EtlField<?>, Object> map) {
            this.f37188a = qpVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qp$c */
    private final class C11435c implements DescriptorFactory<C11434b, qp> {
        /* renamed from: a */
        final /* synthetic */ qp f37189a;

        private C11435c(qp qpVar) {
            this.f37189a = qpVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45937a((qp) etlEvent);
        }

        /* renamed from: a */
        public final C11434b m45937a(qp qpVar) {
            Map hashMap = new HashMap();
            if (qpVar.f37190a != null) {
                hashMap.put(new oh(), qpVar.f37190a);
            }
            if (qpVar.f37191b != null) {
                hashMap.put(new qb(), qpVar.f37191b);
            }
            return new C11434b(this.f37189a, hashMap);
        }
    }

    private qp() {
    }

    /* renamed from: a */
    public static C9210a m45938a() {
        return new C9210a();
    }

    public final DescriptorFactory<C11434b, qp> getDescriptorFactory() {
        return new C11435c();
    }
}
