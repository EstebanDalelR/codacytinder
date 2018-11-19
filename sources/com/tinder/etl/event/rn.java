package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class rn implements EtlEvent {
    /* renamed from: a */
    private Number f37241a;
    /* renamed from: b */
    private String f37242b;
    /* renamed from: c */
    private Number f37243c;
    /* renamed from: d */
    private Number f37244d;
    /* renamed from: e */
    private Number f37245e;

    /* renamed from: com.tinder.etl.event.rn$a */
    public static class C9226a {
        /* renamed from: a */
        private rn f31349a;

        private C9226a() {
            this.f31349a = new rn();
        }

        /* renamed from: a */
        public final C9226a m38667a(Number number) {
            this.f31349a.f37243c = number;
            return this;
        }

        /* renamed from: b */
        public final C9226a m38669b(Number number) {
            this.f31349a.f37244d = number;
            return this;
        }

        /* renamed from: c */
        public final C9226a m38670c(Number number) {
            this.f31349a.f37245e = number;
            return this;
        }

        /* renamed from: a */
        public rn m38668a() {
            return this.f31349a;
        }
    }

    /* renamed from: com.tinder.etl.event.rn$b */
    public class C11451b extends fw {
        /* renamed from: a */
        final /* synthetic */ rn f37239a;

        /* renamed from: a */
        public String mo10346a() {
            return "Profile.AddPhoto";
        }

        public C11451b(rn rnVar, Map<EtlField<?>, Object> map) {
            this.f37239a = rnVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.rn$c */
    private final class C11452c implements DescriptorFactory<C11451b, rn> {
        /* renamed from: a */
        final /* synthetic */ rn f37240a;

        private C11452c(rn rnVar) {
            this.f37240a = rnVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46028a((rn) etlEvent);
        }

        /* renamed from: a */
        public final C11451b m46028a(rn rnVar) {
            Map hashMap = new HashMap();
            if (rnVar.f37241a != null) {
                hashMap.put(new me(), rnVar.f37241a);
            }
            if (rnVar.f37242b != null) {
                hashMap.put(new pq(), rnVar.f37242b);
            }
            if (rnVar.f37243c != null) {
                hashMap.put(new ps(), rnVar.f37243c);
            }
            if (rnVar.f37244d != null) {
                hashMap.put(new sf(), rnVar.f37244d);
            }
            if (rnVar.f37245e != null) {
                hashMap.put(new yz(), rnVar.f37245e);
            }
            return new C11451b(this.f37240a, hashMap);
        }
    }

    private rn() {
    }

    /* renamed from: a */
    public static C9226a m46029a() {
        return new C9226a();
    }

    public final DescriptorFactory<C11451b, rn> getDescriptorFactory() {
        return new C11452c();
    }
}
