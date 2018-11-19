package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class kn implements EtlEvent {
    /* renamed from: a */
    private Number f36986a;
    /* renamed from: b */
    private String f36987b;

    /* renamed from: com.tinder.etl.event.kn$a */
    public static class C9150a {
        /* renamed from: a */
        private kn f31311a;

        private C9150a() {
            this.f31311a = new kn();
        }

        /* renamed from: a */
        public final C9150a m38485a(Number number) {
            this.f31311a.f36986a = number;
            return this;
        }

        /* renamed from: a */
        public final C9150a m38486a(String str) {
            this.f31311a.f36987b = str;
            return this;
        }

        /* renamed from: a */
        public kn m38487a() {
            return this.f31311a;
        }
    }

    /* renamed from: com.tinder.etl.event.kn$b */
    public class C11368b extends fw {
        /* renamed from: a */
        final /* synthetic */ kn f36984a;

        /* renamed from: a */
        public String mo10346a() {
            return "LikesYou.List";
        }

        public C11368b(kn knVar, Map<EtlField<?>, Object> map) {
            this.f36984a = knVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.kn$c */
    private final class C11369c implements DescriptorFactory<C11368b, kn> {
        /* renamed from: a */
        final /* synthetic */ kn f36985a;

        private C11369c(kn knVar) {
            this.f36985a = knVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45591a((kn) etlEvent);
        }

        /* renamed from: a */
        public final C11368b m45591a(kn knVar) {
            Map hashMap = new HashMap();
            if (knVar.f36986a != null) {
                hashMap.put(new np(), knVar.f36986a);
            }
            if (knVar.f36987b != null) {
                hashMap.put(new kq(), knVar.f36987b);
            }
            return new C11368b(this.f36985a, hashMap);
        }
    }

    private kn() {
    }

    /* renamed from: a */
    public static C9150a m45592a() {
        return new C9150a();
    }

    public final DescriptorFactory<C11368b, kn> getDescriptorFactory() {
        return new C11369c();
    }
}
