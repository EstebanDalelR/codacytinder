package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ag implements EtlEvent {
    /* renamed from: a */
    private Number f36158a;
    /* renamed from: b */
    private Number f36159b;
    /* renamed from: c */
    private Number f36160c;
    /* renamed from: d */
    private Number f36161d;
    /* renamed from: e */
    private String f36162e;
    /* renamed from: f */
    private String f36163f;
    /* renamed from: g */
    private Boolean f36164g;

    /* renamed from: com.tinder.etl.event.ag$a */
    public static class C8972a {
        /* renamed from: a */
        private ag f31221a;

        private C8972a() {
            this.f31221a = new ag();
        }

        /* renamed from: a */
        public final C8972a m37806a(Number number) {
            this.f31221a.f36158a = number;
            return this;
        }

        /* renamed from: b */
        public final C8972a m37808b(Number number) {
            this.f31221a.f36159b = number;
            return this;
        }

        /* renamed from: c */
        public final C8972a m37809c(Number number) {
            this.f31221a.f36160c = number;
            return this;
        }

        /* renamed from: a */
        public ag m37807a() {
            return this.f31221a;
        }
    }

    /* renamed from: com.tinder.etl.event.ag$b */
    public class C11178b extends fw {
        /* renamed from: a */
        final /* synthetic */ ag f36156a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.RequestSend";
        }

        public C11178b(ag agVar, Map<EtlField<?>, Object> map) {
            this.f36156a = agVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ag$c */
    private final class C11179c implements DescriptorFactory<C11178b, ag> {
        /* renamed from: a */
        final /* synthetic */ ag f36157a;

        private C11179c(ag agVar) {
            this.f36157a = agVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44086a((ag) etlEvent);
        }

        /* renamed from: a */
        public final C11178b m44086a(ag agVar) {
            Map hashMap = new HashMap();
            if (agVar.f36158a != null) {
                hashMap.put(new C11413q(), agVar.f36158a);
            }
            if (agVar.f36159b != null) {
                hashMap.put(new C11582z(), agVar.f36159b);
            }
            if (agVar.f36160c != null) {
                hashMap.put(new ad(), agVar.f36160c);
            }
            if (agVar.f36161d != null) {
                hashMap.put(new aj(), agVar.f36161d);
            }
            if (agVar.f36162e != null) {
                hashMap.put(new cr(), agVar.f36162e);
            }
            if (agVar.f36163f != null) {
                hashMap.put(new eh(), agVar.f36163f);
            }
            if (agVar.f36164g != null) {
                hashMap.put(new ms(), agVar.f36164g);
            }
            return new C11178b(this.f36157a, hashMap);
        }
    }

    private ag() {
    }

    /* renamed from: a */
    public static C8972a m44087a() {
        return new C8972a();
    }

    public final DescriptorFactory<C11178b, ag> getDescriptorFactory() {
        return new C11179c();
    }
}
