package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class sl implements EtlEvent {
    /* renamed from: a */
    private String f37304a;
    /* renamed from: b */
    private Number f37305b;
    /* renamed from: c */
    private Number f37306c;

    /* renamed from: com.tinder.etl.event.sl$a */
    public static class C9250a {
        /* renamed from: a */
        private sl f31361a;

        private C9250a() {
            this.f31361a = new sl();
        }

        /* renamed from: a */
        public final C9250a m38712a(String str) {
            this.f31361a.f37304a = str;
            return this;
        }

        /* renamed from: a */
        public final C9250a m38711a(Number number) {
            this.f31361a.f37305b = number;
            return this;
        }

        /* renamed from: b */
        public final C9250a m38714b(Number number) {
            this.f31361a.f37306c = number;
            return this;
        }

        /* renamed from: a */
        public sl m38713a() {
            return this.f31361a;
        }
    }

    /* renamed from: com.tinder.etl.event.sl$b */
    public class C11476b extends fw {
        /* renamed from: a */
        final /* synthetic */ sl f37302a;

        /* renamed from: a */
        public String mo10346a() {
            return "Push.Cancel";
        }

        public C11476b(sl slVar, Map<EtlField<?>, Object> map) {
            this.f37302a = slVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.sl$c */
    private final class C11477c implements DescriptorFactory<C11476b, sl> {
        /* renamed from: a */
        final /* synthetic */ sl f37303a;

        private C11477c(sl slVar) {
            this.f37303a = slVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46135a((sl) etlEvent);
        }

        /* renamed from: a */
        public final C11476b m46135a(sl slVar) {
            Map hashMap = new HashMap();
            if (slVar.f37304a != null) {
                hashMap.put(new zl(), slVar.f37304a);
            }
            if (slVar.f37305b != null) {
                hashMap.put(new xx(), slVar.f37305b);
            }
            if (slVar.f37306c != null) {
                hashMap.put(new cs(), slVar.f37306c);
            }
            return new C11476b(this.f37303a, hashMap);
        }
    }

    private sl() {
    }

    /* renamed from: a */
    public static C9250a m46136a() {
        return new C9250a();
    }

    public final DescriptorFactory<C11476b, sl> getDescriptorFactory() {
        return new C11477c();
    }
}
