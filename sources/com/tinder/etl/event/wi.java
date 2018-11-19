package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class wi implements EtlEvent {
    /* renamed from: a */
    private Boolean f37653a;
    /* renamed from: b */
    private String f37654b;
    /* renamed from: c */
    private String f37655c;

    /* renamed from: com.tinder.etl.event.wi$a */
    public static class C9314a {
        /* renamed from: a */
        private wi f31393a;

        private C9314a() {
            this.f31393a = new wi();
        }

        /* renamed from: a */
        public final C9314a m38926a(Boolean bool) {
            this.f31393a.f37653a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9314a m38927a(String str) {
            this.f31393a.f37655c = str;
            return this;
        }

        /* renamed from: a */
        public wi m38928a() {
            return this.f31393a;
        }
    }

    /* renamed from: com.tinder.etl.event.wi$b */
    public class C11544b extends fw {
        /* renamed from: a */
        final /* synthetic */ wi f37651a;

        /* renamed from: a */
        public String mo10346a() {
            return "Settings.FeedInteract";
        }

        public C11544b(wi wiVar, Map<EtlField<?>, Object> map) {
            this.f37651a = wiVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.wi$c */
    private final class C11545c implements DescriptorFactory<C11544b, wi> {
        /* renamed from: a */
        final /* synthetic */ wi f37652a;

        private C11545c(wi wiVar) {
            this.f37652a = wiVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46699a((wi) etlEvent);
        }

        /* renamed from: a */
        public final C11544b m46699a(wi wiVar) {
            Map hashMap = new HashMap();
            if (wiVar.f37653a != null) {
                hashMap.put(new fr(), wiVar.f37653a);
            }
            if (wiVar.f37654b != null) {
                hashMap.put(new wy(), wiVar.f37654b);
            }
            if (wiVar.f37655c != null) {
                hashMap.put(new zl(), wiVar.f37655c);
            }
            return new C11544b(this.f37652a, hashMap);
        }
    }

    private wi() {
    }

    /* renamed from: a */
    public static C9314a m46700a() {
        return new C9314a();
    }

    public final DescriptorFactory<C11544b, wi> getDescriptorFactory() {
        return new C11545c();
    }
}
