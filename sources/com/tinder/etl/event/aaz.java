package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class aaz implements EtlEvent {
    /* renamed from: a */
    private String f36121a;
    /* renamed from: b */
    private Number f36122b;
    /* renamed from: c */
    private Number f36123c;

    /* renamed from: com.tinder.etl.event.aaz$a */
    public static class C8964a {
        /* renamed from: a */
        private aaz f31217a;

        private C8964a() {
            this.f31217a = new aaz();
        }

        /* renamed from: a */
        public final C8964a m37776a(String str) {
            this.f31217a.f36121a = str;
            return this;
        }

        /* renamed from: a */
        public final C8964a m37775a(Number number) {
            this.f31217a.f36122b = number;
            return this;
        }

        /* renamed from: b */
        public final C8964a m37778b(Number number) {
            this.f31217a.f36123c = number;
            return this;
        }

        /* renamed from: a */
        public aaz m37777a() {
            return this.f31217a;
        }
    }

    /* renamed from: com.tinder.etl.event.aaz$b */
    public class C11170b extends fw {
        /* renamed from: a */
        final /* synthetic */ aaz f36119a;

        /* renamed from: a */
        public String mo10346a() {
            return "Websocket.NudgeReceived";
        }

        public C11170b(aaz aaz, Map<EtlField<?>, Object> map) {
            this.f36119a = aaz;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.aaz$c */
    private final class C11171c implements DescriptorFactory<C11170b, aaz> {
        /* renamed from: a */
        final /* synthetic */ aaz f36120a;

        private C11171c(aaz aaz) {
            this.f36120a = aaz;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44018a((aaz) etlEvent);
        }

        /* renamed from: a */
        public final C11170b m44018a(aaz aaz) {
            Map hashMap = new HashMap();
            if (aaz.f36121a != null) {
                hashMap.put(new aba(), aaz.f36121a);
            }
            if (aaz.f36122b != null) {
                hashMap.put(new abd(), aaz.f36122b);
            }
            if (aaz.f36123c != null) {
                hashMap.put(new abc(), aaz.f36123c);
            }
            return new C11170b(this.f36120a, hashMap);
        }
    }

    private aaz() {
    }

    /* renamed from: a */
    public static C8964a m44019a() {
        return new C8964a();
    }

    public final DescriptorFactory<C11170b, aaz> getDescriptorFactory() {
        return new C11171c();
    }
}
