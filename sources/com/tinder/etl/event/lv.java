package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class lv implements EtlEvent {
    /* renamed from: a */
    private Number f37092a;
    /* renamed from: b */
    private Number f37093b;
    /* renamed from: c */
    private Number f37094c;
    /* renamed from: d */
    private Number f37095d;

    /* renamed from: com.tinder.etl.event.lv$a */
    public static class C9174a {
        /* renamed from: a */
        private lv f31323a;

        private C9174a() {
            this.f31323a = new lv();
        }

        /* renamed from: a */
        public final C9174a m38553a(Number number) {
            this.f31323a.f37092a = number;
            return this;
        }

        /* renamed from: b */
        public final C9174a m38555b(Number number) {
            this.f31323a.f37093b = number;
            return this;
        }

        /* renamed from: c */
        public final C9174a m38556c(Number number) {
            this.f31323a.f37094c = number;
            return this;
        }

        /* renamed from: d */
        public final C9174a m38557d(Number number) {
            this.f31323a.f37095d = number;
            return this;
        }

        /* renamed from: a */
        public lv m38554a() {
            return this.f31323a;
        }
    }

    /* renamed from: com.tinder.etl.event.lv$b */
    public class C11393b extends fw {
        /* renamed from: a */
        final /* synthetic */ lv f37090a;

        /* renamed from: a */
        public String mo10346a() {
            return "Match.StartSearch";
        }

        public C11393b(lv lvVar, Map<EtlField<?>, Object> map) {
            this.f37090a = lvVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.lv$c */
    private final class C11394c implements DescriptorFactory<C11393b, lv> {
        /* renamed from: a */
        final /* synthetic */ lv f37091a;

        private C11394c(lv lvVar) {
            this.f37091a = lvVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45765a((lv) etlEvent);
        }

        /* renamed from: a */
        public final C11393b m45765a(lv lvVar) {
            Map hashMap = new HashMap();
            if (lvVar.f37092a != null) {
                hashMap.put(new nr(), lvVar.f37092a);
            }
            if (lvVar.f37093b != null) {
                hashMap.put(new nw(), lvVar.f37093b);
            }
            if (lvVar.f37094c != null) {
                hashMap.put(new ok(), lvVar.f37094c);
            }
            if (lvVar.f37095d != null) {
                hashMap.put(new ol(), lvVar.f37095d);
            }
            return new C11393b(this.f37091a, hashMap);
        }
    }

    private lv() {
    }

    /* renamed from: a */
    public static C9174a m45766a() {
        return new C9174a();
    }

    public final DescriptorFactory<C11393b, lv> getDescriptorFactory() {
        return new C11394c();
    }
}
