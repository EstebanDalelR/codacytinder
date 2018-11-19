package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class ai implements EtlEvent {
    /* renamed from: a */
    private Number f36181a;
    /* renamed from: b */
    private Number f36182b;
    /* renamed from: c */
    private Number f36183c;
    /* renamed from: d */
    private Number f36184d;
    /* renamed from: e */
    private String f36185e;
    /* renamed from: f */
    private String f36186f;
    /* renamed from: g */
    private Boolean f36187g;
    /* renamed from: h */
    private Number f36188h;
    /* renamed from: i */
    private Number f36189i;
    /* renamed from: j */
    private String f36190j;

    /* renamed from: com.tinder.etl.event.ai$a */
    public static class C8976a {
        /* renamed from: a */
        private ai f31223a;

        private C8976a() {
            this.f31223a = new ai();
        }

        /* renamed from: a */
        public final C8976a m37822a(Number number) {
            this.f31223a.f36181a = number;
            return this;
        }

        /* renamed from: b */
        public final C8976a m37825b(Number number) {
            this.f31223a.f36182b = number;
            return this;
        }

        /* renamed from: c */
        public final C8976a m37827c(Number number) {
            this.f31223a.f36183c = number;
            return this;
        }

        /* renamed from: d */
        public final C8976a m37828d(Number number) {
            this.f31223a.f36184d = number;
            return this;
        }

        /* renamed from: a */
        public final C8976a m37823a(String str) {
            this.f31223a.f36185e = str;
            return this;
        }

        /* renamed from: b */
        public final C8976a m37826b(String str) {
            this.f31223a.f36186f = str;
            return this;
        }

        /* renamed from: a */
        public final C8976a m37821a(Boolean bool) {
            this.f31223a.f36187g = bool;
            return this;
        }

        /* renamed from: e */
        public final C8976a m37829e(Number number) {
            this.f31223a.f36188h = number;
            return this;
        }

        /* renamed from: f */
        public final C8976a m37830f(Number number) {
            this.f31223a.f36189i = number;
            return this;
        }

        /* renamed from: a */
        public ai m37824a() {
            return this.f31223a;
        }
    }

    /* renamed from: com.tinder.etl.event.ai$b */
    public class C11182b extends fw {
        /* renamed from: a */
        final /* synthetic */ ai f36179a;

        /* renamed from: a */
        public String mo10346a() {
            return "Ad.ToggleAudio";
        }

        public C11182b(ai aiVar, Map<EtlField<?>, Object> map) {
            this.f36179a = aiVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.ai$c */
    private final class C11183c implements DescriptorFactory<C11182b, ai> {
        /* renamed from: a */
        final /* synthetic */ ai f36180a;

        private C11183c(ai aiVar) {
            this.f36180a = aiVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44124a((ai) etlEvent);
        }

        /* renamed from: a */
        public final C11182b m44124a(ai aiVar) {
            Map hashMap = new HashMap();
            if (aiVar.f36181a != null) {
                hashMap.put(new C11413q(), aiVar.f36181a);
            }
            if (aiVar.f36182b != null) {
                hashMap.put(new C11582z(), aiVar.f36182b);
            }
            if (aiVar.f36183c != null) {
                hashMap.put(new ad(), aiVar.f36183c);
            }
            if (aiVar.f36184d != null) {
                hashMap.put(new aj(), aiVar.f36184d);
            }
            if (aiVar.f36185e != null) {
                hashMap.put(new cr(), aiVar.f36185e);
            }
            if (aiVar.f36186f != null) {
                hashMap.put(new eh(), aiVar.f36186f);
            }
            if (aiVar.f36187g != null) {
                hashMap.put(new ms(), aiVar.f36187g);
            }
            if (aiVar.f36188h != null) {
                hashMap.put(new sh(), aiVar.f36188h);
            }
            if (aiVar.f36189i != null) {
                hashMap.put(new yo(), aiVar.f36189i);
            }
            if (aiVar.f36190j != null) {
                hashMap.put(new xe(), aiVar.f36190j);
            }
            return new C11182b(this.f36180a, hashMap);
        }
    }

    private ai() {
    }

    /* renamed from: a */
    public static C8976a m44125a() {
        return new C8976a();
    }

    public final DescriptorFactory<C11182b, ai> getDescriptorFactory() {
        return new C11183c();
    }
}
