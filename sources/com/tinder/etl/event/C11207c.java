package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.c */
public final class C11207c implements EtlEvent {
    /* renamed from: a */
    private String f36252a;
    /* renamed from: b */
    private Number f36253b;

    /* renamed from: com.tinder.etl.event.c$a */
    public static class C8998a {
        /* renamed from: a */
        private C11207c f31234a;

        private C8998a() {
            this.f31234a = new C11207c();
        }

        /* renamed from: a */
        public final C8998a m37879a(String str) {
            this.f31234a.f36252a = str;
            return this;
        }

        /* renamed from: a */
        public final C8998a m37878a(Number number) {
            this.f31234a.f36253b = number;
            return this;
        }

        /* renamed from: a */
        public C11207c m37880a() {
            return this.f31234a;
        }
    }

    /* renamed from: com.tinder.etl.event.c$b */
    public class C11205b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11207c f36250a;

        /* renamed from: a */
        public String mo10346a() {
            return "Account.InstagramDisconnect";
        }

        public C11205b(C11207c c11207c, Map<EtlField<?>, Object> map) {
            this.f36250a = c11207c;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.c$c */
    private final class C11206c implements DescriptorFactory<C11205b, C11207c> {
        /* renamed from: a */
        final /* synthetic */ C11207c f36251a;

        private C11206c(C11207c c11207c) {
            this.f36251a = c11207c;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44252a((C11207c) etlEvent);
        }

        /* renamed from: a */
        public final C11205b m44252a(C11207c c11207c) {
            Map hashMap = new HashMap();
            if (c11207c.f36252a != null) {
                hashMap.put(new jj(), c11207c.f36252a);
            }
            if (c11207c.f36253b != null) {
                hashMap.put(new hc(), c11207c.f36253b);
            }
            return new C11205b(this.f36251a, hashMap);
        }
    }

    private C11207c() {
    }

    /* renamed from: a */
    public static C8998a m44253a() {
        return new C8998a();
    }

    public final DescriptorFactory<C11205b, C11207c> getDescriptorFactory() {
        return new C11206c();
    }
}
