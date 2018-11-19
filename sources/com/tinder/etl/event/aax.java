package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class aax implements EtlEvent {
    /* renamed from: a */
    private Number f36116a;
    /* renamed from: b */
    private Boolean f36117b;
    /* renamed from: c */
    private Boolean f36118c;

    /* renamed from: com.tinder.etl.event.aax$a */
    public static class C8962a {
        /* renamed from: a */
        private aax f31216a;

        private C8962a() {
            this.f31216a = new aax();
        }

        /* renamed from: a */
        public final C8962a m37772a(Number number) {
            this.f31216a.f36116a = number;
            return this;
        }

        /* renamed from: a */
        public final C8962a m37771a(Boolean bool) {
            this.f31216a.f36117b = bool;
            return this;
        }

        /* renamed from: b */
        public final C8962a m37774b(Boolean bool) {
            this.f31216a.f36118c = bool;
            return this;
        }

        /* renamed from: a */
        public aax m37773a() {
            return this.f31216a;
        }
    }

    /* renamed from: com.tinder.etl.event.aax$b */
    public class C11168b extends fw {
        /* renamed from: a */
        final /* synthetic */ aax f36114a;

        /* renamed from: a */
        public String mo10346a() {
            return "Websocket.Connect";
        }

        public C11168b(aax aax, Map<EtlField<?>, Object> map) {
            this.f36114a = aax;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.aax$c */
    private final class C11169c implements DescriptorFactory<C11168b, aax> {
        /* renamed from: a */
        final /* synthetic */ aax f36115a;

        private C11169c(aax aax) {
            this.f36115a = aax;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44009a((aax) etlEvent);
        }

        /* renamed from: a */
        public final C11168b m44009a(aax aax) {
            Map hashMap = new HashMap();
            if (aax.f36116a != null) {
                hashMap.put(new aaw(), aax.f36116a);
            }
            if (aax.f36117b != null) {
                hashMap.put(new aay(), aax.f36117b);
            }
            if (aax.f36118c != null) {
                hashMap.put(new zq(), aax.f36118c);
            }
            return new C11168b(this.f36115a, hashMap);
        }
    }

    private aax() {
    }

    /* renamed from: a */
    public static C8962a m44010a() {
        return new C8962a();
    }

    public final DescriptorFactory<C11168b, aax> getDescriptorFactory() {
        return new C11169c();
    }
}
