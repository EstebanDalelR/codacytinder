package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class sw implements EtlEvent {
    /* renamed from: a */
    private String f37348a;
    /* renamed from: b */
    private Boolean f37349b;

    /* renamed from: com.tinder.etl.event.sw$a */
    public static class C9262a {
        /* renamed from: a */
        private sw f31367a;

        private C9262a() {
            this.f31367a = new sw();
        }

        /* renamed from: a */
        public final C9262a m38730a(String str) {
            this.f31367a.f37348a = str;
            return this;
        }

        /* renamed from: a */
        public final C9262a m38729a(Boolean bool) {
            this.f31367a.f37349b = bool;
            return this;
        }

        /* renamed from: a */
        public sw m38731a() {
            return this.f31367a;
        }
    }

    /* renamed from: com.tinder.etl.event.sw$b */
    public class C11488b extends fw {
        /* renamed from: a */
        final /* synthetic */ sw f37346a;

        /* renamed from: a */
        public String mo10346a() {
            return "Push.Show";
        }

        public C11488b(sw swVar, Map<EtlField<?>, Object> map) {
            this.f37346a = swVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.sw$c */
    private final class C11489c implements DescriptorFactory<C11488b, sw> {
        /* renamed from: a */
        final /* synthetic */ sw f37347a;

        private C11489c(sw swVar) {
            this.f37347a = swVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m46197a((sw) etlEvent);
        }

        /* renamed from: a */
        public final C11488b m46197a(sw swVar) {
            Map hashMap = new HashMap();
            if (swVar.f37348a != null) {
                hashMap.put(new so(), swVar.f37348a);
            }
            if (swVar.f37349b != null) {
                hashMap.put(new wq(), swVar.f37349b);
            }
            return new C11488b(this.f37347a, hashMap);
        }
    }

    private sw() {
    }

    /* renamed from: a */
    public static C9262a m46198a() {
        return new C9262a();
    }

    public final DescriptorFactory<C11488b, sw> getDescriptorFactory() {
        return new C11489c();
    }
}
