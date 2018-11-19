package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class qh implements EtlEvent {
    /* renamed from: a */
    private Number f37151a;
    /* renamed from: b */
    private Number f37152b;
    /* renamed from: c */
    private Boolean f37153c;
    /* renamed from: d */
    private String f37154d;
    /* renamed from: e */
    private String f37155e;

    /* renamed from: com.tinder.etl.event.qh$a */
    public static class C9196a {
        /* renamed from: a */
        private qh f31334a;

        private C9196a() {
            this.f31334a = new qh();
        }

        /* renamed from: a */
        public final C9196a m38599a(Number number) {
            this.f31334a.f37151a = number;
            return this;
        }

        /* renamed from: b */
        public final C9196a m38602b(Number number) {
            this.f31334a.f37152b = number;
            return this;
        }

        /* renamed from: a */
        public final C9196a m38598a(Boolean bool) {
            this.f31334a.f37153c = bool;
            return this;
        }

        /* renamed from: a */
        public final C9196a m38600a(String str) {
            this.f31334a.f37154d = str;
            return this;
        }

        /* renamed from: b */
        public final C9196a m38603b(String str) {
            this.f31334a.f37155e = str;
            return this;
        }

        /* renamed from: a */
        public qh m38601a() {
            return this.f31334a;
        }
    }

    /* renamed from: com.tinder.etl.event.qh$b */
    public class C11420b extends fw {
        /* renamed from: a */
        final /* synthetic */ qh f37149a;

        /* renamed from: a */
        public String mo10346a() {
            return "Places.ClientDepartureWorkHome";
        }

        public C11420b(qh qhVar, Map<EtlField<?>, Object> map) {
            this.f37149a = qhVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.qh$c */
    private final class C11421c implements DescriptorFactory<C11420b, qh> {
        /* renamed from: a */
        final /* synthetic */ qh f37150a;

        private C11421c(qh qhVar) {
            this.f37150a = qhVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45869a((qh) etlEvent);
        }

        /* renamed from: a */
        public final C11420b m45869a(qh qhVar) {
            Map hashMap = new HashMap();
            if (qhVar.f37151a != null) {
                hashMap.put(new az(), qhVar.f37151a);
            }
            if (qhVar.f37152b != null) {
                hashMap.put(new et(), qhVar.f37152b);
            }
            if (qhVar.f37153c != null) {
                hashMap.put(new jz(), qhVar.f37153c);
            }
            if (qhVar.f37154d != null) {
                hashMap.put(new le(), qhVar.f37154d);
            }
            if (qhVar.f37155e != null) {
                hashMap.put(new aas(), qhVar.f37155e);
            }
            return new C11420b(this.f37150a, hashMap);
        }
    }

    private qh() {
    }

    /* renamed from: a */
    public static C9196a m45870a() {
        return new C9196a();
    }

    public final DescriptorFactory<C11420b, qh> getDescriptorFactory() {
        return new C11421c();
    }
}
