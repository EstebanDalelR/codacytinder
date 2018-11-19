package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class pd implements EtlEvent {
    /* renamed from: a */
    private Boolean f37118a;
    /* renamed from: b */
    private Number f37119b;

    /* renamed from: com.tinder.etl.event.pd$a */
    public static class C9182a {
        /* renamed from: a */
        private pd f31327a;

        private C9182a() {
            this.f31327a = new pd();
        }

        /* renamed from: a */
        public final C9182a m38572a(Boolean bool) {
            this.f31327a.f37118a = bool;
            return this;
        }

        /* renamed from: a */
        public final C9182a m38573a(Number number) {
            this.f31327a.f37119b = number;
            return this;
        }

        /* renamed from: a */
        public pd m38574a() {
            return this.f31327a;
        }
    }

    /* renamed from: com.tinder.etl.event.pd$b */
    public class C11405b extends fw {
        /* renamed from: a */
        final /* synthetic */ pd f37116a;

        /* renamed from: a */
        public String mo10346a() {
            return "Passport.MenuOpen";
        }

        public C11405b(pd pdVar, Map<EtlField<?>, Object> map) {
            this.f37116a = pdVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.pd$c */
    private final class C11406c implements DescriptorFactory<C11405b, pd> {
        /* renamed from: a */
        final /* synthetic */ pd f37117a;

        private C11406c(pd pdVar) {
            this.f37117a = pdVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m45810a((pd) etlEvent);
        }

        /* renamed from: a */
        public final C11405b m45810a(pd pdVar) {
            Map hashMap = new HashMap();
            if (pdVar.f37118a != null) {
                hashMap.put(new tx(), pdVar.f37118a);
            }
            if (pdVar.f37119b != null) {
                hashMap.put(new hg(), pdVar.f37119b);
            }
            return new C11405b(this.f37117a, hashMap);
        }
    }

    private pd() {
    }

    /* renamed from: a */
    public static C9182a m45811a() {
        return new C9182a();
    }

    public final DescriptorFactory<C11405b, pd> getDescriptorFactory() {
        return new C11406c();
    }
}
