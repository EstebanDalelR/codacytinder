package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class tw implements EtlEvent {
    /* renamed from: a */
    private Boolean f37369a;

    /* renamed from: com.tinder.etl.event.tw$a */
    public static class C9268a {
        /* renamed from: a */
        private tw f31370a;

        private C9268a() {
            this.f31370a = new tw();
        }

        /* renamed from: a */
        public final C9268a m38743a(Boolean bool) {
            this.f31370a.f37369a = bool;
            return this;
        }

        /* renamed from: a */
        public tw m38744a() {
            return this.f31370a;
        }
    }

    /* renamed from: com.tinder.etl.event.tw$b */
    public class C11495b extends fw {
        /* renamed from: a */
        final /* synthetic */ tw f37367a;

        /* renamed from: a */
        public String mo10346a() {
            return "Recs.Discovery";
        }

        public C11495b(tw twVar, Map<EtlField<?>, Object> map) {
            this.f37367a = twVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.tw$c */
    private final class C11496c implements DescriptorFactory<C11495b, tw> {
        /* renamed from: a */
        final /* synthetic */ tw f37368a;

        private C11496c(tw twVar) {
            this.f37368a = twVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46232a((tw) etlEvent);
        }

        /* renamed from: a */
        public final C11495b m46232a(tw twVar) {
            Map hashMap = new HashMap();
            if (twVar.f37369a != null) {
                hashMap.put(new fb(), twVar.f37369a);
            }
            return new C11495b(this.f37368a, hashMap);
        }
    }

    private tw() {
    }

    /* renamed from: a */
    public static C9268a m46233a() {
        return new C9268a();
    }

    public final DescriptorFactory<C11495b, tw> getDescriptorFactory() {
        return new C11496c();
    }
}
