package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tinder.etl.event.e */
public final class C11280e implements EtlEvent {
    /* renamed from: a */
    private String f36659a;

    /* renamed from: com.tinder.etl.event.e$a */
    public static class C9068a {
        /* renamed from: a */
        private C11280e f31269a;

        private C9068a() {
            this.f31269a = new C11280e();
        }

        /* renamed from: a */
        public final C9068a m38215a(String str) {
            this.f31269a.f36659a = str;
            return this;
        }

        /* renamed from: a */
        public C11280e m38216a() {
            return this.f31269a;
        }
    }

    /* renamed from: com.tinder.etl.event.e$b */
    public class C11278b extends fw {
        /* renamed from: a */
        final /* synthetic */ C11280e f36657a;

        /* renamed from: a */
        public String mo10346a() {
            return "Account.InstagramLoginSuccess";
        }

        public C11278b(C11280e c11280e, Map<EtlField<?>, Object> map) {
            this.f36657a = c11280e;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.e$c */
    private final class C11279c implements DescriptorFactory<C11278b, C11280e> {
        /* renamed from: a */
        final /* synthetic */ C11280e f36658a;

        private C11279c(C11280e c11280e) {
            this.f36658a = c11280e;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44996a((C11280e) etlEvent);
        }

        /* renamed from: a */
        public final C11278b m44996a(C11280e c11280e) {
            Map hashMap = new HashMap();
            if (c11280e.f36659a != null) {
                hashMap.put(new jj(), c11280e.f36659a);
            }
            return new C11278b(this.f36658a, hashMap);
        }
    }

    private C11280e() {
    }

    /* renamed from: a */
    public static C9068a m44997a() {
        return new C9068a();
    }

    public final DescriptorFactory<C11278b, C11280e> getDescriptorFactory() {
        return new C11279c();
    }
}
