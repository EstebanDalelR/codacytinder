package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class wb implements EtlEvent {
    /* renamed from: a */
    private String f37639a;
    /* renamed from: b */
    private Number f37640b;

    /* renamed from: com.tinder.etl.event.wb$a */
    public static class C9310a {
        /* renamed from: a */
        private wb f31391a;

        private C9310a() {
            this.f31391a = new wb();
        }

        /* renamed from: a */
        public final C9310a m38920a(String str) {
            this.f31391a.f37639a = str;
            return this;
        }

        /* renamed from: a */
        public final C9310a m38919a(Number number) {
            this.f31391a.f37640b = number;
            return this;
        }

        /* renamed from: a */
        public wb m38921a() {
            return this.f31391a;
        }
    }

    /* renamed from: com.tinder.etl.event.wb$b */
    public class C11540b extends fw {
        /* renamed from: a */
        final /* synthetic */ wb f37637a;

        /* renamed from: a */
        public String mo10346a() {
            return "Session.Start";
        }

        public C11540b(wb wbVar, Map<EtlField<?>, Object> map) {
            this.f37637a = wbVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.wb$c */
    private final class C11541c implements DescriptorFactory<C11540b, wb> {
        /* renamed from: a */
        final /* synthetic */ wb f37638a;

        private C11541c(wb wbVar) {
            this.f37638a = wbVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46678a((wb) etlEvent);
        }

        /* renamed from: a */
        public final C11540b m46678a(wb wbVar) {
            Map hashMap = new HashMap();
            if (wbVar.f37639a != null) {
                hashMap.put(new vz(), wbVar.f37639a);
            }
            if (wbVar.f37640b != null) {
                hashMap.put(new wc(), wbVar.f37640b);
            }
            return new C11540b(this.f37638a, hashMap);
        }
    }

    private wb() {
    }

    /* renamed from: a */
    public static C9310a m46679a() {
        return new C9310a();
    }

    public final DescriptorFactory<C11540b, wb> getDescriptorFactory() {
        return new C11541c();
    }
}
