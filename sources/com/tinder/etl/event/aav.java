package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class aav implements EtlEvent {
    /* renamed from: a */
    private Number f36112a;
    /* renamed from: b */
    private Boolean f36113b;

    /* renamed from: com.tinder.etl.event.aav$a */
    public static class C8960a {
        /* renamed from: a */
        private aav f31215a;

        private C8960a() {
            this.f31215a = new aav();
        }

        /* renamed from: a */
        public final C8960a m37769a(Number number) {
            this.f31215a.f36112a = number;
            return this;
        }

        /* renamed from: a */
        public final C8960a m37768a(Boolean bool) {
            this.f31215a.f36113b = bool;
            return this;
        }

        /* renamed from: a */
        public aav m37770a() {
            return this.f31215a;
        }
    }

    /* renamed from: com.tinder.etl.event.aav$b */
    public class C11166b extends fw {
        /* renamed from: a */
        final /* synthetic */ aav f36110a;

        /* renamed from: a */
        public String mo10346a() {
            return "Websocket.Close";
        }

        public C11166b(aav aav, Map<EtlField<?>, Object> map) {
            this.f36110a = aav;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.aav$c */
    private final class C11167c implements DescriptorFactory<C11166b, aav> {
        /* renamed from: a */
        final /* synthetic */ aav f36111a;

        private C11167c(aav aav) {
            this.f36111a = aav;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44002a((aav) etlEvent);
        }

        /* renamed from: a */
        public final C11166b m44002a(aav aav) {
            Map hashMap = new HashMap();
            if (aav.f36112a != null) {
                hashMap.put(new aau(), aav.f36112a);
            }
            if (aav.f36113b != null) {
                hashMap.put(new abb(), aav.f36113b);
            }
            return new C11166b(this.f36111a, hashMap);
        }
    }

    private aav() {
    }

    /* renamed from: a */
    public static C8960a m44003a() {
        return new C8960a();
    }

    public final DescriptorFactory<C11166b, aav> getDescriptorFactory() {
        return new C11167c();
    }
}
